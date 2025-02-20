CREATE TABLE IF NOT EXISTS contact_us_requests(
    id          SERIAL PRIMARY KEY,
    first_name  TEXT NOT NULL,
    last_name   TEXT NOT NULL,
    email       TEXT NOT NULL,
    semester    INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS user_stories(
    id      SERIAL PRIMARY KEY,
    story_id    TEXT NOT NULL,
    name        TEXT NOT NULL,
    sentence    TEXT NOT NULL,
    criteria    TEXT NOT NULL,
    type        TEXT NOT NULL CHECK (type IN ('ARRENDADOR', 'ADMINISTRADOR'))
);