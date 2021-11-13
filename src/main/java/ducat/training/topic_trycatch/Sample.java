package ducat.training.topic_trycatch;

public class Sample {
	static String str[] = {"","test"};
	public static void main(String[] args) {
		System.out.println(test2());
	}

	private static int test2() {
		int res = 100;
		try(MyFile f = new MyFile()) {
			 f.write();
		}
		catch(Exception e) {
			System.out.println("exception "+ e);
		}
		finally {
			System.out.println("end of program");
		}
		return res;

	}

}
class MyFile implements AutoCloseable{
	public void write() {
		System.out.println("writting" + 2/1);
	}
	public void close() {
		System.out.println("MyFile.close()");
	}
}