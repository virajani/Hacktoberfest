
package practicalalgorithms;

import java.util.Scanner;

/**
 *
 * @author Pasan Yasara
 */
public class Reverse {
    public static String FirstReverse(String str) {
    
    // code goes here  
    String reverse="";
    for(int i=str.length()-1; i>=0; i--)
    {
      reverse=reverse+str.charAt(i);
    }
    str=reverse;
    return str;
  }
    
    
    public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }
    
}
