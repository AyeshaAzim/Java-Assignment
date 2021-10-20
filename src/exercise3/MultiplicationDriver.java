package exercise3;

//@author: Ayesha Mohammed Azim Shaikh
//Student ID: 301166757

public class MultiplicationDriver {
    public static void main(String[] args) {
        System.out.println("Product of a and b is: " + Multiplication.multiply(10, 4));

        //
        System.out.println("Product of a, b and c is: " +Multiplication.multiply( 3, 11, 5));
        System.out.println("Product of a, b and c is: " +Multiplication.multiply( 3, 10, 10));
        //
        System.out.println("Product of a, b, c and d is: " +Multiplication.multiply( 3, 11, 5, 10));
    }
}
