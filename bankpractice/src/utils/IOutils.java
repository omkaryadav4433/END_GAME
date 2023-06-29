package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.bank.bank;

public interface IOutils {
	
	public static void storedetails(String filename,Map<Integer,bank> bankMap) throws FileNotFoundException, IOException
	{
		//java app--->OOS--->FOS--->binaryfile
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(bankMap);
		}
	}
	
	public static Map<Integer,bank> restorebank(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//java app <---OIS<----FIS<----binaryfile
		try(ObjectInputStream in= new ObjectInputStream(new FileInputStream(filename)))
		{
		return (Map<Integer,bank>)in.readObject();
		}
		
	}

}
