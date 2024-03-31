USE OOP_schema;
create table users (
	id int not null,
    username varchar(12) not null,
    password varchar(30) not null,
    user_name nvarchar(50) not null
);
alter table users
add constraint pk_users primary key(username);
INSERT INTO users (id, username, password, user_name) 
VALUES 
(1, '066205003632', 'viethung', N'Nguyễn Việt Hùng');
create table candidate (
	name nvarchar(50) not null,
    gender nvarchar(3) not null,
    birthdate datetime not null,
    birthplace nvarchar(50) not null,
    nation nvarchar(30) not null,
    personal_id varchar(12) not null,
    livingaddress nvarchar(100) not null,
    highschool nvarchar(50) not null,
    mobilephone varchar(10) not null,
    email varchar(50) not null,
    contactaddress nvarchar(100) not null,
    thptqg int not null,
    edumethod varchar(4) not null,
    freecandidate nvarchar(30),
    math int,
    literature int,
    science int,
    social int,
    foreign_language int,
    physic int,
    chemistry int,
    bio int,
    history int,
    geography int,
    gdcd int
);
alter table candidate
add constraint pk_candiate primary key(personal_id);
alter table candidate
add constraint fk_can_user foreign key (personal_id) references users(username);
create table testinfo (
	personal_id varchar(12) not null primary key,
	candidateid varchar(12) not null,
    testvenue nvarchar(50) not null,
    checkintime datetime not null,
    testroom varchar(10) not null
);
alter table testinfo
add constraint fk_testi4_user foreign key (personal_id) references users(username);
create table subjectinfo (
	personal_id varchar(12) not null,
	subject_column varchar(50) not null,
    literature_column varchar(50) not null, 
    math_column varchar(50) not null,
    physic_column varchar(50) not null,
    chemistry_column varchar(50) not null,
    bio_column varchar(50) not null,
    foreignlanguage_column varchar(50) not null,
    history_column varchar(50) not null,
    geo_column varchar(50) not null,
    gdcd_column varchar(50) not null
);
alter table subjectinfo
add constraint fk_subjecti4_user foreign key (personal_id) references users(username);
INSERT INTO subjectinfo (personal_id, subject_column, literature_column, math_column, physic_column,chemistry_column,bio_column,foreignlanguage_column,history_column,geo_column,gdcd_column)
VALUES 
('066205003632','Phòng thi', 'A131','A131','A301','A301','A301','A302','X','X','X'),
('066205003632','Ngày thi','07-04','07-04','08-04','08-04','08-04','08-04','X','X','X'),
('066205003632','Giờ phát đề','09h00','14h00','07h30','08h30','09h30','14h20','X','X','X'),
('066205003632','Giờ làm bài','09h05','14h05','07h35','08h35','09h35','14h30','X','X','X');
CREATE TABLE request (
	personal_id VARCHAR(12) NOT NULL,
    request_order INT NOT NULL,
    uni_name NVARCHAR(100) NOT NULL,
    major NVARCHAR(50) NOT NULL,
    training_unit NVARCHAR(20) NOT NULL,
    training_program NVARCHAR(50) NOT NULL
);
alter table request
add constraint fk_request_user foreign key (personal_id) references users(username);
CREATE TABLE score (
	personal_id VARCHAR(12) not null primary key,
    math double not null,
    literature double not null,
    foreignlanguage double not null,
    physic varchar(3) not null,
    chemistry varchar(3) not null,
    bio varchar(3) not null,
    history varchar(3) not null,
    geography varchar(3) not null,
    gdcd varchar(3) not null
);
alter table score
add constraint fk_score_user foreign key (personal_id) references users(username);