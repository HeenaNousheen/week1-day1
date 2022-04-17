package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstnum = 0;
		int secNum = 1;
		System.out.println(firstnum);
		for (int i=1; i<range; i++)
		{
			int sum = (firstnum+secNum);
			firstnum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
		/*int sum = (firstnum+secNum);
		firstnum = secNum;
		secNum = sum;
		System.out.println(sum);*/
		
	}

}
