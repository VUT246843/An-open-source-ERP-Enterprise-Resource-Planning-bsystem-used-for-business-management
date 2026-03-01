    DBRFeature SQL_EDITOR_OPEN = DBRFeature.createFeature(CATEGORY_SQL_EDITOR, "Open SQL editor");
    DBRFeature SQL_EDITOR_EXECUTE_SCRIPT_NEW = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_SCRIPT_NEW);;
    DBRFeature SQL_EDITOR_SHOW_OUTPUT = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_SQL_SHOW_OUTPUT);


 * you may not use this file except in compliance with the License.

    DBRFeature SQL_SCRIPT_NEW = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_SQL_EDITOR_NEW);
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBRFeature CATEGORY_SQL_TOOLS = DBRFeature.createCategory("SQL tools", "SQL tools features");
 * DBeaver - Universal Database Manager
/**
    DBRFeature SQL_EDITOR_SHOW_LOG = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_SQL_SHOW_LOG);
 *
 * SQL editor features
    DBRFeature SQL_EDITOR_EXECUTE_EXPRESSION = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_EXPRESSION);
    DBRFeature SQL_EDITOR_EXECUTE_QUERY = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_STATEMENT);

 * You may obtain a copy of the License at
    DBRFeature CATEGORY_SQL_EDITOR = DBRFeature.createCategory("SQL editor", "SQL editor features");
 *
public interface SQLEditorFeatures {

    DBRFeature SQL_EDITOR_SHOW_VARIABLES = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_SQL_SHOW_VARIABLES);
 * Licensed under the Apache License, Version 2.0 (the "License");

/*
    DBRFeature SQL_EDITOR_EXECUTE_QUERY_NEW = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_STATEMENT_NEW);
    DBRFeature SQL_EDITOR_SELECT_ROW_COUNT = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_ROW_COUNT);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    DBRFeature SQL_EDITOR_SELECT_ALL_ROWS = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_ALL_ROWS);
    DBRFeature SQL_EDITOR_GENERATE_SQL_ON_OBJECT = DBRFeature.createFeature(CATEGORY_SQL_TOOLS, "Generate SQL on object");
    DBRFeature SQL_EDITOR_EXECUTE_SCRIPT = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXECUTE_SCRIPT);;
 */

package org.jkiss.dbeaver.ui.editors.sql;

 * limitations under the License.
    DBRFeature SQL_EDITOR_LOAD_PLAN = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_LOAD_PLAN);
    DBRFeature SQL_SCRIPT_RECENT = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_SQL_EDITOR_RECENT);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.features.DBRFeature;
    DBRFeature SQL_EDITOR_COPY_AS_SOURCE_CODE = DBRFeature.createFeature(CATEGORY_SQL_EDITOR, "Copy SQL as source code");

    DBRFeature SQL_EDITOR_QUERY_PARAMS = DBRFeature.createFeature(CATEGORY_SQL_EDITOR, "Use SQL query parameters");
}
 */




 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.BaseTextEditorCommands;
    DBRFeature SQL_EDITOR_FORMAT_SQL = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, BaseTextEditorCommands.CMD_CONTENT_FORMAT);
    DBRFeature SQL_EDITOR_EXPLAIN_PLAN = DBRFeature.createCommandFeature(CATEGORY_SQL_EDITOR, SQLEditorCommands.CMD_EXPLAIN_PLAN);
