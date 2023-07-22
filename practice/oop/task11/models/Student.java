package practice.oop.task11.models;

public class Student {
    // 99.9% of the time people tend to keep their name unchanged... final it is
    private final String name;
    private int age;
    private double averageScore;

    public Student(String name, int age, double averageScore) {
        // Youngest student who got into university was 6yo
        this.name = name != null ? name : "Joe";
        this.age = age >= 6 ? age : 18;
        this.averageScore = averageScore;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public double getAverageScore() {
        
        return averageScore;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setAverageScore(double averageScore) {

        this.averageScore = averageScore;
    }
}
