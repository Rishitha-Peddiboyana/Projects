package com.AccessMod;

public class AccessSpecifier {
	protected void display()
	{
		System.out.println("YOUR Acessing Protector");
	}
	
	public void hello()
	{
		System.out.println("Public Method");
	}
	
	private void test()
	{
		System.out.println("Private Method");
	}
	
	void world()
	{
		System.out.println("Default Method");
	}
	public static void main(String[] args) {
		AccessSpecifier obj = new AccessSpecifier();
		obj.display();
		obj.hello();
		obj.test();
		obj.world();
	}

}
