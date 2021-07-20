import java.util.Scanner;

class NameAndMarks
{
    public static void main(String[] args)
    {
        //String[] names = {"A", "B", "C", "D", "E"};
        //int[] marks = {45, 30, 20, 50, 15};
        String[] names = new String[5];
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        //Storing the values
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Name: ");
            String name = sc.next();
            names[i] = name;

            System.out.print("Marks: ");
            String mark = sc.nextInt();
            marks[i] = mark;
        }

        //Printing out the values
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(names[i] + " " + marks[i]);
        }
    }
}