package designPatterns16_CommandDesignPattern;

public class A10_FileSystemClient {

	public static void main(String[] args) {
		//Creating the receiver object
		A1_FileSystemReceiver fileSystemReceiver = A9_FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		//creating command and associating with receiver
		A5_OpenFileCommand openFileCommand = new A5_OpenFileCommand(fileSystemReceiver);
		//Creating invoker and associating with Command
		A8_FileInvoker fileInvoker = new A8_FileInvoker(openFileCommand);
		//perform action on invoker object
		fileInvoker.execute();
		
		A6_WriteFileCommand writeFileCommand = new A6_WriteFileCommand(fileSystemReceiver);
		fileInvoker = new A8_FileInvoker(writeFileCommand);
		fileInvoker.execute();
		
		A7_CloseFileCommand closeFileCommand = new A7_CloseFileCommand(fileSystemReceiver);
		fileInvoker = new A8_FileInvoker(closeFileCommand);
		fileInvoker.execute();
	}

}
