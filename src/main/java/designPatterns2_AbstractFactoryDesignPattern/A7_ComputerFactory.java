package designPatterns2_AbstractFactoryDesignPattern;

public class A7_ComputerFactory {

	public static A1_Computer getComputer(A4_ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}


