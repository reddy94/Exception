//Program for Run time exception
public class ExcepthionHandling {
	public static void main(String[] args) 
	{
		//String maths="100ds"; // when we use this statement when we compile it gives an exception saying
		//number format exception
		String maths="100";
		String physics="30";
		int wrapperMaths=Integer.parseInt(maths);
		int wrapperPhysics=Integer.parseInt(physics);
		
int totalMarks=wrapperMaths+wrapperPhysics;
System.out.println(totalMarks);
	}

}
