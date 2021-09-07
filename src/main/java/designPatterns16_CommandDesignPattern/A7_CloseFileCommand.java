package designPatterns16_CommandDesignPattern;

public class A7_CloseFileCommand implements A4_Command {

	private A1_FileSystemReceiver fileSystem;
	
	public A7_CloseFileCommand(A1_FileSystemReceiver fs){
		this.fileSystem=fs;
	}
	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}
}

