class Euler6{
	public static void main(String[] args) {
		int sum=0;
		int sum2=0;
		for(int i=1;i<=100;i++){
			sum=sum+i;
			sum2=i*i+sum2;
		}
		sum=sum*sum;
		System.out.println(sum-sum2);
	}
}