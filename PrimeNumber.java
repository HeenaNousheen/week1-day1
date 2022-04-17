package week1.day1;

public class PrimeNumber {
public static void main(String[] args) {
	int input = 13;
	boolean flag = false;
	for(int i=1; i<=input/2; i++)
	{
		int remainder = input/i;
		if(remainder!=0)
			{flag = true;
			System.out.println(remainder);
		break;			}
	//else flag = false;
		//{System.out.println(remainder);}
		//System.out.println(flag+"Remainder"+remainder);
		//break;
	}
	//System.out.println(flag);
		if(flag= true)
		System.out.println("Prime");
		else 
			System.out.println("Not a Prime");
	
}
}
