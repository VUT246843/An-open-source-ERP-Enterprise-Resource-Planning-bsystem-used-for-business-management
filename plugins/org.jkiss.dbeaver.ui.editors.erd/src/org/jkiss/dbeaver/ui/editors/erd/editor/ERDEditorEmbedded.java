    {
           
 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;
                        getDiagram().disableDiagramMonitor();
import org.eclipse.jface.action.IContributionManager;
    @Override
        this.parent = parent;
    @Override
                    monitor,
            diagram.setLayoutManualAllowed(true);
        if (monitor.isCanceled()) {
    public void createPartControl(Composite parent)
        if (!dbObject.isPersisted()) {
import org.jkiss.dbeaver.ui.editors.entity.IEntityStructureEditor;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (rootObject instanceof DBSEntity) {
                vObject.persistConfiguration();

                            Document xmlDocument = XMLUtils.parseDocument(new StringReader(serializedDiagram));
            super.setFocus();
        DBPDataSource dataSource = getExecutionContext().getDataSource();
        }

            diagramStateMap.put(PROPS_DIAGRAM_SERIALIZED, diagramState);
            String diagramState = DiagramLoader.serializeDiagram(RuntimeUtils.makeMonitor(monitor), getDiagramPart(), getDiagram(), false, true);
            refreshDiagram(true, true);
        //super.createEditorControl(parent);
    public boolean isStateSaved() {
        }
            }
            // Fill from database even if we loaded from state (something could change since last view)
        monitor.beginTask("Load database entities", 1);
                            ERDUIActivator.getDefault().getPreferenceStore().getBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS)),
