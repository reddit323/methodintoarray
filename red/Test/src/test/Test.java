/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author raulprudente
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]n={2,3,4,5,6,2,3,1,2,1};
        int[]frequency=new int[4];
        
        for(int answer=0;answer<n.length;answer++){
           try{ 
            ++frequency[n[answer]];
           }
           catch(ArrayIndexOutOfBoundsException e){
               System.out.println(e);
               System.out.printf("  responses[%d]=%d%n%n",answer,n[answer]);
           }
           
        }
        
        System.out.printf("%s%10s%n","Rating","Frequency");
        for(int rating=1;rating<frequency.length;rating++)
            System.out.printf("%4d%10d%n",rating,frequency[rating]);
    
            }
        
    
    
}
