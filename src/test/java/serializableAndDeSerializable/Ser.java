package serializableAndDeSerializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NFSGame implements Serializable{

	String name;
	int level;
	long score;
	int life;
	public NFSGame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
}

public class Ser{
	
	public static void main(String[] args) throws Throwable {
		
		NFSGame user1=new NFSGame("kalyan", 15, 35000, 1);
	
		FileOutputStream fOut=new FileOutputStream("./k.txt");
		
		ObjectOutputStream objOut=new ObjectOutputStream(fOut);
		
		objOut.writeObject(user1);
		System.out.println("done");
		
		fOut.close();
		objOut.close();
	}
}