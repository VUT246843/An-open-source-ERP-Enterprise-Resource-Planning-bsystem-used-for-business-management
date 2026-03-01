            e.result = composeActiveEditorTabName(this.composite);

        if (parentTab instanceof CTabFolder) {
            Composite parentEditor = parentTab.getParent();
                return msg;
 *
            }
    @Override
            }
    public void getDescription(AccessibleEvent e) {
                msg = String.format(ACTIVE_NAME_TAB,
    private static String composeActiveEditorTabName(@NotNull Control context) {
import org.eclipse.swt.accessibility.AccessibleControlAdapter;
    @Override
    public void getKeyboardShortcut(AccessibleEvent e) {
    }
import org.eclipse.swt.accessibility.AccessibleEvent;
        }
import org.eclipse.swt.custom.CTabFolder;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    tabFoler.getItemCount());
        // not implemented
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final Control composite;
        this.composite = composite;
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
            CTabFolder tabFoler = (CTabFolder) parentTab;
        return msg;
import org.eclipse.swt.accessibility.AccessibleListener;
    public void getValue(AccessibleControlEvent e) {
            if (parentEditor != null && !parentEditor.isDisposed()) {
            } else {
            }
        Composite parentTab = context.getParent();
            e.result = composeActiveEditorTabName(this.composite);
                    text,
                    // level 1
        if (this.composite != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
    @Override
                    if (parentEditor != null && !parentEditor.isDisposed() && parentEditor instanceof CTabFolder) {
        if (this.composite != null) {
                    tabFoler.getItemCount());

        // not implemented
 * DBeaver - Universal Database Manager
 *
                        msg = String.format(ACTIVE_NAME_EDITOR, parentEditorFolder.getSelection().getText(), msg);
            // level 3
                }
    public void getHelp(AccessibleEvent e) {
import org.eclipse.swt.widgets.Control;
     * The method designed to combine name of editor-tab by selection context
    private static final String ACTIVE_NAME_TAB_NO_TITLE = "active tab %s of %s"; // $NON-NLS-0$
                msg = String.format(ACTIVE_NAME_TAB_NO_TITLE,
            if (tabFoler.getSelection() == null) {
     *
    EditorAccessibleAdapter(@NotNull Control composite) {

 *
    public void getName(AccessibleEvent e) {
    }
 */
}
    @Override
import org.eclipse.swt.widgets.Composite;


    /**
    }
 * you may not use this file except in compliance with the License.
                    parentEditor = parentEditor.getParent();
    @Override
package org.jkiss.dbeaver.ui.editors;
/*
                parentEditor = parentEditor.getParent();
     * @param context - initial selection
    private static final String ACTIVE_NAME_EDITOR = "editor %s %s"; // $NON-NLS-0$
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                        CTabFolder parentEditorFolder = (CTabFolder) parentEditor;
 * You may obtain a copy of the License at
            if (text != null) {
     */
import org.eclipse.swt.accessibility.AccessibleControlEvent;

 * See the License for the specific language governing permissions and
        // not implemented
            String text = tabFoler.getSelection().getText();
        String msg = "";
    }
                if (parentEditor != null && !parentEditor.isDisposed()) {


                    }
public class EditorAccessibleAdapter extends AccessibleControlAdapter implements AccessibleListener {
    }
     * @return - string message
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                // level 2
                    tabFoler.getSelectionIndex() + 1,
                    tabFoler.getSelectionIndex() + 1,
 * limitations under the License.
    private static final String ACTIVE_NAME_TAB = "active tab %s %s of %s"; // $NON-NLS-0$
import org.jkiss.code.NotNull;
