package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {


	
	@BeforeClass
	public static void setup() {
	}
	
	
	@Test
	public void TestAverageSalary(){
		ArrayList<Staff> staffmembers = new ArrayList<Staff>();
		
		try {
			staffmembers = asList(new Staff("Madison", "Claire", "Whitcomb", new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1984"), "58 Elk Street", "(483)-083-7394",
					"mwhit@udel.edu", "M,W,F 3:00-5:00", 1, 145395.00, new SimpleDateFormat("dd/MM/yyyy").parse("18/01/2003"), eTitle.MRS), 
					new Staff("Bill", "Ray", "Jacobs", new SimpleDateFormat("dd/MM/yyyy").parse("12/6/1986"), "39 White Street", "(204)-284-9586",
							"bjacobs@udel.edu", "T,R 11:00-2:00", 2, 118357.00, new SimpleDateFormat("dd/MM/yyyy").parse("13/02/2006"), eTitle.MR),
					new Staff("Rachel", "Jean", "King", new SimpleDateFormat("dd/MM/yyyy").parse("30/08/1986"), "83 Brooke Avenue", "(458)-836-2499",
							"rking@udel.edu", "M,W,F 4:00-5:30", 3, 96358.00, new SimpleDateFormat("dd/MM/yyyy").parse("16/11/2004"), eTitle.MS), 
					new Staff("Eriqua", "Von", "Wallis", new SimpleDateFormat("dd/MM/yyyy").parse("26/03/1987"), "302 Deer Road", "(274)-293-9590",
							"ewallis@udel.edu", "T,F 9:00-11:20", 4, 85294.00, new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2003"), eTitle.MRS),
					new Staff("Shane", "Matthew", "Miller", new SimpleDateFormat("dd/MM/yyyy").parse("23/12/1988"), "32 Lee Lane", "(245)-028-4927",
							"smiller@udel.edu", "W,R 6:00-7:00", 5, 83047.00, new SimpleDateFormat("dd/MM/yyyy").parse("06/09/2002"), eTitle.MR));
		} catch (PersonException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		double total = staffmembers.get(0).getSalary()+staffmembers.get(1).getSalary()+staffmembers.get(2).getSalary()+
				staffmembers.get(3).getSalary()+staffmembers.get(4).getSalary();
		
		double average = total/staffmembers.size();
		assertEquals((int)105690.20, (int) average);
		

	}	
	
	@Test (expected = PersonException.class)
	public void TestInvalidNumber() throws PersonException, ParseException{
		ArrayList<Staff> staffmembers = new ArrayList<Staff>();
		
		
			staffmembers = asList(new Staff("Madison", "Claire", "Whitcomb", new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1984"), "58 Elk Street", "(483)-083-7394",
					"mwhit@udel.edu", "M,W,F 3:00-5:00", 1, 145395.00, new SimpleDateFormat("dd/MM/yyyy").parse("18/01/2003"), eTitle.MRS), 
					new Staff("Bill", "Ray", "Jacobs", new SimpleDateFormat("dd/MM/yyyy").parse("12/6/1986"), "39 White Street", "(204)-284-9586",
							"bjacobs@udel.edu", "T,R 11:00-2:00", 2, 118357.00, new SimpleDateFormat("dd/MM/yyyy").parse("13/02/2006"), eTitle.MR),
					new Staff("Rachel", "Jean", "King", new SimpleDateFormat("dd/MM/yyyy").parse("30/08/1986"), "83 Brooke Avenue", "(458)-836-2499",
							"rking@udel.edu", "M,W,F 4:00-5:30", 3, 96358.00, new SimpleDateFormat("dd/MM/yyyy").parse("16/11/2004"), eTitle.MS), 
					new Staff("Eriqua", "Von", "Wallis", new SimpleDateFormat("dd/MM/yyyy").parse("26/03/1987"), "302 Deer Road", "(274)-23-9590",
							"ewallis@udel.edu", "T,F 9:00-11:20", 4, 85294.00, new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2003"), eTitle.MRS),
					new Staff("Shane", "Matthew", "Miller", new SimpleDateFormat("dd/MM/yyyy").parse("23/12/1988"), "32 Lee Lane", "(245)-028-4927",
							"smiller@udel.edu", "W,R 6:00-7:00", 5, 83047.00, new SimpleDateFormat("dd/MM/yyyy").parse("06/09/2002"), eTitle.MR));
		
		
			
	}
	
	@Test (expected = PersonException.class)
	public void TestInvalidDOB() throws PersonException, ParseException{
		ArrayList<Staff> staffmembers = new ArrayList<Staff>();
		
			staffmembers = asList(new Staff("Madison", "Claire", "Whitcomb", new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1684"), "58 Elk Street", "(483)-083-7394",
					"mwhit@udel.edu", "M,W,F 3:00-5:00", 1, 145395.00, new SimpleDateFormat("dd/MM/yyyy").parse("18/01/2003"), eTitle.MRS), 
					new Staff("Bill", "Ray", "Jacobs", new SimpleDateFormat("dd/MM/yyyy").parse("12/6/1986"), "39 White Street", "(204)-284-9586",
							"bjacobs@udel.edu", "T,R 11:00-2:00", 2, 118357.00, new SimpleDateFormat("dd/MM/yyyy").parse("13/02/2006"), eTitle.MR),
					new Staff("Rachel", "Jean", "King", new SimpleDateFormat("dd/MM/yyyy").parse("30/08/1986"), "83 Brooke Avenue", "(458)-836-2499",
							"rking@udel.edu", "M,W,F 4:00-5:30", 3, 96358.00, new SimpleDateFormat("dd/MM/yyyy").parse("16/11/2004"), eTitle.MS), 
					new Staff("Eriqua", "Von", "Wallis", new SimpleDateFormat("dd/MM/yyyy").parse("26/03/1987"), "302 Deer Road", "(274)-293-9590",
							"ewallis@udel.edu", "T,F 9:00-11:20", 4, 85294.00, new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2003"), eTitle.MRS),
					new Staff("Shane", "Matthew", "Miller", new SimpleDateFormat("dd/MM/yyyy").parse("23/12/1988"), "32 Lee Lane", "(245)-028-4927",
							"smiller@udel.edu", "W,R 6:00-7:00", 5, 83047.00, new SimpleDateFormat("dd/MM/yyyy").parse("06/09/2002"), eTitle.MR));
		
		
		
		
		

	}



private ArrayList<Staff> asList(Staff staff, Staff staff2, Staff staff3, Staff staff4, Staff staff5) {
		ArrayList<Staff> list = new ArrayList<Staff>();
		list.add(staff);
		list.add(staff2);
		list.add(staff3);
		list.add(staff4);
		list.add(staff5);
		return list;
	}
	
}
