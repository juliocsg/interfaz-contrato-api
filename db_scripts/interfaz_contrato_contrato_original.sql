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
-- Table structure for table `contrato_original`
--

DROP TABLE IF EXISTS `contrato_original`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contrato_original` (
  `id` bigint NOT NULL,
  `caja_definir_caja_del_documento_fisico` varchar(255) DEFAULT NULL,
  `ci` varchar(255) DEFAULT NULL,
  `contrato` varchar(255) DEFAULT NULL,
  `correio_vendedor` varchar(255) DEFAULT NULL,
  `data_hora_anular_documentos` datetime(6) DEFAULT NULL,
  `data_hora_definir_caja_del_documento_fisico` datetime(6) DEFAULT NULL,
  `data_hora_doble_custodia` datetime(6) DEFAULT NULL,
  `data_hora_grabar_documentos_digitales` datetime(6) DEFAULT NULL,
  `data_hora_informe_caja_documentos_fisicos` datetime(6) DEFAULT NULL,
  `data_hora_notificar_resultado_validacion` datetime(6) DEFAULT NULL,
  `data_hora_verificar_imagenes` datetime(6) DEFAULT NULL,
  `data_hora_verificar_sospecha_de_fraude` datetime(6) DEFAULT NULL,
  `documento_fisico` bit(1) NOT NULL,
  `documentos_digitales` varchar(255) DEFAULT NULL,
  `eleccion_del_operador_doble_custodia` varchar(255) DEFAULT NULL,
  `eleccion_del_operador_verificar_sospecha_de_fraude` varchar(255) DEFAULT NULL,
  `fecha_final` datetime(6) DEFAULT NULL,
  `fecha_inicio` datetime(6) DEFAULT NULL,
  `file_base64` longtext,
  `file_dir` varchar(255) DEFAULT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  `file_type` varchar(255) DEFAULT NULL,
  `imagenes_rechazadas_verificar_imagenes` varchar(255) DEFAULT NULL,
  `imagens_validas` bit(1) NOT NULL,
  `linea` varchar(255) DEFAULT NULL,
  `localidad` varchar(255) DEFAULT NULL,
  `observacciones_del_operador_doble_custodia` varchar(255) DEFAULT NULL,
  `observacciones_del_operador_verificar_sospecha_de_fraude` varchar(255) DEFAULT NULL,
  `plane` varchar(255) DEFAULT NULL,
  `proceso` varchar(255) DEFAULT NULL,
  `proceso_etapa` varchar(255) DEFAULT NULL,
  `proceso_etapa_atual` varchar(255) DEFAULT NULL,
  `proceso_etapa_atual_data` datetime(6) DEFAULT NULL,
  `respostas_verificar_imagenes` mediumtext,
  `resultado_final_validacion` varchar(255) DEFAULT NULL,
  `situacion` varchar(255) DEFAULT NULL,
  `supervisor_vendedor` varchar(255) DEFAULT NULL,
  `usuario_anular_documentos` varchar(255) DEFAULT NULL,
  `usuario_definir_caja_del_documento_fisico` varchar(255) DEFAULT NULL,
  `usuario_doble_custodia` varchar(255) DEFAULT NULL,
  `usuario_grabar_documentos_digitales` varchar(255) DEFAULT NULL,
  `usuario_informe_caja_documentos_fisicos` varchar(255) DEFAULT NULL,
  `usuario_verificar_imagenes` varchar(255) DEFAULT NULL,
  `usuario_verificar_sospecha_de_fraude` varchar(255) DEFAULT NULL,
  `vendedor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato_original`
--

LOCK TABLES `contrato_original` WRITE;
/*!40000 ALTER TABLE `contrato_original` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_original` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-16 13:38:33
