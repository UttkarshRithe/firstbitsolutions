class Robot
{
	int Robotid;
	String name;
	String type;
	int getRobotid() {
		return Robotid;
	}
	void setRobotid(int robotid) {
		Robotid = robotid;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	void display()
	{
		System.out.println("robotid:"+this.Robotid);
		System.out.println("name:"+this.name);
		System.out.println("type:"+this.type);
	}
}
public class TestRobot {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		System.out.println(r1);
		r1.setRobotid(79);
		r1.setName("Hacker");
		r1.setType("Industrial");
		System.out.println("using getters");
		
		System.out.println("Robot id:"+r1.getRobotid());
		System.out.println("name:"+r1.getName());
		System.out.println("Type:"+r1.getType());
		
		System.out.println("Using display:");
		
		r1.display();
	}

}
