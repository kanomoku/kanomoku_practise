package designPatterns16_CommandDesignPattern;

public class A6_WriteFileCommand implements A4_Command {

	private A1_FileSystemReceiver fileSystem;
	
	public A6_WriteFileCommand(A1_FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}
}

