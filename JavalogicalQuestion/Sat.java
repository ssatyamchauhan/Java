import java.util.Scanner;
class Sat{
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your 5 Number");
		for (int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		for (int i=0;i<5;i++)
			System.out.println("arr["+i+"]="+arr[i]);
	}
}