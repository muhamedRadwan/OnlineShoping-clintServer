-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2017 at 06:16 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlineshopping`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `parent_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`id`, `name`, `parent_id`) VALUES
(0, 'Earth', NULL),
(1, 'Egypt', 0),
(2, 'UAE', 0),
(3, 'Saudi Arabia', 0),
(4, 'Alexanderia', 1),
(5, 'Cairo', 1),
(6, 'Giza', 1),
(7, 'Riyadh', 3),
(8, 'Madinah', 3),
(9, 'Makkah', 3),
(10, 'Abu Dhabi', 2),
(11, 'Dubai', 2),
(13, 'Agamy', 4),
(14, 'Stanly', 4),
(15, 'Atfih', 6),
(16, '6 October', 6),
(17, 'Maadi', 5),
(18, 'Helwan', 5),
(19, 'Nasr city', 5),
(20, 'String', 1),
(21, 'String', 1),
(22, 'String', 1),
(26, 'tahrir', 0),
(27, 'tahrir', 1),
(33, 'tahrir', 1),
(35, 'tahrir', 1),
(37, 'tahrir', 1),
(38, 'tahrir', 1),
(39, 'tahrir', 1),
(40, 'tahrir', 1),
(41, 'tahrir', 1),
(42, 'tahrir', 1),
(54, 'tahrir', 1),
(55, 'tahrir', 1),
(56, 'tahrir', 1),
(62, 'tahrir', 1),
(63, 'tahrir', 1),
(64, 'Mdar', 3),
(65, 'Mdar', 3),
(66, 'Maadi', 2);

-- --------------------------------------------------------

--
-- Table structure for table `cart_item`
--

CREATE TABLE `cart_item` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `customer_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart_item`
--

INSERT INTO `cart_item` (`id`, `product_id`, `quantity`, `customer_id`) VALUES
(20, 4, 500, 14),
(21, 4, 500, 15),
(24, 4, 500, 20),
(25, 4, 500, 21),
(26, 4, 500, 22),
(32, 4, 500, 28),
(33, 4, 500, 29),
(34, 4, 500, 30);

-- --------------------------------------------------------

--
-- Table structure for table `cateogry`
--

CREATE TABLE `cateogry` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `description` varchar(200) NOT NULL,
  `parent_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cateogry`
--

INSERT INTO `cateogry` (`id`, `name`, `description`, `parent_id`) VALUES
(1, 'men', 'men age is greater than 20', NULL),
(2, 'T-shirt', '...', 1),
(7, 'Man', 'ELBL7', 1);

-- --------------------------------------------------------

--
-- Table structure for table `currency`
--

CREATE TABLE `currency` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `conversionValue` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `currency`
--

INSERT INTO `currency` (`id`, `name`, `conversionValue`) VALUES
(1, 'Dollar', 18.7),
(2, 'Euro', 20.5),
(3, 'L.E', 1),
(8, 'Dollar', 5.1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `phoneNumber` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `email`, `address_id`, `phoneNumber`) VALUES
(14, 'Mohamed@', 41, '01145'),
(15, 'Mohamed@', 42, '01145'),
(20, 'Mohamed@', 54, '01145'),
(21, 'Mohamed@', 55, '01145'),
(22, 'Mohamed@', 56, '01145'),
(28, 'Mohamed@', 62, '01145'),
(29, 'Mohamed@', 63, '01145'),
(30, 'muhameda.radwan@gmail.com', 66, '01148037467');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `description` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `seen` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `customer_id`, `description`, `date`, `seen`) VALUES
(2, 20, 'SASASAASas', '2017-05-09 04:54:52', 0),
(3, 21, 'SASASAASas', '2017-05-09 04:59:22', 0),
(4, 22, 'SASASAASas', '2017-05-09 05:35:45', 0),
(10, 28, 'SASASAASas', '2017-05-09 06:06:04', 0),
(11, 29, 'SASASAASas', '2017-05-09 18:21:04', 0),
(12, 30, 'This Amazing site', '2017-05-11 14:42:28', 0);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `content` text NOT NULL,
  `address_id` int(11) NOT NULL,
  `cost` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `order_id`, `customer_id`, `content`, `address_id`, `cost`) VALUES
