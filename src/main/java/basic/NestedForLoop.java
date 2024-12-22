package basic;

public class NestedForLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++ ) {
//            for (int j = 1; j <=5;j++  ) {
//                System.out.print(i+" ");
//}
//     System.out.println("");
//}
//    }
//}
// for(int i=1; i<=5; i++) {
//            for(int j=1; j<=i; j++) {
//            System.out.print(j +"  ");
//            }
//            System.out.println("");
//        int count = 1;
//        for(int i=1; i<=5; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print(count++ +"  ");
//            }
//            System.out.println();
//        for (int i=1; i<=5; i++) {
//            for(int j=1; j<=6-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
        for (int i =1; i <=5; i++ ) {
            for (int j = 1; j<=5; j++ ) {
                if(j>=i) {
                    System.out.print(" *");
                }
                    else{
                        System.out.print("  ");
                    }
}
            System.out.println("");
}
        }
    }
