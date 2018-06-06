CREATE TABLE users
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    email varchar(100) DEFAULT NULL,
    createdDate TIMESTAMP,
    lastModifiedDate TIMESTAMP,
    PRIMARY KEY (id)
);