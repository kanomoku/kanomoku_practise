package designPatterns18_MediatorDesignPattern;

public abstract class A1_User {
	protected A2_ChatMediator mediator;
	protected String name;
	
	public A1_User(A2_ChatMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
