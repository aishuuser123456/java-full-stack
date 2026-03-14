/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aishw
 */
import java.util.Scanner;
public class matrix {
    public static void main(String[]args){
         Scanner s=new Scanner(System.in);
    int r=3,c=3;
    int arr[][]={
        {16,29,30},
        {40,-50,60},
        {79,86,93}
            
    };
    System.out.println("1th row and 1th column elements");
    for(int i=0;i<r;i++){
    for(int j=1;j<c;j++){
    if(i==0||j==1)
        System.out.print(arr[i][j]+" ");
    }
    }
    }
   
    
}

