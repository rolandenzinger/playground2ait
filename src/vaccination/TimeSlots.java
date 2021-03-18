package vaccination;

public class TimeSlots {
	
	private boolean SlotIsScheduled;
	private String SlotId;
	private String SlotStart;
	private String SlotEnd;
	private String SlotDate;
	
	
	
	public TimeSlots(String id , String start , String end , String date , boolean scheduled){
		
		this.SlotId = id;
		this.SlotStart = start;
		this.SlotEnd = end;
		this.SlotDate = date;
		this.SlotIsScheduled = scheduled;
		
	}
	

}

