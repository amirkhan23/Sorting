package sort;

import java.util.Comparator;

public class StudentBeanClass implements Comparable<StudentBeanClass> {

	private String name;
	private int rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public StudentBeanClass(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "[Name=" + this.name + ", rollNumber=" + this.rollNumber + "]";
	}

	public int compareTo(StudentBeanClass sbc) {

		return (this.rollNumber - sbc.rollNumber);
	}

	public static Comparator<StudentBeanClass> nameComparator = new Comparator<StudentBeanClass>() {

		public int compare(StudentBeanClass o1, StudentBeanClass o2) {

			return o1.getName().compareTo(o2.getName());
		}
	};

	public static Comparator<StudentBeanClass> rollNumberComparator = new Comparator<StudentBeanClass>() {

		public int compare(StudentBeanClass o1, StudentBeanClass o2) {

			return o1.getRollNumber() - o2.getRollNumber();
		}
	};

}
