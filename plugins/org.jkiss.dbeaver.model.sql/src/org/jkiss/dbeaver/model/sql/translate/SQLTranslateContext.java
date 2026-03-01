
    }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final SQLDialect targetDialect;
    public SQLTranslateContext(
    }

        @NotNull SQLDialect sourceDialect,

    @NotNull
    public SQLDialect getTargetDialect() {
        @NotNull SQLDialect targetDialect,
    }
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        this.targetDialect = targetDialect;
final class SQLTranslateContext {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 *
        syntaxManager.init(targetDialect, preferenceStore);

        return targetDialect;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBPPreferenceStore preferenceStore
        this.preferenceStore = preferenceStore;
    public SQLSyntaxManager getSyntaxManager() {
    private final SQLSyntaxManager syntaxManager;


 *
        return preferenceStore;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    private final SQLDialect sourceDialect;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
 * limitations under the License.
    @NotNull
package org.jkiss.dbeaver.model.sql.translate;
        syntaxManager = new SQLSyntaxManager();
    @NotNull
 * SQL translator

    @NotNull
    @NotNull

    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.SQLDialect;
    private final DBPPreferenceStore preferenceStore;
 * DBeaver - Universal Database Manager
 *
 */
    }
}

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        this.sourceDialect = sourceDialect;

 */
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        return syntaxManager;

    public SQLDialect getSourceDialect() {
    @NotNull
        return sourceDialect;
    public DBPPreferenceStore getPreferenceStore() {
    ) {
/**
