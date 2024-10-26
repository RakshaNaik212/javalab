
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
public class SimpleCalc {
    public static void main(String[] args){
        int num1=10;
        int num2=2;
        int sum=num1+num2;
        int diff=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int quo=num1/num2;
        int rem=num1%num2;
        int exp=(int)pow(num1,num2);
        System.out.println("sum is"+sum);
        System.out.println("diff is"+diff);
        System.out.println("product is"+mul);
        System.out.println("divsion is"+div);
        System.out.println("quotient is"+quo);
        System.out.println("reminder is"+rem);
        System.out.println("exponential is"+exp);

    }
    
}
