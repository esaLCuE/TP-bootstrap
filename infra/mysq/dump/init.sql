CREATE DATABASE springboot;
use springboot;

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `Lastname` varchar(50) DEFAULT NULL,
  `Firstname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Hyde','Jemima'),(2,'Thornton','Adele'),(3,'Ramirez','Shellie'),(4,'Pennington','Kelly'),(5,'Forbes','Bruno'),(6,'Britt','Quinn'),(7,'Glass','Jescie'),(8,'Booker','Thane'),(9,'Riddle','Lance'),(10,'Kline','Rylee'),(11,'Neal','Sonia'),(12,'Mitchell','Neil'),(13,'Saunders','Alexis'),(14,'Watkins','Branden'),(15,'Vaughan','Emi'),(16,'Hancock','Palmer'),(17,'Holloway','Isabella'),(18,'Cotton','Silas'),(19,'Wong','Ryder'),(20,'Cooper','Nero'),(21,'Delacruz','Tallulah'),(22,'Sullivan','Imelda'),(23,'Stewart','Orlando'),(24,'Drake','Thor'),(25,'Strickland','Adrienne');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-26 11:08:59
