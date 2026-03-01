}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBSObject configureObject(
/**
import org.jkiss.code.Nullable;
    }
import org.jkiss.dbeaver.ui.editors.object.struct.PropertyObjectEditPage;
    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 *
/*
        });
import java.util.Map;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 */
package org.jkiss.dbeaver.ui.editors.object.config;
            }
                return null;
 */

public class PropertyObjectConfigurator implements DBEObjectConfigurator<DBSObject> {
import org.jkiss.dbeaver.model.edit.DBECommandContext;

        @NotNull DBRProgressMonitor monitor,
        @Nullable DBECommandContext commandContext,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @Nullable Object table,
 * limitations under the License.
 * See the License for the specific language governing permissions and
            final PropertyObjectEditPage<?> page = new PropertyObjectEditPage<>(commandContext, object);
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!page.edit()) {
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.ui.UITask;
        @NotNull DBSObject object,
 * Property object configurator
        return UITask.run(() -> {
import org.jkiss.dbeaver.model.struct.DBSObject;

            return object;
 *

