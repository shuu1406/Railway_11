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

	SELECT		COUNT(TypeID)
    FROM		Question
    WHERE		MONTH(CreateDate) = Month(NOW());
	
END$$
DELIMITER ;

-- 4
DROP PROCEDURE IF EXISTS MaxQuestion;
DELIMITER $$
CREATE PROCEDURE MaxQuestion()
BEGIN

	WITH MAX_Count_TypeID AS(
		SELECT		COUNT(TypeID)
		FROM		Question 
		GROUP BY	TypeID
        ORDER BY	COUNT(TypeID) DESC
		LIMIT 		1
    )
    SELECT 		TypeID
    FROM		Question
    GROUP BY 	TypeID
    HAVING		COUNT(TypeID) = (SELECT * FROM MAX_Count_TypeID);	
	
END$$
DELIMITER ;

call MaxQuestion();


-- 5
DROP PROCEDURE IF EXISTS FindTypeQuestion;
DELIMITER $$
CREATE PROCEDURE FindTypeQuestion()
BEGIN

	WITH MAX_Count_TypeID AS(
		SELECT		COUNT(TypeID)
		FROM		Question 
		GROUP BY	TypeID
        ORDER BY	COUNT(TypeID) DESC
		LIMIT 		1
    )
    SELECT 		TQ.TypeName
    FROM		Question Q 
	INNER JOIN 	TypeQuestion TQ ON Q.TypeID = TQ.TypeID
    GROUP BY 	Q.TypeID
    HAVING		COUNT(Q.TypeID) = (SELECT * FROM MAX_Count_TypeID);		
	
END$$
DELIMITER ;

-- 6
DROP PROCEDURE IF EXISTS abc;
DELIMITER $$
CREATE PROCEDURE abc(IN StringInput VARCHAR(50))
BEGIN
	SELECT GroupName, UserName
    FROM	`Group` G
    JOIN 	GroupAccount GA ON GA.GroupID = G.GroupID
    JOIN	`Account` A ON A.AccountID = GA.AccountID
    WHERE 	GroupName LIKE '%StringInput%'  OR  Username LIKE '%StringInput%' ;
	
    
	
END$$
DELIMITER ;

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






    






