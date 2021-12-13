--------------------Mobile shop----------------------



select *from products;
TRUNCATE TABLE PRODUCTS;
SELECT *FROM SALESMAN;
select *from user_table;
select *from order_table;
select *from order_item;
drop table p cascade constraints;


ROLLBACK;
DROP TABLE USER_TABLE;



RENAME REGISTER_TABLE TO USER_TABLE;
select *from user_table;
ALTER TABLE USER_TABLE MODIFY EMAIL UNIQUE;

--------------SALESMAN_TABLE-----------------

CREATE TABLE SALESMAN
(SALESMAN_ID NUMBER PRIMARY KEY,NAME VARCHAR2(30),PHONE_NUMBER NUMBER(10),JOB_TITLE VARCHAR2(50));


---------------USER_TABLE--------------
drop table users_table;
create  table users_table 
(pk_user_id number generated always as identity (start with 1 increment by 1)primary key
,first_name varchar2(40) not null
 ,email varchar2(50)not null
 ,phone_number number(10)not null,
 password varchar2(50) not null
 ,confirm_password varchar2(50)not null);
 

--insert into users_table(first_name,email,phone_number,password,confirm_password) values('ajith','ajith12@gmail.com',9876543210,'pass1','pass1');

SELECT *FROM USERS_TABLE;
truncate TABLE users_table;
alter table users_table modify email unique;
commit;
desc users_table;


DROP TABLE USER_TABLE CASCADE CONSTRAINTS;
drop table users_table;

--------------ORDER_TABLE-------------
CREATE TABLE ORDER_TABLE
(ORDER_ID NUMBER PRIMARY KEY,USER_ID NUMBER ,FOREIGN KEY(USER_ID) REFERENCES USER_TABLE(ID)
,SALESMAN_ID NUMBER,FOREIGN KEY(SALESMAN_ID) REFERENCES SALESMAN(SALESMAN_ID),STATUS VARCHAR2(30)
,ORDER_DATE DATE );

 
select *from products;
drop table order_table cascade constraints;
select *from order_table;

SELECT *FROM ORDER_TABLE;


--------------ITEM_TABLE---------------

CREATE TABLE ORDER_ITEM
(ITEM_ID NUMBER,ORDER_ID NUMBER,FOREIGN KEY(ORDER_ID) REFERENCES ORDER_TABLE(ORDER_ID)
,PRODUCT_ID NUMBER,FOREIGN KEY(PRODUCT_ID) REFERENCES PRODUCTS(PRODUCT_ID)
,QUANTITY NUMBER,LIST_NUMBER NUMBER);


select *from users_table;


-----------products_table--------------
desc products;
create table products 
(pk_product_id number generated always as identity(start with 1 increment by 1) primary key ,
product_name varchar2(50),description varchar2(80),standard_price number(12,2),
list_price number(12,2)); 




select *from users_table;
