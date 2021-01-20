CREATE TABLE IF NOT EXISTS auth_server."user"
(
    username VARCHAR(45) NULL PRIMARY KEY,
    password TEXT        NULL
);
CREATE TABLE IF NOT EXISTS auth_server.otp
(
    username VARCHAR(45) NOT NULL PRIMARY KEY,
    code     VARCHAR(45) NULL
);