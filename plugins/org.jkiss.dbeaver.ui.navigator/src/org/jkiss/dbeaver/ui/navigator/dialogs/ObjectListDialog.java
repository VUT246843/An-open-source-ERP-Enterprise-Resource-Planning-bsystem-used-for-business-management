            searcher = new SearcherFilter();
    @Override
            }
        @Override
            if (item instanceof DBNNode node) {

                UIUtils.asyncExec(this::okPressed);

                return;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.jkiss.code.Nullable;
            return LoadingJob.createService(
    protected boolean isDialogComplete() {
    @Override
import java.util.List;
                return imageProvider.getObjectImage();
    }
 */
                new ObjectsLoadVisualizer() {
import java.util.ArrayList;
        public void fillCustomActions(IContributionManager contributionManager) {
    protected void createUpperControls(@NotNull Composite composite) {
        ) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            @NotNull Composite group,
            return super.getObjectValue(item);
    public T getSelectedObject() {
        }
    public static <T extends DBPObject> T selectObject(
        }
        @NotNull List<T> selectedObjects,
                        performSearch(SearchType.NONE, false);
        private Font boldFont;
import org.eclipse.swt.widgets.Control;
                @Override

import org.jkiss.dbeaver.model.struct.DBSWrapper;
 * ObjectListDialog
            group,
                if (element instanceof DBSWrapper wrapper && objectColumn.isNameColumn(wrapper.getObject())) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull Composite group,
        if (!isModeless()) {
        @Override

    @Override
        this.singleSelection = singleSelection;
        objectList.loadData();
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                getItemsViewer().setSelection(new StructuredSelection(selectedObjects), true);
 *     http://www.apache.org/licenses/LICENSE-2.0


    }
    protected void updateButtons() {
    {

import org.jkiss.code.NotNull;
        protected ISearchExecutor getSearchRunner() {
        );
        createUpperControls(group);
            selectedObjects.addAll(selection.toList());
                    try {
            listId,
import org.jkiss.utils.CommonUtils;
                }


    @NotNull
    private DatabaseObjectListControl<T> createObjectSelector(
        GridData gd = new GridData(GridData.FILL_BOTH);


    protected Composite createDialogArea(@NotNull Composite parent) {
    protected IDialogSettings getDialogBoundsSettings()
                    @Override
        } else {
/*

        return createObjectSelector(group, singleSelection, listId, selectedObjects, true, objectReader);
 * distributed under the License is distributed on an "AS IS" BASIS,
            return new ObjectLabelProvider(objectColumn);
import org.eclipse.jface.action.IContributionManager;
        }
        return ctl;
    private final String listId;
                        super.completeLoading(items);


import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
        @NotNull DBRRunnableWithResult<List<T>> objectReader
                        return BaseThemeSettings.instance.treeAndTableFontItalic;
                        objectReader.run(monitor);
        return group;
import org.eclipse.jface.dialogs.IDialogSettings;
                    performSearch(SearchType.NONE);
            false,
    }
        if (selected != null) {
    protected List<T> getObjects(@NotNull DBRProgressMonitor monitor) throws DBException {

import org.eclipse.jface.action.Action;
    @Override
    public int open() {
        private final Composite group;
            }
            selectedObjects.clear();
                        return ObjectListDialog.class;
            selectedObjects.addAll(selected);
import java.util.Collection;
                return node.getNodeIcon();
        @NotNull String title,
                    public void completeLoading(Collection<T> items) {
        }
    ) {
            if (selection.isEmpty()) {
                    } else if (selectedObjects.contains(element)) {
 * @author Serge Rider
            this.listId = listId;
                        }
        return objects;
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        return !selectedObjects.isEmpty();

            this.selectedObjects = selectedObjects;
        @NotNull
            }
    @Nullable
        protected LoadingJob<Collection<T>> createLoadService(boolean forUpdate) {
        @NotNull String listId,
        return new DialogObjectListControl(group, singleSelection, listId, objectReader, isSetFocusAfterLoad, selectedObjects);
                    public Collection<T> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        @NotNull String listId,
            this.objectReader = objectReader;
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
import java.lang.reflect.InvocationTargetException;
        private final List<T> selectedObjects;
            enableButton(IDialogConstants.OK_ID, false);
        }
            return CommonUtils.isEmpty(selectedObjects) ? null : selectedObjects.getFirst();
        }
        });


            if (isDialogComplete()) {
        private final DBRRunnableWithResult<List<T>> objectReader;
    }
            return null;
                }
    protected DatabaseObjectListControl<T> objectList;
        closeOnFocusLost(objectList.getItemsViewer().getControl(), objectList.getSearchTextControl());
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
        return super.open();
        }
 *
        @Override
            super.setListData(items, append, forUpdate);
            this.isSetFocusAfterLoad = isSetFocusAfterLoad;
        Composite group = super.createDialogArea(parent);
        private final String listId;
    @NotNull
                        if (isSetFocusAfterLoad) {

                },
import org.jkiss.dbeaver.DBException;
        boolean singleSelection,
        private final ISearchExecutor searcher;
        @Nullable
            }
        boolean isSetFocusAfterLoad,
        @Override
package org.jkiss.dbeaver.ui.navigator.dialogs;

        boolean singleSelection,
    ) {

    }
            updateButtons();

import org.eclipse.jface.dialogs.IDialogConstants;
        @Override
        this.objects = new ArrayList<>(objects);
        }
    }
        @NotNull Shell parentShell,
            updateButtons();
            ObjectLabelProvider(ObjectColumn objectColumn) {
        protected DBPImage getObjectImage(T item) {
    }

    public ObjectListDialog(
    

        if (scDialog.open() == IDialogConstants.OK_ID) {

            this.group = group;
    public List<T> getSelectedObjects()
        }
                @Override
                return null;

            @NotNull DBRRunnableWithResult<List<T>> objectReader,
import org.jkiss.dbeaver.model.DBPObject;
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
        @NotNull List<T> selectedObjects,

                    @Override
                    } catch (DBException e) {
 *
        @Nullable Collection<T> selected
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
    private final boolean singleSelection;
                        return objectReader.getResult();
        objectList.getSelectionProvider().addSelectionChangedListener(event -> {
import org.jkiss.dbeaver.model.DBPImage;
        @NotNull String title,
        public DBNNode getReferencedNode() {

        }
    private class DialogObjectListControl extends DatabaseObjectListControl<T> implements DBNNodeReference {
        @NotNull
                    }
                public void run() {
        @NotNull DBRRunnableWithResult<List<T>> objectReader
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        return selectedObjects;

    ) {
/**
                    @Override
            return null;
    }
        }
            return searcher;
    }
        public DialogObjectListControl(
            public Font getFont(Object element) {

    @NotNull
        enableButton(IDialogConstants.OK_ID, isDialogComplete());
            } else if (item instanceof DBPImageProvider imageProvider) {
        @Override
            @Override

                super(objectColumn);


                new AbstractLoadService<>() {
        Control ctl = super.createContents(parent);
        protected void setListData(Collection<T> items, boolean append, boolean forUpdate) {
            @NotNull List<T> selectedObjects
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.*;
                        result = getObjects(monitor);
        boolean singleSelection,

            contributionManager.add(new Action("Filter objects", DBeaverIcons.getImageDescriptor(UIIcon.SEARCH)) {
import org.jkiss.dbeaver.model.DBPImageProvider;
                            getItemsViewer().getControl().setFocus();
    protected List<T> objects;
    protected  void handleObjectsLoaded(@NotNull Collection<T> items, boolean append) {
            final List<T> selectedObjects = scDialog.getSelectedObjects();
                }
            if (item instanceof DBSWrapper wrapper && wrapper.getObject() != null) {
                        throw new InvocationTargetException(e);
            @NotNull String listId,
            });
import org.jkiss.dbeaver.model.navigator.DBNNode;
            super(group, (singleSelection ? SWT.SINGLE : SWT.MULTI), null, new ListContentProvider());
        @Override
        }
        objectList.setLayoutData(gd);
            new DBRRunnableWithResult<>() {
        @NotNull Collection<T> objects,
            return listId;
            super.fillCustomActions(contributionManager);
            if (selectedObjects != null) {
        protected void addSearchAction(IContributionManager contributionManager) {

                    }
            addColumnConfigAction(contributionManager);
    @Nullable
    ) {
import org.eclipse.jface.viewers.IFontProvider;
 */
import org.eclipse.swt.layout.GridData;
    }
 *
        @NotNull String listId,
                    public Object getFamily() {
            boolean singleSelection,
        }
    }
            boolean isSetFocusAfterLoad,
import org.eclipse.jface.viewers.IStructuredSelection;
        @Override
 * See the License for the specific language governing permissions and
 * limitations under the License.
    @NotNull
                    if (DBNUtils.isDefaultElement(element)) {
        objectList.setDoubleClickHandler(event -> {
        class ObjectLabelProvider extends ObjectColumnLabelProvider implements IFontProvider {
    }
                    }
        protected String getListConfigId(List<Class<?>> classList) {
        return selectedObjects.isEmpty() ? null : selectedObjects.getFirst();
            return selectedObjects.isEmpty() ? null : selectedObjects.getFirst() instanceof DBNNode node ? node : null;

        @NotNull Shell parentShell,
            singleSelection,
        this.listId = listId;
import org.eclipse.swt.SWT;
    }
                    }
    private static final String DIALOG_ID = "DBeaver.SelectDatabaseObjectDialog";//$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        @NotNull Composite group,
    }
}
        super(parentShell, title);
import org.eclipse.jface.viewers.CellLabelProvider;
        return null;//UIUtils.getDialogSettings(DIALOG_ID + "." + listId);
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;

        @NotNull String listId,
        protected CellLabelProvider getColumnLabelProvider(ObjectColumn objectColumn) {
            }
                });

            handleObjectsLoaded(items, append);
import org.jkiss.dbeaver.model.navigator.DBNNodeReference;
                return wrapper.getObject();
        @NotNull Collection<T> objects

        // Just a listener
        protected Object getObjectValue(@NotNull T item) {
    }
        objectList.createProgressPanel();
            }
    protected List<T> selectedObjects = new ArrayList<>();
                    }
import org.eclipse.jface.viewers.StructuredSelection;
        gd.minimumWidth = 500;
        objectList = createObjectSelector(

        gd.minimumHeight = 300;

        ObjectListDialog<T> scDialog = new ObjectListDialog<>(parentShell, title, true, listId, objects, null);
    protected Control createContents(Composite parent) {
 * you may not use this file except in compliance with the License.
    protected DatabaseObjectListControl<T> createObjectSelector(
                        return BaseThemeSettings.instance.treeAndTableFontBold;
    }
            }
        });
 *
        private final boolean isSetFocusAfterLoad;
            selectedObjects,
    {
import org.eclipse.swt.graphics.Font;
public class ObjectListDialog<T extends DBPObject> extends AbstractPopupPanel {
