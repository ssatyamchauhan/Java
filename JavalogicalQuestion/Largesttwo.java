class Largesttwo{
	public static void main(String[] args) {
		int[] a={12,23,32,45,67,87,90,10,12};
		int temp;
		for(int i=0;i<2;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}