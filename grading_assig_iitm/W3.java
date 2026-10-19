// class Point {
//     private int x, y;

//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
// }

// class W3 {
//     public static void main(String[] args) {
//         int x1 = 1;
//         int y1 = 2;
//         int x2 = 1;
//         int y2 = 2;

//         Point p1 = new Point(x1, y1);
//         Point p2 = new Point(x2, y2);

//         Point p3 = p1;

//         System.out.println(p1.equals(p2));
//         System.out.println(p3.equals(p1));
//     }
// }

// In Java, the default equals() method is used to compare two objects. By
// default,
// it checks whether both references point to the same object in memory, not
// whether their data is the same.

/////////////////////////// what default toString method does 

// class Point {
//     int x, y;

//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

// }

// class W3 {
//     public static void main(String[] args) {
//         Point p = new Point(1, 2);

//         System.out.println(p.toString());
//     }

// }

// 1. You cannot use this before calling super()
// In a Java constructor, super() must be called before you can use the current object's instance (this).

// So, this is invalid:
// super(name, aadhar na, this.salary(contactHour));

// However, you can call a static method or calculate a value directly before passing it to super() in newer Java versions, but you cannot use this there.
// 2. Call salary() directly
// Since salary() doesn't use any instance variables, you can make it static:
// class ContactEmployee extends Employee {
//     private static final double hourlyPay = 100.00;
//     private int contactHour;

//     public ContactEmployee(String name, long aadharna, int contactHour) {
//         super(name, aadharna, salary(contactHour));
//         this.contactHour = contactHour;
//     }

//     public static double salary(int contactHour) {
//         return contactHour * hourlyPay;
//     }
// }

//////////////////// grading q1

class A {
    public void display() {
        System.out.print("Hii ");
    }
}

class B extends A {
    public void display(String s) {
        display();
        System.out.println(s);
    }
}

class W3 {
    public static void main(String[] args) {
        A a = new B();
        a.display("ram");
    }
}