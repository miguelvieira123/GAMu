-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 29, 2015 at 09:55 PM
-- Server version: 5.6.28-log
-- PHP Version: 5.6.14-pl0-gentoo

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gamu`
--

-- --------------------------------------------------------

--
-- Table structure for table `auth`
--

CREATE TABLE `auth` (
  `login` varchar(9) NOT NULL,
  `passwd` varchar(32) NOT NULL,
  `accessLevel` varchar(1) NOT NULL,
  `cookies` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `auth`
--

INSERT INTO `auth` (`login`, `passwd`, `accessLevel`, `cookies`) VALUES
('A12753', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A14539', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A1510', 'efe6398127928f1b2e9ef3207fb82663', '1', ''),
('A15619', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A16409', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A17855', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A18141', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A18770', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A18938', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A19550', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A19705', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A20021', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A20044', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A20464', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A21008', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A21432', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A21711', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22662', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22670', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22685', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22688', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22695', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22701', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22721', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A22854', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A23508', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A23544', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A23916', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A24654', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A24784', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A24839', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A24875', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A24876', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A24885', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A25073', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A25383', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A25868', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A26208', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A26737', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27577', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27589', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27608', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27616', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27629', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27637', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27645', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27658', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A27673', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A28722', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A28735', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29004', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29011', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29048', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29253', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29254', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29282', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29631', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A29871', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30015', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30166', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30176', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30187', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30201', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30209', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30211', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30212', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30213', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30214', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30219', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30226', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30238', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30241', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30243', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30254', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30266', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A30305', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32010', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32480', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32597', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32608', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32648', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32652', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A32753', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33057', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33082', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33127', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33140', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33141', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33142', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33143', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33145', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33146', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33148', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33152', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33155', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33157', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33158', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33162', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33163', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33165', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33168', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33172', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33173', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33175', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33176', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33182', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33186', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33188', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33195', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33196', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33204', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33209', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33213', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33214', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33222', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33228', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33229', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33234', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33235', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33238', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33240', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33272', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33280', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33281', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33282', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33291', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33420', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33437', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33524', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33650', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33689', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33703', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33709', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33727', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33822', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A33858', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A34035', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A34434', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A34435', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A34508', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A34640', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A34935', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35052', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35144', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35271', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35272', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35274', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35277', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35278', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35280', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35283', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35284', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35285', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35291', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35293', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35294', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35298', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35300', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35302', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35303', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35308', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35311', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35312', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35315', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35316', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35318', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35319', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35320', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35321', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35322', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35323', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35325', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35328', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35330', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35331', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35332', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35333', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35334', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35335', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35337', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35339', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35340', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35342', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35348', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35349', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35350', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35352', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35355', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35357', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35360', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35363', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35364', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35366', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35371', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35372', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35374', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35375', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35376', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35377', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35378', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35395', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35398', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35418', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35440', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35443', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35465', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35808', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35832', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35843', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A35855', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36422', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36424', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36425', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36445', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36454', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36476', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36487', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36539', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36757', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36758', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36761', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36764', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36765', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36773', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36864', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36960', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36969', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A36971', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A37029', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38116', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38117', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38118', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38119', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38120', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38121', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38122', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38123', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38124', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38125', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38126', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38127', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38128', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38129', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38130', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38131', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38132', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38133', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38134', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38135', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38136', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38137', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38138', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38139', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38140', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38141', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38142', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38143', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38144', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38145', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38146', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38147', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38148', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38149', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38150', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38151', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38152', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38153', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38154', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38155', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38156', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38157', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38158', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38159', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38160', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38161', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38163', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38164', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38165', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38166', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38167', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38168', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38169', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38170', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38171', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38172', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38173', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38174', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38175', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38176', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38177', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38178', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38179', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38180', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38181', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38182', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38183', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38184', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38185', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38186', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38187', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38189', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38190', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38191', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38192', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38193', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38194', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38195', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38196', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38197', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38198', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38199', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38200', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38202', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38203', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38204', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38205', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38206', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38207', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38208', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38209', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38210', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38211', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38212', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38214', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38215', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38216', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38217', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38218', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38219', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38220', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38221', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38222', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38223', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38224', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38254', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38595', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A38908', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39288', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39341', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39342', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39343', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39406', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39407', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39408', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39410', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39503', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39506', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39508', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39509', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39622', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39671', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39747', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39750', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39938', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('A39944', '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0', '1', ''),
('P1', 'a2958ec16247ad36c229546487296c93', '6', ''),
('P10', '', '', ''),
('P11', '', '', ''),
('P12', '', '', ''),
('P13', '', '', ''),
('P14', '', '', ''),
('P15', '', '', ''),
('P16', '', '', ''),
('P17', '', '', ''),
('P18', '', '', ''),
('P19', '', '', ''),
('P2', '', '', ''),
('P20', '', '', ''),
('P21', '', '', ''),
('P22', '', '', ''),
('P23', '', '', ''),
('P24', '', '', ''),
('P25', '', '', ''),
('P26', '', '', ''),
('P27', '', '', ''),
('P28', '', '', ''),
('P29', '', '', ''),
('P3', '', '', ''),
('P30', '', '', ''),
('P31', '', '', ''),
('P32', '', '', ''),
('P33', '', '', ''),
('P34', '', '', ''),
('P35', '', '', ''),
('P36', '', '', ''),
('P37', '', '', ''),
('P38', '', '', ''),
('P39', '', '', ''),
('P4', '', '', ''),
('P40', '', '', ''),
('P41', '', '', ''),
('P42', '', '', ''),
('P43', '', '', ''),
('P44', '', '', ''),
('P45', '', '', ''),
('P46', '', '', ''),
('P47', '', '', ''),
('P48', '', '', ''),
('P49', '', '', ''),
('P5', '', '', ''),
('P50', '', '', ''),
('P51', '', '', ''),
('P52', '', '', ''),
('P53', '', '', ''),
('P54', '', '', ''),
('P55', '', '', ''),
('P56', '', '', ''),
('P57', '', '', ''),
('P58', '', '', ''),
('P59', '', '', ''),
('P6', '', '', ''),
('P60', '', '', ''),
('P61', '', '', ''),
('P62', '', '', ''),
('P63', '', '', ''),
('P64', '', '', ''),
('P65', '', '', ''),
('P66', '', '', ''),
('P67', '', '', ''),
('P68', '', '', ''),
('P69', '', '', ''),
('P7', '', '', ''),
('P70', '', '', ''),
('P71', '', '', ''),
('P72', '', '', ''),
('P73', '', '', ''),
('P74', '', '', ''),
('P75', '', '', ''),
('P76', '', '', ''),
('P77', '', '', ''),
('P78', '', '', ''),
('P79', '', '', ''),
('P8', '', '', ''),
('P80', '', '', ''),
('P81', '', '', ''),
('P82', '', '', ''),
('P83', '', '', ''),
('P84', '', '', ''),
('P85', '', '', ''),
('P86', '', '', ''),
('P87', '', '', ''),
('P88', '', '', ''),
('P89', '', '', ''),
('P9', '', '', ''),
('P90', '', '', ''),
('P91', '', '', ''),
('P92', '', '', ''),
('P93', '', '', ''),
('P94', '', '', ''),
('P95', '', '', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
