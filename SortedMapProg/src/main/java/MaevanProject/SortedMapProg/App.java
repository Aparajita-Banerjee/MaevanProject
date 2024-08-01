package MaevanProject.SortedMapProg;
import java.util.*;
public class App {
	public static void main(String args[]) {
		SortedMap<String,String> map=new TreeMap<>();
		map.put("India", "Project1");
		map.put("USA", "Project2");
		map.put("Europe", "Project3");
		for(Map.Entry m1:map.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
	}

}
