import java.util.Scanner;

public class MultiplicationTable 
    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int Maxnum = scanner.nextInt();

        if (Maxnum <= 0) {
            System.out.println("Please input a number that is greater than 0.");
        } else {
            int[][] mult = new int[Maxnum][Maxnum];

            for (int i = 1; i <= Maxnum; i++) {
                for (int j = 1; j <= Maxnum; j++) {
                    mult[i - 1][j - 1] = i * j;
                }
            }

            System.out.println("Multiplication Table:");
            for (int i = 0; i < Maxnum; i++) {
                for (int j = 0; j < Maxnum; j++) {
                    System.out.printf("%4d", mult[i][j]);
                }
                System.out.println();
            }
        }

        scanner.close();
    }
    }
