-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 28-Dez-2015 às 21:03
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
('A14539', 'Orlando Jorge Goncalves Pinto', '2003-03-15'),
('A1510', 'Ademar Fontes De Magalhaes Goncalves', '2000-07-08'),
('A15619', 'Nuno Miguel Afonso Carvalho De Moura', '2001-02-24'),
('A16409', 'Jorge Manuel De Castro Maio Gomes Da Costa', '2003-08-03'),
('A17855', 'Joao Paulo Da Silva Castro', '1998-01-06'),
('A18141', 'Alexandre Miguel Da Costa Ferreira Dos Santos', '2002-04-15'),
('A18770', 'Rosa Alexandra Azevedo Guimaraes', '1996-09-09'),
('A18938', 'Joao Pedro Brito Antunes Guimaraes', '2002-01-01'),
('A19550', 'Ricardo Manuel Rodrigues De Oliveira Dimas', '1996-08-16'),
('A19705', 'Jose Antonio Pereira Cibrao', '1996-12-01'),
('A20021', 'Carlos Jose Da Cunha Ribeiro', '2001-04-03'),
('A20044', 'Bruno De Almeida Ramos Pereira', '2000-12-03'),
('A20464', 'Joel Tito Da Cruz Pinto', '2002-05-14'),
('A21008', 'Jorge Miguel Silva Melo Pereira', '1999-02-20'),
('A21432', 'Miguel Manuel Gomes Rodrigues', '1999-12-07'),
('A21711', 'Pedro David Alves Martinho', '2001-01-01'),
('A22662', 'Joao Paulo Carrapato Almeida', '1996-10-27'),
('A22670', 'Jose Manuel Teixeira Fernandes', '2005-03-18'),
('A22685', 'Marco Francisco Da Silva Lizardo', '2004-03-05'),
('A22688', 'Marco Ricardo Barbosa Coelho', '2005-03-25'),
('A22695', 'Nancy Do Sameiro Silverio Lavandeira', '2004-01-02'),
('A22701', 'Nuno Miguel Martins Casanova', '1997-06-03'),
('A22721', 'Ricardo Nuno Moreira Castilho Ferreira Lopes', '2000-08-03'),
('A22854', 'Davi Carneiro Pereira', '2004-01-06'),
('A23508', 'Jose Romeu Fernandes Pinto', '2003-04-09'),
('A23544', 'Mario Rui Anunciacao Monteiro', '2003-02-12'),
('A23916', 'Jose Graca Da Nobrega', '2000-11-01'),
('A24654', 'Carlos De Sousa Cabral Brandao', '1999-11-22'),
('A24784', 'Nuno Filipe Marques Moreira Ribeiro', '2002-12-17'),
('A24839', 'Leonor Isabel Ferreira De Melo Osorio Araujo', '2000-10-13'),
('A24875', 'Rui Manuel Couto Da Silva', '1998-01-06'),
('A24876', 'Rui Miguel Escudeiro Da Costa Aguiar', '2002-01-03'),
('A24885', 'Sergio Manuel Ruivo Cardoso', '2001-04-11'),
('A25073', 'Ana Margarida Lima Alem', '2005-10-07'),
('A25383', 'Pedro Miguel Martins Fernandes', '2003-08-19'),
('A25868', 'Rui Miguel Morais Lopes', '2001-02-26'),
('A26208', 'Igor Murilo De Almeida', '2001-03-27'),
('A26737', 'Fernando Miguel Sousa Lisboa', '2002-02-15'),
('A27577', 'Paulo Cesar De Carvalho Lopes', '1996-12-07'),
('A27589', 'Ana Margarida Fidalgo Pinheiro', '1998-03-26'),
('A27608', 'Eurico Manuel Teles Morais', '2001-03-21'),
('A27616', 'Francisco Jose Prata Da Paz', '2000-02-13'),
('A27629', 'Jose Luis Pinto Monteiro Alves', '2001-03-11'),
('A27637', 'Manuel Jose Torres Sousa Da Cunha', '2002-03-02'),
('A27645', 'Nuno Miguel Oliveira Silva', '2005-07-15'),
('A27658', 'Pedro Miguel Araujo Mota Lopes', '2000-11-15'),
('A27673', 'Rui Miguel Pereira Oliveira', '1999-01-01'),
('A28722', 'Jose Miguel Ferreira Pontes', '2003-05-07'),
('A28735', 'Rui Miguel Novais Castro', '2002-02-01'),
('A29004', 'Marangaze Joaquim Munhepe Mulhanga', '2002-06-19'),
('A29011', 'Marco Alexandre Barreira Medeiros Teixeira', '2002-01-24'),
('A29048', 'Mario Rui Ribeiro Fialho Da Conceicao', '2002-12-01'),
('A29253', 'Rui Miguel Fernandes Varela', '1997-10-14'),
('A29254', 'Tito Jose Ferreira De Sousa Lopes', '1999-04-03'),
('A29282', 'Nuno Viriato Macedo Ferreira De Carvalho', '1998-06-05'),
('A29631', 'Luis Filipe Ribeiro Novais', '1996-01-01'),
('A29871', 'Andre Leite Ferreira', '2003-11-10'),
('A30015', 'Renato Cesar Almeida Figueiredo', '2001-10-18'),
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
('A30226', 'Miguel Angelo Ribeiro De Sousa E Silva', '2000-07-14'),
('A30238', 'Paulo Jorge Soares Mendes', '2003-09-15'),
('A30241', 'Pedro Henrique Goncalves Geraz Rodrigues', '2002-08-27'),
('A30243', 'Pedro Miguel Veiga Da Silva', '1996-01-20'),
('A30254', 'Roque Manuel De Carvalho Teixeira', '1997-12-04'),
('A30266', 'Vitor Carlos Teixeira Pimentel', '1997-05-02'),
('A30305', 'Emanuel Jose Antunes Fernandes', '2000-06-15'),
('A32010', 'Catarina Sofia Martinho Luis', '1998-05-19'),
('A32480', 'Jose Manuel Lima Gandarela', '1999-11-11'),
('A32597', 'Aderito Nelson Miranda De Oliveira', '2003-12-04'),
('A32608', 'Miguel Pedro De Almeida Ferreira Correia Dourado', '2000-04-25'),
('A32648', 'Daniel Filipe Peres Ferreira', '1997-12-28'),
('A32652', 'Pedro Duarte Cardoso Lopes', '2004-02-24'),
('A32753', 'Joao Arnaldo Freitas De Abreu', '1997-07-02'),
('A33057', 'Antonio Rui Miranda De Lemos', '1996-09-21'),
('A33082', 'Pedro Tiago Dias Goncalves', '2000-07-16'),
('A33127', 'Nuno Filipe Magalhaes Santos', '2003-04-17'),
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
('A33195', 'Miguel Pinto De Sousa Marques', '1999-02-26'),
('A33196', 'Nelson Filipe Coelho De Moura Sousa', '2001-05-28'),
('A33204', 'Paulo Eduardo Miranda Campos', '2002-11-12'),
('A33209', 'Paulo Miguel Sa Morais Pires', '1998-02-09'),
('A33213', 'Pedro Guimaraes De Freitas', '2003-01-24'),
('A33214', 'Pedro Jorge Osorio Marinho Oliveira', '1998-12-09'),
('A33222', 'Ricardo Jorge Almeida De Magalhaes', '1997-09-08'),
('A33228', 'Rui Filipe Barros Tavares', '1996-05-06'),
('A33229', 'Rui Manuel Silva Oliveira', '1996-03-23'),
('A33234', 'Sandra Maria Oliveira Carvalho', '2005-09-26'),
('A33235', 'Sergio De Almeida Paiva', '2005-09-04'),
('A33238', 'Sonia Andrea Garrido De Sa Eiras', '1999-03-02'),
('A33240', 'Tiago Jorge Gomes Da Silva Araujo', '1997-03-07'),
('A33272', 'Hugo Andre Peixoto Freitas Pereira', '1997-03-17'),
('A33280', 'Paulo Bruno Da Silva Vides Fernandes', '1998-08-23'),
('A33281', 'Pedro Miguel Soares Pinto', '1997-02-01'),
('A33282', 'Virgilio Abrantes Vinha', '2002-10-10'),
('A33291', 'Barbara Sofia Araujo Da Silva', '2005-04-03'),
('A33420', 'Nelson Leandro Barbosa Carneiro', '2000-05-22'),
('A33437', 'Nuno Miguel Marques Gomes', '1997-01-11'),
('A33524', 'Pedro Miguel Paes Machado', '2005-10-28'),
('A33650', 'Luis Andre Da Cunha Marques', '2005-03-28'),
('A33689', 'Carlos Andre Brito Ribeiro', '1999-11-10'),
('A33703', 'Isabel Maria Rosendo Cardoso', '1996-10-25'),
('A33709', 'Jorge Manuel Viana Ribeiro Martins Forte', '2002-10-24'),
('A33727', 'Nuno Filipe Antunes Da Silva', '2005-10-25'),
('A33822', 'Andre Fernandes Martins', '2004-12-19'),
('A33858', 'Fernando Jorge Pinto Lima', '1998-04-13'),
('A34035', 'Leonor Isabel Constantino Caeiro Boga', '1997-10-21'),
('A34434', 'Jose Carlos Marques Dias', '2001-02-07'),
('A34435', 'Ricardo Jose Ferreira Dias De Oliveira', '1999-09-10'),
('A34508', 'Paulo Cesar Almeida De Sa', '1998-04-02'),
('A34640', 'Carlos Prudencio Do Espirito Crisostomo', '1998-01-12'),
('A34935', 'Joao Manuel De Campos Goncalves', '2004-01-20'),
('A35052', 'Cesar Filipe Da Cruz Gomes', '2001-07-20'),
('A35144', 'Pedro Manuel De Amorim Magalhaes', '2002-04-22'),
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
('A35352', 'Miguel Afonso Pires Da Rosa', '2000-01-10'),
('A35355', 'Nuno Miguel Machado Alves Costa', '2001-08-22'),
('A35357', 'Paulo Jorge Fernandes De Sousa', '2004-12-17'),
('A35360', 'Pedro Daniel Ferreira De Carvalho', '1998-12-23'),
('A35363', 'Pedro Miguel Da Silva Araujo', '2003-10-06'),
('A35364', 'Pedro Miguel Meira Das Neves', '1996-07-23'),
('A35366', 'Ricardo Manuel Viana Magalhaes', '1998-07-20'),
('A35371', 'Rui Jorge Guimaraes Machado Rodrigues Valente', '1997-05-28'),
('A35372', 'Rui Pedro Andias Duarte', '2004-07-06'),
('A35374', 'Sergio Manuel Pereira Barreiro', '2005-02-14'),
('A35375', 'Sergio Ricardo Teixeira Andias Miranda', '2000-04-09'),
('A35376', 'Telma De Fatima Pires De Sa', '1997-02-13'),
('A35377', 'Vitor Da Costa Pinheiro', '1996-09-06'),
('A35378', 'Vitor Hugo Pereira Da Silva Moreira', '2003-04-25'),
('A35395', 'Hugo Jose Fernandes Carvalho', '2003-08-08'),
('A35398', 'Jose Manuel Esteves', '1998-01-14'),
('A35418', 'Valter Miguel Oliveira Vilar', '1997-01-11'),
('A35440', 'Daniel Barbosa Alves', '2001-12-26'),
('A35443', 'Francisco Jose Martins Gomes', '2003-06-16'),
('A35465', 'Fernando Antonio Alves Lopes', '2004-08-09'),
('A35808', 'Candido Miguel Rebelo Barros', '2002-11-17'),
('A35832', 'Joao Pedro Goncalves De Carvalho', '1999-06-06'),
('A35843', 'Lara Sofia Alpoim Miranda', '2000-11-27'),
('A35855', 'Pedro Miguel Pinto Ribeiro', '1998-01-06'),
('A36422', 'Bruno Jose De Macedo Soares Amor', '2003-01-06'),
('A36424', 'Francisco Eurico Pinto Cortez Martins Leite', '1997-04-04'),
('A36425', 'Joao Pedro Robalo Espinho Pereira Da Silva', '2003-08-10'),
('A36445', 'Filipe Barroso De Oliveira', '1998-10-24'),
('A36454', 'Michel Ferreira Pinto', '1996-11-17'),
('A36476', 'Pedro Alexandre Ferreira Vilaca', '2000-09-18'),
('A36487', 'Ali Dos Reis Mota', '2000-10-03'),
('A36539', 'Admilson Cesar Andrade Rodrigues', '1998-09-17'),
('A36757', 'Ernesto Manuel Da Silva Lopes', '1997-09-15'),
('A36758', 'Hugo Alexandre Pereira Triunfante Martins', '2002-08-03'),
('A36761', 'Jose Eduardo Teixeira Rito', '2000-03-25'),
('A36764', 'Rui Andre Ferreira Silva', '1997-03-16'),
('A36765', 'Sandra Maria Teles Feio Almeida Fazendeiro', '2001-05-06'),
('A36773', 'Vitor Manuel Carvalho Rodrigues', '1997-03-25'),
('A36864', 'Maria Beatriz Alves De Sa Campos', '2005-04-02'),
('A36960', 'Jose Carlos De Freitas Fontao', '2005-01-24'),
('A36969', 'Pedro Emanuel Fernandes Lopes', '2000-06-25'),
('A36971', 'Augusto Jorge Pereira Da Costa', '2004-10-23'),
('A37029', 'Rui Manuel Da Silva Pereira Neiva', '2005-10-17'),
('A38116', 'Pedro Jose Martins Faria', '1997-01-09'),
('A38117', 'Antonio Andre Marques Ribeiro', '2005-10-04'),
('A38118', 'Pedro Manuel Lopes Patricio', '2001-09-03'),
('A38119', 'Rui Miguel Da Silva Abreu', '2003-03-03'),
('A38120', 'Octavio David Da Conceicao Jacinto', '2003-10-19'),
('A38121', 'Jose Miguel Rodrigues Oliveira Da Silva', '2001-08-06'),
('A38122', 'Paulo Jorge Assis De Sousa', '2003-04-09'),
('A38123', 'Joao Manuel Da Silva Sanches', '2000-09-12'),
('A38124', 'Bruno Ricardo Cunha Magalhaes', '1999-12-13'),
('A38125', 'Carlos Cesar Madureira Romano', '1996-07-04'),
('A38126', 'Carlos Alfredo Macieira De Faria', '2004-03-25'),
('A38127', 'Vanessa Alzira Abrunhosa Carneiro De Castro Fidalgo', '2002-06-14'),
('A38128', 'Jose Pedro Rodrigues Magalhaes', '2000-12-11'),
('A38129', 'Ricardo Gomes De Faria', '2003-05-03'),
('A38130', 'Ricardo Jorge Rodrigues Sepulveda Marques', '2004-04-13'),
('A38131', 'Tiago Daniel Cerqueira Botelho Da Silva', '2001-06-06'),
('A38132', 'Avelino Jose Da Costa Rego', '1997-12-02'),
('A38133', 'Joao Goncalo Botica Ribeiro Da Silva', '2005-09-09'),
('A38134', 'Ivo Manuel Dantas Monteiro', '1996-04-12'),
('A38135', 'Rui Andre Leite Ribeiro', '2002-01-28'),
('A38136', 'Jose Nuno Martins Pinto Fraga', '2000-06-11'),
('A38137', 'Jose Pedro Ribeiro Da Araujo', '2003-06-13'),
('A38138', 'Antonio Nuno Bacelar Martins Barreiro Covas', '2005-08-10'),
('A38139', 'Jorge Alberto Faria Miranda', '1998-07-13'),
('A38140', 'Jose Pedro Machado Gomes', '2000-12-19'),
('A38141', 'Ruben Filipe Cardoso Da Fonseca', '2004-11-21'),
('A38142', 'Jose Pedro Faria E Vasconcelos Correia', '2004-05-11'),
('A38143', 'Antonio Sergio Matos Silva', '2003-09-03'),
('A38144', 'Tiago Leandro De Castro Ribeiro', '2001-09-28'),
('A38145', 'Tiago Miguel Soares Fernandes', '1999-03-10'),
('A38146', 'Rui Filipe Torres Alexandre', '1998-11-24'),
('A38147', 'Pedro Miguel Ramos Madeira', '1998-09-11'),
('A38148', 'Rui Domingos Guimaraes Salgado', '2002-07-19'),
('A38149', 'Pedro Silvestre Meneses Magalhaes Coelho', '1998-12-11'),
('A38150', 'Leandro Emanuel Da Silva Salgado Barbosa', '2005-02-01'),
('A38151', 'Ricardo Fernando Lira De Mesquita Lachado', '1997-01-03'),
('A38152', 'Marco Antonio Sampaio Freitas De Castro', '2004-08-12'),
('A38153', 'Ricardo Araujo Carvalho Vilaca Moreira', '2001-09-20'),
('A38154', 'Rafael De Castro Carreira', '2002-08-13'),
('A38155', 'Julio Andre Rodrigues Araujo', '2001-05-14'),
('A38156', 'Bruno Filipe Da Costa Hermenegildo', '2002-04-16'),
('A38157', 'Joel Humberto Da Silva Beirao Do Vale Carvalho', '2000-12-10'),
('A38158', 'Raul Graciano Oliveira Rodrigues', '2005-12-23'),
('A38159', 'Pedro Miguel Azevedo De Oliveira', '1998-11-10'),
('A38160', 'Pedro Tiago Amorim De Brito', '2001-04-13'),
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
('A38173', 'Sebastiao Monteiro Simoes', '2000-10-16'),
('A38174', 'Guilherme Reis Barbosa', '2001-12-12'),
('A38175', 'Joao Paulo Da Silva Gomes', '2003-04-26'),
('A38176', 'Agostinho Manuel Alves Da Silva', '1997-04-10'),
('A38177', 'Sergio Nuno Claro Gomes', '2004-10-20'),
('A38178', 'Marco Alexandre Teixeira Palos', '2001-11-24'),
('A38179', 'Marco Antonio Teixeira Martins', '2005-01-18'),
('A38180', 'Joao Carlos Azevedo Salgado Guimaraes', '2001-04-09'),
('A38181', 'Sofia Da Conceicao Alves Mendes', '2004-08-28'),
('A38182', 'Vitor Manuel Alves Da Rocha', '2004-08-20'),
('A38183', 'Sergio Branco Amorim', '2000-02-27'),
('A38184', 'Maria Cristina Carneiro Barreira', '1997-02-04'),
('A38185', 'Helder Jose Ferreira Barbosa Ribeiro', '2001-09-25'),
('A38186', 'Joao Nuno Marques Dos Santos', '1997-04-09'),
('A38187', 'Flavio Miguel Xavier Ferreira', '2003-03-19'),
('A38189', 'Jose Antonio Da Cunha E Silva', '1997-03-23'),
('A38190', 'Eliseu Carneiro Dos Santos Rocha', '1996-10-16'),
('A38191', 'Joao Miguel Rodrigues Batista', '1997-05-10'),
('A38192', 'Vitor Hugo Da Silva Nogueira', '2003-09-13'),
('A38193', 'Alexandre Manuel Pereira De Miranda Pinto', '1996-04-03'),
('A38194', 'Mario Da Fonte Lameiras', '2005-05-12'),
('A38195', 'Nelson Tavares Cunha', '1998-04-09'),
('A38196', 'Alexandre Coelho Carvalho', '2003-05-11'),
('A38197', 'Hugo Alexandre Sobreiro De Seixas', '2005-02-05'),
('A38198', 'Joaquim Machado Goncalves Sampaio', '2004-12-13'),
('A38199', 'Joao Ricardo Da Silva Campos', '1997-03-22'),
('A38200', 'Rui Alexandre Serrano De Moura', '2000-08-20'),
('A38202', 'Hugo Filipe Nascimento Pereira', '1998-04-22'),
('A38203', 'Nuno Jorge Ferreira Guimaraes', '1997-08-03'),
('A38204', 'Hugo Jose Pereira Pacheco', '1996-09-05'),
('A38205', 'Jose Luis Lopes De Araujo', '2002-11-03'),
('A38206', 'Jose Manuel Araujo Soares', '2003-08-19'),
('A38207', 'Catarina Isabel De Oliveira Mateus', '2002-09-14'),
('A38208', 'Nuno Goncalo Bettencourt Da Cruz Correia', '1998-01-12'),
('A38209', 'Miguel Angelo Pinto Marques', '1997-09-24'),
('A38210', 'Daniela Cristina Garcia Teixeira', '2004-12-09'),
('A38211', 'Daniel Torres Goncalves', '2004-10-23'),
('A38212', 'Joao Pedro Silva Araujo', '1998-05-18'),
('A38214', 'Andre Filipe De Sousa Viveiros', '2005-11-02'),
('A38215', 'Andre Ribeiro Rodrigues', '1998-09-20'),
('A38216', 'Nelson De Sousa E Silva', '1998-06-13'),
('A38217', 'Miguel Angelo Marques De Matos', '2001-01-24'),
('A38218', 'Alexandrina Maria Ferreira Lemos', '1997-02-05'),
('A38219', 'Luis Filipe Pereira Goncalves', '2004-05-21'),
('A38220', 'Joao Rafael Ferreira Veloso', '1996-04-09'),
('A38221', 'Miguel Angelo Vivas Gomes Alves', '1997-11-07'),
('A38222', 'Jose Luis Cardoso Silva', '1997-11-13'),
('A38223', 'Luis Diogo Monteiro Duarte Couto', '2004-10-05'),
('A38224', 'Jose Filipe Henriques Vilas Boas', '2004-06-21'),
('A38254', 'Manuel Domingos De Carvalho Felgueiras Da Silva Santos', '2001-07-17'),
('A38595', 'Filipe Goncalo Goncalves Da Costa', '2004-12-16'),
('A38908', 'Rui Jorge De Oliveira Pereira', '2000-10-20'),
('A39288', 'Genildo Soares Neves', '2005-09-27'),
('A39341', 'Luis Fernando Romanel Rodrigues', '2005-04-07'),
('A39342', 'Miguel Pedro Amaral Figueiredo', '1996-07-04'),
('A39343', 'Sergio Feliciano Ferreira Jacome', '2003-10-17'),
('A39406', 'Marco Alexandre Aguiar Vaz', '2004-07-16'),
('A39407', 'Paulo Manuel Ribeiro Novais', '1999-07-17'),
('A39408', 'Luis Filipe Faria Monteiro Capelo', '2002-01-13'),
('A39410', 'Sergio Filipe Pereira Da Felicidade', '1998-11-22'),
('A39503', 'Helder Nuno Martins Do Vale Tome', '2001-06-27'),
('A39506', 'Jose Eduardo Correia Calheiros', '2005-09-23'),
('A39508', 'Goncalo Manuel Correia Calheiros', '2001-07-24'),
('A39509', 'Ricardo Andre Rodrigues Afonso', '2004-10-05'),
('A39622', 'Joao Paulo Silva De Vasconcelos Gusmao', '2003-10-19'),
('A39671', 'Vitor Manuel Pinto Lopes', '2000-02-05'),
('A39747', 'Luis Pedro Ferreira Leite Dos Santos Aleixo', '2002-01-05'),
('A39750', 'Joao Paulo Barbosa Oliveira', '2002-11-26'),
('A39938', 'Paulo Cesar Romanel Rodrigues', '1999-04-14'),
('A39944', 'Rui Antonio Peixoto De Abreu', '1996-02-09');

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno_instrumento`
--

CREATE TABLE IF NOT EXISTS `aluno_instrumento` (
  `id_aluno` varchar(9) COLLATE utf8mb4_bin NOT NULL,
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

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`id`, `designacao`, `duracao`, `id_instrumento`) VALUES
('CB1', 'Curso BÃ¡sico de Clarinete', '5', 'I1'),
('CB10', 'Curso BÃ¡sico de OboÃ©', '5', 'I10'),
('CB11', 'Curso BÃ¡sico de OrgÃ£o', '5', 'I11'),
('CB12', 'Curso BÃ¡sico de PercussÃ£o', '5', 'I12'),
('CB13', 'Curso BÃ¡sico de Piano', '5', 'I13'),
('CB14', 'Curso BÃ¡sico de Saxofone', '5', 'I14'),
('CB15', 'Curso BÃ¡sico de Trombone', '5', 'I15'),
('CB16', 'Curso BÃ¡sico de Trompa', '5', 'I16'),
('CB17', 'Curso BÃ¡sico de Trompete', '5', 'I17'),
('CB18', 'Curso BÃ¡sico de Tuba', '5', 'I18'),
('CB19', 'Curso BÃ¡sico de Violoncelo', '5', 'I19'),
('CB2', 'Curso BÃ¡sico de Contrabaixo', '5', 'I2'),
('CB20', 'Curso BÃ¡sico de Violino', '5', 'I20'),
('CB21', 'Curso BÃ¡sico de Viola de Arco', '5', 'I21'),
('CB22', 'Curso BÃ¡sico de Bandolim', '5', 'I22'),
('CB3', 'Curso BÃ¡sico de Corne InglÃªs', '5', 'I3'),
('CB4', 'Curso BÃ¡sico de EufÃ³nio', '5', 'I4'),
('CB5', 'Curso BÃ¡sico de Fagote', '5', 'I5'),
('CB6', 'Curso BÃ¡sico de Flauta', '5', 'I6'),
('CB7', 'Curso BÃ¡sico de Fliscorne', '5', 'I7'),
('CB8', 'Curso BÃ¡sico de Guitarra', '5', 'I8'),
('CB9', 'Curso BÃ¡sico de Harpa', '5', 'I9'),
('CS1', 'Curso Supletivo de Clarinete', '3', 'I1'),
('CS10', 'Curso Supletivo de OboÃ©', '3', 'I10'),
('CS11', 'Curso Supletivo de OrgÃ£o', '3', 'I11'),
('CS12', 'Curso Supletivo de PercussÃ£o', '3', 'I12'),
('CS13', 'Curso Supletivo de Piano', '3', 'I13'),
('CS14', 'Curso Supletivo de Saxofone', '3', 'I14'),
('CS15', 'Curso Supletivo de Trombone', '3', 'I15'),
('CS16', 'Curso Supletivo de Trompa', '3', 'I16'),
('CS17', 'Curso Supletivo de Trompete', '3', 'I17'),
('CS18', 'Curso Supletivo de Tuba', '3', 'I18'),
('CS19', 'Curso Supletivo de Violoncelo', '3', 'I19'),
('CS2', 'Curso Supletivo de Contrabaixo', '3', 'I2'),
('CS20', 'Curso Supletivo de Violino', '3', 'I20'),
('CS21', 'Curso Supletivo de Viola de Arco', '3', 'I21'),
('CS22', 'Curso Supletivo de Bandolim', '3', 'I22'),
('CS3', 'Curso Supletivo de Corne InglÃªs', '3', 'I3'),
('CS4', 'Curso Supletivo de EufÃ³nio', '3', 'I4'),
('CS5', 'Curso Supletivo de Fagote', '3', 'I5'),
('CS6', 'Curso Supletivo de Flauta', '3', 'I6'),
('CS7', 'Curso Supletivo de Fliscorne', '3', 'I7'),
('CS8', 'Curso Supletivo de Guitarra', '3', 'I8'),
('CS9', 'Curso Supletivo de Harpa', '3', 'I9');

-- --------------------------------------------------------

--
-- Estrutura da tabela `habilitacao`
--

CREATE TABLE IF NOT EXISTS `habilitacao` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `designacao` varchar(150) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `habilitacao`
--

INSERT INTO `habilitacao` (`id`, `designacao`) VALUES
('HL1', 'Licenciatura em Clarinete'),
('HL10', 'Licenciatura em OboÃ©'),
('HL11', 'Licenciatura em OrgÃ£o'),
('HL12', 'Licenciatura em PercussÃ£o'),
('HL13', 'Licenciatura em Piano'),
('HL14', 'Licenciatura em Saxofone'),
('HL15', 'Licenciatura em Trombone'),
('HL16', 'Licenciatura em Trompa'),
('HL17', 'Licenciatura em Trompete'),
('HL18', 'Licenciatura em Tuba'),
('HL19', 'Licenciatura em Violoncelo'),
('HL2', 'Licenciatura em Contrabaixo'),
('HL20', 'Licenciatura em Violino'),
('HL21', 'Licenciatura em Viola de Arco'),
('HL22', 'Licenciatura em Bandolim'),
('HL3', 'Licenciatura em Corne InglÃªs'),
('HL4', 'Licenciatura em EufÃ³nio'),
('HL5', 'Licenciatura em Fagote'),
('HL6', 'Licenciatura em Flauta'),
('HL7', 'Licenciatura em Fliscorne'),
('HL8', 'Licenciatura em Guitarra'),
('HL9', 'Licenciatura em Harpa'),
('HM1', 'Mestrado em Clarinete'),
('HM10', 'Mestrado em OboÃ©'),
('HM11', 'Mestrado em OrgÃ£o'),
('HM12', 'Mestrado em PercussÃ£o'),
('HM13', 'Mestrado em Piano'),
('HM14', 'Mestrado em Saxofone'),
('HM15', 'Mestrado em Trombone'),
('HM16', 'Mestrado em Trompa'),
('HM17', 'Mestrado em Trompete'),
('HM18', 'Mestrado em Tuba'),
('HM19', 'Mestrado em Violoncelo'),
('HM2', 'Mestrado em Contrabaixo'),
('HM20', 'Mestrado em Violino'),
('HM21', 'Mestrado em Viola de Arco'),
('HM22', 'Mestrado em Bandolim'),
('HM3', 'Mestrado em Corne InglÃªs'),
('HM4', 'Mestrado em EufÃ³nio'),
('HM5', 'Mestrado em Fagote'),
('HM6', 'Mestrado em Flauta'),
('HM7', 'Mestrado em Fliscorne'),
('HM8', 'Mestrado em Guitarra'),
('HM9', 'Mestrado em Harpa');

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
-- Estrutura da tabela `matricula`
--

CREATE TABLE IF NOT EXISTS `matricula` (
  `id_aluno` varchar(9) COLLATE utf8mb4_bin NOT NULL COMMENT 'identificador do aluno',
  `id_curso` varchar(9) COLLATE utf8mb4_bin NOT NULL COMMENT 'identificador do curso onde se encontra matriculado',
  `anoLetivo` varchar(9) COLLATE utf8mb4_bin NOT NULL COMMENT 'ano lectivo em que se matricula ',
  `anoCurso` varchar(1) COLLATE utf8mb4_bin NOT NULL COMMENT 'ano do curso a que corresponde a matricula'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

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

--
-- Extraindo dados da tabela `obra`
--

INSERT INTO `obra` (`id`, `nome`, `descricao`, `anoCriacao`, `duracao`, `id_periodo`, `id_compositor`) VALUES
('O100', 'Hungarian Rhapsody No. 11', 'Hungarian Rhapsody No. 11, S.244/11, in A minor, is the eleventh Hungarian Rhapsody by\n         Franz Liszt. Being one of the shorter Hungarian Rhapsodies, it has a duration of five\n         minutes.', '1454', 0, 'C216', '01:30:51'),
('O106', 'The Creatures of Prometheus', 'The Creatures of Prometheus (German: Die GeschÃ¶pfe des Prometheus), Op. 43, is a ballet\n         composed in 1801 by Ludwig van Beethoven following the libretto of Salvatore ViganÃ². The\n         ballet premiered on 28 March 1801 at the Burgtheater in Vienna and was given 28\n         performances.The overture to the ballet is part of the concert repertoire. Beethoven based\n         the fourth movement of his Eroica symphony and his Eroica Variations (piano) on the main\n         theme of the last movement of the ballet.', '1565', 0, 'C316', '01:36:45'),
('O107', 'Symphonic Dances, Op. 64', 'The four Symphonic Dances of the Norwegian composer Edvard Grieg, form the collection\n         notated as Op. 64. They were written c. 1896 and published in 1897. They draw their\n         inspiration from the earlier folk works collected by Ludvig Mathias Lindeman.Dance No. 1, G\n         major, Allegro moderato e marcatoDance No. 2, A major, Allegretto graziosoDance No. 3, D\n         major, Allegro giocosoDance No. 4, A minor, Andante: Allegro risoluto', '1501', 0, 'C280', '01:59:57'),
('O108', 'Military Band No. 1', 'The March for Military Band No. 1 in F major, WoO 18, was written by Ludwig van\n         Beethoven in 1808 or 1809 as a march FÃ¼r die BÃ¶hmische Landwehr (For the Bohemian Militia).\n         It was the first of three military marches written by Beethoven.', '1673', 0, 'C142', '01:19:00'),
('O115', 'Estampes', 'Estampes (Prints), L.100, is a composition for solo piano by Claude Debussy. It was\n         finished in 1903.', '1598', 0, 'C260', '00:35:24'),
('O116', 'Faust Overture', 'The Faust Overture is a concert overture composed by German composer Richard Wagner.\n         Wagner originally composed it between 1839 and 1840, intending it to be the first movement\n         of a Faust Symphony based on the play Faust by German playwright Johann Wolfgang von\n         Goethe. Realizing that he would not finish the planned symphony, Wagner revised the piece\n         between 1843 and 1844, incorporating ideas from the other planned movements, and creating\n         instead a single-movement concert overture. He made a final revision in 1855.', '1412', 0, 'C170', '01:28:42'),
('O121', 'Adagio in B minor', 'The Adagio in B minor for piano, K. 540, by Wolfgang Amadeus Mozart is a standalone\n         composition for solo piano, and was entered into his Verzeichnis aller meiner Werke\n         (Catalogue of all my Works) on March 19, 1788.', '1418', 0, 'C286', '00:08:37'),
('O122', 'Hungarian Rhapsody No. 4', 'Hungarian Rhapsody No. 4, S.244/4, in E-flat major, is the fourth in a set of nineteen\n         Hungarian Rhapsodies composed by Franz Liszt for solo piano. It was composed in 1847 and\n         published in 1853.A typical performance of the work lasts about five minutes.', '1377', 0, 'C254', '01:38:17'),
('O128', 'Morceaux de Salon, Op. 10', 'Morceaux de salon (French for Salon Pieces; Russian: Ð¡Ð°Ð»Ð¾Ð½Ð½Ñ‹Ðµ ÐŸÑŒÐµÑÑ‹, Salonnyye Pyesy),\n         Op. 10, is a set of solo piano pieces composed by Russian composer Sergei Rachmaninoff in\n         1894.', '1536', 0, 'C140', '00:38:12'),
('O137', 'Ã‰tudes Op. 25', 'Ã‰tude Op. 25, No. 8, in D-flat major, is a technical piano study composed by FrÃ©dÃ©ric\n         Chopin. The etude is composed with sixths being played in both hands, but unlike some of\n         his other etudes, it has a reduced musical difficulty.', '2002', 0, 'C86', '00:31:34'),
('O139', 'Polonaises, Op.26', 'The Polonaise in C-sharp minor, Op. 26 No. 1 and the Polonaise in E-flat minor, Op. 26\n         No. 2 were composed by FrÃ©dÃ©ric Chopin in 1836. Both of them were dedicated to Josef\n         Dessauer. Both Polonaises require considerable technique and stamina to be performed\n         well.', '1565', 0, 'C124', '01:27:00'),
('O14', 'Mazurkas, Op. 63', 'The Op. 63 mazurkas by FrÃ©dÃ©ric Chopin are a set of three mazurkas written in 1846 and\n         published in 1847. A typical performance of all three mazurkas lasts around six\n         minutes.', '1368', 0, 'C152', '01:22:05'),
('O146', 'Hungarian Rhapsody No. 16', 'Hungarian Rhapsody No. 16, S.244/16, in A minor, is the sixteenth Hungarian Rhapsody\n         composed by Franz Liszt for solo piano. Being one of the later Hungarian Rhapsodies, it was\n         composed and published in 1882. The rhapsody, subtitled Budapest MunkÃ¡csy-Festlichkeiten,\n         has a duration of approximately five minutes.', '1706', 0, 'C298', '00:47:57'),
('O147', 'Overture, Scherzo and Finale', 'The Overture, Scherzo and Finale (German: Ouverture, Scherzo und Finale) in E major is a\n         work for symphony orchestra by Robert Schumann. It is his opus 52, and was written in 1841.\n         Schumann originally considered it his second symphony.The work is in three movements:An\n         overture (Andante con moto in E minor - Allegro in E major and 2:2 time ) (sketched and\n         completed in April 1841)A scherzo (Tempo: Vivo), in 6:8 time and in Câ™¯ minor, whose theme\n         is based on that of the overture. It has a trio section in Dâ™­ major, in contrasting 2:4\n         time whose material reappears as the coda of the movement.Finale (Allegro molto vivace)\n         (orchestrated around May 1841)The Overture, Scherzo and Finale was received tepidly by\n         critics, was revised in 1845 and published the next year, with a dedication to Johannes\n         Verhulst.', '1895', 0, 'C110', '00:59:59'),
('O148', 'Hungarian Rhapsody No. 12', 'Hungarian Rhapsody No. 12, S.244/12, in C-sharp minor, is the twelfth Hungarian Rhapsody\n         by Franz Liszt. An average performance of the piece lasts eleven minutes.', '1522', 0, 'C108', '01:56:45'),
('O149', 'Hungarian Rhapsody No. 10', 'Hungarian Rhapsody no. 10 in E major, S.244/10, is a composition for solo piano by Franz\n         Liszt. It is tenth in the set of his Hungarian Rhapsodies, and is subtitled Preludio,\n         although this name is not commonly used. It, along with the rest of the first fifteen\n         rhapsodies, were published in 1853.', '1602', 0, 'C60', '01:23:04'),
('O15', 'Mazurkas, Op. 67', 'The Op. 67 mazurkas by FrÃ©dÃ©ric Chopin are a set of four mazurkas posthumously published\n         in 1855. A typical performance of all four mazurkas lasts around seven minutes.', '1428', 0, 'C68', '01:03:04'),
('O155', 'Ã‰tudes Op.10', 'Ã‰tude Op. 10, No. 11, in E-flat major, is a technical study composed by FrÃ©dÃ©ric Chopin.\n         It is sometimes given the tiles Arpeggio-Study, and Guitar-Study. The chief difficulty\n         addressed in this piece is the performance of extended arpeggiated chords. Throughout, the\n         hands are required to stretch intervals as large as compound fifths. The melody, though\n         usually the highest note of each chord, is often found in inner parts with higher parts\n         simply being part of the accompaniment. This is especially the case in the final bars. The\n         piece is also notable for its chromatic harmonies, daring at the time, and enharmonic\n         shifts.', '1851', 0, 'C290', '01:50:20'),
('O156', 'Suite in D minor, HWV 437', 'The Keyboard suite in D minor (HWV 437) was composed by George Frideric Handel, for solo\n         keyboard (harpsichord), between 1703 and 1706. It is also referred to as Suite de piÃ¨ce\n         Vol. 2 No. 4. It was first published in 1733.', '1432', 0, 'C290', '01:47:36'),
('O16', 'Scherzo No.3', 'The Scherzo No. 3, Op. 39, in C-sharp minor by FrÃ©dÃ©ric Chopin, completed in 1839, was\n         written in the abandoned monastery of Valldemossa on the Balearic island of Majorca, Spain.\n         This is the most terse, ironic, and tightly constructed of the four scherzos, with an\n         almost Beethovenian grandeur. FrÃ©dÃ©ric Chopin dedicated this composition to one of his\n         closest pupils, Adolphe Gutmann.', '1780', 0, 'C258', '00:15:19'),
('O162', 'TÃ¶net, ihr Pauken! Erschallet, Trompeten!, BWV 214', 'TÃ¶net, ihr Pauken! Erschallet, Trompeten! (Resound, ye drums! Ring out, ye trumpets!),\n         BWV 214, is a cantata by Johann Sebastian Bach.', '1300', 0, 'C286', '00:14:39'),
('O163', 'Ã‰tudes Op.10', 'Ã‰tude Op. 10, No. 9, in F minor, is a technical study composed by FrÃ©dÃ©ric Chopin in\n         1829. This Ã©tude is part of the twelve studies which belong to Op. 10. It is widely\n         regarded as a good left hand Ã©tude because it promotes flexibility in the wrists and\n         fingers.', '1739', 0, 'C200', '00:16:02'),
('O164', 'Hungarian Rhapsody No. 15', 'Hungarian Rhapsody No. 15, S.244/15, in A minor, is the fifteenth Hungarian Rhapsody by\n         Franz Liszt. The rhapsody is subtitled RÃ¡kÃ³czi March and was written in 1853. An average\n         performance of the piece lasts around six minutes.', '1302', 0, 'C2', '00:49:02'),
('O166', 'Fantaisie brillante, Op. 22', 'Fantaisie brillante sur des motifs de V. Bellini (also Fantaisie brillante sur Norma et\n         Sonnambula) in Eâ™­ major, Op. 22, is a one-movement piano composition by French pianist\n         Alexandre Goria. Written in 1846 and dedicated to Madame L. Pillot, de Douai, it was first\n         published in Mainz the following year by B. Schott Sohne.', '1551', 0, 'C4', '01:05:53'),
('O167', 'Waltzes, Op. 34', 'The three Waltzes, Op. 34, were composed by FrÃ©dÃ©ric Chopin from 1834 until 1838 and\n         published in 1838.These three waltzes were published as Grandes valses brillantes, but this\n         title is usually reserved for the Waltz in E-flat major, Op. 18.', '1867', 0, 'C4', '00:46:13'),
('O169', 'Hungarian Rhapsody No. 17', 'Hungarian Rhapsody No. 17, S.244/17, in D minor, is the seventeenth Hungarian Rhapsody\n         composed by Franz Liszt for solo piano. Being one of the later Hungarian Rhapsodies, it was\n         composed and published in 1882. This piece and the eighteenth rhapsody are the shortest of\n         the Hungarian Rhapsodies, each having a duration of just over three minutes.', '1940', 0, 'C86', '01:39:37'),
('O171', 'Hungarian Rhapsody No. 7', 'Hungarian Rhapsody No. 7, S.244/7, in D minor, is the seventh in a set of nineteen\n         Hungarian Rhapsodies composed by Franz Liszt for solo piano.', '1485', 0, 'C28', '01:09:44'),
('O173', 'Mazurkas, Op. 56', 'The Op. 56 mazurkas by FrÃ©dÃ©ric Chopin are a set of three mazurkas presumably written\n         1843â€“1844 and published in 1844. A typical performance of all three mazurkas lasts around\n         12 minutes.', '1534', 0, 'C176', '00:21:50'),
('O20', 'Liturgy of St. John Chrysostom', 'Liturgy of St John Chrysostom, Op. 31 (Russian: Ð›Ð¸Ñ‚ÑƒÑ€Ð³Ð¸Ñ Ð˜Ð¾Ð°Ð½Ð½Ð° Ð—Ð»Ð°Ñ‚Ð¾ÑƒÑÑ‚Ð°), is a musical\n         work by Sergei Rachmaninoff, one of his two major unaccompanied choral works (the other\n         being his All-Night Vigil). The Divine Liturgy of St. John Chrysostom is the primary\n         worship service of the Eastern Orthodox Church.', '1607', 0, 'C260', '01:08:03'),
('O21', 'Serenade for Strings in G minor', 'The Serenade for Strings in G minor is a composition for strings by Vasily Kalinnikov.\n         He wrote the serenade in 1891. The composition was first published by Muzgiz in\n         1950.', '1814', 0, 'C292', '00:02:59'),
('O25', 'Cantatas, BWV 141-150', 'Uns ist ein Kind geboren (Unto us a child is born), is a Christmas cantata which was\n         formerly attributed to Johann Sebastian Bach as his BWV 142, but was most likely composed\n         by his predecessor in Leipzig, Johann Kuhnau, around 1720.', '1634', 0, 'C248', '01:28:03'),
('O27', 'Ã‰tudes Op. 25', 'Ã‰tude Op. 25, No. 6, in G-sharp minor, is a technical study composed by FrÃ©dÃ©ric Chopin\n         focusing on thirds, trilling them at a high speed. At one point, both hands play a\n         chromatic-third scale.', '1863', 0, 'C216', '00:21:16'),
('O29', 'Rondo for Piano No. 3', 'Rondo in A minor, K. 511, for piano by Wolfgang Amadeus Mozart was written in 1787. It\n         is in one movement: Andante. The rondo follows an A-B-A-C-A pattern. The principal theme in\n         A minor primarily uses eighth notes while the first episode is in F major using sixteenth\n         notes and the second episode is in A major using triplet-sixteenths.', '1435', 0, 'C36', '01:47:14'),
('O31', 'Mazurkas, Op. 30', 'The Op. 30 mazurkas, by FrÃ©dÃ©ric Chopin, are a set of mazurkas written and published in\n         1837.', '1366', 0, 'C152', '00:10:34'),
('O36', 'Suite No. 2 for two pianos', 'Suite No. 2, Op. 17, is a composition for two pianos by Sergei Rachmaninoff.This work\n         was composed in Italy in the first months of 1901, and like the famous second piano\n         concerto, Op.18, it confirms the comeback of the creativity of the composer after four\n         years of silence since the flop of his first symphony. The Suite was first performed on\n         November 24, 1901, by the composer and his cousin Alexander Siloti.In contrast to the First\n         Suite for two pianos, the work is not based on literature, and the form tends to approach\n         the traditional suite. The movements are:I. Introduction (Alla marcia, in C major) II.\n         Valse (Presto, in G major) III. Romance (Andantino, in A flat major) IV. Tarantelle\n         (Presto, in C minor) The most famous performance of this piece was in Los Angeles in the\n         early 1940s, just before Rachmaninoff died. He and Vladimir Horowitz were at a party and\n         played the piece, the first and only time they ever did.Perhaps surprisingly, given that\n         Rachmaninoff wrote orchestral and two-piano versions of his Symphonic Dances, which is\n         effectively a three-movement symphony, no one has orchestrated this Suite as a possible\n         symphony.', '1477', 0, 'C170', '01:00:24'),
('O41', 'Ab Irato', 'Ã‰tude de perfectionnement de la methode des methodes is a description applied to two\n         pieces by the Hungarian composer Franz Liszt, composed in 1842 and 1852. The first piece is\n         called Morceau de salon, S.142, followed by a revision, Ab Irato, S.143. They are regarded\n         as eccentric pieces with beautiful interludes of arpeggiated figures, though both are\n         rarely performed.', '1749', 0, 'C212', '00:28:03'),
('O42', 'Morceau de salon', 'Ã‰tude de perfectionnement de la methode des methodes is a description applied to two\n         pieces by the Hungarian composer Franz Liszt, composed in 1842 and 1852. The first piece is\n         called Morceau de salon, S.142, followed by a revision, Ab Irato, S.143. They are regarded\n         as eccentric pieces with beautiful interludes of arpeggiated figures, though both are\n         rarely performed.', '1482', 0, 'C236', '01:59:22'),
('O44', 'Hungarian Rhapsody No. 5', 'Hungarian Rhapsody No. 5, S.244/5, is the fifth in a set of 19 Hungarian Rhapsodies by\n         composer Franz Liszt. It is in E Minor and is marked Lento, con duolo. The piece was given\n         the nickname HÃ©roÃ¯de-Ã©lÃ©giaque by the composer himself. It is very different from his other\n         Hungarian Rhapsodies, as it does not follow the intro - lassan - friska structure and is\n         perhaps the darkest and most melancholic of the set. It was later arranged for\n         orchestra.', '1743', 0, 'C238', '00:26:47'),
('O45', 'Polonaises, Op.40', 'The twin Op. 40 Polonaises of the Polonaise in A major, Op. 40, No. 1 (nicknamed the\n         Military Polonaise) and the Polonaise in C minor, Op. 40, No. 2 were composed by FrÃ©dÃ©ric\n         Chopin in 1838.Anton Rubinstein remarked that the Polonaise in A major is the symbol of\n         Polish glory, whilst the Polonaise in C minor is the symbol of Polish tragedy.', '2011', 0, 'C132', '01:43:11'),
('O47', 'Hungarian Rhapsody No. 18', 'Hungarian Rhapsody No. 18, S.244/18, in F-sharp minor, is the eighteenth Hungarian\n         Rhapsody composed by Franz Liszt for solo piano. An average performance of the piece lasts\n         three minutes; along with its predecessor, the seventeenth rhapsody, it is the shortest\n         Hungarian Rhapsody of the set. This rhapsody is subtitled Ungarische Ausstellung in\n         Budapest.', '1798', 0, 'C276', '00:16:28'),
('O48', 'Mazurkas, Op. 50', 'The Op. 50 mazurkas by FrÃ©dÃ©ric Chopin are a set of three mazurkas written and published\n         in 1842.A typical performance of all three mazurkas takes about eleven minutes.', '1737', 0, 'C82', '01:14:20'),
('O53', 'Grande Tarantelle', 'Grande Tarantelle, Op. 67, is a tarantella written by American composer Louis Moreau\n         Gottschalk from 1858-64. Subtitled CÃ©lÃ¨bre Tarentelle, it was first performed at the\n         Academy of music in Philadelphia in 1864.', '1854', 0, 'C16', '01:39:36'),
('O57', 'Valses Sentimentales', 'Franz Schubert wrote about a hundred waltzes for piano solo. Particularly well known\n         among these are two named collections, the 34 Valses Sentimentales (Op. 50, D. 779) and the\n         12 Valses Nobles (Op. 77, D. 969).', '1313', 0, 'C302', '01:23:22'),
('O58', 'Die Ideale, S.106', 'Die Ideale, S. 106, is a symphonic poem composed by Franz Liszt in 1856â€“1857 and\n         published in 1858 as No. 12. It was first performed on 5 September 1857.', '1663', 0, 'C332', '00:27:22'),
('O62', 'Eleven Chorale Preludes, Op. 122', 'The Eleven Chorale Preludes, Op. 122, are a collection of chorale preludes for organ by\n         Johannes Brahms, composed in 1896, and published posthumously in 1902.The eleven pieces are\n         relatively short and are based on selected verses of nine separate Lutheran\n         chorales.', '1961', 0, 'C98', '01:33:07'),
('O64', 'Variation on a Waltz by Diabelli', 'Variation on a Waltz by Diabelli (French: Variation sur une valse de Diabelli), S.147,\n         is a variation by Franz Liszt composed in 1822 and published in late 1823 or early 1824 as\n         Variation No. 24 of Part II of VaterlÃ¤ndischer KÃ¼nstlerverein, a collection of variations\n         by 50 composers. All the variations were based on a waltz composed by Anton Diabelli, who\n         also published the work. It was this same invitation from Diabelli to write a variation\n         that inspired Ludwig van Beethoven to write his 33 Diabelli Variations, Op. 120, which\n         formed the entirety of Part I of VaterlÃ¤ndische KÃ¼nstlerverein.', '1517', 0, 'C84', '01:49:39'),
('O65', 'Hungarian Rhapsody No. 13', 'Hungarian Rhapsody No. 13, S.244/13, in A minor, is the thirteenth Hungarian Rhapsody by\n         Franz Liszt. Although one of the lesser performed works of Liszt, it contains a quotation\n         also used in the well-known Allegro molto vivace from Zigeunerweisen by Pablo de Sarasate.\n         An average performance of the work lasts from eight to ten minutes.', '1442', 0, 'C330', '00:47:21'),
('O7', 'Polonaises Op.71', 'The three Polonaises, Op. 71 were composed by FrÃ©dÃ©ric Chopin in his earlier days,\n         possibly as early as 1820. After the death of the composer, Julian Fontana had made up\n         their summaries and publications. These works were published in 1855.', '1672', 0, 'C168', '00:45:30'),
('O71', 'Stabat Mater', 'Stabat Mater for solo alto and orchestra, RV 621, is a composition by the Italian\n         baroque composer Antonio Vivaldi on one of the Sorrows of Mary. It was premiered in\n         1712.', '1756', 0, 'C98', '01:15:44'),
('O72', 'Legends, Op.59', 'Legends, Op.59, B.122, (Czech: Legendy) is a cycle of ten small-scale pieces by the\n         Czech composer AntonÃ­n DvoÅ™Ã¡k. The work was composed originally for piano duet, but later\n         was arranged also for a reduced orchestra.', '1595', 0, 'C230', '01:58:40'),
('O81', 'Variations in F minor', 'The Andante with variations in F minor (Hoboken 17/6), also known as Un piccolo\n         divertimento, was composed for piano by Joseph Haydn in 1793, and is among his most popular\n         piano works. The variations here are a set of double variations, the first theme is in F\n         minor and the second theme in F major. Two variations of each theme and an extended coda\n         follow.The manuscript of the Variations is owned by the Music Division of The New York\n         Public Library for the Performing Arts. For the Haydn bicentennial in 2009, G. Henle Verlag\n         published a facsimile of the manuscript.', '1353', 0, 'C38', '01:05:46'),
('O83', 'Ã‰tudes Op. 25', 'Ã‰tude Op. 25, No. 4 in A minor is a technical study composed by FrÃ©dÃ©ric Chopin. It is\n         marked Agitato at the head. The technique explored in this piece is the performance of\n         off-beat staccato chords set against a regular on-beat bass. This is an example of\n         syncopation. The left hand leaps intervals of up to a tenth (octave plus a third) between\n         the bass and the lowest note of the following chord (and back): this requires a very strong\n         left hand 5th finger. Very often, the performer is required to hold the uppermost note of\n         the right hand in legato while continuing to play the rest of the chord in that hand (and\n         in the left hand) as staccato: this requires a very strong right hand 5th finger. The\n         ending is marked Lento and pianissimo and the chords are all on beat in stark contrast with\n         the rest of the piece.', '1996', 0, 'C210', '01:00:29'),
('O84', 'Barcarole Op. 60', 'The Barcarole in F sharp major, Op. 60 is a piece for solo piano by FrÃ©dÃ©ric Chopin,\n         composed between autumn of 1845 and summer 1846. Based on the barcarole rhythm and mood, it\n         features a sweepingly romantic and slightly wistful tone. Many of the technical figures for\n         the right hand are thirds and sixths, while the left features very long reaches over an\n         octave.', '1423', 0, 'C136', '00:42:20'),
('O85', 'Hungarian Rhapsody No.1', 'Hungarian Rhapsody No. 1 is the first of a set of 19 Hungarian Rhapsodies by composer\n         Franz Liszt, dedicated to one of his friends and former student, Ede Szerdahelyi. Work on\n         the piece began in 1846 in Klausenburg, and it was published about November 1851. The\n         piece, like many in the set, is composed in the csÃ¡rdÃ¡s style, signified by two sections:\n         the lassÃº (slower, first section) and the friss (faster, second section). Also typical for\n         the set, themes in the piece can be traced to earlier sources, specifically Ferenc Erkel\n         and GÃ¡spÃ¡r BernÃ¡t in the first section, and KÃ¡roly Thern in the second. The gypsy Laci\n         PÃ³csi and his band are said to have been a source of inspiration for this piece.', '1527', 0, 'C280', '01:08:52'),
('O86', 'Singet dem Herrn ein neues Lied', 'Singet dem Herrn ein neues Lied (Sing unto the Lord a new song, BWV 225) is a motet by\n         Johann Sebastian Bach. It was first performed in Leipzig around 1727, using psalm 149:1â€“3\n         for its first movement, a 1548 Johann Gramann hymn for the second movement and psalm 150:2\n         and 6 for its third movement.', '1930', 0, 'C100', '00:51:14'),
('O93', 'Scherzo No.4', 'FrÃ©dÃ©ric Chopin composed his Scherzo No. 4 in E major, Op. 54, the fourth and the last\n         of his scherzos in 1842.The scherzo was published in 1843. Unlike the preceding three\n         scherzi (Op. 20, Op. 31, Op. 39), the E-major is generally calmer in temperament, though it\n         still possesses some exceptionally passionate and dramatic moments. The scherzo is in\n         sonata rondo form, moving to a trio in C-sharp minor that is based on a Polish folk\n         song.', '1527', 0, 'C128', '00:47:14'),
('O94', 'FÃ¼rchte dich nicht', 'FÃ¼rchte dich nicht (Fear thou not, BWV 228) is a motet by Johann Sebastian Bach. It was\n         composed in Leipzig in 1726 and given its first performance before 1731â€“1732. It draws its\n         text from the Book of Isaiah 41:10 and 43:1 and a hymn by Paul Gerhardt.', '1975', 0, 'C72', '00:19:05'),
('O95', 'Komm, Jesu, komm!', 'Komm, Jesu, komm (Come, Jesus, come, BWV 229) is a motet by Johann Sebastian Bach, with\n         a text by Paul Thymich. It was composed in Leipzig before 1735, possibly between 1723 and\n         1734, and had already received its first performance by 1731â€“1732.', '1616', 0, 'C226', '01:46:17'),
('O96', 'Lobet den Herrn, alle Heiden', 'Lobet den Herrn, alle Heiden (Praise the Lord, all ye heathen), BWV 230, is a motet by\n         Johann Sebastian Bach. It draws its text from Psalm 117 Verses 1-2.The work is generally\n         regarded as one of six surviving motets by Bach. However, some scholars have expressed\n         doubts about its attribution to Bach. It is the only one of the set to be scored for four\n         voices. It is also unusual in that (lightly-scored) instrumental accompaniment is\n         specified.The work was first published in 1821.', '1860', 0, 'C30', '00:50:20');

-- --------------------------------------------------------

--
-- Estrutura da tabela `obra_instrumento`
--

CREATE TABLE IF NOT EXISTS `obra_instrumento` (
  `id_obra` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_instrumento` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `partitura` varchar(200) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `periodo`
