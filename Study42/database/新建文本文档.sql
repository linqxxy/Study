create table student(
    -> id int primary key auto_increment comment'ѧ��ID',
    -> name varchar(10) not null comment'�༶����',
    -> class_id int comment'�༶ID',
    -> frieign key (class_id) reference class(id));