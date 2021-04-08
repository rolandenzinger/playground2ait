package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTimeSlots {

	@Test
	public void testAddNewSlot() {
		TimeSlots timeslot = new TimeSlots();
		timeslot.AddNewSlot(1, "02.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(5, "04.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(4, "06.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		
		assertEquals(6, timeslot.getSlotIds());
		assertEquals(7, timeslot.getSchedules().length);
	}
	
	@Test
	public void testDeleteUnscheduledSlot() {
		TimeSlots timeslot = new TimeSlots();
		timeslot.AddNewSlot(1, "02.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(5, "04.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(4, "06.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");

		
		timeslot.AddScheduledSlotForPerson(4, 2, 2);
		timeslot.AddScheduledSlotForPerson(4, 2, -1);
		
		assertEquals(true, timeslot.DeleteUnscheduledSlot(6));
		assertEquals(true, timeslot.DeleteUnscheduledSlot(5));
		assertEquals(true, timeslot.DeleteUnscheduledSlot(4));
		assertEquals(true, timeslot.DeleteUnscheduledSlot(3));
		assertEquals(false, timeslot.DeleteUnscheduledSlot(2));
		
		assertEquals(true, timeslot.DeleteScheduledSlotForPerson(2));
		assertEquals(true, timeslot.DeleteUnscheduledSlot(2));
		assertEquals(true, timeslot.DeleteUnscheduledSlot(1));
		assertEquals(true, timeslot.DeleteUnscheduledSlot(0));
		assertEquals(false, timeslot.DeleteScheduledSlotForPerson(0));
		
		assertEquals(false, timeslot.DeleteUnscheduledSlot(-1));
		assertEquals(false, timeslot.DeleteUnscheduledSlot(120));
		assertEquals(false, timeslot.DeleteUnscheduledSlot(7));
	}
	
	@Test
	public void testAddScheduledSlotForPerson() {
		TimeSlots timeslot = new TimeSlots();
		timeslot.AddNewSlot(1, "02.02.2021", "21:00", "22:00"); //0
		timeslot.AddNewSlot(1, "04.02.2021", "21:00", "22:00"); //1
		timeslot.AddNewSlot(2, "06.02.2021", "21:00", "22:00"); //2
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00"); //3
		timeslot.AddNewSlot(3, "02.02.2021", "20:00", "21:00"); //4
		timeslot.AddNewSlot(4, "02.04.2021", "21:00", "22:00"); //5
		timeslot.AddNewSlot(5, "02.02.2021", "20:00", "21:00"); //6

		assertEquals(-1, timeslot.AddScheduledSlotForPerson(3, 6, -1));
		assertEquals(-1, timeslot.AddScheduledSlotForPerson(2, 2, 8456));
		assertEquals(-1, timeslot.AddScheduledSlotForPerson(2, 2, 8456));
		assertEquals( 2, timeslot.AddScheduledSlotForPerson(2, 2, 2));
		assertEquals(-1, timeslot.AddScheduledSlotForPerson(4, 6, 2));
		assertEquals(-1, timeslot.AddScheduledSlotForPerson(3, 6, 5));
	}
	
	@Test
	public void testDeleteScheduledSlotForPerson() {
		TimeSlots timeslot = new TimeSlots();
		timeslot.AddNewSlot(1, "02.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(5, "04.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(4, "06.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		
		timeslot.AddScheduledSlotForPerson(1, 2, 0);
		timeslot.AddScheduledSlotForPerson(4, 6, 2);
		timeslot.AddScheduledSlotForPerson(1, 6, 6);
		timeslot.AddScheduledSlotForPerson(3, 6, 5);
		
		assertEquals(false, timeslot.DeleteScheduledSlotForPerson(12322));
		assertEquals(false, timeslot.DeleteScheduledSlotForPerson(-1));
		assertEquals(true , timeslot.DeleteScheduledSlotForPerson(0));
		assertEquals(false , timeslot.DeleteScheduledSlotForPerson(4));
		assertEquals(true , timeslot.DeleteScheduledSlotForPerson(6));
		assertEquals(true , timeslot.DeleteScheduledSlotForPerson(5));
	}
	
	@Test
	public void testGetAllUnscheduledSlotsForStation() {
		TimeSlots timeslot = new TimeSlots();
		timeslot.AddNewSlot(1, "02.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(5, "04.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(4, "06.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		
		assertEquals(3, timeslot.GetAllUnscheduledSlotsForStation(1).length);
		assertEquals(1, timeslot.GetAllUnscheduledSlotsForStation(5).length);
		assertEquals(2, timeslot.GetAllUnscheduledSlotsForStation(3).length);
		assertEquals(1, timeslot.GetAllUnscheduledSlotsForStation(4).length);

	}

	@Test
	public void testGetAllUnscheduledSlotsForDate() {
		TimeSlots timeslot = new TimeSlots();
		timeslot.AddNewSlot(1, "02.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(5, "04.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(4, "06.02.2021", "21:00", "22:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		timeslot.AddNewSlot(3, "02.04.2021", "21:00", "22:00");
		timeslot.AddNewSlot(1, "02.02.2021", "20:00", "21:00");
		
		assertEquals(3, timeslot.GetAllUnscheduledSlotsForDate("02.02.2021").length);
		assertEquals(1, timeslot.GetAllUnscheduledSlotsForDate("04.02.2021").length);
		assertEquals(2, timeslot.GetAllUnscheduledSlotsForDate("02.04.2021").length);
		assertEquals(1, timeslot.GetAllUnscheduledSlotsForDate("06.02.2021").length);
	}
}
