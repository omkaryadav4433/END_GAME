package utils;

import java.time.LocalDate;
import java.util.Map;

import com.bank.acctype;
import com.bank.bank;

import exception.bankingException;

public class validations {
	public static final double min_bal;
	static {
		min_bal=5000;
	}
	
	public static bank validateallinputs(int accno,String name
			,double balance,String createdon,String type,Map<Integer,bank> bankMap) throws bankingException 
	{
		checkfordup(accno,bankMap);
		validatebalance(balance);
		LocalDate validdate=parsedate(createdon);
		acctype validtype=parsetype(type);
		return new bank(accno,name,balance,validdate,validtype);
	}

	private static acctype parsetype(String type) {
		
		return acctype.valueOf(type.toUpperCase());
	}

	private static LocalDate parsedate(String createdon) throws bankingException{
		
		return LocalDate.parse(createdon);
	}

	private static void validatebalance(double balance) throws bankingException{
		if(balance<min_bal)
			throw new bankingException("balance less than min balance....!!");
		
	}

	private static void checkfordup(int accno, Map<Integer, bank> bankMap) throws bankingException{
		if(bankMap.containsKey(accno))
			throw new bankingException("duplicate acc no"); 
	}

}
