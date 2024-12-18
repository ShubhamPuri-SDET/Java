package Projects;

import java.util.Scanner;

public class Tempreature_Converter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");


        System.out.println("Enter the conversion type:");
        int num = sc.nextInt();
        System.out.println("Enter the tempreature that needs to convert:");
        double Temperature = sc.nextDouble();

        double convertedTemperature;
       

        switch (num) {
            case 1:
            convertedTemperature = celsiusToFahrenheit(Temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", Temperature, convertedTemperature);
            break;
        case 2:
            convertedTemperature = celsiusToKelvin(Temperature);
            System.out.printf("%.2f Celsius is %.2f Kelvin%n", Temperature, convertedTemperature);
            break;
        case 3:
            convertedTemperature = fahrenheitToCelsius(Temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", Temperature, convertedTemperature);
            break;
        case 4:
            convertedTemperature = fahrenheitToKelvin(Temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", Temperature, convertedTemperature);
            break;
        case 5:
            convertedTemperature = kelvinToCelsius(Temperature);
            System.out.printf("%.2f Kelvin is %.2f Celsius%n", Temperature, convertedTemperature);
            break;
        case 6:
            convertedTemperature = kelvinToFahrenheit(Temperature);
            System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", Temperature, convertedTemperature);
            break;
        default:
            System.out.println("Invalid choice! Please restart the program and select a valid option.");
    }


}

// Conversion methods
public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
}

public static double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
}

public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

public static double fahrenheitToKelvin(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9 + 273.15;
}

public static double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
}

public static double kelvinToFahrenheit(double kelvin) {
    return (kelvin - 273.15) * 9 / 5 + 32;
}
}
