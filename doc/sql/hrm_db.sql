/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : hrm_db

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2019-12-02 16:11:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept_inf`
-- ----------------------------
DROP TABLE IF EXISTS `dept_inf`;
CREATE TABLE `dept_inf` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) DEFAULT NULL,
  `REMARK` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dept_inf
-- ----------------------------

-- ----------------------------
-- Table structure for `document_inf`
-- ----------------------------
DROP TABLE IF EXISTS `document_inf`;
CREATE TABLE `document_inf` (
  `ID` int(11) NOT NULL,
  `TITLE` varchar(50) NOT NULL,
  `FILENAME` varchar(300) NOT NULL,
  `REMARK` varchar(300) DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of document_inf
-- ----------------------------

-- ----------------------------
-- Table structure for `employee_inf`
-- ----------------------------
DROP TABLE IF EXISTS `employee_inf`;
CREATE TABLE `employee_inf` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPT_ID` int(11) NOT NULL,
  `JOB_ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `CARD_ID` varchar(18) NOT NULL,
  `ADDRESS` varchar(50) DEFAULT NULL,
  `POST_CODE` varchar(50) DEFAULT NULL,
  `TEL` varchar(16) DEFAULT NULL,
  `PHONE` varchar(15) NOT NULL,
  `SEX` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of employee_inf
-- ----------------------------

-- ----------------------------
-- Table structure for `job_inf`
-- ----------------------------
DROP TABLE IF EXISTS `job_inf`;
CREATE TABLE `job_inf` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) DEFAULT NULL,
  `REMARK` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of job_inf
-- ----------------------------

-- ----------------------------
-- Table structure for `notice_inf`
-- ----------------------------
DROP TABLE IF EXISTS `notice_inf`;
CREATE TABLE `notice_inf` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(50) NOT NULL,
  `CONTENT` text NOT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of notice_inf
-- ----------------------------

-- ----------------------------
-- Table structure for `user_inf`
-- ----------------------------
DROP TABLE IF EXISTS `user_inf`;
CREATE TABLE `user_inf` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `LOGINNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `STATUS` int(11) DEFAULT '1',
  `USERNAME` varchar(20) DEFAULT NULL,
  `CREATEDATE` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_inf
-- ----------------------------
