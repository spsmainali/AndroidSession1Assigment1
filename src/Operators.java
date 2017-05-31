
public class Operators {
	public static void main(String args[]){
		int a = 20 ;
		System.out.println("Starting value of a =" + a + "\n");
		int b = 10;
		System.out.println("Starting value of b =" + b + "\n");
		b= a-- - --a;
		System.out.println("Value of b =" + b + "\n");
		int c = a--;
		System.out.println(" value of c =" + c + "\n");
		int d = a>>2;
		System.out.println("Updated value of d =" + d + "\n");
		int e = a & b;
		System.out.println("Updated value of e =" + e + "\n");
		
	}
}
