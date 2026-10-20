// class Test1 {
//     public static void main(String[] args) {
//         byte b = 127;
//         int i = 256;

//         // i = b; // here datatype is not changed only value is assinged from right to
//         // left; this
//         // is implicitly converstion (we converting byte value into int)
//         // and when we do it it explicitly it is called "casting"
//         // tough we can't do implecit or explicit convertion with all the data types
//         b = (byte) i; // converting int to bytes
//         System.out.println(i);
//     }
// }

//////////////////////////////////////////////////////
// class Test1 {
//     public static void main(String[] args) {
//         int num = 7;

//         // num++ // post - increment
//         // ++num // pre - increment

//         // these two are diff things
//         int result = num++; // first fetch value and then assign
//         // int result= ++num; // first increment then fetch the value

//         System.out.println(result);

//     }
// }

//////////////////////////////////////////////////////////// (Relational condition)

// class Test1 {
//     public static void main(String[] args) {
//         // int x = 6;
//         // int y = 5;

//         double x = 6;
//         double y = 6.0;

//         boolean result = x == y;

//         System.out.println(result);
//     }
// }

/////////////////////////////////// (logical operators) -> && (ampersand), ||, !
/////////////////////////////////// (exclamation)

class Test1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;

        double x = 11;
        double y = 23;

        boolean result = (a >= b) && (y >= x); // if in && operator if first condition is false then it we not gonna
                                               // check sencond condition which is called sort-curcit ;; lly for 'or'
                                               // condition

        System.out.println(result);
    }
}