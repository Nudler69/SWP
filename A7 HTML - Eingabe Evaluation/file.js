$(document).ready(function() {
    $('#file').parsley({
        validators: {
            filemaxsize: function() {
                return {
                    validate: function (val, max_megabytes, parsleyField) {
                        if (!Modernizr.fileapi) { return true; }
                        
                        var $file_input = $(parsleyField.element);
                        if ($file_input.is(':not(input[type="file"])')) {
                            console.log("Validation on max file size only works on file input types");
                            return true;
                        }
                        
                        var max_bytes = max_megabytes * BYTES_PER_MEGABYTE, files = $file_input.get(0).files;
                        
                        if (files.length == 0) {
                            // No file, so valid. (Required check should ensure file is selected)
                            return true;
                        }
                        
                        return files.length == 1  && files[0].size <= max_bytes;
                    },
                    priority: 1
                };
            }
        },
        messages: {
            filemaxsize: "The file cannot be more than %s megabytes."
        }
        , excluded: 'input[type=hidden] :disabled'
    });
    
    /**
		 * Extension to Modernizer for File API support
		 */
    window.Modernizr.addTest('fileapi', function() { return window.File && window.FileReader; });
    
    window.BYTES_PER_MEGABYTE = 1048576;
    
    $('#file').on("submit", function(e) {
        e.preventDefault();
        $(this).parsley("validate");
    });
});