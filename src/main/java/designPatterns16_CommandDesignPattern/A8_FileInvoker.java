package designPatterns16_CommandDesignPattern;

public class A8_FileInvoker {

	public A4_Command command;
	
	public A8_FileInvoker(A4_Command c){
		this.command=c;
	}
	
	public void execute(){
		this.command.execute();
	}
}

