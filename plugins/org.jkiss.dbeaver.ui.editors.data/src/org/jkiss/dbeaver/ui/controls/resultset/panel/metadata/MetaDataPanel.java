                }
    private List<DBDAttributeBinding> curAttributes;
 * limitations under the License.
        @Nullable
                if (element instanceof DBDAttributeBinding) {
 *

            return DBValueFormatting.getObjectImage(item.getMetaAttribute());
                }
 * See the License for the specific language governing permissions and
            return curAttributes;
    }
 * RSV value view panel
        attributeList.setFocus();
        }

import org.eclipse.jface.viewers.StructuredSelection;
            newAttributes = newAttributes.stream()
        @Override
                    break;
            }
                        super.completeLoading(items);
                        presentation.setCurrentAttribute(attr);
            public void keyPressed(KeyEvent e) {
            ActionUtils.makeCommandContribution(
/**
            )
                            attributeList.getItemsViewer().setSelection(new StructuredSelection(attr));
                ResultSetMessages.generate_ddl_by_result_set_tip,
import org.eclipse.swt.layout.GridData;
                        return;
 * Unless required by applicable law or agreed to in writing, software
    @Override

import org.eclipse.swt.events.KeyEvent;
                        return entityAttribute.getDescription();
                return item.getMetaAttribute();
                }
        Composite panelContents = UIUtils.createComposite(parent, 1);
                public Object[] getChildren(Object parentElement) {
            DBDAttributeBinding attr = getSelectedAttribute();
                    }
import org.eclipse.swt.widgets.Text;
        @NotNull

                    return nested == null ? new Object[0] : nested.toArray(new Object[0]);
        }

        
    @Override
        }
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
                    List<DBDAttributeBinding> nested = ((DBDAttributeBinding) parentElement).getNestedBindings();

                    updateSelection = true;
            }

    private Text filterTextBox;
        @Override
        MetaDataTable(Composite parent) {
            super(parent, SWT.SHEET | SWT.BORDER, presentation.getController().getSite(), new TreeContentProvider() {
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
            final ISelectionChangedListener listener = event -> {
    private IResultSetPresentation presentation;
                        if (!itemsViewer.getControl().isDisposed()) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

            return;
        @Override
                @Override

                    public void completeLoading(Collection<DBDAttributeBinding> items) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.layout.GridLayoutFactory;
        );
        panelContents.setLayout(GridLayoutFactory.swtDefaults().create());
                    StringBuilder text = new StringBuilder();
    public static final String PANEL_ID = "results-metadata";
                }


    @Override
            });
import org.eclipse.jface.viewers.ISelectionChangedListener;
        


            attributeList.getControl().addDisposeListener(e ->
                            itemsViewer.expandToLevel(2);

                return "";
                    }
        if (CommonUtils.isNotEmpty(filterText)) {
                if (curAttributes.get(i) != newAttributes.get(i)) {
                new ObjectsLoadVisualizer()

                    if (text.isEmpty()) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        protected Object getObjectValue(@NotNull DBDAttributeBinding item) {
        attributeList.clearListData();
                });
            }
            super("Load sessions", presentation.getController().getExecutionContext());
                    if (attr != null && attr != getSelectedAttribute()) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.graphics.Font;
            if (equals) {
        return false;
                new LoadAttributesService(),
        DataEditorFeatures.RESULT_SET_PANEL_METADATA.use();
                true
import org.jkiss.code.NotNull;
    @Override
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                if (e.character == SWT.ESC) {
        protected String getListConfigId(List<Class<?>> classList) {
            return super.getObjectFont(item);
        filterTextBox.addKeyListener(new KeyAdapter() {
import org.jkiss.dbeaver.model.DBPImage;
    }
        if (this.presentation instanceof ISelectionProvider) {
        }
                ResultSetMessages.generate_ddl_by_result_set_name,
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
 * DBeaver - Universal Database Manager
                    }
                        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                    DBSEntityAttribute entityAttribute = ((DBDAttributeBinding) element).getEntityAttribute();
import org.eclipse.swt.dnd.TextTransfer;
        }
        this.attributeList.getItemsViewer().addSelectionChangedListener(event -> {
    public void activatePanel() {

            final DBCExecutionContext executionContext = presentation.getController().getExecutionContext();

package org.jkiss.dbeaver.ui.controls.resultset.panel.metadata;
            };
        @Override
        this.attributeList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
import java.util.Collection;
                    DBDAttributeBinding attr = presentation.getCurrentAttribute();
    public boolean isDirty() {
                        }
        filterPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
            columnController.addColumn("Description", "Column description", SWT.LEFT, true, false, element -> {
import org.jkiss.dbeaver.ui.*;
import org.jkiss.utils.CommonUtils;
        }

        }
        ResultSetPanelRefresher.installOn(this, presentation);
    public void setFocus() {
                }
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelRefresher;
                if (!updateSelection && MetaDataPanel.this.presentation.getController().getVisiblePanel() == MetaDataPanel.this) {
            ((ISelectionProvider) this.presentation).addSelectionChangedListener(listener);
                }
        }
                        updateSelection = false;
        @Override
    public void deactivatePanel() {

            });
        public Collection<DBDAttributeBinding> evaluate(@NotNull DBRProgressMonitor monitor) {
            if (item.getParentObject() == null && !isAttributeVisible(item)) {
import java.util.stream.Collectors;

        @NotNull
    }
    public void contributeActions(IContributionManager manager) {
    @Override
        }
                UIUtils.getActiveWorkbenchWindow(),
                ((ISelectionProvider) presentation).removeSelectionChangedListener(listener));
        @Override
    
    @Nullable
                .collect(Collectors.toList());
                            if (!text.isEmpty()) text.append("\n");
        String filterText = filterTextBox.getText().toUpperCase();
                // No changes
        this.presentation = presentation;
        attributeList.loadData();
import org.jkiss.dbeaver.model.data.DBDAttributeBindingMeta;
        protected Font getObjectFont(DBDAttributeBinding item) {
 */
    }
    private class MetaDataTable extends DatabaseObjectListControl<DBDAttributeBinding> {
                return;
        @Override
                        }
                    UIUtils.setClipboardContents(getDisplay(), TextTransfer.getInstance(), text.toString());
                {
            }, null);
