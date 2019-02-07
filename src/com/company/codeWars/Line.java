package com.company.codeWars;


public class Line {

  public static String Tickets(int[] peopleInLine)
    {
        int bankNote25=0;
        int bankNote50=0;
        String answerYES = "YES";
        String answerNO = "NO";
        int arrayLenght=peopleInLine.length;
        int i;

       for (i=0; i <= peopleInLine.length-1; i++) {
           if (peopleInLine[i] == 25) {
               bankNote25 += 1;
           }else

           if (peopleInLine[i] == 50 && bankNote25 > 0) {
               bankNote25 -= 1;
               bankNote50 += 1;
           }else

           if (peopleInLine[i] == 100 && bankNote25 > 2) {
               bankNote25 -= 3;

           }else
           if (peopleInLine[i] == 100 && bankNote50 > 0 && bankNote25 > 0) {
               bankNote25 -= 1;
               bankNote50 -= 1;
           }else {
               i = arrayLenght;
               return answerNO;
           }
       }
       return answerYES;
    }

    public static void main(String[] args) {
        int[] lineTickets = new int[]{25,25,50,100,25,50,25,100,25,50,25,100,100,50};
        Line line = new Line();
        System.out.println(line.Tickets(lineTickets));

//        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
//        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }
}
