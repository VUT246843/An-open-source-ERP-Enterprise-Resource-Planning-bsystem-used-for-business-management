            .setCustomArea(parent -> createCustomArea(parent, selectedObjects, deleter));
    }
                item.setText(0, node.getName());
            } else {
        String title = NLS.bind(node instanceof DBNLocalFolder ? UINavigatorMessages.confirm_local_folder_delete_title : UINavigatorMessages.confirm_entity_delete_title,
        final Reply[] reply = {null};
    public static final Reply SHOW_SCRIPT = new Reply(UINavigatorMessages.actions_navigator_view_script_button);
    private NavigatorNodesDeletionConfirmations() {
    public static Reply confirm(
    ) {
    private static void createObjectsTable(@NotNull Composite parent, @NotNull Collection<?> selectedObjects) {
            node.getNodeTypeLabel(),
        );
        return confirm(shell, title, message, selectedObjects, deleter);
import org.jkiss.code.Nullable;
        return reply[0];
                } else {
        @Nullable NavigatorObjectsDeleter deleter
import org.eclipse.swt.SWT;
                selectedObjects,
        });
     *
            UINavigatorMessages.confirm_deleting_multiple_objects_table_group_name,
        @NotNull String title,
            TableItem item = new TableItem(objectsTable, SWT.NONE);
        IProject project = deleter.getProjectToDelete();
        int fontHeight = UIUtils.getFontHeight(objectsTable);
            placeholder,
            UINavigatorMessages.confirm_deleting_delete_contents_checkbox,
            SWT.READ_ONLY
     */
                IPath resLocation = resource.getLocation();
        String message = NLS.bind(node instanceof DBNLocalFolder ? UINavigatorMessages.confirm_local_folder_delete_message : UINavigatorMessages.confirm_entity_delete_message,
 *
        UIUtils.syncExec(() -> reply[0] = messageBoxBuilder.showMessageBox());
                item.setText(1, node.getNodeTypeLabel());
     * @param selectedObjects objects to delete
        checkbox.addSelectionListener(new SelectionAdapter() {
                }
import org.eclipse.osgi.util.NLS;
        if (deleter != null && deleter.supportsShowViewScript()) {
        );
}
        @NotNull Shell shell,
 *     http://www.apache.org/licenses/LICENSE-2.0
                item.setText(2, CommonUtils.toString(node.getNodeDescription()));
        }
     * @param shell confirmation's parent shell
     * @param deleter deleter
            ph,
 * Copyright (C) 2010-2026 DBeaver Corp and others

     *
            if (!(obj instanceof DBNNode node)) {
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.GridData;
    }
 * See the License for the specific language governing permissions and
            item.setImage(DBeaverIcons.getImage(node.getNodeIcon()));
import org.eclipse.swt.events.SelectionAdapter;
        Composite placeholder = UIUtils.createComposite(parent, 1);
        UIUtils.createTableColumn(objectsTable, SWT.LEFT, UINavigatorMessages.confirm_deleting_multiple_objects_column_name);
        UIUtils.asyncExec(() -> UIUtils.packColumns(objectsTable, true));
import org.jkiss.utils.CommonUtils;
        }
        if (selectedObjects.size() > 1) {
        Table objectsTable = new Table(tableGroup, SWT.BORDER | SWT.FULL_SELECTION);
        DBNNode node = (DBNNode) selectedObjects.iterator().next();
            return confirm(
            false,
        @NotNull NavigatorObjectsDeleter deleter
                createCheckbox(parent, option, deleter);
     * @return user's reply
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
                NLS.bind(UINavigatorMessages.confirm_deleting_multiple_objects_message, selectedObjects.size()),
        Composite placeholder = UIUtils.createPlaceholder(checkboxesComposite, 1, 5);
            replies.add(SHOW_SCRIPT);
    /**
        @NotNull Collection<?> selectedObjects,
        objectsTable.setLinesVisible(true);
    private static void createDeleteContents(@NotNull Composite parent, @NotNull NavigatorObjectsDeleter deleter) {
        @NotNull Shell shell,
        gd.widthHint = fontHeight * 7;
 *
        if (!deleter.supportsDeleteContents()) {
            }
                    deleter.disableOption(option);
        @Nullable NavigatorObjectsDeleter deleter
        tableGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
            .setReplies(replies)
import org.eclipse.core.runtime.IPath;
import java.util.Collection;
            return;
        objectsTable.setLayoutData(gd);
        }
    }
                item.setText(2, resLocation == null ? "" : resLocation.toString());
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorObjectsDeleter;
        @NotNull NavigatorObjectsDeleter.Option option,

        @NotNull String message,
    }
    private static void createCustomArea(
     * @param shell confirmation's parent shell
        });
    ) {
        Button checkbox = UIUtils.createCheckbox(placeholder, option.getLabel(), option.getTip(), false, 0);
        // This is a utility class, no instances for you!
        Composite ph = UIUtils.createPlaceholder(parent, 2, 5);
     * Asks the user if they want to delete navigator objects.
        Button deleteContentsCheck = UIUtils.createCheckbox(
                    deleter.enableOption(option);
        deleteContentsCheck.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.ui.dialogs.Reply;

            UINavigatorMessages.confirm_deleting_project_location_label,
            );
public final class NavigatorNodesDeletionConfirmations {
        @NotNull Collection<?> selectedObjects,
        );
import org.eclipse.core.resources.IProject;
            if (node.getAdapter(IResource.class) != null) {
                UINavigatorMessages.confirm_deleting_multiple_objects_title,
import java.util.ArrayList;
     * @param selectedObjects objects to delete
     * Asks the user if they want to delete navigator objects.
        if (project == null || DBWorkbench.isDistributed()) {
            createDeleteContents(parent, deleter);
                shell,
        if (selectedObjects.size() > 1) {

        List<Reply> replies = new ArrayList<>(3);
        UIUtils.createLabelText(ph,
        }
        @Nullable NavigatorObjectsDeleter deleter
        objectsTable.setHeaderVisible(true);
        GridData gd = new GridData(GridData.FILL_BOTH);
            GridData.FILL_BOTH
            project.getLocation().toFile().getAbsolutePath(),
     * @param deleter deleter
            }
                deleter.setDeleteContents(deleteContentsCheck.getSelection());
    ) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                continue;
        MessageBoxBuilder messageBoxBuilder = MessageBoxBuilder.builder(shell)
 * DBeaver - Universal Database Manager
 * limitations under the License.

            2
        replies.add(Reply.CANCEL);
    /**
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.code.NotNull;

            .setPrimaryImage(DBIcon.STATUS_WARNING)
            @Override
        UIUtils.createTableColumn(objectsTable, SWT.LEFT, UINavigatorMessages.confirm_deleting_multiple_objects_column_description);
import java.util.List;
            }
                item.setText(1, "File");
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
        Composite tableGroup = UIUtils.createTitledComposite(
                deleter
    }
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
            node.getNodeTypeLabel(),
            for (NavigatorObjectsDeleter.Option option : deleter.getSupportedOptions()) {
        @NotNull Collection<?> selectedObjects,

            1,
    }
        replies.add(Reply.YES);
 */
import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
import org.eclipse.core.resources.IResource;
     * @return user's reply
     * @param title confirmation's title
        }
                IResource resource = node.getAdapter(IResource.class);
import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;

/*
        //gd.heightHint = rowCount < 6 ? fontHeight * 2 * rowCount : fontHeight * 10;
            @Override
import org.jkiss.dbeaver.ui.DBeaverIcons;
            node.getNodeDisplayName());
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
            .setTitle(title)

        }
    public static Reply confirm(
        placeholder.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (deleter != null) {
            createObjectsTable(parent, selectedObjects);
            }
        for (Object obj: selectedObjects) {
package org.jkiss.dbeaver.ui.navigator.dialogs;

                item.setText(0, node.getNodeFullName());
        @NotNull Composite parent,
        }
            return;
            .setDefaultReply(Reply.CANCEL)
import org.eclipse.swt.events.SelectionEvent;
    ) {
     * @param message confirmation's message
            }
        UIUtils.createTableColumn(objectsTable, SWT.LEFT, "Type");
        @NotNull Composite checkboxesComposite,
            UINavigatorMessages.confirm_deleting_delete_contents_checkbox_tooltip,
            .setMessage(message)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBIcon;
    }
    private static void createCheckbox(
                if (checkbox.getSelection()) {
     */
            node.getNodeDisplayName());
