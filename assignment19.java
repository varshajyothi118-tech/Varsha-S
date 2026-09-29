public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            // This causes ArithmeticException
            int result = a / b;

            System.out.println("Result: " + result);

            // This would cause ArrayIndexOutOfBoundsException
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Index is out of bounds.");

        } finally {
            System.out.println("Finally block is always executed.");
        }

        System.out.println("Program continues...");
    }
}
