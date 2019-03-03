class  Euler12{
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int sum=0;
		int count=0;
		int temp=0;
		for(int i=1;;i++){
			count=0;
			sum=sum+i;
			temp++;
			for(int j=1;j<=sum;j++){
				temp++;
				System.out.println(temp+"...............................");
				if(sum%j==0){
					count++;
				}
			}
			if(count==501){
				System.out.println(sum);
				break;
			}
		}long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}