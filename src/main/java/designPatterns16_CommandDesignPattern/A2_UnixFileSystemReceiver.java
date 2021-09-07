package designPatterns16_CommandDesignPattern;

public class A2_UnixFileSystemReceiver implements A1_FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Opening file in unix OS");
	}
	@Override
	public void writeFile() {
		System.out.println("Writing file in unix OS");
	}
	@Override
	public void closeFile() {
		System.out.println("Closing file in unix OS");
	}
}


