package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.student;

public interface IOutils {
	
	public static void storedetails(String filename,Map<String,student> studentmap) throws FileNotFoundException, IOException{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
			
			out.writeObject(studentmap);
		}
	}
	
	public static Map<String,student> restoredetails(String filename,Map<String,student> studentmap) throws FileNotFoundException, IOException {
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			return (Map<String,student>) in.readObject();
		}catch (Exception e)
		{
			return studentmap;
		}
		
	}

}
