package oopsConcepts;

public class AccessInterface implements Interface1,Interface2 {

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("Gear Up");
		
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Starts");
		
	}

	@Override
	public void acCar() {
		// TODO Auto-generated method stub
		System.out.println("AC Car");
		
	}
	public static void main(String[] args) {
		
		AccessInterface ac= new AccessInterface();
		ac.acCar();
		ac.engine();
		ac.gear();
		
		Interface1 i1=new AccessInterface();
		i1.acCar();
		//i1.gear();  compile error
		//i1.engine();
		
		Interface2 i2= new AccessInterface();
		i2.engine();
		i2.gear();
		//i2.acCar();//method acCar is undefined for interface Interface2
		
		
		
		
		
		
	}
	

}
