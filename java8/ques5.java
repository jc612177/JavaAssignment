package java8;


	interface Clickable {
		default void click() {
			System.out.println("click");
		}
	}

	interface Accessible {
		default void access() {
			System.out.println("access");
		}
	}

	public class ques5 implements Clickable, Accessible {

		public static void main(String[] args) {
			ques5 button = new ques5();
			button.click();
			button.access();
		}
	}