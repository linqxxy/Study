-- MySQL dump 10.13  Distrib 5.6.44, for Win64 (x86_64)
--
-- Host: localhost    Database: mydata
-- ------------------------------------------------------
-- Server version	5.6.44-log

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
-- Current Database: `mydata`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `mydata` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mydata`;

--
-- Table structure for table `lol`
--

DROP TABLE IF EXISTS `lol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lol` (
  `name` varchar(10) DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL,
  `comfrom` set('德玛西亚','弗雷尔卓德','班德尔城','艾欧尼亚') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lol`
--

LOCK TABLES `lol` WRITE;
/*!40000 ALTER TABLE `lol` DISABLE KEYS */;
/*!40000 ALTER TABLE `lol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `gender` varchar(2) CHARACTER SET latin1 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'lilei','n');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb1`
--

DROP TABLE IF EXISTS `tb1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb1` (
  `id` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb1`
--

LOCK TABLES `tb1` WRITE;
/*!40000 ALTER TABLE `tb1` DISABLE KEYS */;
INSERT INTO `tb1` VALUES (127),(-128);
/*!40000 ALTER TABLE `tb1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb10`
--

DROP TABLE IF EXISTS `tb10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb10` (
  `id` int(11) DEFAULT NULL COMMENT '序号',
  `name` varchar(10) DEFAULT NULL COMMENT '学生姓名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb10`
--

LOCK TABLES `tb10` WRITE;
/*!40000 ALTER TABLE `tb10` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb11`
--

DROP TABLE IF EXISTS `tb11`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb11` (
  `id` tinyint(3) unsigned zerofill NOT NULL,
  `age` tinyint(3) unsigned DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb11`
--

LOCK TABLES `tb11` WRITE;
/*!40000 ALTER TABLE `tb11` DISABLE KEYS */;
INSERT INTO `tb11` VALUES (001,80),(002,78),(003,60);
/*!40000 ALTER TABLE `tb11` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb12`
--

DROP TABLE IF EXISTS `tb12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb12` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `sex` enum('男','女') DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `age` (`age`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb12`
--

LOCK TABLES `tb12` WRITE;
/*!40000 ALTER TABLE `tb12` DISABLE KEYS */;
INSERT INTO `tb12` VALUES (1,'Tom','男',10),(2,'jakey','男',11);
/*!40000 ALTER TABLE `tb12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb13`
--

DROP TABLE IF EXISTS `tb13`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb13` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(10) NOT NULL DEFAULT '',
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb13`
--

LOCK TABLES `tb13` WRITE;
/*!40000 ALTER TABLE `tb13` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb13` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb14`
--

DROP TABLE IF EXISTS `tb14`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb14` (
  `id` int(11) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb14`
--

LOCK TABLES `tb14` WRITE;
/*!40000 ALTER TABLE `tb14` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb14` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb15`
--

DROP TABLE IF EXISTS `tb15`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb15` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb15`
--

LOCK TABLES `tb15` WRITE;
/*!40000 ALTER TABLE `tb15` DISABLE KEYS */;
INSERT INTO `tb15` VALUES (1,'tom'),(2,'jakeylove');
/*!40000 ALTER TABLE `tb15` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb16`
--

DROP TABLE IF EXISTS `tb16`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb16` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb16`
--

LOCK TABLES `tb16` WRITE;
/*!40000 ALTER TABLE `tb16` DISABLE KEYS */;
INSERT INTO `tb16` VALUES (1,'李雷'),(2,'韩梅梅');
/*!40000 ALTER TABLE `tb16` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb2`
--

DROP TABLE IF EXISTS `tb2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb2` (
  `id` tinyint(3) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb2`
--

LOCK TABLES `tb2` WRITE;
/*!40000 ALTER TABLE `tb2` DISABLE KEYS */;
INSERT INTO `tb2` VALUES (0),(100),(255);
/*!40000 ALTER TABLE `tb2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb3`
--

DROP TABLE IF EXISTS `tb3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb3` (
  `id` int(11) DEFAULT NULL,
  `num` bit(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb3`
--

LOCK TABLES `tb3` WRITE;
/*!40000 ALTER TABLE `tb3` DISABLE KEYS */;
INSERT INTO `tb3` VALUES (10,'\n'),(10,'A');
/*!40000 ALTER TABLE `tb3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb4`
--

DROP TABLE IF EXISTS `tb4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb4` (
  `test` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb4`
--

LOCK TABLES `tb4` WRITE;
/*!40000 ALTER TABLE `tb4` DISABLE KEYS */;
INSERT INTO `tb4` VALUES (99.99),(-99.99),(99.96),(1.934),(99.934);
/*!40000 ALTER TABLE `tb4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb5`
--

DROP TABLE IF EXISTS `tb5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb5` (
  `test` decimal(10,8) DEFAULT NULL,
  `test2` float(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb5`
--

LOCK TABLES `tb5` WRITE;
/*!40000 ALTER TABLE `tb5` DISABLE KEYS */;
INSERT INTO `tb5` VALUES (34.12345678,34.12);
/*!40000 ALTER TABLE `tb5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb6`
--

DROP TABLE IF EXISTS `tb6`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb6` (
  `t1` char(2) DEFAULT NULL,
  `t2` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb6`
--

LOCK TABLES `tb6` WRITE;
/*!40000 ALTER TABLE `tb6` DISABLE KEYS */;
INSERT INTO `tb6` VALUES ('ab','ab'),('ab','李雷'),('中文','李雷');
/*!40000 ALTER TABLE `tb6` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb7`
--

DROP TABLE IF EXISTS `tb7`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb7` (
  `t1` date DEFAULT NULL,
  `t2` datetime DEFAULT NULL,
  `t3` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb7`
--

LOCK TABLES `tb7` WRITE;
/*!40000 ALTER TABLE `tb7` DISABLE KEYS */;
INSERT INTO `tb7` VALUES ('2019-05-31','2019-05-05 00:00:00','2019-05-10 11:52:26');
/*!40000 ALTER TABLE `tb7` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb8`
--

DROP TABLE IF EXISTS `tb8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb8` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb8`
--

LOCK TABLES `tb8` WRITE;
/*!40000 ALTER TABLE `tb8` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb9`
--

DROP TABLE IF EXISTS `tb9`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb9` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(10) NOT NULL DEFAULT '中国'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb9`
--

LOCK TABLES `tb9` WRITE;
/*!40000 ALTER TABLE `tb9` DISABLE KEYS */;
INSERT INTO `tb9` VALUES (1,'中国');
/*!40000 ALTER TABLE `tb9` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votes`
--

DROP TABLE IF EXISTS `votes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `votes` (
  `username` varchar(30) DEFAULT NULL,
  `hobby` set('登山','游泳','篮球','武术') DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votes`
--

LOCK TABLES `votes` WRITE;
/*!40000 ALTER TABLE `votes` DISABLE KEYS */;
INSERT INTO `votes` VALUES ('李雷','游泳','男'),('韩梅梅','游泳','女'),('菜虚鲲','游泳,篮球','女'),('cxk','篮球','女');
/*!40000 ALTER TABLE `votes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-11 20:26:14