--

CREATE TABLE IF NOT EXISTS `periodo` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `designacao` varchar(90) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `periodo`
--

INSERT INTO `periodo` (`id`, `designacao`) VALUES
('P1', 'Medieval'),
('P2', 'Renascimento'),
('P3', 'Barroco'),
('P4', 'ClÃ¡ssico'),
('P5', 'RomÃ¢ntico'),
('P6', 'SÃ©culo XX'),
('P7', 'ContemporÃ¢neo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE IF NOT EXISTS `professor` (
  `id` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `nome` varchar(150) COLLATE utf8mb4_bin NOT NULL,
  `dataNsc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`id`, `nome`, `dataNsc`) VALUES
('P1', 'Alvaro Jose De Castro Moreira Da Silva', '1963-07-27'),
('P10', 'Pedro Manuel Vieira Santos Pinto', '1956-11-13'),
('P11', 'Rui Manuel Afonso Rodrigues Silva Guerra', '1967-10-13'),
('P12', 'Sergio Miguel Valente De Almeida', '1954-06-28'),
('P13', 'Tiago Machado Silva', '1946-08-21'),
('P14', 'Vasco Duarte Almeida Dias De Castro', '1947-10-04'),
('P15', 'Antonio Jose Oliveira Faria', '1946-12-21'),
('P16', 'Carla Maria Mendes De Castro', '1953-01-27'),
('P17', 'Marlene Azevedo Da Silva', '1954-06-11'),
('P18', 'Paulo Alexandre Marques De Oliveira Serafim', '1961-11-20'),
('P19', 'David Filipe Oliveira Costa', '1959-10-01'),
('P2', 'Andre Filipe Azevedo Sousa', '1968-03-15'),
('P20', 'Ricardo Miguel Carvalho Ferreira', '1950-06-21'),
('P21', 'Jose Alves De Castro', '1973-09-16'),
('P22', 'Mario Bento Brito Nobrega Ramos De Azevedo', '1969-03-06'),
('P23', 'Paulo Cesar Rodrigues Gomes', '1949-08-26'),
('P24', 'Susana Pereira', '1989-08-23'),
('P25', 'Gabriel Reis', '1980-09-04'),
('P26', 'ArsÃ©nio', '1973-03-05'),
('P27', 'Frederico Pinto', '1988-01-07'),
('P28', 'GonÃ§alo Hermenegildo', '1965-02-28'),
('P29', 'Luis', '1987-03-26'),
('P3', 'Bruno Miguel Pereira Pinto', '1977-05-06'),
('P30', 'Miguel Pinto', '1977-01-02'),
('P31', 'Pedro Lopes', '1979-06-09'),
('P32', 'AntÃ³nio JosÃ© Coutinho Barbosa', '1969-05-11'),
('P33', 'Ricardo Paz', '1966-06-21'),
('P34', 'Sandrina Maciel', '1980-11-04'),
('P35', 'Bruno Martins', '1962-04-19'),
('P36', 'Filipe Froufe', '1960-07-22'),
('P37', 'JoÃ£o Brites', '1950-09-21'),
('P38', 'Leandro Morgado', '1952-07-14'),
('P39', 'Manuel Sousa', '1992-03-21'),
('P4', 'Filipe Alexandre Da Silva Martins', '1988-12-10'),
('P40', 'Pedro Resende', '1983-03-24'),
('P41', 'Ricardo', '1955-02-24'),
('P42', 'Fernanda Barroso', '1954-01-03'),
('P43', 'Marta Silva', '1985-06-01'),
('P44', 'Paulo Alexandre Afonso Dias', '1966-12-15'),
('P45', 'Susana Pacheco', '1982-02-06'),
('P46', 'Almeno', '1982-08-02'),
('P47', 'Carlos Durana', '1970-05-14'),
('P48', 'Hernani Silva', '1945-03-13'),
('P49', 'Sofia Paiva', '1965-06-22'),
('P5', 'Helder Ricardo Dias Ribeiro', '1969-03-04'),
('P50', 'Bruno Miguel Pereira Pinto', '1971-01-20'),
('P51', 'Cristiano Cunha', '1987-05-06'),
('P52', 'Daniel Pires', '1976-08-05'),
('P53', 'Ernesto Miranda Pedrosa Da Silva', '1977-11-13'),
('P54', 'Manuel Joao Salgado Da Costa Amaro', '1977-09-11'),
('P55', 'Pedro Nuno Tavares Da Silva ', '1978-12-06'),
('P56', 'Rui Pedro Da Costa Barbosa', '1977-11-14'),
('P57', 'Carlos Guilherme Pelaio Macedo Costa ', '1955-03-28'),
('P58', 'Jorge Filipe Marcos Mota ', '1947-10-23'),
('P59', 'Nuno Miguel Alves Peixoto', '1986-12-22'),
('P6', 'Hernani Rodrigues Da Silva', '1971-11-21'),
('P60', 'VÃ¢nia Sifia Carvalho', '1986-01-17'),
('P61', 'Maria Campos', '1963-06-07'),
('P62', 'Nuno Rodrigues', '1983-06-17'),
('P63', 'AdÃ©lio Marco Da Costa Fernandes', '1972-11-13'),
('P64', 'Alexandre GonÃ§alves', '1970-12-16'),
('P65', 'AmÃ¢ndio Telmo Oliveira Teixeira', '1961-12-11'),
('P66', 'Carla Sofia De Almeida Coutinho ', '1989-01-06'),
('P67', 'Edison Oliveira', '1974-09-19'),
('P68', 'Fernando Sousa', '1951-07-22'),
('P69', 'Filipe Manuel Alves Romano', '1965-06-15'),
('P7', 'Jorge Manuel Barros Nunes', '1959-05-23'),
('P70', 'Francisco Alexandre Aires GonÃ§alves', '1972-02-16'),
('P71', 'MÃ¡rio AndrÃ© De Castro Vila Cova', '1950-02-24'),
('P72', 'Nuno Santos', '1961-07-26'),
('P73', 'Nuno Miguel Dos Santos Nunes RoldÃ£o', '1967-08-11'),
('P74', 'Orlando Jorge Carvalho Ribeiro', '1960-09-10'),
('P75', 'Pedro Filipe Meira Morais', '1979-06-26'),
('P76', 'Renato Neves', '1967-03-22'),
('P77', 'Ricardo', '1987-03-14'),
('P78', 'Ricardo Manuel Da Silva Abreu', '1946-02-19'),
('P79', 'Rui Miguel Silva', '1959-08-06'),
('P8', 'Jose Miguel Araujo Ferreira', '1947-01-10'),
('P80', 'Sandro Miguel Vales De Freitas', '1968-02-04'),
('P81', 'Ana LuÃ­sa Pinto Teixeira', '1991-12-22'),
('P82', 'CÃ¢ndida', '1962-06-05'),
('P83', 'Carla Susana Teixeira', '1945-03-07'),
('P84', 'Daniel Edgar Pinto Soares', '1958-07-27'),
('P85', 'LÃºcia Sofia Miranda', '1948-12-18'),
('P86', 'MÃ¡rcio Ferreira', '1987-06-01'),
('P87', 'Maria Da ConceiÃ§Ã£o Mota', '1949-08-08'),
('P88', 'Maria JoÃ£o Fernandes Guerreiro Da Silva ', '1957-10-01'),
('P89', 'Miguel Carreira', '1975-09-13'),
('P9', 'Pedro Gabriel Dias Ferreira', '1950-08-13'),
('P90', 'VÃ­tor Manuel Catarino', '1967-05-15'),
('P91', 'Vitor GonÃ§alves', '1981-05-01'),
('P92', 'Fernando Jorge Ferreira LaÃºndos Da Costa', '1986-07-08'),
('P93', 'Marco Paulo Martins Cruz', '1968-12-16'),
('P94', 'Miguel Pereira Mateus', '1955-10-06'),
('P95', 'Rodney Lopes Gomes', '1955-08-16');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor_curso`
--

CREATE TABLE IF NOT EXISTS `professor_curso` (
  `id_professor` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_curso` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `professor_curso`
--

INSERT INTO `professor_curso` (`id_professor`, `id_curso`) VALUES
('P1', 'CS20'),
('P10', 'CS3'),
('P11', 'CB15'),
('P12', 'CS18'),
('P13', 'CB15'),
('P14', 'CS21'),
('P15', 'CB19'),
('P16', 'CS11'),
('P17', 'CB20'),
('P18', 'CB21'),
('P19', 'CS19'),
('P2', 'CB9'),
('P20', 'CS11'),
('P21', 'CB17'),
('P22', 'CS16'),
('P23', 'CS7'),
('P24', 'CS13'),
('P25', 'CB13'),
('P26', 'CB17'),
('P27', 'CB7'),
('P28', 'CS6'),
('P29', 'CB4'),
('P3', 'CB4'),
('P30', 'CB19'),
('P31', 'CB1'),
('P32', 'CB7'),
('P33', 'CS21'),
('P34', 'CB18'),
('P35', 'CB17'),
('P36', 'CB9'),
('P37', 'CS1'),
('P38', 'CB22'),
('P39', 'CB3'),
('P4', 'CB19'),
('P40', 'CB13'),
('P41', 'CS15'),
('P42', 'CB18'),
('P43', 'CS22'),
('P44', 'CB16'),
('P45', 'CB22'),
('P46', 'CS16'),
('P47', 'CS10'),
('P48', 'CS8'),
('P49', 'CB9'),
('P5', 'CS15'),
('P50', 'CB5'),
('P51', 'CB21'),
('P52', 'CB1'),
('P53', 'CB20'),
('P54', 'CS3'),
('P55', 'CB12'),
('P56', 'CS5'),
('P57', 'CB19'),
('P58', 'CS2'),
('P59', 'CB20'),
('P6', 'CB7'),
('P60', 'CS5'),
('P61', 'CB21'),
('P62', 'CB15'),
('P63', 'CB22'),
('P64', 'CB18'),
('P65', 'CB22'),
('P66', 'CB10'),
('P67', 'CB12'),
('P68', 'CB11'),
('P69', 'CB9'),
('P7', 'CS19'),
('P70', 'CS3'),
('P71', 'CB7'),
('P72', 'CS9'),
('P73', 'CB5'),
('P74', 'CS3'),
('P75', 'CB14'),
('P76', 'CB7'),
('P77', 'CB14'),
('P78', 'CB13'),
('P79', 'CB17'),
('P8', 'CS11'),
('P80', 'CB7'),
('P81', 'CS12'),
('P82', 'CB17'),
('P83', 'CS14'),
('P84', 'CB4'),
('P85', 'CB1'),
('P86', 'CS6'),
('P87', 'CB18'),
('P88', 'CB2'),
('P89', 'CB6'),
('P9', 'CB22'),
('P90', 'CB8'),
('P91', 'CB9'),
('P92', 'CS4'),
('P93', 'CS17'),
('P94', 'CB6'),
('P95', 'CB4');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor_habilitacao`
--

CREATE TABLE IF NOT EXISTS `professor_habilitacao` (
  `id_professor` varchar(9) COLLATE utf8mb4_bin NOT NULL,
  `id_habilitacao` varchar(9) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Extraindo dados da tabela `professor_habilitacao`
--

INSERT INTO `professor_habilitacao` (`id_professor`, `id_habilitacao`) VALUES
('P1', 'HM20'),
('P10', 'HM3'),
('P11', 'HL15'),
('P12', 'HM18'),
('P13', 'HL15'),
('P14', 'HM21'),
('P15', 'HL19'),
('P16', 'HM11'),
('P17', 'HL20'),
('P18', 'HL21'),
('P19', 'HM19'),
('P2', 'HL9'),
('P20', 'HM11'),
('P21', 'HM17'),
('P22', 'HM16'),
('P23', 'HM7'),
('P24', 'HM13'),
('P25', 'HL13'),
('P26', 'HL17'),
('P27', 'HL7'),
('P28', 'HM6'),
('P29', 'HM4'),
('P3', 'HL4'),
('P30', 'HL19'),
('P31', 'HL1'),
('P32', 'HL7'),
('P33', 'HM21'),
('P34', 'HL18'),
('P35', 'HL17'),
('P36', 'HM9'),
('P37', 'HM1'),
('P38', 'HL22'),
('P39', 'HM3'),
('P4', 'HM19'),
('P40', 'HM13'),
('P41', 'HM15'),
('P42', 'HL18'),
('P43', 'HM22'),
('P44', 'HM16'),
('P45', 'HL22'),
('P46', 'HM16'),
('P47', 'HM10'),
('P48', 'HM8'),
('P49', 'HM9'),
('P5', 'HM15'),
('P50', 'HL5'),
('P51', 'HM21'),
('P52', 'HL1'),
('P53', 'HL20'),
('P54', 'HM3'),
('P55', 'HM12'),
('P56', 'HM5'),
('P57', 'HM19'),
('P58', 'HM2'),
('P59', 'HL20'),
('P6', 'HL7'),
('P60', 'HM5'),
('P61', 'HL21'),
('P62', 'HL15'),
('P63', 'HM22'),
('P64', 'HM18'),
('P65', 'HL22'),
('P66', 'HL10'),
('P67', 'HM12'),
('P68', 'HM11'),
('P69', 'HM9'),
('P7', 'HM19'),
('P70', 'HM3'),
('P71', 'HL7'),
('P72', 'HM9'),
('P73', 'HM5'),
('P74', 'HM3'),
('P75', 'HL14'),
('P76', 'HL7'),
('P77', 'HL14'),
('P78', 'HL13'),
('P79', 'HL17'),
('P8', 'HM11'),
('P80', 'HL7'),
('P81', 'HM12'),
('P82', 'HM17'),
('P83', 'HM14'),
('P84', 'HM4'),
('P85', 'HL1'),
('P86', 'HM6'),
('P87', 'HM18'),
('P88', 'HL2'),
('P89', 'HM6'),
('P9', 'HL22'),
('P90', 'HM8'),
('P91', 'HL9'),
('P92', 'HM4'),
('P93', 'HM17'),
('P94', 'HM6'),
('P95', 'HM4');

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
-- Indexes for table `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`id_aluno`,`id_curso`,`anoLetivo`);

--
-- Indexes for table `obra`
--
ALTER TABLE `obra`
  ADD PRIMARY KEY (`id`);

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
-- Indexes for table `professor_curso`
--
ALTER TABLE `professor_curso`
  ADD PRIMARY KEY (`id_professor`,`id_curso`);

--
-- Indexes for table `professor_habilitacao`
--
ALTER TABLE `professor_habilitacao`
  ADD PRIMARY KEY (`id_professor`,`id_habilitacao`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
