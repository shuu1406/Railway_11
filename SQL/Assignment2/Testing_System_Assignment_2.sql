USE Testing_System_Assignment_1;
INSERT INTO Department(department_name)
VALUES ("A"),
	   ("B"),
       ("C"),
       ("D"),
       ("E");
INSERT INTO Position (position_name)
VALUES ("Dev"),
	   ("Dev"),
       ("Scrum Master"),
       ("PM"),
       ("PM");
INSERT INTO `Account`(email,user_name,full_name,department_id,position_id,create_date)
VALUES ("nghiadoan05@gmail.com","Nghia","Doan","1","1","2021/05/11"),
	   ("nghiadoan06@gmail.com","Nghiaa","Doann","2","2","2021/05/11"),
       ("nghiadoan07@gmail.com","Nghiaaa","Doannn","3","3","2021/05/11"),
       ("nghiadoan08@gmail.com","Nghiaaaa","Doannnn","4","4","2021/05/11"),
       ("nghiadoan09@gmail.com","Nghiaaaaa","Doannnnn","5","5","2021/05/11");
       
INSERT INTO `Group`(group_name,creator_id,create_date)
VALUES ("Alpha1","1","2021/05/11"),
	   ("Alpha2","2","2021/05/11"),
       ("Alpha3","3","2021/05/11"),
       ("Alpha4","4","2021/05/11"),
       ("Alpha5","5","2021/05/11");
INSERT INTO GroupAccount(group_id,account_id,join_date)
VALUES ("1","1","2021/05/11"),
       ("2","2","2021/05/11"),
       ("3","3","2021/05/11"),
       ("4","4","2021/05/11"),
       ("5","5","2021/05/11");
INSERT INTO TypeQuestion(type_name)
VALUES ("Essay"),
	   ("Essay"),
       ("Multiple-Choice"),
       ("Essay"),
       ("Multiple-Choice");
INSERT INTO CategoryQuestion(category_name)
VALUES ("Beta1"),
	   ("Beta2"),
       ("Beta3"),
       ("Beta4"),
       ("Beta5"); 
INSERT INTO Question(content,category_id,type_id,creator_id,create_date)
VALUES ("abcd","1","1","1","2021/05/11"),
	   ("abcde","2","2","2","2021/05/11"),
       ("abcdef","3","3","3","2021/05/11"),
       ("abcdefg","4","4","4","2021/05/11"),
       ("abcdefgh","5","5","5","2021/05/11");
INSERT INTO Answer(content,question_id,is_correct)
VALUES ("abcd","1","1"),
	   ("abcde","2","1"),
       ("abcdef","3","1"),
       ("abcdefg","4","1"),
       ("abcdefgh","5","0account");
INSERT INTO Exam(code,title,category_id,duration,creator_id,create_date)
VALUES ("144","ThiToan","1","60","1","2021/05/11"),
	   ("144","ThiToan","2","60","2","2021/05/11"),
       ("146","ThiToan","3","60","3","2021/05/11"),
       ("144","ThiVan","4","60","4","2021/05/11"),
       ("146","ThiVan","5","60","5","2021/05/11");
INSERT INTO  ExamQuestion(exam_id,question_id)
VALUES  ("1","1"),
		("2","2"),
        ("3","3"),
        ("4","4"),
        ("5","5");
       
	   
	   
       