/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaStudies.Exceptions;

import java.util.Scanner;

/**
 * @author Vinicius Coutinho
 * 
 * This Class is about the Finally concept in Java.
 * The finally will execute the code inside it, even
 * it occurs a exception or not.
 * 
 * See the example below: 
 */
public class Finally {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(3 / input.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally, close the scanner.");
            input.close();
        }
        
        System.out.println("End of the program.");
    }
}