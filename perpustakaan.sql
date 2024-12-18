-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2024 at 03:37 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `idAnggota` int(11) NOT NULL,
  `statusAnggota` varchar(5) DEFAULT NULL,
  `nomorIdentifikasiPengguna` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`idAnggota`, `statusAnggota`, `nomorIdentifikasiPengguna`) VALUES
(11, 'Aktif', 8),
(12, 'Aktif', 9),
(13, 'Aktif', 10);

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `idBuku` int(11) NOT NULL,
  `judulBuku` varchar(200) NOT NULL,
  `penulisBuku` varchar(100) DEFAULT NULL,
  `genreBuku` varchar(50) DEFAULT NULL,
  `bahasaBuku` varchar(50) DEFAULT NULL,
  `jumlahBuku` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idBuku`, `judulBuku`, `penulisBuku`, `genreBuku`, `bahasaBuku`, `jumlahBuku`) VALUES
(19, 'Elden Ring', 'Miyazaki', 'Fiksi', 'Inggris', 21),
(20, 'Kalkulus', 'Tesla', 'Non-Fiksi', 'Indonesia', 11),
(21, 'Your Name', 'Shinkai', 'Fiksi', 'Jepang', 135),
(22, 'Statistika', 'Orang Pintar', 'Non-Fiksi', 'Indonesia', 13);

-- --------------------------------------------------------

--
-- Table structure for table `bukufiksi`
--

CREATE TABLE `bukufiksi` (
  `idBuku` int(11) NOT NULL,
  `subGenreBuku` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bukufiksi`
--

INSERT INTO `bukufiksi` (`idBuku`, `subGenreBuku`) VALUES
(19, 'Horror'),
(21, 'Romance');

-- --------------------------------------------------------

--
-- Table structure for table `bukunonfiksi`
--

CREATE TABLE `bukunonfiksi` (
  `idBuku` int(11) NOT NULL,
  `topikBuku` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bukunonfiksi`
--

INSERT INTO `bukunonfiksi` (`idBuku`, `topikBuku`) VALUES
(20, 'Matematika'),
(22, 'Matematika');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `nomorIdentifikasiPengguna` int(11) NOT NULL,
  `namaPengguna` varchar(100) NOT NULL,
  `kontakPengguna` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`nomorIdentifikasiPengguna`, `namaPengguna`, `kontakPengguna`) VALUES
(1, 'admin', ''),
(8, 'Admin', '1'),
(9, 'Alta', '301'),
(10, 'Tebe', '103');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `idPetugas` int(11) NOT NULL,
  `passwordPetugas` varchar(100) NOT NULL,
  `nomorIdentifikasiPengguna` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`idPetugas`, `passwordPetugas`, `nomorIdentifikasiPengguna`) VALUES
(1, 'admin', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pinjambuku`
--

CREATE TABLE `pinjambuku` (
  `idPeminjamanBuku` int(11) NOT NULL,
  `idAnggota` int(11) DEFAULT NULL,
  `idPetugas` int(11) DEFAULT NULL,
  `idBuku` int(11) DEFAULT NULL,
  `tanggalPeminjamanBuku` date NOT NULL,
  `tenggatTanggalPengembalianBuku` date NOT NULL,
  `tanggalPengembalianBuku` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pinjambuku`
--

INSERT INTO `pinjambuku` (`idPeminjamanBuku`, `idAnggota`, `idPetugas`, `idBuku`, `tanggalPeminjamanBuku`, `tenggatTanggalPengembalianBuku`, `tanggalPengembalianBuku`) VALUES
(9, 11, 1, 19, '2024-12-18', '2024-12-25', NULL),
(10, 12, 1, 21, '2024-12-18', '2024-12-25', NULL),
(11, 11, 1, 20, '2024-12-18', '2024-12-25', '2024-12-25'),
(12, 13, 1, 22, '2024-12-18', '2024-12-25', '2024-12-31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`idAnggota`),
  ADD UNIQUE KEY `nomorIdentifikasiPengguna` (`nomorIdentifikasiPengguna`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idBuku`);

--
-- Indexes for table `bukufiksi`
--
ALTER TABLE `bukufiksi`
  ADD PRIMARY KEY (`idBuku`);

--
-- Indexes for table `bukunonfiksi`
--
ALTER TABLE `bukunonfiksi`
  ADD PRIMARY KEY (`idBuku`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`nomorIdentifikasiPengguna`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`idPetugas`),
  ADD UNIQUE KEY `nomorIdentifikasiPengguna` (`nomorIdentifikasiPengguna`);

--
-- Indexes for table `pinjambuku`
--
ALTER TABLE `pinjambuku`
  ADD PRIMARY KEY (`idPeminjamanBuku`),
  ADD KEY `idAnggota` (`idAnggota`),
  ADD KEY `idPetugas` (`idPetugas`),
  ADD KEY `idBuku` (`idBuku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `idAnggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `idBuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `pengguna`
--
ALTER TABLE `pengguna`
  MODIFY `nomorIdentifikasiPengguna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `idPetugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pinjambuku`
--
ALTER TABLE `pinjambuku`
  MODIFY `idPeminjamanBuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `anggota`
--
ALTER TABLE `anggota`
  ADD CONSTRAINT `anggota_ibfk_1` FOREIGN KEY (`nomorIdentifikasiPengguna`) REFERENCES `pengguna` (`nomorIdentifikasiPengguna`);

--
-- Constraints for table `bukufiksi`
--
ALTER TABLE `bukufiksi`
  ADD CONSTRAINT `bukufiksi_ibfk_1` FOREIGN KEY (`idBuku`) REFERENCES `buku` (`idBuku`);

--
-- Constraints for table `bukunonfiksi`
--
ALTER TABLE `bukunonfiksi`
  ADD CONSTRAINT `bukunonfiksi_ibfk_1` FOREIGN KEY (`idBuku`) REFERENCES `buku` (`idBuku`);

--
-- Constraints for table `petugas`
--
ALTER TABLE `petugas`
  ADD CONSTRAINT `petugas_ibfk_1` FOREIGN KEY (`nomorIdentifikasiPengguna`) REFERENCES `pengguna` (`nomorIdentifikasiPengguna`);

--
-- Constraints for table `pinjambuku`
--
ALTER TABLE `pinjambuku`
  ADD CONSTRAINT `pinjambuku_ibfk_1` FOREIGN KEY (`idAnggota`) REFERENCES `anggota` (`idAnggota`),
  ADD CONSTRAINT `pinjambuku_ibfk_2` FOREIGN KEY (`idPetugas`) REFERENCES `petugas` (`idPetugas`),
  ADD CONSTRAINT `pinjambuku_ibfk_3` FOREIGN KEY (`idBuku`) REFERENCES `buku` (`idBuku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
