CREATE TABLE IF NOT EXISTS asistente(
    id SERIAL,
    nombres VARCHAR(50) NOT NULL,
    email VARCHAR(50),
    institucion VARCHAR(50),
    cargo VARCHAR(50),
    PRIMARY KEY (id),
    UNIQUE (email)
    );
