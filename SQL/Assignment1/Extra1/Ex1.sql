DROP DATABASE IF EXISTS Quanli;
CREATE DATABASE IF NOT EXISTS Quanli;
USE Quanli;
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee
(
TraineeID		TINYINT AUTO_INCREMENT NOT NULL UNIQUE KEY,
FullName		NVARCHAR(50) NOT NULL,
BirthDate		DATE NOT NULL,
Gender			ENUM('male','female','unknown'),
ET_IQ			TINYINT CHECK( 0<ET_IQ && 20 >ET_IQ) NOT NULL,
ET_Gmath		TINYINT CHECK(0<ET_Gmath && 20>ET_Gmath) NOT NULL,
ET_English		TINYINT CHECK(0<ET_English && 50>ET_English) NOT NULL,
TrainingClass	INT,
EvaluationNotes CHAR,
VTI_Account		VARCHAR(50) NOT NULL UNIQUE KEY
);