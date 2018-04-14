/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : short-url

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-14 15:13:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chain
-- ----------------------------
DROP TABLE IF EXISTS `chain`;
CREATE TABLE `chain` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `linksName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `linksUrl` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `masterEmail` varchar(255) DEFAULT NULL COMMENT '头像',
  `showAddress` varchar(255) DEFAULT '首页' COMMENT '展示位置',
  `status` tinyint(3) NOT NULL DEFAULT '1' COMMENT '0：冻结、1：正常使用',
  `crtTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='友链';

-- ----------------------------
-- Records of chain
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `userface` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名',
  `userAsk` varchar(255) DEFAULT NULL COMMENT '留言',
  `askTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '留言时间',
  `msgReply` varchar(255) DEFAULT NULL COMMENT '回复',
  `crtTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言表';

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for newslist
-- ----------------------------
DROP TABLE IF EXISTS `newslist`;
CREATE TABLE `newslist` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `shortName` varchar(255) DEFAULT NULL COMMENT '短链接',
  `longName` varchar(255) DEFAULT NULL COMMENT '长连接链接',
  `desc` varchar(255) DEFAULT NULL COMMENT '链接作用',
  `shortAuthor` varchar(255) DEFAULT NULL COMMENT '短链接生成者',
  `shortStatus` varchar(255) DEFAULT '审核通过' COMMENT '审核结果',
  `shortLook` varchar(255) DEFAULT '开放浏览' COMMENT '是否开放浏览',
  `isShow` varchar(255) DEFAULT 'checked' COMMENT '是否浏览',
  `newsTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='短链接表';

-- ----------------------------
-- Records of newslist
-- ----------------------------

-- ----------------------------
-- Table structure for system
-- ----------------------------
DROP TABLE IF EXISTS `system`;
CREATE TABLE `system` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `cmsName` varchar(255) DEFAULT NULL COMMENT '短链接后台管理',
  `version` varchar(255) DEFAULT NULL COMMENT '当前版本号',
  `author` varchar(255) DEFAULT NULL COMMENT '开发者',
  `homePage` varchar(255) DEFAULT NULL COMMENT '首页地址',
  `server` varchar(255) DEFAULT NULL COMMENT '服务器环境',
  `dataBaseVersion` varchar(255) DEFAULT NULL COMMENT '数据库版本',
  `maxUpload` varchar(255) DEFAULT NULL COMMENT '最大上传文件',
  `userRights` varchar(255) DEFAULT NULL COMMENT '用户权限',
  `description` varchar(255) DEFAULT NULL COMMENT '网站描述',
  `powerby` varchar(255) DEFAULT NULL COMMENT '版权',
  `record` varchar(255) DEFAULT NULL COMMENT '备案号',
  `keywords` varchar(255) DEFAULT NULL COMMENT '关键字',
  `crtTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统信息';

-- ----------------------------
-- Records of system
-- ----------------------------
INSERT INTO `system` VALUES ('1', '短链接后台管理', 'v1.0.0', '懿', 'page/index', 'Linux', 'MySQL 5.7', '2M', '总管理员', '你猜猜', 'Copyright @2018 懿', '粤ICP备14040xxx号-1', 'layui，短链接', '2018-04-14 14:46:00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `userName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `userSex` varchar(20) DEFAULT NULL COMMENT '性别',
  `userEmail` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `userHeadPortrait` varchar(255) DEFAULT NULL COMMENT '头像',
  `userStatus` tinyint(3) NOT NULL DEFAULT '1' COMMENT '0：冻结、1：正常使用',
  `userGrade` int(11) NOT NULL DEFAULT '3' COMMENT '1：普通会员、2：高级会员、3：超级会员',
  `userEndTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '用户最后登录时间',
  `crtTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用戶表';

-- ----------------------------
-- Records of user
-- ----------------------------
