package MundoPc;
import ar.com.system2023.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("Samsung", 13.4);
        Raton raton1 = new Raton("Samsung","Bluetooth");
        Teclado teclado1 = new Teclado("Samsung","Bluetooth");
        Computadora pc1 = new Computadora("Totita", raton1,teclado1, monitor1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc1);
        orden1.mostrarOrden(orden1);
        
        // Otra Pc, otra orden, otros elementos
        Monitor monitorGamer = new Monitor("PhpGamer", 15);
        Raton ratonGamer= new Raton("PhpGamer","Bluetooth");
        Teclado tecladoGamer = new Teclado("PhpGamer","Bluetooth");
        Computadora pcGamer = new Computadora("PC Gamer!", ratonGamer, tecladoGamer, monitorGamer);
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(pcGamer);
        orden2.mostrarOrden(orden2);
        
        Monitor monitorApple = new Monitor("Apple", 13);
        Teclado tecladoApple = new Teclado("Apple", "Mc");
        Raton ratonApple = new Raton("Apple", "Mc");
        Computadora McBookProApple = new Computadora("Mc Book Pro 14", ratonApple, tecladoApple, monitorApple);

        Raton ratonHuawei = new Raton("Huawei", "Huawei");
        Raton ratonJbHi = new Raton("ratonJbHi", "Inalambrico" ); 
                
        Teclado tecladoHuawei = new Teclado ("Huawei", "Inalambrico");
        Teclado tecladoJbHi = new Teclado("JB Hi Fi", "Inalambrico");
        
        Monitor monitorHuawei = new Monitor ("Huawei", 10);
        Monitor monitorJbHi = new Monitor("JB Hi Fi", 25);

        Orden orden3 = new Orden();
        orden3.agregarComputadora(McBookProApple);
        orden3.agregarComputadora(pcGamer);        
        Computadora samsungPc = new Computadora("Computadora Samsung" , raton1, teclado1, monitor1);
        orden3.agregarComputadora(samsungPc);
        
        Computadora dell = new Computadora("Dell PC", ratonGamer, tecladoGamer, monitorGamer);
        orden3.agregarComputadora(dell);
        orden3.agregarComputadora(pc1);
        
        Computadora totita = new Computadora("Totita",ratonApple,tecladoApple, monitorApple);
        orden3.agregarComputadora(totita);
        
        Computadora php = new Computadora("php", ratonGamer, tecladoGamer, monitorGamer);
        orden3.agregarComputadora(php);
        
        Raton ratonMac = new Raton("Mac", "Infrarrojo");
        Teclado tecladoMac = new Teclado("Mac","Infrarrojo");
        Monitor monitorMac = new Monitor("Mac",16);
                
        Computadora macFliar = new Computadora("Mac Fliar", ratonMac,tecladoMac, monitorMac);
        orden3.agregarComputadora(macFliar);
        
        Computadora jbHpc = new Computadora("jbHpc",ratonJbHi, tecladoJbHi,monitorJbHi);
        orden3.agregarComputadora(jbHpc);
        
        Computadora huaweiPc = new Computadora("huaweiPc", ratonHuawei, tecladoHuawei, monitorHuawei);
        orden3.agregarComputadora(huaweiPc);

        Computadora ultimaPc = new Computadora("ultima", ratonHuawei, tecladoGamer, monitorMac);
        orden3.agregarComputadora(ultimaPc);
        orden3.mostrarOrden(orden3);
    }
}
