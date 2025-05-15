package forLoops;

public class MultipleNumbers {
	
	public void printNumbers(int num) {
		int result=0;
		for(int i=1;i<=10;i++) {
			result = result + num;
			//result = num*i;
			System.out.print(result + " ");
		}
	}
	public static void main(String []args) {
		MultipleNumbers obj= new MultipleNumbers();
		obj.printNumbers(7);
	}
	

}
