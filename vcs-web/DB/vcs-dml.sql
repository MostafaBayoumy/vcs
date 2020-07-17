-- -----------------------------------------------------
-- Table `vcsdb`.`GENDER_IDENTITY_LU`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`GENDER_IDENTITY_LU` VALUES(1, 'MALE', 'Male');
INSERT INTO `vcsdb`.`GENDER_IDENTITY_LU` VALUES(2, 'FEMALE', 'Female');


-- -----------------------------------------------------
-- Table `vcsdb`.`ANIMAL_KIND_LU`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`ANIMAL_KIND_LU` VALUES(1, 'FISH', 'FISH');
INSERT INTO `vcsdb`.`ANIMAL_KIND_LU` VALUES(2, 'INVERTEBRATES', 'Invertebrates');
INSERT INTO `vcsdb`.`ANIMAL_KIND_LU` VALUES(3, 'AMPHIBIANS', 'Amphibians');

-- -----------------------------------------------------
-- Table `vcsdb`.`OWNER`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`OWNER` VALUES(1, 'Ahmed Elsayed', 'aelsayed@gmail.com', 1, '1130 N Patsy Dr, Porterville, CA, 93257');
INSERT INTO `vcsdb`.`OWNER` VALUES(2, 'Mohamed Ibrahim', 'mibrahim@gmail.com', 1, 'Rt 630, Fort Lee, VA, 23801');
INSERT INTO `vcsdb`.`OWNER` VALUES(3, 'Sara Ali', 'sara@gmail.com', 2, '399 Crabb Acres, Smithfield, KY, 40068');
INSERT INTO `vcsdb`.`OWNER` VALUES(4, 'Aaron A Smith', 'asmith@gmail.com', 1, '2627 Surrey St, Olathe, KS, 66061');
INSERT INTO `vcsdb`.`OWNER` VALUES(5, 'Marie W Johnson', 'mjohnson@gmail.com', 2, '125 Pinnacle Dr, Blowing Rock, NC, 28605');
INSERT INTO `vcsdb`.`OWNER` VALUES(6, 'Gary J Johnson', 'gjohns@gmail.com', 1, '3091 Walnut St NE, Townsend, GA, 31331');
INSERT INTO `vcsdb`.`OWNER` VALUES(7, 'Benjamin S Smith', 'bensmith@gmail.com', 1, '230 Flourtown Rd, Plymouth Meeting, PA, 19462');


-- -----------------------------------------------------
-- Table `vcsdb`.`OWNER_PHONE_NUMBER`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`OWNER_PHONE_NUMBER` VALUES(1, '(913) 393-1954', 1);
INSERT INTO `vcsdb`.`OWNER_PHONE_NUMBER` VALUES(2, '(828) 414-9211', 2);
INSERT INTO `vcsdb`.`OWNER_PHONE_NUMBER` VALUES(3, '(212) 965-5441', 3);
INSERT INTO `vcsdb`.`OWNER_PHONE_NUMBER` VALUES(4, '(355) 689-7741', 4);
INSERT INTO `vcsdb`.`OWNER_PHONE_NUMBER` VALUES(5, '(460) 145-3365', 5);
INSERT INTO `vcsdb`.`OWNER_PHONE_NUMBER` VALUES(6, '(285) 412-8452', 3);

-- -----------------------------------------------------
-- Table `vcsdb`.`PET`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`PET` VALUES(1, 'Charlie', 2, '2008-7-04', 1, 14.26, 1);
INSERT INTO `vcsdb`.`PET` VALUES(2, 'Max', 2, '2020-1-15', 2, 22.3, 2);
INSERT INTO `vcsdb`.`PET` VALUES(3, 'Buddy', 2, '2017-6-14',1, 10.55, 3);
INSERT INTO `vcsdb`.`PET` VALUES(4, 'Milo', 1, '2015-3-11', 2, 55.5, 4);
INSERT INTO `vcsdb`.`PET` VALUES(5, 'Archie', 1, '2016-5-24', 1, 17.24, 5);
INSERT INTO `vcsdb`.`PET` VALUES(6, 'Jack', 1, '2018-5-12', 2, 14.24, 3);
INSERT INTO `vcsdb`.`PET` VALUES(7, 'Teddy', 2, '2011-7-11', 3, 63.55, 4);


