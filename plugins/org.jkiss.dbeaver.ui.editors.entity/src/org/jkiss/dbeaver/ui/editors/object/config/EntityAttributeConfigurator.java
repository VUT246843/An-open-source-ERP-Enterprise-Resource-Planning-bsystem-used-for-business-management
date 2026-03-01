    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
import org.jkiss.dbeaver.ui.editors.object.struct.EditAttributePage;
        });
 *
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
import org.jkiss.code.Nullable;

 *     http://www.apache.org/licenses/LICENSE-2.0
        return UITask.run(() -> {
 */
    @Override
import java.util.Map;
 * See the License for the specific language governing permissions and

 *
    public DBSObject configureObject(

            if (object instanceof DBSTableColumn attr) {
        @Nullable DBECommandContext commandContext,
                final EditAttributePage page = new EditAttributePage(commandContext, attr, options);
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.ui.editors.object.config;
 *
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    ) {
 * Licensed under the Apache License, Version 2.0 (the "License");
public class EntityAttributeConfigurator extends PropertyObjectConfigurator {
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 * Property object configurator
import org.jkiss.dbeaver.ui.UITask;
            return object;
 * You may obtain a copy of the License at
 * limitations under the License.

        @NotNull DBSObject object,
 * you may not use this file except in compliance with the License.
        @Nullable Object table,
/**
/*
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
                    return null;
        @NotNull Map<String, Object> options
                if (!page.edit()) {
