package test;

//class does some basic math

public class test2{
    //variables and constants
    double num;
    double result;
    double res;
    public static final double initialNum = 10;
    
    //constructer
    public test2(){
        System.out.println("Thanks for using a no arguments constructor.");
    }
    
    public test2(double number){
        num=number;
        result=num*initialNum;
        System.out.println("You are crezzy.");
    }
    
    public double divide(double number){
    num = number;
    res = num/initialNum;
    return res;
    }
}