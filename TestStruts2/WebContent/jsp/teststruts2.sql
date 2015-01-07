# Host: localhost

# 	Remarque : Pour mettre à jour la table lancer mysql depuis une fenêtre de commande
#                  avec la commande mysql -u root -p
#                  ensuite sous mysql taper la commande : \. chemin\du\fichier\teststruts2.sql

USE mysql;
DROP DATABASE IF EXISTS `teststruts2`;
CREATE DATABASE `teststruts2`;
USE teststruts2;
# --------------------------------------------------------

#
# Structure de la table `users`
#

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  USER_Id char(255),
  USER_Login char(255),
  USER_Password char(255),
  PRIMARY KEY  (`USER_Id`)
) ;

# Données enregistrées pour la table `clients`

INSERT INTO `users` VALUES ('0', 'admin', 'admin');
INSERT INTO `users` VALUES ('1', 'toto', 'toto');
INSERT INTO `users` VALUES ('2', 'titi', 'titi');
INSERT INTO `users` VALUES ('3', 'tutu', 'tutu');

# --------------------------------------------------------

#
# Structure de la table `clients`
#

DROP TABLE IF EXISTS `clients`;
CREATE TABLE `clients` (
  CLIENT_Num char(255),
  CLIENT_Nom char(255),
  CLIENT_Prenom char(255),
  CLIENT_Adresse char(255),
  CLIENT_Ville char(255),
  CLIENT_CodePostal char(255),
  CLIENT_MotDePasse char(255),
  PRIMARY KEY  (`CLIENT_Num`)
);

# Données enregistrées pour la table `clients`

INSERT INTO `clients` VALUES ('216', 'Lamy', 'Eléna', '7 rue du Paradis', 'Paris', '75012', 'Eléna');
INSERT INTO `clients` VALUES ('221', 'Théos', 'Pablo', '3 passage Secret', 'Paris', '75004', 'Pablo');
INSERT INTO `clients` VALUES ('342', 'Camden',	'Nicolas', '24 av du Papillon', 'Paris', '75013', 'Nicolas');
INSERT INTO `clients` VALUES ('528', 'Line', 'Margo', '22 rue de la Liberté', 'Paris', '75005', 'Margo');