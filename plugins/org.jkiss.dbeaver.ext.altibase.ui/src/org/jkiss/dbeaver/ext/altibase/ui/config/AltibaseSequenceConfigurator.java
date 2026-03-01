    public AltibaseSequence configureObject(DBRProgressMonitor monitor, DBECommandContext commandContext,
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
public class AltibaseSequenceConfigurator implements DBEObjectConfigurator<AltibaseSequence> {
    }
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

    @Override
/*
            Object container, AltibaseSequence sequence, Map<String, Object> options) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

            }


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
 *
            EntityEditPage page = new EntityEditPage(sequence.getDataSource(), DBSEntityType.SEQUENCE);
 *
            if (!page.edit()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        });
        return UITask.run(() -> {
package org.jkiss.dbeaver.ext.altibase.ui.config;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}import org.jkiss.dbeaver.model.struct.DBSEntityType;
 * See the License for the specific language governing permissions and
            return sequence;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
 *
            sequence.setName(page.getEntityName());
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.UITask;
 * Unless required by applicable law or agreed to in writing, software
                return null;

 * limitations under the License.
import org.jkiss.dbeaver.ext.altibase.model.AltibaseSequence;
