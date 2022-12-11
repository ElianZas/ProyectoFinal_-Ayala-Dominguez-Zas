#IMPORTANTE DE DBEAVER 
#HACER 2 CLIC SOBRE Databases
#IR A EditorSQL en la parte superior
#seleccionar Nuevo Script SQL
#pegar Este CODIGO
#PARA EJECUTAR Y CREAR TODO DE UNA SELECCIONAR Ejecutar Script SQL o presiona ALT+X

CREATE DATABASE proyectofinal_cfp18;

CREATE TABLE proyectofinal_cfp18.dota (
	id_dota INT auto_increment NOT NULL,
	linea INT NULL,
	total_unidades INT NULL,
	mantenimiento INT NULL,
	total_ganancias INT NULL,
	CONSTRAINT dota_PK PRIMARY KEY (id_dota)
);

CREATE TABLE proyectofinal_cfp18.chofer (
	id_chofer INT auto_increment NOT NULL,
	nombre varchar(30) NULL,
	apellido varchar(30) NULL,
	dni INT NULL,
	antiguedad INT NULL,
	sueldoBase INT NULL,
	CONSTRAINT choferes_PK PRIMARY KEY (id_chofer)
);

#inserta datos de Dota
INSERT INTO proyectofinal_cfp18.dota (linea,total_unidades,mantenimiento,total_ganancias)
	VALUES (79,12,50000,7000000);
INSERT INTO proyectofinal_cfp18.dota (linea,total_unidades,mantenimiento,total_ganancias)
	VALUES (102,9,50000,5000000);
INSERT INTO proyectofinal_cfp18.dota (linea,total_unidades,mantenimiento,total_ganancias)
	VALUES (110,10,50000,2500000);
INSERT INTO proyectofinal_cfp18.dota (linea,total_unidades,mantenimiento,total_ganancias)
	VALUES (134,12,50000,3000000);
INSERT INTO proyectofinal_cfp18.dota (linea,total_unidades,mantenimiento,total_ganancias)
	VALUES (178,17,50000,4500000);
INSERT INTO proyectofinal_cfp18.dota (linea,total_unidades,mantenimiento,total_ganancias)
	VALUES (277,15,50000,8000000);

#inserta datos en chofer
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ESTEFANIA','AROCAS PASADAS',28740858,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('QUERALT','VISO GILABERT',29651813,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JOAN','AYALA FERRERAS',40184442,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JOAN','BAEZ TEJADO',26104249,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARC','BASTARDES SOTO',32997809,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JOSEP','ANGUERA VILAFRANCA',35794895,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ESTHER','PASCUAL ALOY',27589790,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('LAURA','VALLÉS GIRVENT',38354542,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('RAQUEL','RAYA GARCIA',34180521,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JOAN','ANDREU CRUZ',24021740,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIA ISABEL','BARALDÉS COMAS',24467946,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ADRIÀ','BERENGUERAS CULLERÉS',27540561,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('GERARD','LÓPEZ DE PABLO GARCIA UCEDA',37548578,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ELIOT','ARNAU MORENO',30462341,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JORDI','RAYA GAVILAN',27033410,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('LLUÍS','ZAMBUDIO FIGULS',22409980,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('LAURA','BIDAULT CULLERÉS',17743218,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JORDI','BIOSCA FONTANET',24200804,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('DOUNYA','ZAFRA FIGULS',24247923,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JULIO','ALEU ICART',17517632,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ANDREU','BADIA TORNÉ',39294102,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('RAMON','MORALES GESE',29810168,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('DAVID-JESE','BLANCO FONTANET',26978925,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ARAN','ALVAREZ FERNÁNDEZ',17882767,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('GEMMA','GARCIA ALMOGUERA',31489645,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('IVAN','LIBORI FIGUERAS',30170275,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('DAVID','BIDAULT PUEYO',21749254,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('XAVIER','BENITEZ JOSE',41543371,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIO','PASCUAL FLORES',24488657,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JESUS','AYALA TORNÉ',29233430,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('GEMMA','LISTAN FIGUERAS',23010622,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('SILVIA','RASERO GAVILAN',11802578,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ALBERT','ARNALOT PUIG',12221934,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIA','MOLINER GARRIDO',24500512,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('BERTA','GALOBART GARCIA',23278318,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('BERTA','LÓPEZ GARRIGASSAIT',36174131,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MIREIA','SÁNCHEZ GÓMEZ',27711944,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('GEMMA','ALAVEDRA SUNYÉ',37867166,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIA ISABEL','ALIGUÉ BONVEHÍ',37790238,20,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('TONI','MAS FRANCH',29343879,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ALEJANDRO','ALOY COMPTE',27116347,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JOAN MARTÍ','ASENSIO VEGA',38697631,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('INGRID','BIDAULT PÉREZ',35025026,20,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('OLIVER','ALOY CODINACHS',31928840,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('SANDRA','ALTIMIRAS ARMENTEROS',37681104,0,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JORDI','BELMONTE SÁNCHEZ',37977745,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARC','BAJONA GARCIA',23278318,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JORDINA','AGUILAR RODRIGUEZ',36174131,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIA JOSÉ','BARRIGA SOTO',27711944,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('RAQUEL','AVILA MASJUAN',37867166,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ENRIC','PARRAMON FLORES',37790238,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARTA','AGUILAR RAMOS',29343879,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('CARLA','AYALA ALSINA',27116347,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIA NOELIA','ALVAREZ TROYANO',38697631,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('CRISTINA','ALINS GONZÁLEZ',35025026,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('CARLOS','ACUÑA TORT',31928840,5,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('DAVID','ALGUÉ TRANCHO',37681104,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('CRISTIAN','BADIA CASTILLO',37977745,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('JULIO ALBERTO','BENITEZ FLORES',23278318,15,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('SERGI','TORRUELLA GARCIA',36174131,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('ALEIX','ALBERICH RODRIGUEZ',27711944,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('VERÒNICA','ARMENCOT PUIG',37867166,0,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARIONA','ALIGUÉ RIVERA',37790238,10,70000);
INSERT INTO proyectofinal_cfp18.chofer (nombre,apellido,dni,antiguedad,sueldoBase)
	VALUES ('MARC','BARRIGA RIU',29343879,0,70000);
