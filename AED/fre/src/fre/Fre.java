/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fre;

/**
 *
 * @author raulprudente
 */
public class Fre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[]n={2,3,4,5,6,8,9,3,2,1};
       int[]frd=new int[7];
       
       for(int responses=0;responses<n.length;responses++){
           try{
               ++frd[n[responses]];
           }
           catch(ArrayIndexOutOfBoundsException a)
                   {
                       System.out.println(a);
                       System.out.printf("[%d]=%d%n",responses,n[responses]);
               
           }
       }
       System.out.printf("%s%10s%n","Rating","frd");
       
       for(int rating=1;rating<frd.length;rating++)
          System.out.printf("%5d%7d%n",rating,frd[rating]);
    }
    
}