-- -----------------------------------------------------
-- Table `vcsdb`.`PET_PHOTO`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(1, 'Charlie Photo', 'c:\images\pets\charlie.jpg', 1);
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(2, 'Max Photo1', 'c:\images\pets\max1.jpg', 1);
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(3, 'Max Photo2', 'c:\images\pets\max2.jpg', 2);
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(4, 'Max Photo3', 'c:\images\pets\max3.jpg', 2);
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(6, 'Buddy Photo', 'c:\images\pets\buddy.jpg', 3);
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(7, 'Milo Photo', 'c:\images\pets\milo.jpg', 4);
INSERT INTO `vcsdb`.`PET_PHOTO` VALUES(8, 'Archie Photo', 'c:\images\pets\archie.jpg', 5);

-- -----------------------------------------------------
-- Table `vcsdb`.`CLINIC`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`CLINIC` VALUES(1, 'ABALOS MEDICAL CLINIC', 'BRGY. PINYAHAN, QUEZON CITY', 'Monday-Saturday', '08:00', '05:00', 'abalos@gmail.com');
INSERT INTO `vcsdb`.`CLINIC` VALUES(2, 'ANC HALILI MEDICAL CLINIC', 'BRGY. KALIGAYAHAN NOVALICHES QUEZON CITY', 'Sunday-Saturday', '09:00', '04:00', 'quezon@gmail.com');
INSERT INTO `vcsdb`.`CLINIC` VALUES(3, 'FSM MEDICAL CLINIC', 'Ynares Sports Arena Cmpd. Shaw Blvd.,Pasig City', 'Thursday-Saturday', '02:30', '05:00', 'pasig@gmail.com');

-- -----------------------------------------------------
-- Table `vcsdb`.`CLINIC_SOCIAL_NETWORK`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`CLINIC_SOCIAL_NETWORK` VALUES(1, 'ABALOS_FACEBOOK', 'https://www.facebook.com/abalos', 1);
INSERT INTO `vcsdb`.`CLINIC_SOCIAL_NETWORK` VALUES(2, 'HALILI_FACEBOOK', 'https://www.facebook.com/halili', 2);
INSERT INTO `vcsdb`.`CLINIC_SOCIAL_NETWORK` VALUES(3, 'HALILI_TWITTER', 'https://www.twitter.com/halili', 2);
INSERT INTO `vcsdb`.`CLINIC_SOCIAL_NETWORK` VALUES(4, 'FSM_FACEBOOK', 'https://www.facebook.com/fsm', 3);
INSERT INTO `vcsdb`.`CLINIC_SOCIAL_NETWORK` VALUES(5, 'FSM_TWITTER', 'https://www.twitter.com/fsm', 3);

-- -----------------------------------------------------
-- Table `vcsdb`.`CLINIC_PHONE_NUMBER`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`CLINIC_PHONE_NUMBER` VALUES(1, '(772) 601-2254', 1);
INSERT INTO `vcsdb`.`CLINIC_PHONE_NUMBER` VALUES(2, '(245) 963-1147', 2);
INSERT INTO `vcsdb`.`CLINIC_PHONE_NUMBER` VALUES(3, '(111) 336-3256', 3);

