import java.util.Scanner;
class Prime{
	public static void main(String[] args) {
		int c=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Number");
		int a = obj.nextInt();
		for(int b=2;b<a-1;b++){
			if(a%b==0)
				c=c+1;
		}
		if(c>0){
			System.out.println(a+" is not a prime Number");
		}
		else{
			System.out.println(a+" is a prime Number");
		}
	}
}