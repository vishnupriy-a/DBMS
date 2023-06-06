CREATE TABLE `company`.`jobs` ( `job_id` INT NOT NULL , `job_title` VARCHAR(100) NOT NULL , `min_salary` FLOAT NOT NULL , `max_salary` FLOAT NOT NULL , PRIMARY KEY (`job_id`)) ENGINE = InnoDB;


CREATE TABLE `company`.`employees` ( `employee_id` INT NOT NULL , `first_name` VARCHAR(100) NOT NULL , `last_name` VARCHAR(100) NOT NULL , `email` VARCHAR(100) NOT NULL , `phone_number` BIGINT NOT NULL , `hire_date` DATE NOT NULL , `job_id` INT NOT NULL , `salary` FLOAT NOT NULL , `manager_id` INT NOT NULL , `department_id` INT NOT NULL , PRIMARY KEY (`employee_id`)) ENGINE = InnoDB;

CREATE TABLE `company`.`dependents` ( `dependent_id` INT NOT NULL , `first_name` VARCHAR(100) NOT NULL , `last_name` VARCHAR(100) NOT NULL , `relationship` VARCHAR(50) NOT NULL , `employee_id` INT NOT NULL , PRIMARY KEY (`dependent_id`)) ENGINE = InnoDB; 

CREATE TABLE `company`.`departments` ( `department_id` INT NOT NULL , `department_name` VARCHAR(150) NOT NULL , `location_id` INT NOT NULL , PRIMARY KEY (`department_id`)) ENGINE = InnoDB; 

CREATE TABLE `company`.`locations` ( `location_id` INT NOT NULL , `street_address` TEXT NOT NULL , `postal_code` VARCHAR(50) NOT NULL , `city` VARCHAR(100) NOT NULL , `state_province` VARCHAR(100) NOT NULL , `country_id` INT NOT NULL , PRIMARY KEY (`location_id`)) ENGINE = InnoDB; 

CREATE TABLE `company`.`countries` ( `country_id` INT NOT NULL , `country_name` VARCHAR(150) NOT NULL , `region_id` INT NOT NULL , PRIMARY KEY (`country_id`)) ENGINE = InnoDB; 

CREATE TABLE `company`.`regions` ( `region_id` INT NOT NULL , `region_name` TEXT NOT NULL , PRIMARY KEY (`region_id`)) ENGINE = InnoDB; 

ALTER TABLE `dependents` ADD FOREIGN KEY (`employee_id`) REFERENCES `employees`(`employee_id`) ;

ALTER TABLE `departments` ADD FOREIGN KEY (`location_id`) REFERENCES `locations`(`location_id`) ;

ALTER TABLE `locations` ADD FOREIGN KEY (`country_id`) REFERENCES `countries`(`country_id`) ;

ALTER TABLE `countries` ADD FOREIGN KEY (`region_id`) REFERENCES `regions`(`region_id`) ;

ALTER TABLE `employees` ADD FOREIGN KEY (`department_id`) REFERENCES `departments`(`department_id`) ;
