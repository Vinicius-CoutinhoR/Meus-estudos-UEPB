/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaStudies.Exceptions;

/**
 *
 * @author Vinicius Coutinho
 */
public class Causes {
    
    public static void main(String[] args) {
        try {
            MethodA(null);
        } catch (Exception e) {
            if(e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        
        MethodA(null);
    }
    
    static void MethodA(Student student) {
        try {
            MethodB(student);
        } catch (Exception cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    static void MethodB(Student student) {
        if(student == null) {
             throw new NullPointerException("The parameter is null! ");
        } 
        
        System.out.println(student.getName());
    }
   
}
