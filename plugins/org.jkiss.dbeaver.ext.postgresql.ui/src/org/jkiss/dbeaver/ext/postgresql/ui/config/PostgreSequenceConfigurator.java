 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 * See the License for the specific language governing permissions and
public class PostgreSequenceConfigurator implements DBEObjectConfigurator<PostgreSequence> {
            protected PostgreSequence runTask() {
                if (!editPage.edit()) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.object.struct.CreateSequencePage;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }.execute();
                sequence.setName(editPage.getSequenceName());
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
}
 * Copyright (C) 2010-2024 DBeaver Corp and others

import java.util.Map;
                    return null;
import org.jkiss.dbeaver.ui.UITask;
    public PostgreSequence configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreSequence sequence, @NotNull Map<String, Object> options) {
/**
 */
 *

 * Postgre sequence configurator
 * distributed under the License is distributed on an "AS IS" BASIS,


package org.jkiss.dbeaver.ext.postgresql.ui.config;
                return sequence;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
    }
 * limitations under the License.
                CreateSequencePage editPage = new CreateSequencePage(sequence);
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSequence;
    @Override
        return new UITask<PostgreSequence>() {
 *
            @Override
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 */
