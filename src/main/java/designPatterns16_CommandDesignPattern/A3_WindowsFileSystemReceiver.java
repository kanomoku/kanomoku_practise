package designPatterns16_CommandDesignPattern;

public class A3_WindowsFileSystemReceiver implements A1_FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Opening file in Windows OS");
	}
	@Override
	public void writeFile() {
		System.out.println("Writing file in Windows OS");
	}
	@Override
	public void closeFile() {
		System.out.println("Closing file in Windows OS");
	}
}
