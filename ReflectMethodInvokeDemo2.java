package J2SE;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectMethodInvokeDemo2 {
	public static void main(String[] args) throws Exception {
		Class clz = ReflectMehod3Demo.class;
		Method m =clz.getMethod("method1", int[].class);
		m.invoke(null, new int[]{1,3,5,6,7});//yes
		System.out.println("--------------------------------------");
		 m =clz.getMethod("method2", String[].class);
//		 m.invoke(null, new String[]{"sdasd","sdadas","sdadas"});
		 /*
		  * ±¨´í:java.lang.IllegalArgumentException: wrong number of arguments
		  */
		 m.invoke(null, new Object[]{new String[]{"sdasd","sdadas","sdadas"}});//yes
		 
	}
}

class ReflectMehod3Demo {
	public static void method1(int... a) {
		System.out.println("method1 is working.." + Arrays.toString(a));
	}
	public static void method2(String... s) {
		System.out.println("method2 is working.." + Arrays.toString(s));
	}
}
