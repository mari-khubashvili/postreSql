public class part2 {
// CREATE TABLE Towns (
//        towns_id SERIAL PRIMARY KEY,
//        towns_name VARCHAR(100)
//);
//
//    CREATE TABLE Students (
//            id SERIAL PRIMARY KEY,
//            name VARCHAR(50),
//    last_name VARCHAR(50),
//    id_num VARCHAR(20),
//    towns_id INT,
//    sqesi VARCHAR(10),
//    FOREIGN KEY (towns_id) REFERENCES Towns(towns_id)
//            );
//
//    INSERT INTO Towns (towns_name) VALUES
//('Tbilisi'),
//        ('Batumi'),
//        ('Kutaisi');
//
//    INSERT INTO Students (name, last_name, id_num, towns_id, sqesi) VALUES
//('Giorgi', 'Beridze', '12345678901', 1, 'Male'),
//        ('Ana', 'Gogoladze', '12345678902', 2, 'Female'),
//        ('Nika', 'Adamia', '12345678903', NULL, 'Male');
//
//    SELECT s.*, t.towns_name
//    FROM Students s
//    LEFT JOIN Towns t ON s.towns_id = t.towns_id;
//
//
//    CREATE TABLE Subjects (
//            subject_id SERIAL PRIMARY KEY,
//            subject_name VARCHAR(100)
//);
//
//    INSERT INTO Subjects (subject_name) VALUES
//('Math'),
//        ('Physics'),
//        ('History');
//
//    CREATE TABLE Student_Subject (
//            student_id INT,
//            subject_id INT,
//            FOREIGN KEY (student_id) REFERENCES Students(id),
//    FOREIGN KEY (subject_id) REFERENCES Subjects(subject_id),
//    PRIMARY KEY (student_id, subject_id)
//);
//
//    INSERT INTO Student_Subject VALUES
//            (1,1),
//(1,2),
//        (2,1),
//        (3,3);
//
//    SELECT s.name, s.last_name, s.id_num, sub.subject_name
//    FROM Students s
//    JOIN Student_Subject ss ON s.id = ss.student_id
//    JOIN Subjects sub ON ss.subject_id = sub.subject_id;
//
//
//    SELECT s.name, s.last_name, s.id_num, COUNT(ss.subject_id) AS subject_count
//    FROM Students s
//    LEFT JOIN Student_Subject ss ON s.id = ss.student_id
//    GROUP BY s.id, s.name, s.last_name, s.id_num;
//
//
//    CREATE OR REPLACE FUNCTION max_subjects()
//    RETURNS VARCHAR as $$
//    DECLARE
//    result VARCHAR;
//    BEGIN
//    SELECT s.id_num INTO result
//    FROM Students s
//    JOIN Student_Subject ss ON s.id = ss.student_id
//    GROUP BY s.id, s.id_num
//    ORDER BY COUNT(ss.subject_id) DESC
//    LIMIT 1;
//
//    RETURN result;
//    END;
//    $$ LANGUAGE plpgsql;
//
//    SELECT max_subjects();
//



}
