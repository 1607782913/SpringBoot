-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot7z6vr
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot7z6vr`
--

/*!40000 DROP DATABASE IF EXISTS `springboot7z6vr`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot7z6vr` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot7z6vr`;

--
-- Table structure for table `banji`
--

DROP TABLE IF EXISTS `banji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banji` varchar(200) NOT NULL COMMENT '班级',
  `banjirenshu` int(11) DEFAULT NULL COMMENT '班级人数',
  `banzhurenxingming` varchar(200) DEFAULT NULL COMMENT '班主任姓名',
  `jiaoshidianhua` varchar(200) DEFAULT NULL COMMENT '教师电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `banji` (`banji`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='班级';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banji`
--

LOCK TABLES `banji` WRITE;
/*!40000 ALTER TABLE `banji` DISABLE KEYS */;
INSERT INTO `banji` VALUES (31,'2022-07-28 21:01:20','班级1',1,'班主任姓名1','教师电话1'),(32,'2022-07-28 21:01:20','班级2',2,'班主任姓名2','教师电话2'),(33,'2022-07-28 21:01:20','班级3',3,'班主任姓名3','教师电话3'),(34,'2022-07-28 21:01:20','班级4',4,'班主任姓名4','教师电话4'),(35,'2022-07-28 21:01:20','班级5',5,'班主任姓名5','教师电话5'),(36,'2022-07-28 21:01:20','班级6',6,'班主任姓名6','教师电话6');
/*!40000 ALTER TABLE `banji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banjiquan`
--

DROP TABLE IF EXISTS `banjiquan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banjiquan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `jianjie` varchar(200) DEFAULT NULL COMMENT '简介',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `neirong` longtext COMMENT '内容',
  `jiazhangzhanghao` varchar(200) DEFAULT NULL COMMENT '家长账号',
  `jiazhangxingming` varchar(200) DEFAULT NULL COMMENT '家长姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='班级圈';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banjiquan`
--

LOCK TABLES `banjiquan` WRITE;
/*!40000 ALTER TABLE `banjiquan` DISABLE KEYS */;
INSERT INTO `banjiquan` VALUES (71,'2022-07-28 21:01:20','标题1','简介1','upload/banjiquan_tupian1.jpg','2022-07-29','内容1','家长账号1','家长姓名1','班级1',1,1),(72,'2022-07-28 21:01:20','标题2','简介2','upload/banjiquan_tupian2.jpg','2022-07-29','内容2','家长账号2','家长姓名2','班级2',2,2),(73,'2022-07-28 21:01:20','标题3','简介3','upload/banjiquan_tupian3.jpg','2022-07-29','内容3','家长账号3','家长姓名3','班级3',3,3),(74,'2022-07-28 21:01:20','标题4','简介4','upload/banjiquan_tupian4.jpg','2022-07-29','内容4','家长账号4','家长姓名4','班级4',4,4),(75,'2022-07-28 21:01:20','标题5','简介5','upload/banjiquan_tupian5.jpg','2022-07-29','内容5','家长账号5','家长姓名5','班级5',5,5),(76,'2022-07-28 21:01:20','标题6','简介6','upload/banjiquan_tupian6.jpg','2022-07-29','内容6','家长账号6','家长姓名6','班级6',6,6);
/*!40000 ALTER TABLE `banjiquan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banjixinwen`
--

DROP TABLE IF EXISTS `banjixinwen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banjixinwen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `xiangguanfujian` varchar(200) DEFAULT NULL COMMENT '相关附件',
  `neirong` longtext COMMENT '内容',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `jiazhangzhanghao` varchar(200) DEFAULT NULL COMMENT '家长账号',
  `jiazhangxingming` varchar(200) DEFAULT NULL COMMENT '家长姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='班级新闻';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banjixinwen`
--

LOCK TABLES `banjixinwen` WRITE;
/*!40000 ALTER TABLE `banjixinwen` DISABLE KEYS */;
INSERT INTO `banjixinwen` VALUES (81,'2022-07-28 21:01:20','标题1','2022-07-29','','内容1','教师账号1','教师姓名1','班级1','家长账号1','家长姓名1'),(82,'2022-07-28 21:01:20','标题2','2022-07-29','','内容2','教师账号2','教师姓名2','班级2','家长账号2','家长姓名2'),(83,'2022-07-28 21:01:20','标题3','2022-07-29','','内容3','教师账号3','教师姓名3','班级3','家长账号3','家长姓名3'),(84,'2022-07-28 21:01:20','标题4','2022-07-29','','内容4','教师账号4','教师姓名4','班级4','家长账号4','家长姓名4'),(85,'2022-07-28 21:01:20','标题5','2022-07-29','','内容5','教师账号5','教师姓名5','班级5','家长账号5','家长姓名5'),(86,'2022-07-28 21:01:20','标题6','2022-07-29','','内容6','教师账号6','教师姓名6','班级6','家长账号6','家长姓名6');
/*!40000 ALTER TABLE `banjixinwen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussbanjiquan`
--

DROP TABLE IF EXISTS `discussbanjiquan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussbanjiquan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='班级圈评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussbanjiquan`
--

LOCK TABLES `discussbanjiquan` WRITE;
/*!40000 ALTER TABLE `discussbanjiquan` DISABLE KEYS */;
INSERT INTO `discussbanjiquan` VALUES (161,'2022-07-28 21:01:20',1,1,'用户名1','评论内容1','回复内容1'),(162,'2022-07-28 21:01:20',2,2,'用户名2','评论内容2','回复内容2'),(163,'2022-07-28 21:01:20',3,3,'用户名3','评论内容3','回复内容3'),(164,'2022-07-28 21:01:20',4,4,'用户名4','评论内容4','回复内容4'),(165,'2022-07-28 21:01:20',5,5,'用户名5','评论内容5','回复内容5'),(166,'2022-07-28 21:01:20',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussbanjiquan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussxueshengzuoye`
--

DROP TABLE IF EXISTS `discussxueshengzuoye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussxueshengzuoye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='学生作业评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussxueshengzuoye`
--

LOCK TABLES `discussxueshengzuoye` WRITE;
/*!40000 ALTER TABLE `discussxueshengzuoye` DISABLE KEYS */;
INSERT INTO `discussxueshengzuoye` VALUES (151,'2022-07-28 21:01:20',1,1,'用户名1','评论内容1','回复内容1'),(152,'2022-07-28 21:01:20',2,2,'用户名2','评论内容2','回复内容2'),(153,'2022-07-28 21:01:20',3,3,'用户名3','评论内容3','回复内容3'),(154,'2022-07-28 21:01:20',4,4,'用户名4','评论内容4','回复内容4'),(155,'2022-07-28 21:01:20',5,5,'用户名5','评论内容5','回复内容5'),(156,'2022-07-28 21:01:20',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussxueshengzuoye` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussxuexichengji`
--

DROP TABLE IF EXISTS `discussxuexichengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussxuexichengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='学习成绩评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussxuexichengji`
--

LOCK TABLES `discussxuexichengji` WRITE;
/*!40000 ALTER TABLE `discussxuexichengji` DISABLE KEYS */;
INSERT INTO `discussxuexichengji` VALUES (141,'2022-07-28 21:01:20',1,1,'用户名1','评论内容1','回复内容1'),(142,'2022-07-28 21:01:20',2,2,'用户名2','评论内容2','回复内容2'),(143,'2022-07-28 21:01:20',3,3,'用户名3','评论内容3','回复内容3'),(144,'2022-07-28 21:01:20',4,4,'用户名4','评论内容4','回复内容4'),(145,'2022-07-28 21:01:20',5,5,'用户名5','评论内容5','回复内容5'),(146,'2022-07-28 21:01:20',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussxuexichengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `jiaoshidianhua` varchar(200) DEFAULT NULL COMMENT '教师电话',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhicheng` varchar(200) DEFAULT NULL COMMENT '职称',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiaoshizhanghao` (`jiaoshizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (11,'2022-07-28 21:01:20','教师账号1','123456','教师姓名1','13823888881','男','职称1','班级1','upload/jiaoshi_touxiang1.jpg'),(12,'2022-07-28 21:01:20','教师账号2','123456','教师姓名2','13823888882','男','职称2','班级2','upload/jiaoshi_touxiang2.jpg'),(13,'2022-07-28 21:01:20','教师账号3','123456','教师姓名3','13823888883','男','职称3','班级3','upload/jiaoshi_touxiang3.jpg'),(14,'2022-07-28 21:01:20','教师账号4','123456','教师姓名4','13823888884','男','职称4','班级4','upload/jiaoshi_touxiang4.jpg'),(15,'2022-07-28 21:01:20','教师账号5','123456','教师姓名5','13823888885','男','职称5','班级5','upload/jiaoshi_touxiang5.jpg'),(16,'2022-07-28 21:01:20','教师账号6','123456','教师姓名6','13823888886','男','职称6','班级6','upload/jiaoshi_touxiang6.jpg');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiazhang`
--

DROP TABLE IF EXISTS `jiazhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiazhang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiazhangzhanghao` varchar(200) NOT NULL COMMENT '家长账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiazhangxingming` varchar(200) DEFAULT NULL COMMENT '家长姓名',
  `jiazhangdianhua` varchar(200) DEFAULT NULL COMMENT '家长电话',
  `guanxi` varchar(200) DEFAULT NULL COMMENT '关系',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiazhangzhanghao` (`jiazhangzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='家长';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiazhang`
--

LOCK TABLES `jiazhang` WRITE;
/*!40000 ALTER TABLE `jiazhang` DISABLE KEYS */;
INSERT INTO `jiazhang` VALUES (21,'2022-07-28 21:01:20','家长账号1','123456','家长姓名1','13823888881','母女','男','upload/jiazhang_touxiang1.jpg','学生姓名1','班级1'),(22,'2022-07-28 21:01:20','家长账号2','123456','家长姓名2','13823888882','母女','男','upload/jiazhang_touxiang2.jpg','学生姓名2','班级2'),(23,'2022-07-28 21:01:20','家长账号3','123456','家长姓名3','13823888883','母女','男','upload/jiazhang_touxiang3.jpg','学生姓名3','班级3'),(24,'2022-07-28 21:01:20','家长账号4','123456','家长姓名4','13823888884','母女','男','upload/jiazhang_touxiang4.jpg','学生姓名4','班级4'),(25,'2022-07-28 21:01:20','家长账号5','123456','家长姓名5','13823888885','母女','男','upload/jiazhang_touxiang5.jpg','学生姓名5','班级5'),(26,'2022-07-28 21:01:20','家长账号6','123456','家长姓名6','13823888886','母女','男','upload/jiazhang_touxiang6.jpg','学生姓名6','班级6');
/*!40000 ALTER TABLE `jiazhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiazhangrenwu`
--

DROP TABLE IF EXISTS `jiazhangrenwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiazhangrenwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `renwubianhao` varchar(200) DEFAULT NULL COMMENT '任务编号',
  `renwubiaoti` varchar(200) DEFAULT NULL COMMENT '任务标题',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `tijiaoshijian` date DEFAULT NULL COMMENT '提交时间',
  `renwuyaoqiu` longtext COMMENT '任务要求',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  PRIMARY KEY (`id`),
  UNIQUE KEY `renwubianhao` (`renwubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='家长任务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiazhangrenwu`
--

LOCK TABLES `jiazhangrenwu` WRITE;
/*!40000 ALTER TABLE `jiazhangrenwu` DISABLE KEYS */;
INSERT INTO `jiazhangrenwu` VALUES (101,'2022-07-28 21:01:20','1111111111','任务标题1','2022-07-29','2022-07-29','任务要求1','upload/jiazhangrenwu_fengmian1.jpg','教师账号1','教师姓名1','班级1'),(102,'2022-07-28 21:01:20','2222222222','任务标题2','2022-07-29','2022-07-29','任务要求2','upload/jiazhangrenwu_fengmian2.jpg','教师账号2','教师姓名2','班级2'),(103,'2022-07-28 21:01:20','3333333333','任务标题3','2022-07-29','2022-07-29','任务要求3','upload/jiazhangrenwu_fengmian3.jpg','教师账号3','教师姓名3','班级3'),(104,'2022-07-28 21:01:20','4444444444','任务标题4','2022-07-29','2022-07-29','任务要求4','upload/jiazhangrenwu_fengmian4.jpg','教师账号4','教师姓名4','班级4'),(105,'2022-07-28 21:01:20','5555555555','任务标题5','2022-07-29','2022-07-29','任务要求5','upload/jiazhangrenwu_fengmian5.jpg','教师账号5','教师姓名5','班级5'),(106,'2022-07-28 21:01:20','6666666666','任务标题6','2022-07-29','2022-07-29','任务要求6','upload/jiazhangrenwu_fengmian6.jpg','教师账号6','教师姓名6','班级6');
/*!40000 ALTER TABLE `jiazhangrenwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kechengbiao`
--

DROP TABLE IF EXISTS `kechengbiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kechengbiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kebiaomingcheng` varchar(200) NOT NULL COMMENT '课表名称',
  `kebiaoleixing` varchar(200) NOT NULL COMMENT '课表类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `xingqi` varchar(200) DEFAULT NULL COMMENT '星期',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `kechengyi` varchar(200) DEFAULT NULL COMMENT '课程一',
  `kechenger` varchar(200) DEFAULT NULL COMMENT '课程二',
  `kechengsan` varchar(200) DEFAULT NULL COMMENT '课程三',
  `kechengsi` varchar(200) DEFAULT NULL COMMENT '课程四',
  `kechengwu` varchar(200) DEFAULT NULL COMMENT '课程五',
  `kechengliu` varchar(200) DEFAULT NULL COMMENT '课程六',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='课程表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kechengbiao`
--

LOCK TABLES `kechengbiao` WRITE;
/*!40000 ALTER TABLE `kechengbiao` DISABLE KEYS */;
INSERT INTO `kechengbiao` VALUES (41,'2022-07-28 21:01:20','课表名称1','课表类型1','upload/kechengbiao_tupian1.jpg','星期一','班级1','课程一1','课程二1','课程三1','课程四1','课程五1','课程六1','教师账号1','教师姓名1'),(42,'2022-07-28 21:01:20','课表名称2','课表类型2','upload/kechengbiao_tupian2.jpg','星期一','班级2','课程一2','课程二2','课程三2','课程四2','课程五2','课程六2','教师账号2','教师姓名2'),(43,'2022-07-28 21:01:20','课表名称3','课表类型3','upload/kechengbiao_tupian3.jpg','星期一','班级3','课程一3','课程二3','课程三3','课程四3','课程五3','课程六3','教师账号3','教师姓名3'),(44,'2022-07-28 21:01:20','课表名称4','课表类型4','upload/kechengbiao_tupian4.jpg','星期一','班级4','课程一4','课程二4','课程三4','课程四4','课程五4','课程六4','教师账号4','教师姓名4'),(45,'2022-07-28 21:01:20','课表名称5','课表类型5','upload/kechengbiao_tupian5.jpg','星期一','班级5','课程一5','课程二5','课程三5','课程四5','课程五5','课程六5','教师账号5','教师姓名5'),(46,'2022-07-28 21:01:20','课表名称6','课表类型6','upload/kechengbiao_tupian6.jpg','星期一','班级6','课程一6','课程二6','课程三6','课程四6','课程五6','课程六6','教师账号6','教师姓名6');
/*!40000 ALTER TABLE `kechengbiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='公告资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (131,'2022-07-28 21:01:20','有梦想，就要努力去实现','不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。','upload/news_picture1.jpg','<p>不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?</p><p>你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。其实，我已经厌倦了你这样说说而已的把戏，我觉得就算我告诉你如何去做，你也不会照做，因为你根本什么都不做。</p><p>真正有行动力的人不需要别人告诉他如何做，因为他已经在做了。就算碰到问题，他也会自己想办法，自己动手去解决或者主动寻求可以帮助他的人，而不是等着别人为自己解决问题。</p><p>首先要学习独立思考。花一点时间想一下自己喜欢什么，梦想是什么，不要别人说想环游世界，你就说你的梦想是环游世界。</p><p>很多人说现实束缚了自己，其实在这个世界上，我们一直都可以有很多选择，生活的决定权也—直都在自己手上，只是我们缺乏行动力而已。</p><p>如果你觉得安于现状是你想要的，那选择安于现状就会让你幸福和满足;如果你不甘平庸，选择一条改变、进取和奋斗的道路，在这个追求的过程中，你也一样会感到快乐。所谓的成功，即是按照自己想要的生活方式生活。最糟糕的状态，莫过于当你想要选择一条不甘平庸、改变、进取和奋斗的道路时，却以一种安于现状的方式生活，最后抱怨自己没有得到想要的人生。</p><p>因为喜欢，你不是在苦苦坚持，也因为喜欢，你愿意投入时间、精力，长久以往，获得成功就是自然而然的事情。</p>'),(132,'2022-07-28 21:01:20','又是一年毕业季','又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。','upload/news_picture2.jpg','<p>又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。</p><p>过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。一直都是晚会的忠实参与者，无论是台前还是幕后，忽然间，角色转变，那种感觉确实难以用语言表达。</p><p>	过去的三年，总是默默地期盼着这个好雨时节，因为这时候，会有灿烂的阳光，会有满目的百花争艳，会有香甜的冰激凌，这是个毕业的季节，当时不经世事的我们会殷切地期待学校那一大堆的活动，期待穿上绚丽的演出服或者礼仪服，站在大礼堂镁光灯下尽情挥洒我们的澎拜的激情。</p><p>百感交集，隔岸观火与身临其境的感觉竟是如此不同。从来没想过一场晚会送走的是我们自己的时候会是怎样的感情，毕业就真的意味着结束吗?倔强的我们不愿意承认，谢谢学弟学妹们慷慨的将这次的主题定为“我们在这里”。我知道，这可能是他们对我们这些过来人的尊敬和施舍。</p><p>没有为这场晚会排练、奔波，没有为班级、学生会、文学院出点力，还真有点不习惯，百般无奈中，用“工作忙”个万能的借口来搪塞自己，欺骗别人。其实自己心里明白，那只是在逃避，只是不愿面对繁华落幕后的萧条和落寞。大四了，大家各奔东西，想凑齐班上的人真的是难上加难，敏燕从越南回来，刚落地就匆匆回了学校，那么恋家的人也启程回来了，睿睿学姐也是从家赶来跟我们团圆。大家—如既往的寒暄、打趣、调侃对方，似乎一切又回到了当初的单纯美好。</p><p>看着舞台上活泼可爱的学弟学妹们，如同一群机灵的小精灵，清澈的眼神，稚嫩的肢体，轻快地步伐，用他们那热情洋溢的舞姿渲染着在场的每一个人，我知道，我不应该羡慕嫉妒他们，不应该顾自怜惜逝去的青春，不应该感叹夕阳无限好，曾经，我们也拥有过，曾经，我们也年轻过，曾经，我们也灿烂过。我深深地告诉自己，人生的每个阶段都是美的，年轻有年轻的活力，成熟也有成熟的魅力。多—份稳重、淡然、优雅，也是漫漫时光掠影遗留下的.珍贵赏赐。</p>'),(133,'2022-07-28 21:01:20','挫折路上，坚持常在心间','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture3.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(134,'2022-07-28 21:01:20','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(135,'2022-07-28 21:01:20','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(136,'2022-07-28 21:01:20','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tijiaorenwu`
--

DROP TABLE IF EXISTS `tijiaorenwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tijiaorenwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiazhangzhanghao` varchar(200) DEFAULT NULL COMMENT '家长账号',
  `jiazhangxingming` varchar(200) DEFAULT NULL COMMENT '家长姓名',
  `jiazhangdianhua` varchar(200) DEFAULT NULL COMMENT '家长电话',
  `renwubianhao` varchar(200) DEFAULT NULL COMMENT '任务编号',
  `renwubiaoti` varchar(200) DEFAULT NULL COMMENT '任务标题',
  `wanchengshijian` date DEFAULT NULL COMMENT '完成时间',
  `renwuyaoqiu` longtext COMMENT '任务要求',
  `wanneirong` varchar(200) DEFAULT NULL COMMENT '完内容',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `renwubianhao` (`renwubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='提交任务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tijiaorenwu`
--

LOCK TABLES `tijiaorenwu` WRITE;
/*!40000 ALTER TABLE `tijiaorenwu` DISABLE KEYS */;
INSERT INTO `tijiaorenwu` VALUES (111,'2022-07-28 21:01:20','家长账号1','家长姓名1','家长电话1','1111111111','任务标题1','2022-07-29','任务要求1','upload/tijiaorenwu_wanneirong1.jpg','教师账号1','教师姓名1','班级1','是',''),(112,'2022-07-28 21:01:20','家长账号2','家长姓名2','家长电话2','2222222222','任务标题2','2022-07-29','任务要求2','upload/tijiaorenwu_wanneirong2.jpg','教师账号2','教师姓名2','班级2','是',''),(113,'2022-07-28 21:01:20','家长账号3','家长姓名3','家长电话3','3333333333','任务标题3','2022-07-29','任务要求3','upload/tijiaorenwu_wanneirong3.jpg','教师账号3','教师姓名3','班级3','是',''),(114,'2022-07-28 21:01:20','家长账号4','家长姓名4','家长电话4','4444444444','任务标题4','2022-07-29','任务要求4','upload/tijiaorenwu_wanneirong4.jpg','教师账号4','教师姓名4','班级4','是',''),(115,'2022-07-28 21:01:20','家长账号5','家长姓名5','家长电话5','5555555555','任务标题5','2022-07-29','任务要求5','upload/tijiaorenwu_wanneirong5.jpg','教师账号5','教师姓名5','班级5','是',''),(116,'2022-07-28 21:01:20','家长账号6','家长姓名6','家长电话6','6666666666','任务标题6','2022-07-29','任务要求6','upload/tijiaorenwu_wanneirong6.jpg','教师账号6','教师姓名6','班级6','是','');
/*!40000 ALTER TABLE `tijiaorenwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushuxinxi`
--

DROP TABLE IF EXISTS `tushuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tushubianhao` varchar(200) NOT NULL COMMENT '图书编号',
  `tushumingcheng` varchar(200) NOT NULL COMMENT '图书名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `jianshu` varchar(200) DEFAULT NULL COMMENT '简述',
  `zuozhe` varchar(200) DEFAULT NULL COMMENT '作者',
  `chubanshe` varchar(200) DEFAULT NULL COMMENT '出版社',
  `xiangqing` longtext COMMENT '详情',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tushubianhao` (`tushubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='图书信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushuxinxi`
--

LOCK TABLES `tushuxinxi` WRITE;
/*!40000 ALTER TABLE `tushuxinxi` DISABLE KEYS */;
INSERT INTO `tushuxinxi` VALUES (91,'2022-07-28 21:01:20','1111111111','图书名称1','upload/tushuxinxi_tupian1.jpg','简述1','作者1','出版社1','详情1'),(92,'2022-07-28 21:01:20','2222222222','图书名称2','upload/tushuxinxi_tupian2.jpg','简述2','作者2','出版社2','详情2'),(93,'2022-07-28 21:01:20','3333333333','图书名称3','upload/tushuxinxi_tupian3.jpg','简述3','作者3','出版社3','详情3'),(94,'2022-07-28 21:01:20','4444444444','图书名称4','upload/tushuxinxi_tupian4.jpg','简述4','作者4','出版社4','详情4'),(95,'2022-07-28 21:01:20','5555555555','图书名称5','upload/tushuxinxi_tupian5.jpg','简述5','作者5','出版社5','详情5'),(96,'2022-07-28 21:01:20','6666666666','图书名称6','upload/tushuxinxi_tupian6.jpg','简述6','作者6','出版社6','详情6');
/*!40000 ALTER TABLE `tushuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-07-28 21:01:20');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengzuoye`
--

DROP TABLE IF EXISTS `xueshengzuoye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengzuoye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiazhangzhanghao` varchar(200) DEFAULT NULL COMMENT '家长账号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `zuoyebiaoti` varchar(200) DEFAULT NULL COMMENT '作业标题',
  `zuoyeneirong` varchar(200) DEFAULT NULL COMMENT '作业内容',
  `shifouhege` varchar(200) DEFAULT NULL COMMENT '是否合格',
  `tijiaoshijianshijian` date DEFAULT NULL COMMENT '提交时间时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='学生作业';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengzuoye`
--

LOCK TABLES `xueshengzuoye` WRITE;
/*!40000 ALTER TABLE `xueshengzuoye` DISABLE KEYS */;
INSERT INTO `xueshengzuoye` VALUES (61,'2022-07-28 21:01:20','家长账号1','学生姓名1','班级1','教师账号1','教师姓名1','作业标题1','','合格','2022-07-29','upload/xueshengzuoye_fengmian1.jpg'),(62,'2022-07-28 21:01:20','家长账号2','学生姓名2','班级2','教师账号2','教师姓名2','作业标题2','','合格','2022-07-29','upload/xueshengzuoye_fengmian2.jpg'),(63,'2022-07-28 21:01:20','家长账号3','学生姓名3','班级3','教师账号3','教师姓名3','作业标题3','','合格','2022-07-29','upload/xueshengzuoye_fengmian3.jpg'),(64,'2022-07-28 21:01:20','家长账号4','学生姓名4','班级4','教师账号4','教师姓名4','作业标题4','','合格','2022-07-29','upload/xueshengzuoye_fengmian4.jpg'),(65,'2022-07-28 21:01:20','家长账号5','学生姓名5','班级5','教师账号5','教师姓名5','作业标题5','','合格','2022-07-29','upload/xueshengzuoye_fengmian5.jpg'),(66,'2022-07-28 21:01:20','家长账号6','学生姓名6','班级6','教师账号6','教师姓名6','作业标题6','','合格','2022-07-29','upload/xueshengzuoye_fengmian6.jpg');
/*!40000 ALTER TABLE `xueshengzuoye` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuexichengji`
--

DROP TABLE IF EXISTS `xuexichengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuexichengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiazhangzhanghao` varchar(200) DEFAULT NULL COMMENT '家长账号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `kechengkemu` varchar(200) DEFAULT NULL COMMENT '课程科目',
  `fenshu` varchar(200) DEFAULT NULL COMMENT '分数',
  `shifouhege` varchar(200) DEFAULT NULL COMMENT '是否合格',
  `kaoshishijian` date DEFAULT NULL COMMENT '考试时间',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='学习成绩';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuexichengji`
--

LOCK TABLES `xuexichengji` WRITE;
/*!40000 ALTER TABLE `xuexichengji` DISABLE KEYS */;
INSERT INTO `xuexichengji` VALUES (51,'2022-07-28 21:01:20','家长账号1','学生姓名1','班级1','教师账号1','教师姓名1','课程科目1','分数1','合格','2022-07-29','upload/xuexichengji_fengmian1.jpg','备注1'),(52,'2022-07-28 21:01:20','家长账号2','学生姓名2','班级2','教师账号2','教师姓名2','课程科目2','分数2','合格','2022-07-29','upload/xuexichengji_fengmian2.jpg','备注2'),(53,'2022-07-28 21:01:20','家长账号3','学生姓名3','班级3','教师账号3','教师姓名3','课程科目3','分数3','合格','2022-07-29','upload/xuexichengji_fengmian3.jpg','备注3'),(54,'2022-07-28 21:01:20','家长账号4','学生姓名4','班级4','教师账号4','教师姓名4','课程科目4','分数4','合格','2022-07-29','upload/xuexichengji_fengmian4.jpg','备注4'),(55,'2022-07-28 21:01:20','家长账号5','学生姓名5','班级5','教师账号5','教师姓名5','课程科目5','分数5','合格','2022-07-29','upload/xuexichengji_fengmian5.jpg','备注5'),(56,'2022-07-28 21:01:20','家长账号6','学生姓名6','班级6','教师账号6','教师姓名6','课程科目6','分数6','合格','2022-07-29','upload/xuexichengji_fengmian6.jpg','备注6');
/*!40000 ALTER TABLE `xuexichengji` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-29  5:02:46
