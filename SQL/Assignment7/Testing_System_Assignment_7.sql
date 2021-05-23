-- 1
DROP TRIGGER IF EXISTS trigger_create_time;
DELIMITER $$
CREATE TRIGGER 		trigger_create_time
BEFORE INSERT ON 	question 
FOR EACH ROW 		
BEGIN
	IF	(SELECT DATE_SUB(NOW(), INTERVAL 1 YEAR))  THEN
		SIGNAL SQLSTATE 	'12345' 
        SET MESSAGE_TEXT = 	"lỗi CreateDate";
    END IF;

END $$
DELIMITER ;

INSERT INTO Question	(Content			, CategoryID, TypeID		, CreatorID	, CreateDate )
VALUES 					(N'Câu hỏi về Java ',	1		,   '1'			,   '2'		,'2019-04-05');

-- 2
DROP TRIGGER IF EXISTS trigger_add_user;
DELIMITER $$
CREATE TRIGGER 		trigger_add_user
BEFORE INSERT ON 	`Account` 
FOR EACH ROW 		
BEGIN
	DECLARE 	departmentid_new INT;
    
    SELECT 		DepartmentID INTO departmentid_new
    FROM 		department
    WHERE 		DepartmentName = 'Sale';
    
    IF 			NEW.DepartmentID = departmentid_new THEN
				SIGNAL SQLSTATE '12345' 
				SET MESSAGE_TEXT = 'Department Sale can not add more user';
	END IF;	
END$$
DELIMITER ;

INSERT INTO `Account`(Email	, Username		, FullName	, DepartmentID	, PositionID)
VALUES 				('test'	, 'test'		,'test'		,   '2'			,   '2'		);

-- 3
DROP TRIGGER IF EXISTS 	trigger_new_group;
DELIMITER $$
CREATE TRIGGER 			trigger_new_group
BEFORE INSERT ON 		GroupAccount
FOR EACH ROW 		
BEGIN
	DECLARE		Count_users_of_group INT;
    set			Count_users_of_group = 0;
    SELECT 		COUNT(1) INTO Count_users_of_group
    FROM		`GroupAccount`
    WHERE		GroupID = NEW.GroupID
    GROUP By	GroupID;
		IF Count_users_of_group >= 5 THEN
         SIGNAL SQLSTATE '12345' 
		 SET MESSAGE_TEXT = "Khong the them account ";
         END IF;
END$$
DELIMITER ;
INSERT INTO `GroupAccount` (GroupID ,AccountID,JoinDate)
VALUES					   (1,4,'2019-1-1');

-- 4
DROP TRIGGER IF EXISTS 	trigger_new_question;
DELIMITER $$
CREATE TRIGGER 			trigger_new_question
BEFORE INSERT ON 		ExamQuestion
FOR EACH ROW 		
BEGIN
	DECLARE		Count_questions_of_exam INT;
    set			Count_questions_of_exam = 0;
    SELECT 		COUNT(1) INTO Count_questions_of_exam
    FROM		ExamQuestion
    WHERE		ExanID = NEW.ExamID
    GROUP By	ExamQuestion;
		IF Count_questions_of_exam >= 10 THEN
         SIGNAL SQLSTATE '12345' 
		 SET MESSAGE_TEXT = "Khong the them question ";
         END IF;
END$$
DELIMITER ;



-- 5

DROP TRIGGER IF EXISTS 	delete_account;
DELIMITER $$
CREATE TRIGGER 			delete_account
BEFORE DELETE ON 		`Account`
FOR EACH ROW 		
BEGIN
	DECLARE		in_AccountID INT ;
	SELECT 		AccountID INTO in_AccountID
    FROM 		`Account`
    WHERE		Email = OLD.Email;
			IF OLD.Email = "admin@gmail.com" THEN 
				SIGNAL SQLSTATE '12345' 
				SET MESSAGE_TEXT = 'Khong duoc xoa!';
			ELSE 
				DELETE FROM GroupAccount WHERE account_id = in_AccountID;
				UPDATE `Group` 	SET CreatorID = NULL WHERE creator_id = in_AccountID;
				UPDATE Exam 	SET CreatorID = NULL WHERE creator_id = in_AccountID;
				UPDATE Question SET CreatorID = NULL WHERE creator_id = in_AccountID;
    END IF;
END$$
DELIMITER ;

DELETE FROM `Account`
WHERE email = "admin@gmail.com";

-- 6
DROP TRIGGER IF EXISTS 	add_account;
DELIMITER $$
CREATE TRIGGER 			add_account
BEFORE INSERT ON 		`Account`
FOR EACH ROW 		
BEGIN
	
		IF NEW.DepartmentID IS NULL THEN 
				SET NEW.DepartmentID = 10;
		END IF;
END$$
DELIMITER ;
-- 7
DROP TRIGGER IF EXISTS 	q7;
DELIMITER $$
CREATE TRIGGER 			q7
BEFORE INSERT ON 		Answer
FOR EACH ROW 		
BEGIN
	DECLARE 	count_answer INT;
    DECLARE 	count_answer_true INT;
    SET			count_answer = 0;
    SET			count_answer_true = 0;
    SELECT		COUNT(1) INTO count_answer 
    FROM 		Answer
    WHERE		QuestionID = NEW.QuestionID
    GROUP BY	QuestionID;
    IF 	count_answer >= 4 THEN 
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT = 'Da du 4 cau tra loi, k the them';
	END IF;
    
    SELECT		COUNT(1) INTO count_answer_true 
    FROM 		Answer
    WHERE		QuestionID = NEW.QuestionID AND isCorrect = 1 
    GROUP BY	QuestionID;
    IF 	count_answer_true >= 2 && NEW.isCorrect = 1 THEN 
		SIGNAL SQLSTATE '12345' 
		SET MESSAGE_TEXT = "da du 2 cau tra loi dung";
	END IF;
END$$
DELIMITER ;

INSERT INTO Answer	(  Content		, QuestionID	, isCorrect	)
VALUES 				(N'Trả lời 01'	,   2			,0	);








-- 12

SELECT *,
	CASE
			WHEN Duration <= 30 THEN "Short Time"
            WHEN Duration > 30 && Duration <= 60 THEN "Medium Time"
            WHEN Duration > 60 THEN "Long Time"
            ELSE "Không xác định"
	END AS DurationTime
FROM Exam;

SELECT * FROM Exam;
-- 13
SELECT GA.GroupID, COUNT(AccountID),
CASE
			WHEN COUNT(AccountID) <= 5 THEN "Few"
            WHEN COUNT(AccountID) > 5 && COUNT(GroupID) <= 20 THEN "Normal"
            WHEN COUNT(AccountID) > 20 THEN "Higher"
            ELSE "Không xác định"
	END AS the_number_user_amount
FROM GroupAccount GA
GROUP BY GroupID;

-- 14
SELECT D.DepartmentName,
CASE
			WHEN COUNT(A.AccountID) = 0 THEN "Không có user nào"
            ELSE COUNT(A.AccountID)
	END AS the_number_of_users
FROM Department D
LEFT JOIN `Account` A ON D.DepartmentID = A.DepartmentID
GROUP BY D.DepartmentID;

