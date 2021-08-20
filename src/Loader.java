public class Loader {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Calculator calculator = new Calculator();
        EncodeToArab encode = new EncodeToArab();

        calculator.calculator();
        encode.transform();

        System.out.println(encode.getRomeResult());

    }
}
