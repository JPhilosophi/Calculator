public class Loader {
    public static void main(String[] args) {

        //Calculator calculator = new Calculator();
        //calculator.calculator();
        //System.out.println(calculator.getArabicResult());

        Roman roman = new Roman();
        roman.decode();
        roman.getRomeToArab();

        for (int i = 0; i < roman.getRomeToArab().length; i++){
            System.out.println(roman.getRomeToArab()[i]);
        }




    }
}
