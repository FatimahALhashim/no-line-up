CREATE DATABASE Student;

USE Student;

CREATE TABLE TimeTable(Student_Id int , Holds VARCHAR(255), CourseCode VARCHAR(10),  CourseName VARCHAR(255),
 Professor VARCHAR(255), Room VARCHAR(10), TimeSlot VARCHAR(255),DaySlot VARCHAR(50));

INSERT INTO TimeTable VALUES(300645794, "Financial", "SWS-110", "Intro to Software Engineering", "Mr.Bob","A322",
"10:30 AM - 12:30 PM", "Monday");
INSERT INTO TimeTable VALUES(300645794, "Financial", "SWS-120", "Intro to Web Design","Ms.Cinthia", "A311",
 "12:30 PM - 2:30 PM", "Tuesday");
INSERT INTO TimeTable VALUES(300645794, "Financial", "SWS-140", "Intro to Networking Theories", "Mr.Robert","A313",
"10:30 AM - 12:30 PM", "Wednesday");
INSERT INTO TimeTable VALUES(300645794, "Financial", "BUS-110", "Business 101", "Mr.Jack", "C112",
 "8:30 AM - 10:30 PM", "Thursday");
INSERT INTO TimeTable VALUES(300689548, "None", "SWS-110", "Intro to Software Engineering", "Mr.Bob","A322",
"10:30 AM - 12:30 PM", "Monday");
INSERT INTO TimeTable VALUES(300456187, "Academic", "SWS-210", "Advanced Web Development", "Mr.James", "A322",
"10:30 AM - 12:30 PM", "Friday");
INSERT INTO TimeTable VALUES(300456187, "Academic", "SWS-220", "Advanced Software Development", "Mrs. Lucas", "A332",
"4:30 PM - 6:30 PM", "Monday");
INSERT INTO TimeTable VALUES(300456187, "Academic", "SWS-230", "Intermediate Networking Techniques", "Mr.Bob", "A317", 
"10:30 AM - 12:30 PM", "Tuesday");
INSERT INTO TimeTable VALUES(300456187, "Academic", "BUS-220", "Marketing", "Ms. Shawna", "D221",
"2:30 PM - 4:30 PM", "Tuesday");
INSERT INTO TimeTable VALUES(300321564, "None", "SWS-310", "Software Programming 1", "Ms. Andrews", "A332",
"2:30 PM - 4:30 PM", "Monday");
INSERT INTO TimeTable VALUES(300321564, "None", "SWS-320", "Technical Writing", "Mr.Steve", "A312", 
"10:30 AM - 12:30 PM", "Wednesday");
INSERT INTO TimeTable VALUES(300321564, "None", "SWS-312", "Web Application and Services", "Mrs. Ng", "B314", 
"4:30 PM - 6:30 PM", "Monday");
