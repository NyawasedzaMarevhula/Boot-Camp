import javax.swing.JOptionPane;
import java.util.Scanner;

public class CalculateBMI3b {

    public static void main(String[] args) {
        String enterHeight;
        String enterWeight;

        double height;
        double weight;
        double BMI;

        enterHeight = JOptionPane.showInputDialog(null, "Please enter your height in meters");
        enterWeight = JOptionPane.showInputDialog(null, "please enter your weight in kilograms(kg) ");
        height = Double.parseDouble(enterHeight);
        weight = Double.parseDouble(enterWeight);
        BMI = weight / (height * height);
        double newBMI = (double) Math.round(BMI*100)/100;

        JOptionPane.showMessageDialog(null, " Your BMI is " + newBMI + " !");

//
    }
}
