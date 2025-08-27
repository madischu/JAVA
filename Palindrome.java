public class Palindrome {
    // Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        // Prompt the user to enter an integer
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Display whether the integer is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}