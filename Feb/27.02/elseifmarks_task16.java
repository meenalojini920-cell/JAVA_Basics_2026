
class elseifmarks_task16{
	public static void main(String args[]){
		int marks=74;
		
		if((marks >=75)&&(marks<=100)){
			System.out.println("grade:A");
		}else if ((marks>=65)&&(marks<=74)){
			System.out.println("grade:B");
	    }else if((marks>=55)&&(marks<=64)){
			System.out.println("grade:C");
		}else if((marks>=45)&&(marks<=54)){
			System.out.println("grade:D");
		}else if((marks>=0)&&(marks<=44)){
			System.out.println("grade:F");
		}else{
			System.out.println("invalid marks!");
		}
	}
}
	