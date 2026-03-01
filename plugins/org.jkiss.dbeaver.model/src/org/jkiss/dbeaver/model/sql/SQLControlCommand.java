    }
    @Override
        @Nullable DBPDataSource dataSource,
 * you may not use this file except in compliance with the License.
        return text;
}
 *
        } else if (text.startsWith(syntaxManager.getControlCommandPrefix())) {
    @NotNull
 * SQL control command
        this.commandId = commandId == null ? command : commandId;
    public Map<String, String> getParameters() {
    public String getCommandId() {
        int offset,
    public boolean isEmptyCommand() {
    public void reset() {
 *

 */
    @Override
    }
    public int getOffset() {
            if (!Character.isLetterOrDigit(text.charAt(i))) {
        return emptyCommand;
            text = text.substring(syntaxManager.getControlCommandPrefix().length());
        @NotNull Map<String, String> parameters

    }
    }
    private final String command;
    }
        this.commandId = commandId;
    @Override
 * See the License for the specific language governing permissions and
    }
 * DBeaver - Universal Database Manager
        return data;

        for (int i = 0; i < text.length(); i++) {
        this.parameters = null;

        this.text = text;

        return text;


 * Licensed under the Apache License, Version 2.0 (the "License");
    public Object getData() {
        int length,
        return this.parameters;
import java.util.Map;
        return parameter;
    @Override
import org.jkiss.code.NotNull;
        return commandId;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return command;
        @NotNull String text,

    @Override

    @Override

    private final int offset;
        this.emptyCommand = emptyCommand;
        this.offset = offset;
    ) {
    @Nullable
    }

    public SQLControlCommand(
    }
        if (text.startsWith(multilineCommandPrefix)) {

    private final String text;
        this.data = data;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public String toString() {

import org.jkiss.code.Nullable;

        return offset;
    private final DBPDataSource dataSource;
        return command;
        }
        return dataSource;
public class SQLControlCommand implements SQLScriptElement {
        return length;
package org.jkiss.dbeaver.model.sql;
        final String multilineCommandPrefix = syntaxManager.getControlCommandPrefix().repeat(2);

    }
    public DBPDataSourceContainer getDataSourceContainer() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 */
/*

 * limitations under the License.
    public void setData(Object data) {
    @NotNull
        @Nullable String commandId,
    @Override
    private final String commandId;
    public int getLength() {
    public String getCommand() {
    @Override

    public String getOriginalText() {
        this.length = length;

        this.dataSource = dataSource;

    public DBPDataSource getDataSource() {
 * Unless required by applicable law or agreed to in writing, software
                break;
        this.command = commandId;
        this.parameter = divPos == -1 ? null : text.substring(divPos + 1).trim();
    }
        this.parameter = null;
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.DBPDataSource;
        int divPos = -1;
    }


        this.length = length;

 * distributed under the License is distributed on an "AS IS" BASIS,
    private final int length;
    private Object data;
        }
    }
    }
    @Override
                divPos = i;
        this.command = divPos == -1 ? text : text.substring(0, divPos);
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final String parameter;
    }
            }
    private boolean emptyCommand;

        this.parameters = parameters;
    public String getText() {
        this.offset = offset;
        return dataSource == null ? null : dataSource.getContainer();


        this.dataSource = dataSource;

    public SQLControlCommand(DBPDataSource dataSource, SQLSyntaxManager syntaxManager, String text, String commandId, int offset, int length, boolean emptyCommand) {
 *
        this.text = text;
            text = text.substring(multilineCommandPrefix.length(), text.length() - multilineCommandPrefix.length());
/**
    }
    public String getParameter() {
    private final Map<String, String> parameters;
