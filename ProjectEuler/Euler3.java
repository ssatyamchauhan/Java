class Euler{
	public static void main(String[] args) {
		int count=0;
		for(int i=1;;i++){
			for(int j=1;j<31;j++){
				if(i%j==0){
					count++;
				}
			}if(count==30){
				System.out.println(i);
				break;
			}else{
				count=0;
			}
		}
	}
}