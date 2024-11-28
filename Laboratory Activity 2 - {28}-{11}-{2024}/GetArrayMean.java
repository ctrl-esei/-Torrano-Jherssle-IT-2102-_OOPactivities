import java.util.Scanner;

public class GetArrayMean{

    public static double ArrayMean(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number should be greater than 0.");
        } else {
            int[] numbers = new int[n];

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number: ");
                numbers[i] = scanner.nextInt();
            }

            double mean = ArrayMean(numbers);

            System.out.printf("The mean of the array is: %.2f%n", mean);
        }

        scanner.close();
    }
}