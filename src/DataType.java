public class DataType {
    static void main() {

//        Numeric DT - short, byte, int, long

        byte num1 = 127;
        System.out.println(num1);

        short num2 = 32767;
        System.out.println(num2);

        int num3 = 65535;
        System.out.println(num3);
// implicit vs exlpilict conversion
        long num4 = 1234567890;
        int Newnum = (int) num4;
        System.out.println("Newnum is :" + Newnum);

        float num5 = 1.2345f;
        System.out.println(num5);

        double num6 = 1.23456789;
        System.out.println(num6);

        boolean num7 = true;
        System.out.println(num7);
        char num8 = 'a';

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("My First Character is: " + (char)(firstCharacter+2));

    }
}
