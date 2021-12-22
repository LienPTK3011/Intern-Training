/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuctapoop;

import java.util.Comparator;

/**
 *
 * @author Dang
 */
public class SortStudentAverageDown implements Comparator<Student> {
   
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getaveragepoint()> student2.getaveragepoint()) {
          System.out.printf("Averagepoint:",student1.averagepoint,student2.averagepoint);
        }
        return 0;
    
    }
}
