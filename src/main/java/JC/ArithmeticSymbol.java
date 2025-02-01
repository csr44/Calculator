package JC;

public enum ArithmeticSymbol {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private char symbol;

    ArithmeticSymbol(char c) {
        this.symbol = c;
    }
    public static ArithmeticSymbol getSymbol(String inputChar) {
        if(inputChar.length() == 1)
        {
          for(ArithmeticSymbol pickedSymbol : ArithmeticSymbol.values()){
              if(pickedSymbol.symbol == inputChar.charAt(0))
                  return pickedSymbol;
          }
        }
        throw new IllegalArgumentException();
    }
}
