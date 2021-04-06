DROP TABLE IF EXISTS students;

CREATE TABLE students (
  student_id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  date_of_birth date NOT NULL,
  year_of_enrollment VARCHAR(4) NOT NULL,
  degree VARCHAR(50) NOT NULL,
  advisor VARCHAR(255) NOT NULL,
  enrollment_status VARCHAR(50) NOT NULL
);