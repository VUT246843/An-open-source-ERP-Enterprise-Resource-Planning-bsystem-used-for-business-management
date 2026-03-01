 * Licensed under the Apache License, Version 2.0 (the "License");
            EntityEditPage page = new EntityEditPage(queue.getDataSource(), DBSEntityType.SEQUENCE);

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSEntityType;

}
 *

 *
 * You may obtain a copy of the License at
        });
 */
 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.ui.UITask;
 *     http://www.apache.org/licenses/LICENSE-2.0
            return queue;
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;
    public OracleQueue configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OracleQueue queue, @NotNull Map<String, Object> options) {
 * Unless required by applicable law or agreed to in writing, software
    }
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
/*
        return UITask.run(() -> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ext.oracle.ui.config;

            queue.setName(page.getEntityName());
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;

public class OracleQueueConfigurator implements DBEObjectConfigurator<OracleQueue> {
 * limitations under the License.
import org.jkiss.dbeaver.ext.oracle.model.OracleQueue;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (!page.edit()) {
                return null;
