package javaCharacteristics;

public class DynamicPolymorphismMainTest {

	public static void main(String[] args) {

		GenericFile genericFile = new GenericFile();
		String message = genericFile.getFileInfo();
		System.out.println(message);

		GenericFile genericFile2 = new ImageFile();
		message = genericFile2.getFileInfo();
		System.out.println(message);

		String str = "2" + 2;
		int sum = 2 + 2;
		System.out.printf(" str = %s\n sum = %d\n", str, sum);

		GenericFile[] files = {
				new ImageFile(),
				new TextFile() };

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getFileInfo());
		}
		System.out.println("************");

		GenericFile file1 = new ImageFile();
		ImageFile imageFile = (ImageFile) file1;
		System.out.println(imageFile.getFileInfo());
		
		GenericFile file = new ImageFile();
		if (file instanceof TextFile) {
			TextFile textFile = (TextFile) file;
			System.out.println(textFile.getFileInfo());
		}
		if (file instanceof ImageFile) {
			ImageFile imageFile1 = (ImageFile) file;
			System.out.println(imageFile1.getFileInfo());
		}
	}
}
