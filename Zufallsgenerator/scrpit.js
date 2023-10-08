function generate(){
    let number1 = parseInt(document.getElementById("field1").value);
    let number2 = parseInt(document.getElementById("field2").value);
    if(
        isNaN(number1) || isNaN(number2)
    ) {
        document.getElementById("randomNumber").innerHTML = "error du NS";
    }
    else if(
        number1 >= number2
    ){
        document.getElementById("randomNumber").innerHTML = "error du NS!";
    }
    else{
        let amountofRandomNumbers = parseInt(number2) - parseInt(number1) +1;
        let randomNumber = Math.floor(Math.random() * amountofRandomNumbers) + parseInt(number1);
        document.getElementById("randomNumber").innerHTML = randomNumber;
    }
}  