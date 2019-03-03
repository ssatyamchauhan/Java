import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		int j = 1;
		int b=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Input: ");
		int a = obj.nextInt();
		for(int i=a;i>0;i--){
			j=j*i;
		}
		System.out.print(j);
	}
}