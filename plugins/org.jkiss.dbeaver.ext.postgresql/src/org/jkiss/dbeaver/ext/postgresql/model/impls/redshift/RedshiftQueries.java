            "   ,c.relname AS tablename\n" +
            "  UNION SELECT\n" +
            " ,seq\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "   c.oid::bigint as table_id\n" +
            "      THEN REPLACE(UPPER(format_type(a.atttypid, a.atttypmod)), 'CHARACTER VARYING', 'VARCHAR')\n" +
            "  INNER JOIN (SELECT\n" +
            "    ORDER BY seq\n" +
            "  group by 1,2,3,4 )\n" +
            "  INNER JOIN pg_attribute AS a ON c.oid = a.attrelid\n" +
            "  --TABLE OWNERSHIP AS AN ALTER TABLE STATMENT\n" +
            "   ,c.relname AS tablename\n" +
            "  \n" +
            "  --DROP TABLE\n" +
            "    ,100000000 + a.attnum AS seq\n" +
        "SELECT\n" +
            "FROM pg_namespace AS n\n" +
    public static final String DDL_EXTRACT_VIEW =
            "   ,'CREATE TABLE IF NOT EXISTS ' + QUOTE_IDENT(n.nspname) + '.' + QUOTE_IDENT(c.relname) + '' AS ddl\n" +
            "      THEN REPLACE(UPPER(format_type(a.atttypid, a.atttypmod)), 'CHARACTER', 'CHAR')\n" +
            "   ,' DISTKEY (' + QUOTE_IDENT(a.attname) + ')' AS ddl\n" +
 *     http://www.apache.org/licenses/LICENSE-2.0
            "   ,400000000 + a.attnum AS seq\n" +
            "   ,n.nspname AS schemaname\n" +
            "     WHEN STRPOS(UPPER(format_type(a.atttypid, a.atttypmod)), 'CHARACTER') > 0\n" +
            "  --OPEN PAREN COLUMN LIST\n" +
            "  UNION SELECT\n" +
            "  c.oid::bigint as table_id\n" +
            "    SPLIT_PART(key,'_',5) id\n" +
            "   ,CASE WHEN abs(a.attsortkeyord) = 1\n" +
            "      WHERE datname = current_database())) t ON t.id=c.oid\n" +
            "  UNION SELECT\n" +
            "  AND abs(a.attsortkeyord) > 0\n" +
            "   ,schemaname\n" +
            "  FROM pg_namespace AS n\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "   ,n.nspname AS schemaname\n" +
            "  INNER JOIN pg_attribute AS a ON c.oid = a.attrelid\n" +
            "  table_id\n" +
            "    ,CASE WHEN a.atthasdef IS TRUE THEN 'DEFAULT ' + adef.adsrc ELSE '' END AS col_default\n" +
            "   c.oid::bigint as table_id\n" +
            "   ,499999999 AS seq\n" +
            "  WHERE c.relkind = 'r'\n" +
            "  INNER JOIN pg_namespace AS n ON n.oid = c.relnamespace\n" +
            "    ,QUOTE_IDENT(a.attname) AS col_name\n" +
            "             AND c.oid = con.conrelid\n" +
            "   c.oid::bigint as table_id\n" +
            "  FROM pg_namespace AS n\n" +
            "   ORDER BY a.attnum\n" +
            " ORDER BY table_id,schemaname, tablename, seq\n" +
            "   ,n.nspname AS schemaname\n" +
            "  ORDER BY seq)\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "   ,c.relname AS tablename\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "      oid\n" +
            "    SPLIT_PART(key,'_',5) id\n" +
            "   INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "    AND a.attnum > 0\n" +
            "  FROM  pg_namespace AS n\n" +
            "   ,2 AS seq\n" +
            "   ,'\\t' + col_delim + col_name + ' ' + col_datatype + ' ' + col_nullable + ' ' + col_default + ' ' + col_encoding AS ddl\n" +

            "   ,n.nspname AS schemaname\n" +
            "  FROM  pg_namespace AS n\n" +
            "    THEN '\\t' + QUOTE_IDENT(a.attname)\n" +
            "    ,CASE WHEN a.attnotnull IS TRUE THEN 'NOT NULL' ELSE '' END AS col_nullable\n" +

            "  FROM  pg_namespace AS n\n" +
            "   ,c.relname AS tablename\n" +

            " ,ddl\n" +
            "   ,300000000 AS seq\n" +
            "   SELECT\n" +
            "  INNER JOIN  pg_class AS c ON n.oid = c.relnamespace\n" +
            "    END AS ddl\n" +
            "   ,n.nspname AS schemaname\n" +
            "       700000000 + CAST(con.oid AS INT) AS seq,\n" +
 */
            "    WHERE key LIKE 'pg_class_backup_%'\n" +

            "   c.oid::bigint as table_id\n" +
            "   c.oid::bigint as table_id\n" +
            "  (\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            " table_id\n" +
            "  FROM pg_namespace AS n\n" +
            "  UNION SELECT c.oid::bigint as table_id ,n.nspname AS schemaname, c.relname AS tablename, 600000000 AS seq, ';' AS ddl\n" +
            "  FROM pg_namespace AS n\n" +
 * See the License for the specific language governing permissions and
            "   INNER JOIN pg_attribute AS a ON c.oid = a.attrelid\n" +
            "  )\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
 */
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
            "FROM pg_namespace AS n\n" +
            "  --DISTKEY COLUMNS\n" +
            "     END AS col_encoding\n" +
            "  c.oid::bigint as table_id\n" +
            "  INNER JOIN pg_attribute AS a ON c.oid = a.attrelid\n" +
            "  FROM\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "  --END SEMICOLON\n" +
            "    AND abs(a.attsortkeyord) > 0\n" +
            "  UNION SELECT\n" +
            "   ,c.relname AS tablename\n" +
            "  UNION SELECT c.oid::bigint as table_id,n.nspname AS schemaname, c.relname AS tablename, 5 AS seq, '(' AS ddl\n" +
            "     ELSE 'ENCODE ' + format_encoding((a.attencodingtype)::integer)\n" +
            "   ,n.nspname AS schemaname\n" +
            "   ,n.nspname AS schemaname\n" +
            "             ON c.relnamespace = con.connamespace\n" +
            "   ,'BACKUP NO' as ddl\n" +
            "      INNER JOIN pg_class AS c\n" +
            "  SELECT\n" +
            "   ,0 AS seq\n" +
            "   (\n" +
            "  \n" +
            "   ,tablename\n" +
            "  UNION SELECT\n" +
            "  UNION SELECT\n" +
            "  WHERE c.relkind = 'r'\n" +
 * You may obtain a copy of the License at
            "     END AS col_datatype\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "    AND a.attnum > 0\n" +
            "    AND SPLIT_PART(key,'_',4) = (SELECT\n" +
            "  ,seq\n" +
 * distributed under the License is distributed on an "AS IS" BASIS,
