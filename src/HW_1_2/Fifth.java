package HW_1_2;

public class Fifth {
    // по картинке с изолентой и вэдэшкой
    public static void main(String[] args) {
        boolean itMoves = true;
        boolean shouldItMove = false;

//        if (itMoves) {
//            if (shouldItMove)
//                System.out.println("No problem!");
//            else {
//                System.out.println("Use tape!");
//            }
//        } else
//            if (shouldItMove) {
//                System.out.println("Use WD!");
//            } else {
//                System.out.println("No problem!");
//            }

        if (itMoves && !shouldItMove) {
            System.out.println( "Use tape!");
        } else if (!itMoves && shouldItMove) {
            System.out.println("Use WD");
        } else {
            System.out.println("No problem!");
        }
    }
}