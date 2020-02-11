/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

/**
 *
 * @author Usuario
 */
public class Ejecuta_Compu {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.actualizar_gou("RTX 2080ti");
        computadora.actualizar_procesador("I9 9900K");
        computadora.actualizar_monitor("EVGA 4k 144hz");
        computadora.actualizar_perifericos("Teclado");
        computadora.actualizar_placa("asus srix b750m");
        computadora.actualizar_ram("4x16gb");
        String mostrar_compu = computadora.obtener_computadora();
        System.out.println(mostrar_compu);
    }
    
}
