
public class TryCatchException 
{
	public static void main(String[] args)
	{
		int wrapperMaths=0;
		int wrapperPhysics=0;
		int totalMarks;
	    System.out.println("1");
	    String maths="100";//String maths="100gg" if we excute using this stmt there would be slight difference in the output
		String physics="30";
		try
		{
			System.out.println("2"); 
			wrapperMaths=Integer.parseInt(maths);
			 wrapperPhysics=Integer.parseInt(physics);
	      }
			catch(NumberFormatException e)
			{
				System.out.println("3");
			}
		totalMarks=wrapperMaths+wrapperPhysics;
         System.out.println(totalMarks);
          System.out.println("4");
	}

}
