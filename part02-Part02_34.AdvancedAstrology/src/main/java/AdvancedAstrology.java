
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.printf("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.printf(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        // print spaces
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i + 1; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        // tree part
        for (int i = 0; i < height; i++) {
            // left side and center
            for (int j = height; j > i + 1; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("*");
            }
            //right side
            for (int m = 0; m < i; m++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        
        // trunk
        if (height < 3) {
            System.out.printf("*");
            System.out.printf("*");
            System.out.printf("*");
            System.out.println("");
            System.out.printf("*");
            System.out.printf("*");
            System.out.printf("*");
        } else {
            // print spaces
            int spaces = ((height * 2 - 1) - 3) / 2;
            // print trunk
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }
                System.out.printf("*");
                System.out.printf("*");
                System.out.printf("*");
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
