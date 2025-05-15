package forLoops;

public class OddNumbers {

	public int getOddNumbersSum() {
		int sum=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		return sum;	
	}
	
	public static void main(String []args) {
		OddNumbers obj=new OddNumbers();
		System.out.println("Sum of odd Numbers :"+obj.getOddNumbersSum());
		
	}
}
