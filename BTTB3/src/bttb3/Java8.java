/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttb3;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Asus
 */
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

public class Java8 {
	public static void main(String[] args) {
            //pre
		People p = new People();
		if(p.peopList!=null) {			
			System.out.println(p.peopList.get(0).getName());
		}else {
			System.out.println("Null!");
		}
                //since
                Optional<People> op = Optional.of(p);
		op.ifPresent(s ->System.out.println("Null"+ s.getName()));
	}

        
        
}
