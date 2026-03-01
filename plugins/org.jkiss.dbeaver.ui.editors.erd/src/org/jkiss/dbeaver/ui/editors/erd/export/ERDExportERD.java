 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import java.io.FileWriter;
import org.jkiss.dbeaver.utils.GeneralUtils;
/*
            throw new DBException("Error saving diagram", e);
 *
import java.io.File;
 *
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramLoader;
    public void exportDiagram(EntityDiagram diagram, IFigure diagramFigure, DiagramPart diagramPart, File targetFile) throws DBException {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
public class ERDExportERD implements ERDExportFormatHandler {
 * See the License for the specific language governing permissions and
    @Override

 */
        try (FileWriter writer = new FileWriter(targetFile, GeneralUtils.UTF8_CHARSET)) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 * DBeaver - Universal Database Manager
}
 * limitations under the License.
import java.io.IOException;
 * you may not use this file except in compliance with the License.
import org.eclipse.draw2d.IFigure;
import org.jkiss.dbeaver.DBException;

        }
    }
            writer.write(DiagramLoader.serializeDiagram(new VoidProgressMonitor(), diagramPart, diagram, false, true));
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
package org.jkiss.dbeaver.ui.editors.erd.export;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        } catch (IOException e) {
 *
