INSERT INTO `customers` (`id_customer`, `address`, `date_of_birth`, `document_number`, `document_type`, `gender`, `id_person`, `name`, `phone_number`, `customer_status`, `password`) VALUES ('9a0d1902-bf57-4075-b535-f2e7754eb741', 'Otavalo sn y principal', '1985-12-31', '915423233322', '0', '0', '504889ac-1a93-4d9e-9a40-e7dcd5f9b339', 'Jose Lema', '098254785', '1', '1234');
INSERT INTO `customers` (`id_customer`, `address`, `date_of_birth`, `document_number`, `document_type`, `gender`, `id_person`, `name`, `phone_number`, `customer_status`, `password`) VALUES ('1b7ad055-e7d9-4988-9b87-8ea8baa65a10', 'Amazonas y NNUU', '1980-02-28', '109834324234', '1', '1', '53a05009-88e5-4fd8-b97d-fb260702c623', 'Marianela Montalvo', '097548965', '1', '5678');
INSERT INTO `customers` (`id_customer`, `address`, `date_of_birth`, `document_number`, `document_type`, `gender`, `id_person`, `name`, `phone_number`, `customer_status`, `password`) VALUES ('4e7f91a4-2103-4429-aa51-905904e2e569', '13 junio y Equinoccial', '1982-10-28', '918343242345', '0', '1', 'a345976c-c3e1-4f78-a07b-62b551c8fd9d', 'Juan Osorio', '098874587', '1', '1234');

INSERT INTO `bd_pichincha`.`accounts` (`id_account`, `account_number`, `account_status`, `account_type`, `balance`, `company`, `initial_balance`, `fk_customer`) VALUES ('03d35c2c-0757-43b6-abc5-84b1ddf05df1', '478758', '1', '0', '2000', '2', '2000', '9a0d1902-bf57-4075-b535-f2e7754eb741');
INSERT INTO `bd_pichincha`.`accounts` (`id_account`, `account_number`, `account_status`, `account_type`, `balance`, `company`, `initial_balance`, `fk_customer`) VALUES ('3be9cdab-0236-4620-a2b9-47e90301d386', '225487', '1', '1', '100', '3', '100', '1b7ad055-e7d9-4988-9b87-8ea8baa65a10');
INSERT INTO `bd_pichincha`.`accounts` (`id_account`, `account_number`, `account_status`, `account_type`, `balance`, `company`, `initial_balance`, `fk_customer`) VALUES ('bddcfb5a-ae14-4c65-ac4d-bd80c5d80d69', '495878', '1', '0', '0', '4', '0', '4e7f91a4-2103-4429-aa51-905904e2e569');
INSERT INTO `bd_pichincha`.`accounts` (`id_account`, `account_number`, `account_status`, `account_type`, `balance`, `company`, `initial_balance`, `fk_customer`) VALUES ('07d8972b-7eb1-42e6-81bf-0e6d1ac428d9', '496825', '1', '0', '540', '5', '540', '1b7ad055-e7d9-4988-9b87-8ea8baa65a10');
INSERT INTO `bd_pichincha`.`accounts` (`id_account`, `account_number`, `account_status`, `account_type`, `balance`, `company`, `initial_balance`, `fk_customer`) VALUES ('038b14d7-b4a7-41c5-bbe0-c1b950fb51f5', '585545', '1', '1', '1000', '6', '1000', '9a0d1902-bf57-4075-b535-f2e7754eb741');
