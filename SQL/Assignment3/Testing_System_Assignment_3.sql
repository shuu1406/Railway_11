#2
SELECT 		* 
FROM 		Department;
#3
SELECT 		department_id 
FROM 		Department 
WHERE 		department_name = 'Sale';
#4
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(full_name) = (SELECT MAX(LENGTH(full_name)) FROM `Account`) ;

#5
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(full_name) = (SELECT MAX(LENGTH(full_name)) FROM `Account`) AND department_id = 3 ;

#6
SELECT 		group_name 
FROM 		`Group` 
WHERE 		create_date < '2019-12-20';
#7
SELECT 		question_id
FROM 		Answer
GROUP BY 	question_id
HAVING 		COUNT(question_id) >= 4;
 #8
SELECT *
FROM Exam
WHERE duration >= 60 AND create_date < '2019-12-20';

#9
SELECT *
FROM `Group`
ORDER BY create_date DESC
LIMIT 5;
#10
SELECT COUNT(account_id)
FROM `Account`
WHERE department_id = 2;
#11
SELECT full_name
FROM `Account`
WHERE full_name LIKE 'D%o';
#12
DELETE 
FROM Exam
WHERE create_date < '2019-12-20';
#13
SELECT *
FROM Question;
DELETE
FROM question
WHERE content LIKE 'cau hoi _%';

#14
UPDATE `Account`
SET full_name = "Nguyễn Bá Lộc",
	email = "loc.nguyenba@vti.com.vn"
WHERE account_id = 5;
#15
UPDATE 		`GroupAccount` 
SET 		account_id = 5 
WHERE 		group_id = 4;
    
