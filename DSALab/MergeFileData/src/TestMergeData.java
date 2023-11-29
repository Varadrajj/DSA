import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestMergeData {

	public static void main(String[] args) {
		
		megerDataFromFile();
	}

	private static void megerDataFromFile() {
		try(BufferedReader br=new BufferedReader(new FileReader("File1.txt"));
			BufferedReader br1=new BufferedReader(new FileReader("File2.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("File3.txt"))){
			String Line1=br.readLine();
			String Line2=br1.readLine();
			int k=0;
			while(Line1!=null && Line2!=null) {
//				System.out.println(Line1.compareTo(Line2));
				if(Integer.parseInt(Line1).compareTo(Integer.parseInt(Line2))) {
					System.out.println(k++ +" Line1 "+ Line1);
					bw.write(Line1);
					bw.newLine();
					Line1=br.readLine();
				}else if(Integer.parseInt(Line1)==Integer.parseInt(Line2)) {
					bw.write(Line1);
					bw.newLine();
					Line1=br.readLine();
					bw.write(Line2);
					bw.newLine();
					Line2=br1.readLine();
				}
				else {
					System.out.println(k++ +" Line2 "+ Line2);
					bw.write(Line2);
					bw.newLine();
					Line2=br1.readLine();
				}
				
			}
			while(Line1!=null) {
				System.out.println(k++ +" Line1 "+ Line1);
				bw.write(Line1);
				bw.newLine();
				Line1=br.readLine();
			}
			while(Line2!=null) {
				System.out.println(k++ +" Line2 "+ Line2);
				bw.write(Line2);
				bw.newLine();
				Line2=br1.readLine();
			}
			//System.out.println("Files Merged Successfully!!!");
						
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
