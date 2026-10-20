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

// class A {
//     public void display() {
//         System.out.print("Hii ");
//     }
// }

// class B extends A {
//     public void display(String s) {
//         display();
//         System.out.println(s);
//     }
// }

// class W3 {
//     public static void main(String[] args) {
//         A a = new B();
//         // ((A) a).display("Hii Ram");

//         ((B) a).display("Ram");
//     }
// }

// Java first checks whether display(String) is available through reference type
// A. It isn't, so compilation fails.
// Java doesn't reach the stage of choosing which object's implementation to
// run.
// so directly display(String ) can't be work here bz this method is fisrt
// checked in referanced class A if it doesn't get then it will though
// compilation issue

// class Bird {
//     public void fly() {
//         System.out.println("It can fly");
//     }
// }

// class Duck extends Bird {
//     public void swim() {
//         System.out.println("It can swim");
//     }
// }

// class W3 {

//     public static void doIt(Bird b) {
//         b.fly();

//         if (b instanceof Duck)
//             ((Duck) b).swim(); // bz b is object of duck but referancing object bird
//     }

//     public static void main(String[] args) {
//         Duck d = new Duck();

//         doIt(d);

//     }
// }

////////////////////////////////// if a object is refered to an object A and instance of obj B and a method is called which not present in refered obj then it though compilastion error 
/// bz compiler first check that method in referance obj it doen't get then though error 
/// what if it exist in referance obj so we will move to runtime and on runtime **override** method will be called always

// import javax.swing.text.Style;

// class Shape {
//     public void area() {
//         System.out.println("area is unknown");
//     }

//     public void volume() {
//         System.out.println("volume is unknown");
//     }
// }

// class Rectangle extends Shape {
//     public void area() {
//         System.out.println("area of reactangle");
//     }

// }

// class Cube extends Shape {
//     public void area() {
//         System.out.println("area of cube");
//     }

//     public void volume() {
//         System.out.println("volume of cube");
//     }
// }

// class W3 {
//     public static void compute(Shape s) {
//         s.area();
//         s.volume();
//     }

//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();
//         Cube c = new Cube();

//         compute(r);
//         compute(c);
//     }
// }

////////////////////////////////////

// class Student {
//     public String sid;
//     public String sname;
//     public int sclass;

//     public Student(String sid_, String sname_, int sclass_) {
//         sid = sid_;
//         sname = sname_;
//         sclass = sclass_;
//     }

//     public Student() {
//         this("ab", "cd", 0);
//     }

//     public void display() {
//         System.out.println(sid);
//         System.out.println(sname);
//     }
// }

// class W3 {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();

//     }

// }

///////////////////////////////////////

class Mammal {
    public String name;
    public int lifespan;

    public Mammal() {
        name = "Tiger";
        lifespan = 45;
    }
}

class Endangered extends Mammal {
    public boolean endanger_status;

    public Endangered() {
        endanger_status = false;
    }
}

class W3 {
    public static void main(String[] args) {
        Mammal m1 = new Endangered();
        System.out.print(m1.name);
    }
}