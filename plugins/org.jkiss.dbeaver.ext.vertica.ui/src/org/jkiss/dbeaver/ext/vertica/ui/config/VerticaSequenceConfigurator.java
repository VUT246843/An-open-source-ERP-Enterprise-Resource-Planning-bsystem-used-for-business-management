 */
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * See the License for the specific language governing permissions and
            }
import org.jkiss.dbeaver.ui.UITask;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return new UITask<VerticaSequence>() {
/*

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override

                if (!editPage.edit()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import java.util.Map;
package org.jkiss.dbeaver.ext.vertica.ui.config;
 *

 *

public class VerticaSequenceConfigurator implements DBEObjectConfigurator<VerticaSequence> {
            @Override
}
    public VerticaSequence configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull VerticaSequence sequence, @NotNull Map<String, Object> options) {
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
                }
        }.execute();
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.vertica.model.VerticaSequence;
                CreateSequencePage editPage = new CreateSequencePage(sequence);
                return sequence;
import org.jkiss.dbeaver.ui.editors.object.struct.CreateSequencePage;
 * DBeaver - Universal Database Manager
                sequence.setName(editPage.getSequenceName());
 * you may not use this file except in compliance with the License.
            protected VerticaSequence runTask() {
import org.jkiss.code.NotNull;
