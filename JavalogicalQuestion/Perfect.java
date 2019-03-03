import java.util.Scanner;
class Perfect{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your Number:");
		int a=obj.nextInt();
		int b=0;
		for(int i=a-1;i>0;i--){
			if(a%i==0){
				b=b+i;
			}
		}
		if(b==a){
			System.out.println("Perfect Number hai");
		}
		else{
			System.out.println("Perfect number nhi hai");
		}
	}
}