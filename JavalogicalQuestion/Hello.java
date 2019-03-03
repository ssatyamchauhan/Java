class Hello{
	public static void main(String[] args) {
		for (int i=1;i<=50;i++){
			for (int j=50;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}