public class RedshiftQueries {
            "    FROM pg_constraint AS con\n" +
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * https://github.com/awslabs/amazon-redshift-utils/blob/master/src/AdminViews/v_generate_tbl_ddl.sql
            "   ,c.relname AS tablename\n" +
            "  FROM pg_namespace AS n\n" +
            "  UNION select table_id,schemaname, tablename, seq,\n" +
            "   c.oid::bigint as table_id\n" +
            "FROM\n" +
            "    ELSE '<<Error - UNKNOWN DISTSTYLE>>'\n" +
            " ,REGEXP_REPLACE (schemaname, '^zzzzzzzz', '') AS schemaname\n" +
            "  WHERE c.relkind = 'r'\n" +
 * Licensed under the Apache License, Version 2.0 (the "License");
            "      WHERE datname = current_database())) t ON t.id=c.oid\n" +
            "  INNER JOIN pg_user AS u ON c.relowner = u.usesysid\n" +
}
            "  --DISTSTYLE\n" +
            "     ELSE UPPER(format_type(a.atttypid, a.atttypmod))\n" +
            "   ,200000000 + CAST(con.oid AS INT) AS seq\n" +
            "     THEN 'ENCODE RAW'\n" +
            "    SELECT c.oid::bigint as table_id,'zzzzzzzz' || n.nspname AS schemaname,\n" +
            "   ,599999999 AS seq\n" +
            "  UNION SELECT c.oid::bigint as table_id,n.nspname AS schemaname, c.relname AS tablename, 299999999 AS seq, ')' AS ddl\n" +
 * limitations under the License.
            "  ORDER BY abs(a.attsortkeyord))\n" +
            " (\n" +
            "  WHERE c.relkind = 'r'\n" +
            "    WHEN c.reldiststyle = 1 THEN 'DISTSTYLE KEY'\n" +
            "   ,c.relname AS tablename\n" +
            "  --SORTKEY COLUMNS\n" +
            "   ,n.nspname AS schemaname\n" +
            "  'ALTER TABLE ' + QUOTE_IDENT(n.nspname) + '.' + QUOTE_IDENT(c.relname) + ' owner to '+  QUOTE_IDENT(u.usename) +';' AS ddl\n" +
     */
            "    ,CASE WHEN format_encoding((a.attencodingtype)::integer) = 'none'\n" +
            "  WHERE c.relkind = 'r'\n" +
            "  --CLOSE PAREN COLUMN LIST\n" +
 *
            "       case when min_sort <0 then 'INTERLEAVED SORTKEY (' else ' SORTKEY (' end as ddl\n" +
            "  WHERE c.relkind = 'r' \n" +
            "       'ALTER TABLE ' + QUOTE_IDENT(n.nspname) + '.' + QUOTE_IDENT(c.relname) + ' ADD ' + pg_get_constraintdef(con.oid)::VARCHAR(1024) + ';' AS ddl\n" +
            "  --COLUMN LIST\n" +
            "  WHERE c.relkind = 'r'\n" +
 * DBeaver - Universal Database Manager
            "   c.oid::bigint as table_id\n" +
            "    FROM pg_conf\n" +
            " FROM\n" +
            "   ,'\\t)' AS ddl\n" +
            "    ,CASE WHEN STRPOS(UPPER(format_type(a.atttypid, a.atttypmod)), 'CHARACTER VARYING') > 0\n" +
            "   ,CASE WHEN c.reldiststyle = 0 THEN 'DISTSTYLE EVEN'\n" +
            "   ,c.relname AS tablename\n" +
            "  --BACKUP\n" +
            "  ,tablename\n" +
            "   ,c.relname AS tablename\n" +
            "  )\n" +
            "      INNER JOIN pg_namespace AS n ON n.oid = c.relnamespace\n" +
            "  FROM pg_namespace AS n\n" +
            "   ,1 AS seq\n" +
            "  --CONSTRAINT LIST\n" +
            "   ,300000001 AS seq\n" +
            "  UNION\n" +
            "      FROM pg_database\n" +
            "    WHERE c.relkind = 'r'\n" +
            "   ,'--DROP TABLE ' + QUOTE_IDENT(n.nspname) + '.' + QUOTE_IDENT(c.relname) + ';' AS ddl\n" +
            "  FROM pg_namespace AS n\n" +
            "  WHERE c.relkind = 'r'\n" +
            "   FROM pg_namespace AS n\n" +
            "  WHERE c.relkind = 'r'\n" +
            "    AND a.attnum > 0\n" +
            "    AND abs(a.attsortkeyord) > 0\n" +
            "   ,'--WARNING: This DDL inherited the BACKUP NO property from the source table' as ddl\n" +
            "    ,c.relname AS tablename\n" +
            "    END AS ddl\n" +
            "  ,ddl\n" +
