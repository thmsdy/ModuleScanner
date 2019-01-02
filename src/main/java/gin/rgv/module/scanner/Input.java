package gin.rgv.module.scanner;

import java.util.Scanner;

import gin.rgv.module.util.CharUtil;

public class Input {

	@SuppressWarnings("resource")
	public String getInput(){
		System.out.println("Please scan the barcode on the Module Tag.\n");
		String strcode = "";
		Scanner input = new Scanner(System.in);
		String init = "";
		if(input.hasNext()){
			init = input.next();
		}
		System.out.println("\nENTERED: " + init + "\n");
		if(!init.isEmpty()){
			for(int i = 0; i < init.length() - 1; i++){
				if(i != 0){
					char ch = init.charAt(i);
					strcode += ch;
				}
			}
		}
		if(strcode.isEmpty() || CharUtil.hasAlpha(strcode)){
			return "error";
		}else{
			return strcode;
		}

	}

}
