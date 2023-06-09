package Asssignments;

public class CarBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cartype = "   mini    ";
		switch(cartype.toLowerCase().trim()) {
		case "mini" :
			System.out.println("mini car booked");
		    break;
		case "sedan" :
			System.out.println("sedan car booked");
		    break;
		case "suv" :
			System.out.println("suv car booked");
		    break;
		case "premium" :
			System.out.println("premium car booked");
		    break; 
		default :
			System.out.println("entered cartype is not avaible");
			break;

	}

}
}
