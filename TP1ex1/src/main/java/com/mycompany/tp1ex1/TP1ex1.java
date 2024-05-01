/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1ex1;

/**
 *
 * @author houssem
 */
import static com.mycompany.tp1ex1.CalculateProbability.CalculateEntropy;
import static com.mycompany.tp1ex1.CalculateProbability.CalculateEntropy2;
import static com.mycompany.tp1ex1.CalculateProbability.CalculateProbability;
import java.util.Scanner;

/**
 *
 * @author houssem
 */
public class TP1ex1 {

    public static void main(String[] args) {
        
         System.out.println("Quelle est votre nom");
         Scanner read = new Scanner (System.in);
         String name = read.next();
         //lecture du nom
         System.out.println("");
         System.out.println("Bonjour "+name);
         System.out.println("Quel est votre age "+name+" ?");
         int a;
         a=read.nextInt();
         System.out.println(name+" votre age est "+a);
         int [][] img = {{1,2,3,4},{5,6,7,8},{10,10,10,13}};
    
         double [] CP = CalculateProbability(img);
         double CE =CalculateEntropy(img);
         double CE2 =CalculateEntropy2(img);
         System.out.println("probability="+CP+"et entropy im1="+CE+"et entropy im2="+CE2);
         
         
        
    }
 
}