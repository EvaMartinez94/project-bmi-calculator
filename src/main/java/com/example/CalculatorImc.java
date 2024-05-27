package com.example;
import java.util.Scanner;

public final class CalculatorImc {
    public static void main(String[] args) {

        System.out.println("Welcome to the BMI calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Now enter your height in meters:");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height,2);

        System.out.printf("Your BMI is %.2f\n",bmi);

        if (bmi < 16) {
            System.out.println("This indicates severe thinness");
            System.out.println("Having a low BMI may be indicative of malnutrition, an eating disorder, or other health problems. It is important to consult a health professional to determine the cause and appropriate treatment.");
        } else if (bmi >= 16 && bmi < 17) {
            System.out.println("This indicates moderate thinness");
            System.out.println("This range signals moderate thinness, which may indicate insufficient caloric intake or a nutritional imbalance. It is recommended to consult a health professional to evaluate the situation and receive guidance on how to achieve a healthy weight.");
        } else if (bmi >= 17 && bmi < 18.5) {
            System.out.println("This indicates slight thinness");
            System.out.println("We are talking about low weight, but not something serious. It may suggest a need to adjust diet and increase caloric intake to achieve optimal weight and improve overall health.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("This indicates normal weight");
            System.out.println("It is within the range considered healthy for most people. It indicates a proper balance between weight and height, suggesting a lower risk of weight-related diseases and better overall health.");
        } else if (bmi >= 25 && bmi <30) {
            System.out.println("This indicates overweight");
            System.out.println("This indicates excess weight relative to height, which can increase the risk of developing chronic diseases such as type 2 diabetes, heart disease and high blood pressure. It is recommended to adopt a healthier lifestyle, including a balanced diet and regular exercise.");
        } else if (bmi >= 30 && bmi <35) {
            System.out.println("This indicates mild obesity");
            System.out.println("This indicates a baseline level of obesity, which increases the risk of health problems such as diabetes, heart disease and certain types of cancer. It is recommended to seek medical guidance and make lifestyle changes to lose weight safely.");
        } else if (bmi >= 35 && bmi <40) {
            System.out.println("This indicates moderate obesity");
            System.out.println("It indicates a more advanced degree of obesity, which significantly increases the risk of serious health complications. It is important to seek medical help to start a supervised weight loss program and adopt long-term lifestyle changes.");
        } else {
            System.out.println("This indicates morbid obesity");
            System.out.println("This condition indicates extreme obesity, with a high risk of serious medical complications, including heart disease, stroke, diabetes and respiratory problems. Urgent medical attention and specialized medical and surgical intervention are required to address this condition effectively.");
        }
        scanner.close();

    }
}
