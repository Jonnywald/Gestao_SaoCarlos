drop database if exists Gestao_SaoCarlos;
create database Gestao_SaoCarlos;
use Gestao_SaoCarlos;

create table Users (

login		varchar(100) UNIQUE primary key,
nome	    varchar (100),
senha		varchar (30),
adm			boolean

)engine=InnoDB;

create table producaoCachaca (
lote		int auto_increment	primary key,
dtMoagem     date NOT NULL,
qtdCaldo 	int NOT NULL,
qtdAgua	 	int NOT NULL,
totalCaldo 	int,
brix		double,
dtInicioFerment date NOT NULL,
dtAlarmFerment 	date,
numDorna	int NOT NULL,
dtAlambicagem date,
qtdCoracao	double,
rendimento 	double,
gl			double,
numBarril	int
    
)engine=InnoDB;

create table producaoMelado( 
 id_producaoM int auto_increment	primary key,
 lote		int,
 dtProducaoM date NOT NULL,
 qtdCaldoM 	int NOT NULL,
 qtdMelado	int NOT NULL,
 pesoTotalM 	double NOT NULL,
 rendimentoM double,
 validadeM	date
    
)engine=InnoDB;

create table producaoRapadura( 
 id_producaoR int auto_increment	primary key,
 lote		int,
 dtProducaoR date NOT NULL,
 qtdCaldoR 	int NOT NULL,
 qtdRapadura	int NOT NULL,
 pesoTotalR 	double NOT NULL,
 rendimentoR double,
 validadeR	date
    
)engine=InnoDB;

create table garrafa (

id_garrafa int auto_increment	primary key,
tpBebida	varchar (50),
tpGarrafa	varchar(10),
dtEngarrafamento date

)engine=InnoDB;
 
create table bebidaMista(
id_bedidaMista int auto_increment	primary key,
nomeBM	varchar (50),
tpCura	int NOT NULL,
materiaPrima	varchar (50)

)engine=InnoDB;

create table barril(
numBarril  int primary key,
dtCheio date, 
dtTipoA date,
dtTipoE date,
dtTipoP date,
dtTipoEP date,
material varchar(30),
tipoAtual varchar(30),
volumeAtual double,
volumeTotal double

)engine=InnoDB;


insert into Users values ("ADM", "ADM", "ADM", TRUE);
insert into Users values ("AGT", "AGT", "AGT", FALSE);

select * from barril;
select * from producaoCachaca;

select avg(rendimento) FROM producaoCachaca WHERE dtAlambicagem BETWEEN current_date()-28 AN D currente_date();