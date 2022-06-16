-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: interfaz_contrato
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `ID` int NOT NULL,
  `GENDER_ID` int DEFAULT NULL,
  `JOB_ID` int DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `LAST_NAME` varchar(255) DEFAULT NULL,
  `BIRTH_DATE` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_gender_employee_idx` (`GENDER_ID`),
  KEY `fk_jobs_employee_idx` (`JOB_ID`),
  CONSTRAINT `fk_gender_employee` FOREIGN KEY (`GENDER_ID`) REFERENCES `genders` (`ID`),
  CONSTRAINT `fk_jobs_employee` FOREIGN KEY (`JOB_ID`) REFERENCES `jobs` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,1,1,'Julio','González','1993-11-22'),(52,1,1,'julio','saucedo','2022-06-16'),(102,1,1,'julio','saucedo','2022-06-16'),(103,1,1,'julio','saucedo','2022-05-16'),(152,1,1,'julio','saucedo','2022-05-16'),(153,1,1,'julio','saucedo','2022-05-16'),(154,1,1,'julio','saucedo','1993-01-01'),(202,1,1,'julio','saucedo','2022-06-16'),(203,1,1,'julio','saucedo','1980-06-11'),(204,1,1,'julio','saucedo','1980-06-11'),(252,1,1,'julio','saucedo','2015-06-16'),(302,1,1,'julio','saucedo','1999-06-15'),(352,1,1,'julio','saucedo','1999-06-15'),(402,1,1,'julio','saucedo','1999-06-15'),(452,1,1,'julio','saucedo','1999-06-15'),(502,1,1,'julio','saucedo','1999-06-15'),(552,1,1,'mario','saucedo','1999-06-15'),(602,1,1,'mirian','saucedo','1999-06-15'),(202000001,1,1,'julio','saucedo',NULL),(202000052,1,1,'julio','saucedo',NULL);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-16 13:38:32
