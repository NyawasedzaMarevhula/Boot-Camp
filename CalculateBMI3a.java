import java.util.Scanner;

public class CalculateBMI3a {

    public static void main(String[] args) {
        double height;
        double weight;
        double BMI;


        Scanner inputDevice = new Scanner( System.in);
        System.out.println("Please enter your height in meters ");
        height = inputDevice.nextDouble();
        System.out.println("Please enter your weight in kilograms(kg) ");
        weight = inputDevice.nextDouble();
        BMI = weight / (height * height);
        double newBMI = (double) Math.round(BMI*100)/100;

        System.out.println("Your BMI is " + newBMI + " .");


    }
}
