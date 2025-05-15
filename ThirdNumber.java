package forLoops;

public class ThirdNumber {

	public void printNumbers() {
		for(int i=5;i<50;i=i+3) {
			System.out.print(i + " ");
		}
	}
	public static void main(String []args) {
		ThirdNumber obj=new ThirdNumber();
		obj.printNumbers();
	}
}
