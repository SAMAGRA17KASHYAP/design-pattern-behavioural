package org.samagra.behavioural.momento;

import java.util.logging.Logger;

public class Main {
	
	private static final Logger log = Logger.getLogger(Main.class.getName()); 

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Name1");
		emp.setAge(10);
		emp.setPhone("phone1");
		
		Caretaker caretaker = new Caretaker();
		caretaker.saveState(emp);
		
		
		emp.setName("Name2");
		caretaker.saveState(emp);
		
		log.info(emp.toString()); //NOSONAR
		caretaker.revertState(emp);
		log.info(emp.toString()); //NOSONAR
		caretaker.revertState(emp);
		log.info(emp.toString()); //NOSONAR
		
	}

}
