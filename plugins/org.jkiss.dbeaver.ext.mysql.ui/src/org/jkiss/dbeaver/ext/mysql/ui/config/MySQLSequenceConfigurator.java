import org.jkiss.dbeaver.model.struct.DBSEntityType;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.UITask;
 *
public class MySQLSequenceConfigurator implements DBEObjectConfigurator<MySQLSequence> {
 * Unless required by applicable law or agreed to in writing, software
        return UITask.run(() -> {

            }
 * DBeaver - Universal Database Manager
/*
    @Override
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
 * You may obtain a copy of the License at
        });
 * Licensed under the Apache License, Version 2.0 (the "License");
            EntityEditPage editPage = new EntityEditPage(sequence.getDataSource(), DBSEntityType.SEQUENCE);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public MySQLSequence configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull MySQLSequence sequence, @NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 */
import org.jkiss.dbeaver.ext.mysql.model.MySQLSequence;
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.mysql.ui.config;


}
                return null;
 *
 * See the License for the specific language governing permissions and
 *
            return sequence;
 * limitations under the License.
    }
 * you may not use this file except in compliance with the License.
            if (!editPage.edit()) {
import java.util.Map;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            sequence.setName(editPage.getEntityName());
