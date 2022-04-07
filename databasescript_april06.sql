

create database databaseForAgileProject;

use databaseForAgileProject;

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `accountID` int(11) NOT NULL,
  `accountUsername` char(30) NOT NULL,
  `accountPassword` char(30) NOT NULL,
  `typeOfAccount` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`accountID`, `accountUsername`, `accountPassword`, `typeOfAccount`) VALUES
(1, 'Shane', '12345', 'Donor'),
(2, 'Chris', '12345', 'Organization'),
(3, 'Angel', '12345', 'Volunteer');

-- --------------------------------------------------------

--
-- Table structure for table `donations`
--

CREATE TABLE `donations` (
  `donationID` int(11) NOT NULL,
  `itemsDonated` char(200) NOT NULL,
  `donorID` int(11) NOT NULL,
  `volunteerID` int(11) NOT NULL,
  `organizationID` int(11) NOT NULL,
  `timeRequested` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donations`
--

INSERT INTO `donations` (`donationID`, `itemsDonated`, `donorID`, `volunteerID`, `organizationID`, `timeRequested`) VALUES
(0, 'Cloths', 0, 0, 0, '2022-03-28 16:58:37');

-- --------------------------------------------------------

--
-- Table structure for table `donors`
--

CREATE TABLE `donors` (
  `donorID` int(11) NOT NULL,
  `accountID` int(11) NOT NULL,
  `firstName` char(20) DEFAULT NULL,
  `lastName` char(20) DEFAULT NULL,
  `emailAddress` char(30) DEFAULT NULL,
  `city` char(30) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `phoneNumber` char(14) DEFAULT NULL,
  `StreetAddress` char(30) NOT NULL,
  `province` char(20) DEFAULT NULL,
  `unitNumber` char(11) DEFAULT NULL,
  `postalCode` char(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donors`
--

INSERT INTO `donors` (`donorID`, `accountID`, `firstName`, `lastName`, `emailAddress`, `city`, `birthDate`, `phoneNumber`, `StreetAddress`, `province`, `unitNumber`, `postalCode`) VALUES
(0, 1, 'Shane', 'Davey', 'scdavey@lakeheadu.ca', 'thunder bay', '2022-03-10', '1-888-888-8888', '', NULL, '54', '111abc');

-- --------------------------------------------------------

--
-- Table structure for table `organizations`
--

CREATE TABLE `organizations` (
  `organizationID` int(11) NOT NULL,
  `accountID` int(11) NOT NULL,
  `organizationName` char(40) NOT NULL,
  `organizationPhoneNumber` char(15) NOT NULL,
  `organizationURL` char(30) NOT NULL,
  `streetAddress` char(100) NOT NULL,
  `unitNumber` char(100) NOT NULL,
  `city` char(100) NOT NULL,
  `province` char(100) NOT NULL,
  `postalCode` char(100) NOT NULL,
  `mission` varchar(1000) DEFAULT NULL,
  `itemsRequestedFromDonors` char(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `organizations`
--

INSERT INTO `organizations` (`organizationID`, `accountID`, `organizationName`, `organizationPhoneNumber`, `organizationURL`, `streetAddress`, `unitNumber`, `city`, `province`, `postalCode`, `mission`, `itemsRequestedFromDonors`) VALUES
(0, 2, 'Community Clothing', '(807) 474-3583', 'www.communityclothing.ca', '404 May St N', '1', 'Thunder Bay','ON' ,'P7C3R5', 'Provide Clothing to those in need. Community Clothing Assistance was founded in 2006 to relieve poverty through the operation of a Clothing Bank after the tragic death of a homeless man who froze to death on the steps of this building. Dr. Brian J. Scott the landlord at that time responded to this tragedy by establishing a charity with the help of Mary Sorensen and myself. We want to thank the public for the tremendous community sup', 'Warm Clothing'),
(1, 2, 'Feed Ontario', '(807) 622-7440', 'www.feedontarion.ca' ,'570 Syndicate Avenue South', '1', 'Thunder Bay',  'ON', 'P7E1E7',  'Every Day People in Our Community Suffer, and We Strive to Help. Call Us for Information. Our Mission Is to Feed the Hungry and Eliminate Famine in Ontario. We\'re Change-Makers. We\'re Collaborative. We work to end hunger and poverty by delivering fresh and healthy food, developing innovative programming, and driving change through research and advocacy. Last year, more people relied on food banks than ever before. With your generous support, we were able to do more to help our province’s most vulnerable. We delivered more meals and more fresh food, m', 'Fresh and healthy food items');

-- --------------------------------------------------------

--
-- Table structure for table `volunteers`
--

CREATE TABLE `volunteers` (
  `volunteerID` int(11) NOT NULL,
  `accountID` int(11) NOT NULL,
  `firstName` char(30) NOT NULL,
  `lastName` char(30) NOT NULL,
  `volunteerEmail` char(30) NOT NULL,
  `streetAddress` char(20) NOT NULL,
  `unitNumber` char(11) NOT NULL,
  `city` char(30) NOT NULL,
  `province` char(20) NOT NULL,
  `postalCode` char(7) NOT NULL,
  `birthDate` date NOT NULL,
  `volunteerPhoneNumber` char(20) NOT NULL,
  `availabilityDaysOfWeek` char(50) DEFAULT NULL,
  `availabilityHours` char(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `volunteers`
--

INSERT INTO `volunteers` (`volunteerID`, `accountID`, `firstName`, `lastName`, `volunteerEmail`, `streetAddress`, `unitNumber`, `city`, `province`, `postalCode`, `birthDate`, `volunteerPhoneNumber`, `availabilityDaysOfWeek`, `availabilityHours`) VALUES
(0, 3, 'Angel', 'Martinez', 'Angel@gmail.com', 'Street N', '12', 'Thunder Bay', 'Ontario', '123ABC', '2000-03-30', '(807) 178-0902', 'More than Once a Week', ' Mornings Mon-Fri, Weekends');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`accountID`);

--
-- Indexes for table `donations`
--
ALTER TABLE `donations`
  ADD PRIMARY KEY (`donationID`),
  ADD KEY `donorID` (`donorID`),
  ADD KEY `volunteerID` (`volunteerID`),
  ADD KEY `organizationID` (`organizationID`);

--
-- Indexes for table `donors`
--
ALTER TABLE `donors`
  ADD PRIMARY KEY (`donorID`),
  ADD KEY `accountID` (`accountID`);

--
-- Indexes for table `organizations`
--
ALTER TABLE `organizations`
  ADD PRIMARY KEY (`organizationID`),
  ADD KEY `accountID` (`accountID`);

--
-- Indexes for table `volunteers`
--
ALTER TABLE `volunteers`
  ADD PRIMARY KEY (`volunteerID`),
  ADD KEY `accountID` (`accountID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `donations`
--
ALTER TABLE `donations`
  ADD CONSTRAINT `donations_ibfk_1` FOREIGN KEY (`donorID`) REFERENCES `donors` (`donorID`),
  ADD CONSTRAINT `donations_ibfk_2` FOREIGN KEY (`volunteerID`) REFERENCES `volunteers` (`volunteerID`),
  ADD CONSTRAINT `donations_ibfk_3` FOREIGN KEY (`organizationID`) REFERENCES `organizations` (`organizationID`);

--
-- Constraints for table `donors`
--
ALTER TABLE `donors`
  ADD CONSTRAINT `donors_ibfk_1` FOREIGN KEY (`accountID`) REFERENCES `accounts` (`accountID`);

--
-- Constraints for table `organizations`
--
ALTER TABLE `organizations`
  ADD CONSTRAINT `organizations_ibfk_1` FOREIGN KEY (`accountID`) REFERENCES `accounts` (`accountID`);

--
-- Constraints for table `volunteers`
--
ALTER TABLE `volunteers`
  ADD CONSTRAINT `volunteers_ibfk_1` FOREIGN KEY (`accountID`) REFERENCES `accounts` (`accountID`);
COMMIT;



alter table donations
add column donationStatus char(20)