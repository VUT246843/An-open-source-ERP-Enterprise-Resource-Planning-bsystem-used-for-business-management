                    public void run() {
import org.jkiss.dbeaver.ui.DBeaverIcons;
                            associations.add(fk);
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                    return GeneralUtils.makeExceptionStatus(e);
            manager.add(REFS_TITLE_ACTION);
{
                                        rows,
                monitor.done();
                        if (ownConstraint instanceof DBSEntityReferrer) {
                monitor.beginTask("Read references", 1);
 * See the License for the specific language governing permissions and
                }
                        }.schedule();
                                        new VoidProgressMonitor(),
}
            try {
                            @Override
                                for (DBSEntityAttributeRef ownAttrRef : attributeReferences) {
                    }
                            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                                try {
 */
        FKS_TITLE_ACTION = new EmptyAction(ResultSetMessages.controls_resultset_ref_menu_associations);
            if (extMonitor != null) {
 *
                            @NotNull
                                        openInNewWindow);
                            for (DBSEntityAttributeRef ownAttr : ((DBSEntityReferrer) fk).getAttributeReferences(monitor)) {
            manager.add(new Separator());
        } else {
                if (fks != null) {
                Collection<? extends DBSEntityAssociation> fks = singleSource.getAssociations(monitor);
        }

                    }
                                if (viewer.getModel().getAttributeBinding(ownAttr.getAttribute()) == null) {
                        new AbstractJob("Navigate reference") {
import org.eclipse.core.runtime.IStatus;
import java.util.List;
import org.jkiss.dbeaver.ui.UIUtils;
                monitor.beginTask("Read associations", 1);
                            List<? extends DBSEntityAttributeRef> attributeReferences = ((DBSEntityReferrer) ownConstraint).getAttributeReferences(monitor);
                    return;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        DBRRunnableWithProgress refCollector = monitor -> {
                        boolean allMatch = true;
                        if (allMatch) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                            @NotNull
            manager.add(NOFKS_ACTION);
                    for (DBSEntityAssociation fk : fks) {
import org.jkiss.dbeaver.DBException;
        };
import java.util.Comparator;
            DBWorkbench.getPlatformUI().showError("Table References", "Error reading referencing tables for '" + singleSource.getName() + "'", e.getTargetException());
                UIUtils.runInProgressService(refCollector);
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
        manager.removeAll();
import java.util.Collection;
        if (CommonUtils.isEmpty(references)) {
    static Action NOREFS_ACTION, REFS_TITLE_ACTION, NOFKS_ACTION, FKS_TITLE_ACTION;
            manager.add(new Separator());
                                allMatch = false;
 * distributed under the License is distributed on an "AS IS" BASIS,
                            }
            ArrayList<Action> entries = new ArrayList<>(references.size());
                            return;
            entries.sort(Comparator.comparing(Action::getText));
            for (DBSEntityAssociation refAssociation : references) {
                if (monitor.isCanceled()) {
import org.eclipse.jface.action.IMenuManager;
                            references.add(ref);
                            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                        }
                        monitor.subTask("Check association " + fk.getName());
                                    allMatch = false;
            manager.add(FKS_TITLE_ACTION);
public class ResultSetReferenceMenu
                                return Status.OK_STATUS;
            for (DBSEntityAssociation association : associations) {
                entries.add(new Action(
        }
            } else {
                                    viewer.navigateAssociation(new VoidProgressMonitor(), viewer.getModel(), association, rows, openInNewWindow);
 * You may obtain a copy of the License at
        } else {
                        DBSEntityConstraint ownConstraint = ref.getReferencedConstraint();
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        if (monitor.isCanceled()) {
                    monitor.beginTask("Check references", refs.size());
        final List<DBSEntityAssociation> associations = new ArrayList<>();

                        if (fk instanceof DBSEntityReferrer && fk.getReferencedConstraint() != null) {
        if (CommonUtils.isEmpty(associations)) {
                        }
                            return;
                                return Status.OK_STATUS;
                Collection<? extends DBSEntityAssociation> refs = DBVUtils.getAllReferences(monitor, singleSource);
    static void fillRefTablesActions(@Nullable DBRProgressMonitor extMonitor, ResultSetViewer viewer, List<? extends DBDValueRow> rows, DBSEntity singleSource, IMenuManager manager, boolean openInNewWindow) {

import org.jkiss.code.NotNull;

                                    if (viewer.getModel().getAttributeBinding(ownAttrRef.getAttribute()) == null) {
                                        // Attribute is not in the list - skip this association
package org.jkiss.dbeaver.ui.controls.resultset;
 *     http://www.apache.org/licenses/LICENSE-2.0
                            @Override
import org.jkiss.dbeaver.model.DBUtils;
                                    }
import org.eclipse.jface.action.Action;

                            if (attributeReferences != null) {
                                    break;

                DBSEntity refTable = refAssociation.getParentObject();
                }
            }
import org.jkiss.dbeaver.model.data.DBDValueRow;
                                }
        } catch (InvocationTargetException e) {
            entries.forEach(manager::add);
                        new AbstractJob("Navigate association") {
                                }
import org.jkiss.dbeaver.model.runtime.AbstractJob;


import java.lang.reflect.InvocationTargetException;
                    }
                monitor.done();
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                                }
    }
                entries.add(new Action(
                        }.schedule();
                        }
 * Unless required by applicable law or agreed to in writing, software
                                    // Attribute is not in the list - skip this association
                        }

            return;
import org.jkiss.dbeaver.ui.EmptyAction;
 *
        try {
                            } else {
                                        refAssociation,
import org.jkiss.dbeaver.model.struct.*;
                        monitor.subTask("Check references " + ref.getName());
                    }
                            }
                    DBUtils.getObjectFullName(refTable, DBPEvaluationContext.UI) + " (" + association.getName() + ")",
                                        viewer.getModel(),
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
        } catch (InterruptedException e) {
                        }
            }
            entries.forEach(manager::add);
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.model.virtual.DBVUtils;
                    for (DBSEntityAssociation ref : refs) {
                                }
                                } catch (DBException e) {
        final List<DBSEntityAssociation> references = new ArrayList<>();
                });
 * Licensed under the Apache License, Version 2.0 (the "License");
                refCollector.run(extMonitor);

                            }
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ArrayList<Action> entries = new ArrayList<>(associations.size());
    static {
import java.util.ArrayList;
                        if (monitor.isCanceled()) {
                                } catch (DBException e) {
                    DBeaverIcons.getImageDescriptor(DBSEntityType.TABLE.getIcon())) {
                                    viewer.navigateReference(
 * References
                    @Override
        }

                    DBUtils.getObjectFullName(refTable, DBPEvaluationContext.UI) + " (" + refAssociation.getName() + ")",
                {
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
                                        allMatch = false;
                    DBeaverIcons.getImageDescriptor(DBSEntityType.TABLE.getIcon())) {
                                    return GeneralUtils.makeExceptionStatus(e);
                });
        NOREFS_ACTION = new EmptyAction(ResultSetMessages.controls_resultset_ref_menu_no_references);
 *
                throw new InvocationTargetException(e);
            }
                        }
                        monitor.worked(1);

            } catch (DBException e) {

import org.eclipse.jface.action.Separator;
                    @Override
                    public void run() {
                                try {
                        if (allMatch) {
                            }
                        boolean allMatch = true;
                DBSEntity refTable = association.getReferencedConstraint().getParentObject();
 */
                                        break;

        manager.add(new Separator());
                }
 * you may not use this file except in compliance with the License.
        NOFKS_ACTION = new EmptyAction(ResultSetMessages.controls_resultset_ref_menu_no_associations);
            entries.sort(Comparator.comparing(Action::getText));

            manager.add(NOREFS_ACTION);
 * limitations under the License.
                        monitor.worked(1);
        REFS_TITLE_ACTION = new EmptyAction(ResultSetMessages.controls_resultset_ref_menu_references);
import org.jkiss.code.Nullable;
                    monitor.beginTask("Check associations", fks.size());
            }
