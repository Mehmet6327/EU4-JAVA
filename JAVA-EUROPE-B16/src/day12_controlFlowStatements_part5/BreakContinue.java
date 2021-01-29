package day12_controlFlowStatements_part5;

public class BreakContinue {

	public static void main(String[] args) {

		//asagida iki islem de ayni lakin birinde break var yanlis oldugunda bitirip exit yapiyor
		// digeri continue ise devam ediyor 
		
       for(int i=1;i<=5;i++) {
	     if(i==4) {
	  	   break;
     	}
	      System.out.println(i);
      }
       
       //Bunda output olarak asagiya 1,2,3 yazar.....
       
       
		//*****CONTINUE ILE OLANI ***************//
       for(int i=1;i<=5;i++) {
  	     if(i==4) {
  	  	   continue;
       	}
  	      System.out.println(i);
        }
  		
		
		
		//bunda ise asagiya output olarak 1,2,3,5 olarak yazilir .....
       
		
		
		
	}

}
