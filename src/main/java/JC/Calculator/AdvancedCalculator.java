package JC.Calculator;

import JC.ArithmeticSymbol;
import JC.Operands;
import JC.Operations.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator{

    public AdvancedCalculator(String nameOfCalculator, Map<ArithmeticSymbol, Operation> symbolOperandsMap) {
        super(nameOfCalculator, symbolOperandsMap);
    }
}
