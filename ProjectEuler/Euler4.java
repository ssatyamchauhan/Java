import java.util.TreeSet;
class Euler4{
	public static void main(String[] args) {
		int count=0;
		int str=0;
		int str2=0;
		String sat="";
		TreeSet<Integer> mytree = new TreeSet<>();
		for(int i=999;i>100;i--){
			for(int j=999;j>100;j--){
				int mul=i*j;
				str=mul;
				int rev=0;
				while(mul>0){
					int rem=mul%10;
					rev=rev*10+rem;
					mul=mul/10; 
				}if(rev==str){
					if(str>str2){
						str2=str;
					}mytree.add(str2);
			}
				}
		}System.out.println(mytree);
	} 
}