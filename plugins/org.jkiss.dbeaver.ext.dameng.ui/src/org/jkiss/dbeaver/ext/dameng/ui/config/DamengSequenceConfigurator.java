import org.jkiss.dbeaver.ui.UITask;
            return sequence;
        @Nullable Object container,
 * Unless required by applicable law or agreed to in writing, software
            if (!editPage.edit()) {
        @NotNull Map<String, Object> options

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;

            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
            sequence.setName(editPage.getEntityName());
        return UITask.run(() -> {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.dameng.ui.config;

 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBRProgressMonitor monitor,
    }

 */
    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *
 * limitations under the License.
 * You may obtain a copy of the License at
            EntityEditPage editPage = new EntityEditPage(sequence.getDataSource(), DBSEntityType.SEQUENCE);
                return null;
 *
    public DamengSequence configureObject(
import org.jkiss.code.Nullable;
 */
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntityType;
 * DBeaver - Universal Database Manager
public class DamengSequenceConfigurator implements DBEObjectConfigurator<DamengSequence> {
 * @author Shengkai Bai
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        @Nullable DBECommandContext commandContext,
        @NotNull DamengSequence sequence,
        });
import org.jkiss.dbeaver.ext.dameng.model.DamengSequence;
/**
