package in.ashokit.request;

public class Passenger {

	private String name;
	private String from;
	private String to;
	private String doj;
	private String trainNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public Passenger(String name, String from, String to, String doj, String trainNumber) {
		super();
		this.name = name;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainNumber = trainNumber;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", from=" + from + ", to=" + to + ", doj=" + doj + ", trainNumber="
				+ trainNumber + "]";
	}
	
}
