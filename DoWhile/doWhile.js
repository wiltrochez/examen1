var numero=0;
var opcion;
var resultadofactorial=1;

do {
    opcion=parseInt(prompt("elige una opcion del menu: 1.calcular factorial 2.determinar si es par 3.terminar"))
    switch (opcion) {
        case 1:
            numero=parseInt(prompt("ingrese el numero al que le quiere calcular el factorial"))
            for (let i = 1; i <= numero; i++) {
                resultadofactorial=resultadofactorial*i;

            }
            alert(resultadofactorial + "es el factorial de " + numero)
            break;
        case 2:
            numero=parseInt(prompt("ingrese el numero que quiere saber si es par o impar"))
            if

            break;

    
    
    }

} while (opcion=3);