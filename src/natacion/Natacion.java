/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacion;

import java.util.Scanner;

public class Natacion {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double p1=0.15, p2=0.15, p3=0.20, p4=0.3, p5=0.25; // Suma=100%
        
        // Añadir porcentajes
        while(p1+p2+p3+p4+p5!=1){
            System.out.println("Añadir porcentaje Prueba 1: ");
            p1=teclado.nextDouble();
            System.out.println("Añadir porcentaje Prueba 2: ");
            p2=teclado.nextDouble();
            System.out.println("Añadir porcentaje Prueba 3: ");
            p3=teclado.nextDouble();
            System.out.println("Añadir porcentaje Prueba 4: ");
            p4=teclado.nextDouble();
            System.out.println("Añadir porcentaje Prueba 5: ");
            p5=teclado.nextDouble();
        }
        int i;
        boolean puntua = true;
        float[] lista = new float[5];
        // Puntua las pruebas del 1 al 10, si no participa en alguna puntuale con un 0
        System.out.println("LA PUNTUACIÓN");
        for (i = 0; i < 5; i++) {
            System.out.println("La Puntuación de la prueba es " + (i + 1) + ": ");
            float puntuacion = teclado.nextFloat();
            while (puntuacion < 0 || puntuacion > 10) {
                System.out.println("La Puntuación de la prueba es " + (i + 1) + ": ");
                puntuacion = teclado.nextFloat();
            
            lista[i] = puntuacion;
            if (puntuacion == 0) {
                puntua = false;
            } else {
                switch (i) {
                    case 0:
                        media = media + (lista[i] * p1);
                        break;
                    case 1:
                        media = media + (lista[i] * p2);
                        break;
                    case 2:
                        media = media + (lista[i] * p3);
                        break;
                    case 3:
                        media = media + (lista[i] * p4);
                        break;
                    case 4:
                        media = media + (lista[i] * p5);
                        break;
                }
            }
        }

            if (puntua == true) {
            System.out.println(media);
        } else {
            System.out.println("No están todas las pruebas, Faltan pruebas por puntuar");
        }

    }

    }
}
