drop database SOE;
create database SOE;
use SOE;

create table curso (
	id int auto_increment primary key,
	nome varchar(50),
	descricao varchar(250),
	turnos int
);
create table usuario (
	id int auto_increment primary key,
	nome varchar(50),
	email varchar(80),
	tipo varchar(1)
);
create table orientador (
	id int auto_increment primary key,
	curriculo varchar(250),
	especialidades varchar(250),
	cargo varchar(1),
	idusuario int,
	idcurso int,
	foreign key(idusuario) references usuario(id),
	foreign key(idcurso) references curso(id)

);
create table aluno(
	id int auto_increment primary key,
	ra varchar(14),
	semestre int,
	periodo int,
	ciclo int,
	status varchar(1),
	idusuario int,
	idcurso int,
	foreign key(idusuario) references usuario(id),
	foreign key(idcurso) references curso(id)
);
create table tcc(
	id int auto_increment primary key,
	tema varchar(80),
	justificativa varchar(250),
	tipo int
);
create table grupo(
	id int auto_increment primary key,
	nome varchar(80),
	idtcc int,
	idorientador int,
	foreign key(idtcc) references tcc(id),
	foreign key(idorientador) references orientador(id)
);
create table grupoaluno(
	id int auto_increment primary key,
	idgrupo int,
	idaluno int,
	foreign key(idgrupo) references grupo(id),
	foreign key(idaluno) references aluno(id)
);
create table vinculo(
	id int auto_increment primary key,
	idgrupo int,
	idorientador int,
	foreign key(idgrupo) references grupo(id),
	foreign key(idorientador) references orientador(id)
);
create table atividade(
	id int auto_increment primary key,
	idgrupo int,
	dataprevista date,
	dataentrega date,
	descricao varchar(250),
	foreign key(idgrupo) references grupo(id)
);
create table banca(
	id int auto_increment primary key,
	idgrupo int,
	data date,
	foreign key(idgrupo) references grupo(id)
);
create table bancaorientador(
	id int auto_increment primary key,
	idbanca int,
	idorientador int,
	foreign key(idbanca) references banca(id),
	foreign key(idorientador) references orientador(id)
);
