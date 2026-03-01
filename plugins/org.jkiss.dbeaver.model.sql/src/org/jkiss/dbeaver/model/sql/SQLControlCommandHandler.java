     * @param command       command
        @NotNull SQLControlCommand command,
    SQLControlResult handleCommand(
    /**
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
}

{
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
        throws DBException;
import org.jkiss.dbeaver.DBException;
     */
import org.jkiss.code.NotNull;
     * @return false if command failed and execution has to be stopped
 *
package org.jkiss.dbeaver.model.sql;
 * Control command handler

    @NotNull
/*
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLScriptContext scriptContext)
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBRProgressMonitor monitor,
 * DBeaver - Universal Database Manager
/**
 * You may obtain a copy of the License at
     * @param monitor
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param scriptContext script context
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
public interface SQLControlCommandHandler
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
