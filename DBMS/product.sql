CREATE TABLE `product`.`product` ( `pdtid` INT NOT NULL , `pname` VARCHAR(150) NOT NULL , `price` DOUBLE NOT NULL , `qty` INT NOT NULL , PRIMARY KEY (`pdtid`)) ENGINE = InnoDB;

CREATE TABLE `product`.`sales` ( `saleid` INT NOT NULL AUTO_INCREMENT , `delivery_address` TEXT NOT NULL , PRIMARY KEY (`saleid`)) ENGINE = InnoDB; 

CREATE TABLE `product`.`saleitems` ( `saleid` INT NOT NULL , `pdtid` INT NOT NULL , `qty` INT NOT NULL , PRIMARY KEY (`saleid`, `pdtid`)) ENGINE = InnoDB; 

CREATE TRIGGER updateAvailableQuantity
AFTER INSERT
ON saleitems
FOR EACH ROW
UPDATE product SET product.qty=product.qty-new.qty 
WHERE product.pdtid=new.pdtid;
