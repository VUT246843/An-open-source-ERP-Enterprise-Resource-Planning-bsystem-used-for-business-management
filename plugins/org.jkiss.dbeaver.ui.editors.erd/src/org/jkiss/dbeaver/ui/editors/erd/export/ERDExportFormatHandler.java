{

public interface ERDExportFormatHandler

import java.io.File;
 * limitations under the License.
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        throws DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
package org.jkiss.dbeaver.ui.editors.erd.export;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.draw2d.IFigure;
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
import org.jkiss.dbeaver.DBException;

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    void exportDiagram(EntityDiagram diagram, IFigure diagramFigure, DiagramPart diagramPart, File targetFile)

 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
}
