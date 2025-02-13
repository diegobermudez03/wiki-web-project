CREATE TABLE IF NOT EXISTS contact_us_requests(
    id          SERIAL PRIMARY KEY,
    first_name  TEXT NOT NULL,
    last_name   TEXT NOT NULL,
    email       TEXT NOT NULL,
    semester    INTEGER NOT NULL
);