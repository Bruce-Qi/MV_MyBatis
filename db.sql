

create table filmType(
      typeID integer  primary key,       
      typeName varchar2(20)
)



create table filmInfo(
       fileID  integer  primary key,
       typeID  integer   references  filmType(typeID) ,
       filemName varchar2(50),
       actor varchar2(50),
       director varchar2(50),
       ticketPrice number(5,2) 
)

create sequence seq_filmType start with 1001;
create sequence seq_filmInfo start with 10001;

insert into filmType values(seq_filmType.nextval,'恐怖片');

insert into filmInfo values(seq_filmInfo.nextval,1002,'七月半宿舍','贞子','大明',34.8);

select * from filmType;
select * from filmInfo;