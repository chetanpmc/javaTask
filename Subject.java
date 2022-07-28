//													Qustion 1 
enum Subject 
{
	DBMS, DSA,NETWORKING,OPERATINGSYSTEMS	  
}

class Main 
	{
		public static void main(String[] args) 
		{
			 System.out.println(Subject.DBMS);
		     System.out.println(Subject.DSA);
		     System.out.println(Subject.NETWORKING);
		     System.out.println(Subject.OPERATINGSYSTEMS);
		     
                            //a) How do I access the index of the value present in the enums.
		     
		     Subject arr[]= Subject.values();
	//Q1   
		     for (Subject sub : arr) 
		     {
		    	  System.out.println(sub+" = " +sub.ordinal());
		     }
	//*
	/* Q2 after hiding above and  unhiding below
	
		     Subject sub = arr[4];
		     System.out.println(sub+" = " +sub.ordinal());
	*/
		}
	}
/*  
 * 	If passed inside the ordinal
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method ordinal() in the type Enum<Subject> is not applicable for the arguments (Subject)

	at Main.main(Subject.java:22)
	
Case2
	 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at Main.main(Subject.java:26)
	
	*/


