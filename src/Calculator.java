
public class Calculator {

	public Calculator(){
		
	}

	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public double div(int x,int y){
		return x/y;
	}
	public static void main(String[] args) {
		 Calculator cal = new  Calculator();

		 System.out.println(cal.add(1, 2));
		 System.out.println(cal.sub(2, 1));
		 System.out.println(cal.mul(2, 2));
		 System.out.println(cal.div(2, 2));
	}

}