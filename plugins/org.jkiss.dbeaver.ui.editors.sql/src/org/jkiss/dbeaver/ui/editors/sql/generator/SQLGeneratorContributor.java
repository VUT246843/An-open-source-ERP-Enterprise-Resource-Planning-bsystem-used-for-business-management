                    IWorkbenchPart activePart = activePage.getActivePart();
    @Override
                        SQLGenerator<?> generator;
import org.eclipse.ui.IWorkbenchPage;
            String message = dataContainer == null ? "no data container" :
                } else if (obj instanceof DBPObject) {
    // Generators
 * Licensed under the Apache License, Version 2.0 (the "License");
                            "generator", generator.getClass().getSimpleName()));
                public void run() {
import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                    IWorkbenchPage activePage = UIUtils.getActiveWorkbenchWindow().getActivePage();
                @Override
    protected IContributionItem[] getContributionItems() {

            final List<ResultSetRow> selectedRows = new ArrayList<>(rss.getSelectedRows());

import org.jkiss.dbeaver.DBException;
                } else {

        }
                List<SQLGeneratorDescriptor> generators = SQLGeneratorConfigurationRegistry.getInstance().getApplicableGenerators(objects, rsv);
        IStructuredSelection structuredSelection = NavigatorUtils.getSelectionFromPart(part);
                for (SQLGeneratorDescriptor gen : generators) {
                            activePage.getActivePart().getSite(),
                            DBWorkbench.getPlatformUI().showError("Generator create", "Can't create SQL generator '" + sqlGenerator.getId() + "'", e);
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;

        SQLGeneratorSelect generatorSelect = new SQLGeneratorSelect();
import org.jkiss.dbeaver.model.sql.registry.SQLGeneratorConfigurationRegistry;
                            return;
import org.jkiss.dbeaver.ui.editors.sql.dialogs.ViewSQLDialog;
import org.jkiss.dbeaver.model.sql.registry.SQLGeneratorDescriptor;

        SQLGeneratorProcedureCall procedureCall = new SQLGeneratorProcedureCall();
    public static SQLGenerator<DBSProcedure> CALL_GENERATOR(final List<DBSProcedure> entities) {
                        executionContext = ((DBPContextProvider) activeEditor).getExecutionContext();
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorFeatures;

import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
import org.eclipse.jface.action.*;
    private void makeResultSetContributions(List<IContributionItem> menu, IResultSetSelection rss) {
            Action disabledAction = new Action("Not available - " + message) {
                        dialog.open();
                        }
 */
                (visibleAttributes.isEmpty() ? "empty attribute list" : "can't resolve table");
    @NotNull
    public static SQLGenerator<DBSEntity> SELECT_GENERATOR(final List<DBSEntity> entities, final boolean columnList) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
                }
            }
            // Results
 *
    }
    //////////////////////////////////////////////////////////
                    if (activePart != null) {
            return new IContributionItem[0];
            //if (dataContainer != null && !visibleAttributes.isEmpty() && entity != null)
    @NotNull

}
                                executionContext = DBUtils.getDefaultContext(selectedObject, false);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    public static boolean hasContributions(IStructuredSelection selection) {
        if (structuredSelection == null || structuredSelection.isEmpty()) {
            menu.add(new ActionContributionItem(disabledAction));
import org.jkiss.utils.CommonUtils;
                    IEditorPart activeEditor = activePage.getActiveEditor();
                if (adaptedObject != null) {
        final DBSEntity entity = rsv.getModel().getSingleSource();
import org.jkiss.dbeaver.model.struct.DBSWrapper;
                            }

            makeResultSetContributions(menu, (IResultSetSelection) structuredSelection);
                }
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
                lastGrand = order / 1000;
                            if (selectedObject != null) {
 * Unless required by applicable law or agreed to in writing, software
                if (order > 0 && order / 1000 > lastGrand) {
 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
                    menu.add(new Separator());
                DBSObject adaptedObject;
                            executionContext,
                    if (executionContext == null && activeEditor instanceof DBPContextProvider) {

        procedureCall.initGenerator(entities);
            }
        generatorSelect.setColumnList(columnList);
 *
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        if (structuredSelection instanceof IResultSetSelection) {
                        } catch (DBException e) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
                        }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
                    }
    ///////////////////////////////////////////////////
                }
import org.eclipse.jface.viewers.IStructuredSelection;
                } else if (obj instanceof DBSWrapper) {

import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;

        IWorkbenchPart part = UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart();
import org.jkiss.dbeaver.model.sql.generator.SQLGeneratorProcedureCall;
    // Contributors
import org.jkiss.dbeaver.model.sql.generator.SQLGeneratorSelect;
        final IResultSetController rsv = rss.getController();
import org.jkiss.dbeaver.ui.UIUtils;
    }
                    adaptedObject = folder.getParentObject();
        }
