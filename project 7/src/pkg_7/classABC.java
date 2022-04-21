package pkg_7;

public class classABC 
{
  public classABC()
  {
	  System.out.println("default constructor");
  }
  public classABC(int a)
  {
	  System.out.println("one paramaterized constructor");
  }
  public classABC(int a, int b)
  {
	  System.out.println("two paramaterized constructor");
  }
  public classABC(int a, int b,int c)
  {
	  this(6,4,3,8);
	  System.out.println("three paramaterized constructor");
  }
  public classABC(int a, int b,int c,int d)
  {
	 
	  System.out.println("four paramaterized constructor");
  }
  public static void main(String[] args) 
  {
	classABC obj=new classABC(6,5,4);
	
}
}
