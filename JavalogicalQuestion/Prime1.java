class Prime1{
	public static void main(String[] args) {
		int temp=0;
		int sat =0;
		for(int i =2;i<=1000;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					temp=temp+1;
				}
			}
			if(temp==0){
				sat = sat+1;
				System.out.println(i+" ");
			}
			else{
				temp=0;
			}
		}
		System.out.println();
		System.out.println("total prime number in between 1 to 1000 is "+sat);
	}
}
