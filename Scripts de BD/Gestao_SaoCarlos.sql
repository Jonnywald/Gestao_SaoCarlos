drop database if exists Gestao_SaoCarlos;
create database Gestao_SaoCarlos;
use Gestao_SaoCarlos;

create table users (

id_user 	int auto_increment	primary key,
login		varchar(100) UNIQUE,
nome_user	varchar (100),
senha		varchar (30),
Adm			boolean

)engine=InnoDB;

create table producaoCachaca (
id_producaoC	int auto_increment	primary key,
lote		int,
dtMoagem     date NOT NULL,
qtdCaldo 	int NOT NULL,
qtdAgua	 	int NOT NULL,
totalCaldo 	int,
brix		double,
dtInicioFerment date NOT NULL,
dtAlarmFerment 	date,
numDorna	int NOT NULL,
dtAlambicagem date NOT NULL,
qtdCoracao	double NOT NULL,
rendimento 	double NOT NULL,
gl			double NOT NULL,
numBarril	int NOT NULL
    
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