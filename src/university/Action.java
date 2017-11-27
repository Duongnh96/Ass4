package university;

import java.util.Scanner;
import util.Const;

/**
 * @author User
 *
 */
public class Action {
	private static Scanner scanner;

	static void menu() {
		System.out.println(Const.MENU);
	}

	public static void main(String[] args) {
		Professor professor = new Professor();
		Officer officer = new Officer();
		int num = 0;
		scanner = new Scanner(System.in);
		menu();
		while (true) {
			try {
				num = Integer.parseInt(scanner.next());
				switch (num) {
				case 1:
					officer.addOfficer();
					menu();
					break;
				case 2:
					professor.addProfessor();
					menu();
					break;
				case 3:
					officer.findOfficer();
					menu();
					break;
				case 4:
					professor.getListProfes();
					menu();
					break;
				case 5:
					return;
				default:
					System.out.print(Const.EXCEPTION);
					menu();
					break;
				}
			} catch (Exception e) {
				System.out.print(Const.EXCEPTION);
				menu();
			}
		}
	}

}
