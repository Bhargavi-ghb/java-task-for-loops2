package forLoops;

public class Numbers {

	public void displayNumber() {
		for(int i=1;i<=100;i++) {
			if(i%4!=0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String []args) {
		Numbers obj =new Numbers();
		obj.displayNumber();
	}
}
