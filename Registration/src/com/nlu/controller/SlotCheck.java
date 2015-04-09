package com.nlu.controller;

import com.nlu.model.CourseModel;

public class SlotCheck {
	
	public boolean TimeCheck(CourseModel cm1, CourseModel cm2) {
	
		boolean schedconflict = false;
		
		if (cm1.getTimeSlot() == cm2.getTimeSlot() && cm1.getDaySlot() == cm2.getDaySlot()) {
			schedconflict = true;
			
		}
	return schedconflict;
	}
}
