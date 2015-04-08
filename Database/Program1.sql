USE Student;
/* Priority is how necessary the course is to the program with 1 being the highest, 2 being being less, and so forth. */

CREATE TABLE Program1(Semester int, CourseCode VARCHAR(10), Priority int);

INSERT INTO Program1 VALUES( 1, "SWS-110", 1);
INSERT INTO Program1 VALUES( 1, "BUS-110", 5); 
INSERT INTO Program1 VALUES( 2, "SWS-210", 1); 
INSERT INTO Program1 VALUES( 3, "SWS-310", 1);   