/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerpurchase;
import java.util.Scanner;
/**
 *
 * @author 21757611
 */
public class CustomerPurchase {
public static double total;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int customerNumber; 
        String Name;
        String surname;
        String product;
        double productPrice;
        double productQuantity;
        double tax;
        double  Commision;
        double discount;
        double total;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter customerNumber: \n ");
        customerNumber = scan.nextInt();
        System.out.print("Enter Customer name:\n ");
        Name = scan.nextLine();
        System.out.print("Enter Customer surname:\n ");
        surname = scan.nextLine();
        System.out.print("Enter products name:\n ");
        product = scan.nextLine();
        System.out.print("Enter productPrice:\n ");
        productPrice = scan.nextDouble();
        System.out.print("Enter productQuantity :\n ");
        productQuantity = scan.nextDouble();
        System.out.print("Enter tax:\n ");
        tax = scan.nextDouble();
        System.out.print("Enter Commision:\n ");
        Commision = scan.nextDouble();
        System.out.print("Enter discount:\n ");
        discount = scan.nextDouble();
        total = (productPrice + (productPrice/tax)) - ((productPrice/discount) + (productPrice/Commision));
    
        System.out.print("Customer Invoice: " + "\n" +
                         "**********************\n" +
                              "\n customerNumber:\t " + customerNumber + 
                              "\n name:\t" +Name+ 
                              "\n surname:\t" + surname + 
                              "\n product:\t" + product + 
                              "\n productPrice:\t" + productPrice + 
                              "\n productQuantity:\t" + productQuantity + 
                              " \n tax : \t" +  tax + 
                              "\n Commision:\t " + Commision + 
                              " \n discount :\t " +  discount  + 
                              "\n" + total +
                              "**********************\n" );
    }
    
}
