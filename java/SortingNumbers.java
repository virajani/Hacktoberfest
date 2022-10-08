/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalalgorithms;

import java.util.HashSet;

/**
 *
 * @author Pasan Yasara
 */
public class SortingNumbers {
    
    public static void main(String[] args) {
        int[] arr = {5,50,36,48,95,45,65,32,74,58};
        int max=0;
        //System.out.println(arr);
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                }
            }
        }
        
        for(int x:arr)
        {
            System.out.println(x);
        }
        
        System.out.println("Maximum No: "+arr[0]);
        System.out.println("Minimum No: "+arr[arr.length-1]);
        
        
        String value="pasan";
        
        
        
        
    }
    
}
