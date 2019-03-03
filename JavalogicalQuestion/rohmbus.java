class rohmbus{
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			for(int j=20;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int a=0;a<20;a++){
			for(int b=0;b<a;b++){
				System.out.print(" ");
			}
			for(int c=20;c>a;c--){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}