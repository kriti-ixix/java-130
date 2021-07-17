class Voting
{
	public static void main(String[] args)
	{
		int age = 16;

		if (age >= 18)
		{
			System.out.println("You are eligible to vote");
		}
		else if (age > 15 && age < 18)
		{
			System.out.println("You are almost eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
	}
}