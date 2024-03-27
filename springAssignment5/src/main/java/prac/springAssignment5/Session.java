package prac.springAssignment5;

public class Session {
	private int Trainer_ID;
	private String SessionID;
	private String topic;
	private String date;
	public Session(int trainer_ID, String sessionID, String topic, String date) {
		super();
		Trainer_ID = trainer_ID;
		SessionID = sessionID;
		this.topic = topic;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Session [Trainer_ID=" + Trainer_ID + ", SessionID=" + SessionID + ", topic=" + topic + ", date=" + date
				+ "]";
	}
	private Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTrainer_ID() {
		return Trainer_ID;
	}
	public void setTrainer_ID(int trainer_ID) {
		Trainer_ID = trainer_ID;
	}
	public String getSessionID() {
		return SessionID;
	}
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
