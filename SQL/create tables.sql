
CREATE TABLE svr (
  id varchar(5) PRIMARY KEY,
  name varchar(15),
  address varchar(30),
  port varchar(5),
  adminLogin varchar(15)
)ENGINE = InnoDB;

CREATE TABLE usr (
  login varchar(15) PRIMARY KEY,
  passHash varchar(128)
)ENGINE = InnoDB;

CREATE TABLE rights (
  usrLogin varchar(15),
  svrId varchar(5)
)ENGINE = InnoDB;

ALTER TABLE rights
  ADD PRIMARY KEY (usrLogin,svrId),
  ADD FOREIGN KEY (svrId) REFERENCES svr(id),
  ADD FOREIGN KEY (usrLogin) REFERENCES usr(login);

ALTER TABLE svr
  ADD FOREIGN KEY (adminLogin) REFERENCES usr(login);

