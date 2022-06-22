CREATE TABLE Users
(
	User_Id SERIAL PRIMARY KEY,
	Name VARCHAR,
	Surname VARCHAR,
	Date_of_registration VARCHAR
);

CREATE TABLE Wallet
(
	Wallet_Id SERIAL PRIMARY KEY,
	Users_id Integer,
	Currency VARCHAR,
	Amount Integer,
	Created_date VARCHAR,
	FOREIGN KEY (Users_id) REFERENCES Users (User_Id)
);

INSERT INTO users (Name,Surname,Date_of_registration)
VALUES ('Angel','Black','12.06.2022');

INSERT INTO users (Name,Surname,Date_of_registration)
VALUES ('Galy','White','13.06.2022');

INSERT INTO wallet (Users_id,Currency,Amount,Created_date)
VALUES (1,'UAN',1000,'15.06.2022');

INSERT INTO wallet (Users_id,Currency,Amount,Created_date)
VALUES (2,'UAN',1000,'15.06.2022');

SELECT users.Name, wallet.Currency, wallet.Amount 
FROM users full JOIN wallet ON users.User_id = wallet.Users_id