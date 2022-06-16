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
-- Table structure for table `employee_worked_hours`
--

DROP TABLE IF EXISTS `employee_worked_hours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_worked_hours` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_ID` int DEFAULT NULL,
  `WORKED_HOURS` int DEFAULT NULL,
  `WORKED_DATE` date DEFAULT NULL,
  `employeeid` bigint DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_employees_employees_worked_hours_idx` (`EMPLOYEE_ID`),
  CONSTRAINT `fk_employees_employees_worked_hours` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `employees` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=203 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_worked_hours`
--

LOCK TABLES `employee_worked_hours` WRITE;
/*!40000 ALTER TABLE `employee_worked_hours` DISABLE KEYS */;
INSERT INTO `employee_worked_hours` VALUES (1,NULL,20,'2022-06-15',1),(2,NULL,15,'2022-06-15',1),(52,1,19,'2022-06-15',NULL),(102,52,20,'2022-06-15',NULL),(152,52,18,'2022-06-15',NULL),(202,1,20,'2022-06-12',NULL);
/*!40000 ALTER TABLE `employee_worked_hours` ENABLE KEYS */;
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
