/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Variable Declarations
       
        int HouseNo;
        String StreetName; 
        String CityName;
        int AreaCode;    
       
      
       //Declaring the scanner
      Scanner scanner = new Scanner(System.in); 
                  
    
        System.out.println("Enter House Number:");
        HouseNo = scanner.nextInt();
                
        System.out.println("Enter Street Name:");
        StreetName = scanner.next();
        
        System.out.println("Enter City Name:");
        CityName = scanner.next();
        
        System.out.println("Enter Area Code:");
        AreaCode = scanner.nextInt();
      
        System.out.println("\nYour Address: " + HouseNo + " " + StreetName);
        System.out.println("                " + CityName);
        System.out.println("                " + AreaCode);
                
    }
    
}
