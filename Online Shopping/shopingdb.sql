-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2017 at 09:23 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopingdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `customer_id`) VALUES
(1, 1),
(2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `cart_item`
--

CREATE TABLE `cart_item` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `cart_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart_item`
--

INSERT INTO `cart_item` (`id`, `product_id`, `cart_id`, `quantity`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 2);

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
(2, 'T-shirt', '...', 1);

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--
-- in use(#1146 - Table 'shopingdb.cities' doesn't exist)
-- Error reading data: (#1146 - Table 'shopingdb.cities' doesn't exist)

-- --------------------------------------------------------

--
-- Table structure for table `countries`
--
-- in use(#1146 - Table 'shopingdb.countries' doesn't exist)
-- Error reading data: (#1146 - Table 'shopingdb.countries' doesn't exist)

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
(3, 'L.E', 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `person_id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address_id` int(11) NOT NULL,
  `phoneNumber` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `person_id`, `email`, `address_id`, `phoneNumber`) VALUES
(1, 1, 'hamada@yahoo.com', 1, '01022323355634'),
(2, 4, 'hema@yahoo.com', 4, '01022323355634');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `description` varchar(100) NOT NULL,
  `date` varchar(30) NOT NULL,
  `seen` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `customer_id`, `description`, `date`, `seen`) VALUES
(1, 1, 'system not work good', '29/4/2017', 0);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `order_id`, `customer_id`) VALUES
(1, 1, 1),
(2, 2, 1);

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

--
-- Dumping data for table `notification`
--

INSERT INTO `notification` (`id`, `offer_id`, `customer_id`, `date`) VALUES
(1, 2, 1, '29/4/2017'),
(2, 1, 1, '29/4/2017');

-- --------------------------------------------------------

--
-- Table structure for table `offer`
--

CREATE TABLE `offer` (
  `id` int(11) NOT NULL,
  `person_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `discount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `offer`
--

INSERT INTO `offer` (`id`, `person_id`, `product_id`, `discount`) VALUES
(1, 3, 2, 10),
(2, 3, 1, 15);

-- --------------------------------------------------------

--
-- Table structure for table `order_1`
--

CREATE TABLE `order_1` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `date` varchar(30) NOT NULL,
  `paymentMethod_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_1`
--

INSERT INTO `order_1` (`id`, `customer_id`, `date`, `paymentMethod_id`) VALUES
(1, 1, '29/4/2017', 1),
(2, 1, '29/4/2017', 1);

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

--
-- Dumping data for table `payment_selected_option_value`
--

INSERT INTO `payment_selected_option_value` (`id`, `order_id`, `paymentSelectedOption_id`, `value`) VALUES
(1, 1, 1, '12123342453453453534'),
(2, 1, 2, 'Egypt');

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
  `type_id` int(11) NOT NULL,
  `registerationDate` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `firstName`, `lastName`, `username`, `password`, `type_id`, `registerationDate`) VALUES
(1, 'ahmed', 'adel', 'hamada', '123321', 1, '29/4/2017'),
(2, 'mohamed', 'sleem', 'sleem95', '321123', 2, '25/3/2017'),
(3, 'mostafa', 'wael', 'mostafa_123', '123456789', 3, '30/4/2017'),
(4, 'ibrahim', 'shrif', 'hema_0', '123123123', 1, '30/4/2017');

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
  `cateogry_id` int(11) NOT NULL,
  `unitPrice` float NOT NULL,
  `currency_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `description`, `cateogry_id`, `unitPrice`, `currency_id`, `quantity`) VALUES
(1, 'adidas', '\r\nt-shirt with all sizes \r\nfor winter ', 2, 122.99, 1, 60),
(2, 'nike', 'classic shoes for parties   ', 1, 349.99, 2, 38);

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
-- Table structure for table `states`
--
-- in use(#1146 - Table 'shopingdb.states' doesn't exist)
-- Error reading data: (#1146 - Table 'shopingdb.states' doesn't exist)

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
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cart_customer` (`customer_id`);

--
-- Indexes for table `cart_item`
--
ALTER TABLE `cart_item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cart_item__cart` (`cart_id`),
  ADD KEY `cart_item__product` (`product_id`);

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
  ADD UNIQUE KEY `person_id` (`person_id`),
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
  ADD KEY `invoice__order_1` (`order_id`);

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
  ADD PRIMARY KEY (`id`),
  ADD KEY `offer_person` (`person_id`),
  ADD KEY `offer_product` (`product_id`);

--
-- Indexes for table `order_1`
--
ALTER TABLE `order_1`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_1__customer` (`customer_id`),
  ADD KEY `order_1__payment_method` (`paymentMethod_id`);

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
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cart_item`
--
ALTER TABLE `cart_item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cateogry`
--
ALTER TABLE `cateogry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `currency`
--
ALTER TABLE `currency`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `notification`
--
ALTER TABLE `notification`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `offer`
--
ALTER TABLE `offer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `order_1`
--
ALTER TABLE `order_1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `privilege`
--
ALTER TABLE `privilege`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
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
-- Constraints for table `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cart_item`
--
ALTER TABLE `cart_item`
  ADD CONSTRAINT `cart_item__cart` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
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
  ADD CONSTRAINT `customer_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `customer_person` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice__order_1` FOREIGN KEY (`order_id`) REFERENCES `order_1` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `invoice_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `notification`
--
ALTER TABLE `notification`
  ADD CONSTRAINT `notification__offer` FOREIGN KEY (`offer_id`) REFERENCES `offer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `notification_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `offer`
--
ALTER TABLE `offer`
  ADD CONSTRAINT `offer_person` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `offer_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `order_1`
--
ALTER TABLE `order_1`
  ADD CONSTRAINT `order_1__customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `order_1__payment_method` FOREIGN KEY (`paymentMethod_id`) REFERENCES `payment_method` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
-- Constraints for table `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `person_type` FOREIGN KEY (`type_id`) REFERENCES `type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
