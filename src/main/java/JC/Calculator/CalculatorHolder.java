package JC.Calculator;

import JC.ArithmeticSymbol;
import JC.Operands;
import JC.Operations.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorHolder {

    BasicCalculator basicCalculator;
    AdvancedCalculator advancedCalculator;

    public CalculatorHolder(){
        this.CalculatorInitialization();
    }

    public void CalculatorInitialization(){
        final Map<ArithmeticSymbol, Operation> basicCalculatorOperationMap = new HashMap<>();

        basicCalculatorOperationMap.put(ArithmeticSymbol.ADDITION,new Addition());
        basicCalculatorOperationMap.put(ArithmeticSymbol.SUBTRACTION, new Subtraction());
        this.basicCalculator = new BasicCalculator("BasicCalculator",basicCalculatorOperationMap);

        final Map<ArithmeticSymbol, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put(ArithmeticSymbol.DIVISION,new Division());
        advancedCalculatorOperationMap.put(ArithmeticSymbol.MULTIPLICATION, new Multiplication());
        this.advancedCalculator = new AdvancedCalculator("AdvancedCalculator",advancedCalculatorOperationMap);

    }

    public void calculateResult(ArithmeticSymbol symbol, Operands operands){
        AbstractCalculator calculator = this.getRightCalculator(symbol);
        double result = calculator.calculate(symbol,operands);
        this.printResult(result);
    }

    private void printResult(double result){
        System.out.println(result);
    }

    private AbstractCalculator getRightCalculator(ArithmeticSymbol symbol){
        switch (symbol){
            case ADDITION,SUBTRACTION -> {
                return this.basicCalculator;
            }
            case DIVISION,MULTIPLICATION -> {
                return this.advancedCalculator;
            }
            default -> throw new IllegalArgumentException("Unsupported operation.");
        }

    }




}
