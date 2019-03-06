create table categorias
(
  id          int          not null
    primary key,
  estado      bit          null,
  imagen      varchar(255) null,
  nombre      varchar(255) null,
  descripcion varchar(255) null
)
  charset = utf8mb4;

create table hibernate_sequence
(
  next_val bigint null
)
  engine = MyISAM;

create table productos
(
  id           int          not null
    primary key,
  nombre       varchar(100) not null,
  sabor        varchar(100) not null,
  graduacion   varchar(100) not null,
  descripcion  varchar(250) null,
  precio       double       not null,
  image        varchar(100) not null,
  id_categoria int          not null,
  imagen       varchar(255) null,
  constraint fk_productos_categorias
    foreign key (id_categoria) references categorias (id)
)
  charset = utf8mb4;

create index fk_productos_categorias_idx
  on productos (id_categoria);

