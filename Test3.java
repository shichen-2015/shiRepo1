import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.regex.Pattern;


import sun.applet.Main;

/**
 * @author 作者 :师晨
 * @version 创建时间：2018-11-13 下午5:26:44
 * 类说明
 */
public class Test3 {
	public static final String REGEX_MOBILE = "^(0|[1-9]\\d{0,5})$";
	
	public static void main(String[] arg){
		String aString = "12345678901"	;
		System.out.println(aString.substring(5, 11));
		 
		System.out.println(Pattern.matches(REGEX_MOBILE, "12344556"));
		
		File file = new File("F:/apache-tomcat-7.0.62/webapp/prizeImg");
		if(!file.exists()){
			boolean s = file.mkdirs();
		}
		
		try {  
			URL u = new URL("http://wx.10086.cn/beijing/global/gift/bj_server/file/prizeImg/1546591114787.png");  
			InputStream in = u.openStream();  
		} catch (Exception e) {  
		   System.out.println(e);
		}  
		
		
		
	}

}
