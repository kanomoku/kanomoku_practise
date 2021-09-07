package designPatterns16_CommandDesignPattern;

public class A9_FileSystemReceiverUtil {
	
	public static A1_FileSystemReceiver getUnderlyingFileSystem(){
		 String osName = System.getProperty("os.name");
		 System.out.println("Underlying OS is:"+osName);
		 if(osName.contains("Windows")){
			 return new A3_WindowsFileSystemReceiver();
		 }else{
			 return new A2_UnixFileSystemReceiver();
		 }
	}
}

