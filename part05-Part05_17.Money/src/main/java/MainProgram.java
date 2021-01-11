
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(2, 50);
        Money b = new Money(2, 0);

        Money c = a.minus(b);

        System.out.println(a);  // 2.50e
        System.out.println(b);  // 2.00e
        System.out.println(c);  // 0.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 2.50e
        System.out.println(b);  // 2.00e
        System.out.println(c);  // 0.00e
    }
}