(3, 6, 28, 'Ra8y', 62, 5.2),
(4, 7, 29, 'Ra8y', 63, 5.2),
(5, 8, 30, '10 pices cakes 250', 66, 250);

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `id` int(11) NOT NULL,
  `offer_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offer`
--

CREATE TABLE `offer` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `presentage` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `offer`
--

INSERT INTO `offer` (`id`, `name`, `presentage`) VALUES
(1, 'Ramadan', 20),
(5, 'Ramadan', 10);

-- --------------------------------------------------------

--
-- Table structure for table `offer_product`
--

CREATE TABLE `offer_product` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `offer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `offer_product`
--

INSERT INTO `offer_product` (`id`, `product_id`, `offer_id`) VALUES
(1, 2, 1),
(2, 1, 1),
(3, 11, 5);

-- --------------------------------------------------------

--
-- Table structure for table `order_1`
--

CREATE TABLE `order_1` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `paymentMethod_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_1`
--

INSERT INTO `order_1` (`id`, `customer_id`, `date`, `paymentMethod_id`) VALUES
(6, 28, '2017-05-09 06:06:04', NULL),
(7, 29, '2017-05-09 18:21:04', NULL),
(8, 30, '2017-05-11 14:42:28', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `order_cart_item`
--

CREATE TABLE `order_cart_item` (
  `id` int(11) NOT NULL,
  `cartItem_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_cart_item`
--

INSERT INTO `order_cart_item` (`id`, `cartItem_id`, `order_id`) VALUES
(1, 32, 6),
(2, 33, 7),
(3, 34, 8);

-- --------------------------------------------------------

--
-- Table structure for table `payment_method`
--

CREATE TABLE `payment_method` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_method`
--

INSERT INTO `payment_method` (`id`, `name`) VALUES
(1, 'creadit cart'),
(2, 'visa '),
(3, 'cash');

-- --------------------------------------------------------

--
-- Table structure for table `payment_option`
--

