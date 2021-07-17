class Functions
{
	void addNumbers() //Default method
	{
		int x = 5; int y = 10;
		System.out.println(x + y);	
	}

	void subNumbers(int x, int y) //Parameterised method
	{
		System.out.println(x - y);
	}

	public static void main(String[] args)
	{
		Functions example = new Functions();

		example.addNumbers();
		example.subNumbers(5, 10);
	}
}