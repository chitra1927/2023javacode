package OOP_interface;

public class fortisHopital extends apoloHospital implements usMedical , ukMedical , IndiaMedical{

	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		System.out.println("EYE nose services");
		
	}

	@Override
	public void labServices() {
		// TODO Auto-generated method stub
		
		System.out.println("lab services");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("neuro services");
	}

	@Override
	public void gynicServices() {
		// TODO Auto-generated method stub
		
		System.out.println("gynic services");
	}
		
	

	@Override
	public void cardicServices() {
		// TODO Auto-generated method stub
		
		System.out.println("cardic services");
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
		System.out.println("dental services");
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("Emergency services");
		
	}
	
	public void generalCheckup() {
		System.out.println("GENRAL CHECK UPS AT FORTIS HOSPITAL");
	}
	
	@Override
    public void medicalTraining() {
		
		System.out.println("training at fortis hospital");
	}
	
	// we cant override static method
	// method hiding : having same method in parent and also child class.
    
	
    public static void print() {
		
		System.out.println("print all the fortis hospital services");
	}
    
    @Override
    public void allDoctors() {
		
		System.out.println("print all the doctors in fortis hospital");
	}
	

}
