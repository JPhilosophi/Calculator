import java.io.IOException;

public class Decode {
    private final Reader reader;
    private boolean isArabic;

    public Decode(Reader reader) {
        this.reader = reader;
    }

    private int[] num = new int[2];
    private String[] test = new String[2];

    private static int decodeSingle(char letter) {
            switch (letter) {
                case 'M':
                    return 1000;
                case 'D':
                    return 500;
                case 'C':
                    return 100;
                case 'L':
                    return 50;
                case 'X':
                    return 10;
                case 'V':
                    return 5;
                case 'I':
                    return 1;
                default:
                    return 0;
            }
        }

    public int[] decodeRome() throws IOException {
        if (reader.isArabic() == true){
            test[0] = reader.getNum1();
            test[1] = reader.getNum2();
            num[0] = Integer.parseInt(reader.getNum1());
            num[1] = Integer.parseInt(reader.getNum2());
            isArabic = true;
            return num;
        }  else {
            int result1 = 0;
            int result2 = 0;
            String uRom1 = reader.getNum1();
            String uRom2 = reader.getNum2();
            for(int i = 0; i < uRom1.length() - 1; i++){
                if (decodeSingle(uRom1.charAt(i)) < decodeSingle(uRom1.charAt(i+1))){
                    result1 -= decodeSingle(uRom1.charAt(i));
                } else {
                    result1 += decodeSingle(uRom1.charAt(i));
                }
            }

            for(int i = 0; i < uRom2.length() - 1; i++){
                if (decodeSingle(uRom2.charAt(i)) < decodeSingle(uRom2.charAt(i+1))){
                    result2 -= decodeSingle(uRom2.charAt(i));
                } else {
                    result2 += decodeSingle(uRom2.charAt(i));
                }
            }
            result1 += decodeSingle(uRom1.charAt(uRom1.length() - 1));
            result2 += decodeSingle(uRom2.charAt(uRom2.length() - 1));

            num[0] = result1;
            num[1] = result2;
            return num;
        }
    }


    public int[] getNum(){
        return num;
    }

    public char getOperation() {
        return reader.getOperation();
    }

    public boolean isArabic(){
        return isArabic;
    }
}
