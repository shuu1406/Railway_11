USE TestingSystem;

-- 1
DROP PROCEDURE IF EXISTS getInfoAccount
DELIMITER $$ 
CREATE PROCEDURE getInfoAccount(IN DepartmentName1 NVARCHAR(100))
	BEGIN 
		SELECT *
        FROM `Account`
        JOIN Department USING (departmentID)
        WHERE DepartmentName = DepartmentName1;
    END $$
    DELIMITER ;
    
-- 2
DROP PROCEDURE IF EXISTS getNumberOfAccount
DELIMITER $$ 
CREATE PROCEDURE getNumberOfAccount(IN GroupID1 INT)
	BEGIN 
		SELECT GroupID, COUNT(AccountID)
        FROM GroupAccount
        WHERE GroupID = GroupID1;
    END $$
    DELIMITER ;
    
-- 3
DROP PROCEDURE IF EXISTS QuestionOfMonth;
DELIMITER $$
CREATE PROCEDURE QuestionOfMonth()
BEGIN

	SELECT		*,COUNT(TypeID)
    FROM		Question
    WHERE		MONTH(CreateDate) = Month(NOW()) and YEAR(CreateDate) = YEAR(NOW())
	GROUP BY	TypeID ;

	
END$$
DELIMITER ;

-- 4
DROP PROCEDURE IF EXISTS get_typeID_question;
DELIMITER $$
CREATE PROCEDURE get_typeID_question( OUT out_typeID_of_question TINYINT UNSIGNED)
BEGIN
		SELECT Q.TypeID INTO out_typeID_of_question
		FROM Question Q
		JOIN TypeQuestion TQ ON TQ.TypeID=Q.TypeID
		GROUP BY Q.TypeID
		HAVING COUNT(Q.QuestionID)=(SELECT COUNT(Q1.QuestionID)
									FROM Question Q1
									JOIN TypeQuestion TQ1 ON TQ1.TypeID=Q1.TypeID
									GROUP BY Q1.TypeID
									ORDER BY COUNT(Q1.QuestionID) DESC
									LIMIT 1 )
		ORDER BY Q.TypeID DESC
		LIMIT 1;
END $$
DELIMITER $$;


-- 5
DROP PROCEDURE IF EXISTS get_typeID_question5;
DELIMITER $$
CREATE PROCEDURE get_typeID_question5()
BEGIN
		DECLARE TypeID TINYINT;
        SET		TypeID = 0;
        CALL 	get_typeID_question(typeID);
        SELECT	*
        FROM	TypeQuestion T
        WHERE	T.TypeID = TypeID;
END $$
DELIMITER $$;
CALL testingsystem.get_typeID_question5();
-- 6
DROP PROCEDURE IF EXISTS abc;
DELIMITER $$
CREATE PROCEDURE abc(IN StringInput VARCHAR(50))
BEGIN
	SELECT *
    FROM	`Account`
    JOIN 	GroupAccount GA ON GA.GroupID = G.GroupID
    JOIN	`Account` A ON A.AccountID = GA.AccountID
    WHERE 	GroupName LIKE '%StringInput%'  OR  Username LIKE '%StringInput%' ;
	
    
	
END$$
DELIMITER ;
-- 6
DROP PROCEDURE IF EXISTS question6;
DELIMITER $$
CREATE PROCEDURE question6(IN input NVARCHAR(50))
BEGIN
	SELECT AccountID,UserName,'Account'
    FROM	`Account`
    WHERE 	UserName LIKE concat('%' , input ,  '%')
    UNION 
    SELECT GroupID,GroupName,'Group'
    FROM	`Group`
    WHERE 	GroupName LIKE concat('%' , input ,  '%');
END$$
DELIMITER ;
call question6('vti');
-- 7
DROP PROCEDURE IF EXISTS abcd;
DELIMITER $$
CREATE PROCEDURE abcd(	IN	in_email VARCHAR(50), IN in_fullName NVARCHAR(50))						
BEGIN
	DECLARE Username VARCHAR(50) DEFAULT SUBSTRING_INDEX(in_email,'@',1);
    DECLARE PositionID TINYINT UNSIGNED DEFAULT 1;
    DECLARE DepartmentID TINYINT UNSIGNED DEFAULT 10;
	INSERT INTO `Account` 	(Email		,Username, FullName		, DepartmentID,	PositionID)
    VALUE					(in_email	,Username, in_fullName	, DepartmentID, PositionID);
	
    SELECT 	*
    FROM 	`Account`A
    WHERE	A.Username = Username;
	
END$$
DELIMITER ;

-- 8
DROP PROCEDURE IF EXISTS abcde;
DELIMITER $$
CREATE PROCEDURE abcde(	IN	Type_Question ENUM('Essay','Multiple-Choice') )						
BEGIN
	SELECT Content, MAX(LENGTH(Content))
    FROM Question
    
	
END$$
DELIMITER ;






    






