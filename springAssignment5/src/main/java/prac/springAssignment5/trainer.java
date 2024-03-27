package prac.springAssignment5;

public class trainer {
	private int trainer_id;
	private String name;
	private String designation;
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public trainer(int trainer_id, String name, String designation) {
		super();
		this.trainer_id = trainer_id;
		this.name = name;
		this.designation = designation;
	}
	public trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "trainer [trainer_id=" + trainer_id + ", name=" + name + ", designation=" + designation + "]";
	}
	
}
