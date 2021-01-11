
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int big = number1;
        
        if (big < number2) {
            big = number2;
        }
        if (big < number3) {
            big = number3;
        }
        
        return big;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
