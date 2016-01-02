-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 31-Dez-2015 às 14:48
-- Versão do servidor: 5.6.26
-- PHP Version: 5.6.12

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
-- Estrutura da tabela `matricula`
--

CREATE TABLE IF NOT EXISTS `matricula` (
  `id_aluno` varchar(9) COLLATE utf8mb4_bin NOT NULL COMMENT 'identificador do aluno',
  `id_curso` varchar(9) COLLATE utf8mb4_bin NOT NULL COMMENT 'identificador do curso onde se encontra matriculado',
  `anoLetivo` varchar(9) COLLATE utf8mb4_bin NOT NULL COMMENT 'ano lectivo em que se matricula ',
  `anoCurso` varchar(1) COLLATE utf8mb4_bin NOT NULL COMMENT 'ano do curso a que corresponde a matricula'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `matricula`
--

INSERT INTO `matricula` (`id_aluno`, `id_curso`, `anoLetivo`, `anoCurso`) VALUES
('A12753', 'CS13', '2015/2016', '2'),
('A1510', 'CB6', '2015/2016', '2'),
('A16409', 'CS20', '2015/2016', '3'),
('A17855', 'CB2', '2015/2016', '1'),
('A18141', 'CS14', '2015/2016', '3'),
('A18938', 'CS9', '2015/2016', '3'),
('A19705', 'CB19', '2015/2016', '4'),
('A20021', 'CB7', '2015/2016', '3'),
('A20044', 'CB10', '2015/2016', '4'),
('A20464', 'CS11', '2015/2016', '1'),
('A21008', 'CB1', '2015/2016', '5'),
('A22662', 'CB21', '2015/2016', '5'),
('A22670', 'CS22', '2015/2016', '2'),
('A22685', 'CS20', '2015/2016', '2'),
('A22688', 'CS10', '2015/2016', '2'),
('A22854', 'CS12', '2015/2016', '1'),
('A23508', 'CS19', '2015/2016', '1'),
('A23916', 'CB12', '2015/2016', '5'),
('A24654', 'CB2', '2015/2016', '5'),
('A24839', 'CB13', '2015/2016', '2'),
('A25073', 'CS15', '2015/2016', '3'),
('A26208', 'CB17', '2015/2016', '4'),
('A26737', 'CS12', '2015/2016', '3'),
('A27589', 'CB2', '2015/2016', '1'),
('A27608', 'CB22', '2015/2016', '2'),
('A27616', 'CB16', '2015/2016', '2'),
('A27629', 'CB1', '2015/2016', '4'),
('A27637', 'CS22', '2015/2016', '1'),
('A28722', 'CS8', '2015/2016', '2'),
('A29004', 'CS7', '2015/2016', '2'),
('A29011', 'CS4', '2015/2016', '2'),
('A29631', 'CB6', '2015/2016', '2'),
('A29871', 'CS10', '2015/2016', '3'),
('A30166', 'CB14', '2015/2016', '2'),
('A30176', 'CB18', '2015/2016', '3'),
('A30187', 'CS13', '2015/2016', '2'),
('A30201', 'CS10', '2015/2016', '2'),
('A30209', 'CS7', '2015/2016', '3'),
('A30211', 'CB19', '2015/2016', '1'),
('A30212', 'CS2', '2015/2016', '2'),
('A30213', 'CB4', '2015/2016', '3'),
('A30214', 'CB17', '2015/2016', '2'),
('A30219', 'CB15', '2015/2016', '4'),
('A30305', 'CB6', '2015/2016', '3'),
('A32010', 'CB17', '2015/2016', '3'),
('A32480', 'CB22', '2015/2016', '4'),
('A32597', 'CS9', '2015/2016', '2'),
('A32648', 'CB22', '2015/2016', '4'),
('A32753', 'CB3', '2015/2016', '4'),
('A33057', 'CB20', '2015/2016', '2'),
('A33140', 'CB3', '2015/2016', '3'),
('A33141', 'CS9', '2015/2016', '2'),
('A33142', 'CB10', '2015/2016', '5'),
('A33143', 'CB17', '2015/2016', '4'),
('A33145', 'CB3', '2015/2016', '2'),
('A33146', 'CB18', '2015/2016', '4'),
('A33148', 'CS19', '2015/2016', '1'),
('A33152', 'CB7', '2015/2016', '4'),
('A33155', 'CB14', '2015/2016', '5'),
('A33157', 'CB17', '2015/2016', '5'),
('A33158', 'CB19', '2015/2016', '2'),
('A33162', 'CS17', '2015/2016', '1'),
('A33163', 'CS14', '2015/2016', '2'),
('A33165', 'CS5', '2015/2016', '1'),
('A33168', 'CB8', '2015/2016', '5'),
('A33172', 'CB4', '2015/2016', '2'),
('A33173', 'CS2', '2015/2016', '1'),
('A33175', 'CS11', '2015/2016', '1'),
('A33176', 'CS12', '2015/2016', '1'),
('A33182', 'CS2', '2015/2016', '3'),
('A33186', 'CB1', '2015/2016', '3'),
('A33188', 'CS7', '2015/2016', '2'),
('A33272', 'CB19', '2015/2016', '5'),
('A33291', 'CS1', '2015/2016', '1'),
('A33650', 'CS1', '2015/2016', '1'),
('A33689', 'CB15', '2015/2016', '5'),
('A33703', 'CB20', '2015/2016', '4'),
('A33709', 'CS9', '2015/2016', '2'),
('A33822', 'CS4', '2015/2016', '3'),
('A33858', 'CB11', '2015/2016', '1'),
('A34035', 'CB12', '2015/2016', '5'),
('A34434', 'CB21', '2015/2016', '5'),
('A34640', 'CB2', '2015/2016', '1'),
('A34935', 'CS8', '2015/2016', '3'),
('A35052', 'CB13', '2015/2016', '5'),
('A35271', 'CS13', '2015/2016', '3'),
('A35272', 'CB14', '2015/2016', '2'),
('A35274', 'CS15', '2015/2016', '2'),
('A35277', 'CB11', '2015/2016', '3'),
('A35278', 'CB8', '2015/2016', '3'),
('A35280', 'CB17', '2015/2016', '5'),
('A35283', 'CB5', '2015/2016', '3'),
('A35284', 'CS15', '2015/2016', '3'),
('A35285', 'CS5', '2015/2016', '3'),
('A35291', 'CB11', '2015/2016', '5'),
('A35293', 'CS2', '2015/2016', '1'),
('A35294', 'CB4', '2015/2016', '1'),
('A35298', 'CS8', '2015/2016', '2'),
('A35300', 'CS2', '2015/2016', '3'),
('A35302', 'CB7', '2015/2016', '1'),
('A35303', 'CS3', '2015/2016', '3'),
('A35308', 'CB2', '2015/2016', '4'),
('A35311', 'CS7', '2015/2016', '3'),
('A35312', 'CB12', '2015/2016', '3'),
('A35315', 'CS3', '2015/2016', '1'),
('A35316', 'CS2', '2015/2016', '3'),
('A35318', 'CS17', '2015/2016', '2'),
('A35319', 'CB12', '2015/2016', '3'),
('A35320', 'CB20', '2015/2016', '5'),
('A35321', 'CB21', '2015/2016', '4'),
('A35322', 'CB7', '2015/2016', '2'),
('A35323', 'CB14', '2015/2016', '3'),
('A35325', 'CB3', '2015/2016', '4'),
('A35328', 'CS22', '2015/2016', '3'),
('A35330', 'CS5', '2015/2016', '2'),
('A35331', 'CB11', '2015/2016', '1'),
('A35332', 'CS11', '2015/2016', '3'),
('A35333', 'CB6', '2015/2016', '1'),
('A35334', 'CB10', '2015/2016', '4'),
('A35335', 'CB7', '2015/2016', '5'),
('A35337', 'CB7', '2015/2016', '3'),
('A35339', 'CS21', '2015/2016', '1'),
('A35340', 'CB10', '2015/2016', '4'),
('A35342', 'CS5', '2015/2016', '2'),
('A35348', 'CS19', '2015/2016', '2'),
('A35349', 'CB10', '2015/2016', '2'),
('A35350', 'CB7', '2015/2016', '1'),
('A35395', 'CS22', '2015/2016', '3'),
('A35398', 'CB14', '2015/2016', '5'),
('A35440', 'CB19', '2015/2016', '3'),
('A35443', 'CS17', '2015/2016', '2'),
('A35465', 'CS20', '2015/2016', '2'),
('A35808', 'CS7', '2015/2016', '2'),
('A35832', 'CB17', '2015/2016', '5'),
('A35843', 'CB10', '2015/2016', '2'),
('A36422', 'CS4', '2015/2016', '1'),
('A36424', 'CB8', '2015/2016', '2'),
('A36425', 'CS2', '2015/2016', '2'),
('A36445', 'CB4', '2015/2016', '1'),
('A36487', 'CB6', '2015/2016', '3'),
('A36539', 'CB22', '2015/2016', '1'),
('A36757', 'CB1', '2015/2016', '5'),
('A36758', 'CS18', '2015/2016', '2'),
('A36761', 'CB3', '2015/2016', '5'),
('A36864', 'CS20', '2015/2016', '3'),
('A36960', 'CS8', '2015/2016', '3'),
('A36971', 'CS3', '2015/2016', '2'),
('A38117', 'CS5', '2015/2016', '3'),
('A38121', 'CB11', '2015/2016', '1'),
('A38123', 'CB14', '2015/2016', '4'),
('A38124', 'CB12', '2015/2016', '4'),
('A38125', 'CB15', '2015/2016', '2'),
('A38126', 'CS9', '2015/2016', '3'),
('A38128', 'CB12', '2015/2016', '4'),
('A38132', 'CB6', '2015/2016', '5'),
('A38133', 'CS8', '2015/2016', '1'),
('A38134', 'CB11', '2015/2016', '5'),
('A38136', 'CB21', '2015/2016', '4'),
('A38137', 'CS14', '2015/2016', '1'),
('A38138', 'CS7', '2015/2016', '2'),
('A38139', 'CB12', '2015/2016', '2'),
('A38140', 'CB8', '2015/2016', '4'),
('A38142', 'CS5', '2015/2016', '3'),
('A38143', 'CS6', '2015/2016', '3'),
('A38150', 'CS22', '2015/2016', '3'),
('A38152', 'CS20', '2015/2016', '3'),
('A38155', 'CB11', '2015/2016', '4'),
('A38156', 'CS18', '2015/2016', '2'),
('A38157', 'CB7', '2015/2016', '1'),
('A38161', 'CB14', '2015/2016', '3'),
('A38163', 'CB3', '2015/2016', '2'),
('A38164', 'CB7', '2015/2016', '1'),
('A38165', 'CB15', '2015/2016', '1'),
('A38166', 'CS9', '2015/2016', '3'),
('A38167', 'CB14', '2015/2016', '2'),
('A38168', 'CS2', '2015/2016', '3'),
('A38169', 'CB2', '2015/2016', '1'),
('A38170', 'CB20', '2015/2016', '3'),
('A38171', 'CB6', '2015/2016', '1'),
('A38172', 'CS16', '2015/2016', '3'),
('A38174', 'CB16', '2015/2016', '5'),
('A38175', 'CS15', '2015/2016', '2'),
('A38176', 'CB2', '2015/2016', '5'),
('A38178', 'CB7', '2015/2016', '3'),
('A38179', 'CS8', '2015/2016', '2'),
('A38180', 'CB21', '2015/2016', '4'),
('A38184', 'CB7', '2015/2016', '5'),
('A38185', 'CB20', '2015/2016', '3'),
('A38186', 'CB2', '2015/2016', '5'),
('A38187', 'CS13', '2015/2016', '1'),
('A38189', 'CB15', '2015/2016', '2'),
('A38190', 'CB5', '2015/2016', '5'),
('A38191', 'CB12', '2015/2016', '2'),
('A38193', 'CB4', '2015/2016', '1'),
('A38194', 'CS3', '2015/2016', '2'),
('A38196', 'CS3', '2015/2016', '1'),
('A38197', 'CS14', '2015/2016', '2'),
('A38198', 'CS8', '2015/2016', '3'),
('A38199', 'CB8', '2015/2016', '1'),
('A38202', 'CB19', '2015/2016', '4'),
('A38204', 'CB11', '2015/2016', '2'),
('A38205', 'CS1', '2015/2016', '1'),
('A38206', 'CS18', '2015/2016', '2'),
('A38207', 'CS4', '2015/2016', '3'),
('A38210', 'CS8', '2015/2016', '2'),
('A38211', 'CS6', '2015/2016', '3'),
('A38212', 'CB12', '2015/2016', '2'),
('A38214', 'CS5', '2015/2016', '3'),
('A38215', 'CB8', '2015/2016', '3'),
('A38218', 'CB2', '2015/2016', '2'),
('A38219', 'CS11', '2015/2016', '3'),
('A38220', 'CB6', '2015/2016', '3'),
('A38222', 'CB22', '2015/2016', '5'),
('A38223', 'CS8', '2015/2016', '2'),
('A38224', 'CS17', '2015/2016', '1'),
('A38254', 'CB16', '2015/2016', '3'),
('A38595', 'CS3', '2015/2016', '3'),
('A39288', 'CS20', '2015/2016', '2'),
('A39341', 'CS1', '2015/2016', '1'),
('A39406', 'CS21', '2015/2016', '2'),
('A39408', 'CS9', '2015/2016', '3'),
('A39503', 'CB21', '2015/2016', '5'),
('A39506', 'CS2', '2015/2016', '3'),
('A39508', 'CB8', '2015/2016', '4'),
('A39622', 'CS8', '2015/2016', '1'),
('A39747', 'CS6', '2015/2016', '2'),
('A39750', 'CS14', '2015/2016', '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`id_aluno`,`id_curso`,`anoLetivo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;