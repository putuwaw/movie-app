DROP TABLE IF EXISTS `transaction_detail_film`;
DROP TABLE IF EXISTS `transaction_detail_snack`;
DROP TABLE IF EXISTS `transaction`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `film`;
DROP TABLE IF EXISTS `snack_detail`;
DROP TABLE IF EXISTS `snack`;
DROP TABLE IF EXISTS `studio_time`;
DROP TABLE IF EXISTS `studio`;

CREATE TABLE `studio` (
  `id_studio` varchar(10) PRIMARY KEY NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `studio` (`id_studio`, `name`) VALUES
('std1', 'Studio 1 MovieApp'),
('std2', 'Studio 2 MovieApp'),
('std3', 'Studio 3 MovieApp'),
('std4', 'Studio 4 MovieApp');

CREATE TABLE `film` (
  `id` varchar(20) PRIMARY KEY NOT NULL,
  `id_studio` varchar(20) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `plot` text DEFAULT NULL,
  `trailer` varchar(100) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `rating` decimal(2,1) DEFAULT NULL,
  CONSTRAINT `fk_id_studio` FOREIGN KEY (`id_studio`) REFERENCES `studio`(`id_studio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `film` (`id`, `id_studio`, `name`, `genre`, `status`, `plot`, `trailer`, `duration`, `price`, `rating`) VALUES
('tt0120363', 'std1', 'Toy Story 2', 'Animation, Adventure', 'Playing', 'Woody (Tom Hanks) dicuri dari rumahnya oleh penjual mainan Al McWhiggin (Wayne Knight), meninggalkan Buzz Lightyear (Tim Allen) dan anggota geng lainnya untuk mencoba menyelamatkannya. Tetapi ketika Woody menemukan bahwa dia sebenarnya adalah barang koleksi yang berharga dari acara televisi yang pernah populer yang disebut \"Woody\'s Roundup\" dan dipertemukan kembali dengan kudanya Bullseye, Jessie si cowgirl yodeling (Joan Cusack) dan sahabat karibnya yang setia, Stinky Pete the Prospector (Kelsey Grammer). ), dia tidak ingin pergi.', 'https://www.youtube.com/watch?v=xNWSGRD5CzU', 92, 45000, '7.9'),
('tt1216475', 'std3', 'Cars 2', 'Animation', 'Playing', 'Racecar Lightning McQueen (Owen Wilson) dan teman truk dereknya, Mater (Larry the Cable Guy), telah berbagi petualangan bersama, tetapi tidak seperti yang mereka alami saat pergi ke luar negeri untuk pertama kalinya World Grand Prix. Sementara Lightning mengincar jalan menuju kejuaraan, Mater mengambil jalan memutar ke spionase internasional ketika dia bertemu mata-mata master Inggris Finn McMissile (Michael Caine) dan mata-mata pelatihan yang menakjubkan Holley Shiftwell (Emily Mortimer).', 'https://www.youtube.com/watch?v=oFTfAdauCOo', 106, 50000, '6.2'),
('tt4520988', 'std2', 'Frozen 2', 'Animation', 'Playing', 'Elsa sang Ratu Salju memiliki bakat luar biasa -- kekuatan untuk menciptakan es dan salju. Tapi tidak peduli betapa bahagianya dia dikelilingi oleh orang-orang Arendelle, anehnya Elsa mendapati dirinya gelisah. Setelah mendengar suara misterius memanggilnya, Elsa melakukan perjalanan ke hutan ajaib dan lautan gelap di luar kerajaannya -- sebuah petualangan yang segera berubah menjadi perjalanan penemuan diri.', 'https://www.youtube.com/watch?v=Zi4LMpSDccc', 120, 40000, '6.8'),
('tt6467266', 'std4', 'Sing 2', 'Animation', 'Playing', 'Can-do koala Buster Moon dan para pemeran binatangnya yang terkenal bersiap untuk meluncurkan ekstravaganza panggung yang memesona di ibu kota hiburan dunia yang gemerlap. Hanya ada satu halangan -- dia harus menemukan dan membujuk bintang rock paling tertutup di dunia untuk bergabung dengan mereka. Apa yang dimulai sebagai impian sukses besar Buster segera menjadi pengingat emosional akan kekuatan musik untuk menyembuhkan bahkan hati yang paling hancur sekalipun.', 'https://www.youtube.com/watch?v=EPZu5MA2uqI', 110, 50000, '7.4');

CREATE TABLE `snack` (
  `id_snack` varchar(10) PRIMARY KEY NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `desc` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `snack` (`id_snack`, `name`, `desc`) VALUES
('snk01', 'Burger', 'Minuman Coca-Cola yang enak.'),
('snk02', 'French Fries', 'Minuman Pepsi yang enak.'),
('snk03', 'Popcorn', 'Makanan Popcorn yang enak.'),
('snk04', 'Coca-Cola', 'Makanan Burger yang enak.'),
('snk05', 'Milo', 'Makanan French Fries yang enak.');

CREATE TABLE `snack_detail` (
  `id_snack` varchar(10) NOT NULL,
  `size` varchar(5) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_snack`, `size`),
  CONSTRAINT `fk_id_snack` FOREIGN KEY (`id_snack`) REFERENCES `snack`(`id_snack`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `snack_detail` (`id_snack`, `size`, `price`, `stock`) VALUES
('snk01', 'L', 50000, 10),
('snk01', 'M', 45000, 10),
('snk01', 'S', 30000, 10),
('snk02', 'L', 20000, 10),
('snk02', 'M', 15000, 10),
('snk02', 'S', 10000, 10),
('snk03', 'L', 30000, 10),
('snk03', 'M', 20000, 10),
('snk03', 'S', 10000, 10),
('snk04', 'L', 30000, 10),
('snk04', 'M', 20000, 10),
('snk04', 'S', 10000, 10),
('snk05', 'L', 30000, 10),
('snk05', 'M', 20000, 10),
('snk05', 'S', 10000, 10);

CREATE TABLE `studio_time` (
  `studio_id` varchar(45) NOT NULL,
  `time` varchar(45) NOT NULL,
  `row` varchar(5) NOT NULL,
  `column` varchar(5) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`studio_id`, `time`, `row`, `column`),
  CONSTRAINT `fk_studio_id` FOREIGN KEY (`studio_id`) REFERENCES `studio`(`id_studio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `studio_time` (`studio_id`, `time`, `row`, `column`, `status`) VALUES
('std1', '12.00', 'A', '1', 'Available'),
('std1', '12.00', 'A', '2', 'Available'),
('std1', '12.00', 'A', '3', 'Available'),
('std1', '12.00', 'A', '4', 'Available'),
('std1', '12.00', 'B', '1', 'Available'),
('std1', '12.00', 'B', '2', 'Available'),
('std1', '12.00', 'B', '3', 'Available'),
('std1', '12.00', 'B', '4', 'Available'),
('std1', '12.00', 'C', '1', 'Available'),
('std1', '12.00', 'C', '2', 'Available'),
('std1', '12.00', 'C', '3', 'Available'),
('std1', '12.00', 'C', '4', 'Available'),
('std1', '12.00', 'D', '1', 'Available'),
('std1', '12.00', 'D', '2', 'Available'),
('std1', '12.00', 'D', '3', 'Available'),
('std1', '12.00', 'D', '4', 'Available'),
('std1', '14.00', 'A', '1', 'Available'),
('std1', '14.00', 'A', '2', 'Available'),
('std1', '14.00', 'A', '3', 'Available'),
('std1', '14.00', 'A', '4', 'Available'),
('std1', '14.00', 'B', '1', 'Available'),
('std1', '14.00', 'B', '2', 'Available'),
('std1', '14.00', 'B', '3', 'Available'),
('std1', '14.00', 'B', '4', 'Available'),
('std1', '14.00', 'C', '1', 'Available'),
('std1', '14.00', 'C', '2', 'Available'),
('std1', '14.00', 'C', '3', 'Available'),
('std1', '14.00', 'C', '4', 'Available'),
('std1', '14.00', 'D', '1', 'Available'),
('std1', '14.00', 'D', '2', 'Available'),
('std1', '14.00', 'D', '3', 'Available'),
('std1', '14.00', 'D', '4', 'Available'),
('std1', '16.00', 'A', '1', 'Available'),
('std1', '16.00', 'A', '2', 'Available'),
('std1', '16.00', 'A', '3', 'Available'),
('std1', '16.00', 'A', '4', 'Available'),
('std1', '16.00', 'B', '1', 'Available'),
('std1', '16.00', 'B', '2', 'Available'),
('std1', '16.00', 'B', '3', 'Available'),
('std1', '16.00', 'B', '4', 'Available'),
('std1', '16.00', 'C', '1', 'Available'),
('std1', '16.00', 'C', '2', 'Available'),
('std1', '16.00', 'C', '3', 'Available'),
('std1', '16.00', 'C', '4', 'Available'),
('std1', '16.00', 'D', '1', 'Available'),
('std1', '16.00', 'D', '2', 'Available'),
('std1', '16.00', 'D', '3', 'Available'),
('std1', '16.00', 'D', '4', 'Available'),
('std1', '20.00', 'A', '1', 'Available'),
('std1', '20.00', 'A', '2', 'Available'),
('std1', '20.00', 'A', '3', 'Available'),
('std1', '20.00', 'A', '4', 'Available'),
('std1', '20.00', 'B', '1', 'Available'),
('std1', '20.00', 'B', '2', 'Available'),
('std1', '20.00', 'B', '3', 'Available'),
('std1', '20.00', 'B', '4', 'Available'),
('std1', '20.00', 'C', '1', 'Available'),
('std1', '20.00', 'C', '2', 'Available'),
('std1', '20.00', 'C', '3', 'Available'),
('std1', '20.00', 'C', '4', 'Available'),
('std1', '20.00', 'D', '1', 'Available'),
('std1', '20.00', 'D', '2', 'Available'),
('std1', '20.00', 'D', '3', 'Available'),
('std1', '20.00', 'D', '4', 'Available'),
('std2', '12.00', 'A', '1', 'Available'),
('std2', '12.00', 'A', '2', 'Available'),
('std2', '12.00', 'A', '3', 'Available'),
('std2', '12.00', 'A', '4', 'Available'),
('std2', '12.00', 'B', '1', 'Available'),
('std2', '12.00', 'B', '2', 'Available'),
('std2', '12.00', 'B', '3', 'Available'),
('std2', '12.00', 'B', '4', 'Available'),
('std2', '12.00', 'C', '1', 'Available'),
('std2', '12.00', 'C', '2', 'Available'),
('std2', '12.00', 'C', '3', 'Available'),
('std2', '12.00', 'C', '4', 'Available'),
('std2', '12.00', 'D', '1', 'Available'),
('std2', '12.00', 'D', '2', 'Available'),
('std2', '12.00', 'D', '3', 'Available'),
('std2', '12.00', 'D', '4', 'Available'),
('std2', '14.00', 'A', '1', 'Available'),
('std2', '14.00', 'A', '2', 'Available'),
('std2', '14.00', 'A', '3', 'Available'),
('std2', '14.00', 'A', '4', 'Available'),
('std2', '14.00', 'B', '1', 'Available'),
('std2', '14.00', 'B', '2', 'Available'),
('std2', '14.00', 'B', '3', 'Available'),
('std2', '14.00', 'B', '4', 'Available'),
('std2', '14.00', 'C', '1', 'Available'),
('std2', '14.00', 'C', '2', 'Available'),
('std2', '14.00', 'C', '3', 'Available'),
('std2', '14.00', 'C', '4', 'Available'),
('std2', '14.00', 'D', '1', 'Available'),
('std2', '14.00', 'D', '2', 'Available'),
('std2', '14.00', 'D', '3', 'Available'),
('std2', '14.00', 'D', '4', 'Available'),
('std2', '16.00', 'A', '1', 'Available'),
('std2', '16.00', 'A', '2', 'Available'),
('std2', '16.00', 'A', '3', 'Available'),
('std2', '16.00', 'A', '4', 'Available'),
('std2', '16.00', 'B', '1', 'Available'),
('std2', '16.00', 'B', '2', 'Available'),
('std2', '16.00', 'B', '3', 'Available'),
('std2', '16.00', 'B', '4', 'Available'),
('std2', '16.00', 'C', '1', 'Available'),
('std2', '16.00', 'C', '2', 'Available'),
('std2', '16.00', 'C', '3', 'Available'),
('std2', '16.00', 'C', '4', 'Available'),
('std2', '16.00', 'D', '1', 'Available'),
('std2', '16.00', 'D', '2', 'Available'),
('std2', '16.00', 'D', '3', 'Available'),
('std2', '16.00', 'D', '4', 'Available'),
('std2', '18.00', 'A', '1', 'Available'),
('std2', '18.00', 'A', '2', 'Available'),
('std2', '18.00', 'A', '3', 'Available'),
('std2', '18.00', 'A', '4', 'Available'),
('std2', '18.00', 'B', '1', 'Available'),
('std2', '18.00', 'B', '2', 'Available'),
('std2', '18.00', 'B', '3', 'Available'),
('std2', '18.00', 'B', '4', 'Available'),
('std2', '18.00', 'C', '1', 'Available'),
('std2', '18.00', 'C', '2', 'Available'),
('std2', '18.00', 'C', '3', 'Available'),
('std2', '18.00', 'C', '4', 'Available'),
('std2', '18.00', 'D', '1', 'Available'),
('std2', '18.00', 'D', '2', 'Available'),
('std2', '18.00', 'D', '3', 'Available'),
('std2', '18.00', 'D', '4', 'Available'),
('std3', '12.00', 'A', '1', 'Available'),
('std3', '12.00', 'A', '2', 'Available'),
('std3', '12.00', 'A', '3', 'Available'),
('std3', '12.00', 'A', '4', 'Available'),
('std3', '12.00', 'B', '1', 'Available'),
('std3', '12.00', 'B', '2', 'Available'),
('std3', '12.00', 'B', '3', 'Available'),
('std3', '12.00', 'B', '4', 'Available'),
('std3', '12.00', 'C', '1', 'Available'),
('std3', '12.00', 'C', '2', 'Available'),
('std3', '12.00', 'C', '3', 'Available'),
('std3', '12.00', 'C', '4', 'Available'),
('std3', '12.00', 'D', '1', 'Available'),
('std3', '12.00', 'D', '2', 'Available'),
('std3', '12.00', 'D', '3', 'Available'),
('std3', '12.00', 'D', '4', 'Available'),
('std3', '14.00', 'A', '1', 'Available'),
('std3', '14.00', 'A', '2', 'Available'),
('std3', '14.00', 'A', '3', 'Available'),
('std3', '14.00', 'A', '4', 'Available'),
('std3', '14.00', 'B', '1', 'Available'),
('std3', '14.00', 'B', '2', 'Available'),
('std3', '14.00', 'B', '3', 'Available'),
('std3', '14.00', 'B', '4', 'Available'),
('std3', '14.00', 'C', '1', 'Available'),
('std3', '14.00', 'C', '2', 'Available'),
('std3', '14.00', 'C', '3', 'Available'),
('std3', '14.00', 'C', '4', 'Available'),
('std3', '14.00', 'D', '1', 'Available'),
('std3', '14.00', 'D', '2', 'Available'),
('std3', '14.00', 'D', '3', 'Available'),
('std3', '14.00', 'D', '4', 'Available'),
('std3', '16.00', 'A', '1', 'Available'),
('std3', '16.00', 'A', '2', 'Available'),
('std3', '16.00', 'A', '3', 'Available'),
('std3', '16.00', 'A', '4', 'Available'),
('std3', '16.00', 'B', '1', 'Available'),
('std3', '16.00', 'B', '2', 'Available'),
('std3', '16.00', 'B', '3', 'Available'),
('std3', '16.00', 'B', '4', 'Available'),
('std3', '16.00', 'C', '1', 'Available'),
('std3', '16.00', 'C', '2', 'Available'),
('std3', '16.00', 'C', '3', 'Available'),
('std3', '16.00', 'C', '4', 'Available'),
('std3', '16.00', 'D', '1', 'Available'),
('std3', '16.00', 'D', '2', 'Available'),
('std3', '16.00', 'D', '3', 'Available'),
('std3', '16.00', 'D', '4', 'Available'),
('std3', '18.00', 'A', '1', 'Available'),
('std3', '18.00', 'A', '2', 'Available'),
('std3', '18.00', 'A', '3', 'Available'),
('std3', '18.00', 'A', '4', 'Available'),
('std3', '18.00', 'B', '1', 'Available'),
('std3', '18.00', 'B', '2', 'Available'),
('std3', '18.00', 'B', '3', 'Available'),
('std3', '18.00', 'B', '4', 'Available'),
('std3', '18.00', 'C', '1', 'Available'),
('std3', '18.00', 'C', '2', 'Available'),
('std3', '18.00', 'C', '3', 'Available'),
('std3', '18.00', 'C', '4', 'Available'),
('std3', '18.00', 'D', '1', 'Available'),
('std3', '18.00', 'D', '2', 'Available'),
('std3', '18.00', 'D', '3', 'Available'),
('std3', '18.00', 'D', '4', 'Available'),
('std4', '12.00', 'A', '1', 'Available'),
('std4', '12.00', 'A', '2', 'Available'),
('std4', '12.00', 'A', '3', 'Available'),
('std4', '12.00', 'A', '4', 'Available'),
('std4', '12.00', 'B', '1', 'Available'),
('std4', '12.00', 'B', '2', 'Available'),
('std4', '12.00', 'B', '3', 'Available'),
('std4', '12.00', 'B', '4', 'Available'),
('std4', '12.00', 'C', '1', 'Available'),
('std4', '12.00', 'C', '2', 'Available'),
('std4', '12.00', 'C', '3', 'Available'),
('std4', '12.00', 'C', '4', 'Available'),
('std4', '12.00', 'D', '1', 'Available'),
('std4', '12.00', 'D', '2', 'Available'),
('std4', '12.00', 'D', '3', 'Available'),
('std4', '12.00', 'D', '4', 'Available'),
('std4', '14.00', 'A', '1', 'Available'),
('std4', '14.00', 'A', '2', 'Available'),
('std4', '14.00', 'A', '3', 'Available'),
('std4', '14.00', 'A', '4', 'Available'),
('std4', '14.00', 'B', '1', 'Available'),
('std4', '14.00', 'B', '2', 'Available'),
('std4', '14.00', 'B', '3', 'Available'),
('std4', '14.00', 'B', '4', 'Available'),
('std4', '14.00', 'C', '1', 'Available'),
('std4', '14.00', 'C', '2', 'Available'),
('std4', '14.00', 'C', '3', 'Available'),
('std4', '14.00', 'C', '4', 'Available'),
('std4', '14.00', 'D', '1', 'Available'),
('std4', '14.00', 'D', '2', 'Available'),
('std4', '14.00', 'D', '3', 'Available'),
('std4', '14.00', 'D', '4', 'Available'),
('std4', '16.00', 'A', '1', 'Available'),
('std4', '16.00', 'A', '2', 'Available'),
('std4', '16.00', 'A', '3', 'Available'),
('std4', '16.00', 'A', '4', 'Available'),
('std4', '16.00', 'B', '1', 'Available'),
('std4', '16.00', 'B', '2', 'Available'),
('std4', '16.00', 'B', '3', 'Available'),
('std4', '16.00', 'B', '4', 'Available'),
('std4', '16.00', 'C', '1', 'Available'),
('std4', '16.00', 'C', '2', 'Available'),
('std4', '16.00', 'C', '3', 'Available'),
('std4', '16.00', 'C', '4', 'Available'),
('std4', '16.00', 'D', '1', 'Available'),
('std4', '16.00', 'D', '2', 'Available'),
('std4', '16.00', 'D', '3', 'Available'),
('std4', '16.00', 'D', '4', 'Available'),
('std4', '18.00', 'A', '1', 'Available'),
('std4', '18.00', 'A', '2', 'Available'),
('std4', '18.00', 'A', '3', 'Available'),
('std4', '18.00', 'A', '4', 'Available'),
('std4', '18.00', 'B', '1', 'Available'),
('std4', '18.00', 'B', '2', 'Available'),
('std4', '18.00', 'B', '3', 'Available'),
('std4', '18.00', 'B', '4', 'Available'),
('std4', '18.00', 'C', '1', 'Available'),
('std4', '18.00', 'C', '2', 'Available'),
('std4', '18.00', 'C', '3', 'Available'),
('std4', '18.00', 'C', '4', 'Available'),
('std4', '18.00', 'D', '1', 'Available'),
('std4', '18.00', 'D', '2', 'Available'),
('std4', '18.00', 'D', '3', 'Available'),
('std4', '18.00', 'D', '4', 'Available');

CREATE TABLE `user` (
  `id_user` int(11) PRIMARY KEY NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `access_level` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `user` (`id_user`, `username`, `password`, `access_level`) VALUES
(1, 'admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', 1);

CREATE TABLE `transaction` (
  `id_transaction` varchar(50) PRIMARY KEY NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_film` varchar(20) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp(),
  `total` int(10) NOT NULL,
  CONSTRAINT `fk_id_film_t` FOREIGN KEY (`id_film`) REFERENCES `film`(`id`),
  CONSTRAINT `fk_id_user_t` FOREIGN KEY (`id_user`) REFERENCES `user`(`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `transaction_detail_film` (
  `id_transaction` varchar(50) NOT NULL,
  `id_film` varchar(20) NOT NULL,
  `seat` varchar(100) NOT NULL,
  `studio_time` varchar(10) NOT NULL,
  `price` int(10) NOT NULL,
  `count` int(10) NOT NULL,
  `total` int(10) NOT NULL,
  PRIMARY KEY (`id_transaction`, `id_film`),
  CONSTRAINT `fk_id_transaction_df` FOREIGN KEY (`id_transaction`) REFERENCES `transaction`(`id_transaction`),
  CONSTRAINT `fk_id_film_df` FOREIGN KEY (`id_film`) REFERENCES `film`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `transaction_detail_snack` (
  `id_transaction` varchar(50) NOT NULL,
  `id_snack` varchar(10) NOT NULL,
  `size` varchar(10) NOT NULL,
  `count` int(10) NOT NULL,
  `price` int(10) NOT NULL,
  `total` int(10) NOT NULL,
  PRIMARY KEY (`id_transaction`, `id_snack`, `size`),
  CONSTRAINT `fk_id_transaction_ds` FOREIGN KEY (`id_transaction`) REFERENCES `transaction`(`id_transaction`),
  CONSTRAINT `fk_id_snack_ds` FOREIGN KEY (`id_snack`) REFERENCES `snack`(`id_snack`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
