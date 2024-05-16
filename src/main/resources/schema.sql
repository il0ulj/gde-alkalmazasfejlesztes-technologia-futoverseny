CREATE TABLE runner (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    gender VARCHAR(255),
    unique_identifier VARCHAR(255) UNIQUE
);

CREATE TABLE race (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    distance DOUBLE
);

CREATE TABLE result (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    runner_id BIGINT,
    race_id BIGINT,
    time INT,
    FOREIGN KEY (runner_id) REFERENCES runner(id),
    FOREIGN KEY (race_id) REFERENCES race(id)
);