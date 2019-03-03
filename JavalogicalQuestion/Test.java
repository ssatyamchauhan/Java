// // // // // // // import java.util.Scanner;
// // // // // // // class Test{
// // // // // // // 	public static void main(String[] args) {
// // // // // // // 		Scanner obj=new Scanner(System.in);
// // // // // // // 		System.out.print("Enter your Number: ");
// // // // // // // 		int a =obj.nextInt();
// // // // // // // 		int temp=a;
// // // // // // // 		int rev=0;
// // // // // // // 		int rem;
// // // // // // // 		while(a!=0){
// // // // // // // 			rem=a%10;
// // // // // // // 			a=a/10;
// // // // // // // 			rev=rev*10+rem;
// // // // // // // 		}
// // // // // // // 		if(temp==rev){
// // // // // // // 			System.out.println(temp+" is a Palindrome Number");
// // // // // // // 		}
// // // // // // // 		else{
// // // // // // // 			System.out.println(temp+" is not a Palindrome Number");
// // // // // // // 		}
// // // // // // // 	}
// // // // // // // }

// // // // // // import java.util.Scanner;
// // // // // // class Test{
// // // // // // 	public static void main(String[] args) {
// // // // // // 		long fact=1;
// // // // // // 		Scanner obj=new Scanner(System.in);
// // // // // // 		System.out.print("Enter your Number: ");
// // // // // // 		Long a =obj.nextLong();
// // // // // // 		for(int i=1;i<a+1;i++){
// // // // // // 			fact=fact*i;
// // // // // // 		}
// // // // // // 		System.out.println(fact);
// // // // // // 	}
// // // // // // }

// // // // // import java.util.Scanner;
// // // // // class Test{
// // // // // 	public static void main(String[] args) {
// // // // // 		Scanner obj=new Scanner(System.in);
// // // // // 		System.out.print("Enter your Number: ");
// // // // // 		int a=obj.nextInt();
// // // // // 		String s=" ";
// // // // // 		String s2=" ";
// // // // // 		for(int i=a+1;i<a+7;i++){
// // // // // 			if(i%2==0){
// // // // // 				s=s+i+" ";
// // // // // 			}
// // // // // 		}
// // // // // 		System.out.println(s+" are three even numbers");
// // // // // 		for(int j=a-1;j>a-7;j--){
// // // // // 			if(j%2!=0){
// // // // // 				s2=s2+j+" ";
// // // // // 			}
// // // // // 		}
// // // // // 		System.out.println(s2+" are odd numbers");
// // // // // 	}
// // // // // }
// // // // class Test{
// // // // 	public static void main(String[] args) {
// // // // 		int a=100;
// // // // 		int i=1;
// // // // 		while(i<a){
// // // // 			if(i%3==0 && i%5==0){
// // // // 				System.out.println("fizzbuzz");
// // // // 			}
// // // // 			else if(i%3==0){
// // // // 				System.out.println("fizz");
// // // // 			}
// // // // 			else if(i%5==0){
// // // // 				System.out.println("buzz");
// // // // 			}
// // // // 			else{
// // // // 				System.out.println(i);
// // // // 			}
// // // // 			i=i+1;
// // // // 		}
// // // // 	}
// // // // }

// // // import java.util.Scanner;
// // // class Test{
// // // 	public static void main(String[] args) {
// // // 		Scanner obj=new Scanner(System.in);
// // // 		System.out.print("Enter your Number: ");
// // // 		int a =obj.nextInt();
// // // 		int temp=a;
// // // 		int temp2=a;
// // // 		String s1=" ";
// // // 		String s2=" ";
// // // 		for(int i=1;i<=a+a;i++){
// // // 			temp=temp+1;
// // // 			if(temp%2==0)
// // // 					{
// // // 					s1=s1+temp+" ";
// // // 				}
// // // 			temp2=temp2-1;	
// // // 			if(temp2%2!=0)
// // // 				{
// // // 					s2=s2+temp2+" ";
// // // 				}
// // // 		}
// // // 		System.out.println(s1+" are even numbers");
// // // 		System.out.println(s2+" are odd numbers");
// // // 	}
// // // }

// // import java.util.Scanner;
// // class Test{
// // 	public static void main(String[] args) {
// // 		Scanner obj=new Scanner(System.in);
// // 		System.out.print("Enter your Name: ");
// // 		String a1=obj.next();
// // 		for(int i=0;i<a1.length();i++){
// // 			System.out.println(a1.charAt(i));
// // 		}

// // 	}
// // }

// import java.util.Scanner;
// class Test {
// 	public static void main(String[] args) {
// 		Scanner variable = new Scanner(System.in);

// 		String name1 = variable.nextLine();
		

// 		for (int i = 0; i < name1.length(); i ++){
// 			char n1 = name1.charAt(i);
// 			System.out.println(n1);
// 		}
// 	}
// }
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your input: ");
		String input=obj.nextLine();
		String temp="";
		for(int i=input.length()-1;i>=0;i--){
			char s=input.charAt(i);
			String k=Character.toString(s);
			temp=temp+k;
		}
		if(temp.equals(input)){
			System.out.println("Palindrome hai");
		}else{
			System.out.println("Palindrome nhi hai");
		}
	}
}













