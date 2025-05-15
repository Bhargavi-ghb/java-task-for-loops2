package forLoops;

public class EvenNumbers {

	public int getEvenNumbersCount() {
		int count=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0) {
				count=count+1;
			}
		}
		return count;	
	}
	public static void main(String []args) {
		EvenNumbers obj= new EvenNumbers();
		System.out.println("count :"+obj.getEvenNumbersCount());
	}
}
