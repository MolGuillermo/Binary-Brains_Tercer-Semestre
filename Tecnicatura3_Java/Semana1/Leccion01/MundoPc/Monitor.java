
package ar.com.system2023.mundopc;


public class Monitor { 
 /*da error el final con una variable constante como
 idMonitor hasta que carguemos el construcor*/
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    /*construtor vacio*/
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }/*aquí deja de marcar el error, se completo el constructor*/
    
    public Monitor(String mara, double tamnio){
        this(); //llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;      
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    //Ingresamos manualmente el getIdMonitor, para obetener el valor
    //El set no lo usamos xq va a ser solo de tipo lectura y no lo vamos a modificar
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
}
