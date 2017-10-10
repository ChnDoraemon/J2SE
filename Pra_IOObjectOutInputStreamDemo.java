package J2SE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pra_IOObjectOutInputStreamDemo implements Serializable{
	public static void main(String[] args) throws Exception {
		File f = new File("file/object");
		writeOBJ(f);
		readOBJ(f);
	}
	private static void readOBJ(File f) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		Pra_IOObjectOutInputStreamDemo_User obj = (Pra_IOObjectOutInputStreamDemo_User)in.readObject();
		System.out.println(obj.toString());
		in.close();
		
	}
	private static void writeOBJ(File f) throws Exception {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(new Pra_IOObjectOutInputStreamDemo().new Pra_IOObjectOutInputStreamDemo_User(
				"´ä»¨", 18, false));
		out.close();
	}
	class Pra_IOObjectOutInputStreamDemo_User implements Serializable {
		/**
				 * 
				 */
		private static final long serialVersionUID = 1L;
		String name;
		int age;
		boolean married;
		public Pra_IOObjectOutInputStreamDemo_User(String name, int age,
				boolean married) {
			super();
			this.name = name;
			this.age = age;
			this.married = married;
		}
		@Override
		public String toString() {
			return "Pra_IOObjectOutInputStreamDemo_User [name=" + name
					+ ", age=" + age + ", married=" + married + "]";
		}
		
	}
}
