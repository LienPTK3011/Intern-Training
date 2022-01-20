create database booking_project;
CREATE TABLE `booking_project`.`seat_information` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `seat_code` VARCHAR(45) NULL,
  `price_per_hour` DOUBLE NULL,
  `note` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
CREATE TABLE `booking_project`.`conferenceroom_information` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `room_code` VARCHAR(45) NULL,
  `price_per_hour` DOUBLE NULL,
  `note` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
CREATE TABLE `booking_project`.`user` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`username`,`password`));
CREATE TABLE `booking_project`.`room_booking` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `room_code` VARCHAR(45) NULL,
  `day` DATE NULL,
  `start_time` TIME NULL,
  `end_time` TIME NULL,
  `price` DOUBLE NULL,
  PRIMARY KEY (`id`));
CREATE TABLE `booking_project`.`seat_booking` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `seat_code` VARCHAR(45) NULL,
  `day` DATE NULL,
  `start_time` TIME NULL,
  `end_time` TIME NULL,
  `price` DOUBLE NULL,
  PRIMARY KEY (`id`));


