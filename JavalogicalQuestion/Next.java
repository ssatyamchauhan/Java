class Next{
	public static void main(String[] args) {
		String a="Satyam Singh";
		for(int i=0;i<a.length();i++){
			char b=a.charAt(i);
			if(b==' '){
				String array[]=a.split(" ");
				for(String temp:array){
					System.out.println(temp);
				}
			}
		}
	}
}