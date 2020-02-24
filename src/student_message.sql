# Host: 119.29.179.146  (Version: 5.7.21-log)
# Date: 2018-10-15 09:09:22
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "free_time"
#

CREATE TABLE `free_time` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `card` varchar(255) NOT NULL DEFAULT '6130...' COMMENT '学号',
  `time` int(11) DEFAULT NULL COMMENT '时间段，用一个两位数表示',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "free_time"
#


#
# Structure for table "information"
#

CREATE TABLE `information` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '姓名',
  `card` varchar(255) NOT NULL DEFAULT '' COMMENT '学号',
  `nativePlace` varchar(255) NOT NULL DEFAULT '' COMMENT '籍贯',
  `birthday` date NOT NULL DEFAULT '2000-01-01' COMMENT '出生日期',
  `school` varchar(255) NOT NULL DEFAULT 'XXXXX学院' COMMENT '学院',
  `major` varchar(255) NOT NULL DEFAULT 'XXXX专业' COMMENT '专业',
  `classes` varchar(255) NOT NULL DEFAULT 'XXXX班级' COMMENT '班级',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `qq` varchar(255) DEFAULT NULL COMMENT 'qq',
  `department` varchar(255) NOT NULL DEFAULT 'XXXX部门' COMMENT '部门',
  `job` varchar(255) NOT NULL DEFAULT 'XX职位' COMMENT '职位',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生个人信息表';

#
# Data for table "information"
#

