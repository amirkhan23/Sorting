package sort;

import java.util.Arrays;

public class Comparator_Comparable_Example {

	public static void main(String[] args) {

		StudentBeanClass[] studentBeanClasses = new StudentBeanClass[3];
		studentBeanClasses[0] = new StudentBeanClass("Asis", 111);
		studentBeanClasses[1] = new StudentBeanClass("Asif", 113);
		studentBeanClasses[2] = new StudentBeanClass("Atif", 112);

		System.out.println("sort by Arrays class sort method by comparable interface");
		Arrays.sort(studentBeanClasses);
		for (StudentBeanClass studentBeanClass : studentBeanClasses) {
			System.out.println(studentBeanClass.toString());
		}

		System.out.println("sort by Arrays class sort method by Java.util.Comparator Interface");
		Arrays.sort(studentBeanClasses, StudentBeanClass.nameComparator);
		System.out.println("Sort by name");
		for (StudentBeanClass studentBeanClass : studentBeanClasses) {
			System.out.println(studentBeanClass.toString());
		}

		Arrays.sort(studentBeanClasses, StudentBeanClass.rollNumberComparator);
		System.out.println("Sort by RollNumber");
		for (StudentBeanClass studentBeanClass : studentBeanClasses) {
			System.out.println(studentBeanClass.toString());
		}
	}

}
