        @NotNull Supplier<DBDDataReceiver> dataReceiverSupplier,
}
        @NotNull SQLScriptContext scriptContext,
import java.util.List;

/*
     * @return true if parameters processed, false if use canceled query, null if parameters must be ignored till the end of script.
 * DBeaver - Universal Database Manager
    @Nullable
 */

import org.jkiss.dbeaver.model.data.DBDDataReceiver;
import org.jkiss.code.Nullable;
 *
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
        boolean useDefaults);
public interface SQLParametersProvider {
 * limitations under the License.
 * Provides values for query parameters.

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.sql;
 */
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * you may not use this file except in compliance with the License.
 * In UI mode shows dialog.
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull List<SQLQueryParameter> parameters,
 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
    Boolean prepareStatementParameters(
    /**
/**
        @NotNull SQLQuery sqlStatement,

import java.util.function.Supplier;
