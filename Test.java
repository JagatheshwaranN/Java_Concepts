import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 * Frame Demo
 * 
 * @author Jagatheshwaran N
 */
public class Test {

	public static void main(String[] args) throws IOException {

		Frame frame = new Frame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
		frame.add(new Label("This Process is started from Java by using ProcessBuilder"));
		frame.setSize(700, 700);
		frame.setVisible(true);
	}
}
