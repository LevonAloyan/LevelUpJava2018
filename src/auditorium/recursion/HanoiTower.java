package auditorium.recursion;

/**
 *
 */
public class HanoiTower {

    /**
     *
     * @param number number of Discs to be moved
     * @param first  start peg on which are loaded the discs to be moved
     * @param middle auxiliary peg to help on moving
     * @param end    destination peg
     */
    public static void moveDiscs (int number, int first, int middle, int end) {
        if(number == 1){
            System.out.println(first + " -- > " + end);
        } else {
            moveDiscs(number - 1, first, end, middle);
            System.out.println(first + " -- > " + end);
            moveDiscs(number - 1, middle, first, end);
        }
//        if(number > 0){
//            moveDiscs(number - 1, I_12, end, middle);
//            System.out.println(I_12 + " -- > " + end);
//            moveDiscs(number - 1, middle, I_12, end);
//
//        }


    }

}
