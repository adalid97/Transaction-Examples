# Transaction-Examples

```sql
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `direccion` (
  `id` int(11) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `codigoPostal` varchar(6) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  `provincia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `direccion` (`id`, `direccion`, `numero`, `codigoPostal`, `ciudad`, `provincia`) VALUES
(1, 'Calle A', 1, '41420', 'Fuentes de Andalucía', 'Sevilla');

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `persona` (`id`, `nombre`, `apellidos`) VALUES
(1, 'Jose Angel', 'Adalid López');

ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);
COMMIT;
```
