package practice.oop.task11.services.impl;

import java.util.List;

import practice.oop.task11.models.Student;
import practice.oop.task11.services.StudentService;

public class StudentServiceImpl implements StudentService {
    
    List<Student> studentDirectory;
    
    public StudentServiceImpl(List<Student> studentDirectory) {
        
        this.studentDirectory = studentDirectory;
    }

    /**
     * Calculates and returns the average score of all Students in a list.
     */
    @Override
    public double averageScoreTotal() {

        double result = 0;
        for (Student student : studentDirectory) {

            result += student.getAverageScore();
        }
        return result / studentDirectory.size();
    }

    /**
     * Finds the oldest Student in a list and returns his name and age.
     */
    @Override
    public String showMostAgedStudent() {

        Student chosenStudent = new Student(null, 0, 0);
        for (Student student : studentDirectory) {

            if (student.getAge() > chosenStudent.getAge()) {
                
                chosenStudent = student;
            }
        }
        return String.format("Name: %s%nAge: %d", chosenStudent.getName(), chosenStudent.getAge());
    }
}
