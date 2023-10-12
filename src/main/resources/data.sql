-- Inserting roles
INSERT INTO role (id, role_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, role_name) VALUES (2, 'ROLE_USER');
INSERT INTO role (id, role_name) VALUES (3, 'ROLE_GUEST');

-- Inserting users (Note: For simplicity, using plain passwords. In a real application, consider hashing the passwords.)
INSERT INTO usr (id, username, password, created_at, updated_at) VALUES (1, 'admin', 'admin123', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO usr (id, username, password, created_at, updated_at) VALUES (2, 'user', 'user123', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO usr (id, username, password, created_at, updated_at) VALUES (3, 'guest', 'guest123', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Associating users with roles
INSERT INTO user_roles (usr_id, role_id) VALUES (1, 1);  -- admin has ROLE_ADMIN
INSERT INTO user_roles (usr_id, role_id) VALUES (2, 2);  -- user has ROLE_USER
INSERT INTO user_roles (usr_id, role_id) VALUES (3, 3);  -- guest has ROLE_GUEST
