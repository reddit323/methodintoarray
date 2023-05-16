/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudante;

import java.util.Scanner;
public class Estudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int passes=0;
        int failure=0;
        int studentcounter=1;
        
        while(studentcounter<=10){
            System.out.printf("enter result(1=pass,2=fail): ");
            int result=input.nextInt();
            if(result==1)
                passes=passes+1;
            else
               failure=failure+1;
            
            studentcounter=studentcounter+1;
            
        }
       System.out.printf("passed: %d%nfailed: %d%n",passes,failure);
       if(passes>8)
           System.out.println("bonus to instructor!");
       
    }
    
}