/*

                        } finally {
        @Override
        this.attributeList.setFitWidth(true);
        refresh(false);


 */
        filterTextBox.setMessage(ResultSetMessages.panel_metadata_filter_hint);
        filterTextBox.addModifyListener(e -> refresh(true));
        }
        }
import java.util.Arrays;
                return item.getAttribute();
    }
                DBIcon.SQL_TEXT,
                        TreeViewer itemsViewer = (TreeViewer) attributeList.getItemsViewer();
            if (item instanceof DBDAttributeBindingMeta) {
import org.jkiss.code.Nullable;
import org.eclipse.swt.events.KeyAdapter;
import org.jkiss.dbeaver.model.DBValueFormatting;
import org.eclipse.swt.SWT;
                public void run() {
    private class LoadAttributesService extends DatabaseLoadService<Collection<DBDAttributeBinding>> {
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    }
        @Nullable
            }
            contributionManager.add(new Action(ResultSetMessages.meta_data_panel_action_copy_column_text) {

    public Control createContents(final IResultSetPresentation presentation, Composite parent) {
            return "MetaData/" + executionContext.getDataSource().getContainer().getDriver().getId();
}
        protected DBPImage getObjectImage(DBDAttributeBinding item) {
        protected LoadingJob<Collection<DBDAttributeBinding>> createLoadService(boolean forUpdate) {
import java.util.List;
        }
                            text.append(((DBDAttributeBinding) item).getName());
                    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        protected void addExtraColumns(ViewerColumnController<ObjectColumn, Object> columnController, Collection<DBDAttributeBinding> items) {
        });
                @Override
import org.eclipse.jface.action.IContributionManager;
                    }
            @Override
    public MetaDataPanel() {
    }
                "org.jkiss.dbeaver.ui.editors.sql.generate.ddl.by.resultSet", //$NON-NLS-1$
            return LoadingJob.createService(
        return panelContents;
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
                if (isAttributeVisible(attr)) {
            } else if (item != null) {
                        updateSelection = true;
import org.jkiss.dbeaver.model.DBIcon;
import org.eclipse.swt.widgets.Tree;
                public boolean hasChildren(Object element) {
                    @Override

        filterTextBox = new Text(filterPanel, SWT.BORDER | SWT.SEARCH | SWT.ICON_CANCEL);
            }
 *
                }
    @Override
                    filterTextBox.setText("");
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelBase;
                return null;
                    if (entityAttribute != null) {
                        }
        this.attributeList = new MetaDataTable(panelContents);
                    } finally {
 *
        {
    }
    public void refresh(boolean force) {
        UIUtils.createControlLabel(filterPanel,  ResultSetMessages.panel_metadata_filter_label);
        return presentation.getController().getModel().getVisibleAttributes().contains(attr);
import org.eclipse.jface.action.Action;

import org.eclipse.swt.widgets.Composite;
            if (attr != null && !updateSelection) {
        });
            UIWidgets.fillDefaultTreeContextMenu(contributionManager, (Tree) getItemsViewer().getControl());
    }
            }

    private transient boolean updateSelection = false;
        }
                }
                    return !CommonUtils.isEmpty(((DBDAttributeBinding) element).getNestedBindings());
                    }
import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                return "MetaData";
    private boolean isAttributeVisible(DBDAttributeBinding attr) {

        }
 * You may obtain a copy of the License at
                .filter(a -> a.getName().toUpperCase().contains(filterText))
                    try {
        curAttributes = newAttributes;
    }
    @Override
            if (executionContext == null) {
public class MetaDataPanel extends ResultSetPanelBase {
        return attributeList.getSuitableSelectedElement(DBDAttributeBinding.class);
    private MetaDataTable attributeList;
                    equals = false;
        filterTextBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    private DBDAttributeBinding getSelectedAttribute() {
import org.eclipse.jface.viewers.TreeViewer;
                        if (item instanceof DBDAttributeBinding) {
            for (int i = 0; i < curAttributes.size(); i++) {
                @Override
        LoadAttributesService()
                return BaseThemeSettings.instance.treeAndTableFontItalic;
            } else {
                            updateSelection = false;
        public void fillCustomActions(IContributionManager contributionManager) {
                    for (Object item : getItemsViewer().getStructuredSelection().toArray()) {
        Composite filterPanel = UIUtils.createComposite(panelContents, 2);
            boolean equals = true;
        List<DBDAttributeBinding> newAttributes = Arrays.asList(presentation.getController().getModel().getAttributes());
        if (attributeList.isLoading()) {
        if (curAttributes != null && curAttributes.size() == newAttributes.size()) {
        manager.add(
import org.eclipse.jface.viewers.ISelectionProvider;


