package homework.oct16.AgvanChakhalyan.bracechecker;

public class BraceChecker {

    Stack stack;

    
    public BraceChecker(int size) {
       stack = new Stack(size); 
    }

   
    public void parse(String stext) // stext kvercnenq u poxac kveragrenq text-in
    {
        char[] text = stext.toCharArray();  // aveli lav keghni text String-@ vorpes char[]
        char[] brack = {'(', '[', '{', ')', ']', '}'};
        char ch, temp;
        int k = 0;  // bacvats bayc voch pak pakagtseri qanak@
        int n = text.length;
        int[] open = new int[n]; // bacvatsneri indexner@

        System.out.println("now printing the bracket errors");
        for (int i = 0; i < n; i++) {
            ch = text[i]; // hat hat kardal
            for (int j = 0; j < 6; j++) {
                if (ch == brack[j]) // pakagits e
                {
                    if (j < 3) // ete bacvogh e uremn
                    {
                        stack.push(ch);
                        open[k] = i; // index@ hishel
                        k++; // bacvogneri qanak@ avelcav
                    } else // ete pagvogh e uremn
                    {
                        temp = (char) stack.pop(); // stackic hanel verjin@, u int-@ darcnel (char)
                        if (temp == 0) // stack.pop kancheluc tesanq or datark e, aysinq aranc bacelu pakvel e
                        {
                            System.out.println("error at char no " + i + " the \'" + ch + "\' is closed but not opened");
                        } // ete guzenq grel henc '' kam "" nshanner@, uremn pti egni \' kam \"
                        else // ete stack@ datark che uremn
                        {
                            if (temp != brack[j - 3]) // ete pakagtsi tesakner@ irar het chi brne
                            {
                                System.out.println("error at char no " + open[k - 1] + "," + i + " opened with \'" + temp + "\' but closed with \'" + ch + "\'");
                            } // open[k-1] verji bacvoghi index@, i henc nor vercrats@
                            k--; // arden pakagtser@ me hatm qich en
                        }
                    }
                }
            }
        }

        if (k != 0) // bacvats bayc chpakvatsner kan
        {
            System.out.println("and finally, opened but not closed brackets by index-type from last to first");
            for (int i = k - 1; i >= 0; i--) {
                temp = (char) stack.pop();
                System.out.print(open[i] + ":\'" + temp + "\'  ");
            } // hat hat vercnel open-i indexner@ u stack.pop iranc pakagtser@
            System.out.println();
        }
    }

}
