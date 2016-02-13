import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileData {
	public static void main(String[] args) throws IOException {
		String file_name = "test.txt";
		try {
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			for(int i=0; i <aryLines.length;i++) {
				System.out.println(aryLines[i]);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}


}