-- -----------------------------------------------------
-- Table `vcsdb`.`DOCTOR`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`DOCTOR` VALUES(1, 'Dr Alan Stern','graduated with Honours from Cambridge University (preclinical) and Barts and The Royal London Hospital (clinical)', 1);
INSERT INTO `vcsdb`.`DOCTOR` VALUES(2, 'Dr Arun Sharma','Arun Bio', 1);
INSERT INTO `vcsdb`.`DOCTOR` VALUES(3, 'Dr Suzanne Holroyd','Suzanne Bio', 2);
INSERT INTO `vcsdb`.`DOCTOR` VALUES(4, 'Dr Peyton T. Taylor','Peyton Bio', 3);
INSERT INTO `vcsdb`.`DOCTOR` VALUES(5, 'Dr Richard D. Pearson','Richard Bio', 3);
INSERT INTO `vcsdb`.`DOCTOR` VALUES(6, 'Dr Paula M. Fracasso','Paula Bio', 2);


-- -----------------------------------------------------
-- Table `vcsdb`.`DOCTOR_PHONE_NUMBER`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`DOCTOR_PHONE_NUMBER` VALUES(1, '(552) 365-8521', 1);
INSERT INTO `vcsdb`.`DOCTOR_PHONE_NUMBER` VALUES(2, '(245) 145-1147', 2);
INSERT INTO `vcsdb`.`DOCTOR_PHONE_NUMBER` VALUES(3, '(258) 854-9654', 3);
INSERT INTO `vcsdb`.`DOCTOR_PHONE_NUMBER` VALUES(4, '(585) 654-2254', 4);
INSERT INTO `vcsdb`.`DOCTOR_PHONE_NUMBER` VALUES(5, '(274) 117-3578', 5);
INSERT INTO `vcsdb`.`DOCTOR_PHONE_NUMBER` VALUES(6, '(578) 951-1254', 6);

-- -----------------------------------------------------
-- Table `vcsdb`.`DOCTOR_PHOTO`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`DOCTOR_PHOTO` VALUES(1, 'Dr Alan Photo', 'c:\images\doctors\alan.jpg', 1);
INSERT INTO `vcsdb`.`DOCTOR_PHOTO` VALUES(2, 'Dr Arun Photo', 'c:\images\doctors\arun.jpg', 2);
INSERT INTO `vcsdb`.`DOCTOR_PHOTO` VALUES(3, 'Dr Suzanne Photo', 'c:\images\doctors\suzanne.jpg', 3);
-- -----------------------------------------------------
-- Table `vcsdb`.`VISIT`
-- -----------------------------------------------------
INSERT INTO `vcsdb`.`VISIT` VALUES(1, 7,6,3,'2013-10-24 08:10:15');
INSERT INTO `vcsdb`.`VISIT` VALUES(2, 2,2,2,'2017-09-24 10:25:16');
INSERT INTO `vcsdb`.`VISIT` VALUES(3, 2,2,1,'2018-05-24 09:15:17');
INSERT INTO `vcsdb`.`VISIT` VALUES(4, 1,1,1,'2013-10-24 13:14:13');
INSERT INTO `vcsdb`.`VISIT` VALUES(5, 4,4,3,'2019-02-24 14:25:16');
INSERT INTO `vcsdb`.`VISIT` VALUES(6, 3,4,3,'2013-05-24 16:22:17');
INSERT INTO `vcsdb`.`VISIT` VALUES(7, 2,6,1,'2015-04-24 15:52:15');
INSERT INTO `vcsdb`.`VISIT` VALUES(8, 6,3,1,'2019-07-24 01:45:14');
INSERT INTO `vcsdb`.`VISIT` VALUES(9, 5,1,3,'2020-05-24 08:55:10');
INSERT INTO `vcsdb`.`VISIT` VALUES(10, 7,3,2,'2019-06-24 02:41:20');
INSERT INTO `vcsdb`.`VISIT` VALUES(11, 7,4,3,'2020-03-24 05:41:35');
INSERT INTO `vcsdb`.`VISIT` VALUES(12, 5,4,2,'2013-11-24 08:25:30');
INSERT INTO `vcsdb`.`VISIT` VALUES(13, 6,4,1,'2014-12-24 09:06:12');
INSERT INTO `vcsdb`.`VISIT` VALUES(14, 1,5,1,'2006-05-24 04:07:14');
