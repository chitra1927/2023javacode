package javabasics;

public class MethodInJava1 {
	
	public int getStudentMarks(String studentName)
	{
		System.out.println("getting student marks" + studentName);
		int marks = -1;
		if(studentName.equalsIgnoreCase("chitra"))
		{
			marks = 100;
		}
		else if(studentName.equalsIgnoreCase("sai"))
		{
			marks = 200;
		}
		else
		{
			System.out.println("STUDENT NOT FOUND");
		}
		
		return marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodInJava1 m1 = new MethodInJava1();
		int r = m1.getStudentMarks("chitra");
		System.out.println(r);
		
		int i = m1.getStudentMarks("sai");
		System.out.println(i);
		
		int j = m1.getStudentMarks("kaju");
		System.out.println(j);
		
		
	}

}
