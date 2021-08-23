public class Calculator {
    private final Decode decode;
    private int num1;
    private int num2;
    private int arabicResult;
    private boolean isRome;

    public Calculator(Decode decode) {
        this.decode = decode;
    }


    public int calculator(){
        if (decode.isArabic() == true){
            num1 = decode.getNum()[0];
            num2 = decode.getNum()[1];
            switch (decode.getOperation()){
                case '+': arabicResult = num1 + num2; break;
                case '-': arabicResult = num1 - num2; break;
                case '*': arabicResult = num1 * num2; break;
                case '/': arabicResult = num1 / num2; break;
                default: System.out.println("Операция не распознана. Повторите ввод.");
            }
        } else {
            isRome = true;
            num1 = decode.getNum()[0];
            num2 = decode.getNum()[1];
            switch (decode.getOperation()){
                case '+': arabicResult = num1 + num2; break;
                case '-': arabicResult = num1 - num2; break;
                case '*': arabicResult = num1 * num2; break;
                case '/': arabicResult = num1 / num2; break;
                default: System.out.println("Операция не распознана. Повторите ввод.");
            }
            if (isRome && (num1 < num2)) throw new IllegalArgumentException("в римской системе нет отрицательных чисел");
        }
        arabicResult = Math.round(arabicResult);
        return arabicResult;
    }

    public int getArabicResult() {
        return arabicResult;
    }
    public boolean getIsRome() {return isRome;}
}
