class Assignment3
{
	public static void main(String[] args)
	{
		int[] a={99,786,10,45,999,55};
		System.out.println(findElement(a,20));
	}

	public static boolean findElement(int[] x,int y)
	{
		boolean b=false;
		for(int i:x)
		{
			if(i==y)
				b=true;
		}
		return b;
	}
}