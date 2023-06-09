package javabasics;

public class MethodsInJava2 {
		
		public int getStudentMarks(String studentName)
		{
			System.out.println("getting student marks :" +  studentName);
			int marks = -1;
			switch(studentName.toLowerCase().trim())
			{
			
			case "chitra" :
				marks = 100;
				break;
			case "sai" :
				marks = 90;
				break;
			case "kaju":
				marks = 80;
				break;
			default:
				System.out.println("Student not found , please enter correct student name");
				break;
			}
			return marks;	
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			MethodsInJava2 m1 = new MethodsInJava2();
			int r = m1.getStudentMarks("chitra");
			System.out.println(r);
			
			int i = m1.getStudentMarks("sai");
			System.out.println(i);
			
			int j = m1.getStudentMarks("veda");
			System.out.println(j);
			
			
		}


	}


