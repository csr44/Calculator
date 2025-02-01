package JC;
import JC.Calculator.CalculatorHolder;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final CalculatorHolder calculatorHolder = new CalculatorHolder();

    public static void main(String[] args) {
        double operand1, operand2;
        String operator;
        ArithmeticSymbol operationObject;
        do {
            System.out.println("Welcome to Java Calculator. Type number, operator(+,-,*,/), number.");
            try {
                operand1 = scanner.nextDouble();
                operator = scanner.next();
                operand2 = scanner.nextDouble();
                operationObject = ArithmeticSymbol.getSymbol(operator);

            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            Operands operands = new Operands(operand1, operand2);
            calculatorHolder.calculateResult(operationObject, operands);

        }while(true);

    }
}