/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarioexamen;

/**
 *
 * @author josic
 */
public class UnitarioExamen {

    /**
     * @param args the command line arguments
     */
   /**
     * 
     * @return num En este caso devuelve num dependiendo de la condicion que tome en base al valor introducido.
     */
	//Hey ultima prueba, hey otra vez, hey ramanueva, esto es exclusivo para ti

    public int funcion(int num) {
        if (num < 0) {
            throw new ArithmeticException("Número " + num + " es negativo");
        } else if (num == 1) {
            return num - 1;
        } else if (num == 2) {
            return num + 1;
        }
        return num * num;
    }

    /**
     * @param args the command line arguments
     * @throws ArithmeticException Lanza una excepcion.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UnitarioExamen examen = new UnitarioExamen();
        System.out.println(examen.funcion(1));

        System.out.println(examen.funcion(2));
    
        System.out.println(examen.funcion(3));
    
        //System.out.println(examen.funcion(-1));
    }
}
