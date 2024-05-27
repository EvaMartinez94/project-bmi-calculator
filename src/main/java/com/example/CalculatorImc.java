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

        double imc = weight / math.pow(height,2);

        System.out.printf("Tu IMC es %.2f\n",imc);

        if (imc < 16) {
            System.out.println("Esto indica delgadez severa");
            System.out.println("Tener un IMC bajo puede ser indicativo de desnutrición, un trastorno alimentario u otros problemas de salud. Es importante consultar a un profesional de salud para determinar la causa y el tratamiento adecuado.");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Esto indica delgadez moderada");
            System.out.println("Este rango señala una delgadez moderada, lo que puede indicar una ingesta calórica insuficiente o un desequilibrio nutricional. Se recomienda consultar a un profesional de la salud para evaluar la situación y recibir orientación sobre cómo alcanzar un peso saludable.");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Esto indica delgadez leve");
            System.out.println("Hablamos de un bajo peso, pero no algo grave. Puede sugerir una necesidad de ajustar la dieta y aumentar la ingesta calórica para alcanzar un peso óptimo y mejorar la salud general.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Esto indica peso normal");
            System.out.println("Está dentro del rango considerado saludable para la mayoría de las personas. Indica un equilibrio adecuado entre el peso y la altura, lo que sugiere un menor riesgo de enfermedades relacionadas con el peso y una mejor salud en general. ");
        } else if (imc >= 25 && imc <30) {
            System.out.println("Esto indica sobrepeso");
            System.out.println("Esto indica un exceso de peso en relación con la altura, lo que puede aumentar el riesgo de desarrollar enfermedades crónicas como la diabetes tipo 2, enfermedades cardíacas y presión arterial alta. Se recomienda adoptar un estilo de vida más saludable, incluyendo una dieta equilibrada y ejercicio regular.");
        } else if (imc >= 30 && imc <35) {
            System.out.println("Esto indica obesidad leve");
            System.out.println("Esto indica un nivel inicial de obesidad, lo que aumenta el riesgo de problemas de salud como la diabetes, enfermedades cardíacas y ciertos tipos de cáncer. Se recomienda buscar orientación médica y realizar cambios en el estilo de vida para perder peso de forma segura.");
        } else if (imc >= 35 && imc <40) {
            System.out.println("Esto indica obesidad moderada");
            System.out.println("Indica un grado más avanzado de obesidad, lo que aumenta significativamente el riesgo de complicaciones de salud graves. Es importante buscar ayuda médica para iniciar un programa de pérdida de peso supervisado y adoptar cambios en el estilo de vida a largo plazo.");
        } else {
            System.out.println("Esto indica obesidad mórbida");
            System.out.println("Este estado indica obesidad extrema, con un alto riesgo de complicaciones médicas graves, incluyendo enfermedades cardíacas, accidente cerebrovascular, diabetes y problemas respiratorios. Se requiere atención médica urgente y una intervención médica y quirúrgica especializada para abordar esta condición de manera efectiva.");
        }
        scanner.close();

    }
}
