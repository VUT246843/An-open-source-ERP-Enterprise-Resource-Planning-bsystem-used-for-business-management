 * limitations under the License.

 * you may not use this file except in compliance with the License.

public class RearrangeDiagramService extends AbstractLoadService<EntityDiagram> {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.lang.reflect.InvocationTargetException;
        diagram.getDiagram().setDiagramMonitor(monitor);
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    private DiagramPart diagram;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}

 * Copyright (C) 2010-2025 DBeaver Corp and others
        return diagram;
        return diagram.getDiagram();
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 *
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
        diagram.rearrangeDiagram(monitor);
    @Override
package org.jkiss.dbeaver.ui.editors.erd.part;
    @Override




 * Unless required by applicable law or agreed to in writing, software
        super(ERDUIMessages.erd_rearrange_diagram_job_title);
/*
        this.diagram = diagram;
    }

    }
 *
    public Object getFamily() {
    public EntityDiagram evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        monitor.subTask(ERDUIMessages.erd_job_rearrange_diagram);
 * See the License for the specific language governing permissions and
    }
    public RearrangeDiagramService(DiagramPart diagram) {
