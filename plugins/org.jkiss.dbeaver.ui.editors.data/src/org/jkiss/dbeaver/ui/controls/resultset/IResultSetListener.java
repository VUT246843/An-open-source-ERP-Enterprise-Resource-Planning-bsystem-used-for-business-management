/**
 * distributed under the License is distributed on an "AS IS" BASIS,

    void handleResultSetChange();
import org.jkiss.code.NotNull;
 */

import org.jkiss.dbeaver.model.impl.local.StatResultSet;
public interface IResultSetListener {
    default void onModelPrepared() {
/*
package org.jkiss.dbeaver.ui.controls.resultset;
 * Licensed under the Apache License, Version 2.0 (the "License");
    void handleResultSetSelectionChange(SelectionChangedEvent event);
    }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * Result set provider
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * DBeaver - Universal Database Manager

 *
    void handleResultSetLoad();
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
        // do nothing

}

 * You may obtain a copy of the License at
    }
    default void onQueryExecuted(@NotNull String query, @Nullable StatResultSet statistics, @Nullable String errorMessage) {
    

        // do nothing
 *
