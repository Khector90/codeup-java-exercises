import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args){
////        int i = 5;
////        while (i <= 15) {
////            System.out.println("i is " + i++);
////            }
//        int  i = 105;
//
//        do {
//            System.out.println(i -= 5);
//
//
//
//
//        } while(i >= -10);
//
//
//    }
//        for (int q = 5; q <= 15; q ++) {
//            System.out.println(q);
//        }
//
//          for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
        }

}
}
