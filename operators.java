public class operators
{
	public static void main(String[] args) {
		int a= 44, b = 88, c = 78;
		if(a>b && a>c) {
			System.out.println("a is the greatest number");
		}
		else if(b>c && b>a) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
	}
}