-- Insert roles
INSERT INTO role (id, role_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, role_name) VALUES (2, 'ROLE_USER');
INSERT INTO role (id, role_name) VALUES (3, 'ROLE_GUEST');

-- Insert users with encrypted dummy passwords (you should replace these with real encrypted passwords)
INSERT INTO usr (id, username, password, created_at, updated_at)
VALUES (1, 'user1', '{bcrypt}$2a$10$VKJF0JUfnTPZxGEP6t9T0e4UzkevWD6h9I0gSMvOF58wLh1hrxfH2', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO usr (id, username, password, created_at, updated_at)
VALUES (2, 'user2', '{bcrypt}$2a$10$VKJF0JUfnTPZxGEP6t9T0e4UzkevWD6h9I0gSMvOF58wLh1hrxfH2', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO usr (id, username, password, created_at, updated_at)
VALUES (3, 'user3', '{bcrypt}$2a$10$VKJF0JUfnTPZxGEP6t9T0e4UzkevWD6h9I0gSMvOF58wLh1hrxfH2', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Associate roles with users
INSERT INTO user_roles (id, usr_id, role_id) VALUES (1, 1, 1); -- user1 has ROLE_ADMIN
INSERT INTO user_roles (id, usr_id, role_id) VALUES (2, 2, 2); -- user2 has ROLE_USER
INSERT INTO user_roles (id, usr_id, role_id) VALUES (3, 3, 3); -- user3 has ROLE_GUEST
