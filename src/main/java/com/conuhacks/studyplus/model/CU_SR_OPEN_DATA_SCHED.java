package com.conuhacks.studyplus.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CU_SR_OPEN_DATA_SCHED {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	private String Course_ID;
	private String Term_Code;
	private String Term_Descr;
	private String Session;
	private String Subject;
	private String Catalog_Nbr;
	private String Section;
	private String Component_Code;
	private String Component_Descr;
	private String Class_Association;
	private String Course_Title;
	private String Topic_ID;
	private String Topic_Descr;
	private String Combined_Section_ID;
	private String Class_Status;
	private String Location_Code;
	private String Location_Descr;
	private String Instruction_Mode_code;
	private String Instruction_Mode_Descr;
	private String Meeting_Pattern_Nbr;
	private String Room_Code;
	private String Building_Code;
	private String Room;
	private String Class_Start_Time;
	private String Class_End_Time;
	private String Mon;
	private String Tues;
	private String Wed;
	private String Thurs;
	private String Fri;
	private String Sat;
	private String Sun;
	private String Start_Date_DD_MM_YYYY;
	private String End_Date_DD_MM_YYYY;
	private String Career;
	private String Dept_Code;
	private String Dept_Descr;
	private String Faculty_Code;
	private String Faculty_Descr;
	private String Enrollment_Capacity;
	private String Current_Enrollment;
	private String Waitlist_Capacity;
	private String Current_Waitlist_Total;
	private String Has_some_all_seats_reserved;
	private String Build_code;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getCourse_ID() {
		return Course_ID;
	}
	public void setCourse_ID(String course_ID) {
		Course_ID = course_ID;
	}
	public String getTerm_Code() {
		return Term_Code;
	}
	public void setTerm_Code(String term_Code) {
		Term_Code = term_Code;
	}
	public String getTerm_Descr() {
		return Term_Descr;
	}
	public void setTerm_Descr(String term_Descr) {
		Term_Descr = term_Descr;
	}
	public String getSession() {
		return Session;
	}
	public void setSession(String session) {
		Session = session;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getCatalog_Nbr() {
		return Catalog_Nbr;
	}
	public void setCatalog_Nbr(String catalog_Nbr) {
		Catalog_Nbr = catalog_Nbr;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getComponent_Code() {
		return Component_Code;
	}
	public void setComponent_Code(String component_Code) {
		Component_Code = component_Code;
	}
	public String getComponent_Descr() {
		return Component_Descr;
	}
	public void setComponent_Descr(String component_Descr) {
		Component_Descr = component_Descr;
	}
	public String getClass_Association() {
		return Class_Association;
	}
	public void setClass_Association(String class_Association) {
		Class_Association = class_Association;
	}
	public String getCourse_Title() {
		return Course_Title;
	}
	public void setCourse_Title(String course_Title) {
		Course_Title = course_Title;
	}
	public String getTopic_ID() {
		return Topic_ID;
	}
	public void setTopic_ID(String topic_ID) {
		Topic_ID = topic_ID;
	}
	public String getTopic_Descr() {
		return Topic_Descr;
	}
	public void setTopic_Descr(String topic_Descr) {
		Topic_Descr = topic_Descr;
	}
	public String getCombined_Section_ID() {
		return Combined_Section_ID;
	}
	public void setCombined_Section_ID(String combined_Section_ID) {
		Combined_Section_ID = combined_Section_ID;
	}
	public String getClass_Status() {
		return Class_Status;
	}
	public void setClass_Status(String class_Status) {
		Class_Status = class_Status;
	}
	public String getLocation_Code() {
		return Location_Code;
	}
	public void setLocation_Code(String location_Code) {
		Location_Code = location_Code;
	}
	public String getLocation_Descr() {
		return Location_Descr;
	}
	public void setLocation_Descr(String location_Descr) {
		Location_Descr = location_Descr;
	}
	public String getInstruction_Mode_code() {
		return Instruction_Mode_code;
	}
	public void setInstruction_Mode_code(String instruction_Mode_code) {
		Instruction_Mode_code = instruction_Mode_code;
	}
	public String getInstruction_Mode_Descr() {
		return Instruction_Mode_Descr;
	}
	public void setInstruction_Mode_Descr(String instruction_Mode_Descr) {
		Instruction_Mode_Descr = instruction_Mode_Descr;
	}
	public String getMeeting_Pattern_Nbr() {
		return Meeting_Pattern_Nbr;
	}
	public void setMeeting_Pattern_Nbr(String meeting_Pattern_Nbr) {
		Meeting_Pattern_Nbr = meeting_Pattern_Nbr;
	}
	public String getRoom_Code() {
		return Room_Code;
	}
	public void setRoom_Code(String room_Code) {
		Room_Code = room_Code;
	}
	public String getBuilding_Code() {
		return Building_Code;
	}
	public void setBuilding_Code(String building_Code) {
		Building_Code = building_Code;
	}
	public String getRoom() {
		return Room;
	}
	public void setRoom(String room) {
		Room = room;
	}
	public String getClass_Start_Time() {
		return Class_Start_Time;
	}
	public void setClass_Start_Time(String class_Start_Time) {
		Class_Start_Time = class_Start_Time;
	}
	public String getClass_End_Time() {
		return Class_End_Time;
	}
	public void setClass_End_Time(String class_End_Time) {
		Class_End_Time = class_End_Time;
	}
	public String getMon() {
		return Mon;
	}
	public void setMon(String mon) {
		Mon = mon;
	}
	public String getTues() {
		return Tues;
	}
	public void setTues(String tues) {
		Tues = tues;
	}
	public String getWed() {
		return Wed;
	}
	public void setWed(String wed) {
		Wed = wed;
	}
	public String getThurs() {
		return Thurs;
	}
	public void setThurs(String thurs) {
		Thurs = thurs;
	}
	public String getFri() {
		return Fri;
	}
	public void setFri(String fri) {
		Fri = fri;
	}
	public String getSat() {
		return Sat;
	}
	public void setSat(String sat) {
		Sat = sat;
	}
	public String getSun() {
		return Sun;
	}
	public void setSun(String sun) {
		Sun = sun;
	}
	public String getStart_Date_DD_MM_YYYY() {
		return Start_Date_DD_MM_YYYY;
	}
	public void setStart_Date_DD_MM_YYYY(String start_Date_DD_MM_YYYY) {
		Start_Date_DD_MM_YYYY = start_Date_DD_MM_YYYY;
	}
	public String getEnd_Date_DD_MM_YYYY() {
		return End_Date_DD_MM_YYYY;
	}
	public void setEnd_Date_DD_MM_YYYY(String end_Date_DD_MM_YYYY) {
		End_Date_DD_MM_YYYY = end_Date_DD_MM_YYYY;
	}
	public String getCareer() {
		return Career;
	}
	public void setCareer(String career) {
		Career = career;
	}
	public String getDept_Code() {
		return Dept_Code;
	}
	public void setDept_Code(String dept_Code) {
		Dept_Code = dept_Code;
	}
	public String getDept_Descr() {
		return Dept_Descr;
	}
	public void setDept_Descr(String dept_Descr) {
		Dept_Descr = dept_Descr;
	}
	public String getFaculty_Code() {
		return Faculty_Code;
	}
	public void setFaculty_Code(String faculty_Code) {
		Faculty_Code = faculty_Code;
	}
	public String getFaculty_Descr() {
		return Faculty_Descr;
	}
	public void setFaculty_Descr(String faculty_Descr) {
		Faculty_Descr = faculty_Descr;
	}
	public String getEnrollment_Capacity() {
		return Enrollment_Capacity;
	}
	public void setEnrollment_Capacity(String enrollment_Capacity) {
		Enrollment_Capacity = enrollment_Capacity;
	}
	public String getCurrent_Enrollment() {
		return Current_Enrollment;
	}
	public void setCurrent_Enrollment(String current_Enrollment) {
		Current_Enrollment = current_Enrollment;
	}
	public String getWaitlist_Capacity() {
		return Waitlist_Capacity;
	}
	public void setWaitlist_Capacity(String waitlist_Capacity) {
		Waitlist_Capacity = waitlist_Capacity;
	}
	public String getCurrent_Waitlist_Total() {
		return Current_Waitlist_Total;
	}
	public void setCurrent_Waitlist_Total(String current_Waitlist_Total) {
		Current_Waitlist_Total = current_Waitlist_Total;
	}
	public String getHas_some_all_seats_reserved() {
		return Has_some_all_seats_reserved;
	}
	public void setHas_some_all_seats_reserved(String has_some_all_seats_reserved) {
		Has_some_all_seats_reserved = has_some_all_seats_reserved;
	}
	public String getBuild_code() {
		return Build_code;
	}
	public void setBuild_code(String build_code) {
		Build_code = build_code;
	}
}
