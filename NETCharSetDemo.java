package J2SE;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class NETCharSetDemo {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("file.encoding"));//GBK
		String str = "我是哆啦A梦来自2112年请多多指教";
		//编码
		String encoder = URLEncoder.encode(str,"UTF-8");
		//UTF-8:%E6%88%91%E6%98%AF%E5%93%86%E5%95%A6A%E6%A2%A6%E6%9D%A5%E8%87%AA2112%E5%B9%B4%E8%AF%B7%E5%A4%9A%E5%A4%9A%E6%8C%87%E6%95%99
		String format = URLEncoder.encode(str);
		//GBK:%CE%D2%CA%C7%B6%DF%C0%B2A%C3%CE%C0%B4%D7%D42112%C4%EA%C7%EB%B6%E0%B6%E0%D6%B8%BD%CC
		System.out.println(encoder);
		//解码
		String decoder = URLDecoder.decode(encoder, "UTF-8");
		String decoder2 = URLDecoder.decode(format);
		System.out.println(decoder);
		System.out.println(decoder2);
		
	}
}
