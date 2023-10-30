package Homework.Lesson17;

public class String_Bulder {

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){

        boolean resultBoolean =true ;
        if(sb1.length() != sb2.length()){
            resultBoolean = false;
        }else {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    if (resultBoolean = false) {
                        break;
                    }
                    resultBoolean = false;

                }
            }
        }


        return resultBoolean;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("privet");
        System.out.println( ravenstvo(sb1,sb2));

    }
}
