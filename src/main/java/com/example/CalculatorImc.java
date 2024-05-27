package com.example;
import java.util.Scanner;

public final class CalculatorImc {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la calculadora del IMC");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu peso en kilogramos: ");
        double weight = scanner.nextDouble();

        System.out.println("Ahora introduce tu altura en metros: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        System.out.printf("Tu IMC es %.2f\n",imc);

        if (imc < 18.5) {
            System.out.println("Esto indica bajo peso");
            System.out.println("Tener un IMC bajo puede ser indicativo de desnutrición, un trastorno alimentario u otros problemas de salud. Es importante consultar a un profesional de salud para determinar la causa y el tratamiento adecuado.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Esto indica peso normal");
            System.out.println("Tener un peso normal se asocia con una menor probabilidad de enfermedades relacionadas con el peso. Es importante mantener un estilo de vida saludable para conservar este estado.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Esto indica sobrepeso");
            System.out.println("El sobrepeso puede aumentar el riesgo de desarrollar problemas de salud como enfermedades cardíacas, diabetes tipo 2 y presión arterial alta. Considera adoptar hábitos alimenticios más saludables y aumentar la actividad física.");
        } else {
            System.out.println("Esto indica obesidad");
            System.out.println("La obesidad se asocia con un mayor riesgo de enfermedades graves como enfermedades cardíacas, diabetes tipo 2, apnea del sueño y ciertos tipos de cáncer. Es crucial buscar asesoramiento médico y adoptar cambios significativos en el estilo de vida.");
        }
        scanner.close();

    }
}
