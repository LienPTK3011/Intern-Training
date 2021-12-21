/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tt1;

import java.util.Comparator;

/**
 *
 * @author Asus
 */
public class SortStudentAvgUp implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAvg()> student2.getAvg()) {
            return 1;
        }
        return -1;
    }
}
