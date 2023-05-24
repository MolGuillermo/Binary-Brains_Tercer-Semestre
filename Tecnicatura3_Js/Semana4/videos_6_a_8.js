//Uso de los metodos Prototype, Call y Apply.

//constructor
function Persona3(nombre,apellido,email){
    //propiedades
    this.nombre = nombre;
    this.apellido = apellido;
    this.email= email;
    this.nombreCompleto= function(){
        return this.nombre + ' ' + this.apellido;
    }
}

//Objetos padre y madre
let padre = new Persona3('Leonardo','Lopezcaron','lopez@gmail.com');
padre.nombre='Luis';//modifico un valor
padre.telefono='123456789';//creo una propiedad que es solo de este objeto 'padre'
console.log(padre);
console.log(padre.nombreCompleto());
let madre = new Persona3('Laurita','Castro','lauritac@gmail.com');
console.log(madre);
console.log(madre.telefono);
console.log(madre.nombreCompleto());

//uso de metodo prototype
Persona3.prototype.telefono='87542196';
console.log(padre);
console.log(madre.telefono);
madre.telefono='54545454';
console.log(madre.telefono);

//Uso metodo call
console.log('Uso de METODO CALL')
let persona4={
    nombre:'Juanita',
    apellido:'Perez',
    nombreCompleto2: function (titulo,telefono){
        return titulo+': '+this.nombre + ' '+this.apellido+' '+telefono;
    },
    nombreCompleto3: function(){
        return this.nombre + ' '+this.apellido;
    }
}
let persona5 = {
    nombre:'Carlos',
    apellido:'Godoy'
}
console.log(persona4.nombreCompleto2('Lic.', '222222222'));
console.log(persona4.nombreCompleto2.call(persona5,'Ing.','33333333'));

//metodo Apply
console.log('METODO APPLY')
console.log(persona4.nombreCompleto3.apply(persona5));
let arreglo=['Ing.','33333333'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));

