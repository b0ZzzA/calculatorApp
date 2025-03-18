/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorapp;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String num1Input,num2Input;//Variable decleration to get input
        int num1,num2;//Variable declaration to get 2 numbers from user
        
        num1Input=JOptionPane.showInputDialog("Enter number 1");//User input to get 1st number
        num1=Integer.parseInt(num1Input);//Converting string entered number to int so number can be used for calculations
        num2Input=JOptionPane.showInputDialog("Enter number 2");//User input to get 2nd number
        num2=Integer.parseInt(num2Input);//Converting string entered number to int so number can be used for calculations
        
        //Addition of two numbers and displaying answer
        int addition=addNumbers(num1,num2);
        System.out.println("Adding : " + num1 + " + " + num2 + " = " + addition);
        //Subtraction of two numbers and displaying answer
        int subtraction=subtractNumbers(num1,num2);
        System.out.println("Subtracting : " + num1 + " - " + num2 + " = " + subtraction);
        //Multiplication of two numbers and displaying answer
        int multiplication=multiplyNumbers(num1,num2);
        System.out.println("Multiplying : " + num1 + " * " + num2 + " = " + multiplication);
        //Division of two numbers and displaying answer
        double division=dividingNumbers(num1,num2);
        System.out.println("Dividing : " + num1 + " / " + num2 + " = " + division);
    }
    
    //Function to add two numbers
    public static int addNumbers(int num1, int num2)
    {
        int ans;
        ans=num1+num2;
        return ans;
    }
    //Function to subtract two numbers
    public static int subtractNumbers(int num1, int num2)
    {
        int ans;
        ans=num1-num2;
        return ans;
    }
    //Function to mutiply two numbers
        public static int multiplyNumbers(int num1, int num2)
    {
        int ans;
        ans=num1*num2;
        return ans;
    }
    //Function to divide two numbers
    public static double dividingNumbers(double num1, double num2)
    {
        double ans;
        ans=(num1/num2);
        return ans;
    }
    
    
}
