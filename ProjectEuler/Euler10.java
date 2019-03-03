class Euler10{
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int sum=0;
		int temp=0;
		int i=2;
		while(i<2000000){
			temp=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					temp++;
					if(temp>0){
						break;
					}
				}
			}if(temp==0){
				sum=sum+i;
			}
			i++;
		}System.out.println(sum);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/10*10);
	}
}
