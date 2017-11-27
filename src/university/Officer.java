package university;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Officer extends Employee {
	ArrayList<Officer> officers;

	/**
	 * 
	 */
	public Officer() {
	}

	public Officer(String fullname, String department, int workingTime,
			double salaryMultiplier, String position) {
		this.fullName = fullname;
		this.department = department;
		this.workingTime = workingTime;
		this.salaryMultiplier = salaryMultiplier;
		this.position = position;

		if (position.equals(("head"))) {
			this.allowance = 2000;
		} else if (position.equals(("vice head"))) {
			this.allowance = 1000;
		} else if (position.equals(("staff"))) {
			this.allowance = 500;
		} else {
			this.allowance = 0;
		}
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(int workingTime) {
		this.workingTime = workingTime;
	}

	public double getSalaryMultiplier() {
		return salaryMultiplier;
	}

	public void setSalaryMultiplier(double salaryMultiplier) {
		this.salaryMultiplier = salaryMultiplier;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	String fullName;
	String department;
	int workingTime;
	double salaryMultiplier;
	int allowance;
	String position;

	public void addOfficer() {
		Scanner scanner = new Scanner(System.in);
		officers = new ArrayList<>();
		System.out.print("So Officer: ");
		int i = scanner.nextInt();
		for (int j = 0; j < i; j++) {
			System.out.print("Officer " + (j + 1) + "\n");
			System.out.print("Full name: ");
			String name = scanner.next();
			System.out.print("Department: ");
			String department = scanner.next();
			System.out.print("Working time: ");
			int time = scanner.nextInt();
			System.out.print("Salary multiplier: ");
			double multiplier = scanner.nextDouble();
			System.out.print("Position: ");
			String position = scanner.next();
			Officer profe = new Officer(name, department, time, multiplier, position);
			officers.add(profe);
		}
	}

	public void getListOfficers() {
		for (int i = 0; i < officers.size(); i++) {
			System.out.print("\n\nFull name: " + officers.get(i).getFullName() + ""
					+ "\n" + "Department: " + officers.get(i).getDepartment() + "" + "\n"
					+ "Working time: " + officers.get(i).getWorkingTime() + "\n"
					+ "Salary multiplier: " + officers.get(i).getSalaryMultiplier()
					+ "\n" + "Position: " + officers.get(i).getPosition() + "" + "\n"
					+ "Salary: " + officers.get(i).salary() + "\n");
		}
		System.out.print("------------------------------------------------------");
	}

	void findOfficer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name of saff: ");
		String name = scanner.next();
		System.out.println("Department: ");
		String department = scanner.next();
		for (int i = 0; i < officers.size(); i++) {
			if (officers.get(i).getFullName().equals(name)
					&& officers.get(i).getDepartment().equals(department)) {
				System.out.println("Full name: " + officers.get(i).getFullName() + ""
						+ "\n" + "Department: " + officers.get(i).getDepartment() + ""
						+ "\n" + "Working time: " + officers.get(i).getWorkingTime() + "\n"
						+ "Salary multiplier: " + officers.get(i).getSalaryMultiplier()
						+ "\n" + "Position: " + officers.get(i).getPosition() + "" + "\n"
						+ "Salary: " + officers.get(i).salary());
				return;
			} else {
				System.out.println("Officer not found !");
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see university.Employee#allowance()
	 */
	@Override
	int salary() {
		return (int) (getSalaryMultiplier() * 730 + getAllowance() + getWorkingTime() * 30);
	}

}
