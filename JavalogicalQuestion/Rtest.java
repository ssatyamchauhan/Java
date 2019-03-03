// // // // import java.util.Scanner;
// // // // class Rtest{
// // // // 	public static void main(String[] args) {
// // // // 		Scanner obj=new Scanner(System.in);
// // // // 		System.out.print("Enter your Number: ");
// // // // 		int a=obj.nextInt();
// // // // 		int rem,rev=0;
// // // // 		int temp=0;
// // // // 		while(a!=0){
// // // // 			rem=a%10;
// // // // 			a=a/10;
// // // // 			temp=rem+temp;
// // // // 		}
// // // // 		System.out.println(temp);

// // // // 	}
// // // // }

// // // // import java.util.Arrays;
// // // // public class Rtest{
// // // // 	public static void main(String[] args) {
// // // // 		int[] a={12,23,32,43,34,56,57,78,87};
// // // // 		Arrays.sort(a);
// // // // 		System.out.print(Arrays.toString(a));
// // // // 	}
// // // // }

// // // import java.util.Arrays;
// // // import java.util.Collections;
// // // class Rtest{
// // // 	public static void main(String[] args) {
// // // 		Integer[] a={12,23,24,25,65,87,79,98,100};
// // // 		Arrays.sort(a,Collections.reverseOrder());
// // // 		System.out.println(Arrays.toString(a));
// // // 	}
// // // }


// // import java.util.Scanner;
// // class Rtest{
// // 	public static void main(String[] args) {
// // 		int rem,rev=0;
// // 		int temp=0;
// // 		Scanner obj=new Scanner(System.in);
// // 		System.out.print("Enter your Number: ");
// // 		int a=obj.nextInt();
// // 		while(a!=0){
// // 			rem=a%10;
// // 			a=a/10;
// // 			temp=rem+temp;
// // 		}
// // 		System.out.println("your answer: "+temp);
// // 	}
// // }
// import java.util.Scanner;
// class Rtest{
// 	public static void main(String[] args) {
// 		Scanner obj=new Scanner(System.in);
// 		System.out.print("Enter your Number: ");
// 		int a =obj.nextInt();
// 		int temp1=a;
// 		int temp2=a;
// 		for(int i=0;i<a+a;i++){
// 			temp1=temp1+1;
// 			if(temp1%2==0){
// 				System.out.println(temp1);
// 			}
// 		}
// 		for(int i=0;i<a+a;i++){
// 			temp2=temp2-1;
// 			if(temp2%2!=0){
// 				System.out.println(temp2);
// 			}
// 		}
// 	}
// }
import java.util.Scanner;
class Rtest{
	public static void main(String[] args) {
		int r=0;
		char check=' ';
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your Number: ");
		int a1=obj.nextInt();
		int a2=obj.nextInt();
		String b1=Integer.toString(a1);
		char s1=b1.charAt(r);
		String b2=Integer.toString(a2);
		int l1=b1.length();
		int l2=b2.length();
		if(l1==l2){
			for(int i=0;i<b1.length();i++){
			if(s1==b1.charAt(i)){
				r=r+1;
				check=s1;

			}
		}
		String t=Character.toString(check);
		if(t==b1){
			System.out.println("Anagram hai");
		}
		else{
			System.out.println(" Anagram nhi hai");
		}
		}
		else{
			System.out.println(" Anagram hai");
		}
	}
}













