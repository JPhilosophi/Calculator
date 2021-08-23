import java.io.IOException;

public class Loader {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        reader.reader();
        Decode decode = new Decode(reader);
        decode.decodeRome();
        Calculator calculator = new Calculator(decode);
        calculator.calculator();
        Encode encode = new Encode(calculator);
        encode.transform();
        System.out.println(encode.getResult());


    }
}
