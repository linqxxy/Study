-- MySQL dump 10.13  Distrib 5.6.44, for Win64 (x86_64)
--
-- Host: localhost    Database: notes
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
-- Current Database: `notes`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `notes` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `notes`;

--
-- Table structure for table `note_group`
--

DROP TABLE IF EXISTS `note_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '便签组编号',
  `group_name` varchar(20) NOT NULL COMMENT '便签组名',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note_group`
--

LOCK TABLES `note_group` WRITE;
/*!40000 ALTER TABLE `note_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `note_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `note_mark`
--

DROP TABLE IF EXISTS `note_mark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note_mark` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '便签表编号',
  `title` varchar(20) NOT NULL COMMENT '便签标题',
  `content` varchar(1000) DEFAULT NULL COMMENT '便签内容',
  `is_secert` tinyint(1) DEFAULT NULL COMMENT '是否私密，0代表公开，1 代表私有',
  `background` enum('红','黄','绿') DEFAULT NULL COMMENT '背景颜色',
  `is_remind` bit(1) DEFAULT NULL COMMENT '是否提醒',
  `is_delete` char(1) DEFAULT '0' COMMENT '是否删除，0 未删除，1 删除',
  `remind_date` datetime DEFAULT NULL COMMENT '提醒时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  `group_id` int(11) NOT NULL COMMENT '便签组编号',
  PRIMARY KEY (`id`),
  KEY `group_id` (`group_id`),
  CONSTRAINT `note_mark_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `note_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note_mark`
--

LOCK TABLES `note_mark` WRITE;
/*!40000 ALTER TABLE `note_mark` DISABLE KEYS */;
/*!40000 ALTER TABLE `note_mark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `note_share`
--

DROP TABLE IF EXISTS `note_share`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note_share` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '便签分享编号',
  `mark_id` int(11) NOT NULL COMMENT '便签编号',
  `share_remark` varchar(100) DEFAULT NULL COMMENT '分享备注',
  `share_date` datetime DEFAULT NULL COMMENT '分享时间',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `mark_id` (`mark_id`),
  CONSTRAINT `note_share_ibfk_1` FOREIGN KEY (`mark_id`) REFERENCES `note_mark` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note_share`
--

LOCK TABLES `note_share` WRITE;
/*!40000 ALTER TABLE `note_share` DISABLE KEYS */;
/*!40000 ALTER TABLE `note_share` ENABLE KEYS */;
UNLOCK TABLES;
