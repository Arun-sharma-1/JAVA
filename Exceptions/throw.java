package Exceptions;

class Test {
    public static void main(String[] args) 
	{
	    
	  try {
	      int res  = area(-10 ,2);
          System.out.println(res);
	  } catch(Exception e) {
	      System.out.println(e);
	  }
	   
	   
    
	}
	
	 static int  area(int a ,int b) throws Exception
	 {     
	     if(a<0 || b<0)
	       throw new Exception("perimeters can not be negative ");
             return a * b;
                
    }
}
