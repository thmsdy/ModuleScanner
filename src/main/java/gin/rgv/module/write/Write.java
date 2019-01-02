package gin.rgv.module.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import gin.rgv.module.util.MathUtil;
import net.mightypork.rpack.utils.DesktopApi;

public class Write {
	
	public void writeFile(MathUtil mu){
		try{
			File file = new File("DraySlip.txt");
			PrintWriter cleaner = new PrintWriter(file);
			cleaner.print("");
			cleaner.close();
			PrintWriter write = new PrintWriter(file);
			write.println("DRAY SLIP -- Example Form\n");
			write.println("From Example\n");
			write.println("   Tag No.          Tag No.          Tag No.");
			write.println("---------------------------------------------");
			for(int i = 0; i < 34; i++){
				write.println(mu.col1.get(i) + "        " + mu.col2.get(i) + "        " + mu.col3.get(i));
			}
			write.close();
			mu.clearData();
			System.out.println("\nFILE INFO:\n");
			DesktopApi.edit(file);
		}catch(FileNotFoundException e){
			System.out.println("AN ERROR HAS OCCURRED. PLEASE CLOSE AND REOPEN THE PROGRAM TO TRY AGAIN");
		} 
	}
	
}
