class Prime2{
	public static void main(String[] args) {
		int temp=0;
		int a=20;
		for(int i=2;i<a;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					temp=temp+1;
				}
			}if(temp==0){
				System.out.println(i);
			}else{
				temp=0;
			}
		}
	}
}