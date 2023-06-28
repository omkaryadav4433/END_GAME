package tester;

import static utils.IOutils.restoredetails;
import static utils.IOutils.storedetails;
import static utils.validations.validateallinputs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.student;

public class teststudent {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("-----------------------");
		Map<String, student> studentmap = new HashMap<>();

		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;
			System.out.println("enter filename");
			studentmap = restoredetails(sc.next(), studentmap);
			while (!exit) {
				System.out.println("1.resister  2.display  " + "3.remove whoes doc not submitted   "
						+ "4.display with specific city    " + "5.sort as per dob    "
						+ "6.display email fees less than 7000");
				System.out.println("choose option");
				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter info");
						student s = validateallinputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.next(),sc.nextDouble(), studentmap);
						studentmap.put(s.getRollno(), s);
						break;
					case 2:
						studentmap.values().stream().forEach(p -> System.out.println(p));
						break;
					case 3:
						
						
						break;
						
					case 4:
						break;
						
					case 5:
						studentmap.values().stream().sorted((p1,p2)->p1.getDob().compareTo(p2.getDob()));
						break;
					case 6:
						//studentmap.values().stream().filter(p->p.get)
						break;

					case 0:
						exit = true;
						System.out.println("enter file name");
						storedetails(sc.next(), studentmap);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}

		}

	}

}
