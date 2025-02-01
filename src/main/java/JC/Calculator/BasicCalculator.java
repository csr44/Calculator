package JC.Calculator;

import JC.ArithmeticSymbol;
import JC.Operands;
import JC.Operations.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator{

    public BasicCalculator(String nameOfCalculator, Map<ArithmeticSymbol, Operation> symbolOperandsMap) {
        super(nameOfCalculator, symbolOperandsMap);
    }
}
