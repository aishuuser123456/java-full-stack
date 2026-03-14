/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aishw
 */
public class chessboard {
    public static void main(String[]args){
        int size=8;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((i+j)% 2 ==0){
                    System.out.print(" B ");
                }else{
                    System.out.print(" W ");
                }
            }
            System.out.println();
        }
    }
    
}
