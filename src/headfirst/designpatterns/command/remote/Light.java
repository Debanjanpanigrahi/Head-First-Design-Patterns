package headfirst.designpatterns.command.remote;

public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " chease loaded");
	}

	public void off() {
		System.out.println(location + "chease");
	}
}
