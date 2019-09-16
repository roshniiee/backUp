package test;

public class PrepareStmtDemo {
public static void main(String asr[]) {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
