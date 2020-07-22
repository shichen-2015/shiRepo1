import java.awt.print.Printable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

/**
 * @author 作者 :师晨
 * @version 创建时间：2017-8-24 下午2:46:26
 * 类说明
 */
public class Test1 {
	
	//大厦是梵蒂冈和时代感和

        //sdjsadfsfhsdjfsdhhj

        //发的的撒发生的股份咖妃复合肥共和国
	public Test1(){
		System.out.println("********************************运行了Test1");
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("0");
		
	    list2.add("1");
	    list2.add("2");
	    
	    list2.add("3");
	    
	    list1 = list2;
	    
	    list1.add("rrr");
	    list2.add("mmm");
	    
	    //list1.addAll(list2);
	   
	    for (String string : list1) {
			System.out.println(string);
		}
	    
	    int num = 0 ;
	    for(int i=0;i<10;i++){
	    	num += num++;
	    }
	    System.out.println("num="+num);
	    
	}
	
	public static void Test2(){
		System.out.println("********************************运行了Test2");
		String s1 = "111";
		String s2 = "222";
		
		s1 = s2;
		//s2 += "333";
		s2 = "444";
	    System.out.println(s1);
	}
	
	public  void Test3(){
	    long m = (long) 0.31;
	}
	
	public static Boolean lottery2(){
	   //概率 0.2
       float  prob = (float) 0.25;
       //获取总的概率区间中的随机数
       int randomPro  = 0;
       Random random = new Random();
       randomPro =  random.nextInt((int)100);
       if(randomPro < prob * 100){
    	   return true;
       }else{
    	   return false;
       }
   }
	

	public static void  main(String[] args){
		lottery2();
		
		Test1 test1 = new Test1();
		Test2();
		
		int youNumber = 10;      
	    // 0 代表前面补充0      
	    // 4 代表长度为4      
	    // d 代表参数为正数型      
	    String str = String.format("%04d", youNumber);      
	    System.out.println(str); // 0001    
	    
	    
	    SimpleDateFormat dateFormatshort2 = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(dateFormatshort2.format(new Date()));

	}

}
