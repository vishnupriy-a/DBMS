-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 04, 2023 at 11:48 AM
-- Server version: 5.7.33-0ubuntu0.16.04.1
-- PHP Version: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `store`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Getp` ()  BEGIN
    SELECT * FROM product;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertproduct` (IN `barcode` INT, IN `p_name` VARCHAR(50), IN `p_price` DOUBLE, IN `p_qty` INT)  BEGIN
 INSERT INTO product (`pdtid`, `pName`, `price`, `quantity`) VALUES (barcode,p_name,p_price,p_qty);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertproduct1` (IN `barcode` INT, IN `p_name` VARCHAR(50), IN `p_price` DOUBLE, IN `p_qty` INT)  BEGIN
if p_price>0 and p_qty>=0 then
 INSERT INTO product (`pdtid`, `pName`, `price`, `quantity`) VALUES (barcode,p_name,p_price,p_qty);
end if;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pdtid` int(11) NOT NULL,
  `pName` varchar(150) NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pdtid`, `pName`, `price`, `quantity`) VALUES
(101, 'malu', 34, 344);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pdtid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
