$(document).ready(function () {
    $('#file').parsley({
        validators: {
            filemaxsize: function () {
                return {
                    validate: function (val, max_megabytes, parsleyField) {
                        if (!Modernizr.fileapi) { return true; }

                        var $file_input = $(parsleyField.element);
                        if ($file_input.is(':not(input[type="file"])')) {
                            console.log("Die Validierung der maximalen Dateigröße funktioniert nur für Datei-Eingabetypen.");
                            return true;
                        }

                        var max_bytes = max_megabytes * BYTES_PER_MEGABYTE, files = $file_input.get(0).files;

                        if (files.length == 0) {
                            // Keine Datei ausgewählt, daher gültig. (Die erforderliche Überprüfung sollte sicherstellen, dass eine Datei ausgewählt ist)
                            return true;
                        }

                        var isTxtFile = true;
                        for (var i = 0; i < files.length; i++) {
                            var fileName = files[i].name;
                            if (!fileName.toLowerCase().endsWith('.txt')) {
                                isTxtFile = false;
                                break;
                            }
                        }

                        return isTxtFile && files.length == 1 && files[0].size <= max_bytes;
                    },
                    priority: 1
                };
            }
        },
        messages: {
            filemaxsize: "Die Datei darf nicht mehr als 5 Megabyte groß sein.",
            filetxt: "Nur TXT-Dateien sind erlaubt."
        },
        excluded: 'input[type=hidden] :disabled'
    });

    /**
     * Erweiterung zu Modernizer für die Unterstützung der File API
     */
    window.Modernizr.addTest('fileapi', function () { return window.File && window.FileReader; });

    window.BYTES_PER_MEGABYTE = 1048576;

    $('#file').on("submit", function (e) {
        e.preventDefault();
        $(this).parsley("validate");
    });
});
