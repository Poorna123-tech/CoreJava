package IO;

import java.io.File;
import java.io.IOException;

public class Creation {
	public static void main(String[] args) throws IOException {
		File f = new File("poornasree.txt");

		f.canWrite();
		System.out.println(f);
	}
}