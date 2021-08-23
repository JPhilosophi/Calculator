public class EncodeToArab {
    private final DecodeToRome decode;
    private final Calculator calculator;
    private String romeResult;

    public EncodeToArab() {
        this.decode = decode;
        this.calculator = calculator;
    }


    public String transform(){
        int[] roman_value_list = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        int arabicToRoman = calculator.getArabicResult();

        for (int i = 0; i < roman_value_list.length; i += 1){
            while (arabicToRoman >= roman_value_list[i]){
                arabicToRoman -= roman_value_list[i];
                res.append(roman_char_list[i]);
                romeResult = res.toString();
            }
        }
        return romeResult;

    }

    public String getRomeResult(){
        return romeResult;
    }
}
