import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author 作者 :师晨
 * @version 创建时间：2017-8-24 下午2:47:17
 * 类说明
 */
public class Test2 {
	
	public Test2(){
		System.out.println("********************************运行了Test2");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //new Test1();
		String str1 = new String ("myString"); 
		String str2 = new String ("myString"); 
	 
		System.out.println(str1 == str2);
		
		
		String a = "111";
		
		String b = a;
		
		a = "222";
		
		System.out.printf("加加加急 %s ",b);
		
		System.out.println(a.replace("2", "3")+" ;"+a);
		
		Map map = new HashMap();
		map.put("a","1111");
		map.put("b", "2222");
		
		map.put("a","133");
		
		
		if(new BigDecimal (1).compareTo(new BigDecimal("0.99").add(new BigDecimal("0.02"))) ==0 ){
			System.out.println(0);
		}else if(new BigDecimal (1).compareTo(new BigDecimal("0.99").add(new BigDecimal("0.02"))) < 0 ){
			System.out.println(1);
		}
		
	
	}
	
	public static char getRandomChar() {
        return (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
    } 
	
	public static Double  random() {
        return Math.random()*(0x9fa5 - 0x4e00 + 1);
    }
	
	class RandomHan {
	    private Random ran=new Random();
	    private final static int delta=0x9fa5-0x4e00+1;
	    public char getRandomHan() {
	        return (char) (0x4e00 + ran.nextInt(delta));
	    }
	}
}
