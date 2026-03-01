            memo.put("name", refAssociation.getName());
                            if (!referenceKeys.isEmpty()) {
                    return Status.OK_STATUS;
    public IResultSetDecorator createResultSetDecorator() {

                            Collection<? extends DBSEntityAssociation> associations = DBVUtils.getAllAssociations(monitor, entity);
        final String refEntityName;
                CommonUtils.equalObjects(refAssociation.getName(), memo.refAssociationName);

                    }
                    if (activeReferenceKey == null || activeReferenceKey.targetEntity == null) {
    }
                                        attributes.add(entityAttribute);
                                    refs.add(new ReferenceKey(
import org.jkiss.dbeaver.model.app.DBPProject;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                                }
                                            if (key.matches(memo)) {
            @Override
    public ReferenceKey getActiveReferenceKey() {
 * distributed under the License is distributed on an "AS IS" BASIS,
            @NotNull
                    DBSEntityConstraint refConstraint = refAssociation.getReferencedConstraint();
        }
                                            refs.add(referenceKey);
import org.jkiss.dbeaver.ui.controls.CSmartCombo;
            this.refEntityName = CommonUtils.toString(map.get("entity"));
    static class ReferenceKeyMemo {
        }
                    }
        public String getText(Object element) {
                        return Status.OK_STATUS;
        Map<String, Object> createMemo() {
            }
                                    }
                                if (activeReferenceKey == null) {
                CommonUtils.equalObjects(DBUtils.getObjectFullName(refEntity, DBPEvaluationContext.UI), memo.refEntityName) &&
                    }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
            }
            refreshReferenceKeyList();
    @Nullable
        }
            return isReference == memo.isReference &&

                } else {
    @Override

    }
                    targetEntity = refAssociation.getParentObject();
                {
                                        attributeRefs
        List<ReferenceKeyMemo> refKeyMemos = new ArrayList<>();

                                List<? extends DBSEntityAttributeRef> attributeRefs = entityReferrer.getAttributeReferences(monitor);
                @NotNull
                    return;
                return ResultSetMessages.refs_no_refs_text;
                                }
                                    ));
     */
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    }

            if (targetEntity instanceof DBVEntity entity) {
                                        }
    }
    private static final String V_PROP_ACTIVE_ASSOCIATIONS = "ref-panel-associations";

    public DBSDataContainer getDataContainer() {
            if (element == null) {
                    });
            }
                                }
        }
                    if (!force && CommonUtils.equalObjects(lastSelectedRows, selectedRows)) {

                                        if (!CommonUtils.isEmpty(attrs)) {
                return DBeaverIcons.getImage(DBIcon.TREE_ASSOCIATION);
            this.refAssociation = refAssociation;
        return DBUtils.getObjectFullName(dataContainer, DBPEvaluationContext.DDL);
                            referenceKeys.addAll(refs);
import org.jkiss.code.Nullable;
                        }
            ResultSetMessages.refs_open_target,
    private final Composite mainComposite;
import org.eclipse.swt.layout.FillLayout;
    private ReferenceKey activeReferenceKey;
    }
                try {
                }
import org.eclipse.jface.viewers.LabelProvider;
            ));
                        }
        private final boolean isReference;
                    }
                entityAttributes.add(entityAttribute);
