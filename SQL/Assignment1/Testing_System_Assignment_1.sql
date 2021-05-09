DROP DATABASE TestManagement;
CREATE DATABASE TestManagement;
USE TestManagement;

CREATE TABLE Departments (
	department_id		INT,
    department_name		VARCHAR(50)
    );
CREATE TABLE Position (
	position_id			INT,
    position_name		VARCHAR(50)
    );
CREATE TABLE Account1 (
	account_id			INT,
    email				VARCHAR(50),
    username			VARCHAR(50),
    fullname			VARCHAR(50),
    department_id		INT,
    position_id			INT,
    create_date			DATE
);
CREATE TABLE Group1 (
	group_id			INT,
    group_name			VARCHAR(50),
    creator_id			INT,
    create_date		    DATE
);
CREATE TABLE GroupAccount (
	group_id			INT,
    account_id			INT,
    join_date			DATE
);
CREATE TABLE TypeQuestion (
	type_id				INT,
    type_name			VARCHAR(50)
);
CREATE TABLE CategoryQuestion (
	category_id			INT,
    category_name		VARCHAR(50)
);
CREATE TABLE Question (
	question_id 		INT,
    content				VARCHAR(50),
    category_id			INT,
    type_id				INT,
    creator_id			INT,
    create_date			DATE
    
);
CREATE TABLE Answer (
	answer_id 			INT,
    content 			VARCHAR(50),
    question_id			INT,
    isCorrect			ENUM('correct','incorrect')
);
CREATE TABLE Exam (
	exam_id				INT,
    code1				INT,
    title				VARCHAR(50),
    category_id			INT,
    duration			TIME,
    creat_id			INT,
    creat_date			DATE
);
CREATE TABLE ExemQuestion (
	exam_id				INT,
    question_id			INT
);
    