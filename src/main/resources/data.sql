insert into products (id, name, count)
values (1,'Bluza',54)
ON DUPLICATE KEY UPDATE name='Bluza',count=54;

insert into products (id, name, count)
values (2,'Czapka',25)
ON DUPLICATE KEY UPDATE name='Czapka',count=25;

insert into products (id, name, count)
values (3,'T-Shirt',73)
ON DUPLICATE KEY UPDATE name='T-Shirt',count=73;

insert into products (id, name, count)
values (4,'Buty',34)
ON DUPLICATE KEY UPDATE name='Buty',count=34;

insert into orders (id, name, count, cost)
values (1,'Spodnie',44, 4400.0)
ON DUPLICATE KEY UPDATE name='Spodnie',count=44, cost=4400.0;

insert into orders (id, name, count, cost)
values (2,'Kurtka',21, 3150.0)
ON DUPLICATE KEY UPDATE name='Kurtka',count=21, cost=3150.0;

insert into orders (id, name, count, cost)
values (3,'Szalik',18, 360.0)
ON DUPLICATE KEY UPDATE name='Szalik',count=18, cost=360.0;

insert into orders (id, name, count, cost)
values (4,'Skarpetki',52, 780.0)
ON DUPLICATE KEY UPDATE name='Skarpetki',count=52, cost=780.0;