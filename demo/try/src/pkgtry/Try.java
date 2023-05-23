/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgtry;

import java.util.Scanner;
public class Try {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        int total=0;
        int counter=0;
        System.out.print("enter number:");
        n=input.nextInt();
        while(n!=1&&n!=2){
        
        total=total+1;
        counter=counter+1;
        System.out.print("give me the number: ");
        n=input.nextInt();
        
    }
        
        
      if(counter!=0){
        double average=total/counter;
         System.out.printf("average is %.2f%n",average );
         System.out.printf("%n total of the %d numbers is %d%n",counter,total);
        
      }
     
        
    
    }
    
}
