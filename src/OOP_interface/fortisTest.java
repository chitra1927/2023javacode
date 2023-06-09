package OOP_interface;

public class fortisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fortisHopital fh = new fortisHopital();
		
		fh.cardicServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.neuroServices();
		fh.gynicServices();
		fh.generalCheckup();
		fh.labServices();
		fh.allDoctors();
		fortisHopital.print();		
		
		//top cating : parent class reference variable and child class object.
		usMedical us = new fortisHopital();
		us.cardicServices();
		us.dentalServices();
		us.emergencyServices();
		
		//down casting : parent class object and child class reference variable.
		//fortisHopital fh1 = new usMedical();
        // compiler error
		
		
		//calling static method using interface name.
		usMedical.print();
		System.out.println(usMedical.min_fee);
		
		
	}

}
