class Pattern17{
	public static void main(String args[]){
		int c=0;
		for(int i=0;i<=5;i++){
			for(int j=0; j<=i; j++){
				c++;
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}