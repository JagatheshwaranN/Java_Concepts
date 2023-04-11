package java13.feature.switch_exp.enhancement;

public class _02_Switch_Expression_Demo2 {

	public static void main(String[] args) {

		var a = 5;
		var caseVal = "square";
		var result = switch (caseVal) {

		case "double":
			yield a * 2;

		case "square":
			yield a * a;

		default:
			yield a;
		};
		System.out.println(result);
	}
}
