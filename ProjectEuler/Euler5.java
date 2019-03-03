class Euler{
	public static void main(String[] args) {
		int count=0;
		for(int i=1;;i++){
			for(int j=1;j<21;j++){
				if(i%j==0){
					count++;
				}else{break;}
			}if(count==20){
				System.out.println(i);
				break;
			}count=0;
		}
	}
}