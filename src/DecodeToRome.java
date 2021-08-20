public class DecodeToRome {
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

        Reader reader = new Reader();
        private int[] romeToArab = new int[2];

        public int[] decode(){
            reader.reader();
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

            romeToArab[0] = result1;
            romeToArab[1] = result2;
            return romeToArab;
        }


        public int[] getRomeToArab(){
            return romeToArab;
        }

}
