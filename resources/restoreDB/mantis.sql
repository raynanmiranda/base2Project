-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 26-Mar-2019 às 02:24
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mantis`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_api_token_table`
--

CREATE TABLE `mantis_api_token_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `name` varchar(128) NOT NULL,
  `hash` varchar(128) NOT NULL,
  `date_created` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `date_used` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bugnote_table`
--

CREATE TABLE `mantis_bugnote_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `reporter_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `bugnote_text_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `view_state` smallint(6) NOT NULL DEFAULT '10',
  `note_type` int(11) DEFAULT '0',
  `note_attr` varchar(250) DEFAULT '',
  `time_tracking` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `last_modified` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `date_submitted` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bugnote_text_table`
--

CREATE TABLE `mantis_bugnote_text_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `note` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_file_table`
--

CREATE TABLE `mantis_bug_file_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `title` varchar(250) NOT NULL DEFAULT '',
  `description` varchar(250) NOT NULL DEFAULT '',
  `diskfile` varchar(250) NOT NULL DEFAULT '',
  `filename` varchar(250) NOT NULL DEFAULT '',
  `folder` varchar(250) NOT NULL DEFAULT '',
  `filesize` int(11) NOT NULL DEFAULT '0',
  `file_type` varchar(250) NOT NULL DEFAULT '',
  `content` longblob,
  `date_added` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_history_table`
--

CREATE TABLE `mantis_bug_history_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `field_name` varchar(64) NOT NULL,
  `old_value` varchar(255) NOT NULL,
  `new_value` varchar(255) NOT NULL,
  `type` smallint(6) NOT NULL DEFAULT '0',
  `date_modified` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_monitor_table`
--

