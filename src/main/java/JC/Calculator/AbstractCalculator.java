package JC.Calculator;

import JC.ArithmeticSymbol;
import JC.Operands;
import JC.Operations.Operation;

import java.util.Map;

abstract public class AbstractCalculator {
    String nameOfCalculator;
    Map<ArithmeticSymbol, Operation> symbolOperandsMap;

    public AbstractCalculator(String nameOfCalculator, Map<ArithmeticSymbol, Operation> symbolOperandsMap) {
        this.nameOfCalculator = nameOfCalculator;
        this.symbolOperandsMap = symbolOperandsMap;
    }

    public double calculate(ArithmeticSymbol symbol, Operands operands) {
        if (symbolOperandsMap.containsKey(symbol)) {
            Operation operation = symbolOperandsMap.get(symbol);
            return operation.calculate(operands.getOperand1(), operands.getOperand2());
        }else {
            throw new IllegalArgumentException("Calculator doesn't support operation: " + symbol);
        }
    }

}
