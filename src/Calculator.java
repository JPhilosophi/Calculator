public class Calculator {
    Reader reader = new Reader();
    DecodeToRome decode = new DecodeToRome();
    private int num1;
    private int num2;
    private int arabicResult;

    public int calculator(){
        reader.reader();
        decode.decode();
        int[] decodeResult = decode.getRomeToArab();

        if (decodeResult != null) {
                num1 = decodeResult[0];
                num2 = decodeResult[1];
            switch (reader.getOperation()){
                case '+': arabicResult = num1 + num2; break;
                case '-': arabicResult = num1 - num2; break;
                case '*': arabicResult = num1 * num2; break;
                case '/': arabicResult = num1 / num2; break;
                default: System.out.println("Операция не распознана. Повторите ввод.");
            }
        } else if (num1 == Integer.parseInt(reader.getNum1()) && num2 == Integer.parseInt(reader.getNum2())){
            switch (reader.getOperation()){
                case '+': arabicResult = num1 + num2; break;
                case '-': arabicResult = num1 - num2; break;
                case '*': arabicResult = num1 * num2; break;
                case '/': arabicResult = num1 / num2; break;
                default: System.out.println("Операция не распознана. Повторите ввод.");
            }
        } else System.out.println("Калькулятор работает только с числами от 1 до 10");
        arabicResult = Math.round(arabicResult);
        return arabicResult;
    }

    public int getArabicResult() {
        return arabicResult;
    }
}
