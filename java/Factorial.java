/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalalgorithms;

import java.util.Scanner;

/**
 *
 * @author Pasan Yasara
 */
public class Factorial {
    
    int fact(int num)
    {
        if(num!=1)
        {
            return num*fact(num-1);
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Factorial f = new Factorial();
        System.out.println(f.fact(s.nextInt()));
        
    }
    
}
