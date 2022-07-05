CREATE TABLE library
(
    Book_Id SERIAL PRIMARY KEY,
    Name VARCHAR,
    Author VARCHAR,
    Categorize VARCHAR,
    Year INTEGER
);

INSERT INTO library (Name,Author,Categorize,Year)
VALUES ('Pixar','Lorens Levi','business, entrepreneurship',2000);

INSERT INTO library (Name,Author,Categorize,Year)
VALUES ('Marketing hack','Fill Barden','Marketing',2011);

INSERT INTO library (Name,Author,Categorize,Year)
VALUES ('The Great Gatsby','Francis Scott Fitzgerald','romance, drama, melodrama',1925);

INSERT INTO library (Name,Author,Categorize,Year)
VALUES ('SHORT STORIES','Agatha Christie','detective, adventure',1950);

INSERT INTO library (Name,Author,Categorize,Year)
VALUES ('ALICES ADVENTURE IN WONDERLAND','Lewis Carroll','fantasy',1865);