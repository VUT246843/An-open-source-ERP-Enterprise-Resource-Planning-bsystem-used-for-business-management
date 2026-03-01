	{
        Rectangle figureBounds = entityPart.getFigure().getBounds();
        int vMargin = prefStore.getInt(ERDUIConstants.PREF_GRID_HEIGHT);
        if (drawer != null) {
                    DBSEntityAssociation updatedAssociation = entityAssociation;
                        } else {
                monitor.subTask(ERDUIMessages.erd_job_visuallize_content);
                    });

                        }
                        ERDEntity erdEntity = ERDUtils.makeEntityFromObject(
		//give the superclass a chance to handle this first
            entityAssociation = (DBSEntityAssociation) object;
        @Override
                    entry.getKey().setChildren(paletteEntries);
        PaletteDrawer drawer = getContainerPaletteDrawer(container);
import org.eclipse.gef.palette.*;

    {
                    drawer.remove((ToolEntryTable)entry);

    }
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
                    }
        public void handleMouseWheel(Event event, EditPartViewer viewer) {
                }
                // Add entry (with right order)
import org.eclipse.swt.graphics.Point;
    {
                    }
	public ERDGraphicalViewer(ERDEditorPart editor, ValidationMessageHandler messageHandler)
        int tableCount = 0;
        private final DBSEntity table;
                        if (updatedAttribute != null) {
		super.handleFocusLost(fe);
                        if (tools == null) {
            // Workbench shutdown doesn't close editor
                            null);
                    IEditorPart entityOwnerEditor = (IEditorPart) event.getOptions().get(DBEObjectManager.OPTION_ACTIVE_EDITOR);
                    if (dataSourceInfo == null) {
        DBSEntity entity;
        }
        public void activate()
            applyThemeSettings();
                    if (erdEntity != null) {
                    }

                                erdEntity.removeAssociation(erdAssociation, true);
    public ERDEditorPart getEditor()
                            EntityPart entityPart = getEditor().getDiagramPart().getEntityPart(erdEntity);
                        usedDataSources.put(container, dataSourceInfo);
        public static final MouseWheelHandler SINGLETON = new MouseWheelHorizontalScrollHandler();
            });
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
                for (Map.Entry<PaletteDrawer, List<ToolEntryTable>> entry : toolMap.entrySet()) {
    private static class DataSourceInfo {
                    if (erdOwnerEditor.getSite() instanceof MultiPageEditorSite) {
                    } else {
        switch (action) {
        this.editor = editor;

            loadContents = false;
                        List<ToolEntryTable> tools = toolMap.get(drawer);
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        }
import org.eclipse.swt.events.FocusEvent;
                synchronized (usedDataSources) {
    @Override
                int index = 0;
        return editor;
            }
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;

	}
                                    }
                    if (child instanceof EntityPart childPart) {
                    DBSEntityAttribute removedAttribute = entityAttribute;

        }

                    monitor.worked(1);

                        erdEntity1.firePropertyChange(ERDEntity.PROP_INPUT, null, null);

                if (entry instanceof ToolEntryTable && ((ToolEntryTable)entry).table == table) {
    private void autoLayoutEntity(EntityPart entityPart) {
                            diagram,
	 * 
    private boolean loadContents = false;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.*;

                        if (((ToolEntryTable) child).table.getName().compareTo(table.getName()) > 0) {

            entity = entityAttribute.getParentObject();

                    if (dataSourceInfo == null) {

                Map<PaletteDrawer, List<ToolEntryTable>> toolMap = new LinkedHashMap<>();
            final GraphicalViewer viewer = editorPart.getViewer();

    private static class ToolEntryTable extends ToolEntry {
                    }
            //ERDGraphicalViewer.this.reveal(part);
	 * focus from the {@link AbstractEditPartViewer#focusPart focusPart}, if
                        }
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
import org.eclipse.gef.ui.parts.AbstractEditPartViewer;
                            // Set proper entity location
                        dataSourceInfo = new DataSourceInfo();
                    DBSEntityAssociation addedAssociation = entityAssociation;
                    // New attribute or association
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    DBSEntityAttribute updatedAttribute = entityAttribute;
                                loc.y -= diagramLoc.y;
            // Close editor only if it is simple disconnect
                        acquireContainer(container);

import org.eclipse.swt.events.DisposeEvent;
                                    if (refEntity != null) {
                    DataSourceInfo dataSourceInfo = usedDataSources.get(container);
        DBSEntityAssociation entityAssociation = null;
        container.acquire(editor);
    }
            final PaletteContainer drawer = getContainerPaletteDrawer(table.getDataSource().getContainer());
    }
	/**
                    }
    private void handleDataSourceContainerChange(DBPEvent event, DBPDataSourceContainer container) {
    }
                    UIUtils.asyncExec(() -> {
 */
		this.messageHandler = messageHandler;

                        dataSourceInfo.tableCount--;
            ERDThemeSettings.instance.addPropertyListener(
                    IEditorPart erdOwnerEditor = getEditor();
     */
            container.getName(),
                }
            editor.getPaletteRoot().remove(drawer);
        //getEditor().getDiagramPart().getE
                    Object child = children.get(i);
        this.getControl().setFont(ERDThemeSettings.instance.diagramFont);
                break;
    @Override
                ERDEntity erdEntity = diagram.getEntity(entity);
        if (drawer != null) {
                    // New entity. Add it if it has the same object container
                    }
                        if (erdEntity != null &&
            );
        return null;
    private static final Log log = Log.getLog(ERDGraphicalViewer.class);
        if (action == DBPEvent.Action.OBJECT_SELECT || !usedDataSources.containsKey(object.getDataSource().getContainer())) {
        if (!loadContents) {

                }
                if (site != null && site.getWorkbenchWindow() != null) {

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 *

    {
            super(table.getName(), table.getDescription(),

		return messageHandler;
		messageHandler.reset();
    }
    {
                            new VoidProgressMonitor(),
                    //site.getWorkbenchWindow().getActivePage().closeEditor(editor, false);
    /**

                            ERDEntityAttribute erdAttribute = erdEntity.getAttribute(removedAttribute);

                    }

                            entity,
                monitor.worked(1);
	{
                            tools = new ArrayList<>(tables.size());
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.model.erd.*;
                            ERDEntityAttribute erdAttribute = erdEntity.getAttribute(updatedAttribute);
                        entityOwnerEditor == erdOwnerEditor;
            }
                        }
                        } else if (updatedAssociation != null) {
                tables.sort(DBUtils.nameComparator());
            for (Object entry : drawer.getChildren()) {
                    ERDEntity erdEntity = diagram.getEntity(entity);
        }
 * limitations under the License.
 *
        DiagramPart diagramPart = editor.getDiagramPart();

            case OBJECT_ADD: {
    PaletteDrawer getContainerPaletteDrawer(DBPDataSourceContainer container)
        try {
                            index = i;
                        }
	 * ValidationMessageHandler to receive messages
                        UIUtils.asyncExec(() -> {
                } else if (entityAssociation != null) {
    protected void handleFocusLost(FocusEvent fe)
            return;
            setDescription(DBUtils.getObjectFullName(table, DBPEvaluationContext.UI));
        } else if (object instanceof DBSEntity) {
        }*/
	 */
            if (drawer != null) {
    public void handleTableActivate(DBSEntity table)
import org.jkiss.dbeaver.model.struct.DBSObject;
                        viewer.select(child);
                });
                            erdEntity != null &&
                            erdEntity.firePropertyChange(ERDEntity.PROP_CONTENTS, null, null);
		//call reset on the MessageHandler itself
    protected void handleDispose(DisposeEvent e) {
 * You may obtain a copy of the License at
            super.activate();
        for (Object child : editor.getPaletteRoot().getChildren()) {
    }
                }
import org.jkiss.code.NotNull;
                        });

                                getEditor().setDirty(true);
import org.eclipse.draw2d.FigureCanvas;
import org.jkiss.dbeaver.ui.editors.erd.directedit.ValidationMessageHandler;
            entityAttribute = (DBSEntityAttribute) object;
import org.eclipse.swt.SWT;
    }
                if (erdEntity != null) {
                            toolMap.put(drawer, tools);
            if (container != null) {
/*

                                        refEntity.removeReferenceAssociation(erdAssociation, true);
            // Reset palette contents
     * Handler that provides horizontal scrolling using mouse wheel.
                }
                    if (erdEntity2 != null) {
import org.jkiss.dbeaver.ui.UIUtils;

                        UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        public Tool createTool()
            final ERDEditorPart editorPart = (ERDEditorPart)editDomain.getEditorPart();
                        tools.add(new ToolEntryTable(table));
                monitor.worked(1);
                        } else if (removedAssociation != null) {
    }
                synchronized (usedDataSources) {
                }
 */
                DBRProgressMonitor monitor = editor.getDiagram().getMonitor();

	 */
        }
 * See the License for the specific language governing permissions and
        {
    public static class ToolSelectTable extends SelectionTool {
                                Dimension size = entityPart.getFigure().getPreferredSize();
                        log.warn("Datasource '" + container + "' not registered in ERD viewer");
                    });
    {
        }

            ERDEditorAdapter.unmapControl(getControl());
        editor.refreshDiagram(true, false);
            Boolean.FALSE.equals(event.getEnabled())) {
            }
                for (DBSEntity table : tables) {
                        viewer.reveal(child);
                    if (erdEntity1 != null) {
 */
		super();

                                erdAttribute.firePropertyChange(ERDEntityAttribute.PROP_NAME, null, updatedAttribute.getName());
import org.eclipse.swt.widgets.Display;

            }
 * you may not use this file except in compliance with the License.
import org.eclipse.gef.tools.SelectionTool;
        {
            ERDEditorAdapter.mapControl(control, editor);
            entity = (DBSEntity) object;
            }

    private void applyThemeSettings()
        final PaletteContainer drawer = getContainerPaletteDrawer(table.getDataSource().getContainer());
        }
                        getEditor().getDiagram().isEditEnabled() &&
        }
                                entityPart.modifyBounds(curBounds);
                            usedDataSources.remove(container);
        if (diagramPart != null) {
                        erdOwnerEditor = ((MultiPageEditorSite) erdOwnerEditor.getSite()).getMultiPageEditor();
        setProperty(MouseWheelHandler.KeyGenerator.getKey(SWT.MOD2), MouseWheelHorizontalScrollHandler.SINGLETON);
import org.eclipse.swt.widgets.ScrollBar;
        container.getRegistry().addDataSourceListener(this);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                        } else {

                                curBounds.x = loc.x;
            }
                                // Get cursor location on diagram
                            ERDAssociation erdAssociation = erdEntity.getAssociation(removedAssociation);
            this.table = table;
            if (child instanceof PaletteDrawer && container.getId().equals(((PaletteDrawer) child).getId())) {
                DBeaverIcons.getImageDescriptor(DBIcon.TREE_TABLE));
            return;
    /**
import org.eclipse.ui.IEditorPart;
                    DataSourceInfo dataSourceInfo = usedDataSources.get(container);
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
                DBeaverIcons.getImageDescriptor(DBIcon.TREE_TABLE),
                if (entityAttribute != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                IWorkbenchPartSite site = editor.getSite();
        DBSObject object = event.getObject();
                monitor.subTask(ERDUIMessages.erd_job_set_diagram_palette);
            diagramPart.refresh();
                if (control instanceof FigureCanvas canvas) {
                            Collections.emptyList(),
                                erdEntity.removeAttribute(erdAttribute, false);
                for (Object child : editpart.getChildren()) {
                                curBounds.width = size.width;
 * DBeaver - Universal Database Manager
                        });

                ERDEntity erdEntity = diagram.getEntity(entity);
        @Override
                        tables.add(childPart.getEntity().getObject());
    public void handleDataSourceEvent(@NotNull DBPEvent event)
        if (table.getDataSource() != null) {
        if (table.getDataSource() != null) {

    {
        }
import org.eclipse.gef.*;
                    UIUtils.asyncExec(() -> {
                monitor.beginTask(ERDUIMessages.erd_job_rearrange_diagram, tables.size() + 2);
    public void setControl(Control control)
                    // or if this entity was created from the same editor
        }
                            // Entity delete
    }
                    DBSObject diagramContainer = diagram.getObject();
 * @author Serge Rider
    {
        }
	}
                                Point diagramLoc = getControl().toDisplay(0, 0);


/*
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;

        }
        loadContents = true;
                }
            case OBJECT_REMOVE: {
        }
	{
        DBPEvent.Action action = event.getAction();
import org.jkiss.dbeaver.Log;
        }
 * Created on Jul 19, 2004
	 * there is one.
import org.eclipse.draw2d.geometry.Rectangle;
    {
                            targetEntity != null) {

                }
                            diagram.removeEntity(erdEntity, true);
                List<DBSEntity> tables = new ArrayList<>();
                            erdEntity.reloadAttributes(diagram);
    private final Map<DBPDataSourceContainer, DataSourceInfo> usedDataSources = new IdentityHashMap<>();
                            }

                    DBSEntityAssociation removedAssociation = entityAssociation;
}        if (getControl() != null) {
        ToolSelectTable(DBSEntity table)
                            }
        }
        setProperty(MouseWheelHandler.KeyGenerator.getKey(SWT.MOD1), MouseWheelZoomHandler.SINGLETON);
	private final ValidationMessageHandler messageHandler;
                                if (erdAssociation.getTargetEntity() instanceof ERDEntity refEntity) {
                            releaseContainer(container);
                    }
                            diagram.addEntity(erdEntity, true);
        }
                                // Resize entity
                            }
                drawer.add(index, new ToolEntryTable(table));
            if (editpart instanceof DiagramPart diagramPart) {
        /*if (entityAssociation != null) {
                UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
    }
	 * @return Returns the messageLabel.
	@Override
                        if (removedAttribute != null) {
        ToolEntryTable(DBSEntity table)
	 * This method is invoked when this viewer's control loses focus. It removes
        // Object change
                                //autoLayoutEntity(entityPart);
                    if (child instanceof ToolEntryTable) {

 *
                }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Control;
            for (EditPart child : editorPart.getDiagramPart().getChildren()) {
import org.eclipse.ui.IWorkbenchPartSite;
        {
            return;
        {

                                Display display = Display.getCurrent();
                    }
        } else if (object instanceof DBSEntityAssociation) {
            handleDataSourceContainerChange(event, (DBPDataSourceContainer) object);
                                curBounds.height = size.height;
            }
    }
        super.setControl(control);
                    if (drawer != null) {
        if (object == null || DBWorkbench.getPlatform().isShuttingDown()) {
                break;
            if (erdEntity1 != null || erdEntity2 != null) {
                                Point loc = display.getCursorLocation();
                            ERDAssociation erdAssociation = new ERDAssociation(addedAssociation, erdEntity, targetEntity, true);
 * distributed under the License is distributed on an "AS IS" BASIS,
                            if (entityPart != null) {
                                curBounds.y = loc.y;
            event.getAction() == DBPEvent.Action.OBJECT_UPDATE &&
                break;
                List children = drawer.getChildren();
            DBPDataSourceContainer container = table.getDataSource().getContainer();
    private final ERDEditorPart editor;
                            if (erdAttribute != null) {
                            erdEntity.reloadAttributes(diagram);

                control
    }
    }
                            erdEntity.firePropertyChange(ERDEntity.PROP_CONTENTS, null, null);
            entity = entityAssociation.getParentObject();

/*
public class ERDGraphicalViewer extends ScrollingGraphicalViewer implements DBPEventListener {
                    final ScrollBar hBar = canvas.getHorizontalBar();
	public ValidationMessageHandler getValidationHandler()
            this.setUserModificationPermission(PERMISSION_NO_MODIFICATION);
package org.jkiss.dbeaver.ui.editors.erd.editor;
                                loc.x -= diagramLoc.x;
            this.table = table;

                                erdEntity.firePropertyChange(ERDObject.PROP_SIZE, null, null);
        int hMargin = prefStore.getInt(ERDUIConstants.PREF_GRID_WIDTH);
            return;
                if (erdEntity != null) {
                                Rectangle curBounds = new Rectangle();
 * GraphicalViewer which also knows about ValidationMessageHandler to output
        dsDrawer.setId(container.getId());
                if (child instanceof EntityPart) {
 * error messages to
                    UIUtils.asyncExec(() -> {
import org.eclipse.draw2d.geometry.Dimension;
            diagramPart.resetFonts();
                } else {
                    break;
        }
            }
                            break;
                }
	 */
    {
        if (control != null) {
            case OBJECT_UPDATE: {
    }
    public void setContents(EditPart editpart)
	 * @param fe
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
        EntityDiagram diagram = editor.getDiagram();
        }
                    if (ownsObject || diagramContainer == entity.getParentObject()) {
            }
    public void handleTableDeactivate(DBSEntity table)
        }
        container.getRegistry().removeDataSourceListener(this);
                return (PaletteDrawer) child;
                            erdEntity.getReferenceAssociation(addedAssociation) == null &&
import org.jkiss.dbeaver.ui.DBeaverIcons;
        } else {
                            if (erdAttribute != null) {
            UIUtils.addFocusTracker(editor.getSite(), ERDUIConstants.ERD_CONTROL_ID, control);
    }
                final Control control = viewer.getControl();
import org.eclipse.swt.widgets.Event;


                        if (dataSourceInfo.tableCount <= 0) {
	 *            the focusEvent received by this viewer's control

    @Override

                    dataSourceInfo.tableCount++;
                            erdEntity.getAssociation(addedAssociation) == null &&
                    List<PaletteEntry> paletteEntries = new ArrayList<>(entry.getValue());
	/**
                    // No need now when we have lazy editors?
                                }
    }
            ERDEntity erdEntity1 = diagram.getEntity(entityAssociation.getParentObject());
    // TODO: implement
                        }
        }
/**
            // For association just refresh both entities
        DBPPreferenceStore prefStore = ERDUIActivator.getDefault().getPreferences();
            }
        }
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
        DBSEntityAttribute entityAttribute = null;
                }
	 * @param messageHandler message handler 
                                // Layout entity on diagram
            DBPDataSourceContainer container = table.getDataSource().getContainer();
                s -> applyThemeSettings(),
import org.eclipse.ui.part.MultiPageEditorSite;
    @Override
        if (object instanceof DBSEntityAttribute) {
*/
                    PaletteDrawer drawer = getContainerPaletteDrawer(container);
                    ERDEntity targetEntity = diagram.getEntity(entityAssociation.getAssociatedEntity());
            return;
        @Override
        PaletteDrawer dsDrawer = new PaletteDrawer(
            return new ToolSelectTable(table);
                    if (((EntityPart)child).getEntity().getObject() == table) {
            DBeaverIcons.getImageDescriptor(container.getDriver().getIcon()));
                ERDUIConstants.PROP_DIAGRAM_FONT,
                diagramPart.getDiagram().getModelAdapter().handleContentChange(editor);
                    ERDEntity erdEntity = diagram.getEntity(entity);
        finally {
                                erdEntity.firePropertyChange(ERDEntity.PROP_CONTENTS, null, null);
        container.release(editor);
            if (container != null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    boolean ownsObject =
    {
                    });
            if (viewer instanceof ScrollingGraphicalViewer) {
    private void releaseContainer(DBPDataSourceContainer container)
                for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
                }
        if (object instanceof DBPDataSourceContainer) {
                            }
            super.setContents(editpart);
                        entityOwnerEditor != null &&
                            erdAssociation.resolveAttributes();
                    }
            DefaultEditDomain editDomain = (DefaultEditDomain) getDomain();
        private final DBSEntity table;
                        erdEntity2.firePropertyChange(ERDEntity.PROP_OUTPUT, null, null);
            }
        }
                }
        paletteRoot.add(dsDrawer);


            }
                    canvas.scrollToX(hBar.getSelection() - (hBar.getIncrement() * event.count));
                    DBPDataSourceContainer container = table.getDataSource().getContainer();
        super.handleDispose(e);
                            if (erdAssociation != null) {
import org.jkiss.dbeaver.model.*;
        if (usedDataSources.containsKey(container) &&
        PaletteRoot paletteRoot = editor.getPaletteRoot();
                        }
        dsDrawer.setDescription(container.getDescription());
            UIUtils.asyncExec(() -> {

                    event.doit = false;
    private void acquireContainer(DBPDataSourceContainer container)
    }

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        break;
                    }
    private static class MouseWheelHorizontalScrollHandler implements MouseWheelHandler {
            ERDEntity erdEntity2 = diagram.getEntity(entityAssociation.getAssociatedEntity());

