/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahithub;
import java.util.*;

/**
 *
 * @author hugo_
 */
public class PracticaHitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int numeros[]=new int [10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Anota un numero");
            numeros[i]=sc.nextInt();
            for (int j = 0; j < i; j++) {
                if(numeros[j]==numeros[i]){
                    System.out.println("Numero no valido, no se pueden repetir numeros");
                    i--;
                }
            }
        }
        
        Arrays.sort(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); 
        }
    }
    
}
