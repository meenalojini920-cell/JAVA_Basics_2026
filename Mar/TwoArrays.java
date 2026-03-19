class TwoArrays{
	public static void main(String args[]){
		int[][] y=new int[5][2];
			y[0][0]=10;
			y[0][1]=20;
			
			y[1][0]=76;
			y[1][1]=68;
			
			y[2][0]=45;
			y[2][1]=87;
			
		
		for (int i=0;i<=2;i++){
			for(int x=0;x<=1;x++){
				System.out.println(y[i][x]);
			}
			System.out.println("");
		}
	}
}