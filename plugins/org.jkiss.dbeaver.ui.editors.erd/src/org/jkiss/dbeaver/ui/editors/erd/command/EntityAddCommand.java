/**
        for (ERDEntity entity : entities) {
                if (entity.getDataSource() != null) {

package org.jkiss.dbeaver.ui.editors.erd.command;
        VoidProgressMonitor monitor = new VoidProgressMonitor();
    @Override
                        EntityPart entityPart = (EntityPart) diagramChild;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.erd.ERDEntity;
                            }
                            break;
import org.jkiss.dbeaver.model.erd.ERDUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
		    diagramPart.getDiagram().addEntity(entity, true);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.draw2d.geometry.Rectangle;
	{
import org.eclipse.draw2d.geometry.Dimension;
                    }

 * Add entity to diagram
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
import java.util.Collections;
        for (ERDEntity entity : entities) {
                            final Dimension size = entityPart.getFigure().getPreferredSize();
                            null,
import java.util.List;
            if (curLocation != null) {

 * limitations under the License.
    {
        this.entities = entities;
 * You may obtain a copy of the License at
                            newBounds.x = curLocation.x;
                            curLocation.x += size.width + (size.width / 2);
            if (entity.getObject() == null) {
    }
import org.jkiss.dbeaver.model.navigator.DBNNode;
    protected Point location;

                            newBounds.width = size.width;
    {
        // Nothing special
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * you may not use this file except in compliance with the License.
                // Put new entities in specified location
    public EntityAddCommand(DiagramPart diagram, List<ERDEntity> entities, Point location)
                            ERDUIMessages.erd_entity_add_command_select_table_dialog,
            handleEntityChange(entity, true);
 * See the License for the specific language governing permissions and

        this.location = location;
            handleEntityChange(entity, false);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSEntity;
                            // This actually only loads unresolved relations.
    protected DiagramPart diagramPart;
    protected void handleEntityChange(ERDEntity entity, boolean remove) {
                        }

    private static final Log log = Log.getLog(EntityAddCommand.class);
                            dsNode,
/*
    }
                                Collections.emptyList(),
                                monitor,

 * DBeaver - Universal Database Manager
                            newBounds.y = curLocation.y;
        return diagramPart;
    public void undo()
                    DBNDatabaseNode dsNode = DBNUtils.getNodeByObject(selectedObject != null ? selectedObject.getParentObject() : entity.getDataSource().getContainer());
                            newBounds.height = size.height;
    public DiagramPart getDiagram() {
                                (DBSEntity)((DBNDatabaseNode) tableNode).getObject(),
                            null);
import org.eclipse.swt.SWT;
                    DBSObject selectedObject = defaultContext != null ? DBUtils.getSelectedObject(defaultContext) : null;
import org.jkiss.dbeaver.Log;
                                String msg = NLS.bind(ERDUIMessages.erd_error_of_loading_diagram_label, e.getMessage());
            if (entity.getObject() == null) {
import org.eclipse.gef.commands.Command;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
        }
                                        msg, SWT.ICON_ERROR);

                                null);
                                        ERDUIMessages.erd_error_of_loading_diagram_title,
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                                diagramPart.getDiagram(),

import org.eclipse.osgi.util.NLS;
 *
                        if (entityPart.getEntity() == entity) {
                            entityPart.modifyBounds(newBounds);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                            new Class[]{DBSTable.class},
                            try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                // Entity is not initialized
                    if (dsNode != null) {
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
                }
import org.jkiss.dbeaver.model.DBUtils;
    public void execute()
    @Override
                            final Rectangle newBounds = new Rectangle();
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
            diagramPart.getDiagram().removeEntity(entity, true);

                            new Class[]{DBSObjectContainer.class, DBSTable.class},
                    }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                            // This happens only with entities added on diagram during editing
                            } catch (DBException e) {
                                UIUtils.showMessageBox(null,
                                entity.addModelRelations(monitor, diagramPart.getDiagram(), false, false);
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.draw2d.geometry.Point;
                        DBNNode tableNode = DBWorkbench.getPlatformUI().selectObject(

        Point curLocation = location == null ? null : new Point(location);
                        }
 */
 * Unless required by applicable law or agreed to in writing, software
}    }
                continue;
 *


                            entity = ERDUtils.makeEntityFromObject(
                    DBCExecutionContext defaultContext = DBUtils.getDefaultContext(entity.getDataSource(), false);
                for (Object diagramChild : diagramPart.getChildren()) {
public class EntityAddCommand extends Command {
                        if (tableNode instanceof DBNDatabaseNode && ((DBNDatabaseNode) tableNode).getObject() instanceof DBSEntity) {
                            UIUtils.getActiveWorkbenchShell(),

import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        }
            }
	protected List<ERDEntity> entities;
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
                    if (diagramChild instanceof EntityPart) {
    }
                                log.error(msg, e);
	}
        this.diagramPart = diagram;
