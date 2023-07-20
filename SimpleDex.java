//import android.util.log;

package testcases.simple;

public class SimpleDex{
	private static void transact(int x, String message){
		System.out.printf(">> Your value is %d %s", x, message);
//		Log.i(">>>> SimpleDex");
	}

	public static void main(String[] args){
		transact(85, "Degrees0");
	}
}


