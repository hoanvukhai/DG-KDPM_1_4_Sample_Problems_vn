/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class Mavenproject3Test {
    
    Mavenproject3 tamgiac = new Mavenproject3();
    MPJ3_NextDate ngaytieptheo = new MPJ3_NextDate();

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", tamgiac.triangle(1, 2, 4));
    }
    
    @Test 
    public void testScaleneTriangle(){
        assertEquals("Scalene", tamgiac.triangle(3, 4, 6));
    }
    
    @Test 
    public void testRightTriangle(){
        assertEquals("Right Triangle", tamgiac.triangle(3, 4, 5));
        assertEquals("Right Triangle", tamgiac.triangle(5, 3, 4));
        assertEquals("Right Triangle", tamgiac.triangle(4, 5, 3));
    }
    
    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", tamgiac.triangle(5, 5, 7));
        assertEquals("Isosceles", tamgiac.triangle(5, 7, 5));
        assertEquals("Isosceles", tamgiac.triangle(7, 5, 5));
    }
    
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", tamgiac.triangle(3, 3, 3));
    }
    
    @Test
    public void testNextDate(){
        assertEquals(2, ngaytieptheo.nextDate(1, 1, 2000));
        assertEquals(1, ngaytieptheo.nextDate(31, 1, 2000));
        assertEquals(1, ngaytieptheo.nextDate(31, 12, 1999));
        assertEquals(1, ngaytieptheo.nextDate(31, 1, 1999));
        assertEquals(1, ngaytieptheo.nextDate(30, 4, 1899));
        assertEquals(29, ngaytieptheo.nextDate(28, 2, 2004));
        assertEquals(1, ngaytieptheo.nextDate(28, 2, 2001));
        assertEquals(2, ngaytieptheo.nextDate(1, 1, 1812));
        assertEquals(1, ngaytieptheo.nextDate(31, 12, 2012));
    }
}
