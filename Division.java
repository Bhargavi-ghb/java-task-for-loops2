package forLoops;

public class Division {

		public void printData() {
			for(int i=1;i<50;i++)
			{
				if(i%4==0||i%6==0) {
					System.out.print(i+ " ");
				}
			}
		}
		public static void main(String []args) {
			Division obj=new Division();
			obj.printData();
		}
}
