import java.util.Scanner;

class GettingGreater {
    public static void main(String[] args)
    {
        Scanner cont = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char num = cont.next().charAt(0);
        System.out.print("Enter second character: ");
        char num1 = cont.next().charAt(0);
        
        int asciiValue = (int) num;
        int asciivalue = (int) num1;
        
        
        
        System.out.println("------------------------------------------");
        if (num > num1)
        {
            System.out.println("The character with greater value is: " +num);
        }
        else 
        {
           System.out.println("The character with greater value is: " +num1); 
        }
        System.out.println("------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println("a : " +asciiValue);
        System.out.println("b : " +asciivalue);
        
    }
}