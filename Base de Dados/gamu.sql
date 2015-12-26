-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 26-Dez-2015 às 16:32
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
-- Estrutura da tabela `aluno`
--

CREATE TABLE IF NOT EXISTS `aluno` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `nome` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `dataNsc` date NOT NULL,
  `id_curso` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `anoCurso` int(11) NOT NULL,
  `id_instrumento` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `compositor`
--

CREATE TABLE IF NOT EXISTS `compositor` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `nome` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `dataNsc` date NOT NULL,
  `dataObt` date NOT NULL,
  `periodo` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `bio` text COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE IF NOT EXISTS `curso` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `designacao` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `duracao` varchar(2) COLLATE utf8mb4_bin NOT NULL,
  `id_instrumento` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `habilitacao`
--

CREATE TABLE IF NOT EXISTS `habilitacao` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `designacao` varchar(150) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `instrumento`
--

CREATE TABLE IF NOT EXISTS `instrumento` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `designacao` varchar(80) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `instrumento`
--

INSERT INTO `instrumento` (`id`, `designacao`) VALUES
('I1', 'Clarinete'),
('I10', 'OboÃ©'),
('I11', 'OrgÃ£o'),
('I12', 'PercussÃ£o'),
('I13', 'Piano'),
('I14', 'Saxofone'),
('I15', 'Trombone'),
('I16', 'Trompa'),
('I17', 'Trompete'),
('I18', 'Tuba'),
('I19', 'Violoncelo'),
('I2', 'Contrabaixo'),
('I20', 'Violino'),
('I21', 'Viola de Arco'),
('I22', 'Bandolim'),
('I3', 'Corne InglÃªs'),
('I4', 'EufÃ³nio'),
('I5', 'Fagote'),
('I6', 'Flauta'),
('I7', 'Fliscorne'),
('I8', 'Guitarra'),
('I9', 'Harpa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `obra`
--

CREATE TABLE IF NOT EXISTS `obra` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `nome` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `descricao` text COLLATE utf8mb4_bin NOT NULL,
  `anoCriacao` varchar(5) COLLATE utf8mb4_bin NOT NULL,
  `duracao` int(11) NOT NULL COMMENT 'em segundos ',
  `id_periodo` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_compositor` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `obra-instrumento`
--

CREATE TABLE IF NOT EXISTS `obra-instrumento` (
  `id_obra` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_instrumento` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `periodo`
--

CREATE TABLE IF NOT EXISTS `periodo` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `designacao` varchar(200) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE IF NOT EXISTS `professor` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `nome` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `dataNsc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor-curso`
--

CREATE TABLE IF NOT EXISTS `professor-curso` (
  `id_professor` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_curso` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor-habilitacao`
--

CREATE TABLE IF NOT EXISTS `professor-habilitacao` (
  `id_professor` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_habilitacao` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `compositor`
--
ALTER TABLE `compositor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `habilitacao`
--
ALTER TABLE `habilitacao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `instrumento`
--
ALTER TABLE `instrumento`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `obra`
--
ALTER TABLE `obra`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `obra-instrumento`
--
ALTER TABLE `obra-instrumento`
  ADD PRIMARY KEY (`id_obra`,`id_instrumento`);

--
-- Indexes for table `periodo`
--
ALTER TABLE `periodo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `professor-curso`
--
ALTER TABLE `professor-curso`
  ADD PRIMARY KEY (`id_professor`,`id_curso`);

--
-- Indexes for table `professor-habilitacao`
--
ALTER TABLE `professor-habilitacao`
  ADD PRIMARY KEY (`id_professor`,`id_habilitacao`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
