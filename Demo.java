package forLoops;

public class Demo {
	
		public int displayNumber() {
			int count=0;
			for(int i=1;i<=100;i++)
			{
				if(i%9==0) {
					System.out.print(i + " ");
					count=count+1;
				}
			}
			return count;
		}
		public static void main(String []args) {
			Demo obj=new Demo();
			System.out.println("\ncount :"+obj.displayNumber());
		}
}
