package forLoops;

public class Multiplication {

		public void printData(int num) {
			for(int i=10;i>=1;i--)
			{
				System.out.println(num + "x" +i + "=" + (num*i));
			}
		}
		public static void main(String []args) 
		{
			Multiplication obj =new Multiplication();
			obj.printData(6);
		}
}
