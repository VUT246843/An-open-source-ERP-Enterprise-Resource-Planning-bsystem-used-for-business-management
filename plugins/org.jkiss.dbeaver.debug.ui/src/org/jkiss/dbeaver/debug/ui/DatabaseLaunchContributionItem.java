            if (group.getMode().equals(mode)) {


 */
    // default launch group for this mode (null category)
 * DBeaver - Universal Database Manager
            }
import org.eclipse.jface.action.IAction;
import java.util.*;
                    ActionContributionItem item = new ActionContributionItem(action);
                ActionContributionItem item = new ActionContributionItem(action);
        Set<IAction> actions = shortcutActions.keySet();
        if (menu.getItemCount() > 0 && shortcutActions.size() > 0) {
    }
        for (IAction action : actions) {
 *
import org.eclipse.jface.viewers.ISelection;
        }
                }
        groupsByCategory = new HashMap<String, ILaunchGroup>(3);
            Object[] array = structured.toArray();
            }
            if (category != null && !categories.contains(category)) {
    public void fill(Menu menu, int index) {
    }
            item.fill(menu, -1);
            if (defaultGroup != null) {
            if (config != null) {

        if (window == null) {
        List<String> categories = new ArrayList<String>();
        // we need a separator if the shared config entry has been added
        super.fill(parent, index);
 *     http://www.apache.org/licenses/LICENSE-2.0
        // and there are following shortcuts
                    item.fill(menu, -1);
    private final String mode;

            IAction action = DebugUIInternals.createConfigurationAction(configuration, mode, accelerator);
        for (int i = 0; i < groups.length; i++) {
        // add in the open ... dialog shortcut(s)
 * distributed under the License is distributed on an "AS IS" BASIS,
            }

            // NOTE: category can be null
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.ToolBar;
        if (selection instanceof ITextSelection) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void fill(CoolBar parent, int index) {

            return NO_OBJECTS;
import org.jkiss.dbeaver.debug.ui.internal.DebugUIInternals;


                    }
                        new MenuItem(menu, SWT.SEPARATOR);
import org.eclipse.debug.core.ILaunchConfiguration;
                IEditorPart activeEditor = activePage.getActiveEditor();
        return configurations;
        if (categories.isEmpty()) {
    protected List<ILaunchConfiguration> extractSharedConfigurations(Object[] selection) {
    }
        }
            ILaunchConfiguration config = DebugUIInternals.isSharedConfig(object);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final Object[] NO_OBJECTS = new Object[0];
        }
                    IAction action = new OpenLaunchDialogAction(group.getIdentifier());
        List<ILaunchConfiguration> configurations = new ArrayList<>();
import org.eclipse.debug.ui.actions.OpenLaunchDialogAction;
        // AF: we are using standard contribution here for now
                    new MenuItem(menu, SWT.SEPARATOR);
        }
import org.eclipse.swt.widgets.MenuItem;

                    group = groupsByCategory.get(category);
            if (action != null) {
 * Unless required by applicable law or agreed to in writing, software
                DBSObject databaseObject = DebugUI.extractDatabaseObject(activeEditor);
        Map<IAction, String> shortcutActions = DebugUIInternals.createShortcutActions(selected, mode, accelerator);
import org.eclipse.swt.widgets.Menu;
    public void fill(ToolBar parent, int index) {
        }
    @Override
/*
            IStructuredSelection structured = (IStructuredSelection) selection;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
                item.fill(menu, -1);
        int accelerator = 1;

        for (ILaunchConfiguration configuration : configurations) {
import org.eclipse.debug.ui.DebugUITools;
    }
                }
            }
import org.eclipse.ui.PlatformUI;
 * See the License for the specific language governing permissions and
                if (accelerator > 1) {
import org.eclipse.debug.ui.ILaunchGroup;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        ISelection selection = window.getSelectionService().getSelection();
        }
 *
    // map of launch groups by (non-null) categories, for this mode
        return NO_OBJECTS;
                } else {

package org.jkiss.dbeaver.debug.ui;
                IEditorPart part = (IEditorPart) o;
            Object o = structured.getFirstElement();
    @Override
                        addedSep = true;

import org.jkiss.dbeaver.model.struct.DBSObject;
        ILaunchGroup[] groups = DebugUITools.getLaunchGroups();
    @Override
                if (group != null) {

            IWorkbenchPage activePage = window.getActivePage();
                }
            return array;

    private ILaunchGroup defaultGroup = null;
    }
            }
                }
        Object[] selected = extractSelectedObjects();
        super.fill(parent, index);

public class DatabaseLaunchContributionItem extends ContributionItem {
                ActionContributionItem item = new ActionContributionItem(action);
            new MenuItem(menu, SWT.SEPARATOR);
            }
        if (selection instanceof IStructuredSelection) {
            boolean addedSep = false;
import org.eclipse.swt.SWT;
}
        // AF: we are using standard contribution here for now
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    protected DatabaseLaunchContributionItem(String mode) {
        for (Object object : selection) {
                    if (accelerator > 1 && !addedSep) {

 * you may not use this file except in compliance with the License.
                }
                item.fill(menu, -1);
 * You may obtain a copy of the License at
            ActionContributionItem item = new ActionContributionItem(action);
                ILaunchGroup group = defaultGroup;
    protected Object[] extractSelectedObjects() {

                if (databaseObject != null) {
                array[0] = part.getEditorInput();

    private Map<String, ILaunchGroup> groupsByCategory = null;
                accelerator++;
                if (category != null) {
            }
 * limitations under the License.
                configurations.add(config);
            ILaunchGroup group = groups[i];
        List<ILaunchConfiguration> configurations = extractSharedConfigurations(selected);
import org.eclipse.jface.action.ContributionItem;
                if (group.getCategory() == null) {
            String category = shortcutActions.get(action);
 *
import org.eclipse.ui.IWorkbenchPage;
                    groupsByCategory.put(group.getCategory(), group);
import org.eclipse.ui.IEditorPart;
                    defaultGroup = group;
            for (String category : categories) {
                categories.add(category);
            if (o instanceof IEditorPart) {
        this.mode = mode;
                IAction action = new OpenLaunchDialogAction(defaultGroup.getIdentifier());
                    return new Object[] { databaseObject };
import org.eclipse.jface.viewers.IStructuredSelection;
        } else {
    }
            if (activePage != null) {
        }
        }
        }
            }
import org.eclipse.jface.action.ActionContributionItem;