import org.jkiss.dbeaver.DBException;
    /**
import org.jkiss.dbeaver.model.erd.ERDUtils;
    @Nullable
        if (refreshDiagram) {
import org.jkiss.dbeaver.model.DBPDataSource;
        }
                    Map<String, Object> diagramState = vObject.getProperty(PROP_DIAGRAM_STATE);

            return null;
    public void deactivatePart()
    }

                            ERDUIActivator.getDefault().getPreferenceStore().getBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS),
                return;
        DBSObject rootObject = getRootObject();
        }
        toolBarManager.add(new Separator());
    {
                diagram.setRootObjectContainer((DBSObjectContainer) dbObject);
            diagram.fillEntities(
 *
        if (dbObject == null) {
            return null;
            //diagram = new EntityDiagram(dbObject, dbObject.getName(), getContentProvider(), getDecorator());
        if (object == null) {
    }


            // Save in virtual model as entity property.
            try {
    }
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramTogglePersistAction;
            },
    }
        // validate connections first
    
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
    private DBVObject getVirtualObject() {
        }
                            dbObject,
            boolean hasPersistedState = false;
    }
        }
import org.jkiss.dbeaver.model.app.DBPProject;
                            monitor,
import org.jkiss.dbeaver.ui.LoadingJob;
            return null;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
 * Unless required by applicable law or agreed to in writing, software
        if (object instanceof DBPDataSourceContainer && object.getDataSource() != null) {
            monitor.subTask("Connect to '" + container.getName() + "'");
            if (vObject == null) {
                    try {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                diagramLoadingJob = null;
        DBPDataSourceContainer container = dataSource.getContainer();
        } else {
                    }
                        log.error(msg, e);
    }
    {
     * No-arg constructor
    }
    @Override
                    if (diagramState != null) {
    private static final String PROP_DIAGRAM_STATE = "erd.diagram.state";
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramLoader;
            }
        try {
        return (vObject != null && vObject.getProperty(PROP_DIAGRAM_STATE) != null);
    }
    {
 * DBeaver - Universal Database Manager
            }
        }
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Nullable
    {
    private static final String PROPS_DIAGRAM_SERIALIZED = "serialized";
            return;
                        String serializedDiagram = (String) diagramState.get(PROPS_DIAGRAM_SERIALIZED);
    @Override
        if (node == null) {
    public DBCExecutionContext getExecutionContext()
            return DBVUtils.getVirtualObject(rootObject, true);
            return null;
        return project != null && !project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
        return diagram;
        if (progressControl != null) {
        EntityDiagram oldDiagram = getDiagram();
import org.eclipse.jface.action.Separator;
        if (progressControl == null) {
        DBVObject vObject = this.getVirtualObject();
import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;
                            hasPersistedState = true;
    }
            DBVObject vObject = this.getVirtualObject();
        }
            //diagram = new EntityDiagram(dbObject, "New Object", getContentProvider(), getDecorator());
        final DBSObject object = getRootObject();
        if (diagramLoadingJob != null) {
        updateToolbarActions();
            Map<String, Object> diagramStateMap = new LinkedHashMap<>();
import org.eclipse.osgi.util.NLS;


 * limitations under the License.
        diagram.clear();
    }
            return;
import org.jkiss.dbeaver.ui.IActiveWorkbenchPart;
                            diagram,
                @Override

    }
                // Load persisted state
        }
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 */
            vObject.persistConfiguration();

    }
        }
    private static final String GROUP_SAVE = "save";
            // Do not start new one while old is running
                        if (!CommonUtils.isEmpty(serializedDiagram)) {
import org.eclipse.swt.SWT;
import org.jkiss.utils.xml.XMLUtils;
                    return null;
            super.createPartControl(parent);

                    } finally {
            } catch (Exception e) {
    {
        if (!container.isConnected()) {
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
        DBPProject project = this.getDiagramProject();
    @Override
    private EntityDiagram loadFromDatabase(DBRProgressMonitor monitor) throws DBException {
        if (isLoaded()) {
    @Override
        diagramLoadingJob.schedule();
                        EntityDiagram diagram = loadFromDatabase(monitor);
/*


                throw new DBException("DataSource " + dataSource.getName() + " is disconnected. Please revalidate it.");
            vObject.setProperty(PROP_DIAGRAM_STATE, diagramStateMap);
            log.error("Error saving diagram", e);
        return object;
                        visuallize(monitor, diagram);
        EntityDiagram diagram = oldDiagram;
import org.jkiss.dbeaver.ui.UIUtils;
    }
            }
            if (vObject != null && vObject.getProperty(PROP_DIAGRAM_STATE) != null) {


     */
        try {
    @Nullable
            return DBVUtils.getVirtualEntity((DBSEntity) rootObject, true);
        DatabaseEditorUtils.contributeStandardEditorActions(getSite(), toolBarManager);
                log.debug(e);
                            DiagramLoader.loadDiagram(monitor, xmlDocument, dbObject.getDataSource().getContainer().getProject(), diagram);
                        }
 * You may obtain a copy of the License at
    protected synchronized void loadDiagram(final boolean refreshMetadata)
    public ERDEditorEmbedded()
        toolBarManager.add(new Separator(GROUP_SAVE));

public class ERDEditorEmbedded extends ERDEditorPart
/**
    {

                vObject.setProperty(PROP_DIAGRAM_STATE, null);
        //diagram.setMonitorForDiagram(monitor);
    {
                }
import org.jkiss.dbeaver.Log;
        }
import org.jkiss.dbeaver.ui.ActionUtils;
        }
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
            try {
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
            new DatabaseLoadService<EntityDiagram>("Load diagram '" + object.getName() + "'", object.getDataSource()) {
    }
        getCommandStack().markSaveLocation();
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.virtual.DBVObject;
        // Do not create controls here - do it on part activation
            if (dbObject instanceof DBSObjectContainer) {
    private static final Log log = Log.getLog(ERDEditorEmbedded.class);

    @Override
        }
    private DBSObject getRootObject()
    }
                            msg, SWT.ICON_ERROR);
            object = object.getDataSource();
                        return diagram;
            DBVObject vObject = this.getVirtualObject();
        toolBarManager.add(ActionUtils.makeActionContribution(new DiagramTogglePersistAction(this), true));
 * distributed under the License is distributed on an "AS IS" BASIS,
                        String msg = NLS.bind(ERDUIMessages.erd_error_of_loading_diagram_label, e.getMessage());
    @Override
import org.eclipse.core.runtime.IProgressMonitor;
        });
    public boolean isReadOnly()
            public void done(IJobChangeEvent event) {

    protected void fillDefaultEditorContributions(IContributionManager toolBarManager) {
            diagram.setNeedsAutoLayout(!hasPersistedState);
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
    public void resetSavedState(boolean refreshDiagram) {
        } catch (Exception e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public IDatabaseEditorInput getEditorInput()
            return null;
            log.error("Error resetting diagram state", e);
import org.jkiss.dbeaver.model.rm.RMConstants;
                if (vObject != null) {
        } catch (Exception e) {
            }
import org.w3c.dom.Document;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
import org.jkiss.utils.CommonUtils;
        } else {
    }
    }

    }
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    public void doSave(IProgressMonitor monitor) {
                DBVObject vObject = this.getVirtualObject();
 *
                    }
            progressControl.createLoadVisualizer());

import org.jkiss.dbeaver.model.virtual.DBVUtils;
    public void setFocus()
import org.jkiss.dbeaver.utils.RuntimeUtils;
    private Composite parent;
                    } catch (DBException e) {
import java.io.StringReader;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSEntity;
                            ERDUIMessages.erd_error_of_loading_diagram_title,
import org.jkiss.code.Nullable;
    public void doRevertToSaved() {
    }
                public EntityDiagram evaluate(@NotNull DBRProgressMonitor monitor) {
        DBNDatabaseNode node = getEditorInput().getNavigatorNode();
                    ERDUtils.collectDatabaseTables(
    public DBPProject getDiagramProject() {
            getCommandStack().markSaveLocation();
    {
import org.jkiss.dbeaver.ui.editors.IRevertableEditor;
        // Not implemented
            }

        monitor.subTask("Clear diagram");
        super.fillDefaultEditorContributions(toolBarManager);
        }
        return (IDatabaseEditorInput)super.getEditorInput();
                container.connect(monitor, true, true);
        return getEditorInput().getExecutionContext();
        }
 */
        DBSObject object = getEditorInput().getDatabaseObject();
            return;
                log.error("Error loading ER diagram from saved state", e);
 * Embedded ERD editor

        }
    @Override
                        UIUtils.showMessageBox(null,
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Override
        return node.getOwnerProject();
        loadDiagram(false);
        if (object == null) {
                        getDiagram().setDiagramMonitor(monitor);
    {


            @Override

    @Override
                }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    dbObject);

import java.util.LinkedHashMap;
            parent.layout();
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
    implements IDatabaseEditor, IEntityStructureEditor, IActiveWorkbenchPart, IRevertableEditor {
        diagramLoadingJob.addJobChangeListener(new JobChangeAdapter() {

 * See the License for the specific language governing permissions and

    @Override

        }
        DBSObject dbObject = getRootObject();

    @Override
        if (getEditorInput() == null) {
        diagramLoadingJob = LoadingJob.createService(
                        monitor.done();
            log.error("Database object must be entity container to render ERD diagram");
            } catch (DBException e) {

}
    public void activatePart()
    public void recreateEditorControl() {
package org.jkiss.dbeaver.ui.editors.erd.editor;
import java.util.Map;
