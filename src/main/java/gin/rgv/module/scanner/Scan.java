package gin.rgv.module.scanner;

import gin.rgv.module.util.MathUtil;
import gin.rgv.module.write.Write;

public class Scan {

	private Input input;
	private MathUtil mu;
	private Write write;

	public void newScan(){
		input = new Input();
		String strcode = input.getInput();
		if(strcode.equals("error")){
			System.out.println("\nThis barcode is not valid.\nPlease try again.");
			input = null;
			mu = null;
			write = null;
		}else{
			int code = Integer.parseInt(strcode);
			System.out.println("\nBARCODE " + ((Integer)code).toString() + " ACCEPTED\n\n");
			mu = new MathUtil();
			mu.getData(code);
			write = new Write();
			write.writeFile(mu);
			System.out.println("\n\n-----------------\n");
			input = null;
			mu = null;
			write = null;
			System.out.println("TO PRINT: Click FILE --> PRINT ---> Click the printer with \"ENVY\" in the name --> Set the box in the corner to 2 --> Click PRINT");
		}
		System.out.println("\n\n-----------------\nRestarting program...\n\n");
	}

}
