SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `easyticket` ;
CREATE SCHEMA IF NOT EXISTS `easyticket` DEFAULT CHARACTER SET utf8 ;
USE `easyticket` ;

-- -----------------------------------------------------
-- Table `easyticket`.`cursos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`cursos` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`cursos` (
  `idCurso` INT(11) NOT NULL AUTO_INCREMENT ,
  `nomeCurso` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idCurso`) )
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;

CREATE UNIQUE INDEX `idCursos_UNIQUE` ON `easyticket`.`cursos` (`idCurso` ASC) ;


-- -----------------------------------------------------
-- Table `easyticket`.`alunos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`alunos` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`alunos` (
  `idAluno` INT(11) NOT NULL AUTO_INCREMENT ,
  `nomeAluno` VARCHAR(55) NOT NULL ,
  `cpfAluno` VARCHAR(14) NOT NULL ,
  `emailAluno` VARCHAR(45) NOT NULL ,
  `telefoneAluno` VARCHAR(13) NOT NULL ,
  `dataNascimentoAluno` DATE NOT NULL ,
  `statusAluno` ENUM('ATIVO','INATIVO') NOT NULL ,
  `inicioCursoAluno` DATE NOT NULL ,
  `terminoCursoAluno` VARCHAR(45) NULL DEFAULT NULL ,
  `idCursoAluno` INT(11) NOT NULL ,
  PRIMARY KEY (`idAluno`) ,
  CONSTRAINT `idCursoAluno`
    FOREIGN KEY (`idCursoAluno` )
    REFERENCES `easyticket`.`cursos` (`idCurso` )
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE UNIQUE INDEX `idAluno_UNIQUE` ON `easyticket`.`alunos` (`idAluno` ASC) ;

CREATE UNIQUE INDEX `cpfAluno_UNIQUE` ON `easyticket`.`alunos` (`cpfAluno` ASC) ;

CREATE UNIQUE INDEX `emailAluno_UNIQUE` ON `easyticket`.`alunos` (`emailAluno` ASC) ;

CREATE INDEX `idCursoAluno_idx` ON `easyticket`.`alunos` (`idCursoAluno` ASC) ;


-- -----------------------------------------------------
-- Table `easyticket`.`cargos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`cargos` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`cargos` (
  `idCargos` INT(11) NOT NULL AUTO_INCREMENT ,
  `nomeCargo` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idCargos`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE UNIQUE INDEX `idCargos_UNIQUE` ON `easyticket`.`cargos` (`idCargos` ASC) ;

CREATE UNIQUE INDEX `nomeCargo_UNIQUE` ON `easyticket`.`cargos` (`nomeCargo` ASC) ;


-- -----------------------------------------------------
-- Table `easyticket`.`cartoes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`cartoes` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`cartoes` (
  `numCartao` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `statusCartao` ENUM('ATIVO','INATIVO','BLOQUEADO') NOT NULL ,
  `saldoCartao` FLOAT NOT NULL DEFAULT '0' ,
  `idAlunoCartao` INT(11) NOT NULL ,
  PRIMARY KEY (`numCartao`) ,
  CONSTRAINT `idAlunoCartao`
    FOREIGN KEY (`idAlunoCartao` )
    REFERENCES `easyticket`.`alunos` (`idAluno` )
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE INDEX `idAlunoCartao_idx` ON `easyticket`.`cartoes` (`idAlunoCartao` ASC) ;


-- -----------------------------------------------------
-- Table `easyticket`.`funcionarios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`funcionarios` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`funcionarios` (
  `idFuncionarios` INT(11) NOT NULL AUTO_INCREMENT ,
  `nomeFuncionario` VARCHAR(55) NOT NULL ,
  `cpfFuncionario` VARCHAR(14) NOT NULL ,
  `emailFuncionario` VARCHAR(45) NOT NULL ,
  `telefoneFuncionario` VARCHAR(13) NOT NULL ,
  `dataNascimentoFuncionario` DATE NOT NULL ,
  `statusFuncionario` ENUM('ATIVO','INATIVO') NOT NULL ,
  `idCargoFuncionario` INT(11) NOT NULL ,
  PRIMARY KEY (`idFuncionarios`) ,
  CONSTRAINT `idCargosFuncionarios`
    FOREIGN KEY (`idCargoFuncionario` )
    REFERENCES `easyticket`.`cargos` (`idCargos` )
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE UNIQUE INDEX `idFuncionarios_UNIQUE` ON `easyticket`.`funcionarios` (`idFuncionarios` ASC) ;

CREATE UNIQUE INDEX `cpfFuncionario_UNIQUE` ON `easyticket`.`funcionarios` (`cpfFuncionario` ASC) ;

CREATE INDEX `idCargosFuncionarios_idx` ON `easyticket`.`funcionarios` (`idCargoFuncionario` ASC) ;



-- -----------------------------------------------------
-- Table `easyticket`.`refeicoes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`refeicoes` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`refeicoes` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `tipo` VARCHAR(25) NOT NULL ,
  `preco` FLOAT NOT NULL ,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `easyticket`.`recargas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `easyticket`.`recargas` ;

CREATE  TABLE IF NOT EXISTS `easyticket`.`recargas` (
  `idRecarga` INT(10) NOT NULL AUTO_INCREMENT ,
  `dataRecarga` DATETIME NOT NULL ,
  `valorRecarga` FLOAT NOT NULL ,
  `numCartaoRecarga` INT(11) NOT NULL ,
  PRIMARY KEY (`idRecarga`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE UNIQUE INDEX `idRecarga_UNIQUE` ON `easyticket`.`recargas` (`idRecarga` ASC) ;

USE `easyticket` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
