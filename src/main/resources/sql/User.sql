CREATE TABLE `users` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `username` varchar(128) NOT NULL COMMENT '用户名',
                        `email` varchar(255) NOT NULL COMMENT '用户邮箱',
                        `password` varchar(255) NOT NULL COMMENT '用户密码',
                        `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;