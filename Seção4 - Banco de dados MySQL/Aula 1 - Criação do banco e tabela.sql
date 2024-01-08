create database produtos;
use produtos;
create table if not exists pecas(
id int auto_increment primary key,
descricao varchar(80) not null,
estoque int not null
);

describe pecas;