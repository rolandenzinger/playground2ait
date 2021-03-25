package vaccination;

public class TimeSlots {

	private boolean slotIsScheduled;
	private int slotId;
	private String slotStart;
	private String slotEnd;
	private String slotDate;
	private String[] schedules;

	public TimeSlots(String TimeStart, String TimeEnd, String date, boolean scheduled) {

		this.slotId = 0;
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
				schedules[i] = slotId + ";" + locationId + ";" + "---" + ";" + date + ";" + timeStart + ";" + timeEnd + ";" + "false";
			}

		}

		return slotId;
	}

	public boolean DeleteUnscheduledSlot(int slotId, boolean slotIsScheduled) {
		boolean somethingRemoved = false;
		for (int i = 0; i < schedules.length; i++) {
			String[] tmp = schedules[i].split(";");
			if (tmp[6].equals("false")) {
				schedules[i] = null;
				removeSchedule(i);
				somethingRemoved = true;
			}
		}
		return somethingRemoved;
	}

	public int AddScheduledSlotForPerson(int locationId, int personId, int slotId) {
		String[] tmp;
		int scheduleId = -1;
		String reconstructedSchedule = "";
		for (int i = 0; i < schedules.length; i++) {
			tmp = schedules[i].split(";");
			if (Integer.parseInt(tmp[0]) == slotId && tmp[6].equals("false")) {
				tmp[1] = String.valueOf(locationId);
				tmp[2] = String.valueOf(personId);
				scheduleId = Integer.parseInt(tmp[0]);
			}
			
			for (int j = 0; j < tmp.length; j++) {
				reconstructedSchedule += tmp[j];
			}
			schedules[i] = reconstructedSchedule;
		}
		return scheduleId;
	}

	public boolean DeleteScheduledSlotForPerson(int scheduleId) {
		String[] tmp;
		for (int i = 0; i < schedules.length; i++) {
			tmp = schedules[i].split(";");
			if (Integer.parseInt(tmp[0]) == scheduleId) {
				tmp[2] = "---";
			}
			
		}
		return true;
	}

	public int[] getAllUnscheduledSlotsForStation(int locationId) {
		String[] schedule;
		int i = 0;
		int[] unscheduledSlots = new int[0];
		for (int schedulesLocation = 0; schedulesLocation < schedules.length; schedulesLocation++) {
			schedule = schedules[schedulesLocation].split(";");
			if (Integer.parseInt(schedule[1]) == locationId) {
				unscheduledSlots = increaseArrayLength(unscheduledSlots);
				unscheduledSlots[i] = Integer.parseInt(schedule[0]);
				i++;
			}
		}

		return unscheduledSlots;
	}

	public int[] GetAllUnscheduledSlotsForDate(String date) {
		String[] schedule;
		int i = 0;
		int[] unscheduledSlots = new int[0];
		for (int schedulesLocation = 0; schedulesLocation < schedules.length; schedulesLocation++) {
			schedule = schedules[schedulesLocation].split(";");
			if (schedule[3].equals(date)) {
				unscheduledSlots = increaseArrayLength(unscheduledSlots);
				unscheduledSlots[i] = Integer.parseInt(schedule[0]);
				i++;
			}
		}

		return unscheduledSlots;
	}

	public void removeSchedule(int scheduleIndex) {
		String[] oldSchedules = schedules.clone();
		schedules = new String[schedules.length - 1];
		int j = 0;
		for (int i = 0; i < schedules.length; i++) {
			if (i == scheduleIndex) {
				continue;
			}
			schedules[j] = oldSchedules[i];
			j++;
		}
	}

	public int[] increaseArrayLength(int[] array) {
		int[] oldArray = array.clone();
		array = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				array[i] = oldArray[i];
			}
		}
		return array;
	}
}
