/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wa;

import java.util.Scanner;
public class WA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int grade;
        int n;
        
        
        System.out.print("enter grade:");
        grade=input.nextInt();
        System.out.print("enter value:");
        n=input.nextInt();
        
        
      while(grade<=n)  {
          
          grade++;
          System.out.println(grade);
          
          
      }
      
      
      while(n<=grade){
          n+=2;
          System.out.println(n);
          
          
      }











    }
    



}