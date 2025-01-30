public class PatternGenerator {
    public static void main(String[] args) {
        int size = 5; // Define the size of the pattern

        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                // Logic to determine what to print
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*"); // Print "*" for the border
                } else if (i == j || j == size - i - 1) {
                    System.out.print("0"); // Print "0" for the diagonals
                } else {
                    System.out.print("*"); // Print "*" for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
