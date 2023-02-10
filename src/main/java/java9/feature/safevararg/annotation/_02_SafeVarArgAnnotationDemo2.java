package java9.feature.safevararg.annotation;

import java.util.ArrayList;
import java.util.List;

public class _02_SafeVarArgAnnotationDemo2<T> {

	private List<T> chocolates = new ArrayList<>();

	public static void main(String[] args) {

		_02_SafeVarArgAnnotationDemo2<String> object = new _02_SafeVarArgAnnotationDemo2<>();
		object.add("5Star", "Perk", "DiaryMilk");
		System.out.println(object.chocolates);
	}

	@SafeVarargs
	private final void add(T... toAdd) {
		for (T chocolate : toAdd) {
			chocolates.add(chocolate);
		}
	}
}
