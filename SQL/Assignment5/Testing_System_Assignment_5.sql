SET FOREIGN_KEY_CHECKS = 0;
CREATE VIEW abc AS 
SELECT *
FROM `Account`;
-- 1
CREATE VIEW DSNV AS
SELECT A.*, DepartmentName D
FROM `Account` A
INNER JOIN Department D ON A.departmentID = D.departmentID
WHERE DepartmentName = 'Sale';
 
DROP VIEW DSNV;
-- 2
CREATE VIEW View2 AS
SELECT A.*, COUNT(GA.AccountID)
FROM `Account` A
INNER JOIN groupaccount GA ON A.accountid = GA.accountid
GROUP BY A.accountid
HAVING COUNT(GA.accountid) = ( SELECT COUNT(GA.AccountID) 
								FROM `Account` 
                                INNER JOIN groupaccount GA ON A.accountid = GA.accountid
                                GROUP BY A.accountid
                                ORDER BY COUNT(GA.AccountID) DESC
                                LIMIT 1  ) ;
-- 3
CREATE VIEW View3 AS
SELECT  Q.*,length(content)
FROM Question Q
WHERE length(content) >= 18;




-- 4
CREATE VIEW 	View4 AS
SELECT 			D.*, COUNT(A.DepartmentID)
FROM 			Department D
INNER JOIN 		`Account` A ON D.DepartmentID = A.DepartmentID
GROUP BY		D.DepartmentID
HAVING 			COUNT(A.DepartmentID) = (SELECT 		COUNT(A.DepartmentID)
										FROM			department D 
										INNER JOIN 		`Account` A ON D.DepartmentID = A.DepartmentID
										GROUP BY		D.DepartmentID
										ORDER BY		COUNT(A.DepartmentID) DESC
										LIMIT			1
										);
                                        
-- 5
CREATE VIEW 	View5 AS
SELECT 			Q.*, A.FullName
FROM 			Question Q
INNER JOIN 		`Account` A ON Q.CreatorID = A.AccountID
WHERE 			FullName LIKE 'Nguyen_%' ;
			
WITH cte_1 (AccountID,Email) as (
 SELECT AccountID,Email
 FROM `Account`
 )
 SELECT *
 FROM cte_1;
 


