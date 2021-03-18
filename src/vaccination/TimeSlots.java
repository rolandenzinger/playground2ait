package vaccination;

public class TimeSlots {

	private boolean slotIsScheduled;
	private int slotId;
	private String slotStart;
	private String slotEnd;
	private String slotDate;
	private String[] schedules;

	public TimeSlots(int id, String TimeStart, String TimeEnd, String date, boolean scheduled) {

		this.slotId = id;
		this.slotStart = TimeStart;
		this.slotEnd = TimeEnd;
		this.slotDate = date;
		this.slotIsScheduled = scheduled;

		schedules = new String[0];
	}

	public int AddNewSlot(int slotId, int locationId, int personId, String date, String timeStart, String timeEnd) {

		String[] tmp = schedules.clone();
		schedules =  new String[schedules.length + 1];
		
		for (int i = 0; i < tmp.length; i++) {
			
			if(i < schedules.length-1) {
				schedules[i] = tmp[i];
			} else {
				schedules[i] = slotId + ";" +locationId + ";" + personId + ";" + date + ";" + timeStart + ";" + timeEnd;
			}
			
		}
		
		
		
		
		
		
		
		return slotId;
	}

}
