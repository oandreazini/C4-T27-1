use heroku_0d3d9a2e88b6da5;

DROP TABLE IF EXISTS `supplies`;
DROP TABLE IF EXISTS `providers`;
DROP TABLE IF EXISTS `pieces`;

create table `pieces`(
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(100),
 PRIMARY KEY (`id`)
);

create table `providers` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(100),
PRIMARY KEY (`id`)
);

create table `supplies` (
`id` INT NOT NULL AUTO_INCREMENT,
`id_pieces` INT,
`id_providers` INT,
`price` INT,
CONSTRAINT FK_piecesfk FOREIGN KEY (`id_pieces`) REFERENCES `pieces`(`id`)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_providersfk FOREIGN KEY (`id_providers`) REFERENCES `providers`(`id`)
ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (`id`)
);

insert into  `pieces` (`name`) values('Tuerca');
insert into  `pieces` (`name`) values('Tornillo');
insert into  `pieces` (`name`) values('Arandela');


insert into `providers`  ( `name`) values ('Saltoki');
insert into `providers`  ( `name`) values ('Bauhaus');
insert into `providers`  ( `name`) values ('Leroy');

insert into `supplies` (`id_pieces`, `id_providers`, `price`) values ( 1, 1, 2 );
insert into `supplies` (`id_pieces`, `id_providers`, `price`) values ( 11, 11, 3);
insert into `supplies` (`id_pieces`, `id_providers`, `price` ) values (21, 21, 5);

