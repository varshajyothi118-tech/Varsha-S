CREATE TABLE Students (
    Student_ID INT PRIMARY KEY,
    Name VARCHAR(50) UNIQUE,
    Age INT,
    Date_of_Birth DATE,
    Email_ID VARCHAR(100) UNIQUE,
    Phone_Number VARCHAR(15) NOT NULL,
    Address VARCHAR(100)
);

INSERT INTO Students
(Student_ID, Name, Age, Date_of_Birth, Email_ID, Phone_Number, Address)
VALUES
(101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore'),

(102, 'Ananya', 19, '2007-02-20', 'ananya@gmail.com', '9876543211', 'Mysore'),

(103, 'Karthik', 21, '2005-09-10', 'karthik@gmail.com', '9876543212', 'Tumkur');
