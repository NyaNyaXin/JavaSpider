/*
 Navicat Premium Data Transfer

 Source Server         : JD
 Source Server Type    : MySQL
 Source Server Version : 50637
 Source Host           : 117.122.233.153:3306
 Source Schema         : spider

 Target Server Type    : MySQL
 Target Server Version : 50637
 File Encoding         : 65001

 Date: 12/08/2017 10:14:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for java_recruitment_msg
-- ----------------------------
DROP TABLE IF EXISTS `java_recruitment_msg`;
CREATE TABLE `java_recruitment_msg`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `office_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `salary` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `release_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `office_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5401 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
