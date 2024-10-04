import java.util.Scanner;

public class SumOfBinaryDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') { 
                sum += 1;
            }
        }

        System.out.println("Sum of 1's in the binary number is: " + sum);

        scanner.close(); 
    }
}
