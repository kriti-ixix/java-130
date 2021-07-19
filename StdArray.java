class StdArray
{
    public static void main(String[] args)
    {
        //int[] marks = {10, 20, 30, 40, 50};
        //System.out.println(marks[2]);

        int[] marks = new int[5];
        int x = 10;
        
        for (int i = 0; i < marks.length; i++)
        {
            marks[i] = x;
            x += 10;
        }

        for (int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}