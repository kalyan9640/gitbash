package serializableAndDeSerializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class De_Ser {
public static void main(String[] args) throws Throwable {
	
	FileInputStream fin = new FileInputStream("./k.txt");
	
	
	ObjectInputStream objIn=new ObjectInputStream(fin);
		
		NFSGame user1 = (NFSGame) objIn.readObject();
		System.out.println(user1.name);
		System.out.println(user1.level);

		System.out.println(user1.score);

		System.out.println(user1.life);

}
}
