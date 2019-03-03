class Euler9{
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int sum=0;
		int tsum=0;
		int square;
		int j;
		int count =0;
		for(int i=1;;i++){
			sum=0;
			for(j=1;j<i;j++){
				sum=i*i+j*j;
				for(int l=1;l<sum;l++){
				square=l*l;
				if(square==sum){
					tsum=i+j+l;
					if(tsum==1000){
					count++;
					System.out.println(i+" * "+j+" * "+l+" = "+i*j*l);
					break;}
					}
				}
			}
			if(count>0){
				break;
			}
		}long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}


