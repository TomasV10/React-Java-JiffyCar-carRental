INSERT INTO carlist(car_maker, car_model, manufacturing_year, number_of_seats, price_per_day, rented_day_from, rented_day_to, car_state) VALUES ('Audi', 'a1', '2020', '5', '150', null, null, 0);
INSERT INTO carlist(car_maker, car_model, manufacturing_year, number_of_seats, price_per_day, rented_day_from, rented_day_to, car_state) VALUES ('Citroen', 'c3', '2005', '5', '80', '2020-05-01', '2020-05-07', 1);
INSERT INTO carlist(car_maker, car_model, manufacturing_year, number_of_seats, price_per_day, rented_day_from, rented_day_to, car_state) VALUES ('BMW', '530D', '2019', '5', '180', null, null,0);
INSERT INTO carlist(car_maker, car_model, manufacturing_year, number_of_seats, price_per_day, rented_day_from, rented_day_to, car_state) VALUES ('Mercedes-Benz', 'c335', '2016', '4', '230', '2020-05-08', '2020-05-10', 1);

INSERT INTO users(email, first_name, last_name, password) VALUES ('a@b.lt', 'Jacob', 'Laukaitis', 'a');
INSERT INTO users(email, first_name, last_name, password) VALUES ('c@d.lt', 'Patricijus', 'Ribera', 'b');
INSERT INTO users(email, first_name, last_name, password) VALUES ('d@e.lt', 'Tomas', 'Kisielius', 'c');

INSERT INTO role(name) VALUES ('ADMIN');
INSERT INTO role(name) VALUES ('MANAGER');
INSERT INTO role(name) VALUES ('USER');
