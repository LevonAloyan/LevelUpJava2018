package homework.oct24.gor_gevorgyan.bracechecker;


public class BraceCheckerTest {

    public static void main(String[] args) {
        parseTest();
    }

    public static void parseTest() {
        BraceChecker braceChecker = new BraceChecker();
        Stack stack = new Stack();
        String inputData = "agdh(";
        int i = 0;
        braceChecker.parse(inputData);

        if (braceChecker.getResultMessage() != "no error") {
            System.err.println("parseTest is failed for case when '(' is opened as last symbol ");
        } else {

            System.out.println("ok");
        }

        inputData = "(sdasd";
        if (braceChecker.getResultMessage() != "no error") { //TODO: clarify why we have a warning related to '!='
            System.err.println("parseTest is failed for case when '(' is opened as first symbol but not closed");
        } else {
            System.out.println("ok");
        }

        inputData = "sda(sd";
        if (braceChecker.getResultMessage() != "no error") {
            System.err.println("parseTest is failed for case when '(' is opened  but not closed");
        } else {
            System.out.println("ok");
        }
        inputData = "{sdasd";

        if (braceChecker.getResultMessage() != "no error") {
            System.err.println("parseTest is failed for case when '{' is opened as first symbol ");
        } else {

            System.out.println("ok");
        }

    }

}