package shi;

import java.util.*;

import java.lang.*;

class Person {
	public String name="";
	public int age = 0;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class phone17 {
//	public Map dict = new HashMap(); 
//	public List<String> s = new ArrayList();
//	dict.put("a",ArrayList("a","b","v"));
//	public List<String> letterCombinations(String digits) {
//		List<String> result = new ArrayList();
//        if(digits.isEmpty()) {
//        	return result;
//        }
//        if(digits.length() == 1) {
//        	if 
//        }
//        return result;
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Person> set = new HashSet<>();
	        set.add(new Person("dp", 17));
	        set.add(new Person("dp", 17));
	        set.add(new Person("ygs", 18));
	        set.add(new Person("ygs", 18));
	        set.add(new Person("sxm", 19));
	        set.add(new Person("sxm", 19));
	        Iterator<Person> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }


	}

}
