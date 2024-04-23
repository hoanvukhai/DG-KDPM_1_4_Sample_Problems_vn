/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author ACER
 */
public class MPJ3_NextDate {
    public static int nextDate(int d, int m, int y){
    if((d >= 1 && d <= 31) && (m >= 1 && m <= 12) && (y >= 1812 && y <= 2012)){
        // Tăng ngày lên 1
        d++;

        // Kiểm tra xem tháng đó có bao nhiêu ngày
        int daysInMonth;
        if (m == 2) {
            // Kiểm tra năm nhuận
            if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
                daysInMonth = 29;
            else
                daysInMonth = 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }

        // Nếu ngày vượt quá số ngày trong tháng, chuyển sang tháng tiếp theo
        if (d > daysInMonth) {
            d = 1;
            m++;
            // Nếu tháng vượt quá 12, chuyển sang năm tiếp theo
            if (m > 12) {
                m = 1;
                y++;
            }
        }
    }
    return d;
    }
}
