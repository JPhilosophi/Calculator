import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    private String resultString;
    private int num1;
    private int num2;
    private String rome1;
    private String rome2;
    private char operation;

    public void reader() {
        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);
        Pattern patternArabic = Pattern.compile("(\\d+)([+\\-\\*\\/])(\\d+)");
        Pattern patternRome = Pattern.compile("[I-X]+[+\\-*\\/][I-X]+");
        resultString = sc.nextLine().replaceAll("\\s+", "");
        Matcher matcherArabic = patternArabic.matcher(resultString);
        Matcher matcherRome = patternRome.matcher(resultString);
        if (matcherArabic.matches()) {
            num1 = Integer.parseInt(matcherArabic.group(1));
            num2 = Integer.parseInt(matcherArabic.group(3));
            String builder = matcherArabic.group(2);
            operation = builder.charAt(0);
        } else if (matcherRome.matches()) {
            rome1 = matcherRome.group(1);
            rome2 = matcherRome.group(3);
            String builder = matcherArabic.group(2);
            operation = builder.charAt(0);
            } else System.out.println("Введено не корректное выражение");


    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getRome1(){
        return rome1;
    }

    public String getRome2(){
        return rome2;
    }

    public char getOperation() {
        return operation;
    }


}
