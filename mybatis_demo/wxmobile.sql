create database if not exists wxmobile;
create table if not exists wxmobile.tbl_orguser(
	`index_id` int primary key not null,
    `name` varchar(80) null,
    `sex` tinyint null,
    `email` varchar(80) null,
    `wechatno` varchar(80) null, 
    `tel` varchar(12) null,
    `orgrelationship` varchar(80) null,
    `city` varchar(20) null,
    `province` varchar(20) null,
    `country` varchar(20) null,
    `headImgUrl` varchar(80) null,
    `nickname` varchar(20) null,
    `openId` varchar(80) null
);