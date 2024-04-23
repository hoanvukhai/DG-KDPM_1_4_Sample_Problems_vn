/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author ACER
 */
public class Mavenproject3 {
    public static String triangle(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0 || a >= b + c || b >= a + c || c >= a + b){
            return "NotATriangle"; 
        }
        if(a == b && b == c){
            return "Equilateral";
        } else if(a==b||b==c||a==c) {
            return "Isosceles";
        } else if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
            return "Right Triangle";
        } else {
            return "Scalene";
        }
    }
//    public static void main(String[] args){
//        int a = 3, b = 4, c = 6;
//        String s=new String();
//        s = triangle(a, b, c);
//        System.out.println(s);
//    }
}
