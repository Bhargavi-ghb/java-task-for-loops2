package forLoops;

public class Cubes {
	public void displayCubes() {
		int result=1;
		for(int i=1;i<=10;i++) {
			result=i*i*i;
			System.out.println(i+"^3 = "+result);
		}
	}
	public static void main(String []args) {
		Cubes obj=new Cubes();
		obj.displayCubes();
	}
}
