public class Garbage
{
	public static void main(String args[]) 

	 {   
	    Garbage a=new Garbage();
	    Garbage b=new Garbage();
	    a=null;
	    b=null;
	    System.gc();
	    
	}
	public void finalize()
    {
		System.out.println("Garbage collected" );
	}
}

