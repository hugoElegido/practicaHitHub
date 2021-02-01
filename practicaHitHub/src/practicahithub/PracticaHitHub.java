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
        int nums;
        
        System.out.println("Cuantos numeros quieres anotar?");
        nums=sc.nextInt();
        int numeros[]=new int [nums];
        boolean buscarOk;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Anota un numero");
            numeros[i]=sc.nextInt();
            buscarOk=noRepetir(numeros,i);
            if(buscarOk==true)
                i--;
        }
        
        Arrays.sort(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); 
        }
    }
    
    public static boolean noRepetir (int num[],int i){
  
        for (int j = 0; j < i; j++) {
            if(num[j]==num[i]){
                System.out.println("Numero no valido, no se pueden repetir numeros");
                return true;
                }     
            }
        return false;
    }
    
}
