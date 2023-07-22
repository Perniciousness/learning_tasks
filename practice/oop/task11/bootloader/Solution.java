package practice.oop.task11.bootloader;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import practice.oop.task11.models.Student;
import practice.oop.task11.services.impl.StudentServiceImpl;

public final class Solution {

    private Solution(){}

    public static void main(String[] args) {
        
        // Setting up a list in order to be able to do something with it
        List<Student> students = new ArrayList<>();
        students.add(new Student("Briguette", 27, 7.1));
        students.add(new Student("Bourbon", 41, 5.93));
        students.add(new Student("Tal", 19, 6.9));
        students.add(new Student("Shinichi", 21, 9.02));
        students.add(new Student("Charlemagne", 32, 8.47));
        students.add(new Student(null, 0, 0));
        
        // Initializing tools to prepare to call methods and log results
        Logger logger = Logger.getLogger("output");
        StudentServiceImpl tool = new StudentServiceImpl(students);

        // Main stuff
        for (Student student : students) {

            logger.log(Level.INFO, "{0}", student.getName());
            logger.log(Level.INFO, "{0}", student.getAge());
            logger.log(Level.INFO, "{0}\n", student.getAverageScore());
        }
        logger.log(Level.INFO, "Average score of a generic student in the list is {0}", tool.averageScoreTotal());
        logger.log(Level.INFO, "The oldest student in the list is:\n{0}", tool.showMostAgedStudent());
    }
}