CREATE TABLE `mantis_bug_monitor_table` (
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_relationship_table`
--

CREATE TABLE `mantis_bug_relationship_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `source_bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `destination_bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `relationship_type` smallint(6) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_revision_table`
--

CREATE TABLE `mantis_bug_revision_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `bug_id` int(10) UNSIGNED NOT NULL,
  `bugnote_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `user_id` int(10) UNSIGNED NOT NULL,
  `type` int(10) UNSIGNED NOT NULL,
  `value` longtext NOT NULL,
  `timestamp` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_table`
--

CREATE TABLE `mantis_bug_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `reporter_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `handler_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `duplicate_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `priority` smallint(6) NOT NULL DEFAULT '30',
  `severity` smallint(6) NOT NULL DEFAULT '50',
  `reproducibility` smallint(6) NOT NULL DEFAULT '10',
  `status` smallint(6) NOT NULL DEFAULT '10',
  `resolution` smallint(6) NOT NULL DEFAULT '10',
  `projection` smallint(6) NOT NULL DEFAULT '10',
  `eta` smallint(6) NOT NULL DEFAULT '10',
  `bug_text_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `os` varchar(32) NOT NULL DEFAULT '',
  `os_build` varchar(32) NOT NULL DEFAULT '',
  `platform` varchar(32) NOT NULL DEFAULT '',
  `version` varchar(64) NOT NULL DEFAULT '',
  `fixed_in_version` varchar(64) NOT NULL DEFAULT '',
  `build` varchar(32) NOT NULL DEFAULT '',
  `profile_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `view_state` smallint(6) NOT NULL DEFAULT '10',
  `summary` varchar(128) NOT NULL DEFAULT '',
  `sponsorship_total` int(11) NOT NULL DEFAULT '0',
  `sticky` tinyint(4) NOT NULL DEFAULT '0',
  `target_version` varchar(64) NOT NULL DEFAULT '',
  `category_id` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `date_submitted` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `due_date` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `last_updated` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_tag_table`
--

CREATE TABLE `mantis_bug_tag_table` (
  `bug_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `tag_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `date_attached` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_bug_text_table`
--

CREATE TABLE `mantis_bug_text_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `description` longtext NOT NULL,
  `steps_to_reproduce` longtext NOT NULL,
  `additional_information` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_category_table`
--

CREATE TABLE `mantis_category_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `name` varchar(128) NOT NULL DEFAULT '',
  `status` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_category_table`
--

INSERT INTO `mantis_category_table` (`id`, `project_id`, `user_id`, `name`, `status`) VALUES
(1, 0, 0, 'General', 0),
(11, 0, 0, 'newcategory2', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_config_table`
--

CREATE TABLE `mantis_config_table` (
  `config_id` varchar(64) NOT NULL,
  `project_id` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) NOT NULL DEFAULT '0',
  `access_reqd` int(11) DEFAULT '0',
  `type` int(11) DEFAULT '90',
  `value` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_config_table`
--

INSERT INTO `mantis_config_table` (`config_id`, `project_id`, `user_id`, `access_reqd`, `type`, `value`) VALUES
('database_version', 0, 0, 90, 1, '209');

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_custom_field_project_table`
--

CREATE TABLE `mantis_custom_field_project_table` (
  `field_id` int(11) NOT NULL DEFAULT '0',
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `sequence` smallint(6) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_custom_field_string_table`
--

CREATE TABLE `mantis_custom_field_string_table` (
  `field_id` int(11) NOT NULL DEFAULT '0',
  `bug_id` int(11) NOT NULL DEFAULT '0',
  `value` varchar(255) NOT NULL DEFAULT '',
  `text` longtext
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_custom_field_table`
--

CREATE TABLE `mantis_custom_field_table` (
  `id` int(11) NOT NULL,
  `name` varchar(64) NOT NULL DEFAULT '',
  `type` smallint(6) NOT NULL DEFAULT '0',
  `possible_values` text,
  `default_value` varchar(255) NOT NULL DEFAULT '',
  `valid_regexp` varchar(255) NOT NULL DEFAULT '',
  `access_level_r` smallint(6) NOT NULL DEFAULT '0',
  `access_level_rw` smallint(6) NOT NULL DEFAULT '0',
  `length_min` int(11) NOT NULL DEFAULT '0',
  `length_max` int(11) NOT NULL DEFAULT '0',
  `require_report` tinyint(4) NOT NULL DEFAULT '0',
  `require_update` tinyint(4) NOT NULL DEFAULT '0',
  `display_report` tinyint(4) NOT NULL DEFAULT '0',
  `display_update` tinyint(4) NOT NULL DEFAULT '1',
  `require_resolved` tinyint(4) NOT NULL DEFAULT '0',
  `display_resolved` tinyint(4) NOT NULL DEFAULT '0',
  `display_closed` tinyint(4) NOT NULL DEFAULT '0',
  `require_closed` tinyint(4) NOT NULL DEFAULT '0',
  `filter_by` tinyint(4) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_email_table`
--

CREATE TABLE `mantis_email_table` (
  `email_id` int(10) UNSIGNED NOT NULL,
  `email` varchar(64) NOT NULL DEFAULT '',
  `subject` varchar(250) NOT NULL DEFAULT '',
  `metadata` longtext NOT NULL,
  `body` longtext NOT NULL,
  `submitted` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_email_table`
--

INSERT INTO `mantis_email_table` (`email_id`, `email`, `subject`, `metadata`, `body`, `submitted`) VALUES
(1, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=2&confirm_hash=ss-7xgwnruxDu3siAvZQ4ymvvpyBrjdnlr84p5wDcxp9enPjBAlxWZhHEbgc_68XhGUoXIZAnZPYiLawecdg\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1550797033),
(2, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=xJd9KRcnSNdDGSV39zWBNp5JBZD2IEMCAEATuvoC5ZhUm0bVq5aBpEruGdGWTBHb-WJsv8G52_qAiDmh8bax \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1552006051),
(3, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=Aq6jdSmKjhb_EVYfkXEvUdYSksN5C_I4wavT1l7V9PRMqzB4laGcUUk999A-zyYI3mx6786xYjWM67Qq8j_U \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1552241031),
(4, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=kuddasTF-1GiTjm_gD55AoQeaQIInC7eXNfwzi6SnBrXlAZ2r7ccpJrxnvQHhIvuTPnzMt7vJf0Oz5qSV_iT \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1552241249),
(5, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=3&confirm_hash=YTisLMI_V3pt_rGfRdb534xxEmjQZaTomF-hQCdbKPYH06yPm_jW5bbfMfCGKQCeAHxg67KHH2iQFTlRnx0w\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1552241501),
(6, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=4&confirm_hash=O4bNcLBFCuhzI3UxENPaSuQewgAhsIFCGyuChQRLQOJVGXSe5KgExIRkgqkG9ZXOWIC7BDuIoZ-GeisQDcVd\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1552260169),
(7, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=a1TfmlF18mH8GBtQscExAYyxaJWAM2dkrBEvKYOGn7nFvFEiTInUdOVAqf_6z-oA4U-ibBOuFWj3yhOnoC9G \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1552442800),
(8, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=WEZm1qr0mNzR9lZrKQQzRPusV42r1a8bxPIAA_eZB--DVgZ7d-LtQnhLqfJ8v6uxXWLz8SKMTCUreF5zCmBb \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1552530881),
(9, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=5&confirm_hash=cKw_-2Qsabd2cgFfilrhLAI6s0LSl-4mj84fVyggk5SrhvKw6_6H0XRVyFy582Bx618qR3d_pQgZDnrrWtu-\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553045118),
(10, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=6&confirm_hash=Dp_ju6HRXqEf1W10smkTOeFwKV1uex0-8yE0rtY7RBjgxww9ete4PBKRYeojrevwCav4Y8fPcwOiZ7PxgsTU\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553045197),
(11, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=7&confirm_hash=8q-jYOF94f53LIbe42xL88HnS6afFLR5MHn0aEAwU7zSw6CfqMB3smxPam5idu-tlW7pQvL3WqKsp2hKHS-W\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553130746),
(12, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=8&confirm_hash=b398FkoXPD-bqfRGSB7qAkJoKqPFt_Z6J9FT7xmOgFiAL6K9E_Yjmlk4HmvX7t5a8ODhYJaPh0UrnwZqBKB6\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553130818),
(13, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=9&confirm_hash=BP-YWMaZiRk_lGvc7VXFw3QRmZcK-mgkmddAnOx1pnKMoSPAaL7BT5sokndMt0Ri3mES50bc-RDwDb17wXLx\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553132230),
(14, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=10&confirm_hash=kMObLWX4Ih9gp9_8W7nenthzp_VuXWXLU3Zf36hvXitbi5fFX9H_UEM8EzZTrzxjWvnK9q1HCJrX_tIK66tU\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553132295),
(15, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=11&confirm_hash=xwyj1I_h2MR1MrMflb7qlTnRA8dHvpz_j68PMT66z8LVwPqsWo8ksdK1oKhzqfkG6-DE0zwCGagN1Gj4Bj7l\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553132616),
(16, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=12&confirm_hash=HZTuiy8rv8sBO0nMbEVE9dXMsBqP3zbJO-s6F5bpgVcBaNKLXMR2OpsxLnYDhHS0au-oS_ETe9p5w5qLFKOX\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553132705),
(17, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=jxhKbnMCq6n6L2LnpRzyuVCCqMs1icoygeEpnhvvJcsh5g3X3GvdsJH3iTq9Zv04JmFhUPdVPYiXhGSSvADN \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1553363608),
(18, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=HqRZQP6HoD1WQ05nSRFENM50gwvMKXiWhRQNtkjpWvhKuVG7HTUOcc_-6B4GArVGz7gQORpjYnuNnB0pOFIx \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1553364744),
(19, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=13&confirm_hash=OoOso5sD9obHYej6LYd3_tNJhjcDAylfzOQswvtHhPQbTwJmQPG-PhVCXlna276_pmuoIyINhDPU75QiD6ra\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553365045),
(20, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=14&confirm_hash=6XXZ1M9XFLS70Z3KY9uIqjkyxKG1RBo19u1rvVD2U74qe-lEJPaB32GpiAJ34SdEnTkcE8hTnySeM9satBk9\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553365141),
(21, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=15&confirm_hash=bM3His7pLk5l4VKviQhXDm6qNexD0hHyYIatbGLN7hBsVdeDgHFhXEhn_h81VTU6qwzz7Y75V1aJh1JwL_Hn\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553372702),
(22, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=16&confirm_hash=DmK9rXDmIH0BmAYbVSD-4N2uESOfqaEnUgh3eo-fKOosR1sMziCYYCpUf0XK206q9USc9Lx5kqLE_jkUGbGp\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553372779),
(23, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=XYLlRvmmXTztpygLOegJU7uAJ7N77mQzBnqNiSseykxi4i-PcrkC2ry-sCN8IyuB5eM8S9IpgntjWkaxz_uz \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1553439341),
(24, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=cHl-tju3evvIM0w695S2TD7zyU4g7GaxJb04_lNrxtWtIhqVJN1oOuW_9u3LV0vtNcuroizIx7bZ63sRQTkV \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1553447574),
(25, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=17&confirm_hash=4gXZq_yLL0CgXGb81zpelGKiDmxP253CmuTnU_uK7LU-PzAMqVP0a3cFtHXVTrFGp1QqqGI-qLNxH6CS_wqi\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553447862),
(26, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=18&confirm_hash=TOjwIi3vO5dXjsiV4gbhCk7fiMhHmD_3s4LnW7qROIH2xCmTCZlx6Pbj5LbWrGRX29hrQLduy6G_LNcyZxNA\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553447959),
(27, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=uO8iQM_DigcHBW1g-iVODjSiZ0-oNLZeYvUKRDHliSggiRtVZB_--RS4-5fXpl1YTiKgGiisOm1TsIvcxf64 \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1553451136),
(28, 'raynan.miranda@base2.com.br', '[MantisBT] Password Reset', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'Someone (presumably you) requested a password change through e-mail verification. If this was not you, ignore this message and nothing will happen.\n\nIf you requested this verification, visit the following URL to change your password: \n\nhttp://localhost/mantis/verify.php?id=1&confirm_hash=qGj8OaqLEnJGWhivJ6bX4ddasUHjZyZZ2uMrKyFjuEa9dHvhBxLd77VQLui1WG-9SvrGJMYiwmWpkmrpRsXR \n\nUsername: administrator \nRemote IP address: ::1 \n\nDo not reply to this message', 1553453289),
(29, 'teste1@teste1.com', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"testUser\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=19&confirm_hash=oxXD0M1-cd79WL_V5-dPZdSvv1z29e1HesU2iW8mcDB0LzQAZXlP43hwl9l74bv2EyLv7QwzVx1kTPAwGJxL\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553455223),
(30, 'raynan@base2.com.br', '[MantisBT] Account registration', 'a:3:{s:7:\"headers\";a:0:{}s:7:\"charset\";s:5:\"utf-8\";s:8:\"hostname\";s:9:\"localhost\";}', 'The user administrator has created an account for you with username \"test1\". In order to complete your registration, visit the following URL (make sure it is entered as the single line) and set your own access password:\n\nhttp://localhost/mantis/verify.php?id=20&confirm_hash=veibQxt93vXRYbpCbVqwvv92M9nAczhEDuCh5ptP18JW0gnh_VIcvOwr6edRDoqa8jmaYrYMfTsF9FrClUXw\n\nIf you did not request any registration, ignore this message and nothing will happen.\n\nDo not reply to this message', 1553455292);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_filters_table`
--

CREATE TABLE `mantis_filters_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(11) NOT NULL DEFAULT '0',
  `project_id` int(11) NOT NULL DEFAULT '0',
  `is_public` tinyint(4) DEFAULT NULL,
  `name` varchar(64) NOT NULL DEFAULT '',
  `filter_string` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_filters_table`
--

INSERT INTO `mantis_filters_table` (`id`, `user_id`, `project_id`, `is_public`, `name`, `filter_string`) VALUES
(1, 1, -7, 0, '', 'v9#{\"_version\":\"v9\",\"_view_type\":\"simple\",\"category_id\":[\"0\"],\"severity\":[0],\"status\":[0],\"highlight_changed\":6,\"reporter_id\":[0],\"handler_id\":[0],\"project_id\":[-3],\"resolution\":[0],\"build\":[\"0\"],\"version\":[\"0\"],\"hide_status\":[90],\"monitor_user_id\":[0],\"sort\":\"last_updated\",\"dir\":\"DESC\",\"per_page\":50,\"match_type\":0,\"platform\":[\"0\"],\"os\":[\"0\"],\"os_build\":[\"0\"],\"fixed_in_version\":[\"0\"],\"target_version\":[\"0\"],\"profile_id\":[0],\"priority\":[0],\"note_user_id\":[0],\"sticky\":true,\"filter_by_date\":false,\"start_month\":\"03\",\"end_month\":\"03\",\"start_day\":1,\"end_day\":\"19\",\"start_year\":\"2019\",\"end_year\":\"2019\",\"filter_by_last_updated_date\":false,\"last_updated_start_month\":\"03\",\"last_updated_end_month\":\"03\",\"last_updated_start_day\":1,\"last_updated_end_day\":\"19\",\"last_updated_start_year\":\"2019\",\"last_updated_end_year\":\"2019\",\"search\":\"\",\"view_state\":0,\"tag_string\":\"\",\"tag_select\":0,\"relationship_type\":-1,\"relationship_bug\":0,\"custom_fields\":[]}'),
(2, 1, -8, 0, '', 'v9#{\"_version\":\"v9\",\"_view_type\":\"simple\",\"category_id\":[\"0\"],\"severity\":[0],\"status\":[0],\"highlight_changed\":6,\"reporter_id\":[0],\"handler_id\":[0],\"project_id\":[-3],\"resolution\":[0],\"build\":[\"0\"],\"version\":[\"0\"],\"hide_status\":[90],\"monitor_user_id\":[0],\"sort\":\"last_updated\",\"dir\":\"DESC\",\"per_page\":50,\"match_type\":0,\"platform\":[\"0\"],\"os\":[\"0\"],\"os_build\":[\"0\"],\"fixed_in_version\":[\"0\"],\"target_version\":[\"0\"],\"profile_id\":[0],\"priority\":[0],\"note_user_id\":[0],\"sticky\":true,\"filter_by_date\":false,\"start_month\":\"03\",\"end_month\":\"03\",\"start_day\":1,\"end_day\":\"20\",\"start_year\":\"2019\",\"end_year\":\"2019\",\"filter_by_last_updated_date\":false,\"last_updated_start_month\":\"03\",\"last_updated_end_month\":\"03\",\"last_updated_start_day\":1,\"last_updated_end_day\":\"20\",\"last_updated_start_year\":\"2019\",\"last_updated_end_year\":\"2019\",\"search\":\"\",\"view_state\":0,\"tag_string\":\"\",\"tag_select\":0,\"relationship_type\":-1,\"relationship_bug\":0,\"custom_fields\":[]}'),
(3, 1, -10, 0, '', 'v9#{\"_version\":\"v9\",\"_view_type\":\"simple\",\"category_id\":[\"0\"],\"severity\":[0],\"status\":[0],\"highlight_changed\":6,\"reporter_id\":[0],\"handler_id\":[0],\"project_id\":[-3],\"resolution\":[0],\"build\":[\"0\"],\"version\":[\"0\"],\"hide_status\":[90],\"monitor_user_id\":[0],\"sort\":\"last_updated\",\"dir\":\"DESC\",\"per_page\":50,\"match_type\":0,\"platform\":[\"0\"],\"os\":[\"0\"],\"os_build\":[\"0\"],\"fixed_in_version\":[\"0\"],\"target_version\":[\"0\"],\"profile_id\":[0],\"priority\":[0],\"note_user_id\":[0],\"sticky\":true,\"filter_by_date\":false,\"start_month\":\"03\",\"end_month\":\"03\",\"start_day\":1,\"end_day\":\"20\",\"start_year\":\"2019\",\"end_year\":\"2019\",\"filter_by_last_updated_date\":false,\"last_updated_start_month\":\"03\",\"last_updated_end_month\":\"03\",\"last_updated_start_day\":1,\"last_updated_end_day\":\"20\",\"last_updated_start_year\":\"2019\",\"last_updated_end_year\":\"2019\",\"search\":\"\",\"view_state\":0,\"tag_string\":\"\",\"tag_select\":0,\"relationship_type\":-1,\"relationship_bug\":0,\"custom_fields\":[]}'),
(4, 1, -9, 0, '', 'v9#{\"_version\":\"v9\",\"_view_type\":\"simple\",\"category_id\":[\"0\"],\"severity\":[0],\"status\":[0],\"highlight_changed\":6,\"reporter_id\":[0],\"handler_id\":[0],\"project_id\":[-3],\"resolution\":[0],\"build\":[\"0\"],\"version\":[\"0\"],\"hide_status\":[90],\"monitor_user_id\":[0],\"sort\":\"last_updated\",\"dir\":\"DESC\",\"per_page\":50,\"match_type\":0,\"platform\":[\"0\"],\"os\":[\"0\"],\"os_build\":[\"0\"],\"fixed_in_version\":[\"0\"],\"target_version\":[\"0\"],\"profile_id\":[0],\"priority\":[0],\"note_user_id\":[0],\"sticky\":true,\"filter_by_date\":false,\"start_month\":\"03\",\"end_month\":\"03\",\"start_day\":1,\"end_day\":\"20\",\"start_year\":\"2019\",\"end_year\":\"2019\",\"filter_by_last_updated_date\":false,\"last_updated_start_month\":\"03\",\"last_updated_end_month\":\"03\",\"last_updated_start_day\":1,\"last_updated_end_day\":\"20\",\"last_updated_start_year\":\"2019\",\"last_updated_end_year\":\"2019\",\"search\":\"\",\"view_state\":0,\"tag_string\":\"\",\"tag_select\":0,\"relationship_type\":-1,\"relationship_bug\":0,\"custom_fields\":[],\"_source_query_id\":4}'),
(5, 1, -12, 0, '', 'v9#{\"_version\":\"v9\",\"_view_type\":\"simple\",\"category_id\":[\"0\"],\"severity\":[0],\"status\":[0],\"highlight_changed\":6,\"reporter_id\":[0],\"handler_id\":[0],\"project_id\":[-3],\"resolution\":[0],\"build\":[\"0\"],\"version\":[\"0\"],\"hide_status\":[90],\"monitor_user_id\":[0],\"sort\":\"last_updated\",\"dir\":\"DESC\",\"per_page\":50,\"match_type\":0,\"platform\":[\"0\"],\"os\":[\"0\"],\"os_build\":[\"0\"],\"fixed_in_version\":[\"0\"],\"target_version\":[\"0\"],\"profile_id\":[0],\"priority\":[0],\"note_user_id\":[0],\"sticky\":true,\"filter_by_date\":false,\"start_month\":\"03\",\"end_month\":\"03\",\"start_day\":1,\"end_day\":\"23\",\"start_year\":\"2019\",\"end_year\":\"2019\",\"filter_by_last_updated_date\":false,\"last_updated_start_month\":\"03\",\"last_updated_end_month\":\"03\",\"last_updated_start_day\":1,\"last_updated_end_day\":\"23\",\"last_updated_start_year\":\"2019\",\"last_updated_end_year\":\"2019\",\"search\":\"\",\"view_state\":0,\"tag_string\":\"\",\"tag_select\":0,\"relationship_type\":-1,\"relationship_bug\":0,\"custom_fields\":[]}');

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_news_table`
--

CREATE TABLE `mantis_news_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `poster_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `view_state` smallint(6) NOT NULL DEFAULT '10',
  `announcement` tinyint(4) NOT NULL DEFAULT '0',
  `headline` varchar(64) NOT NULL DEFAULT '',
  `body` longtext NOT NULL,
  `last_modified` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `date_posted` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_plugin_table`
--

CREATE TABLE `mantis_plugin_table` (
  `basename` varchar(40) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '0',
  `protected` tinyint(4) NOT NULL DEFAULT '0',
  `priority` int(10) UNSIGNED NOT NULL DEFAULT '3'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_plugin_table`
--

INSERT INTO `mantis_plugin_table` (`basename`, `enabled`, `protected`, `priority`) VALUES
('MantisCoreFormatting', 1, 0, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_project_file_table`
--

CREATE TABLE `mantis_project_file_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `title` varchar(250) NOT NULL DEFAULT '',
  `description` varchar(250) NOT NULL DEFAULT '',
  `diskfile` varchar(250) NOT NULL DEFAULT '',
  `filename` varchar(250) NOT NULL DEFAULT '',
  `folder` varchar(250) NOT NULL DEFAULT '',
  `filesize` int(11) NOT NULL DEFAULT '0',
  `file_type` varchar(250) NOT NULL DEFAULT '',
  `content` longblob,
  `date_added` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_project_hierarchy_table`
--

CREATE TABLE `mantis_project_hierarchy_table` (
  `child_id` int(10) UNSIGNED NOT NULL,
  `parent_id` int(10) UNSIGNED NOT NULL,
  `inherit_parent` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_project_table`
--

CREATE TABLE `mantis_project_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(128) NOT NULL DEFAULT '',
  `status` smallint(6) NOT NULL DEFAULT '10',
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  `view_state` smallint(6) NOT NULL DEFAULT '10',
  `access_min` smallint(6) NOT NULL DEFAULT '10',
  `file_path` varchar(250) NOT NULL DEFAULT '',
  `description` longtext NOT NULL,
  `category_id` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `inherit_global` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_project_table`
--

INSERT INTO `mantis_project_table` (`id`, `name`, `status`, `enabled`, `view_state`, `access_min`, `file_path`, `description`, `category_id`, `inherit_global`) VALUES
(9, 'testNewProject1', 10, 1, 10, 10, '', '', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_project_user_list_table`
--

CREATE TABLE `mantis_project_user_list_table` (
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `access_level` smallint(6) NOT NULL DEFAULT '10'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_project_version_table`
--

CREATE TABLE `mantis_project_version_table` (
  `id` int(11) NOT NULL,
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `version` varchar(64) NOT NULL DEFAULT '',
  `description` longtext NOT NULL,
  `released` tinyint(4) NOT NULL DEFAULT '1',
  `obsolete` tinyint(4) NOT NULL DEFAULT '0',
  `date_order` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_sponsorship_table`
--

CREATE TABLE `mantis_sponsorship_table` (
  `id` int(11) NOT NULL,
  `bug_id` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) NOT NULL DEFAULT '0',
  `amount` int(11) NOT NULL DEFAULT '0',
  `logo` varchar(128) NOT NULL DEFAULT '',
  `url` varchar(128) NOT NULL DEFAULT '',
  `paid` tinyint(4) NOT NULL DEFAULT '0',
  `date_submitted` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `last_updated` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_tag_table`
--

CREATE TABLE `mantis_tag_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `name` varchar(100) NOT NULL DEFAULT '',
  `description` longtext NOT NULL,
  `date_created` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `date_updated` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_tag_table`
--

INSERT INTO `mantis_tag_table` (`id`, `user_id`, `name`, `description`, `date_created`, `date_updated`) VALUES
(6, 1, 'testMarker2', '', 1553459781, 1553459781),
(7, 1, 'newcategory3Updated', '', 1553459796, 1553459796);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_tokens_table`
--

CREATE TABLE `mantis_tokens_table` (
  `id` int(11) NOT NULL,
  `owner` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `value` longtext NOT NULL,
  `timestamp` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `expiry` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_tokens_table`
--

INSERT INTO `mantis_tokens_table` (`id`, `owner`, `type`, `value`, `timestamp`, `expiry`) VALUES
(24, 5, 7, 'cKw_-2Qsabd2cgFfilrhLAI6s0LSl-4mj84fVyggk5SrhvKw6_6H0XRVyFy582Bx618qR3d_pQgZDnrrWtu-', 1553045117, 1553649917),
(26, 6, 7, 'Dp_ju6HRXqEf1W10smkTOeFwKV1uex0-8yE0rtY7RBjgxww9ete4PBKRYeojrevwCav4Y8fPcwOiZ7PxgsTU', 1553045197, 1553649997),
(29, 7, 7, '8q-jYOF94f53LIbe42xL88HnS6afFLR5MHn0aEAwU7zSw6CfqMB3smxPam5idu-tlW7pQvL3WqKsp2hKHS-W', 1553130746, 1553735546),
(30, 8, 7, 'b398FkoXPD-bqfRGSB7qAkJoKqPFt_Z6J9FT7xmOgFiAL6K9E_Yjmlk4HmvX7t5a8ODhYJaPh0UrnwZqBKB6', 1553130818, 1553735618),
(33, 9, 7, 'BP-YWMaZiRk_lGvc7VXFw3QRmZcK-mgkmddAnOx1pnKMoSPAaL7BT5sokndMt0Ri3mES50bc-RDwDb17wXLx', 1553132229, 1553737029),
(34, 10, 7, 'kMObLWX4Ih9gp9_8W7nenthzp_VuXWXLU3Zf36hvXitbi5fFX9H_UEM8EzZTrzxjWvnK9q1HCJrX_tIK66tU', 1553132295, 1553737095),
(35, 11, 7, 'xwyj1I_h2MR1MrMflb7qlTnRA8dHvpz_j68PMT66z8LVwPqsWo8ksdK1oKhzqfkG6-DE0zwCGagN1Gj4Bj7l', 1553132616, 1553737416),
(36, 12, 7, 'HZTuiy8rv8sBO0nMbEVE9dXMsBqP3zbJO-s6F5bpgVcBaNKLXMR2OpsxLnYDhHS0au-oS_ETe9p5w5qLFKOX', 1553132705, 1553737505),
(40, 13, 7, 'OoOso5sD9obHYej6LYd3_tNJhjcDAylfzOQswvtHhPQbTwJmQPG-PhVCXlna276_pmuoIyINhDPU75QiD6ra', 1553365045, 1553969845),
(42, 14, 7, '6XXZ1M9XFLS70Z3KY9uIqjkyxKG1RBo19u1rvVD2U74qe-lEJPaB32GpiAJ34SdEnTkcE8hTnySeM9satBk9', 1553365140, 1553969940),
(46, 15, 7, 'bM3His7pLk5l4VKviQhXDm6qNexD0hHyYIatbGLN7hBsVdeDgHFhXEhn_h81VTU6qwzz7Y75V1aJh1JwL_Hn', 1553372702, 1553977502),
(47, 16, 7, 'DmK9rXDmIH0BmAYbVSD-4N2uESOfqaEnUgh3eo-fKOosR1sMziCYYCpUf0XK206q9USc9Lx5kqLE_jkUGbGp', 1553372779, 1553977579),
(53, 17, 7, '4gXZq_yLL0CgXGb81zpelGKiDmxP253CmuTnU_uK7LU-PzAMqVP0a3cFtHXVTrFGp1QqqGI-qLNxH6CS_wqi', 1553447862, 1554052662),
(54, 18, 7, 'TOjwIi3vO5dXjsiV4gbhCk7fiMhHmD_3s4LnW7qROIH2xCmTCZlx6Pbj5LbWrGRX29hrQLduy6G_LNcyZxNA', 1553447959, 1554052759),
(61, 19, 7, 'oxXD0M1-cd79WL_V5-dPZdSvv1z29e1HesU2iW8mcDB0LzQAZXlP43hwl9l74bv2EyLv7QwzVx1kTPAwGJxL', 1553455223, 1554060023),
(62, 20, 7, 'veibQxt93vXRYbpCbVqwvv92M9nAczhEDuCh5ptP18JW0gnh_VIcvOwr6edRDoqa8jmaYrYMfTsF9FrClUXw', 1553455292, 1554060092),
(64, 1, 4, '1', 1553562447, 1553562747);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_user_pref_table`
--

CREATE TABLE `mantis_user_pref_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `project_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `default_profile` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `default_project` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `refresh_delay` int(11) NOT NULL DEFAULT '0',
  `redirect_delay` int(11) NOT NULL DEFAULT '0',
  `bugnote_order` varchar(4) NOT NULL DEFAULT 'ASC',
  `email_on_new` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_assigned` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_feedback` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_resolved` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_closed` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_reopened` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_bugnote` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_status` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_priority` tinyint(4) NOT NULL DEFAULT '0',
  `email_on_priority_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_status_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_bugnote_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_reopened_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_closed_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_resolved_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_feedback_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_assigned_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_on_new_min_severity` smallint(6) NOT NULL DEFAULT '10',
  `email_bugnote_limit` smallint(6) NOT NULL DEFAULT '0',
  `language` varchar(32) NOT NULL DEFAULT 'english',
  `timezone` varchar(32) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_user_pref_table`
--

INSERT INTO `mantis_user_pref_table` (`id`, `user_id`, `project_id`, `default_profile`, `default_project`, `refresh_delay`, `redirect_delay`, `bugnote_order`, `email_on_new`, `email_on_assigned`, `email_on_feedback`, `email_on_resolved`, `email_on_closed`, `email_on_reopened`, `email_on_bugnote`, `email_on_status`, `email_on_priority`, `email_on_priority_min_severity`, `email_on_status_min_severity`, `email_on_bugnote_min_severity`, `email_on_reopened_min_severity`, `email_on_closed_min_severity`, `email_on_resolved_min_severity`, `email_on_feedback_min_severity`, `email_on_assigned_min_severity`, `email_on_new_min_severity`, `email_bugnote_limit`, `language`, `timezone`) VALUES
(1, 1, 0, 0, 9, 30, 2, 'ASC', 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'auto', 'America/Sao_Paulo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_user_print_pref_table`
--

CREATE TABLE `mantis_user_print_pref_table` (
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `print_pref` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_user_profile_table`
--

CREATE TABLE `mantis_user_profile_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `platform` varchar(32) NOT NULL DEFAULT '',
  `os` varchar(32) NOT NULL DEFAULT '',
  `os_build` varchar(32) NOT NULL DEFAULT '',
  `description` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mantis_user_table`
--

CREATE TABLE `mantis_user_table` (
  `id` int(10) UNSIGNED NOT NULL,
  `username` varchar(191) NOT NULL DEFAULT '',
  `realname` varchar(191) NOT NULL DEFAULT '',
  `email` varchar(191) NOT NULL DEFAULT '',
  `password` varchar(64) NOT NULL DEFAULT '',
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  `protected` tinyint(4) NOT NULL DEFAULT '0',
  `access_level` smallint(6) NOT NULL DEFAULT '10',
  `login_count` int(11) NOT NULL DEFAULT '0',
  `lost_password_request_count` smallint(6) NOT NULL DEFAULT '0',
  `failed_login_count` smallint(6) NOT NULL DEFAULT '0',
  `cookie_string` varchar(64) NOT NULL DEFAULT '',
  `last_visit` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `date_created` int(10) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `mantis_user_table`
--

INSERT INTO `mantis_user_table` (`id`, `username`, `realname`, `email`, `password`, `enabled`, `protected`, `access_level`, `login_count`, `lost_password_request_count`, `failed_login_count`, `cookie_string`, `last_visit`, `date_created`) VALUES
(1, 'administrator', 'Raynan Miranda', 'raynan.miranda@base2.com.br', '179ef0faa13c98b3ff84bba331268468', 1, 0, 90, 499, 0, 0, '6TSulcw1WpZN1wKFLTjdDodi52VCGzqDWoAJO35yTQm_EnNZNn3CnaJaxmKZdz61', 1553562447, 1546790724);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mantis_api_token_table`
--
ALTER TABLE `mantis_api_token_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_user_id_name` (`user_id`,`name`);

--
-- Indexes for table `mantis_bugnote_table`
--
ALTER TABLE `mantis_bugnote_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_bug` (`bug_id`),
  ADD KEY `idx_last_mod` (`last_modified`);

--
-- Indexes for table `mantis_bugnote_text_table`
--
ALTER TABLE `mantis_bugnote_text_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_bug_file_table`
--
ALTER TABLE `mantis_bug_file_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_bug_file_bug_id` (`bug_id`),
  ADD KEY `idx_diskfile` (`diskfile`);

--
-- Indexes for table `mantis_bug_history_table`
--
ALTER TABLE `mantis_bug_history_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_bug_history_bug_id` (`bug_id`),
  ADD KEY `idx_history_user_id` (`user_id`),
  ADD KEY `idx_bug_history_date_modified` (`date_modified`);

--
-- Indexes for table `mantis_bug_monitor_table`
--
ALTER TABLE `mantis_bug_monitor_table`
  ADD PRIMARY KEY (`user_id`,`bug_id`),
  ADD KEY `idx_bug_id` (`bug_id`);

--
-- Indexes for table `mantis_bug_relationship_table`
--
ALTER TABLE `mantis_bug_relationship_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_relationship_source` (`source_bug_id`),
  ADD KEY `idx_relationship_destination` (`destination_bug_id`);

--
-- Indexes for table `mantis_bug_revision_table`
--
ALTER TABLE `mantis_bug_revision_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_bug_rev_type` (`type`),
  ADD KEY `idx_bug_rev_id_time` (`bug_id`,`timestamp`);

--
-- Indexes for table `mantis_bug_table`
--
ALTER TABLE `mantis_bug_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_bug_sponsorship_total` (`sponsorship_total`),
  ADD KEY `idx_bug_fixed_in_version` (`fixed_in_version`),
  ADD KEY `idx_bug_status` (`status`),
  ADD KEY `idx_project` (`project_id`);

--
-- Indexes for table `mantis_bug_tag_table`
--
ALTER TABLE `mantis_bug_tag_table`
  ADD PRIMARY KEY (`bug_id`,`tag_id`),
  ADD KEY `idx_bug_tag_tag_id` (`tag_id`);

--
-- Indexes for table `mantis_bug_text_table`
--
ALTER TABLE `mantis_bug_text_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_category_table`
--
ALTER TABLE `mantis_category_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_category_project_name` (`project_id`,`name`);

--
-- Indexes for table `mantis_config_table`
--
ALTER TABLE `mantis_config_table`
  ADD PRIMARY KEY (`config_id`,`project_id`,`user_id`);

--
-- Indexes for table `mantis_custom_field_project_table`
--
ALTER TABLE `mantis_custom_field_project_table`
  ADD PRIMARY KEY (`field_id`,`project_id`);

--
-- Indexes for table `mantis_custom_field_string_table`
--
ALTER TABLE `mantis_custom_field_string_table`
  ADD PRIMARY KEY (`field_id`,`bug_id`),
  ADD KEY `idx_custom_field_bug` (`bug_id`);

--
-- Indexes for table `mantis_custom_field_table`
--
ALTER TABLE `mantis_custom_field_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_custom_field_name` (`name`);

--
-- Indexes for table `mantis_email_table`
--
ALTER TABLE `mantis_email_table`
  ADD PRIMARY KEY (`email_id`);

--
-- Indexes for table `mantis_filters_table`
--
ALTER TABLE `mantis_filters_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_news_table`
--
ALTER TABLE `mantis_news_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_plugin_table`
--
ALTER TABLE `mantis_plugin_table`
  ADD PRIMARY KEY (`basename`);

--
-- Indexes for table `mantis_project_file_table`
--
ALTER TABLE `mantis_project_file_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_project_hierarchy_table`
--
ALTER TABLE `mantis_project_hierarchy_table`
  ADD UNIQUE KEY `idx_project_hierarchy` (`child_id`,`parent_id`),
  ADD KEY `idx_project_hierarchy_child_id` (`child_id`),
  ADD KEY `idx_project_hierarchy_parent_id` (`parent_id`);

--
-- Indexes for table `mantis_project_table`
--
ALTER TABLE `mantis_project_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_project_name` (`name`),
  ADD KEY `idx_project_view` (`view_state`);

--
-- Indexes for table `mantis_project_user_list_table`
--
ALTER TABLE `mantis_project_user_list_table`
  ADD PRIMARY KEY (`project_id`,`user_id`),
  ADD KEY `idx_project_user` (`user_id`);

--
-- Indexes for table `mantis_project_version_table`
--
ALTER TABLE `mantis_project_version_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_project_version` (`project_id`,`version`);

--
-- Indexes for table `mantis_sponsorship_table`
--
ALTER TABLE `mantis_sponsorship_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_sponsorship_bug_id` (`bug_id`),
  ADD KEY `idx_sponsorship_user_id` (`user_id`);

--
-- Indexes for table `mantis_tag_table`
--
ALTER TABLE `mantis_tag_table`
  ADD PRIMARY KEY (`id`,`name`),
  ADD KEY `idx_tag_name` (`name`);

--
-- Indexes for table `mantis_tokens_table`
--
ALTER TABLE `mantis_tokens_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_typeowner` (`type`,`owner`);

--
-- Indexes for table `mantis_user_pref_table`
--
ALTER TABLE `mantis_user_pref_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_user_print_pref_table`
--
ALTER TABLE `mantis_user_print_pref_table`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `mantis_user_profile_table`
--
ALTER TABLE `mantis_user_profile_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mantis_user_table`
--
ALTER TABLE `mantis_user_table`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_user_cookie_string` (`cookie_string`),
  ADD UNIQUE KEY `idx_user_username` (`username`),
  ADD KEY `idx_enable` (`enabled`),
  ADD KEY `idx_access` (`access_level`),
  ADD KEY `idx_email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mantis_api_token_table`
--
ALTER TABLE `mantis_api_token_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bugnote_table`
--
ALTER TABLE `mantis_bugnote_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bugnote_text_table`
--
ALTER TABLE `mantis_bugnote_text_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bug_file_table`
--
ALTER TABLE `mantis_bug_file_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bug_history_table`
--
ALTER TABLE `mantis_bug_history_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bug_relationship_table`
--
ALTER TABLE `mantis_bug_relationship_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bug_revision_table`
--
ALTER TABLE `mantis_bug_revision_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bug_table`
--
ALTER TABLE `mantis_bug_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_bug_text_table`
--
ALTER TABLE `mantis_bug_text_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_category_table`
--
ALTER TABLE `mantis_category_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `mantis_custom_field_table`
--
ALTER TABLE `mantis_custom_field_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_email_table`
--
ALTER TABLE `mantis_email_table`
  MODIFY `email_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `mantis_filters_table`
--
ALTER TABLE `mantis_filters_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `mantis_news_table`
--
ALTER TABLE `mantis_news_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_project_file_table`
--
ALTER TABLE `mantis_project_file_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_project_table`
--
ALTER TABLE `mantis_project_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `mantis_project_version_table`
--
ALTER TABLE `mantis_project_version_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_sponsorship_table`
--
ALTER TABLE `mantis_sponsorship_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_tag_table`
--
ALTER TABLE `mantis_tag_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `mantis_tokens_table`
--
ALTER TABLE `mantis_tokens_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT for table `mantis_user_pref_table`
--
ALTER TABLE `mantis_user_pref_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `mantis_user_profile_table`
--
ALTER TABLE `mantis_user_profile_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mantis_user_table`
--
ALTER TABLE `mantis_user_table`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
