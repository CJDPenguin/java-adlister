USE adlister_db;
CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL ,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);
DROP TABLE IF EXISTS ads;
CREATE TABLE IF NOT EXISTS ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(200) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);
INSERT INTO ads (id, user_id, title, description)
VALUES (1,1,'playstation for sale', 'This is a slightly used playstation'),
       (2,1,'Super Nintendo', 'Get your game on with this old-school classic!'),
       (3,2,'Junior Java Developer Position', 'Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript'),
       (4,2, 'Javascript Developer needed', 'Must have strong Java skills');