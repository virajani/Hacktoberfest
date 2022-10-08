/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalalgorithms;

/**
 *
 * @author Pasan Yasara
 */
public class WindowSubsring {
    
    public static String MinWindowSubstring(String[] strArr) {
    // code goes here  
    String N = strArr[0];
    String K = strArr[1];
    int min = Integer.MAX_VALUE;
    String result="";
    
    for(int i=0; i<N.length(); i++)
    {
        StringBuilder match = new StringBuilder(K);
        for(int j=0; j<N.length();j++)
        {
            if(match.toString().contains(String.valueOf(N.charAt(j))))
            {
                int index = match.indexOf(String.valueOf(N.charAt(j)));
                match.replace(index, index+1, "");
            }
            if(match.length()==0)
            {
                if(j-i<min)
                {
                    min = j-i;
                    result= N.substring(i,j+1);
                }
                break;
            }
        }
    }
    return result;
  }

  public static void main (String[] args) {  
    String[] array = {"ahffaksfajeeubsne", "jefaa"};
    System.out.print(MinWindowSubstring(array)); 
  }
}