/**
            "   ,min(attsortkeyord) min_sort FROM pg_namespace AS n\n" +
            "   ,n.nspname AS schemaname\n" +
            "      oid\n" +
 *
            "    FROM pg_conf\n" +
            "   WHERE c.relkind = 'r'\n" +
            "  INNER JOIN (SELECT\n" +
            "  AND a.attnum > 0\n" +
            "  INNER JOIN  pg_class AS c ON n.oid = c.relnamespace\n" +
            "  WHERE c.relkind = 'r'\n" +
            "      FROM pg_database\n" +
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "     AND a.attnum > 0\n" +
 * you may not use this file except in compliance with the License.
            "  WHERE c.relkind = 'r' AND pg_get_constraintdef(con.oid) NOT LIKE 'FOREIGN KEY%'\n" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ")";
            "    AND a.attisdistkey IS TRUE\n" +
            "       'zzzzzzzz' || c.relname AS tablename,\n" +
            " ,REGEXP_REPLACE (tablename, '^zzzzzzzz', '') AS tablename\n" +
            "  INNER JOIN pg_class AS c ON c.relnamespace = con.connamespace AND c.oid = con.conrelid\n" +
            "  --BACKUP WARNING\n" +
            "  WHERE c.relkind = 'r'\n" +
            "  INNER JOIN  pg_attribute AS a ON c.oid = a.attrelid\n" +
            "   ,500000000 + abs(a.attsortkeyord) AS seq\n" +
            "   ,seq\n" +
            "    c.oid::bigint as table_id\n" +
     * Slightly modified official AWS script for DDL:
            "  --CREATE TABLE\n" +
            "    AND con.contype = 'f'\n" +
            "   ,c.relname AS tablename\n" +
            "  UNION SELECT\n" +
            "    AND SPLIT_PART(key,'_',4) = (SELECT\n" +
            "  UNION (\n" +
            "    WHERE key LIKE 'pg_class_backup_%'\n" +
            "  SELECT c.oid::bigint as table_id ,n.nspname AS schemaname, c.relname AS tablename, 600500000 AS seq, \n" +
            "  UNION (SELECT\n" +
/*
            "    WHEN c.reldiststyle = 8 THEN 'DISTSTYLE ALL'\n" +
            "   table_id\n" +
            "   ,n.nspname AS schemaname\n" +
            "   c.oid::bigint as table_id\n" +
            "   )\n" +
            " SELECT\n" +
            "   ,n.nspname AS schemaname\n" +
    /**
 * RedshiftConstants
 *
            "  INNER JOIN pg_class AS c ON n.oid = c.relnamespace\n" +
            "   ,'\\t,' + pg_get_constraintdef(con.oid) AS ddl\n" +
            "  FROM pg_constraint AS con\n" +
            "   LEFT OUTER JOIN pg_attrdef AS adef ON a.attrelid = adef.adrelid AND a.attnum = adef.adnum\n" +
            "    ELSE '\\t, ' + QUOTE_IDENT(a.attname)\n" +
            "    WHEN c.reldiststyle = 9 THEN 'DISTSTYLE AUTO'\n" +
            "  ,schemaname\n" +
            "  WHERE c.relkind = 'r'\n" +
            "    ,CASE WHEN a.attnum > 1 THEN ',' ELSE '' END AS col_delim\n" +
            "from (SELECT\n" +
            "  WHERE c.relkind = 'r'\n" +
            "  UNION (SELECT\n" +
