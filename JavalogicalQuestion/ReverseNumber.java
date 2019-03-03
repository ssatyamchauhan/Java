class ReverseNumber{
	public static void main(String[] args) {
		int rem , rev=0;
		int no = 54323;
		while(no!=0){
			rem = no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}
}