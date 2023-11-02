-- Create Database
CREATE SCHEMA `libraries` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

-- DELETE DATABASE
DROP DATABASE `libraries`;

-- Set
use libraries;

-- Table
CREATE TABLE `libraries`.`register` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nick_name` VARCHAR(255) NULL DEFAULT 'takma adınıız yazmadınız.',
  `email_address` VARCHAR(255) NULL DEFAULT 'email adres yazmadınız',
  `password` VARCHAR(45) NULL DEFAULT 'şifrenizi girmediniz',
  `roles` VARCHAR(5) NULL DEFAULT 'user',
  `remaining_number` INT(2) NULL DEFAULT '4',
  `is_passive` VARCHAR(2) NULL DEFAULT '0',
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;

-- tabloyayeni kolon eklemek
ALTER TABLE `libraries`.`register` 
ADD COLUMN `sytem_created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP AFTER `is_passive`;

-- DELETE TABLE
DROP TABLE `libraries`.`register`;

-- TRUNCATE Table
TRUNCATE `libraries`.`register`;

-- INSERT
INSERT INTO `libraries`.`register` (`nick_name`, `email_address`, `password`, `roles`, `remaining_number`, `is_passive`) VALUES ('computer', 'hamitmizrak@gmail.com', '123456','user','5','0');

-- FIND
SELECT * FROM libraries.register where id=1;

-- UPDATE
UPDATE `libraries`.`register` SET `nick_name`="nick", `email_address`="email@gmail.com", `password`="123456", `roles`="user", `remaining_number`=5, `is_passive`=0 WHERE (`id` = '1');

UPDATE `libraries`.`register` SET  `remaining_number`=5 WHERE `email_address` = 'email@gmail.com';

-- DELETE
DELETE FROM `libraries`.`register` WHERE (`id` = '1');

-- SELECT
SELECT * FROM libraries.register;
SELECT * FROM libraries.register where email_address="hamitmizrak";
select count(*) from `libraries`.`register`;

-- LIKE --
select * from `libraries`.`register`;
select * from `libraries`.`register` where id=2;
select * from `libraries`.`register` where nick_name like 'c%'; -- c harfiyle başladı
select * from `libraries`.`register` where nick_name like 'b%' or email_address like 'da%';
select * from `libraries`.`register` where nick_name like '%4'; -- 4 ile bitti
select * from `libraries`.`register` where nick_name like '_o%'; -- ikinci karakter o olanlar
