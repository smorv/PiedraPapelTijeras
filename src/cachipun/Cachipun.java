/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachipun;
import java.util.Scanner;

/**
 *
 * @author Soledad Moraga
 */
public class Cachipun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cantidadJugadas=sc.nextLine();        
        String jugadorUno=sc.nextLine();
        String jugadorDos=sc.nextLine();
        String [] cadenaJUno=jugadorUno.split(" ");
        String [] cadenaJDos=jugadorDos.split(" ");
        int Juno=0;
        int Jdos=0;
        int cantidades=Integer.parseInt(cantidadJugadas);
        if(cadenaJUno.length ==cantidades && cadenaJDos.length==cantidades)
        {
            
            for(int i=0; i<cadenaJUno.length;i++)
            {
                if(cadenaJUno[i].equals("PA")&& cadenaJDos[i].equals("PA"))
                {
                    Juno+=0;
                    Jdos+=0;
                }
                if(cadenaJUno[i].equals("PI")&& cadenaJDos[i].equals("PI"))
                {
                    Juno+=0;
                    Jdos+=0;
                }
                if(cadenaJUno[i].equals("TI")&& cadenaJDos[i].equals("TI"))
                {
                    Juno+=0;
                    Jdos+=0;
                }
                if(cadenaJUno[i].equals("PI")&& cadenaJDos[i].equals("PA") ||cadenaJDos[i].equals("PA")&& cadenaJUno[i].equals("PI") )
                {
                    Juno+=0;
                    Jdos+=1;
                }
                if(cadenaJUno[i].equals("PA")&& cadenaJDos[i].equals("TI") || cadenaJDos[i].equals("TI")&& cadenaJUno[i].equals("PA"))
                {
                    Juno+=0;
                    Jdos+=1;
                }
                if(cadenaJUno[i].equals("PI")&& cadenaJDos[i].equals("TI") || cadenaJDos[i].equals("TI")&& cadenaJUno[i].equals("PI"))
                {
                    Juno+=1;
                    Jdos+=0;
                }
                if(cadenaJUno[i].equals("TI")&& cadenaJDos[i].equals("PA") || cadenaJDos[i].equals("PA")&& cadenaJUno[i].equals("TI"))
                {
                    Juno+=1;
                    Jdos+=0;
                }
            }
            if(Juno > Jdos)
            {
                System.out.println("GANA JUGADOR UNO");
            }
            if(Juno < Jdos)
            {
                System.out.println("GANA JUGADOR DOS");
            }
            if(Juno == Jdos)
            {
                System.out.println("EMPATE");
            }
        }
    }
    
}
