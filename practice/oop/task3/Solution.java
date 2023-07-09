package practice.oop.task3;

public class Solution {
    public static void main(String...args) {
        Car[] carCollection = assembleCarExamples();

        for(Car specificCar : carCollection) {
            System.out.println(specificCar.isClassical());
        }
    }

    private static Car[] assembleCarExamples(){
        Car shiny = new Car("Honda", "D7S", 2200);
        Car shaky = new Car("Ponziani", "350H", 2008);
        Car bulky = new Car("BMW", "T", 1990);
        Car slick = new Car("Ford", "Unknown", 1894);
        return new Car[]{ shiny, shaky, bulky, slick };
    }
}

class Car {
    private final String brand; // Is never used, but needs to be here anyway
    private final String model; // Also never used, but you already know why
    private final int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public boolean isClassical() { return productionYear < 1990; }
}