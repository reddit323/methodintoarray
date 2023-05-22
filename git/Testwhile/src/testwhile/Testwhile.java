/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testwhile;

import java.util.Scanner;
public class Testwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int n;
       int p;
       System.out.print("enter value:");
       p=input.nextInt();
       
       System.out.print("enter number:");
       n=input.nextInt();
       
       while(p<=n){
           p++;
           System.out.println(p);
           
       }
       while(n<=p){
           n+=2;
           System.out.println(n);
       }
       
    }
    
}
