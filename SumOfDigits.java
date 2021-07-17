import java.util.Scanner;

class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0)
        {
            int remainder = num%10;
            sum += remainder; //sum = sum + remainder
            System.out.println("Sum is: " + String.valueOf(sum));
            num = num/10;
        }
    }
}

// hi this is a single line comment
/*
768

768%10 -> 8
sum + 8
768/10 -> 76

7/10 -> 0

*/