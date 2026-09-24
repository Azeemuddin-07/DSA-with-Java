import java.util.Scanner;

public class input_String_L14 {
    public static void main() {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Provide the string content");
//
//        // sc.nextLine -> this method is used to store whole line
//        String str = sc.nextLine();
//        System.out.println("Value of nextLine : " + str);
//
//        // sc.next() -> this method used to store only those string where space is absent.
//        System.out.println("Provide the string content");
//        String str2 = sc.next();
//        System.out.println("Value of next : " + str2);
//


        // Some method is used for String

        //COMMON STRING METHODS

        //1) .length() - // find length
        //
        //2) .charAt(int index) - // find character at specific index
        //
        //3) .substring(int beginIndex, int endIndex) - // To print the specific part of String. eg - .substring(0, 5), 0 index is accept but 5 index is not.
        //
        //4) .contains(charSequence s)
        //
        //5) .equals(Object o) *
        //
        //6) .equalsIgnoreCase(String s) - ignore the Upper or lower case of string
        //
        //7) .toUpperCase(String s) - convert the all letter in string into the Capital Letter
        //
        // 8) toLowerCase(String s) - // convert the all letter in string into the small letter
        //
        // 9) .trim() - this is a return type, so always stay in variable , it cut the extra spaces in the sentence
        //
        //8) .split(String regex)
        //
        // 9) .startsWith(String prefix)
        //
        //10) .endsWith(String suffix)
        //
        //11) .valueOf(any type)  --> ye method kisi bhi data-type ko string me convert kar deta hai
        //
        //12) .toCharArray()
        //
        //13) .isEmpty() --> length is zero
        //
        //14) .isBlank() --> empty/only spaces hai string me
        //
        //15) .replace(char old char newChar)



        // USE OF ALL METHOD IN A CODE



        String name = "My name is Azeemuddin.";
        name = name.trim();

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(name.trim());
        System.out.println(name.substring(3,8));
        System.out.println(name.contains("uddin"));
        // method 11
        int num = 5432;
        String str = String.valueOf(num);
        System.out.println(num+1);
        System.out.println(str + 1);

        //
        System.out.println(name.startsWith("My"));
        System.out.println(name.endsWith("din"));

        // method 11 - .toCharArray(); - to convert the string into array
        char crr[] = name.toCharArray();
               // using for each loop to print the element of an string-array
        for(char ch:crr ) {
            System.out.println("Value of char : " + ch);
        }
        //
        // vvi method 8 : .split("kisi chiz ke aadhar pr")
        String input = "My,name,is,Ajju";
        String words[] = input.split(",");
        // using for each loop to print the element of an array
        for(String str1 : words) {
            System.out.println(str1);
        }
        //method 15 - .replace(old char, new char);

        name = name.replace('A', 'N');

        System.out.println(name);

















    }
}
