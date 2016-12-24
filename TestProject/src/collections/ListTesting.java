package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTesting {

	public static void main(String[] args) {
		List<String> fieldingPos= new ArrayList<String>();
		fieldingPos.add("wicketkeeper");
		fieldingPos.add(1, "bowler3");
		fieldingPos.add("wicketkeeper");
		List<String> offside =new ArrayList<>();
		offside.add("point");
		offside.add("cover");
		//fieldingPos.addAll(offside);
		for(String s:fieldingPos){
			System.out.println(s);
		}
		
		
	}

}
