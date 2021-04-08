package vaccination;

public class TimeSlots {

	private int slotIds;
	private String[] schedules;
	
	public int getSlotIds() {
		return slotIds;
	}
	
	public String[] getSchedules() {
		return schedules;
	}

	public TimeSlots() {

		this.slotIds = -1;
		schedules = new String[0];
	}

	public int AddNewSlot(int locationId, String date, String timeStart, String timeEnd) {

		String[] tmp = schedules.clone();
		String[] newSchedules = new String[schedules.length + 1];
		slotIds++;

		for (int i = 0; i < newSchedules.length; i++) {

			if (i < newSchedules.length - 1) {
				newSchedules[i] = tmp[i];
			} else {
				newSchedules[i] = slotIds + ";" + locationId + ";" + "" + ";" + date + ";" + timeStart + ";" + timeEnd + ";" + "false";
			}

		}
		schedules = newSchedules;
		return slotIds;
	}

	public boolean DeleteUnscheduledSlot(int slotId) {
		if (slotId >= schedules.length || slotId < 0) {
			return false;
		}
		
		boolean somethingRemoved = false;
		for (int i = 0; i < schedules.length; i++) {
			String[] tmp = schedules[i].split(";");
			if (slotId == Integer.parseInt(tmp[0]) && tmp[6].equals("false")) {
				schedules[i] = null;
				if (removeSchedule(i)) {
					somethingRemoved = true;
				}
			}
		}
		return somethingRemoved;
	}

	public int AddScheduledSlotForPerson(int locationId, int personId, int slotId) {
		
		if (slotId >= schedules.length || slotId < 0) {
			return -1;
		}
		
		String[] tmp;
		int scheduleId = -1;
		
		for (int i = 0; i < schedules.length; i++) {
			String reconstructedSchedule = "";
			tmp = schedules[i].split(";");
			if (Integer.parseInt(tmp[0]) == slotId && tmp[6].equals("false")) {
				if (Integer.parseInt(tmp[1]) == locationId) {
					tmp[2] = String.valueOf(personId);
					tmp[6] = "true";
					scheduleId = i;
				}
			}
			
			for (int j = 0; j < tmp.length; j++) {
				if (j < tmp.length - 1) {
					reconstructedSchedule += tmp[j] + ";";
				} else {
					reconstructedSchedule += tmp[j];
				}
				
			}
			schedules[i] = reconstructedSchedule;
		}
		return scheduleId;
	}

	public boolean DeleteScheduledSlotForPerson(int scheduleId) {
		if (scheduleId >= schedules.length || scheduleId < 0) {
			return false;
		}
		
		String[] tmp;
		boolean somethingRemoved = false;
		for (int i = 0; i < schedules.length; i++) {
			String reconstructedSchedule = "";
			tmp = schedules[i].split(";");
			if (Integer.parseInt(tmp[0]) == scheduleId && tmp[6].equals("true")) {
				tmp[2] = "";
				tmp[6] = "false";
				somethingRemoved = true;
			}
			for (int j = 0; j < tmp.length; j++) {
				if (j < tmp.length - 1) {
					reconstructedSchedule += tmp[j] + ";";
				} else {
					reconstructedSchedule += tmp[j];
				}
			}
			schedules[i] = reconstructedSchedule;
		}
		return somethingRemoved;
	}

	public int[] GetAllUnscheduledSlotsForStation(int locationId) {
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

	private boolean removeSchedule(int scheduleIndex) {
		if (schedules.length == 0) {
			return false;
		}
		
		String[] oldSchedules = schedules.clone();
		String[] newSchedules = new String[schedules.length - 1];
		int j = 0;
		for (int i = 0; i < oldSchedules.length; i++) {
			if (oldSchedules[i] == null) {
				continue;
			}
			newSchedules[j] = oldSchedules[i];
			j++;
		}
		schedules = newSchedules;
		return true;
	}

	private int[] increaseArrayLength(int[] array) {
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
