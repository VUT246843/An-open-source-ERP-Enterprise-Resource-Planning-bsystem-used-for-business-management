package org.jkiss.dbeaver.ui.controls.resultset;
 * See the License for the specific language governing permissions and
        @NotNull String name,

        setUser(false);
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
abstract class ResultSetJobAbstract extends DataSourceJob {
 */
 *
        this.executionSource = executionSource;
}
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
        super(name, executionContext);

 *
    protected final ResultSetExecutionSource executionSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    ) {
        @NotNull ResultSetExecutionSource executionSource,
 * DBeaver - Universal Database Manager
    ResultSetJobAbstract(
    }
/*
        @NotNull DBCExecutionContext executionContext
 * you may not use this file except in compliance with the License.

