package String_Que;

public class Replace_all_occurance_with_space {


    static void main(String[] args) {
        String s = "LIELIELIEILIEAMLIECOOLLIE";
        String target = "LIE";
        // "LIE" ko space se replace karna
        String result = s.replace("LIE", " ");
        System.out.println(result);
    }



}
