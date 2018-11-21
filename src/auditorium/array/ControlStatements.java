package auditorium.array;


import auditorium.draft.Draft;

public class ControlStatements {


    public static void main(String[] args) {
        Draft.stat = 2;
        int grade = 12;

        //        switch (grade) {
//
//            case 1: case 2:
//            case 3: case 4:
//            case 5: case 6: case 7:
//                System.out.println("Rejected");
//                break;
//            case 8:  case 9:
//            case 10: case 11:
//                System.out.println("Passed");
//                break;
//            case 12:
//            case 13:
//            case 14:
//            case 15:
//                System.out.println("Good");
//                break;
//
//            default:
//                System.out.println("Excellent");
//
//
//        }

    }

    public static String getGrade (int grade, int maximumGrade){

        return null;

    }

    public static String getGrade (int grade){
        if (grade < 8) {
            return "Rejected";
        } else if (grade < 12) {
            return "Passed";
        } else if (grade < 16) {
            return "Good";
        } else {
            return "Excellent";
        }


    }


}
