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
 lote		int primary key,
 dtProducaoM date NOT NULL,
 qtdCaldoM 	int NOT NULL,
 qtdMelado	int NOT NULL,
 pesoTotalM 	double NOT NULL,
 rendimentoM double,
 validadeM	date
    
)engine=InnoDB;

create table producaoRapadura( 
 lote		int primary key,
 dtProducaoR date NOT NULL,
 qtdCaldoR 	int NOT NULL,
 qtdRapadura	int NOT NULL,
 pesoTotalR 	double NOT NULL,
 rendimentoR double,
 validadeR	date
    
)engine=InnoDB;
create table venda( 
 id		int primary key NOT NULL,
 valor double NOT NULL,
 descricao 	varchar(255),
 dtVenda	date NOT NULL,
 qtdMelado	int ,
 qtdRapadura int,
 qtdGarrafa	int
    
)engine=InnoDB;


create table garrafa (

lote int	primary key,
tpBebida	varchar (50),
volumeGarrafa	double,
qtdGarrafas int,
dtEngarrafamento date

)engine=InnoDB;
 
create table bebidaMista(
id int UNIQUE	primary key,
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