import org.eclipse.ui.IEditorPart;

                        if (selectionProvider != null) {
        final List<DBDAttributeBinding> visibleAttributes = rsv.getModel().getVisibleAttributes();
            });
    private static ContributionItem makeAction(String text, SQLGeneratorDescriptor sqlGenerator, List<?> objects) {
public class SQLGeneratorContributor extends CompoundContributionItem {
            int lastGrand = 0;
                        dialog.setWordWrap(true);
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {

        List<IContributionItem> menu = new ArrayList<>();
        }
 * See the License for the specific language governing permissions and
        generatorSelect.initGenerator(entities);
                        SQLEditorFeatures.SQL_EDITOR_GENERATE_SQL_ON_OBJECT.use(Map.of(
                objects.add(rsv);
        // Table
            if (!CommonUtils.isEmpty(selectedRows)) {
import org.eclipse.ui.actions.CompoundContributionItem;
package org.jkiss.dbeaver.ui.editors.sql.generator;
        return menu.toArray(new IContributionItem[0]);
            new Action(text, DBeaverIcons.getImageDescriptor(DBIcon.SQL_TEXT)) {
        return object instanceof DBSTable || object instanceof DBPScriptObject;

                }
 *
                        try {
                    objects.add(((DBSWrapper) obj).getObject());
                    if (executionContext != null) {
import java.util.ArrayList;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return new ActionContributionItem(
                        ISelectionProvider selectionProvider = activePart.getSite().getSelectionProvider();
        return generatorSelect;
        return procedureCall;
                    adaptedObject = GeneralUtils.adapt(obj, DBSObject.class);
            disabledAction.setEnabled(false);
                        continue;

import java.util.List;
                menu.add(makeAction(gen.getLabel(), gen, objects));
    }
                    DBCExecutionContext executionContext = null;

import org.jkiss.dbeaver.Log;
import java.util.Map;
        if (dataContainer != null && !visibleAttributes.isEmpty() && entity != null) {
                    }
/*
                    }
                            generator = sqlGenerator.createGenerator(objects);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.model.*;
            for (Object obj : structuredSelection.toList()) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
                            DBSObject selectedObject = NavigatorUtils.getSelectedObject(selectionProvider.getSelection());
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetSelection;
 * limitations under the License.

                        ViewSQLDialog dialog = new SQLGeneratorDialog(
        DBSObject object = RuntimeUtils.getObjectAdapter(selection.getFirstElement(), DBSObject.class);
                            generator);
                    if (gen.isMultiObject() && selectedRows.size() < 2) {
            };
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.IWorkbenchPart;
                    objects.add((DBPObject) obj);
import org.eclipse.jface.viewers.ISelectionProvider;
                if (obj instanceof DBNDatabaseFolder folder) {
            for (SQLGeneratorDescriptor gen : generators) {
    static protected final Log log = Log.getLog(SQLGeneratorContributor.class);
                List<IResultSetController> objects = new ArrayList<>();

    }
                }
            List<SQLGeneratorDescriptor> generators = SQLGeneratorConfigurationRegistry.getInstance().getApplicableGenerators(objects, structuredSelection);
                    menu.add(makeAction(gen.getLabel(), gen, objects));

    }
                int order = gen.getOrder();
import org.jkiss.code.NotNull;
        DBSDataContainer dataContainer = rsv.getDataContainer();
            List<DBPObject> objects = new ArrayList<>();
                    objects.add(adaptedObject);
