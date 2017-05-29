create database if not exists hospitalFinal;
use hospitalFinal;

create table if not exists patients
(
CNP char(20) NOT NULL UNIQUE PRIMARY KEY,
nume char(50),
address char(50),
dateOfBirth char(50)
);

create table if not exists doctors
(
id_doc int NOT NULL UNIQUE PRIMARY KEY auto_increment,
nume char(50),
address char(50),
specializare char(50)
);

create table if not exists consultations
(
consultNr int NOT NULL UNIQUE PRIMARY KEY auto_increment,
doctorName char(50),
patientName char(50),
dateC char(50),
details char(50),
state char(50),
price int
);

create table if not exists users
(
id_user int not null unique primary key auto_increment,
username char(50),
parola char(50),
tip char(50)
);

create table if not exists diagnosis
(
simptom char(50) not null unique primary key,
boli char(50)
);


