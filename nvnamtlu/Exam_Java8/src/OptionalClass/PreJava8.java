package OptionalClass;

import java.util.List;

class People {
	String name;
	
	List<People> peopList = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class PreJava8 {
	public static void main(String[] args) {
		People p = new People();
		if(p.peopList!=null) {			
			System.out.println(p.peopList.get(0).getName());
		}else {
			System.out.println("list is null!");
		}
	}
}
