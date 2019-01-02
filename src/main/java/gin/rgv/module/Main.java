package gin.rgv.module;

import gin.rgv.module.scanner.Scan;

public class Main {

	private static Scan scan;

	public static void main(String[] args){
		System.out.println("\nDRAY SLIP GENERATOR v2.0");
		System.out.println("------------------------\n");
		while(true){
			scan = new Scan();
			scan.newScan();
			scan = null;
		}
	}

}
