package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	
	@BeforeClass
	public static void setup() throws ParseException {
		
		course.add(new Course(new UUID(636423, 23462346), "CHEM101", 3, eMajor.CHEM));
		course.add(new Course(new UUID(569543, 25559536), "ECON101", 4, eMajor.BUSINESS));
		course.add(new Course(new UUID(047563, 2048573), "PHYS301", 2, eMajor.PHYSICS));
		
		semesters.add(new Semester(new UUID(4545,453453), new SimpleDateFormat("dd/MM/yyyy").parse("29/08/2016"), new SimpleDateFormat("dd/MM/yyyy").parse("17/12/2016")));
		semesters.add(new Semester(new UUID(2047,395730), new SimpleDateFormat("dd/MM/yyyy").parse("24/01/2017"), new SimpleDateFormat("dd/MM/yyyy").parse("14/05/2017")));

		sections.add(new Section(course.get(0).getCourseID(), semesters.get(0).getSemesterID(), new UUID(3048,23948), 201));
		sections.add(new Section(course.get(1).getCourseID(), semesters.get(0).getSemesterID(), new UUID(1473,29375), 395));
		sections.add(new Section(course.get(2).getCourseID(), semesters.get(0).getSemesterID(), new UUID(3947,29475), 248));
		sections.add(new Section(course.get(0).getCourseID(), semesters.get(1).getSemesterID(), new UUID(2946,29754), 146));
		sections.add(new Section(course.get(1).getCourseID(), semesters.get(1).getSemesterID(), new UUID(8373,50483), 305));
		sections.add(new Section(course.get(2).getCourseID(), semesters.get(1).getSemesterID(), new UUID(3535,32352), 184));

	}

	@Test		
	public void TestStudent(){
		ArrayList<Student> students = new ArrayList<Student>();
		try {
			students = asList(new Student("Madison", "Claire", "Whitcomb", new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1995"), eMajor.BUSINESS,
					"58 Elk Street", "(483)-083-7394", "mwhit@udel.edu"), 
					new Student("Bill", "Ray", "Jacobs", new SimpleDateFormat("dd/MM/yyyy").parse("12/6/1996"), eMajor.CHEM,
							"39 White Street", "(204)-284-9586", "bjacobs@udel.edu"),
					new Student("Rachel", "Jean", "King", new SimpleDateFormat("dd/MM/yyyy").parse("30/08/1996"), eMajor.COMPSI,
							"83 Brooke Avenue", "(458)-836-2499", "rking@udel.edu"), 
					new Student("Eriqua", "Von", "Wallis", new SimpleDateFormat("dd/MM/yyyy").parse("26/03/1997"), eMajor.NURSING,
							"302 Deer Road", "(274)-293-9590", "ewallis@udel.edu"),
					new Student("Shane", "Matthew", "Miller", new SimpleDateFormat("dd/MM/yyyy").parse("23/12/1998"), eMajor.PHYSICS, 
							"32 Lee Lane", "(245)-028-4927", "smiller@udel.edu"),
					
					new Student("Lori", "Ray", "Smith", new SimpleDateFormat("dd/MM/yyyy").parse("09/05/1995"), eMajor.PHYSICS, 
							"38 Fish and Game Road", "(284)-385-2836", "lsmith@udel.edu"),
					new Student("Dodi", "Elleker", "Brehm", new SimpleDateFormat("dd/MM/yyyy").parse("19/06/1996"), eMajor.PHYSICS, 
							"89 Meade Road", "(583)-285-2573", "dbrehm@udel.edu"),
					new Student("Jeffrey", "Thomas", "Greason", new SimpleDateFormat("dd/MM/yyyy").parse("25/08/1998"), eMajor.PHYSICS, 
							"284 School Lane", "(295)-206-9375", "jgreason@udel.edu"),
					new Student("Greta", "Jean", "Mauro", new SimpleDateFormat("dd/MM/yyyy").parse("04/01/1997"), eMajor.PHYSICS, 
							"295 Quaker Church Road", "(306)-028-2057", "gmauro@udel.edu"),
					new Student("Hannah", "Jo", "Peterson", new SimpleDateFormat("dd/MM/yyyy").parse("18/12/1998"), eMajor.PHYSICS, 
							"492 Grant Lane", "(936)-274-7489", "hpeterson@udel.edu"));
			
			
			
			Enrollment en = new Enrollment(sections.get(0).getSectionID(), students.get(0).getStudentID());
			Enrollment en2 = new Enrollment(sections.get(5).getSectionID(), students.get(1).getStudentID());
			Enrollment en3 = new Enrollment(sections.get(3).getSectionID(), students.get(2).getStudentID());
			Enrollment en4 = new Enrollment(sections.get(4).getSectionID(), students.get(3).getStudentID());
			Enrollment en5 = new Enrollment(sections.get(5).getSectionID(), students.get(4).getStudentID());
			Enrollment en6 = new Enrollment(sections.get(2).getSectionID(), students.get(5).getStudentID());
			Enrollment en7 = new Enrollment(sections.get(1).getSectionID(), students.get(6).getStudentID());
			Enrollment en8 = new Enrollment(sections.get(2).getSectionID(), students.get(7).getStudentID());
			Enrollment en9= new Enrollment(sections.get(0).getSectionID(), students.get(8).getStudentID());
			Enrollment en10 = new Enrollment(sections.get(1).getSectionID(), students.get(9).getStudentID());
			
			en.setGrade(89);
			en2.setGrade(99);
			en3.setGrade(38);
			en4.setGrade(59);
			en5.setGrade(78);
			en6.setGrade(86);
			en7.setGrade(93);
			en8.setGrade(40);
			en9.setGrade(100);
			en10.setGrade(90);
			
			
			
			assertEquals((int) 89, (int) en.getGrade());
			
			
			
		} catch (PersonException e) {
			
			e.printStackTrace();
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

	private ArrayList<Student> asList(Student student, Student student2, Student student3, Student student4,
			Student student5, Student student6, Student student7, Student student8, Student student9, 
			Student student10) {
			ArrayList<Student> list = new ArrayList<Student>();
			list.add(student);
			list.add(student2);
			list.add(student3);
			list.add(student4);
			list.add(student5);
			list.add(student6);
			list.add(student7);
			list.add(student8);
			list.add(student9);
			list.add(student10);
			return list;
	
	
	
	}
	

}
