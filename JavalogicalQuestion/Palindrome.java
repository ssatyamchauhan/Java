import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your input");
		int a = obj.nextInt();
		int temp=a;
		int rev=0,rem;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==a){
			System.out.println(a+" is a palindrome Number");
		}
		else{
			System.out.println(a+" is not a palindrome Number");
		}
	}
}