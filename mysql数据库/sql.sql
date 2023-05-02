-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mirror_server
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `app_user`
--

DROP TABLE IF EXISTS `app_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `app_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(100) DEFAULT NULL,
  `account` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `header` varchar(1000) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_user`
--

LOCK TABLES `app_user` WRITE;
/*!40000 ALTER TABLE `app_user` DISABLE KEYS */;
INSERT INTO `app_user` VALUES (1,'測試','user','038711',22,'2321','fc5d36c6-df53-46db-84f2-332d9f284f55.png','17868583286'),(20,'212121','111111','135178',1,'111',NULL,'1111'),(21,'测试用户','user5','111111',21,'121212121','8cabe3e1-dc09-491d-b4e9-caec5c2455a3.png','15509111111'),(22,'user6','user6','813954',12,'1111','8bca9f84-9b03-4b8b-9b04-6d6b8aed6ef6.png','18888888888');
/*!40000 ALTER TABLE `app_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clothes`
--

DROP TABLE IF EXISTS `clothes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clothes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `picture` varchar(1000) DEFAULT NULL,
  `video` varchar(1000) DEFAULT NULL,
  `min_height` float DEFAULT NULL,
  `max_height` float DEFAULT NULL,
  `min_weight` float DEFAULT NULL,
  `max_weight` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clothes`
--

LOCK TABLES `clothes` WRITE;
/*!40000 ALTER TABLE `clothes` DISABLE KEYS */;
INSERT INTO `clothes` VALUES (6,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(7,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(8,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(9,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(10,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(11,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(12,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(13,'SuperDry潮牌短袖','极度干燥SuperDry潮牌短袖','SY','8734189a-ee74-43a0-a37f-87a006664733.png','7e8683e4-1570-45cd-9e5e-4534b6c5f621.mp4',100,190,50,100),(14,'服饰1','测试服饰','KZ','7ff924f6-a2ae-49aa-b938-87db86a09de3.png','7cc12f8f-2240-4400-b1fc-8eb5888b27c1.mp4',120,200,50,100),(15,'测试服饰','测试服饰裤子','KZ','df6eb7e6-4379-4096-8bb9-fe282ab99685.png','32c28261-846a-486b-938a-0874f0c6aaf5.mp4',100,200,50,100),(16,'演示服饰','演示裤子服饰','KZ','40e81205-79be-41d4-8822-1d59a79130ac.png','0b178ffa-5361-4d07-9326-25876bb57621.mp4',100,200,50,100),(17,'演示服饰0415','演示服饰','KZ','d5928828-e5b6-42f6-b7b3-a7d9968de3ed.png','cce446fc-2ef3-4588-bfc4-a3dcf1e5ecbd.mp4',100,200,50,100),(18,'演示服装2','212121','QZ','eacb323a-be27-4919-9256-653b2ca2fa4d.png','8dd3570a-4c23-4aa2-9f50-5956b10c6604.mp4',100,200,50,100),(19,'演示服饰2001','妍饰服饰操作','QZ','0b0e112a-4110-4a2a-a0ba-520838d02b32.png','e5398ef7-5a68-4967-b951-3186e515003b.mp4',100,200,50,100);
/*!40000 ALTER TABLE `clothes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_user` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `account` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sys_user_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES (1,'admin','admin','111111');
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_collection`
--

DROP TABLE IF EXISTS `user_collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_collection` (
  `id` int NOT NULL AUTO_INCREMENT,
  `app_user_id` int DEFAULT NULL,
  `clothes_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_collection`
--

LOCK TABLES `user_collection` WRITE;
/*!40000 ALTER TABLE `user_collection` DISABLE KEYS */;
INSERT INTO `user_collection` VALUES (1,1,1),(2,1,10),(3,18,16),(4,22,19);
/*!40000 ALTER TABLE `user_collection` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-15 21:59:41
