public class Calculator {
    Reader reader = new Reader();
    private int arabicResult;

    public void calculator(){
        reader.reader();
        if (reader.getNum1() > 10 || reader.getNum2() > 10){
            System.out.println("Калькулятор работает только с числами от 1 до 10");
        } else
            switch (reader.getOperation()){
            case '+': arabicResult = reader.getNum1() + reader.getNum2(); break;
            case '-': arabicResult = reader.getNum1() - reader.getNum2(); break;
            case '*': arabicResult = reader.getNum1() * reader.getNum2(); break;
            case '/': arabicResult = reader.getNum1() / reader.getNum2(); break;
            default: System.out.println("Операция не распознана. Повторите ввод.");
        }
    }

    public int getArabicResult() {
        return arabicResult;
    }
}
