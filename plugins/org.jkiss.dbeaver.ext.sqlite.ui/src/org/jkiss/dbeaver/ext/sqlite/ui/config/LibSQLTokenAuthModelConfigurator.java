public class LibSQLTokenAuthModelConfigurator extends DatabaseNativeAuthModelConfigurator {
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    public void createControl(@NotNull Composite authPanel, DBAAuthModel<?> object, @NotNull Runnable propertyChangeListener) {
        return SQLiteUIMessages.dialog_connection_auth_label_token;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        createPasswordControls(authPanel, propertyChangeListener);


 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.sqlite.ui.config;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.access.DBAAuthModel;
/*
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.ui.dialogs.connection.DatabaseNativeAuthModelConfigurator;
    protected String getPasswordFieldLabel() {
 */

 *
}
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.sqlite.ui.internal.SQLiteUIMessages;
    }
import org.eclipse.swt.widgets.Composite;
    @Override
 * See the License for the specific language governing permissions and
