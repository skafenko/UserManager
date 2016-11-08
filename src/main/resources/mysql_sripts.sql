CREATE DATABASE IF NOT EXISTS test;
DROP TABLE IF EXISTS test.users;

CREATE TABLE test.users ( id bigint(20) NOT NULL AUTO_INCREMENT,
							              name varchar(255),
                            age int(3),
                            admin bit(1),
                            createdDate date,
                            PRIMARY KEY (id) )  DEFAULT CHARSET=utf8;
                            
INSERT INTO test.users (id, name, age, admin, createdDate) VALUES
(17, 'Vyacheslav', 19, 1, '2016-08-27'),
(20, 'Mikhailo', 20, 0, '2015-09-25'),
(28, 'Elena', 18, 1, '2014-10-12'),
(29, 'Sara', 58, 0, '2012-11-09'),
(31, 'Nikol', 22, 1, '2013-12-14'),
(33, 'Tolik', 28, 1, '2016-01-22'),
(34, 'Andrew', 66, 1, '2015-02-04'),
(35, 'Erick', 82, 0, '2014-03-15'),
(36, 'Fishman', 75, 1, '2013-04-13'),
(37, 'Freeman', 81, 0, '2012-05-24'),
(38, 'Din', 45, 0, '2011-06-30'),
(39, 'Sam', 56, 0, '2016-07-27'),
(42, 'Marry', 18, 1, '2015-08-28'),
(43, 'Daws', 25, 0, '2014-09-23'),
(44, 'Cody', 44, 0, '2013-02-18'),
(45, 'Masha', 12, 1, '2012-03-19');