CREATE TABLE `payment_option` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_option`
--

INSERT INTO `payment_option` (`id`, `name`) VALUES
(1, 'creadit number'),
(2, 'country');

-- --------------------------------------------------------

--
-- Table structure for table `payment_selected_option`
--

CREATE TABLE `payment_selected_option` (
  `id` int(11) NOT NULL,
  `paymentMethod_id` int(11) NOT NULL,
  `paymentOption_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_selected_option`
--

INSERT INTO `payment_selected_option` (`id`, `paymentMethod_id`, `paymentOption_id`) VALUES
(1, 1, 1),
(2, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `payment_selected_option_value`
--

CREATE TABLE `payment_selected_option_value` (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `paymentSelectedOption_id` int(11) NOT NULL,
  `value` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type_id` varchar(30) NOT NULL,
  `registerationDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `firstName`, `lastName`, `username`, `password`, `type_id`, `registerationDate`) VALUES
(1, 'ahmed', 'adel', 'hamada', '123321', '1', '0000-00-00 00:00:00'),
(2, 'mohamed', 'sleem', 'sleem95', '321123', '2', '0000-00-00 00:00:00'),
(3, 'mostafa', 'wael', 'mostafa_123', '123456789', '3', '0000-00-00 00:00:00'),
(4, 'ibrahim', 'shrif', 'hema_0', '123123123', '1', '0000-00-00 00:00:00'),
(7, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', '1', '2017-05-09 01:46:40'),
(9, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', '1', '2017-05-09 02:03:31'),
(10, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 02:11:41'),
(11, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 02:17:16'),
(12, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 02:17:53'),
(13, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 02:20:34'),
(14, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 02:25:04'),
(15, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 02:25:23'),
(16, 'ads', 'asd', 'sdads', 'sdas', 'Customer', '2017-05-09 04:37:42'),
(17, 'ads', 'asd', 'sdads', 'sdas', 'Customer', '2017-05-09 04:38:04'),
(20, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 04:54:52'),
(21, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 04:59:21'),
(22, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 05:35:45'),
(28, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 06:06:04'),
(29, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-09 18:21:04'),
(30, 'Mohamed', 'Ahmed', 'mohamedahmed', '1234', 'Customer', '2017-05-11 14:42:28');

-- --------------------------------------------------------

--
-- Table structure for table `privilege`
--

CREATE TABLE `privilege` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `privilege`
--

INSERT INTO `privilege` (`id`, `name`) VALUES
(1, 'add employee'),
(2, 'delete employee'),
(3, 'update employee'),
(4, 'add role'),
(5, 'delete customer'),
(6, 'add product '),
(7, 'update product'),
(8, 'delete product'),
(9, 'update password'),
(10, 'make offer'),
(11, 'add to shopping cart'),
(12, 'update shopping cart'),
(13, 'update account'),
(14, 'add product to favourite'),
(15, 'make invoice');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(200) NOT NULL,
  `cateogry_id` int(11) DEFAULT NULL,
  `unitPrice` float NOT NULL,
  `currency_id` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `description`, `cateogry_id`, `unitPrice`, `currency_id`, `quantity`) VALUES
(1, 'adidas', '\r\nt-shirt with all sizes \r\nfor winter ', 2, 122.99, 1, 60),
(2, 'nike', 'classic shoes for parties   ', 1, 349.99, 2, 38),
(3, 'asd', 'asdklasmd', 2, 500, 3, 500),
(4, 'asd', 'asdksalasmd', 1, 500, 3, 500),
(5, 'asd', 'asdksalasmd', 1, 500, 2, 5000),
(11, 'Mohamed', 'Lbs rgaly', 7, 250.5, 8, 50);

-- --------------------------------------------------------

--
-- Table structure for table `product_feature`
--

CREATE TABLE `product_feature` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_feature`
--

INSERT INTO `product_feature` (`id`, `name`) VALUES
(1, 'size'),
(2, 'color'),
(3, 'shape');

-- --------------------------------------------------------

--
-- Table structure for table `product_selected_feature`
--

CREATE TABLE `product_selected_feature` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `productFeature_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_selected_feature`
--

