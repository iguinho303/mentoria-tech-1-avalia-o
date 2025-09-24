import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius +