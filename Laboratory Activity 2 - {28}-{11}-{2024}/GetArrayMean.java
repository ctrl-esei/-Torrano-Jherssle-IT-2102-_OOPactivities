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
        int num1 = scanner.nextInt();

        if (num1 <= 0) {
            System.out.println("The number should be greater than 0.");
        } else {
            int[] number = new int[num1];

            System.out.println("Enter " + num1 + " integers:");
            for (int i = 0; i < num1; i++) {
                System.out.print("Enter number: ");
                number [i] = scanner.nextInt();
            }

            double mean = ArrayMean(number);

            System.out.printf("The mean of the array is: %.2f%n", mean);
        }

        scanner.close();
    }
}