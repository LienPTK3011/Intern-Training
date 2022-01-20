-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 20, 2022 lúc 02:06 PM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `demosp`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `login`
--

INSERT INTO `login` (`id`, `password`, `username`) VALUES
(1, '12345', 'linhtn');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `id` int(11) NOT NULL,
  `roomcode` varchar(200) NOT NULL,
  `priceperhour` double NOT NULL,
  `note` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`id`, `roomcode`, `priceperhour`, `note`) VALUES
(1, '', 200000, ''),
(5, '', 0, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roombooking`
--

CREATE TABLE `roombooking` (
  `id` int(11) NOT NULL,
  `day` date NOT NULL,
  `starttime` time NOT NULL,
  `endtime` time NOT NULL,
  `roomid` int(11) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `seat`
--

CREATE TABLE `seat` (
  `id` int(11) NOT NULL,
  `seatcode` varchar(200) NOT NULL,
  `priceperhour` double NOT NULL,
  `note` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `seat`
--

INSERT INTO `seat` (`id`, `seatcode`, `priceperhour`, `note`) VALUES
(3, '2', 0, ''),
(4, '2', 0, '1234324'),
(5, '', 0, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `seatbooking`
--

CREATE TABLE `seatbooking` (
  `id` int(11) NOT NULL,
  `day` date NOT NULL,
  `starttime` time NOT NULL,
  `endtime` time NOT NULL,
  `seatid` int(11) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `roombooking`
--
ALTER TABLE `roombooking`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `seat`
--
ALTER TABLE `seat`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `room`
--
ALTER TABLE `room`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `roombooking`
--
ALTER TABLE `roombooking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `seat`
--
ALTER TABLE `seat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
