package vaccination;

public class TimeSlots {

	private boolean slotIsScheduled;
	private int slotId;
	private String slotStart;
	private String slotEnd;
	private String slotDate;
	private String[] schedules;
	int scheduleId;

	public TimeSlots(int id, String TimeStart, String TimeEnd, String date, boolean scheduled) {

		this.slotId = id;
		this.slotStart = TimeStart;
		this.slotEnd = TimeEnd;
		this.slotDate = date;
		this.slotIsScheduled = scheduled;
		schedules = new String[0];
	}

	public int AddNewSlot(int locationId, String date, String timeStart, String timeEnd) {

		String[] tmp = schedules.clone();
		schedules = new String[schedules.length + 1];
		slotId++;

		for (int i = 0; i < schedules.length; i++) {

			if (i < schedules.length - 1) {
				schedules[i] = tmp[i];
			} else {
				schedules[i] = slotId + ";" + locationId + ";" + "---" + ";" + date + ";" + timeStart + ";" + timeEnd
						+ ";" + "false";
			}

		}

		return slotId;
	}

	public boolean DeleteUnscheduledSlot(int slotId, boolean slotIsScheduled) {

		for (int i = 0; i < schedules.length; i++) {

			String[] tmp = schedules[i].split(";");

			if (tmp[7].equals("false")) {
				

				schedules = tmp;
			}

		}

		return true;
	}

	public int AddScheduledSlotForPerson(int locationId, int personId, int slotId) {
		return scheduleId;
	}

	public boolean DeleteScheduledSlotForPerson(int scheduleId) {
		return true;
	}

	public int[] getAllUnscheduledSlotsForStation(int stationId) {
		return null;
	}

	public int[] GetAllUnscheduledSlotsForDate(String date) {
		return null;
	}
}
