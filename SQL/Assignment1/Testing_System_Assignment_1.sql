DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
	department_id 			TINYINT AUTO_INCREMENT PRIMARY KEY ,
	department_name 		NVARCHAR(50) UNIQUE KEY NOT NULL
);

CREATE TABLE Position (
	position_id 			TINYINT AUTO_INCREMENT PRIMARY KEY ,
	position_name			ENUM('Dev','Test', 'Scrum Master', 'PM')
);
   
CREATE TABLE `Account` (
	account_id 			SMALLINT AUTO_INCREMENT PRIMARY KEY ,
	email 				VARCHAR(50) NOT NULL UNIQUE KEY,
	user_name 			VARCHAR(50) NOT NULL,
	full_name 			NVARCHAR(50) NOT NULL,
	department_id 		TINYINT NOT NULL,
	position_id 		TINYINT NOT NULL,
	create_date 		DATE,
    FOREIGN KEY (department_id) REFERENCES Department(department_id),
	FOREIGN KEY (position_id) REFERENCES Position (position_id)    
);
 
 CREATE TABLE `Group` (
	group_id 		TINYINT AUTO_INCREMENT PRIMARY KEY,
	group_name 		VARCHAR(50) NOT NULL UNIQUE KEY,
	creator_id 		SMALLINT NOT NULL,
	create_date DATE,
    FOREIGN KEY (creator_id) REFERENCES `Account`(account_id)
 );
 
CREATE TABLE GroupAccount (
	group_id 		TINYINT NOT NULL,
	account_id 		SMALLINT NOT NULL,
	join_date 		DATE,
    PRIMARY KEY(group_id,account_id),
    FOREIGN KEY (group_id) REFERENCES `Group`(group_id),
    FOREIGN KEY (account_id) REFERENCES `Account`(account_id)
);
 -- (1,2),(1,1),(1,3),(1,4)
 
CREATE TABLE TypeQuestion (
	type_id 		TINYINT AUTO_INCREMENT PRIMARY KEY ,
	type_name 		ENUM('Essay','Multiple-Choice')
);
  
CREATE TABLE CategoryQuestion (
	category_id 	TINYINT AUTO_INCREMENT PRIMARY KEY ,
	category_name 	NVARCHAR(50)
);
 
CREATE TABLE Question (
	question_id 	SMALLINT AUTO_INCREMENT PRIMARY KEY ,
	content 		TEXT,
	category_id 	TINYINT,
	type_id 		TINYINT,
	creator_id 		SMALLINT,
	create_date 	DATE,
    FOREIGN KEY (type_id) REFERENCES TypeQuestion(type_id),
    FOREIGN KEY (creator_id) REFERENCES `Account`(account_id),
	FOREIGN KEY (category_id) REFERENCES `CategoryQuestion`(category_id)
);
 
CREATE TABLE Answer (
	answer_id 		SMALLINT AUTO_INCREMENT PRIMARY KEY,
	content 		TEXT,
	question_id 	SMALLINT,
	is_correct 		BOOLEAN,
    -- BIT,BOOLEAN,Enum('True','False')
	FOREIGN KEY (question_id) REFERENCES Question(question_id)
);
-- (1,2),(1,3)
CREATE TABLE Exam (
	exam_id 		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	code 			CHAR(50) NOT NULL,
	title 			NVARCHAR(50) NOT NULL,
	category_id 	TINYINT NOT NULL,
	duration 		TINYINT UNSIGNED NOT NULL, 
	creator_id 		SMALLINT NOT NULL,
	create_date 	DATE,
    FOREIGN KEY (category_id) REFERENCES `CategoryQuestion`(category_id),
    FOREIGN KEY (creator_id) REFERENCES `Account`(account_id)
);
CREATE TABLE ExamQuestion (
	exam_id 		SMALLINT UNSIGNED NOT NULL,
	question_id 	SMALLINT NOT NULL,
	PRIMARY KEY (exam_id,question_id),
	FOREIGN KEY (exam_id) REFERENCES Exam(exam_id),
	FOREIGN KEY (question_id) REFERENCES `Question`(question_id)
);
 