import org.jkiss.dbeaver.ui.UITask;
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;

import org.jkiss.dbeaver.model.struct.DBSEntityType;

            sequence.setCycle(false);
    @Override
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 */
 * Unless required by applicable law or agreed to in writing, software
            return sequence;
 *
package org.jkiss.dbeaver.ext.oracle.ui.config;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
            sequence.setName(page.getEntityName());
 * limitations under the License.
import org.jkiss.dbeaver.ext.oracle.model.OracleSequence;
            if (!page.edit()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }

 *

        return UITask.run(() -> {

 *
            EntityEditPage page = new EntityEditPage(sequence.getDataSource(), DBSEntityType.SEQUENCE);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
public class OracleSequenceConfigurator implements DBEObjectConfigurator<OracleSequence> {
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    }
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
            sequence.setMinValue(new BigDecimal(0));
            sequence.setIncrementBy(1L);
import java.math.BigDecimal;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
                return null;
    public OracleSequence configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OracleSequence sequence, @NotNull Map<String, Object> options) {
        });
