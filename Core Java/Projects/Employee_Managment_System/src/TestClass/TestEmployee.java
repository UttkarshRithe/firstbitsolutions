
package TestClass;

	import controller.EmployeeController;
	import view.EmployeeView;

	public class TestEmployee {

		public static void main(String[] args) {
			EmployeeController ec = new EmployeeController();
			EmployeeView ev = new EmployeeView(ec);
			ev.showOption();

		}
	}
