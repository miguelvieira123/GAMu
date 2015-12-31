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
-- Estrutura da tabela `aluno`
--

CREATE TABLE IF NOT EXISTS `aluno` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `nome` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `dataNsc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`id`, `nome`, `dataNsc`) VALUES
('A12753', 'Maria Luisa Villaverde Machado Fernandes Novais', '2003-04-01'),
('A1510', 'Ademar Fontes De Magalhaes Goncalves', '2000-07-08'),
('A16409', 'Jorge Manuel De Castro Maio Gomes Da Costa', '2003-08-03'),
('A17855', 'Joao Paulo Da Silva Castro', '1998-01-06'),
('A18141', 'Alexandre Miguel Da Costa Ferreira Dos Santos', '2002-04-15'),
('A18938', 'Joao Pedro Brito Antunes Guimaraes', '2002-01-01'),
('A19705', 'Jose Antonio Pereira Cibrao', '1996-12-01'),
('A20021', 'Carlos Jose Da Cunha Ribeiro', '2001-04-03'),
('A20044', 'Bruno De Almeida Ramos Pereira', '2000-12-03'),
('A20464', 'Joel Tito Da Cruz Pinto', '2002-05-14'),
('A21008', 'Jorge Miguel Silva Melo Pereira', '1999-02-20'),
('A22662', 'Joao Paulo Carrapato Almeida', '1996-10-27'),
('A22670', 'Jose Manuel Teixeira Fernandes', '2005-03-18'),
('A22685', 'Marco Francisco Da Silva Lizardo', '2004-03-05'),
('A22688', 'Marco Ricardo Barbosa Coelho', '2005-03-25'),
('A22854', 'Davi Carneiro Pereira', '2004-01-06'),
('A23508', 'Jose Romeu Fernandes Pinto', '2003-04-09'),
('A23544', 'Mario Rui Anunciacao Monteiro', '2003-02-12'),
('A23916', 'Jose Graca Da Nobrega', '2000-11-01'),
('A24654', 'Carlos De Sousa Cabral Brandao', '1999-11-22'),
('A24839', 'Leonor Isabel Ferreira De Melo Osorio Araujo', '2000-10-13'),
('A25073', 'Ana Margarida Lima Alem', '2005-10-07'),
('A26208', 'Igor Murilo De Almeida', '2001-03-27'),
('A26737', 'Fernando Miguel Sousa Lisboa', '2002-02-15'),
('A27589', 'Ana Margarida Fidalgo Pinheiro', '1998-03-26'),
('A27608', 'Eurico Manuel Teles Morais', '2001-03-21'),
('A27616', 'Francisco Jose Prata Da Paz', '2000-02-13'),
('A27629', 'Jose Luis Pinto Monteiro Alves', '2001-03-11'),
('A27637', 'Manuel Jose Torres Sousa Da Cunha', '2002-03-02'),
('A28722', 'Jose Miguel Ferreira Pontes', '2003-05-07'),
('A29004', 'Marangaze Joaquim Munhepe Mulhanga', '2002-06-19'),
('A29011', 'Marco Alexandre Barreira Medeiros Teixeira', '2002-01-24'),
('A29631', 'Luis Filipe Ribeiro Novais', '1996-01-01'),
('A29871', 'Andre Leite Ferreira', '2003-11-10'),
('A30166', 'Antonio Tiago Morgado Pereira', '1998-09-18'),
('A30176', 'Bruno Ricardo Duarte Magalhaes', '2000-05-22'),
('A30187', 'Fernando Sergio Madaleno Pereira', '2004-06-23'),
('A30201', 'Joao Guilherme Rabaca Campos', '2003-03-11'),
('A30209', 'Jorge Miguel Goncalves Da Silva', '2005-05-27'),
('A30211', 'Jose Carlos Carvalho Dos Santos', '1997-05-07'),
('A30212', 'Jose Carlos Da Rocha Machado', '2002-07-21'),
('A30213', 'Jose Manuel Loureiro De Azevedo Teixeira', '1998-07-19'),
('A30214', 'Jose Pedro Silva De Oliveira Carvalho', '1998-11-10'),
('A30219', 'Manuel Fernando Soto Maior Franqueira', '2001-03-26'),
('A30305', 'Emanuel Jose Antunes Fernandes', '2000-06-15'),
('A32010', 'Catarina Sofia Martinho Luis', '1998-05-19'),
('A32480', 'Jose Manuel Lima Gandarela', '1999-11-11'),
('A32597', 'Aderito Nelson Miranda De Oliveira', '2003-12-04'),
('A32648', 'Daniel Filipe Peres Ferreira', '1997-12-28'),
('A32753', 'Joao Arnaldo Freitas De Abreu', '1997-07-02'),
('A33057', 'Antonio Rui Miranda De Lemos', '1996-09-21'),
('A33140', 'Avelino Rodrigo Araujo Semelhe De Sousa Pinto', '1996-12-13'),
('A33141', 'Barbara Alexandra Eusebio Freitas', '2005-02-27'),
('A33142', 'Bruno Cesar Pereira Da Silva', '1996-08-22'),
('A33143', 'Bruno Miguel Campos Rodrigues', '1996-09-03'),
('A33145', 'Bruno Miguel Flores Diamantino', '2000-12-19'),
('A33146', 'Bruno Miguel Magalhaes Azevedo', '1999-06-02'),
('A33148', 'Bruno Miguel Teixeira Paiva De Faria', '2002-09-16'),
('A33152', 'Daniel Ricardo De Castro Mendes', '2000-03-17'),
('A33155', 'Duarte Filipe Afonso Chaves', '1997-01-25'),
('A33157', 'Eurico Manuel Folgado Afonso', '1997-05-26'),
('A33158', 'Fausto Miguel Pacheco Faria Viana', '1999-11-19'),
('A33162', 'Goncalo Leal Machado Ribeiro Pinto', '2002-02-19'),
('A33163', 'Goncalo Paulo Cunha Cardoso Ferreira', '2003-05-05'),
('A33165', 'Helder Artur Peixoto Magalhaes', '2002-07-06'),
('A33168', 'Joana Souto De Miranda Gonzalez', '1996-04-26'),
('A33172', 'Joao Miguel Raposo Da Silva Marques', '1999-09-25'),
('A33173', 'Joao Paulo Minhava Peixoto Assis Cardoso', '2002-02-11'),
('A33175', 'Joao Pedro Bacao Coelho De Barros', '2005-08-24'),
('A33176', 'Joao Pedro Gomes Fernandes', '2003-10-11'),
('A33182', 'Jose Miguel Dos Santos Ferraz', '2002-12-14'),
('A33186', 'Luis Filipe Gama Pais Cabral', '2000-02-01'),
('A33188', 'Luis Pedro Lopes Pereira', '2003-07-09'),
('A33272', 'Hugo Andre Peixoto Freitas Pereira', '1997-03-17'),
('A33291', 'Barbara Sofia Araujo Da Silva', '2005-04-03'),
('A33650', 'Luis Andre Da Cunha Marques', '2005-03-28'),
('A33689', 'Carlos Andre Brito Ribeiro', '1999-11-10'),
('A33703', 'Isabel Maria Rosendo Cardoso', '1996-10-25'),
('A33709', 'Jorge Manuel Viana Ribeiro Martins Forte', '2002-10-24'),
('A33822', 'Andre Fernandes Martins', '2004-12-19'),
('A33858', 'Fernando Jorge Pinto Lima', '1998-04-13'),
('A34035', 'Leonor Isabel Constantino Caeiro Boga', '1997-10-21'),
('A34434', 'Jose Carlos Marques Dias', '2001-02-07'),
('A34640', 'Carlos Prudencio Do Espirito Crisostomo', '1998-01-12'),
('A34935', 'Joao Manuel De Campos Goncalves', '2004-01-20'),
('A35052', 'Cesar Filipe Da Cruz Gomes', '2001-07-20'),
('A35271', 'Alexandre Jorge Camelo Faria', '2004-04-28'),
('A35272', 'Ana Luisa Parreira Nunes', '1998-02-22'),
('A35274', 'Andre Filipe Oliveira Martins', '2002-06-22'),
('A35277', 'Antonio Manuel Martins Pinto', '1997-09-16'),
('A35278', 'Antonio Manuel Rodrigues Fernandes', '1996-06-19'),
('A35280', 'Antonio Ricardo Pereira Goncalves', '1997-12-20'),
('A35283', 'Bruno Edgar Bernardo Teixeira', '1997-10-10'),
('A35284', 'Bruno Emanuel Teixeira De Castro Araujo', '2003-12-19'),
('A35285', 'Bruno Gabriel Leal Machado Dos Santos', '2005-11-24'),
('A35291', 'Carlos Miguel Tavares Lopes', '2000-09-26'),
('A35293', 'David Daniel Cardoso De Oliveira', '2002-04-11'),
('A35294', 'Diamantino Jose Madeira Abobeleira', '1998-06-24'),
('A35298', 'Duarte Nuno Malheiro De Barreiro', '2005-01-04'),
('A35300', 'Emanuel Cerdeira Mesquita', '2003-09-20'),
('A35302', 'Fabio Roberto Leite Matos', '1998-02-25'),
('A35303', 'Filipe Antonio Goncalves Da Silva', '2004-03-03'),
('A35308', 'Francisco Jose Maio Leite', '1996-12-10'),
('A35311', 'Goncalo Luis Malheiro De Oliveira Novais Machado', '2005-11-26'),
('A35312', 'Helder Filipe De Castro Marques', '2000-08-20'),
('A35315', 'Hugo Emanuel Queiros Teixeira Da Silva', '2002-07-24'),
('A35316', 'Hugo Guilherme Dos Santos Rigor', '2003-10-18'),
('A35318', 'Jason Peter Costa', '2004-11-16'),
('A35319', 'Joao Alexandre Vaz Oliveira', '1998-11-08'),
('A35320', 'Joao Antonio Lavrador Vilanova', '1998-02-28'),
('A35321', 'Joao Filipe Fontes Machado', '2000-04-19'),
('A35322', 'Joao Gilberto Lamarao Da Silva', '1997-06-12'),
('A35323', 'Joao Mario Mendes De Oliveira', '2000-11-12'),
('A35325', 'Joao Paulo Coelho Gomes Teixeira E Oliveira', '1998-12-23'),
('A35328', 'Joel Araujo Rocha', '2002-01-11'),
('A35330', 'Jorge Andre Alves De Melo', '2004-03-09'),
('A35331', 'Jose Alexandre De Carvalho Amorim', '2000-02-27'),
('A35332', 'Jose Diogo Ribeiro Liz De Almeida', '2003-12-04'),
('A35333', 'Jose Filipe Queijo Fernandes', '1996-07-03'),
('A35334', 'Jose Miguel Silva Peixoto De Carvalho', '2001-05-08'),
('A35335', 'Jose Paulo Carneiro De Melo Mamede', '1999-12-21'),
('A35337', 'Jose Pedro Domingues', '2000-01-20'),
('A35339', 'Lidia Nogueira Laranjeira', '2005-12-18'),
('A35340', 'Liliana Solange Sequeira Henriques De Macedo', '2000-11-20'),
('A35342', 'Luis Carlos Goncalo Leonardo', '2003-01-13'),
('A35348', 'Manuel Jose Gomes Meireles', '2004-01-12'),
('A35349', 'Marcia Marlene De Almeida Martins', '1998-09-25'),
('A35350', 'Marcial Coelho Gomes', '2000-09-13'),
('A35395', 'Hugo Jose Fernandes Carvalho', '2003-08-08'),
('A35398', 'Jose Manuel Esteves', '1998-01-14'),
('A35440', 'Daniel Barbosa Alves', '2001-12-26'),
('A35443', 'Francisco Jose Martins Gomes', '2003-06-16'),
('A35465', 'Fernando Antonio Alves Lopes', '2004-08-09'),
('A35808', 'Candido Miguel Rebelo Barros', '2002-11-17'),
('A35832', 'Joao Pedro Goncalves De Carvalho', '1999-06-06'),
('A35843', 'Lara Sofia Alpoim Miranda', '2000-11-27'),
('A36422', 'Bruno Jose De Macedo Soares Amor', '2003-01-06'),
('A36424', 'Francisco Eurico Pinto Cortez Martins Leite', '1997-04-04'),
('A36425', 'Joao Pedro Robalo Espinho Pereira Da Silva', '2003-08-10'),
('A36445', 'Filipe Barroso De Oliveira', '1998-10-24'),
('A36487', 'Ali Dos Reis Mota', '2000-10-03'),
('A36539', 'Admilson Cesar Andrade Rodrigues', '1998-09-17'),
('A36757', 'Ernesto Manuel Da Silva Lopes', '1997-09-15'),
('A36758', 'Hugo Alexandre Pereira Triunfante Martins', '2002-08-03'),
('A36761', 'Jose Eduardo Teixeira Rito', '2000-03-25'),
('A36864', 'Maria Beatriz Alves De Sa Campos', '2005-04-02'),
('A36960', 'Jose Carlos De Freitas Fontao', '2005-01-24'),
('A36971', 'Augusto Jorge Pereira Da Costa', '2004-10-23'),
('A38117', 'Antonio Andre Marques Ribeiro', '2005-10-04'),
('A38121', 'Jose Miguel Rodrigues Oliveira Da Silva', '2001-08-06'),
('A38123', 'Joao Manuel Da Silva Sanches', '2000-09-12'),
('A38124', 'Bruno Ricardo Cunha Magalhaes', '1999-12-13'),
('A38125', 'Carlos Cesar Madureira Romano', '1996-07-04'),
('A38126', 'Carlos Alfredo Macieira De Faria', '2004-03-25'),
('A38128', 'Jose Pedro Rodrigues Magalhaes', '2000-12-11'),
('A38132', 'Avelino Jose Da Costa Rego', '1997-12-02'),
('A38133', 'Joao Goncalo Botica Ribeiro Da Silva', '2005-09-09'),
('A38134', 'Ivo Manuel Dantas Monteiro', '1996-04-12'),
('A38136', 'Jose Nuno Martins Pinto Fraga', '2000-06-11'),
('A38137', 'Jose Pedro Ribeiro Da Araujo', '2003-06-13'),
('A38138', 'Antonio Nuno Bacelar Martins Barreiro Covas', '2005-08-10'),
('A38139', 'Jorge Alberto Faria Miranda', '1998-07-13'),
('A38140', 'Jose Pedro Machado Gomes', '2000-12-19'),
('A38142', 'Jose Pedro Faria E Vasconcelos Correia', '2004-05-11'),
('A38143', 'Antonio Sergio Matos Silva', '2003-09-03'),
('A38150', 'Leandro Emanuel Da Silva Salgado Barbosa', '2005-02-01'),
('A38152', 'Marco Antonio Sampaio Freitas De Castro', '2004-08-12'),
('A38155', 'Julio Andre Rodrigues Araujo', '2001-05-14'),
('A38156', 'Bruno Filipe Da Costa Hermenegildo', '2002-04-16'),
('A38157', 'Joel Humberto Da Silva Beirao Do Vale Carvalho', '2000-12-10'),
('A38161', 'Mariana Pereira Neves', '1997-10-16'),
('A38163', 'Gaspar Augusto Simoes Correia Vieira Leite', '1999-08-22'),
('A38164', 'Diogo Paulo Da Fonte Lapa', '2000-08-13'),
('A38165', 'Afonso Delerue Arriaga', '2001-02-04'),
('A38166', 'Diogo Filipe Da Silva Cardoso', '2002-02-23'),
('A38167', 'Duarte Alexandre Da Cunha Alves', '1997-04-26'),
('A38168', 'Luiz Alberto De Castro Santos', '2002-06-24'),
('A38169', 'Andre Abilio Nunes Rocha Rodrigues', '1998-06-22'),
('A38170', 'Joao Pedro Oliveira Pereira', '1999-11-06'),
('A38171', 'Mario Andre Patricio Teixeira Julio', '2000-11-15'),
('A38172', 'Luis Tiago Afonso Mascarenhas', '2002-06-03'),
('A38174', 'Guilherme Reis Barbosa', '2001-12-12'),
('A38175', 'Joao Paulo Da Silva Gomes', '2003-04-26'),
('A38176', 'Agostinho Manuel Alves Da Silva', '1997-04-10'),
('A38178', 'Marco Alexandre Teixeira Palos', '2001-11-24'),
('A38179', 'Marco Antonio Teixeira Martins', '2005-01-18'),
('A38180', 'Joao Carlos Azevedo Salgado Guimaraes', '2001-04-09'),
('A38184', 'Maria Cristina Carneiro Barreira', '1997-02-04'),
('A38185', 'Helder Jose Ferreira Barbosa Ribeiro', '2001-09-25'),
('A38186', 'Joao Nuno Marques Dos Santos', '1997-04-09'),
('A38187', 'Flavio Miguel Xavier Ferreira', '2003-03-19'),
('A38189', 'Jose Antonio Da Cunha E Silva', '1997-03-23'),
('A38190', 'Eliseu Carneiro Dos Santos Rocha', '1996-10-16'),
('A38191', 'Joao Miguel Rodrigues Batista', '1997-05-10'),
('A38193', 'Alexandre Manuel Pereira De Miranda Pinto', '1996-04-03'),
('A38194', 'Mario Da Fonte Lameiras', '2005-05-12'),
('A38196', 'Alexandre Coelho Carvalho', '2003-05-11'),
('A38197', 'Hugo Alexandre Sobreiro De Seixas', '2005-02-05'),
('A38198', 'Joaquim Machado Goncalves Sampaio', '2004-12-13'),
('A38199', 'Joao Ricardo Da Silva Campos', '1997-03-22'),
('A38202', 'Hugo Filipe Nascimento Pereira', '1998-04-22'),
('A38204', 'Hugo Jose Pereira Pacheco', '1996-09-05'),
('A38205', 'Jose Luis Lopes De Araujo', '2002-11-03'),
('A38206', 'Jose Manuel Araujo Soares', '2003-08-19'),
('A38207', 'Catarina Isabel De Oliveira Mateus', '2002-09-14'),
('A38210', 'Daniela Cristina Garcia Teixeira', '2004-12-09'),
('A38211', 'Daniel Torres Goncalves', '2004-10-23'),
('A38212', 'Joao Pedro Silva Araujo', '1998-05-18'),
('A38214', 'Andre Filipe De Sousa Viveiros', '2005-11-02'),
('A38215', 'Andre Ribeiro Rodrigues', '1998-09-20'),
('A38218', 'Alexandrina Maria Ferreira Lemos', '1997-02-05'),
('A38219', 'Luis Filipe Pereira Goncalves', '2004-05-21'),
('A38220', 'Joao Rafael Ferreira Veloso', '1996-04-09'),
('A38222', 'Jose Luis Cardoso Silva', '1997-11-13'),
('A38223', 'Luis Diogo Monteiro Duarte Couto', '2004-10-05'),
('A38224', 'Jose Filipe Henriques Vilas Boas', '2004-06-21'),
('A38254', 'Manuel Domingos De Carvalho Felgueiras Da Silva Santos', '2001-07-17'),
('A38595', 'Filipe Goncalo Goncalves Da Costa', '2004-12-16'),
('A39288', 'Genildo Soares Neves', '2005-09-27'),
('A39341', 'Luis Fernando Romanel Rodrigues', '2005-04-07'),
('A39406', 'Marco Alexandre Aguiar Vaz', '2004-07-16'),
('A39408', 'Luis Filipe Faria Monteiro Capelo', '2002-01-13'),
('A39503', 'Helder Nuno Martins Do Vale Tome', '2001-06-27'),
('A39506', 'Jose Eduardo Correia Calheiros', '2005-09-23'),
('A39508', 'Goncalo Manuel Correia Calheiros', '2001-07-24'),
('A39622', 'Joao Paulo Silva De Vasconcelos Gusmao', '2003-10-19'),
('A39747', 'Luis Pedro Ferreira Leite Dos Santos Aleixo', '2002-01-05'),
('A39750', 'Joao Paulo Barbosa Oliveira', '2002-11-26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
