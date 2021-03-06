import java.util.*;

public class Roman {
	//get the numeric value of roman value
	//sort accordingly
	public static int roman_toNumeric(String roman){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		int len = roman.length(), result = map.get(roman.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			//to check for numbers like 40 == XL
			if (map.get(roman.charAt(i)) >= map.get(roman.charAt(i + 1)))
				result += map.get(roman.charAt(i));
			else
				result -= map.get(roman.charAt(i));
		}
		return result;
	}
	public static void order_kings(String[] kings){
		List<String[]> list = new ArrayList<>();
		List<String> res = new ArrayList<>();
		for(int i=0;i<kings.length;i++){
			int spaceIndex = kings[i].lastIndexOf(' ');
			int val = roman_toNumeric(kings[i].substring(spaceIndex+1));
			String king = kings[i].substring(0,spaceIndex);
			list.add(new String[]{Integer.toString(i),Integer.toString(val),king});
		}

		//first sort according to name
		//then according to value
		Collections.sort(list,(a,b)->{
			return a[2].equals(b[2]) ?  Integer.valueOf(a[1]) - Integer.valueOf(b[1]) : a[2].compareTo(b[2]) ;
		});
		for(String[] arr : list){
			res.add(kings[Integer.valueOf(arr[0])]);
		}

		for(String s : res){
			System.out.println(s);
		}

	}
	public static void main(String[] args) {

		String[] kings = {"David X","Mary XIII","Mary XV","Mary XX","Steven XVI","Steven XL"};
		order_kings(kings);

	}
}
