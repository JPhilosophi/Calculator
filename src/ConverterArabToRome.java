public class ConverterArabToRome {
    Roman roman = new Roman();


    public String transform(){
        int[] roman_value_list = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arabicToRoman1 = roman.getRomeToArab()[0];
        int arabicToRoman2 = roman.getRomeToArab()[1];

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < roman_value_list.length; i += 1){
            while (arabicToRoman1 >= roman_value_list[i]){
                arabicToRoman1 -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
        }

    }
}
