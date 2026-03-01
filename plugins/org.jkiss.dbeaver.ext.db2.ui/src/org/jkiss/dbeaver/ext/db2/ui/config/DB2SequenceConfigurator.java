 *
}
                return sequence;
        return new UITask<DB2Sequence>() {


 * you may not use this file except in compliance with the License.
    }
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.db2.model.DB2Sequence;
package org.jkiss.dbeaver.ext.db2.ui.config;
                    return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.code.NotNull;
                EntityEditPage page = new EntityEditPage(schema.getDataSource(), DBSEntityType.SEQUENCE);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
            @Override
            protected DB2Sequence runTask() {
    @Override

 */
            }
public class DB2SequenceConfigurator implements DBEObjectConfigurator<DB2Sequence> {
import org.jkiss.dbeaver.ui.UITask;
                sequence.setName(page.getEntityName());

                }
 * See the License for the specific language governing permissions and
 *
                if (!page.edit()) {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

    	DB2Schema schema = (DB2Schema) container;
 * DBeaver - Universal Database Manager
import java.util.Map;
        }.execute();
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
    public DB2Sequence configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull DB2Sequence sequence, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.struct.DBSEntityType;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
