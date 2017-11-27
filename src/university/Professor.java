package university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Professor extends Employee implements Comparable {
	private String fullName;
	ArrayList<Professor> professor;

	public Professor() {
	}

	public Professor(String fullname, String faculty, double teachingtime, double salarymultiplier,
			String academicDegree) {
		this.fullName = fullname;
		this.faculty = faculty;
		this.teachingTime = teachingtime;
		this.salaryMultiplier = salarymultiplier;
		this.academicDegree = academicDegree;
		if (academicDegree.equals(("bachelor"))) {
			this.allowance = 300;
		} else if (academicDegree.equals(("master"))) {
			this.allowance = 500;
		} else if (academicDegree.equals(("doctor"))) {
			this.allowance = 1000;
		} else {
			this.allowance = 0;
		}

	}

	String getFullName() {
		return fullName;
	}

	void setFullName(String fullName) {
		this.fullName = fullName;
	}

	String getFaculty() {
		return faculty;
	}

	void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	String getAcademicDegree() {
		return academicDegree;
	}

	void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	double getTeachingTime() {
		return teachingTime;
	}

	void setTeachingTime(double teachingTime) {
		this.teachingTime = teachingTime;
	}

	double getSalaryMultiplier() {
		return salaryMultiplier;
	}

	void setSalaryMultiplier(double salaryMultiplier) {
		this.salaryMultiplier = salaryMultiplier;
	}

	private int allowance;
	private double teachingTime;
	private double salaryMultiplier;
	private String faculty;
	private String academicDegree;

	/*
	 * (non-Javadoc)
	 * 
	 * @see university.Officer#allowance()
	 */
	public void addProfessor() {
		Scanner scanner = new Scanner(System.in);
		professor = new ArrayList<>();
		System.out.print("So giao su can nhap: ");
		int i = scanner.nextInt();
		for (int j = 0; j < i; j++) {
			System.out.print("Professor " + (j + 1) + "\n");
			System.out.print("Full name: ");
			String name = scanner.next();
			System.out.print("Faculty: ");
			String faculty = scanner.next();
			System.out.print("Teaching time: ");
			double time = scanner.nextDouble();
			System.out.print("Salary multiplier: ");
			double multiplier = scanner.nextDouble();
			System.out.print("Academic Degree: ");
			String Degree = scanner.next();
			Professor profe = new Professor(name, faculty, time, multiplier, Degree);
			professor.add(profe);
		}
	}

	public void getListProfes() {
		Collections.sort(professor);
		for (int i = 0; i < professor.size(); i++) {
			System.out.print("\nFull name: " + professor.get(i).getFullName() + "" + "\n" + "Faculty: "
					+ professor.get(i).getFaculty() + "" + "\n" + "Teaching time: " + professor.get(i).getTeachingTime()
					+ "\n" + "Salary multiplier: " + professor.get(i).getSalaryMultiplier() + "\n" + "Academic Degree: "
					+ professor.get(i).getAcademicDegree() + "" + "\n" + "Salary: " + professor.get(i).salary() + "\n");
		}
		System.out.print("------------------------------------------------------");
	}

	@Override
	int salary() {
		return (int) (getSalaryMultiplier() * 730 + getAllowance() + getTeachingTime() * 45);
	}

	@Override
	public int compareTo(Object o) {
		Professor professor = (Professor) o;
		return fullName.compareTo(professor.fullName);
	}
}
