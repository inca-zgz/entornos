//2.- Pedir por consola un nombre y despu�s muestra un mensaje de bienvenida 
//por consola. Por ejemplo: si introduzco �Fernando�, me aparezca �Bienvenido Fernando�.  
//(recuerda usar JOptionPane)

package ejerciciosDesdecero;
import javax.swing.JOptionPane;
public class ejercicioJava2 {

        public static void main (String[] args) {
        	
        	String nombre;
            nombre = JOptionPane.showInputDialog("�C�mo te llamas?");
            System.out.println("Bienvenida " + nombre);

        }
    }
	