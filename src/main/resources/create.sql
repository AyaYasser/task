CREATE TABLE `match` (
  `match_id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id_1` int(11) NOT NULL,
  `staff_id_2` int(11) NOT NULL,
  `group_no` int(11) NOT NULL,
  `user1_points` int(11) NOT NULL,
  `user2_points` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`match_id`)
) ;
CREATE TABLE participants (
  participants_id int(11) NOT NULL AUTO_INCREMENT,
  staff_id INTEGER(11) NOT NULL,
  username varchar(100) NOT NULL,
  date date NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`participants_id`)
);