package lambdaEx;

public interface Sam {
	void display();
}

interface Sam1 extends Sam {
	default void plsDisplay() {

		display();
	}

}
