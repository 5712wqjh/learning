/*
Navicat MySQL Data Transfer

Source Server         : 8.0
Source Server Version : 80022
Source Host           : localhost:3307
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-02-19 14:05:38
*/
CREATE DATABASE test;
USE test;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_stu`
-- ----------------------------
DROP TABLE IF EXISTS `tb_stu`;
CREATE TABLE `tb_stu` (
  `id` int DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_stu
-- ----------------------------
INSERT INTO `tb_stu` VALUES ('1', '张三', '男', '1998-02-06');
INSERT INTO `tb_stu` VALUES ('2', '李四', '女', '1995-06-28');
INSERT INTO `tb_stu` VALUES ('3', '王五', '女', '1999-11-23');
INSERT INTO `tb_stu` VALUES ('4', '赵六', '男', '2000-05-30');
