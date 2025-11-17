CREATE TABLE `t_evaluations`
(
    `id`    bigint(20)     NOT NULL AUTO_INCREMENT,
    `type`  varchar(255)   NOT NULL,
    `value` decimal(10,2)  NOT NULL,
    `unit`  varchar(255)   NOT NULL,
    `date`  DATE           NOT NULL,
    PRIMARY KEY (`id`)
);