
SELECT 		*
FROM 		`account` acc
LEFT JOIN 		department dep ON acc.department_id = dep.department_id;

SELECT 		A.email, A.user_name,A.full_name,A.position_id,A.create_date,A.department_id,A.department_name
FROM 		`Account` A
LEFT JOIN 		department USING(department_id);
SELECT 		*
FROM 		`Account` A
LEFT JOIN 		department USING(department_id);

SELECT		*
FROM		`Account`
WHERE		CreateDate < '2020-03-20';

SELECT		*
FROM		`Account` A
JOIN 	Position P ON A.position_id = P.position_id
WHERE		P.position_name = 'Dev';

SELECT 		*, COUNT(account_id)
FROM 		department
INNER JOIN 	`account` USING (department_id)
GROUP BY 	department_id
HAVING 		COUNT(department_id) >= 2;

SELECT		CQ.category_id, CQ.category_name, COUNT(Q.category_id) AS 'SO LUONG'
FROM		CategoryQuestion CQ 
LEFT JOIN 	Question Q ON CQ.category_id = Q.category_id
GROUP BY	CQ.category_id
ORDER BY	CQ.category_id ASC;

SELECT  *, COUNT(eq.question_id)
FROM   ExamQuestion eq
JOIN   Question q ON   q.question_id =eq.question_id
GROUP BY  eq.question_id
HAVING  COUNT(eq.question_id) = ( SELECT  COUNT(question_id)
 FROM   ExamQuestion
 GROUP BY  question_id 
                                            ORDER BY COUNT(question_id) DESC
 LIMIT  1);
 
SELECT		*, COUNT(category_id)
FROM		Question 
JOIN categoryquestion USING (category_id)
ORDER BY	category_id  ;

SELECT *, COUNT(exam_id)
FROM ExamQuestion
ORDER BY exam_id;

SELECT  *, COUNT(eq.question_id)
FROM   Answer EQ
JOIN   Question q ON   q.question_id =EQ.question_id
GROUP BY  EQ.question_id
HAVING  COUNT(eq.question_id) = ( SELECT  COUNT(question_id)
  FROM   Answer
  GROUP BY  question_id 
  ORDER BY COUNT(question_id) DESC
 LIMIT  1);
 
SELECT *, COUNT(1)
FROM `Account`
GROUP BY position_id
HAVING COUNT(1)= ( SELECT COUNT(1)
							 FROM `Account`
                             GROUP BY position_id
                             ORDER BY COUNT(1)
                             LIMIT 1
                             );

SELECT position_id,account_id,department_id,GROUP_CONCAT(position_name), COUNT(department_id)
FROM `Account`
JOIN position USING(position_id)
WHERE position_name IN ('Dev', 'Test', 'Scrum Master', 'PM')
GROUP BY department_id;
#13
SELECT *, COUNT(type_id)
FROM Question
JOIN TypeQuestion USING (type_id)
GROUP BY type_id;

SELECT *
FROM groupaccount
RIGHT JOIN `group` USING(group_id)
WHERE account_id IS NULL;

SELECT *
FROM `group`
LEFT JOIN groupaccount USING (group_id)
WHERE account_id IS NULL;

SELECT		T.type_name AS 'LOAI CAU HOI', COUNT(Q.type_id) AS 'SO LUONG'
FROM		Question Q 
INNER JOIN 	TypeQuestion T ON Q.type_id = T.type_id
GROUP BY	Q.type_id;






