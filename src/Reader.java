import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    private String num1;
    private String num2;
    private char operation;
    private boolean isArabic = false;

    public void reader() throws IOException {
        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);
        Pattern patternArabic = Pattern.compile("(\\d+)([+\\-\\*\\/])(\\d+)");
        Pattern patternRome = Pattern.compile("([I-X]+)([+\\-*\\/])([I-X]+)");
        String resultString = sc.nextLine().replaceAll("\\s+", "");
        Matcher matcherArabic = patternArabic.matcher(resultString);
        Matcher matcherRome = patternRome.matcher(resultString);
        if (matcherRome.matches()){
            System.out.println(resultString);
            num1 = matcherRome.group(1);
            String builder = matcherArabic.group(2);
            num2 = matcherRome.group(3);
            operation = builder.charAt(0);
        } else if (matcherArabic.matches()) {
            isArabic = true;
            num1 = matcherArabic.group(1);
            num2 = matcherArabic.group(3);
            String builder = matcherArabic.group(2);
            operation = builder.charAt(0);

        }
        else {
            System.out.println("Введенный данные не соответсвуют ни арабским ни римским");
        }

    }

    public String getNum1(){
        return num1;
    }

    public String getNum2(){
        return num2;
    }

    public char getOperation() {
        return operation;
    }

    public boolean isArabic(){
        return isArabic;
    }



}
