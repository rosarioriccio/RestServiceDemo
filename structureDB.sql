DROP USER 'Demo1'@'localhost';
DROP TABLE seller;
DROP TABLE shop;
CREATE TABLE shop(
	ID int NOT NULL AUTO_INCREMENT,
	name_shop varchar(255) NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE seller(
	ID int NOT NULL AUTO_INCREMENT,
	shop_id int NOT NULL,
	name varchar(255) NOT NULL,
	PRIMARY KEY(ID),
	FOREIGN KEY(shop_id) REFERENCES shop(ID) ON DELETE CASCADE 
);


INSERT INTO shop (name_shop) VALUES ("A");
INSERT INTO shop (name_shop) VALUES ("B");

INSERT INTO seller (shop_id,name) VALUES (1,"MARIO");
INSERT INTO seller (shop_id,name) VALUES (2,"PASQUALE");

CREATE USER 'Demo1'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON restServiceDemo.* TO 'Demo1'@'localhost';
