DROP DATABASE TestManagement;
CREATE DATABASE TestManagement;
USE TestManagement;

CREATE TABLE Departments (
	department_id		TINYINT AUTO_INCREMENT PRIMARY KEY, 
    department_name		NVARCHAR(50) NOT NULL UNIQUE KEY
    );
CREATE TABLE `Position` (
	position_id			TINYINT AUTO_INCREMENT PRIMARY KEY,
    position_name		ENUM('Dev','Test','Scrum Master', 'PM') NOT NULL
    );
CREATE TABLE `Account` (
	account_id			INT AUTO_INCREMENT PRIMARY KEY,
    email				VARCHAR(50),
    username			VARCHAR(50),
    fullname			NVARCHAR(50),
    department_id		INT,
    position_id			INT,
    create_date			DATE,
    FOREIGN KEY (department_id) REFERENCES  Departments  (department_id),
	FOREIGN KEY (position_id) REFERENCES  `Position` (position_id)

);
CREATE TABLE `Group` (
	group_id			INT AUTO_INCREMENT PRIMARY KEY,
    group_name			NVARCHAR(50),
    creator_id			INT,
    create_date		    DATE
);
CREATE TABLE GroupAccount (
	group_id			INT,
    account_id			INT,
    join_date			DATE,
    FOREIGN KEY (group_id) REFERENCES `Group` (group_id),
	FOREIGN KEY (account_id) REFERENCES  `Account`(account_id)

);
CREATE TABLE TypeQuestion (
	type_id				INT AUTO_INCREMENT PRIMARY KEY,
    type_name			ENUM('Essay','Multiple-Choice')
);
CREATE TABLE CategoryQuestion (
	category_id			INT AUTO_INCREMENT PRIMARY KEY,
    category_name		NVARCHAR(50)
);
CREATE TABLE Question (
	question_id 		INT AUTO_INCREMENT PRIMARY KEY,
    content				NVARCHAR(50),
    category_id			INT,
    type_id				INT,
    creator_id			INT,
    create_date			DATE,
    FOREIGN KEY ( creator_id ) REFERENCES `Group`( creator_id ),
    FOREIGN KEY ( create_date) REFERENCES `Group`( create_date)
);
CREATE TABLE Answer (
	answer_id 			INT AUTO_INCREMENT PRIMARY KEY,
    content 			NVARCHAR(50),
    question_id			INT,
    isCorrect			ENUM('correct','incorrect'),
    FOREIGN KEY (question_id) REFERENCES Question(question_id)
);
CREATE TABLE Exam (
	exam_id				INT AUTO_INCREMENT PRIMARY KEY,
    code1				INT,
    title				NVARCHAR(50),
    category_id			INT,
    duration			TIME,
    creator_id			INT,
    create_date			DATE,
    FOREIGN KEY ( creator_id ) REFERENCES `Group`( creator_id ),
    FOREIGN KEY ( create_date) REFERENCES `Group`( create_date)
);
CREATE TABLE ExemQuestion (
	exam_id				INT,
    question_id			INT,
    FOREIGN KEY (exam_id) REFERENCES Exam(exam_id)
);
    