package tester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.validations.validateallinputs;
import com.bank.bank;
import static utils.IOutils.restorebank;
import static utils.IOutils.storedetails;
public class testbank {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		try(Scanner sc=new Scanner(System.in)){
		Map<Integer,bank> bankMap=new HashMap<>();
		boolean exit=false;
		System.out.println("enter file name");
		System.out.println(restorebank(sc.next()));
		while(!exit)
		{
			System.out.println("1.add acc  2.display acc 3.");
			System.out.println("enter choice plz");
			try {
			
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("enter accno,name,balance,createdate,type");
				bank bankaccount=validateallinputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), bankMap);
				bankMap.put(bankaccount.getAccno(), bankaccount);
				System.out.println("account added successfully in bank");
				
				break;
				
			case 2:
				for(bank b: bankMap.values())
					System.out.println(b);
				break;
				
			case 3:
				
				
				
				break;
				
			case 4:
				break;
			
			case 0:
				exit=true;
				System.out.println("enter file name");
				storedetails(sc.nextLine(), bankMap);
				break;
			}
			}catch(Exception e)
			{
				e.printStackTrace();
				sc.nextLine();
			}
		}
		
		}
	}

}
