trycatchfinally
try- empty trycatch block are valid
try {
			
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("end of program");
		}
- try can have multiple catch block
	- catch block should be last , in case of handle class is parent\
- trywith finally also valid
- finally block always executed in last 
	- system.exit(), in this case finally block not executed
	- return statement -> always finally used return statments.
- single catch have multiple exception class using pipe operator (|)
	- don't define the parent class with same level of child class (catch(NullPointerException | ArithmeticException | Exception e) {)
- try with resources
	- use bracket try() and implements autocloseable interface
	- It automatically call the close() method in case of last statment or exception occur in try block
- checked and unchecked exception
	Unchecked - No need to put in try and catch
	Checked - Must be handle it with try and catch 
	throws ExceptionClaass -  defined on the top of method to pass the exception to calling parent.
	throw new Exception()-  class object
	Overriden method should be have child exception class
	
	
class parent{
	void check() throws Exception{
		
	}
}
class child extends parent{
	public void check() throws NullPointerException{
		
	}
	
	Finalize method : override from Object class
	- use as destructor in class
	- It is called during the time of GC running
	- we can request to GC for run by using - Runtime.getRuntime().gc(); 
	 
	
	protected void finalize() throws Throwable {

	

	