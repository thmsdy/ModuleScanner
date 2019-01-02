package gin.rgv.module.util;

public class CharUtil {

	public static String letters = "abcdefghijklmnop";

	public static boolean hasAlpha(String str){
		str = str.toLowerCase();
		boolean check = false;
		for(char c : letters.toCharArray()){
			for(char h : str.toCharArray()){
				if(h == c){
					check = true;
				}
			}
		}
		return check;
	}

}
