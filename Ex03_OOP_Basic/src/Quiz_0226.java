public class Quiz_0226 {
	public class Computer {

		private int sel;
		private String brand;
		private String serial;
		private String color;
		private boolean power; // true / false
		private boolean powersave; // true / false
		MainBody mainbody;
		Monitor monitor;
		Kiboard kiboard;

		public void write() {
		}

		public void print() {
		}

		public void poweron() {
		}

		public void poweroff() {
		}

		public void powersaveon() {
		}

		public void powersaveoff() {
		}

		public void calculation() {
		}

	}

	private class Monitor {
		private String display;
		private String cradle;
		private String brand;
		private boolean button;

	}

	private class MainBody {
		private int sel;
		private String brand;
		private int serial;
		private int cpu;
		private int memory;
		private boolean power;

	}

	private class Kiboard {
		private boolean button;
		private boolean led;
		private String brand;

	}

}
