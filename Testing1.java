package com.sap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	HashMap<String,Integer> inputValues=new HashMap();
		HashMap<String,Integer> inputValues1=new HashMap();
		HashMap<String,Integer> temp=new HashMap();
		
		inputValues.put("Thiyagu", 10);
		inputValues.put("Ashok", 20);
		
		inputValues1.put("Thiyagu", 10);
		inputValues1.put("Sean", 40);
		
		
		for(String employee:inputValues.keySet()){
			temp.put(employee, inputValues.get(employee));
		}
		
		for(String employee1:inputValues1.keySet()){
			temp.put(employee1, inputValues1.get(employee1));
		}
		
		System.out.println(temp);*/
		
		
		Employee a=new Employee();
		a.setName("Thiyagu");
		a.setEmployeeId(12);
		
		
		Employee a1=new Employee();
		a1.setName("Ashok");
		a1.setEmployeeId(20);
		
		
		Employee a2=new Employee();
		a2.setName("Thiyagu");
		a2.setEmployeeId(12);
		
		
		Employee a3=new Employee();
		a3.setName("Sean");
		a3.setEmployeeId(42);
		
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		employeeList.add(a);
		employeeList.add(a1);
		employeeList.add(a2);
		employeeList.add(a3);
		
		employeeList.forEach(i->{
			System.out.println(i.getName()+","+i.getEmployeeId());
		});
		
		
	

	}

}
