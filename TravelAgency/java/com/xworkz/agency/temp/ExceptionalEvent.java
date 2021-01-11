package com.xworkz.agency.temp;

public class ExceptionalEvent {
	private void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("invoked createExceptionalEvent");
		
		Throwable throwable = new Throwable("normal flow is disturbed");
		
		String name="panda";
		if(create) {
			throw throwable;
		}
	}
	
public void stack1(boolean create) throws Throwable{
	this.stack2(create);
}
public void stack2(boolean create) throws Throwable{
	this.stack3(create);
}
public void stack3(boolean create) throws Throwable{
	this.createExceptionalEvent(create);
}

public void exceptional() throws Exception
{
	Exception exception = new Exception();
	
	throw exception;
}

public void error() {
	Error error = new Error();
	throw error;
}
public void runTimeException() {
	RuntimeException exception = new RuntimeException();
	throw exception;
}
public void displayName(String name)
{
	if(name==null)
	{
		throw new RuntimeException("please provide name on call again");
	}
}
}