/*
import org.jkiss.code.NotNull;
                }
        fkCombo.addItem(null);
                            NavigatorUtils.openNavigatorNode(node, UIUtils.getActiveWorkbenchWindow());
    }
            ReferenceKey key = (ReferenceKey) element;
    }
                title = targetEntity.getName() + " (" + key.refAssociation.getName() + ")";
                        });
                } catch (Exception e) {
            this.refEntity = refEntity;
                            {
                activeReferenceKey = fkCombo.getSelectedItem();
                        log.debug("Error reading references", e);
    private final List<ReferenceKey> referenceKeys = new ArrayList<>();

 *
    }
     * Load list of referencing keys

        return mainComposite;
            memo.put("entity", DBUtils.getObjectFullName(refEntity, DBPEvaluationContext.UI));
                            referenceKeys.clear();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DBSObject targetEntity = key.targetEntity;

    public Composite getControl() {
                        if (activeReferenceKey.isReference) {
            dataViewer.showEmptyPresentation();
            this.refAttributes = refAttributes;
                } catch (DBException e) {
                Object activeAssociations = vEntityOwner.getProperty(V_PROP_ACTIVE_ASSOCIATIONS);
                    }
            }
                            }
                                    if (entityAttribute != null) {
                            // References
                    }

                if (isReference) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final IResultSetController parentController;
                    } finally {
        CSSUtils.setExcludeFromStyling(fkCombo);
        {
                            dataViewer.clearData(false);
            refreshKeyValues(force);
            viewerContainer.setLayout(new FillLayout());
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * You may obtain a copy of the License at
    private List<ResultSetRow> lastSelectedRows;

                        }
 * See the License for the specific language governing permissions and
                                selectedRows,
                        List<Map<String, Object>> activeAssociations = new ArrayList<>();
                if (parentController.getDataContainer() != null && parentController.getDataContainer().getDataSource() != targetEntity.getDataSource()) {
    static class ReferenceKey {
 * Unless required by applicable law or agreed to in writing, software
        }
        ));
import org.eclipse.core.runtime.Status;
        private DBSEntity targetEntity;

            return;
        Collection<DBSEntityAttribute> entityAttributes = new HashSet<>();
        }

            Map<String, Object> memo = new LinkedHashMap<>();
    }
            if (vEntityOwner != null) {
                        if (!CommonUtils.equalObjects(curActiveAssociations, activeAssociations)) {
    ReferencesResultsContainer(Composite parent, IResultSetController parentController) {
        }


     * Refresh data
            return;
            this.isReference = isReference;
            fkCombo.removeAll();
        new AbstractJob("Read references") {
                                monitor,
                                continue;
        Composite keySelectorPanel = UIUtils.createComposite(this.mainComposite, 3);
    @Nullable
import org.jkiss.dbeaver.model.struct.*;
    public IResultSetController getResultSetController() {
    /**

                        monitor.done();
import org.jkiss.dbeaver.model.virtual.DBVUtils;
 * you may not use this file except in compliance with the License.
                                // Skip virtual entities
                    }
        boolean matches(ReferenceKeyMemo memo) {
    }
                        }
        List<DBDAttributeBinding> visibleAttributes = parentController.getModel().getVisibleAttributes();
            if (targetEntity != null && key.refAssociation != null) {
        if (parentDataContainer == null) {
                            // Detect active ref key from memo
        });
                                            ReferenceKey referenceKey = new ReferenceKey(monitor, true, entity, assoc, attrs);

        }
                key.isReference ? UIIcon.ARROW_LEFT_ALL : UIIcon.ARROW_RIGHT_ALL);
                                    }
import org.jkiss.dbeaver.ui.css.CSSUtils;
                        synchronized (referenceKeys) {
                }

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    monitor.beginTask("Load references", allEntities.size());
        }
                    log.error(e);
                            }
        parentContainerFullName = getDataContainerFullName(parentDataContainer);
        } else if (dataContainer != null) {
            return DBeaverIcons.getImage(
    /**
            ReferenceKey key = (ReferenceKey) element;
        public Image getImage(Object element) {
            gd = new GridData(GridData.FILL_BOTH);
    }
import org.jkiss.dbeaver.model.data.DBDDataFilter;
            fkCombo.addItem(null);
            Composite viewerContainer = new Composite(mainComposite, SWT.NONE);


            return title;
                            refKeyMemos.add(new ReferenceKeyMemo(map));
            if (key == activeReferenceKey) {

    private String parentContainerFullName;
                refreshKeyValues(true);

                    } catch (DBException e) {
                                false);
                        if (refKeyMemoMap instanceof Map map) {
        UIUtils.syncExec(() -> {
                            if (entity instanceof DBVEntity) {
 *
    private final CSmartCombo<ReferenceKey> fkCombo;

        if (newParentContainer != parentDataContainer || !Objects.equals(getDataContainerFullName(newParentContainer), parentContainerFullName)) {
                                Collection<DBSEntityAttribute> attributes = new HashSet<>();
        activeReferenceKey = null;
        }
     *

import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.ui.controls.resultset.*;
                                                break;
                                    continue;
                                    for (ReferenceKey key : referenceKeys) {
                                        false,
        @Override
                    try {
        }.schedule();

                                    continue;
                fkCombo.select(key);
            }
        }

                            monitor.subTask(entity.getName());
        }
            return null;
                        UIUtils.asyncExec(() -> {
                    DBSEntity realEntity = entity.getRealEntity(monitor);
            gd.verticalIndent = 3;
                    for (Object refKeyMemoMap : collection) {
    @Override
            if (entityAttribute != null) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    } else {
        gd.horizontalIndent = 3;
                                                activeReferenceKey = key;
            return memo;

            DBIcon.TREE_TABLE,
                                }
 *
import org.eclipse.swt.events.SelectionListener;
                                parentController.getModel(),
        referenceKeys.clear();
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            DBSEntityAttribute entityAttribute = attr.getEntityAttribute();
            }.schedule();
                    List<ResultSetRow> selectedRows = parentController.getSelection().getSelectedRows();
                                        association,
                    return GeneralUtils.makeExceptionStatus(e);
        return new ReferencesResultsDecorator(this);
                    DBVEntity vEntityOwner = DBVUtils.getVirtualEntity(parentDataContainer, true);
            if (element == null) {

            return;
                            vEntityOwner.persistConfiguration();

                                for (DBSEntityAttributeRef attributeRef: attributeRefs) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.parentController = parentController;
                            // Foreign keys
        if (activeReferenceKey == null) {
    public void openNewContainer(DBRProgressMonitor monitor, @NotNull DBSDataContainer dataContainer, @NotNull DBDDataFilter newFilter) {
                }

            viewerContainer.setLayoutData(gd);
        fkCombo.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
                        }
        DBSDataContainer newParentContainer = parentController.getDataContainer();

                                parentController.getModel(),
        public boolean isReference() {
        if (dataContainer == null) {
import org.eclipse.swt.SWT;
    @Nullable

        private final DBSEntityAssociation refAssociation;

import org.jkiss.dbeaver.Log;
 * limitations under the License.
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    private class RefKeyLabelProvider extends LabelProvider {
                        }
        parentDataContainer = parentController.getDataContainer();
            }
        keySelectorPanel.setLayoutData(gd);
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
    public DBPProject getProject() {
                            }

        }
    }
        @Override
import java.util.*;
                try {

            dataViewer.clearData(false);
    private void fillKeysCombo() {
    }
                        return;
        for (DBDAttributeBinding attr : visibleAttributes) {
                    if (realEntity != null) {
                            dataViewer.navigateAssociation(
        final String refAssociationName;
                                if (!refKeyMemos.isEmpty()) {
                                            }
                        if (node != null) {
    public boolean isReadyToRun() {
        return dataViewer;
                                }
    private void refreshReferenceKeyList() {
        final boolean isReference;
        }
    void refreshReferences(boolean force) {
        ReferenceKey(DBRProgressMonitor monitor, boolean isReference, DBSEntity refEntity, DBSEntityAssociation refAssociation, List<? extends DBSEntityAttributeRef> refAttributes) {
import org.jkiss.utils.CommonUtils;
                    if (vEntityOwner != null) {
package org.jkiss.dbeaver.ui.controls.resultset.panel.references;
                }

    }
                    if (!(realEntity instanceof DBSDataContainer)) {
            refreshKeyValues(true);
import org.jkiss.dbeaver.model.virtual.DBVEntity;
                                if (attributeRefs == null) {
    @Override
                        targetEntity = realEntity;
                return Status.OK_STATUS;
            }
        private final DBSEntity refEntity;
            String title = "";
import org.jkiss.dbeaver.utils.GeneralUtils;
            SelectionListener.widgetSelectedAdapter(e -> {
            }
            memo.put("ref", isReference);

                            dataViewer.showEmptyPresentation();
    public DBCExecutionContext getExecutionContext() {
                    title += " [" + targetEntity.getDataSource().getContainer().getName() + "]";
     * Full name of the latest parentDataContainer. It is used for detection if the underlying data container has changed.
import org.eclipse.swt.graphics.Image;
            this.refAssociationName = CommonUtils.toString(map.get("name"));
class ReferencesResultsContainer implements IResultSetContainer {
import org.eclipse.swt.layout.GridData;
            DBVEntity vEntityOwner = DBVUtils.getVirtualEntity(parentDataContainer, false);

    @Nullable
            ResultSetMessages.refs_open_target_tip,
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ui.UIUtils;

     * See <a href="https://github.com/dbeaver/dbeaver/issues/11201">this ticket.</a>
                            for (DBSEntityAssociation association : associations) {
        dataViewer.resetHistory();
            fkCombo.addItem(key);
        return dataContainer == null || dataContainer.getDataSource() == null ? null : dataContainer.getDataSource().getContainer().getProject();
                                activeReferenceKey.refAssociation,
                                    if (assoc instanceof DBSEntityReferrer) {
        if (!allEntities.isEmpty()) {
    }
                }
                        return Status.OK_STATUS;

        if (activeReferenceKey != null) {
                                monitor,

            this.dataViewer = new ResultSetViewer(viewerContainer, parentController.getSite(), this);
        if (referenceKeys.isEmpty()) {

    @Override
     */
                        final DBNDatabaseNode node = DBNUtils.getNodeByObject(monitor, activeReferenceKey.targetEntity, true);
}
import org.eclipse.swt.widgets.Composite;
                }

                                }

            //log.error("No active reference key");
                            vEntityOwner.setProperty(V_PROP_ACTIVE_ASSOCIATIONS, activeAssociations);
        fkCombo = new CSmartCombo<>(keySelectorPanel, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY, new RefKeyLabelProvider());
                @Override
        if (allEntities.isEmpty() && parentDataContainer instanceof DBSEntity) {

                                    }
        return activeReferenceKey;
        return DBUtils.getDefaultContext(dataContainer, false);
                    }
                            }
                                        monitor,
                                        if (activeReferenceKey != null) break;
                                        }
     */
                                        List<? extends DBSEntityAttributeRef> attrs = ((DBSEntityReferrer) assoc).getAttributeReferences(monitor);
        }

    private void refreshKeyValues(boolean force) {
        }
                allEntities.add(entityAttribute.getParentObject());

    private DBSDataContainer parentDataContainer;
                            dataViewer.navigateReference(
        UIUtils.createPushButton(
    @Override
 */
                        // Do not show errors. References or FKs may be unsupported by current database

import org.jkiss.dbeaver.ui.UIIcon;
                                if (!(association instanceof DBSEntityReferrer entityReferrer)) {
                                        for (ReferenceKeyMemo memo : refKeyMemos) {
                    if (refConstraint != null) {
                // Save active keys in virtual entity props
    }
                    if (selectedRows.isEmpty()) {
        return this.dataContainer;
    private static String getDataContainerFullName(@Nullable DBSDataContainer dataContainer) {
                                selectedRows, false);
        DBSDataContainer dataContainer = getDataContainer();
            this.isReference = CommonUtils.toBoolean(map.get("ref"));
                        List<ReferenceKey> refs = new ArrayList<>();
import org.jkiss.dbeaver.model.DBIcon;
                                }
            keySelectorPanel,
        }
                    UIUtils.runUIJob("Open object editor", monitor -> {
                                if (!attributes.isEmpty() && entityAttributes.containsAll(attributes)) {
 * DBeaver - Universal Database Manager
                if (activeAssociations instanceof Collection<?> collection) {
                        for (DBSEntity entity : allEntities) {
        gd.verticalIndent = 3;
                                    activeReferenceKey = referenceKeys.getFirst();
                        } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private DBSDataContainer dataContainer;
        Set<DBSEntity> allEntities = new LinkedHashSet<>();
                    lastSelectedRows = selectedRows;
            if (refAssociation != null) {
        for (ReferenceKey key : referenceKeys) {
                        activeAssociations.add(activeReferenceKey.createMemo());
                        log.error("Referencing entity is not a data container");

        return true;
                            Collection<? extends DBSEntityAssociation> references = DBVUtils.getAllReferences(monitor, entity);
        if (fkCombo.isDisposed()) {
        if (visibleAttributes.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                                for (DBSEntityAssociation assoc : references) {
                        UIUtils.syncExec(() -> fillKeysCombo());

                    DBSEntity realEntity = DBVUtils.getRealEntity(monitor, activeReferenceKey.refEntity);
        }
import org.eclipse.core.runtime.IStatus;
            }
            return isReference;
                                    DBSEntityAttribute entityAttribute = attributeRef.getAttribute();
                if (activeReferenceKey == null) {
        ReferenceKeyMemo(Map<String, Object> map) {
                        Object curActiveAssociations = vEntityOwner.getProperty(V_PROP_ACTIVE_ASSOCIATIONS);
                }
        private final List<? extends DBSEntityAttributeRef> refAttributes;
        }
                                activeReferenceKey.refAssociation,
            }
        }
    }

                    dataContainer = (DBSDataContainer) realEntity;
    /**
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    private final ResultSetViewer dataViewer;
    }
        {
        fkCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fkCombo.removeAll();
    @Override
    }
        this.mainComposite = UIUtils.createPlaceholder(parent, 1);
                                        association.getAssociatedEntity(),
            return;
                            monitor.worked(1);
    private static final Log log = Log.getLog(ReferencesResultsContainer.class);
import org.jkiss.dbeaver.model.runtime.AbstractJob;

                        targetEntity = refConstraint.getParentObject();
                }
            new AbstractJob("Load reference keys") {
            allEntities.add((DBSEntity) parentDataContainer);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
