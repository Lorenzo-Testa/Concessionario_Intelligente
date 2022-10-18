-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Set 17, 2022 alle 14:27
-- Versione del server: 10.4.22-MariaDB
-- Versione PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `concessionario_intelligente`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `auto`
--

CREATE TABLE `auto` (
  `targa` varchar(255) NOT NULL,
  `concarrivo` varchar(255) DEFAULT NULL,
  `conclavorazione` varchar(255) DEFAULT NULL,
  `concprovenienza` varchar(255) NOT NULL,
  `dataconsegna` varchar(255) DEFAULT NULL,
  `datavendita` varchar(255) DEFAULT NULL,
  `marca` varchar(255) NOT NULL,
  `modello` varchar(255) NOT NULL,
  `proprietario` varchar(255) NOT NULL,
  `stato` varchar(255) NOT NULL,
  `telaio` varchar(255) NOT NULL,
  `venduta` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `auto`
--

INSERT INTO `auto` (`targa`, `concarrivo`, `conclavorazione`, `concprovenienza`, `dataconsegna`, `datavendita`, `marca`, `modello`, `proprietario`, `stato`, `telaio`, `venduta`) VALUES

('AA111AA', 'BOLOGNA', NULL,  'MILANO',   '2022-10-20', '2022-09-22', 'FIAT',     'PUNTO',    'HTYSKB47R55A616Y', 'NONSCHEDULATO',  'FVGRNK', b'1'),
('AA112AA', 'MILANO', NULL,  'TORINO',   '2022-10-22', '2024-09-22', 'FIAT',     'PUNTO',    'CHBLZV60R64Z119W', 'NONSCHEDULATO',  'NSVWYX', b'1'),
('AA113AA', 'VENEZIA', NULL, 'VENEZIA',  '2022-10-14', '2022-09-24', 'PEGEOUT',  '207',      'MGHSPF71B65H414A', 'NONSCHEDULATO',  'TNBMTS', b'1'),
('AA114AA', 'TORINO', NULL, 'BOLOGNA',  '2022-10-15', '2022-09-29', 'PEGEOUT',  '207',      'ZRDLHZ53T25A719C', 'NONSCHEDULATO',  'TSBLRT', b'1'),
('AA115AA', 'GENOVA', NULL,  'GENOVA',   '2022-10-13', '2024-09-30', 'FIAT',     'PUNTO',    'ZNNLCM36C06B689G', 'NONSCHEDULATO',  'NVLZJZ', b'1'),
('AA116AA', 'MILANO', NULL, 'VENEZIA',  '2022-10-14', '2022-09-27', 'PEGEOUT',  '207',      'BZGGZS90B52L271L', 'NONSCHEDULATO',  'RSPCGV', b'1'),
('AA117AA', 'BOLOGNA', NULL,  'MILANO',   '2022-10-20', '2024-10-01', 'FIAT',     'PUNTO',    'VAEFHH74L56G479G', 'NONSCHEDULATO',  'RCVRQS', b'1'),
('AA118AA', 'VENEZIA', NULL, 'GENOVA',   '2022-10-17', '2024-09-27', 'FIAT',     'PUNTO',    'JQSDWN93L09I131R', 'NONSCHEDULATO',  'FLXLCR', b'1'),
('AA120AA', 'GENOVA',  NULL,  'BOLOGNA',   '2022-10-10', '2022-09-28', 'MINI',     'COOPER',   'KSFMFP79C52I621J', 'NONSCHEDULATO',  'GYLHYO', b'1'),
('AA119AA', NULL,       NULL,     'MILANO',   NULL,         NULL,         'ALFA ROMEO', 'GIULIA', 'concessionario',   'NONSCHEDULATO',  'GMRFNF', b'0'),
('AA121AA', NULL,       NULL,     'TORINO',   NULL,         NULL,         'ALFA ROMEO', 'GIULIA', 'concessionario',   'NONSCHEDULATO',  'RFQFCC', b'0'),
('AA122AA', NULL,       NULL,     'BOLOGNA',  NULL,         NULL,         'ALFA ROMEO', 'GIULIA', 'concessionario',   'NONSCHEDULATO',  'JHLHJR', b'0'),
('AA126AA', NULL,       NULL,     'VENEZIA',  NULL,         NULL,         'ALFA ROMEO', 'GIULIA', 'concessionario',   'NONSCHEDULATO',  'MKNFMM', b'0'),
('AA128AA', NULL,       NULL,     'MILANO',   NULL,         NULL,         'FIAT',       'PANDA',  'concessionario',   'NONSCHEDULATO',  'CCBZRP', b'0'),
('AA123AA', 'TORINO', NULL,   'TORINO',   '2022-10-04', '2022-09-24', 'MINI',     'COOPER',   'YZSQNJ27L19F445T', 'NONSCHEDULATO',  'FZKDHN', b'1'),
('AA124AA', 'TORINO', NULL,   'TORINO',   '2022-10-01', '2022-09-20', 'MINI',     'COOPER',   'KBZSDN50L13F456T', 'NONSCHEDULATO',  'FCCPSS', b'1'),
('AA125AA', 'MILANO', NULL, 'VENEZIA',  '2022-10-05', '2022-09-23', 'PEGEOUT',  '207',      'DCHHQH61P41G851V', 'NONSCHEDULATO',  'PBJPZP', b'1'),
('AA127AA', 'VENEZIA', NULL,   'BOLOGNA',   '2022-10-04', '2022-09-27', 'MINI',     'COOPER',   'JNZGLS56C57G713G', 'NONSCHEDULATO',  'PWBHCM', b'1'),
('AA129AA', 'BOLOGNA', NULL, 'MILANO',  '2022-10-22', '2022-09-30', 'PEGEOUT',  '207',      'GDPYTP88B68D901U', 'NONSCHEDULATO',  'QDZRWR', b'1'),
('AA130AA', 'GENOVA', NULL,   'GENOVA',   '2022-10-30', '2022-10-03', 'MINI',     'COOPER',   'VFNLBY96H29I330A', 'NONSCHEDULATO',  'TVUQPL', b'1');

-- --------------------------------------------------------

--
-- Struttura della tabella `intervento`
--

CREATE TABLE `intervento` (
  `lavoro` varchar(255) NOT NULL,
  `targa_auto` varchar(255) NOT NULL,
  `durata` int(11) DEFAULT NULL,
  `eseguito` bit(1) DEFAULT NULL,
  `officina` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `intervento`
--

INSERT INTO `intervento` (`lavoro`, `targa_auto`, `durata`, `eseguito`, `officina`) VALUES
('Tagliando completo',                  'AA111AA', 100, b'0',NULL),
('Ispezione',                           'AA111AA', 12, b'0', NULL),
('Cambio gomme',                        'AA111AA', 60, b'0', NULL),
('Ispezione e controllo gomme',         'AA112AA', 22, b'0', NULL),
('Pulizia esterni',                     'AA113AA', 30, b'0', NULL),
('Pulizia esterni ed interni',          'AA114AA', 45, b'0',NULL),
('Pulizia esterni ed interni',          'AA115AA', 45, b'0', NULL),
('Pulizia interni',                     'AA116AA', 30, b'0',NULL),
('Cambio lampadina faro sx',            'AA116AA', 15, b'0', NULL),
('Cambio pomello leva inserimento marce', 'AA116AA', 25, b'0', NULL),
('Controllo pantina parasole',          'AA117AA', 25, b'0',NULL),
('Ispezione pre consegna',              'AA117AA', 10, b'0', NULL),
('Bilanciature penumatici',             'AA118AA', 40, b'0', NULL),
('Ispezione pre consegna',              'AA118AA', 10, b'0',NULL),
('Controllo pressione pneumatici',      'AA119AA', 20, b'0',NULL),
('Distribuzione',                       'AA119AA', 420, b'0',NULL),
('Frizione',                            'AA120AA', 300, b'0',NULL),
('Pulizia esterni ed interni',          'AA120AA', 45, b'0', NULL),
('Pulizia esterni',                     'AA123AA', 30, b'0', NULL),
('Ispezione pre consegna',              'AA123AA', 15, b'0', NULL),
('Ispezione pre consegna',              'AA124AA', 15, b'0', NULL),
('Sostituzione candele',                'AA124AA', 50, b'0', NULL),
('Ispezione',                           'AA125AA', 10, b'0', NULL),
('Sostituzione pistoni cofano posteriore', 'AA125AA', 20, b'0', NULL),
('Ispezione pre consegna',              'AA126AA', 15, b'0', NULL),
('Lucidatura',                          'AA127AA', 25, b'0', NULL),
('Ispezione',                           'AA128AA', 12, b'0', NULL),
('Sostituzione radio',                  'AA128AA', 40, b'0', NULL),
('Ispezione',                           'AA129AA', 12, b'0', NULL),
('Lucidatura',                          'AA129AA', 25, b'0', NULL),
('Riparazione ammaccature',             'AA130AA', 150, b'0', NULL),
('Ispezione',                           'AA130AA', 10, b'0', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `officina`
--

CREATE TABLE `officina` (
  `posizione` varchar(255) NOT NULL,
  `capacitamax` int(11) NOT NULL,
  `carico` int(11) NOT NULL,
  `numponti` int(11) NOT NULL,
  `tempoincoda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `officina`
--

INSERT INTO `officina` (`posizione`, `capacitamax`, `carico`, `numponti`, `tempoincoda`) VALUES
('BOLOGNA', 10, 0, 3, 0),
('GENOVA', 3, 0, 2, 0),
('MILANO', 13, 0, 4, 0),
('TORINO', 10, 0, 4, 0),
('VENEZIA', 2, 0, 1, 0);

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE `utente` (
  `cf` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mansione` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`targa`);

--
-- Indici per le tabelle `intervento`
--
ALTER TABLE `intervento`
  ADD PRIMARY KEY (`lavoro`,`targa_auto`);

--
-- Indici per le tabelle `officina`
--
ALTER TABLE `officina`
  ADD PRIMARY KEY (`posizione`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`cf`),
  ADD UNIQUE KEY `UK_gxvq4mjswnupehxnp35vawmo2` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
