
package com.mycompany.volumencono;

import java.util.Scanner;

/**
 *It asks the user for the data of a cone and calculates it's volume.
 * @author aroago
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cono coneUser = new cono();
        
        System.out.println("Cual es la altura del cono?");
        Scanner reader =new Scanner(System.in);
        coneUser.setHeight(reader.nextFloat());
        
        System.out.println("Cual es el radio de la base del cono?");
        coneUser.setRadio(reader.nextFloat());
        
        System.out.println("El volumen del como es: "+coneUser.calculateVolume());
    }
    
}
