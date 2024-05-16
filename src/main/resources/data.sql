INSERT INTO runner (name, age, gender, unique_identifier) VALUES ('Fut Olga', 25, 'nő', 'FO25');
INSERT INTO runner (name, age, gender, unique_identifier) VALUES ('Ránne Róbert', 30, 'férfi', 'RR30');
INSERT INTO runner (name, age, gender, unique_identifier) VALUES ('Gyor Sára', 20, 'nő', 'GS20');
INSERT INTO runner (name, age, gender, unique_identifier) VALUES ('Siető Sándor', 28, 'férfi', 'SS28');

INSERT INTO race (name, distance) VALUES ('BALATON SZUPERMARATON - MARATONFÜRED - Badacsonytomaj, Strand', 42);
INSERT INTO race (name, distance) VALUES ('BALATON SZUPERMARATON - ŐBÖL FÉLMARATON - Keszthely - Szigliget ', 21);

INSERT INTO result (runner_id, race_id, time) VALUES (1, 1, 25);
INSERT INTO result (runner_id, race_id, time) VALUES (2, 1, 28);
INSERT INTO result (runner_id, race_id, time) VALUES (3, 1, 22);
INSERT INTO result (runner_id, race_id, time) VALUES (4, 1, 30);
INSERT INTO result (runner_id, race_id, time) VALUES (1, 2, 240);
INSERT INTO result (runner_id, race_id, time) VALUES (2, 2, 260);