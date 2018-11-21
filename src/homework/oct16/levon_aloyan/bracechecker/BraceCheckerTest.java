package homework.oct16.levon_aloyan.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text="{helloo( world}";
        BraceChecker braceChecker=new BraceChecker(text);
        braceChecker.parse();
    }
}
