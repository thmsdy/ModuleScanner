package gin.rgv.module.util;

import java.util.ArrayList;
import java.util.List;

public class MathUtil {

	public List<String> col1 = new ArrayList<>();
	public List<String> col2 = new ArrayList<>();
	public List<String> col3 = new ArrayList<>();

	public void getData(int code){
		for(int count = 0; count < 102; count++){
			Integer countplus = count + 1;
			String countstr = countplus.toString();
			if(count + 1 < 10){
				countstr = "  " + countstr;
			}else if(count + 1 > 9 && count + 1 < 100){
				countstr = " " + countstr;
			}
			String cc = (countstr + ": " + (Integer)(code + count)).toString();
			if(count < 34){
				col1.add(cc);
			}else if(count >= 34 && count < 68){
				col2.add(cc);
			}else if(count >= 68 && count < 100){
				col3.add(cc);
			}else if(count >= 100 && count < 102){
				col3.add("         ");
			}
		}
		System.out.println("PREVIEW");
		System.out.println("-------");
		for(int i = 0; i < 34; i++){
			System.out.println(col1.get(i) + "        " + col2.get(i) + "        " + col3.get(i));
		}
	}

	public void clearData(){
		col1.clear();
		col2.clear();
		col3.clear();
	}

}
