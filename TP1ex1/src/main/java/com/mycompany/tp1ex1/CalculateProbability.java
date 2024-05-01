/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1ex1;

import static java.lang.Math.log;

/**
 *
 * @author houssem
 */
public class CalculateProbability {
    public static double [] CalculateProbability(int[][] image ) {
        double [] tp =new double[256];
        for(int i=0;i<256;i++){
            double p;
            p=0;
            for (int j=0;j<image.length;j++) {
                for(int k=0;k<image[0].length;k++){
                    if (image [j][k]==i){
                        p++;
                    }
                    
                }
            }
            p=(p/((image.length)*(image[0].length)));
            System.out.println("le probabilté de"+i+"est"+p);
            tp[i]=p;
        }
        return tp;
    
    }
    
    
        public static double  CalculateEntropy(int[][] image ){
        double sum ;
        sum=0;
         for(int i=0;i<256;i++){
            double p;
            p=0;
            for (int j=0;j<image.length;j++) {
                for(int k=0;k<image[0].length;k++){
                    if (image [j][k]==i){
                        p++;
                    }
                    
                }
            }
             p=(p/((image.length)*(image[0].length)));
             if (p>0){
           sum+=-(p*log(p));
        }
         }
        System.out.println("Entropie de l'image = "+sum);
        return sum ;
    }
    public static double  CalculateEntropy2 (int[][] image ){
        double sum = 0;
        double [] prob= CalculateProbability(image);
        for(int i=0;i<256;i++){
             if (prob[i] > 0) {
            sum += -(prob[i] * log(prob[i]));
        }
        }
        
        System.out.println("Entropie de l'image = "+sum);
         return sum;
       
        
    }


}
