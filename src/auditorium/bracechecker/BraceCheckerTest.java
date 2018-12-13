package auditorium.bracechecker;

public class BraceCheckerTest {

    public static void main (String[] args) {

        BraceChecker braceChecker = new BraceChecker();

        braceChecker.parse("{");
        System.out.println(braceChecker.getResultMessage());


    }

    //TODO Add test method for BraceChecker's parse method call it from main method
}
