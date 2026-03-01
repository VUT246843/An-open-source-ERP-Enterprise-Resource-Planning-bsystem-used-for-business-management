        Stack<Control> stack = new Stack<>();
    }
        

        if (editAllowed || !isCustomTemplate) {
            buttons.get(BTN_IDX_REVERT).setEnabled(canRevert);
    protected String getFormatterPreferenceKey() {
    @Override
    public IAdaptable getElement() {
 * Templates preference page
                && (editAllowed || !customTemplateNames.contains(items.get(0).getTemplate().getName())));
            buttons.get(BTN_IDX_RESTORE).setEnabled(canRestore);
import java.util.Set;
                Button btn = (Button) ctl;
    private static final int BTN_IDX_REVERT = 2;
 *
    
 * distributed under the License is distributed on an "AS IS" BASIS,
        } else {
import org.eclipse.ui.texteditor.templates.TemplatePreferencePage;
    private final List<Button> buttons = new ArrayList<>();
package org.jkiss.dbeaver.ui.editors.sql.preferences;
        if (buttons.size() > 0) {
import org.eclipse.ui.IWorkbenchPropertyPage;
            buttons.get(BTN_IDX_REMOVE).setEnabled(selectionCount > 0 && selectionCount <= itemCount
    public PrefPageSQLTemplates() {
                    stack.push(cctl);
        Control root = super.createContents(ancestor);
        return null;
import java.util.ArrayList;
    protected Control createContents(Composite ancestor) {
import org.eclipse.swt.SWT;
            if (ctl instanceof Button) {
            int itemCount = table.getItemCount();
            int selectionCount = selection.length;
import org.eclipse.swt.widgets.*;

                .map(t -> (TemplatePersistenceData) t.getData()).collect(Collectors.toList());
import org.eclipse.jface.text.templates.Template;
            TableItem[] selection = table.getSelection();

    @Override
 *
        }
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplateStore;
        buttons.clear();
    }
            
    private Table table;

 * limitations under the License.
 * See the License for the specific language governing permissions and
            } else if (ctl instanceof Composite) {
                if ((btn.getStyle() & SWT.PUSH) != 0) {
            Set<String> customTemplateNames = templateStore.getCustomTemplateNames();

import java.util.List;
        
import java.util.stream.Stream;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.text.templates.TemplatePersistenceData;
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
    private final SQLTemplateStore templateStore;
        setContextTypeRegistry(SQLTemplatesRegistry.getInstance().getTemplateContextRegistry());
        setTemplateStore(templateStore = SQLTemplatesRegistry.getInstance().getTemplateStore());
    }
        }
 * You may obtain a copy of the License at
/*
 */
    }
    }
    @Override
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplatesRegistry;
import org.jkiss.code.Nullable;

    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sql.templates";
            buttons.get(BTN_IDX_NEW).setEnabled(editAllowed);
import java.util.stream.Collectors;
public class PrefPageSQLTemplates extends TemplatePreferencePage implements IWorkbenchPropertyPage {

 *
        } else {
 * you may not use this file except in compliance with the License.
    protected Template editTemplate(@NotNull Template template, boolean edit, boolean isNameModifiable) {
 */
                    buttons.add(btn);
            } else if (ctl instanceof Table) {
    }
import org.jkiss.dbeaver.model.rm.RMConstants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            boolean canRestore = templateStore.getTemplateData(true).length != templateStore.getTemplateData(false).length;
                && (editAllowed || items.stream().noneMatch(t -> customTemplateNames.contains(t.getTemplate().getName()))));
            List<TemplatePersistenceData> items = Stream.of(selection)
 * DBeaver - Universal Database Manager
    protected void updateButtons() {
            buttons.get(BTN_IDX_IMPORT).setEnabled(editAllowed);
            boolean editAllowed = DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER);
    private static final int BTN_IDX_RESTORE = 3;

    @Override
            return super.editTemplate(template, edit, isNameModifiable);

        return SQLTemplateStore.PREF_STORE_KEY;
            super.updateButtons();
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;
import java.util.Stack;
    @Nullable
    private static final int BTN_IDX_REMOVE = 4;

        boolean editAllowed = DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER);
 * Licensed under the Apache License, Version 2.0 (the "License");
    
}
    private static final int BTN_IDX_EDIT = 5;
                }
            }
import org.jkiss.code.NotNull;
import org.eclipse.core.runtime.IAdaptable;
    private static final int BTN_IDX_IMPORT = 1;
    
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                for (Control cctl : ((Composite) ctl).getChildren()) {
        while (stack.size() > 0) {
        stack.add(root);
        boolean isCustomTemplate = templateStore.getCustomTemplateNames().contains(template.getName());
    @Override
    }
    private static final int BTN_IDX_NEW = 6;
            buttons.get(BTN_IDX_EXPORT).setEnabled(selectionCount > 0);
        return root;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                table = (Table) ctl;
    public void setElement(IAdaptable element) {
/**
    
                    btn.setEnabled(false);

    private static final int BTN_IDX_EXPORT = 0;
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
            buttons.get(BTN_IDX_EDIT).setEnabled(selectionCount == 1
            Control ctl = stack.pop();
                }
            boolean canRevert = items.stream().anyMatch(TemplatePersistenceData::isModified);

