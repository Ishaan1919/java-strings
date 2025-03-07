import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = 2;
        double[][] data = new double[len][2];
        
        for (int i = 0; i < len; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }
        input.close();
        
        String[][] results = calculateBMI(data);
        displayResults(results);
    }
    // Method to calculate BMI and return 2D String array 
    public static String[][] calculateBMI(double[][] data) {
        int len = 2;
        String[][] result = new String[len][4];
        
        for (int i = 0; i < len; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);
            String status = getBMIStatus(bmi);
            
            result[i][0] = String.format("%.2f", data[i][1]);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.valueOf(bmi);
            // result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    
    // Method to determine BMI for people
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
    
    // Method to display the results
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10.5s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
    
}
