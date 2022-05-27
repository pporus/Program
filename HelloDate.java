import java.util.*;
public class HelloDate
{
	public static void main(String a[])
	{
		System.out.println("Welcome to Jenkins "+new Date());
		print(33);
	}

	public static void print(int x)
	{
	for(int i=1;i<=10;i++)
	System.out.print(x+"x"+i+"=>"+x*i);
	}
}