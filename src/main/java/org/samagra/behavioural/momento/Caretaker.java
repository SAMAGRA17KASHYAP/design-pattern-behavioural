package org.samagra.behavioural.momento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {

	private Deque<EmployeeMomento> employeeHistory = new ArrayDeque<>();
	
	public void saveState(Employee emp) {
		employeeHistory.push(emp.save());
	}
	
	public void revertState(Employee emp) {
		emp.revert(employeeHistory.pop());
	}
	
	
}
