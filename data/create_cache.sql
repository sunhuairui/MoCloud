-- ------------------------------------------------------------
-- Create table [Cache.System.Session]
-- ------------------------------------------------------------
DROP TABLE IF EXISTS `CC_SYS_SESSION`;
CREATE TABLE `CC_SYS_SESSION` 
( 
   `OUID`                          BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
   `OVLD`                          TINYINT NOT NULL DEFAULT TRUE, 
   `GUID`                          VARCHAR(40) NOT NULL, 
   `USER_ID`                       BIGINT NOT NULL, 
   `CREATE_USER_ID`                BIGINT, 
   `CREATE_DATE`                   DATETIME, 
   `UPDATE_USER_ID`                BIGINT, 
   `UPDATE_DATE`                   DATETIME 
) ENGINE=HEAP DEFAULT CHARSET=utf8; 

ALTER TABLE CC_SYS_SESSION 
   ADD CONSTRAINT CC_SYS_SES_UK_GID UNIQUE ( GUID ); 
