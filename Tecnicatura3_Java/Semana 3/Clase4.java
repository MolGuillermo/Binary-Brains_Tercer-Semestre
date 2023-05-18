//video 10- modificadores de acceso privado
package paquete2;

public class Clase4 {
    //atributo privado
    private String atributoPrivate = "Atributo privado";
    
    //constructor privado
    private Clase4(){
        System.out.println("constructor privado");
    }
    
    //Constructor publico para poder crear objetos
    public Clase4(String argumento){//Aqui se pude llamar al constructor vacio
        this();//este es el constructor vacio osea el privado¿?
        System.out.println("Constructor publico");
    }
    
    //Metodo private
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }
    
    //generar getter and seters
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
}
