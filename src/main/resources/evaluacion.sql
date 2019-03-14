CREATE DATABASE  IF NOT EXISTS `evaluacion` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `evaluacion`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: evaluacion
-- ------------------------------------------------------
-- Server version	5.5.5-10.2.8-MariaDB

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
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo` (
  `idEquipo` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `Jugador_idJugador` int(11) NOT NULL,
  PRIMARY KEY (`idEquipo`),
  KEY `fk_Equipo_Jugador_idx` (`Jugador_idJugador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hojas`
--

DROP TABLE IF EXISTS `hojas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hojas` (
  `idHojas` int(11) NOT NULL,
  `puntaje` int(11) DEFAULT NULL,
  `Partida_idPartida` int(11) NOT NULL,
  `Jugador_idJugador` int(11) NOT NULL,
  PRIMARY KEY (`idHojas`),
  KEY `fk_Hojas_Partida1_idx` (`Partida_idPartida`),
  KEY `fk_Hojas_Jugador1_idx` (`Jugador_idJugador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hojas`
--

LOCK TABLES `hojas` WRITE;
/*!40000 ALTER TABLE `hojas` DISABLE KEYS */;
/*!40000 ALTER TABLE `hojas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jugador` (
  `idJugador` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idJugador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oauth_client_details`
--

DROP TABLE IF EXISTS `oauth_client_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oauth_client_details` (
  `client_id` varchar(128) NOT NULL,
  `resource_ids` varchar(128) DEFAULT NULL,
  `client_secret` varchar(128) DEFAULT NULL,
  `scope` varchar(128) DEFAULT NULL,
  `authorized_grant_types` varchar(128) DEFAULT NULL,
  `web_server_redirect_uri` varchar(128) DEFAULT NULL,
  `authorities` varchar(128) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` varchar(45) DEFAULT NULL,
  `additional_information` longtext DEFAULT NULL,
  `autoapprove` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oauth_client_details`
--

LOCK TABLES `oauth_client_details` WRITE;
/*!40000 ALTER TABLE `oauth_client_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `oauth_client_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partida`
--

DROP TABLE IF EXISTS `partida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partida` (
  `idPartida` int(11) NOT NULL,
  `identificador` varchar(45) DEFAULT NULL,
  `Equipo_idEquipo` int(11) NOT NULL,
  PRIMARY KEY (`idPartida`),
  KEY `fk_Partida_Equipo1_idx` (`Equipo_idEquipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partida`
--

LOCK TABLES `partida` WRITE;
/*!40000 ALTER TABLE `partida` DISABLE KEYS */;
/*!40000 ALTER TABLE `partida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfil` (
  `idperfil` int(11) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idperfil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secuencia`
--

DROP TABLE IF EXISTS `secuencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `secuencia` (
  `entity` varchar(20) NOT NULL,
  `value` int(11) NOT NULL,
  `hojas_idHojas` int(11) NOT NULL,
  PRIMARY KEY (`entity`),
  KEY `fk_secuencia_hojas1_idx` (`hojas_idHojas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secuencia`
--

LOCK TABLES `secuencia` WRITE;
/*!40000 ALTER TABLE `secuencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `secuencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuariosistema`
--

DROP TABLE IF EXISTS `usuariosistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuariosistema` (
  `idUsuario` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuariosistema`
--

LOCK TABLES `usuariosistema` WRITE;
/*!40000 ALTER TABLE `usuariosistema` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuariosistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuariosistema_has_perfil`
--

DROP TABLE IF EXISTS `usuariosistema_has_perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuariosistema_has_perfil` (
  `usuariosistema_idUsuario` int(11) NOT NULL,
  `perfil_idperfil` int(11) NOT NULL,
  PRIMARY KEY (`usuariosistema_idUsuario`,`perfil_idperfil`),
  KEY `fk_usuariosistema_has_perfil_perfil1_idx` (`perfil_idperfil`),
  KEY `fk_usuariosistema_has_perfil_usuariosistema1_idx` (`usuariosistema_idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuariosistema_has_perfil`
--

LOCK TABLES `usuariosistema_has_perfil` WRITE;
/*!40000 ALTER TABLE `usuariosistema_has_perfil` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuariosistema_has_perfil` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-25 15:26:59
