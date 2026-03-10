class user_input1{
	public static void main(String args[])
	{
		Scanner scan = new (System.in);
		String name = "";
		System.out.print("please enter your name :");
		name = scan.next();
		System.out.print("your name is :" + name);
		
		System.out.println("**************");
		
		int marks=0;
		System.out.print("please enter your mark :");
		marks = scan.nextInt();
		System.out.println("your marks is :" + marks);
	}
}
