package com.mule;

public class CustomDataToEmployeeComponent /*implements Callable*/{

	
	public CustomDataToEmployeeComponent() {
		System.out.println("CustomDataToEmployeeComponent.CustomDataToEmployeeComponent()");
	}
	
	
	
/*	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message=eventContext.getMessage();
//		message.setinv
		return message;
	}
	*/
	
	public Employee debit(String payload){
		
		RuntimeException exception=new RuntimeException("Just for testing..!");
		
		
		throw exception;
		
		
		/*
		String [] data=payload.split(",");
		
		System.out.println("CustomDataToEmployeeComponent.debit()");
		
		Employee employee=
				new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Boolean.parseBoolean(data[3]));
		
		return employee;*/
		
	}
	
/*	public Employee credit(String payload){
		
		
		String [] data=payload.split(",");
		
		System.out.println("CustomDataToEmployeeComponent.credit()");
		
		Employee employee=
				new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Boolean.parseBoolean(data[3]));
		
		return employee;
		
	}*/
	
	
	
	
}
