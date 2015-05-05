/***********************************************************
* Create the database named fizzbuzzy_db, its tables and 
populates it with dummy data
************************************************************/

DROP DATABASE IF EXISTS fizzbuzzy_db;

CREATE DATABASE fizzbuzzy_db;

USE fizzbuzzy_db;

CREATE TABLE Lesson (
	id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(50),
    authorName VARCHAR(50),
    score INT NOT NULL,
    totalStudents INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Lesson
(id, title, authorName, score, totalStudents)
VALUES
(1, 'Introduction to programming', 'Jeff Chen', 10000, 3),
(2, 'Data structures', 'Phuc Nguyen', 20000, 2);


CREATE TABLE Progress (
	id INT NOT NULL AUTO_INCREMENT,
    totalScore INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Progress
(id, totalScore)
VALUES 
(1,100),
(2,200),
(3,300),
(4,400),
(5,500);

CREATE TABLE Student (
	id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR (50),
    password VARCHAR (50),
    email VARCHAR(50),
    PRIMARY KEY (id)
);

INSERT INTO Student
(id, username, password, email)
VALUES
(1, 'phucnguyen','helloWorld', 'stylephuc@gmail.com'),
(2, 'jeffchen', 'gintaman', 'jeffrey.chen2537@gmail.com'),
(3, 'justin', 'justinuc', 'jkdahmubed@ucdavis.edu'),
(4, 'patrickdo','patrick', 'patrickspot@hotmail.com'),
(5, 'andrew', 'andrew01', 'apuentes01@gmail.com');

CREATE TABLE sequence (
  SEQ_NAME varchar(50) NOT NULL,
  SEQ_COUNT decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (SEQ_NAME)
);

INSERT INTO sequence VALUES ('SEQ_GEN',1);
