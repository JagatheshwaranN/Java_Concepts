package java8.feature.exceptionhandling;

@FunctionalInterface
public interface CheckedExceptionHandler<Target, ExObj extends Exception> {

	public void accept(Target target) throws ExObj;
}
