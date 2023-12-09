var dataFound = 0;
var dataPerPage = 10;
 
function getMovieResult() {
  var search = $("#search").val();
  alert(search);
 
  if (search != null && search != "") {
    $.ajax({
      url: "http://www.omdbapi.com/?s=" + search + "&r=json&apikey=ab4203c7",
      dataType: 'json',
      success: function (data) {
        var dataAsText = JSON.stringify(data);
        if (data.hasOwnProperty("Response") && data.Response == "True") {
          // Query is successful, doesn't guarantee that data is OK or present
          // data.Search Array of results
          splitJson(data.Search);
        }
      },
      error: function (xmlHttpRequest, textStatus, errorThrown) {
        alert(textStatus + " " + errorThrown);
      }
    });
  }
 
  function splitJson(myArray) {
    if (checkArray(myArray)) {
      $("#movieresult tbody").empty();
      for (var x = 0; x < myArray.length; x++) {
        var poster = "";
        if (myArray[x].hasOwnProperty("Poster") && myArray[x].Poster != "N/A") {
          poster = "<img class='img-fluid' style='max-width: 40%; height: 35%;' src='" + myArray[x].Poster + "'><br>";
        }
        var newRowContent = "<tr><td>" + myArray[x].Title + "</td><td>" + myArray[x].Year + "</td><td>" + poster + "</td></tr>";
        $("#movieresult tbody").append(newRowContent);
      }
    } else {
      alert("Fehler bei der Verarbeitung");
    }
  }
 
  function checkArray(myArray) {
    return typeof myArray === 'object' && myArray instanceof Array;
  }
}