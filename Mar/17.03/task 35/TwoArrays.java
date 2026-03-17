class TwoArrays{
	public static void main(String args[]){
		int[][] y=new int[5][2];
			y[0][1]=10;
			y[0][1]=20;
			
			y[1][0]=76;
			y[1][2]=68;
			
			y[0][0]=45;
			y[1][2]=87;
			
		
		for (int i=0;i<3;i++){
			for(int x=0;x<3;x++){
				System.out.println(y[i][x]);
			}
			System.out.println("");
		}
	}
}