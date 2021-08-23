public class Loader {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        EncodeToArab encode = new EncodeToArab();
        calculator.calculator();


        System.out.println(encode.getRomeResult());

    }
}
