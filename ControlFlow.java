class ControlFlow
{
	public static void main(String[] args)
	{
		for (int i=1; i < 11; i++)
		{
			if (i==5)
			{
				//break;
				continue;
			}

			System.out.println(i);
		}
	}
}