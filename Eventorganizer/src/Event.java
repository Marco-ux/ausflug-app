import java.util.*;

public abstract class Event {
	
	private String name;
	private List<Participant> participants;
	
	public Event(String name, List<Participant> participants) {
		super();
		this.participants = new ArrayList<Participant>();
		this.name = name;
		this.participants = participants;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}	
}
