class Inputmax{
	public static void main(String[] args) {
		int b=0;
		int c=0;
		int[] a={1,2,3,42,5,78,98,67,56,58};
		int max=a[c];
		for(int i=0;i<5;i++){
			for(int j=1;j<a.length;j++){
				if(max<a[j]){
					max=a[j];
					c=c+1;
				}
			}
			System.out.println(max);
		}
	}
}
