var numeroNatural=0;
var resultadoSuma=0;
var control=0;
numeroNatural=parseInt(prompt("ingrese el numero natural al que le quiere"));
while (control<=numeroNatural) {
    resultadoSuma=resultadoSuma+control
    control=control+1;
}
alert("la suma de los "+ numeroNatural + "primeros numeros naturales es igual");
