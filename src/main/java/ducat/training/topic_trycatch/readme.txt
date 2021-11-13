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
	- return statement -> always taking override in case, case of catch and try have their return statements
- single catch have multiple exception class using pipe operator (|)
	- don't define the parent class with same level of child class (catch(NullPointerException | ArithmeticException | Exception e) {)
- try with resources
	- use bracket and define the autocloseable Class Objects
	- It automatically call the close method in case of last statment or exception occur
	

	