INSERT INTO `product_selected_feature` (`id`, `product_id`, `productFeature_id`) VALUES
(1, 1, 1),
(2, 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `product_selected_feature_value`
--

CREATE TABLE `product_selected_feature_value` (
  `id` int(11) NOT NULL,
  `productSelectedFeature_id` int(11) NOT NULL,
  `value` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_selected_feature_value`
--

INSERT INTO `product_selected_feature_value` (`id`, `productSelectedFeature_id`, `value`) VALUES
(1, 1, 'XL'),
(2, 1, 'L'),
(3, 2, 'Black');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `id` int(11) NOT NULL,
  `person_id` int(11) NOT NULL,
  `value` varchar(200) NOT NULL,
  `date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `type`
--

INSERT INTO `type` (`id`, `name`) VALUES
(1, 'Customer'),
(2, 'Admin'),
(3, 'Employee');

-- --------------------------------------------------------

--
-- Table structure for table `type_selected_privilege`
--

CREATE TABLE `type_selected_privilege` (
  `id` int(11) NOT NULL,
  `type_id` int(11) NOT NULL,
  `privilege_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `type_selected_privilege`
--

INSERT INTO `type_selected_privilege` (`id`, `type_id`, `privilege_id`) VALUES
(1, 2, 1),
(2, 2, 2),
(3, 2, 3),
(4, 2, 4),
(5, 2, 5),
(6, 2, 9),
(7, 3, 6),
(8, 3, 7),
(9, 3, 8),
(10, 3, 9),
(11, 3, 10),
(19, 1, 10),
(20, 1, 11),
(21, 1, 12),
(22, 1, 13),
(23, 1, 14),
(24, 1, 15);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`),
  ADD KEY `address_parent` (`parent_id`);

--
-- Indexes for table `cart_item`
--
ALTER TABLE `cart_item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cart_item__product` (`product_id`),
  ADD KEY `cart_item_Customer` (`customer_id`);

--
-- Indexes for table `cateogry`
--
ALTER TABLE `cateogry`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cateogry__parent` (`parent_id`);

--
-- Indexes for table `currency`
--
ALTER TABLE `currency`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customer_address` (`address_id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`),
  ADD KEY `feedback_customer` (`customer_id`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`id`),
  ADD KEY `invoice_customer` (`customer_id`),
  ADD KEY `invoice__order_1` (`order_id`),
  ADD KEY `address_id` (`address_id`);

--
-- Indexes for table `notification`
--
ALTER TABLE `notification`
  ADD PRIMARY KEY (`id`),
  ADD KEY `notification_customer` (`customer_id`),
  ADD KEY `notification__offer` (`offer_id`);

--
-- Indexes for table `offer`
--
ALTER TABLE `offer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `offer_product`
--
ALTER TABLE `offer_product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `offer_product` (`product_id`),
  ADD KEY `offer_product_offer` (`offer_id`);

--
-- Indexes for table `order_1`
--
ALTER TABLE `order_1`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_1__customer` (`customer_id`),
  ADD KEY `order_1__payment_method` (`paymentMethod_id`);

--
-- Indexes for table `order_cart_item`
--
ALTER TABLE `order_cart_item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_cart_item__cart_item` (`cartItem_id`),
  ADD KEY `order_cart_item__order` (`order_id`);

--
-- Indexes for table `payment_method`
--
ALTER TABLE `payment_method`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment_option`
--
ALTER TABLE `payment_option`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment_selected_option`
--
ALTER TABLE `payment_selected_option`
  ADD PRIMARY KEY (`id`),
  ADD KEY `payment_selected_option__payment_method` (`paymentMethod_id`),
  ADD KEY `payment_selected_option__payment_option` (`paymentOption_id`);

--
-- Indexes for table `payment_selected_option_value`
--
ALTER TABLE `payment_selected_option_value`
  ADD PRIMARY KEY (`id`),
  ADD KEY `payment_selected_option_values__order_1` (`order_id`),
  ADD KEY `payment_selected_option_values__payment_selected_option` (`paymentSelectedOption_id`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`),
  ADD KEY `person_type` (`type_id`);

--
-- Indexes for table `privilege`
--
ALTER TABLE `privilege`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product__cateogry` (`cateogry_id`),
  ADD KEY `product__currency` (`currency_id`);

--
-- Indexes for table `product_feature`
--
ALTER TABLE `product_feature`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_selected_feature`
--
ALTER TABLE `product_selected_feature`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_selected_feature__product` (`product_id`),
  ADD KEY `product_selected_feature__product_feature` (`productFeature_id`);

--
-- Indexes for table `product_selected_feature_value`
--
ALTER TABLE `product_selected_feature_value`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_selected_feature_value__product_selected_feature` (`productSelectedFeature_id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`),
  ADD KEY `report_person` (`person_id`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `type_selected_privilege`
--
ALTER TABLE `type_selected_privilege`
  ADD PRIMARY KEY (`id`),
  ADD KEY `type_selected_privilege__type` (`type_id`),
  ADD KEY `type_selected_privilege__privilege` (`privilege_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
--
-- AUTO_INCREMENT for table `cart_item`
--
ALTER TABLE `cart_item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT for table `cateogry`
--
ALTER TABLE `cateogry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `currency`
--
ALTER TABLE `currency`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `notification`
--
ALTER TABLE `notification`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `offer`
--
ALTER TABLE `offer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `offer_product`
--
ALTER TABLE `offer_product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `order_1`
--
ALTER TABLE `order_1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `order_cart_item`
--
ALTER TABLE `order_cart_item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `payment_method`
--
ALTER TABLE `payment_method`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `payment_option`
--
ALTER TABLE `payment_option`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `payment_selected_option`
--
ALTER TABLE `payment_selected_option`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `payment_selected_option_value`
--
ALTER TABLE `payment_selected_option_value`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `privilege`
--
ALTER TABLE `privilege`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `product_feature`
--
ALTER TABLE `product_feature`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `product_selected_feature`
--
ALTER TABLE `product_selected_feature`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `product_selected_feature_value`
--
ALTER TABLE `product_selected_feature_value`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `type`
--
ALTER TABLE `type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `type_selected_privilege`
--
ALTER TABLE `type_selected_privilege`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `address_parent` FOREIGN KEY (`parent_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cart_item`
--
ALTER TABLE `cart_item`
  ADD CONSTRAINT `cart_item_Customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cart_item__product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cateogry`
--
ALTER TABLE `cateogry`
  ADD CONSTRAINT `cateogry__parent` FOREIGN KEY (`parent_id`) REFERENCES `cateogry` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `Customer_Person` FOREIGN KEY (`id`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `customer_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice__order_1` FOREIGN KEY (`order_id`) REFERENCES `order_1` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `invoice_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `notification`
--
ALTER TABLE `notification`
  ADD CONSTRAINT `notification__offer` FOREIGN KEY (`offer_id`) REFERENCES `offer_product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `notification_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `offer_product`
--
ALTER TABLE `offer_product`
  ADD CONSTRAINT `offer_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `offer_product_offer` FOREIGN KEY (`offer_id`) REFERENCES `offer` (`id`);

--
-- Constraints for table `order_1`
--
ALTER TABLE `order_1`
  ADD CONSTRAINT `order_1__customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `order_1__payment_method` FOREIGN KEY (`paymentMethod_id`) REFERENCES `payment_method` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `order_cart_item`
--
ALTER TABLE `order_cart_item`
  ADD CONSTRAINT `order_cart_item__cart_item` FOREIGN KEY (`cartItem_id`) REFERENCES `cart_item` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `order_cart_item__order` FOREIGN KEY (`order_id`) REFERENCES `order_1` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payment_selected_option`
--
ALTER TABLE `payment_selected_option`
  ADD CONSTRAINT `payment_selected_option__payment_method` FOREIGN KEY (`paymentMethod_id`) REFERENCES `payment_method` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `payment_selected_option__payment_option` FOREIGN KEY (`paymentOption_id`) REFERENCES `payment_option` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payment_selected_option_value`
--
ALTER TABLE `payment_selected_option_value`
  ADD CONSTRAINT `payment_selected_option_values__order_1` FOREIGN KEY (`order_id`) REFERENCES `order_1` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `payment_selected_option_values__payment_selected_option` FOREIGN KEY (`paymentSelectedOption_id`) REFERENCES `payment_selected_option` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product__cateogry` FOREIGN KEY (`cateogry_id`) REFERENCES `cateogry` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `product__currency` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product_selected_feature`
--
ALTER TABLE `product_selected_feature`
  ADD CONSTRAINT `product_selected_feature__product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `product_selected_feature__product_feature` FOREIGN KEY (`productFeature_id`) REFERENCES `product_feature` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product_selected_feature_value`
--
ALTER TABLE `product_selected_feature_value`
  ADD CONSTRAINT `product_selected_feature_value__product_selected_feature` FOREIGN KEY (`productSelectedFeature_id`) REFERENCES `product_selected_feature` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `report_person` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `type_selected_privilege`
--
ALTER TABLE `type_selected_privilege`
  ADD CONSTRAINT `type_selected_privilege__privilege` FOREIGN KEY (`privilege_id`) REFERENCES `privilege` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `type_selected_privilege__type` FOREIGN KEY (`type_id`) REFERENCES `type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
