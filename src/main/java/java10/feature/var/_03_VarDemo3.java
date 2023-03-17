package java10.feature.var;

import java.util.HashMap;

import java.util.Map;

public class _03_VarDemo3 {

	public static void main(String[] args) {

		var map = new HashMap<Integer, String>();
		map.put(101, "Alex");
		map.put(102, "John");
		map.put(103, "Smith");
		// Without Var variable
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("*********************************************");
		// With Var variable
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
