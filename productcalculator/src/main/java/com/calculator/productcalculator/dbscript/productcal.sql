/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.21-log : Database - productcalculator
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`productcalculator` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `productcalculator`;

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(15) DEFAULT NULL,
  `CartonUnits` int(11) DEFAULT '0',
  `CartonPrice` double DEFAULT '0',
  `UnitPrice` double DEFAULT '0',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `products` */

insert  into `products`(`Id`,`ProductName`,`CartonUnits`,`CartonPrice`,`UnitPrice`) values (1,'Penguin-ears',20,175,11.37),(2,'Horseshoe',5,825,214.5);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
