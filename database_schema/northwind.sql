CREATE SCHEMA IF NOT EXISTS `training2022` DEFAULT CHARACTER SET latin1 ;
USE `training2022` ;
CREATE TABLE `training2022`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `brand` VARCHAR(45) NULL,
  `madein` VARCHAR(45) NULL,
  `price` FLOAT NULL,
  PRIMARY KEY (`id`));
INSERT INTO `training2022`.`product` (`name`, `brand`, `madein`, `price`) VALUES ('pc', 'mac', 'fr', '1000');
