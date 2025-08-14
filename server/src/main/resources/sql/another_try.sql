/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : another_try

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 14/08/2025 15:44:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码（加密后）',
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号',
  `gender` tinyint NULL DEFAULT 0 COMMENT '性别(0-未知,1-男,2-女)',
  `status` tinyint NULL DEFAULT 1 COMMENT '状态(0-禁用,1-启用)',
  `birth_date` date NULL DEFAULT NULL COMMENT '出生日期',
  `last_login_time` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_username`(`username`) USING BTREE,
  UNIQUE INDEX `uk_email`(`email`) USING BTREE,
  UNIQUE INDEX `uk_phone`(`phone`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '测试用用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES (1, 'alice', '123456', 'alice@example.com', '13800000001', 2, 1, '1995-05-20', '2025-08-10 10:15:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (2, 'bob', '123456', 'bob@example.com', '13800000002', 1, 1, '1990-10-12', '2025-08-11 14:30:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (3, 'charlie', '123456', 'charlie@example.com', '13800000003', 1, 0, '1988-03-05', '2025-07-29 08:00:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (4, 'david', '123456', 'david@example.com', '13800000004', 1, 1, '1998-07-14', '2025-08-01 09:45:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (5, 'eva', '123456', 'eva@example.com', '13800000005', 2, 1, '1993-12-25', '2025-08-08 21:00:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (6, 'frank', '123456', 'frank@example.com', '13800000006', 1, 0, '1985-09-09', '2025-08-03 07:10:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (7, 'grace', '123456', 'grace@example.com', '13800000007', 2, 1, '2000-01-01', '2025-08-09 13:20:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (8, 'henry', '123456', 'henry@example.com', '13800000008', 1, 1, '1997-04-17', '2025-08-12 08:50:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (9, 'irene', '123456', 'irene@example.com', '13800000009', 2, 0, '1991-06-06', '2025-07-20 16:40:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');
INSERT INTO `test_user` VALUES (10, 'jack', '123456', 'jack@example.com', '13800000010', 1, 1, '1989-11-11', '2025-08-05 12:00:00', '2025-08-14 09:30:07', '2025-08-14 09:30:07');

SET FOREIGN_KEY_CHECKS = 1;
