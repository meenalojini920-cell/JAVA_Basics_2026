  //import java.util.scanner;
  
  class grade{
	  public static void main(String args[])
	  {
		int mark=18;
		
		if((mark>=80)&&(mark<=100)){
			System.out.println("grade : A");
		}
		else if ((mark>=65)&&(mark<=70)){
			System.out.println("grade : B");
		}
		else if((mark<=64)&&(mark>=55)){
			System.out.println("grade : C");
		}
		else if((mark<=54)&&(mark>=45)){
			System.out.println("grade : D");
		}
		else if((mark<=44)&&(mark>=30)){
			System.out.println("grade : S");
		}
		else if(mark<29){
			System.out.println("fail");
		}
		else{
			System.out.println("invalid mark!please enter mark between 0 and 100.");
		}
	  }
  }
		