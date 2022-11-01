
package moneda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Laura Romero
 */

public class juego 
{
    public static void main(String[] args) throws Exception
    {
        // Declaracion de Variables
        int resultadoP1 = 0,
            resultadoP2 = 0,
            resultadoP = 0,
            resultadoN1 = 0,
            resultadoN2 = 0,
            resultadoN = 0,
            resultado = 0,
            contador = 0,
            ganadas = 0,
            perdidas = 0,
            creditos,
            jugar = 1, 
            apuesta;
        
        String nombre =  ("");
        
        try (Scanner lectura = new Scanner(System.in)) 
        {
            System.out.println("\n Bienvenido al carisellazo");
            nombre =  JOptionPane.showInputDialog(" ¿Cual es su nombre?");
            System.out.println("");
            
            System.out.println ("\n " + nombre + " digite los creditos que tiene en total");
            creditos = lectura.nextInt();
         
            do 
            {
                
                System.out.println("\n De la cantidad total de creditos que tiene, con ¿Cuánto quisiera empezar a apostar?");
                apuesta = lectura.nextInt();
                
                if(creditos > apuesta)
                {
                    
                    System.out.println("\n Seleccione la opcion por la que quiere apostar: \n 1. Sello \n 2. Cara");
                    int opcionUsuario = lectura.nextInt();

                    int opcion = (int)(Math.random() * 2) + 1;
                    System.out.println("\n La moneda se esta lanzando... \n");
                
                    // GANAR
                    if(opcionUsuario == opcion)
                    {
                        System.out.println("\n Felicidades, ha ganado");
                        
                        contador = contador + 1;
                    
                        resultadoP2 = apuesta + apuesta;
                        System.out.println(" Ganó: " + resultadoP2);

                        resultadoP = resultadoP1 + resultadoP2;
                        creditos = creditos + resultadoP;
                        System.out.println(" Total de creditos: " + creditos);
                    }

                    // PERDER
                    else
                    {
                        System.out.println("\n Lo sentimos, ha perdido");
                        
                        contador = contador + 1;
                    
                        resultadoN2 = apuesta + apuesta;
                        System.out.println(" Perdió: " + resultadoN2);

                        resultadoN = resultadoN1 + resultadoN2;
                        creditos = creditos - resultadoN;
                        System.out.println(" Total de creditos: " + creditos);
                    }
                    
                    System.out.println("\n Si desea seguir jugando digite 1, si desea salir digite 2");
                    jugar = lectura.nextInt();
                    System.out.println("");
                    
                }
                
                else
                {
                    System.out.println("\n Lo sentimos, no tiene los suficientes creditos para poder apostar \n");
                }
            }
            
            while (jugar!=2);
        }
        
        System.out.println("\n Muchas gracias por haber jugado");
        System.out.println(" Jugó: " + contador + " veces \n");
        System.out.println(" Lo esperamos pronto \n\n");
        
    }
}
