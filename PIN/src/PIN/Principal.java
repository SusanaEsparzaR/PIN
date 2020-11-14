package PIN;

import java.awt.HeadlessException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
    public static void main (String [ ] args) {
    	int valida=0;
    	validacion(valida);

    }

    private static void validacion(int valor) {
    	int valida = valor;
    	boolean entradaNumerica = true;
    	String entradaTeclado ="";
        System.out.print ("--> Introduzca un número de 4 dígitos: ");
        Scanner scan = new Scanner(System.in);
        entradaTeclado = scan.nextLine ();
        if(valida == 0) {
        	if (entradaTeclado.length() != 4) {
                System.out.println ("*** No tiene longitud de 4 carácteres, entrada no válida ***");
                validacion(valida);
            } else {
            	for (int i=0;i< entradaTeclado.length(); i++) {
                    if (Character.isDigit(entradaTeclado.charAt(i)) == false) {
                        System.out.println ("*** Todos los digitos tienen que ser números enteros ***");
                        entradaNumerica = false;
                        validacion(valida);
                        break;
                    }
                }
            }
        }
        System.out.println("--------- Contraseña correcta ---------");
        System.out.println("-->Iniciando método para adivinar el PIN");
        try {
        	Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
        	Thread.currentThread().interrupt();
        }
        adivinaConbinacion(entradaTeclado);
    }

    private static void adivinaConbinacion(String entrada) {
    	int contra=0;
    	int entradaN = Integer.parseInt(entrada);
    	System.out.println("--------- Contraseñas incorrectas ---------");
    	for(int i=0000; i != entradaN; i++) {
    		System.out.print(i + ", ");
    		contra = i+1;
    	}
    	System.out.println("\n-------------------------------------------");
    	System.out.println("--> La contraseña es " + contra);
    	System.exit(0);
    }
}
