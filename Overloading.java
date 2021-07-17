class Overloading
{
	void printName(String fName, String lName)
	{
		System.out.println(fName + " " + lName);
	}

	void printName(String fName, String mName, String lName)
	{
		System.out.println(fName + " " + mName + " " + lName);
	}

	public static void main(String[] args)
	{
		Overloading x = new Overloading();
		x.printName("First", "Last");	
		x.printName("First", "Middle", "Last");
	}

}