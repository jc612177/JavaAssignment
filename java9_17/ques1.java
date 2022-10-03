package java9_17;

interface PrivateMethod{
    private String reverseString(String string){
        StringBuffer sb = new StringBuffer(string);
        return sb.reverse().toString();
    }
    static String toUpperCase(String s){
        return s.toUpperCase();
    }

    static String toLowerCase(String s){
        return s.toLowerCase();
    }
}

public class ques1 {
    public static void main(String[] args) {
        System.out.println(PrivateMethod.toLowerCase("My name is Alok Pandey"));
        System.out.println(PrivateMethod.toLowerCase("HELLO THERE"));
        System.out.println(PrivateMethod.toUpperCase("My name is Alok Pandey"));
    }
}