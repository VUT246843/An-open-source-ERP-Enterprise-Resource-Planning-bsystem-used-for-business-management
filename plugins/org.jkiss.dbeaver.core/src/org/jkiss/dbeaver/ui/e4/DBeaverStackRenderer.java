            MenuItem menuItemOthers = new MenuItem(menu, SWT.NONE);

                    }
import org.eclipse.core.resources.IFolder;
        final IEclipseContext ctx = getContext(stack);
        @Nullable final File file
                    @Override
                populateFileMenu(menu, workbenchPart, file, localFile);
            }
        }
import org.jkiss.dbeaver.ui.UIUtils;

        new MenuItem(menu, SWT.SEPARATOR);
    @NotNull

import org.jkiss.dbeaver.DBException;
            final Rectangle area = folder.getClientArea();
                        } else {
import org.jkiss.dbeaver.core.CoreCommands;
                    }
import org.eclipse.swt.graphics.Image;
                    public void widgetSelected(SelectionEvent e) {
            }


    @Override
                MenuItem menuItemOthers = new MenuItem(menu, SWT.NONE);

 * Copyright (C) 2010-2025 DBeaver Corp and others
                        }
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                ActionUtils.runCommand(actionId, workbenchPart.getSite());
        @Nullable final IFile inputFile,
            }
                    }
 *
            IFile file = EditorUtils.getFileFromInput(editorInput);
            if (location.x + size.x > area.x + area.width) {
            if (file != null || localFile != null) {

            menuItemOpenFolder.setText(CoreMessages.editor_file_open_in_explorer);
    public void showAvailableItems(MElementContainer<?> stack, CTabFolder folder, boolean forceCenter) {
 * limitations under the License.
    public DBeaverStackRenderer() {

            }
                menuItemDisableSQLSyntaxParser.addSelectionListener(new SelectionAdapter() {
        super.populateTabMenu(menu, part);
import org.eclipse.e4.ui.workbench.modeling.EPartService;
                    }
        list.setLocation(location);
                item = tmpItem;
                        if (inputFile.getLocation() != null) {
                return ((CompatibilityPart) clientObject).getPart();
    @Nullable
                if (workbenchPart instanceof EntityEditor) {
                }
                    @Override
 * you may not use this file except in compliance with the License.

import org.eclipse.swt.widgets.*;
            public void widgetSelected(SelectionEvent e) {
                public void widgetSelected(SelectionEvent e) {

            IWorkbenchPage activePage = workbenchPart.getSite().getWorkbenchWindow().getActivePage();
        }
import java.util.List;
        if (widget instanceof Composite composite) {
            ctx.get(EPartService.class),
            return new Point(bounds.x + bounds.width, bounds.y + bounds.height);
                    if (shortcut != null) {
        if (workbenchPart instanceof IEditorPart editorPart) {
        if (inputFile != null && (inputFile.getLocation() != null || inputFile.getLocationURI() != null) ||
            }
                String renameText = CoreMessages.editor_file_rename;
            }
        if (item != null) {

        list.setVisible(true);
            SWT.V_SCROLL | SWT.H_SCROLL,
        final DBSObject object = input.getDatabaseObject();
                            filePath = inputFile.getLocationURI().getPath();
        list.getShell().addListener(SWT.Deactivate, e -> UIUtils.asyncExec(() -> {
                new MenuItem(menu, SWT.SEPARATOR);
    private void subscribePerspectiveSwitched() {
    private void populateFileMenu(
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
    private static final String EDITOR_STACK_ID = "EditorStack"; //$NON-NLS-1$

        list.setFocus();

                    Control composite = getChild(container, ONBOARDING_COMPOSITE);
import org.eclipse.swt.SWT;
    }
                    if (container == null || !HolidayDecorations.install(container)) {
            stack,
                        addBookmarkItem.addDisposeListener(e -> itemImage.dispose());
                                    CoreMessages.actions_navigator_bookmark_error_message, ex);
        }
        for (int i = 0; i < folder.getItemCount(); i++) {

            log.error("Error setting perspective switch listener", e);
            menuItemOthers.addSelectionListener(new SelectionAdapter() {
                        continue;
        } else {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            final Object element = event.getProperty(UIEvents.EventTags.ELEMENT);
        final DBNDatabaseNode node = input.getNavigatorNode();
import org.eclipse.ui.*;
    private void populateEditorMenu(@NotNull Menu menu, @NotNull IWorkbenchPart workbenchPart, @NotNull IDatabaseEditorInput input) {
                });


                });
                    ImageDescriptor imageDescriptor = ActionUtils.findCommandImage(CoreCommands.CMD_ADD_BOOKMARK);
                    if (imageDescriptor != null) {
 * See the License for the specific language governing permissions and
                }
                location.x = area.x + area.width - size.x;

                addActionItem(workbenchPart, menu, SQLEditorCommands.CMD_SQL_DELETE_THIS_SCRIPT);
            if (element instanceof MPerspective perspective) {
    private static Point getChevronLocation(@NotNull CTabFolder folder) {

            if (!list.hasFocus()) {
        }
                public void widgetSelected(SelectionEvent e) {
        return null;
                item.addSelectionListener(new SelectionAdapter() {
            if (tmpItem.isShowing()) {
                    String shortcut = ActionUtils.findCommandDescription(CoreCommands.CMD_ADD_BOOKMARK, workbenchPart.getSite(), true);
import org.jkiss.dbeaver.Log;
    private static Control getChild(@Nullable Object widget, @NotNull String id) {
                new MenuItem(menu, SWT.SEPARATOR);
        broker.subscribe(UIEvents.UILifeCycle.PERSPECTIVE_SWITCHED, event -> {


            }
        );
                        addBookmarkItem.setImage(itemImage);
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
            }
                    });
            menuItemOthers.setText(CoreMessages.editor_file_copy_path);
        }
    private static final Log log = Log.getLog(DBeaverStackRenderer.class);
            });
    ) {
        }
/*
 * You may obtain a copy of the License at
            }

                    @Override
import org.eclipse.swt.events.SelectionEvent;
                        @Override
            if (clientObject instanceof CompatibilityPart) {
            }
                    String filePath;
            if (workbenchPart instanceof SQLEditor) {
                for (MPartStack stack : modelService.findElements(perspective, null, MPartStack.class, List.of(EDITOR_STACK_ID))) {
            }
import org.jkiss.dbeaver.core.CoreMessages;
            for (Control child : composite.getChildren()) {
            final Rectangle bounds = item.getBounds();
            if (label != null) {
import org.eclipse.swt.custom.CTabItem;
            final CTabItem tmpItem = folder.getItem(i);
        String actionText = ActionUtils.findCommandName(actionId);
            @Override
import org.eclipse.swt.custom.CTabFolder;
                        data.exclude = true;
            // placed to the center
        if (shortcut != null) {
            IEditorInput editorInput = editorPart.getEditorInput();
                            filePath = inputFile.getLocation().toFile().getAbsolutePath();
                        DBWorkbench.getPlatformUI().copyTextToClipboard(DBUtils.getObjectFullName(object, DBPEvaluationContext.UI), false);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
                populateEditorMenu(menu, workbenchPart, databaseEditorInput);
        menuItemDelete.addSelectionListener(new SelectionAdapter() {

            if (activePage.getActiveEditor() != workbenchPart) {
                    }
public class DBeaverStackRenderer extends StackRenderer {
        } else {
        }
                renameText += "\t" + ActionUtils.findCommandDescription(SQLEditorCommands.CMD_SQL_RENAME, workbenchPart.getSite(), true); //$NON-NLS-1$
                    return child;
            
 *
                    } else {
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.dnd.TextTransfer;
                    addBookmarkItem.setText(actionText);
        });

                saveAsScriptItem.setToolTipText(SQLEditorMessages.sql_editor_prefs_save_as_script_tip);
                        sqlEditor.saveAsNewScript();
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            final String label = node.getMeta().getNodeTypeLabel(object.getDataSource(), null);
                @Override
            return new Point(0, 0);
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Point;
            SWT.ON_TOP,
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.jface.resource.ImageDescriptor;
                        menuItemDisableSQLSyntaxParser.setSelection(!SQLEditorUtils.isSQLSyntaxParserApplied(editorInput));
        }
            location = folder.toDisplay(getChevronLocation(folder));
                            } catch (DBException ex) {
                saveAsScriptItem.addSelectionListener(new SelectionAdapter() {
                        actionText += "\t" + shortcut;
                        filePath = file.getPath();
                    }
                
        final DBeaverPartList list = new DBeaverPartList(
                menuItemOthers.setText(renameText);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            actionText += "\t" + shortcut;
 *
        IWorkbenchPart workbenchPart = getWorkbenchPart(part);
            }
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerRenameFile;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
                    }
            });
                addActionItem(workbenchPart, menu, IWorkbenchCommandConstants.FILE_SAVE_AS);
                        Image itemImage = imageDescriptor.createImage();
            final Rectangle area = folder.getMonitor().getClientArea();
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.swt.graphics.Rectangle;
    private static final String ONBOARDING_COMPOSITE = "EditorStack.OnboardingComposite"; //$NON-NLS-1$
                    public void widgetSelected(SelectionEvent e) {
    }
                    addBookmarkItem.addSelectionListener(new SelectionAdapter() {
                if (id.equals(child.getData(ID))) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
                    String actionText = ActionUtils.findCommandName(CoreCommands.CMD_ADD_BOOKMARK);
            MenuItem menuItemOpenFolder = new MenuItem(menu, SWT.NONE);
                    public void widgetSelected(SelectionEvent e) {
        }));
        }
 * DBeaver - Universal Database Manager
            Object clientObject = part.getObject();
    }
            }
import org.eclipse.e4.ui.workbench.renderers.swt.StackRenderer;
                }
import org.eclipse.e4.core.contexts.IEclipseContext;
                });
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        }
import org.eclipse.ui.internal.e4.compatibility.CompatibilityPart;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }

            location.y = Math.max(0, location.y + (area.height - size.y) / 3);
                final MenuItem item = new MenuItem(menu, SWT.NONE);
        }
import java.io.File;
                        public void widgetSelected(SelectionEvent e) {
        return null;
                    UIUtils.setClipboardContents(Display.getCurrent(), TextTransfer.getInstance(), filePath);
            menuItemOpenFolder.addSelectionListener(new SelectionAdapter() {
            addActionItem(workbenchPart, menu, SQLEditorCommands.CMD_SQL_EDITOR_NEW);
import org.jkiss.dbeaver.ui.ShellUtils;


                    @Override
                    if (inputFile != null) {
    }
    private static final String ID = "id"; //$NON-NLS-1$
                menuItemDisableSQLSyntaxParser.setText(SQLEditorMessages.sql_editor_prefs_disable_services_text);
        if (workbenchPart instanceof SQLEditor) {
}    private static void addActionItem(@NotNull IWorkbenchPart workbenchPart, @NotNull Menu menu, @NotNull String actionId) {
 */
        });
            location = folder.toDisplay(area.x, area.y);
    }
            if (workbenchPart instanceof SQLEditor editor && editor.supportsRename()) {
        final IEventBroker broker = workbench.getService(IEventBroker.class);
                saveAsScriptItem.setText(SQLEditorMessages.sql_editor_prefs_save_as_script_text);
 * Unless required by applicable law or agreed to in writing, software
                }
                        SQLEditorHandlerRenameFile.renameFile(workbenchPart, inputFile, "file"); //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
                menuItemDisableSQLSyntaxParser.setEnabled(ActionUtils.isCommandEnabled(SQLEditorCommands.CMD_DISABLE_SQL_SYNTAX_PARSER, workbenchPart.getSite()));
            }
    private IWorkbenchPart getWorkbenchPart(MPart part) {
        @NotNull final Menu menu,
                final MenuItem saveAsScriptItem = new MenuItem(menu, SWT.PUSH);
        final Point location;
                activePage.activate(workbenchPart);
            this,

    protected void populateTabMenu(Menu menu, MPart part) {

                    }


        new MenuItem(menu, SWT.SEPARATOR);
        ) {
        try {
                    ShellUtils.launchProgram(inputFile.getParent().getLocation().toFile().getAbsolutePath());
    }
                    if (composite != null && composite.getLayoutData() instanceof GridData data) {
        list.setInput();
        }
                    Control container = getChild(stack.getWidget(), ONBOARDING_CONTAINER);
        @NotNull final IWorkbenchPart workbenchPart,
        if (inputFile != null && inputFile.getParent() instanceof IFolder && inputFile.getParent().getLocation() != null) {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
        } catch (Throwable e) {

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
            if (localFile == null && workbenchPart instanceof SQLEditor sqlEditor) {
                @Override
    }
            true
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.jkiss.dbeaver.ui.controls.decorations.HolidayDecorations;
            }
                    public void widgetSelected(SelectionEvent e) {
        }
        if (part != null) {
    private static final String ONBOARDING_CONTAINER = "EditorStack.OnboardingContainer"; //$NON-NLS-1$
        MenuItem menuItemDelete = new MenuItem(menu, SWT.NONE);
        final Point size = list.computeSizeHint();
                            }
            // placed at chevron location
                                    CoreMessages.actions_navigator_bookmark_error_title,
                    final MenuItem addBookmarkItem = new MenuItem(menu, SWT.NONE);
        if (inputFile != null && !inputFile.isReadOnly()) {
import org.jkiss.dbeaver.model.DBUtils;
            if (editorInput instanceof IDatabaseEditorInput databaseEditorInput) {

            File localFile = EditorUtils.getLocalFileFromInput(editorInput);
                list.dispose();
            // See StackRenderer#initializeOnboardingInformationInEditorStack (2024-06)
                MenuItem menuItemDisableSQLSyntaxParser = new MenuItem(menu, SWT.CHECK);
            location.x = Math.max(0, location.x + (area.width - size.x) / 2);
        CTabItem item = null;
            if (location.y + size.y > area.y + area.height) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        if (forceCenter) {
            folder.getShell(),
        String shortcut = ActionUtils.findCommandDescription(actionId, workbenchPart.getSite(), true);//$NON-NLS-1$
                                DBWorkbench.getPlatformUI().showError(
            if (workbenchPart instanceof SQLEditor) {

        menuItemDelete.setText(actionText);
import org.eclipse.core.resources.IFile;
        list.setSize(size.x, size.y);
                menuItemDisableSQLSyntaxParser.setSelection(!SQLEditorUtils.isSQLSyntaxParserApplied(editorInput));
                            try {
package org.jkiss.dbeaver.ui.e4;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
            subscribePerspectiveSwitched();


import org.jkiss.dbeaver.ui.ActionUtils;
                        SQLEditorUtils.setSQLSyntaxParserEnabled(editorInput, !SQLEditorUtils.isSQLSyntaxParserEnabled(editorInput));
            }
                    }
                location.y = area.y + area.height - size.y;
    }
                
import org.eclipse.swt.events.SelectionAdapter;
                menuItemOthers.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.layout.GridData;
            file != null && file.getPath() != null

        if (object != null && node != null) {
    @Override
                                AddBookmarkHandler.createBookmarkDialog(node, menu.getShell());
import org.jkiss.dbeaver.ui.actions.common.AddBookmarkHandler;
                });
                }
        final IWorkbench workbench = PlatformUI.getWorkbench();
                menuItemDisableSQLSyntaxParser.setToolTipText(SQLEditorMessages.sql_editor_prefs_disable_services_tip);
                item.setText(NLS.bind(CoreMessages.editor_file_copy_object_name, label));
                new MenuItem(menu, SWT.SEPARATOR);
