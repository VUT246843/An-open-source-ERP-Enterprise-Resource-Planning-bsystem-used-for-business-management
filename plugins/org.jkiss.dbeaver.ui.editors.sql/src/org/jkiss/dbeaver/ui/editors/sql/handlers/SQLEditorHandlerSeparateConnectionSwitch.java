}
            if (currValue.equals(behavior)) {
            preferenceStore.getString(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION)
            SeparateConnectionBehavior.DEFAULT,
            DBPDataSourceContainer dsContainer = AbstractDataSourceHandler.getDataSourceContainerFromPart(page.getActiveEditor());
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                            return dataSource.getContainer().getPreferenceStore();
 *
            ) {
        List<SeparateConnectionBehavior> behaviors = List.of(
                if (selection != null) {
            }
import org.eclipse.jface.action.IContributionItem;
        return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
        );
        
    protected IContributionItem[] getContributionItems() {
            } 
import org.eclipse.jface.action.ActionContributionItem;
        } 
            return new IContributionItem[] { new ActionContributionItem(placeholder) };
        IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
            };
        List<IContributionItem> items = new ArrayList<>(behaviors.size());
        SeparateConnectionBehavior currValue = SeparateConnectionBehavior.parse(
        
                        }
 * See the License for the specific language governing permissions and
                ISelection selection = navigatorView.getNavigatorViewer().getSelection();
                public void run() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
        DBPPreferenceStore preferenceStore = getPreferenceStore();
            placeholder.setEnabled(false);
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
import java.util.List;
                    DBSObject selectedObject = NavigatorUtils.getSelectedObject(selection);
/*
    }
            };
 */
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                Action.AS_UNSPECIFIED
public class SQLEditorHandlerSeparateConnectionSwitch extends CompoundContributionItem {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                public void run() {
            INavigatorModelView navigatorView = GeneralUtils.adapt(page.getActivePart(), INavigatorModelView.class);
                    } else if (selectedObject != null) {
    private DBPPreferenceStore getPreferenceStore() {
                    // do nothing
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
import org.eclipse.ui.IWorkbenchPage;
import org.jkiss.dbeaver.model.DBPDataSource;

            Action action = new Action(behavior.getTitle(), Action.AS_RADIO_BUTTON) {
            if (dsContainer != null) { 
import org.jkiss.code.NotNull;
                action.setChecked(true);
        if (page != null) {
import org.eclipse.ui.actions.CompoundContributionItem;
 * DBeaver - Universal Database Manager
            
        if (preferenceStore == null) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            Action placeholder = new Action(
    @NotNull
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
 *
                @Override
import org.eclipse.jface.action.Action;
            SeparateConnectionBehavior.ALWAYS,
 * Licensed under the Apache License, Version 2.0 (the "License");

                    if (selectedObject instanceof DBPDataSourceContainer) {
                    }
                SQLEditorMessages.sql_editor_separate_connection_no_editor_or_ds_selected,
            if (navigatorView != null) {
        );
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
                }
                }
                        if (dataSource != null) {
                        return ((DBPDataSourceContainer) selectedObject).getPreferenceStore();
import org.eclipse.ui.IWorkbenchWindow;
 * you may not use this file except in compliance with the License.
                        DBPDataSource dataSource = selectedObject.getDataSource();

import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import org.jkiss.dbeaver.utils.PrefUtils;

 *
            SeparateConnectionBehavior.NEVER
import org.jkiss.dbeaver.ui.UIUtils;
        return items.toArray(new IContributionItem[behaviors.size()]);

                return dsContainer.getPreferenceStore();
        IWorkbenchPage page = window.getActivePage();
                    PrefUtils.savePreferenceStore(preferenceStore);
        }
                    preferenceStore.setValue(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION, behavior.name());
            items.add(new ActionContributionItem(action));
import org.eclipse.jface.viewers.ISelection;

        }
import java.util.ArrayList;
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Nullable
        
        for (final SeparateConnectionBehavior behavior : behaviors) {
                }
                @Override
