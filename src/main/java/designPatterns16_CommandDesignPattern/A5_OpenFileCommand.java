package designPatterns16_CommandDesignPattern;

public class A5_OpenFileCommand implements A4_Command {

	private A1_FileSystemReceiver fileSystem;
	
	public A5_OpenFileCommand(A1_FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}
}

