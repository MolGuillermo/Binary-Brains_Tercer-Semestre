//Archivo 01-03-funciones.js
//videos 8 al 10
//Temas: hoisting. Paso por valor y  por referencia.

//hoisting. llamar la funcion ates de que este definida.
let respuesta = sumarTodo(5,4,13,10,9);
console.log(respuesta);

function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++) {
        suma = arguments[i];
    }
    return suma;
}

//Paso por valor y paso por referencia
//Tipos Primitivos
let k = 10;
function cambiarValor(a){
    a = 20;
}

cambiarValor(k);
console.log(k);//devuelve 10
console.log(cambiarValor(k));//devuelve undefined, pues no tiene return (si lo tenia devuelve 20)
//la funcion no cambio el valor de k, 
//trabaja con un valor distinto dentro de la funcion 
//y luego al terminar la funcion volvio todo como estaba

//Paso por Referencia
//para esto debemos crear un objeto
const persona = {
    nommbre: 'Juan',
    apellido: 'Leiva'
}
console.log(typeof(persona));//persona es tipo object
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nommbre ="Ignacio";
    p1.apellido ="Perez";
}

cambiarValorObjeto(persona);
console.log(persona);
//Paso por referencia: al objeto le pasa la referencia hexadecimal donde esta alojado el objeto
