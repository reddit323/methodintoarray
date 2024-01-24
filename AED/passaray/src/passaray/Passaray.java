/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passaray;

/**
 *
 * @author raulprudente
 */
public class Passaray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int []er={1,2,4,6,7};
       
       System.out.printf("EFECTS OF PASSING REFERENCE TO ENTIRE ARRAY %n"+"the values of entire array is %n");
       for(int value:er)
           System.out.printf("  %d",value);
       System.out.printf("%n %nthe values of the modified array is %n");
       modifyarray(er);
       for(int value:er)
           
           System.out.printf("  %d",value);
       
   
       modifyelement(er[4]);
      
       
    }
       
       
       public static void modifyarray(int[]array3){
        
           for(int counter=0;counter<array3.length;counter++)
               array3[counter]*=2;
           
          
          
           
       
       }
       public static void modifyelement(int element){
           
        element*=2;
        System.out.printf("%n value of element is %d%n",element);
       
       

   
    }

    
}
