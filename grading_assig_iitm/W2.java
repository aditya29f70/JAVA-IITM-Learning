// public class Print {
//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3 };
//         int[] b = { 1, 2, 3 };
//         System.out.println(a == b);
//     }
// }

//////////////////////////

// public class Fclass {

//     public static void main(String[] args) {
//         int a = 22, b = 7;
//         double c = a / b;
//         System.out.print(c + " ");

//         c = (double) (a / b);
//         System.out.print(c + " ");

//         c = (double) a / b;
//         System.out.print(c);
//     }
// }

////////////////////////////////////////////////////////////////////

// public class Sclass {
//     public static void main(String[] args) {
//         boolean e = TRUE;

//         System.out.print(e);
//     }
// }

// ///////////////////////////////////////////////////////////////////////

// class Point {
//     private int x;
//     private int y;

//     public Point(int x, int z) {
//         x = x; // this.x = x; correct way to do this
//         y = z;
//     }

//     public void printPoint() {
//         System.out.print("(" + x + "," + y + ")");
//     }
// }

// class W2 {
//     public static void main(String[] args) {
//         Point p = new Point(10, 20);
//         p.printPoint();
//     }
// }

//////////////////////////////////////////////////////////

// class W1 {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i > 0) {
//             System.out.print(i);
//         }
//         do {
//             System.out.print(i);
//         } while (i > 0);
//     }
// }

//////////////////////////////////////////////////////////

import javax.swing.text.Style;

class W1 {
    public static void main(String[] args) {
        System.out.println(10 + 20 + "IIT BS");
        System.out.println("IIT BS" + 10 + 20);
    }
}