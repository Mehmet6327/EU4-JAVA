package day5_unary_assignment_relational_Operators;

public class unaryOperators {

	public static void main(String[] args) {
		
		
		int i1= +10;
		int i2= -100;
		int i3= -(i1+i2); // -(10-100) = > --90 = > 90
		
		System.out.println("i1= " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		boolean flag = true;
		System.out.println(!flag);
		System.out.println(!!flag);
		System.out.println(!!!flag);
		
		
		int i=10, j=5;
	   // i++; // Same as i=i+1
	    //--j; // Same as j=j-1
	    
	    System.out.println("i = " + i);
	    System.out.println("j = " + j);
	    
	    System.out.println(i++);
	    System.out.println(i);
	    
	    System.out.println(--j);
	    System.out.println(j);
	     
	    //i=11, j=4
	    int res = i++ + --j;
	    System.out.println("res = " + res );
	    
	    //res = 11+3
	    //i   = 11-12
	    //j   = 4-3
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
