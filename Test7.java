
public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		method1("1");
		method2("2");
		//不用就双斜杠注释掉
		method3(args[0]);
	}
	
	private static void  method1(String a1){
		System.out.println("执行方法"+a1);
	}
	
	private static void  method2(String a2){
		System.out.println("执行方法"+a2);
	}
	
	private static void  method3(String a3){
		System.out.println("执行方法"+a3);
	}

}
