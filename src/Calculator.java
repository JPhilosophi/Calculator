public class Calculator {
    private final Reader reader = reader.reader();
    private final DecodeToRome decode = decode.decode();
    private int num1;
    private int num2;
    private int arabicResult;



    public int calculator(){
        if (reader.getIsArabic() == true){
            num1 = Integer.parseInt(reader.getNum1());
            num2 = Integer.parseInt(reader.getNum2());
            switch (reader.getOperation()){
                case '+': arabicResult = num1 + num2; break;
                case '-': arabicResult = num1 - num2; break;
                case '*': arabicResult = num1 * num2; break;
                case '/': arabicResult = num1 / num2; break;
                default: System.out.println("Операция не распознана. Повторите ввод.");
            }
        } else {
            int[] decodeResult = decode.getRomeToArab();
            num1 = decodeResult[0];
            num2 = decodeResult[1];
            switch (reader.getOperation()){
                case '+': arabicResult = num1 + num2; break;
                case '-': arabicResult = num1 - num2; break;
                case '*': arabicResult = num1 * num2; break;
                case '/': arabicResult = num1 / num2; break;
                default: System.out.println("Операция не распознана. Повторите ввод.");
            }
        }
        arabicResult = Math.round(arabicResult);
        return arabicResult;
    }

    public int getArabicResult() {
        return arabicResult;
    }
}
