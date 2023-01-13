package java8.feature.predicate;

import java.util.function.Predicate;

class Employees {

	int eno;
	String ename;
	double salary;
	int dno;

	Employees(int eno, String ename, double salary, int dno) {
		
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.dno = dno;
	}
}

public class PredicateDemo2 {
	
	public static void main (String[] args) {
		
		Employees object = new Employees(121, "Alex", 2500, 20);
		Predicate<Employees> p = e -> e.salary>2000;
		System.out.println(p.test(object));
	}

}
