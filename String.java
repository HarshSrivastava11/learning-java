public class String {
    public static void main(String[] args) {
        String literalString1 = "abc";
        String literalString2 = "abc";

        String  objecString1 = new String("xyz");
        String  objecString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objecString1 == objecString2);
    }
    
}
