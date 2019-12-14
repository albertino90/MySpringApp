# пользователи
CREATE TABLE `users` (
                         `id` bigint(20) NOT NULL AUTO_INCREMENT,
                         `name` varchar(45) NOT NULL,
                         `email` varchar(45) DEFAULT NULL,
                         `password` varchar(45) DEFAULT NULL,
                         PRIMARY KEY (`id`),
                         UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
# роли
CREATE TABLE `albert_schema`.`roles` (
                                         `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
                                         `name` VARCHAR(45) NOT NULL,
                                         PRIMARY KEY (`id`),
                                         UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE);
# промежуточная таблица
CREATE TABLE `albert_schema`.`users_roles` (
                                               `user_id` BIGINT(20) NOT NULL,
                                               `role_id` BIGINT(20) NOT NULL,
                                               INDEX `fk_users_idx` (`user_id` ASC) VISIBLE,
                                               INDEX `fk_roles_idx` (`role_id` ASC) VISIBLE,
                                               CONSTRAINT `fk_users`
                                                   FOREIGN KEY (`user_id`)
                                                       REFERENCES `albert_schema`.`users` (`id`)
                                                       ON DELETE NO ACTION
                                                       ON UPDATE NO ACTION,
                                               CONSTRAINT `fk_roles`
                                                   FOREIGN KEY (`role_id`)
                                                       REFERENCES `albert_schema`.`roles` (`id`)
                                                       ON DELETE NO ACTION
                                                       ON UPDATE NO ACTION);
# наполнение таблицы ролей
INSERT INTO `albert_schema`.`roles` (`name`) VALUES ('USER');
INSERT INTO `albert_schema`.`roles` (`name`) VALUES ('MANAGER');
INSERT INTO `albert_schema`.`roles` (`name`) VALUES ('ADMIN');
# связывание двух таблиц
INSERT INTO `albert_schema`.`users_roles` (`user_id`,`role_id`) VALUES ('1','1');

