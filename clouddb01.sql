/*
 Navicat Premium Data Transfer

 Source Server         : mydb
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3306
 Source Schema         : clouddb01

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 23/05/2021 11:30:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `db_source` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'clouddb01');
INSERT INTO `dept` VALUES (2, '人事部', 'clouddb01');
INSERT INTO `dept` VALUES (3, '财务部', 'clouddb01');
INSERT INTO `dept` VALUES (4, '市场部', 'clouddb01');
INSERT INTO `dept` VALUES (5, '运维部', 'clouddb01');

SET FOREIGN_KEY_CHECKS = 1;
