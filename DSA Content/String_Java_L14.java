public class String_Java_L14 {
    public static void main() {
        // string -- > string is a just sequence of character
        // char ch = 'a' --> here, 'char' is type, 'ch; is variable and '=' is operator and "a" character
        // Creation of string

        String firstName = "Ajju";
        String lastName = "Babbar";
        System.out.println(firstName + " "+ lastName + " ");
        //System.out.println(lastName[3]); --> give an error, because need matrix/array
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(3));

        // string is immutable but reference shifting is possible means
        String name = "Rana";
        //name[0] = 'B';   // This is not possible, beacause is string is immutable
        name = "Bana";  //this is possible beacause here is reference shifting happening
        System.out.println(name);

        // comparison

        String name1 = "Love";
        String name2 = "LOVE";

        if(name1==name2) {
            System.out.println("Both strings are equal");
        }
        else {
            System.out.println("Both strings are not equal");
        }
        // function check ->  ==, .equals(), .equalsIgnoreCase

        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("Both strings are equal");
        }
        else {
            System.out.println("Both strings are not equal");
        }












    }
}
