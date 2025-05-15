package forLoops;

public class PrintNumbers {
		int result;
		public void displayDivisibleNumbers()
		{
			for(int i=1;i<=100;i++) 
			{
				if(i%3==0 && i%5==0)
					System.out.print(i+" ");
			}
		}
		public static void main(String args[]) {
			PrintNumbers obj = new PrintNumbers();
			obj.displayDivisibleNumbers();
		}
			
} 
