create table student(
    -> id int primary key auto_increment comment'学生ID',
    -> name varchar(10) not null comment'班级名称',
    -> class_id int comment'班级ID',
    -> frieign key (class_id) reference class(id));