/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the widest part

        // Print the upper half of the diamond
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
