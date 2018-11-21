package auditorium.draft;

public class StringLiteralDemo {

    public static void main(String[] args) {
        String s1 = "kuku";
        String s2 = "kuku";
        System.out.println("s1 == s2 is "  + (s1 == s2));

        s1 = s1 + s2;
        System.out.println(s1 == s2);

        Integer i = 4;
        int a = i;
    }
}


