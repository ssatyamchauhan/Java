class Euler7{
	public static void main(String[] args) {
		int count=0;
		int temp=0;
		for(int i=2;;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					temp++;
					if(temp>0){
						break;
					}
				}
			}if(temp==0){
				count++;
			}if(temp>0){
				temp=0;
			}if(count==10001){
				System.out.println(i);
				break;
			}
		}
	}
}