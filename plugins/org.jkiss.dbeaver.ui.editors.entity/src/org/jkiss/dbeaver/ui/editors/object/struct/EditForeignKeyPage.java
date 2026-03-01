                        vRefEntity,
            editDialog.setReferenceAttributes(refAttributes);
                public Image getImage(Object element) {
                        }
        private boolean columnRequired;
                        DBEObjectMaker<?,?> objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
                    toe3.setFullTypeName(refColumn.getFullTypeName());
        }
            }
            final GridData gd = new GridData(GridData.FILL_BOTH);
 * @author Serge Rider
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
    }
            handleRefTableSelect(navigatorModel.getNodeByObject(curRefTable));
        gd.horizontalSpan = 2;
            Collections.emptyMap());
                    schemaCombo.addItem(dbNode);
                        fkColumnInfo.ownColumn = sourceAttributes.get(i);
    private DBNDatabaseNode getNodeByContainerObject(@Nullable DBSObject containerObject) {
            @Override
        DBNDatabaseNode newContainerNode = null;
    public static class FKType implements DBPNamedObject {
    }
                //uniqueKeyCombo.setEnabled(curConstraints.size() > 1);
                schemaCombo.select(selectedNode);
            handleUniqueKeySelect();
            }
        if (foreignKey != null) {

                        break;
    private List<DBSEntityAttribute> sourceAttributes;
                false,
            fkNameText.setMessage(fkAutoName);
                        if (!CommonUtils.isEmpty(ownAttributes)) {
            return (T) ownColumn;
    private final DBSEntityAssociation foreignKey;
            }
    private static class FKColumnOptionsDialog extends BaseDialog {

                }
        return null;
import org.eclipse.swt.custom.CCombo;
        updatePageState();
                        item.setText(1, fkColumnInfo.ownColumn.getFullTypeName());
                toe.setRequired(customNotNull);
            return;
    private void setEnableCustomKeys(boolean enableCustomKeys) {
            columnsCombo.setFocus();
            ObjectEditorMessages.edit_foreign_key_page_create_container_select_reference_table_container) {
                toe.setMaxLength(refColumn.getMaxLength());
                    DBSEntityAttribute pkAttribute = pkColumn.getAttribute();
            if (selectedNode != null) {
            try {
            if (oldEditor != null) oldEditor.dispose();
            tableEditor.horizontalAlignment = SWT.CENTER;

            handleColumnClick(e);
            tableEditor.verticalAlignment = SWT.TOP;
                        if (firstElement instanceof DBNNode node) {
                return fki;
            }
                for (DBSEntityAttribute ownColumn : ownAttributes) {
            this.fkColumnInfo = fkColumnInfo;
                    DBNDatabaseNode newContainerNode = getTablesNode(schemaNode);
            }
                    }
        physicalKeyComponents.add(control);
                public String getText(Object element) {
            }
    public boolean isEnableCustomKeys() {
        editDialog.setEnableCustomKeys(true);
            tableList.setFilterObjectType(DatabaseNavigatorTreeFilterObjectType.table);

        return curConstraint;


        if (supportModifyRules) {
                });
                        item.setText(0, SELECT_COLUMN_LABEL);
            if (node != null) {

            @NotNull DBSEntity entity
            this.refColumn = refColumn;
                    return ownerContainerNode;
            Label controlLabel = UIUtils.createControlLabel(
            Control oldEditor = tableEditor.getEditor();
                            // Get indexes
/*
        }
        for (FKColumnInfo tableColumn : editDialog.getColumns()) {
                                log.error(e.getTargetException());
                                if (constraint.getConstraintType().isUnique() && constraint instanceof DBSEntityReferrer) {
    private static final String CONTAINER_LOGICAL_FK = "container.logical-fk";
                    columnsCombo.select(0);
        }
                    controlLabel.setText(nodeType);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }

        assert vRefEntity != null;
    public static class FKColumnInfo {
        }
        }
                }
        }
            if (allowedKeyTypes.length > 1) {
    }
        if (curRefTable == null) {
        handleRefTableSelect();
                    } catch (DBException e) {
        public boolean isPhysical() {

                onDeleteCombo.addSelectionListener(new SelectionAdapter() {
                        }
        final Composite panel = UIUtils.createComposite(parent, 1);

import org.jkiss.dbeaver.ui.DBeaverIcons;
                    DBVEntityConstraint vUniqueKey = new DBVEntityConstraint(
            tableList.getViewer().getTree().setFocus();
                                for (DBSTableIndex index : indexes) {
                            }
    @Nullable
                    // This node is a child of schema node and has the same meta as our original table parent node
        if (refAttributes != null) {
    }
    }

        } else {
                if (foreignKey.getParentObject() instanceof DBVEntity) {
                if (ownerContainerNode != null) {
/*
                    pkGroup,
                UIUtils.runInProgressService(monitor -> {


                        public void widgetSelected(SelectionEvent e) {
            if (selection[0].getData() instanceof FKColumnInfo fki) {
            }
                    });
    private boolean enableCustomKeys = false;
        {
            }

                            }
    private DBSEntityConstraint curConstraint;

        for (DBSEntityAttribute attr : CommonUtils.safeList(table.getAttributes(new VoidProgressMonitor()))) {
        }
                    }
        List<DBVEntityForeignKeyColumn> columns = new ArrayList<>();
                cascadeGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    if (dbNode.getObject() == foreignKey.getParentObject().getParentObject()) {
    private FKType selectedKeyType = FK_TYPE_PHYSICAL;
        }
            }
            DBSEntityAttribute ownColumn = tableColumn.getOwnColumn();
                    }
    public static final FKType FK_TYPE_LOGICAL = new FKType("Logical", false);
                        refTable.getAttributes(monitor);
        tableList.setInput(newContainerNode);
        protected Composite createDialogArea(@NotNull Composite parent) {
        return fkColumns;
                    }
                }
                    .stream().map(DBSEntityAttributeRef::getAttribute).toList();
                        public void widgetSelected(SelectionEvent e) {
                fkNameText = UIUtils.createLabelText(pkGroup, ObjectEditorMessages.dialog_struct_edit_fk_name, "");
            final TableEditor tableEditor = new TableEditor(columnsTable);
    private static final Log log = Log.getLog(EditForeignKeyPage.class);

                    if (fkColumnInfo.ownColumn == null) {
        DBVEntityForeignKey virtualFK = new DBVEntityForeignKey(vEntity);
                    setContainerInfo(node);
    public static DBVEntityForeignKey createVirtualForeignKey(@NotNull DBVEntity vEntity) {
}
            this.tableEditor = tableEditor;
            return ownerTableNode.getOwnerProject();
                errorMessage = "You have to specify column for '" + fkColumnInfo.refColumn.getName() + "'";
                            for (DBSEntityAttribute ownColumn : ownAttributes) {
        }
                    // We need to find table container node
    }
                for (FKType type : allowedKeyTypes) {
                                getShell().getDisplay(), TextTransfer.getInstance(), node.getNodeDisplayName());
                containerNode = containerNode.getParentNode();
            try {
                        @Override
            }
        DBNDatabaseNode schemaContainerNode = null;
import org.eclipse.jface.viewers.ILabelProvider;
        public void mouseUp(MouseEvent e) {
                log.error(e);

        @NotNull DBVEntity vEntity,
            curConstraint = null;
                    if (found) {
    private void setRefTable(DBSEntity curRefTable) {
                    containerObject = foreignKey.getParentObject();
            pkGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        @Override
        setPreferredKeyType(allowedKeyTypes[0]);
        String title,
            columnsCombo.add(NEW_COLUMN_LABEL);

        verifyTableColumns();
    }
        if (curRefTable != null) {
            return composite;
                        @Override
                log.error("Own column not specified");

                } else {
        @NotNull
        if (tableList != null) {
        boolean supportModifyRules = !ArrayUtils.isEmpty(supportedModifyRules);
            return false;
            columnsTable.addSelectionListener(new SelectionAdapter() {
                SWT.BORDER | SWT.FULL_SELECTION,
        if (containerObject instanceof DBVContainer) {
            if (pkc.getLayoutData() instanceof GridData) {
                    return element instanceof DBNDatabaseNode dbnNode && dbnNode.getObject() instanceof DBSEntity;
        columnsTable.removeAll();
                @Override
                }
                tableGroup, ObjectEditorMessages.edit_foreign_key_page_create_schema_container);

import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;

                result.add(attr);
            if (containerNode instanceof DBNDatabaseNode) {
        }
                uniqueKeyCombo.add(constraint.getName() + " (" + constraint.getConstraintType().getLocalizedName() + ")");


                    }
            columnNameText.addModifyListener(e -> columnName = columnNameText.getText());
                    if (foreignKey instanceof DBVEntityForeignKey) {
            this.columnsTable = columnsTable;
    public DBSForeignKeyModifyRule getOnDeleteRule() {
            // Clean up any previous editor control
        {
            return;
            columnsCombo.addFocusListener(new FocusAdapter() {
                    setContainerInfo(null);
                            if (parent instanceof DBNDatabaseNode dbnNode && dbnNode.getObject() instanceof DBSEntity) {
    }
            }
    }
            } else {
    private Button customUKButton;
            for (DBSEntityAttribute refAttr : refAttributes) {
                            }

            fkInfo.ownColumn = null;
                    ObjectEditorMessages.dialog_struct_edit_fk_label_ref_table, DBUtils.getObjectFullName(curRefTable, DBPEvaluationContext.UI), SWT.READ_ONLY | SWT.BORDER);
        }
                    return DBeaverIcons.getImage(((DBNDatabaseNode) element).getNodeIcon());
                                    fkColumnInfo.ownColumn = ownColumn;
    }
        UIUtils.asyncExec(() -> UIUtils.packColumns(columnsTable, true));
                    if (fki != null) {
    private FKType preferredKeyType = FK_TYPE_PHYSICAL;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        this.selectedKeyType = preferredKeyType;
        if (!editDialog.edit()) {
    }
            @Override
                        vRefEntity.getName() + "_VK");
                    if (refDataType instanceof DBSDataTypeSerial dts && dts.isSerialDataType()) {
        if (curConstraint instanceof DBVEntityConstraint) {
                        }
        }
 * DBeaver - Universal Database Manager

                }
        if (schemaContainerNode != null) {
    public boolean isPageComplete() {
        setErrorMessage("Select reference table");
                    }
    private void createSchemaSelector(Composite tableGroup) throws DBException {
                    public void run() {
            @Nullable
            UIUtils.createLabelText(
        private final TableEditor tableEditor;
                        continue;
                DBSObject containerObject;
                    if (newContainerNode != null) {
                                        curConstraints.add(index);
                                }
                if (ownerTableNode != null) {
            final GridData gd = new GridData(GridData.FILL_BOTH);
                manager.add(new Action(UIMessages.ui_properties_tree_viewer_action_copy_name) {
            ObjectEditorMessages.dialog_struct_edit_fk_virtual_page_title,
        if (page.edit()) {
    public boolean isEnabled() {
                    });
            try {
            UIUtils.createTableColumn(columnsTable, SWT.LEFT, ObjectEditorMessages.dialog_struct_edit_fk_column_ref_col_type);
            this.columnName = fkColumnInfo.getCustomName();
            columnsCombo.addSelectionListener(new SelectionAdapter() {

                if (CommonUtils.equalObjects(iAttrs, cAttrs)) {
                Composite ktPanel = UIUtils.createFormPlaceholder(tableGroup, allowedKeyTypes.length, 1);
                        createSchemaSelector(tableGroup);
                UIUtils.createControlLabel(tableGroup, ObjectEditorMessages.dialog_struct_edit_fk_label_key_type);
                        ownerTableNode = navigatorModel.getNodeByObject(realEntity);
        return null;
                    }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
                    }
        } catch (DBException e1) {

        DBSEntityAttribute ownColumn;
            newContainerNode = schemaNode;
                public void widgetSelected(SelectionEvent e) {
                            updateControlsVisibility();
            uniqueKeyCombo.select(constraintIndex);
                public void widgetSelected(SelectionEvent e) {
    private Combo uniqueKeyCombo;
                tableGroup,
        }
            TableItem item = columnsTable.getSelection()[0];
                    public void widgetSelected(SelectionEvent e) {
            columnsTable.setLayoutData(gd);
                    }

        }
                        throw new InvocationTargetException(e);
import org.eclipse.jface.dialogs.IDialogConstants;
        return DBeaverIcons.getImage(DBValueFormatting.getObjectImage(column));
            });


import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
            columnOptionsButton.setEnabled(false);
    }
            columnsTable.addMouseListener(new ColumnsMouseListener(tableEditor, columnsTable));
                    CommonUtils.safeList(((DBSEntityReferrer) curConstraint).getAttributeReferences(monitor));
        if (allowedKeyTypes != null) {
    }
        ColumnsMouseListener(TableEditor tableEditor, Table columnsTable) {
            }
        if (ownerTableNode != null) {
            }
    }
                //keyTypeCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        return panel;

                    ObjectEditorMessages.dialog_struct_edit_fk_custom_uk_button_create,

                    return true;


 *

                customUKButton.setEnabled(false);
            item.setText(0, "<" + fkInfo.refColumn.getName() + ">");
        @Override

            } catch (DBException e1) {
            fkColumnInfo.customNotNull = dialog.columnRequired;
                    uniqueKeyCombo.add("<No unique keys in table '" + DBUtils.getObjectFullName(curRefTable, DBPEvaluationContext.UI) + "'>");
            if (constraint instanceof DBSEntityReferrer referrer) {
 *
                    curConstraints.add(vUniqueKey);
                    // We have ref attrs specified - create virtual unique key automatically
    }
            columnsTable.setLinesVisible(true);
                    columnsCombo.add(ownColumn.getName());
                    item.setImage(2, getColumnIcon(pkAttribute));
    private Table columnsTable;
 *
            final Composite columnGroup = UIUtils.createComposite(settingsPanel, 1);
 *
                @Override
            columnOptionsButton = UIUtils.createDialogButton(columnGroup, "Column options ...", new SelectionAdapter() {
                    TableItem item = new TableItem(columnsTable, SWT.NONE);

                                if (newColumn instanceof DBPNamedObject2 no) {
        public <T extends DBSEntityAttribute> T getOwnColumn() {
            tableEditor.minimumWidth = 50;
            columns.add(
            if (enableCustomKeys) {
                    for (DBSEntityAttribute refAttr : refAttributes) {
    }
        UIUtils.packColumns(columnsTable, true);
            }
                            } catch (InvocationTargetException e) {
                    loadTableList(tablesNode);
                    }
                if (nodeObject instanceof DBSSchema || nodeObject instanceof DBSCatalog) {
                }
            final CSmartCombo<DBNDatabaseNode> schemaCombo = new CSmartCombo<>(tableGroup, SWT.BORDER, labelProvider);
    }
            constraint);
import org.jkiss.dbeaver.runtime.DBWorkbench;

            {
                        item.setImage(0, getColumnIcon(fkColumnInfo.ownColumn));


                        editColumnOptions(fki);
        if (selection.length == 1) {
    }
import org.eclipse.swt.events.*;
                public void widgetSelected(SelectionEvent e) {
        return foreignKey;

        public FKColumnOptionsDialog(Shell parentShell, FKColumnInfo fkColumnInfo) {
            @Nullable DBECommandContext commandContext,
            fkInfo.customName = null;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                        }
            item.setText(1, fkInfo.refColumn.getFullTypeName());
            NavigatorUtils.createContextMenu(null, tableList.getViewer(), manager -> {
            @NotNull DBRProgressMonitor monitor,
                }
        };
*/
            }

                break;
        this.ownerTableNode = navigatorModel.findNode(foreignKey.getParentObject());
            }


    private void verifyTableColumns() {
            return null;
        int selectionIndex = columnsCombo.getSelectionIndex();
        navigatorModel = foreignKey.getDataSource().getContainer().getProject().getNavigatorModel();
        }
            DBNNode containerNode = ownerTableNode.getParentNode();
                        hasCustomColumn = true;

                uniqueKeyCombo.select(0);
        private void setNewColumnDataType(DBSObject newColumn) throws DBException {
                } else if (newColumn instanceof DBSTypedObjectExt2 toe) {
                    assert vRefEntity != null;
                public void widgetSelected(SelectionEvent e) {
            customUKButton.setText("Edit");
            notNullCheck.addSelectionListener(new SelectionAdapter() {
                    }
            curConstraints = new ArrayList<>();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    }
        return true;
                            defineRefTableConstraint();
                UIUtils.createLabelText(

import org.jkiss.dbeaver.model.*;
        }
            if (object instanceof DBSEntity) {
            .stream().map(DBSEntityAttributeRef::getAttribute).toList();
    }
                containerObject = ((DBVContainer) containerObject).getRealContainer(new VoidProgressMonitor());
        }
    }
                if (columnsCombo.getSelectionIndex() < 0) {
        }
                final Combo onUpdateCombo = UIUtils.createLabelCombo(cascadeGroup, ObjectEditorMessages.dialog_struct_edit_fk_combo_on_update, SWT.DROP_DOWN | SWT.READ_ONLY);

            FKColumnInfo fkColumnInfo = (FKColumnInfo) item.getData();
    }
            int constraintIndex = curConstraints.indexOf(constraint);
                        onDeleteRule = supportedModifyRules[onDeleteCombo.getSelectionIndex()];
                                    break;
        settingsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }

                        DBSDataType sbDataType = dts.getBaseDataType();
import org.eclipse.swt.SWT;
            if (CommonUtils.isEmpty(customName)) {
            editDialog.setRefTable(refEntity);
                    if (columnsCombo.getSelectionIndex() >= 0) {
                    if (DBSEntityAttribute.class.isAssignableFrom(childType)) {
                                    no.setName(customName);
            customUKButton.setEnabled(true);
                    item.setText(2, "");
        for (DBNNode node = ownerTableNode.getParentNode(); node != null; node = node.getParentNode()) {
            tableList = new DatabaseNavigatorTree(
                    DBNDatabaseNode schemaNode = schemaCombo.getSelectedItem();
                loadTableList(dbnNode);
        assert navigatorModel != null;

                    if (node.getParentNode() instanceof DBNDatabaseNode) {

            this.physical = physical;
            columnsTable.setHeaderVisible(true);
                @Override
        }
        private final boolean physical;
    protected boolean supportsCustomName() {
        this.enableCustomKeys = enableCustomKeys;
    @Nullable
            super(parentShell, "New column options", null);
    private final List<FKColumnInfo> fkColumns = new ArrayList<>();

            tableGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            DBWorkbench.getPlatformUI().showError(ObjectEditorMessages.dialog_struct_edit_fk_error_load_constraints_title, ObjectEditorMessages.dialog_struct_edit_fk_error_load_constraints_message, e.getTargetException());
            }
            if (tablesNode instanceof DBNDatabaseNode dbnNode) {
                if (!CommonUtils.isEmpty(nodeType)) {
                return (T)ownColumn;
    private final DBSForeignKeyModifyRule[] supportedModifyRules;
import org.jkiss.dbeaver.ui.controls.CSmartCombo;
        public String getName() {
            DBWorkbench.getPlatformUI().showError(
                event -> handleRefTableSelect((DBNDatabaseNode) event.getStructuredSelection().getFirstElement()));
                    if (fki != null && fki.ownColumn == null && fki.customName != null) {
                    tableGroup,
        }
            new DBSForeignKeyModifyRule[]{DBSForeignKeyModifyRule.NO_ACTION},
        if (!(foreignKey.getParentObject() instanceof DBVEntity)) {
    private Button columnOptionsButton;
    }
    private void loadTableList(DBNDatabaseNode newContainerNode) {
            protected DBNNode getSelectedNode() {
        }
    public DBSForeignKeyModifyRule getOnUpdateRule() {
            }
        }
        DBXTreeNode tableContainerMeta = ((DBNDatabaseNode) ownerTableNode.getParentNode()).getMeta();
            //uniqueKeyCombo.setEnabled(false);
                                setNewColumnDataType(newColumn);
    }
                }
                @Override

    }
        fkColumns.clear();
            item.setText(1, fkInfo.ownColumn.getFullTypeName());
        }
        try {
                        if (objectManager != null) {
    @Nullable
                    toe.setTypeName(refColumn.getTypeName());
                title,
                }
            fkColumnInfo.customName = dialog.columnName;
            // do nothing
            for (DBSEntityConstraint constraint : curConstraints) {

                if (newColumn instanceof DBSTypedObjectExt4 toe4 && refColumn instanceof DBSTypedObjectEx refTO) {
                    }
        public <T extends DBSEntityAttribute> T getRefColumn() {
        return true;
                    DBSDataType refDataType = refTO.getDataType();
            }
        List<? extends DBSEntityAttribute> iAttrs = Objects.requireNonNull(index.getAttributeReferences(monitor))
                }
        private String columnName;
    }
                }

                    if (!vRefEntity.addConstraint(vUniqueKey, true)) {
                    columnRequired = notNullCheck.getSelection();
public class EditForeignKeyPage extends BaseObjectEditPage {

        updatePageState();
    @Override
    }
                public void focusLost(FocusEvent e) {
                    }

        this.preferredKeyType = preferredKeyType;
    private String fkName;
            }
        }
            DBNNode containerNode = ownerTableNode == null ? null : ownerTableNode.getParentNode();
                        columnsCombo.select(columnsCombo.getItemCount() - 1);
                    if (type == preferredKeyType) {
                            }
                    updatePageState();

            });
                        }
    private Text fkNameText;
            }
        }
        for (Control pkc : physicalKeyComponents) {
            if (supportsCustomName()) {
            if (!CommonUtils.isEmpty(ownAttributes)) {
                        containerNode = containerNode.getParentNode();
                    }
                            Map<String, Object> options = new LinkedHashMap<>();
        // Save
        }
                    }
                    new SelectionAdapter() {
            }

                                    }
    private DBNDatabaseNode getTablesNode(DBNDatabaseNode schemaNode) {
                    }
                            final Collection<? extends DBSTableIndex> indexes = dbsTable.getIndexes(monitor);
                        if (ownerTableNode == null) {
                            }
                });
                    public void widgetSelected(SelectionEvent e) {
        }
    private class ColumnsMouseListener extends MouseAdapter {
                    item.setText(0, fkColumnInfo.ownColumn.getName());
                public void widgetSelected(SelectionEvent e) {
                return;
        DBVEntityConstraint constraint = vRefEntity.getBestIdentifier();
            for (DBSEntityConstraint constraint : curConstraints) {
    private DBPProject getOwnerProject() {
                ObjectEditorMessages.dialog_struct_edit_fk_label_table, DBUtils.getObjectFullName(foreignKey.getParentObject(), DBPEvaluationContext.UI), SWT.READ_ONLY | SWT.BORDER);
        }
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
    }
                curConstraint = null;
    }
    }
        uniqueKeyCombo.removeAll();
            } else if (enableCustomKeys && curRefTable != null) {
    private void editColumnOptions(FKColumnInfo fkColumnInfo) {
        return true;
                            UIUtils.setClipboardContents(
                }
                    onDeleteCombo.add(modifyRule.getName());

                    onUpdateCombo.add(modifyRule.getName());
                if (DBUtils.getConstraintAttribute(monitor, constraint, refAttr) == null) {
            DBNNode tablesNode = rootNode instanceof DBNDatabaseNode dbNode ? getTablesNode(dbNode) : rootNode;

            if ((col.ownColumn == null && col.customName == null) || col.refColumn == null) {
    public DBSEntityConstraint getUniqueConstraint() {
        }
    private void setReferenceAttributes(Collection<? extends DBSEntityAttribute> refAttributes) {
import org.eclipse.jface.action.Action;
            return (T) refColumn;
                                        monitor, realEntity, true));
                    } else {

        this.curRefTable = curRefTable;
                        }
                        DBSEntityConstraintType.VIRTUAL_KEY,
            }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilterObjectType;
        }
            item.setText(0, "<" + fkColumnInfo.customName + ">");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Identify the selected row
            return null;
                for (int i = 0; i < attributeReferences.size(); i++) {
            }
    private boolean isValidRefConstraint(DBRProgressMonitor monitor, DBSEntityReferrer constraint) throws DBException {
        return onUpdateRule;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        throw new DBVException("Virtual Unique Key with name '" + vUniqueKey.getName() + "' already exists");

                ownerContainerNode = node;
                        }
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
        public <T extends DBSEntityAttribute> T getOrCreateOwnColumn(
                        assignForeignKeyRefConstraint(fkInfo, columnsCombo, item);
            }
                    item.setText(1, fkColumnInfo.ownColumn.getFullTypeName());
        if (ukSelectionIndex >= 0) {

            Composite group = UIUtils.createTitledComposite(composite, "New column options", 2, GridData.FILL_HORIZONTAL, 300);
import java.util.*;
        if (ownerTableNode != null) {
            editDialog.setSourceAttributes(srcAttributes);
                Collections.<DBSTableColumn>emptyList() :
                                    ownerTableNode = navigatorModel.getNodeByObject(
        ) throws DBException {
                // Cascades
                }
    private boolean supportsCustomName = false;
                    DBNDatabaseNode tablesNode = getTablesNode(ownerContainerNode);
            curRefTable = null;
        try {
    }
            }
                    @Override
    public EditForeignKeyPage(
                        // Cache ref table columns
import org.jkiss.dbeaver.DBException;
            int columnIndex = UIUtils.getColumnAtPos(item, e.x, e.y);
                        for (DBXTreeNode childItem : dbNode.getMeta().getChildren(child)) {
        }
                if (CommonUtils.isEmpty(curConstraints) && enableCustomKeys && !CommonUtils.isEmpty(refAttributes)) {
            CONTAINER_LOGICAL_FK,
                final DBSEntity refTable = curRefTable;
        }
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    }
            UIUtils.createTableColumn(columnsTable, SWT.LEFT, ObjectEditorMessages.dialog_struct_edit_fk_column_col_type);
            if (refColumn != null) {
                }
            while (containerNode instanceof DBNDatabaseFolder) {
        super(title);
                    }
        EditConstraintPage page = new EditConstraintPage(
                onDeleteCombo.select(0);
        {
                        break;
                @Override
            if (fkInfo.ownColumn == null && columnIndex != 0) {
            customUKButton.setEnabled(!hasLogicalConstraint);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
                boolean found = false;
        super.createControl(parent);
            item.setImage(0, getColumnIcon(fkInfo.ownColumn));
                            log.debug("Base data type for serial data type '" + dts.getFullTypeName() + "'");

                    }
                        loadTableList(newContainerNode);
            }
                new ArrayList<>(getValidAttributes(curEntity));
        @Nullable Collection<? extends DBSEntityAttribute> srcAttributes,
        boolean pkVisible = selectedKeyType.isPhysical();
                if (curRefTable == null) {
            customUKButton.setText("Create");
                    return new DatabaseNavigatorContentProvider(this, showRoot) {
import org.jkiss.dbeaver.model.struct.*;
                throw new DBException("Custom column name not specified");
                onDeleteRule = onUpdateRule = supportedModifyRules[0];

            if (curRefTable == null) {
                        log.debug("Constraint " + curConstraint.getName() + " column attribute not found");

                                    ownColumn = attr;
        return false;
            };

        }
                    }
                        // Get constraints
        if (ownerTableNode == null) {
                });
                                Class<?> childrenClass = schemaNode.getChildrenClass(dbxItem);
            return name;
        {
                                UIUtils.runInProgressDialog(monitor ->
 * See the License for the specific language governing permissions and
        return navigatorModel.getNodeByObject(containerObject);
        String errorMessage = null;
                                }

                        // Cache own table columns
                return;
package org.jkiss.dbeaver.ui.editors.object.struct;
                toe.setScale(refColumn.getScale());
import org.jkiss.utils.ArrayUtils;
                    item.setText(3, pkAttribute.getFullTypeName());
        for (DBSEntityConstraint constraint : constraints) {
                    try {
                        keyTypeButton.setSelection(true);
            List<DBNDatabaseNode> allContainers = schemaCombo.getItems();
                    disposeOldEditor();
                    fkColumnInfo.ownColumn = attr;
                    }
import org.eclipse.swt.layout.GridData;
                                    }
        } catch (DBException e) {
                onDeleteCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private void setPreferredKeyType(FKType preferredKeyType) {
                            }
    private FKColumnInfo getSelectedColumnInfo() {

    private void enableCurConstraintEdit() {

    private static List<DBSEntityAttribute> getValidAttributes(DBSEntity table) throws DBException {
                }
            gd.widthHint = 500;
                    hasLogicalConstraint = true;
        if (selectionIndex == 0) {
                    }
                                    if (isValidRefConstraint(monitor, (DBSEntityReferrer) constraint)) {
        } catch (DBVException e) {
                }
                ObjectEditorMessages.dialog_struct_edit_fk_error_load_constraint_columns_message, e);
            return physical;
            }
            if (uniqueKeyCombo.getItemCount() == 0) {
                    fkColumns.add(fkColumnInfo);
            }
                setErrorMessage(uniqueKeyCombo.getText());
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Nullable


import org.jkiss.dbeaver.ui.internal.UIMessages;
    private void setSourceAttributes(Collection<? extends DBSEntityAttribute> srcAttributes) {
import org.jkiss.dbeaver.model.struct.rdb.*;
        }
            if (refConstraint != null) {
        this.allowedKeyTypes = allowedKeyTypes;

            }
import org.eclipse.jface.viewers.LabelProvider;
        for (TableItem item : columnsTable.getItems()) {
            Composite composite = super.createDialogArea(parent);
import org.jkiss.dbeaver.model.edit.DBEStructEditor;
            if (entityEditor != null) {
        for (FKColumnInfo col : fkColumns) {
                            // Do not show anything below tables
    }
    public DBSObject getObject() {
                    @Override
                            DBSObject newColumn = objectManager.createNewObject(monitor, commandContext, entity, null, options);
                                    found = true;
        this.supportsCustomName = supportsCustomName;
                }



            DBSEntityConstraint refConstraint = foreignKey.getReferencedConstraint();

            // Selected by mouse
                                        isValidRefConstraint(monitor, index)) {
                        selectedNode = dbNode;
            containerObject = containerObject.getParentObject();
            fkInfo.customName = fkInfo.refColumn.getName();
            tableList.setLayoutData(gd);
        }
            log.error(e1);

            });

            setTitle(NLS.bind(ObjectEditorMessages.dialog_struct_edit_fk_title,
            });
        }
        FKColumnInfo(DBSEntityAttribute refColumn) {
import java.lang.reflect.InvocationTargetException;
                        if (!CommonUtils.isEmpty(constraints)) {
            if (fkInfo.refColumn == null && columnIndex != 2) {
        return result;
            } catch (DBException e) {
            if (curConstraint instanceof DBSEntityReferrer) {
                containerNode = containerNode.getParentNode();
                        // Try to find matched column in own table

        ObjectContainerSelectorPanel containerPanel = new ObjectContainerSelectorPanel(
            addPhysicalKeyComponent(cascadeGroup);
                            options.put(SQLObjectEditor.OPTION_SKIP_CONFIGURATION, true);

    @Override
        if (containerObject != null && containerObject.getParentObject() instanceof DBSObjectContainer) {

            final CCombo columnsCombo = new CCombo(columnsTable, SWT.DROP_DOWN | SWT.READ_ONLY);
            }
            Collection<? extends DBSEntityAttribute> tmpColumns = curEntity.getAttributes(monitor);


import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorContentProvider;
            log.error("No reference table");
                            refDataType = sbDataType;
                    TableItem item = new TableItem(columnsTable, SWT.NONE);
                        schemaContainerNode = (DBNDatabaseNode) node.getParentNode();

import org.jkiss.dbeaver.ui.UIUtils;

                for (DBSEntityAttribute attr : CommonUtils.safeCollection(curEntity.getAttributes(monitor))) {
        public boolean customNotNull;
        @Override
                    @Override
        }
                    // Here is another trick
        ownAttributes = null;
            if (newColumn instanceof DBSTypedObjectExt2 toe) {
            gd.heightHint = 150;
            DBSObject object = refTableNode.getObject();
            UIUtils.createControlLabel(panel, ObjectEditorMessages.dialog_struct_edit_fk_label_columns);

            ownAttributes = tmpColumns == null ?
            }
 * you may not use this file except in compliance with the License.

                @Override
                }
                ((GridData) pkc.getLayoutData()).exclude = !pkVisible;
            columnsTable = new Table(panel, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER);
        return createVirtualForeignKey(vEntity, null, new FKType[]{FK_TYPE_LOGICAL}, null, null);
        if (curRefTable == null) {
                    item.setText(2, pkAttribute.getName());
import org.jkiss.dbeaver.model.navigator.DBNNode;
                ObjectEditorMessages.dialog_struct_edit_fk_error_load_constraints_message, e);
            UIUtils.createTableColumn(columnsTable, SWT.LEFT, ObjectEditorMessages.dialog_struct_edit_fk_column_column);

        handleUniqueKeySelect();
        DBSEntity curEntity = foreignKey.getParentObject();
        }
            virtualFK.setReferencedConstraint(new VoidProgressMonitor(), editDialog.getUniqueConstraint());
                String nodeType = allContainers.getFirst().getMeta().getNodeTypeLabel(foreignKey.getDataSource(), null);

        return enableCustomKeys;
                            childType, DBEObjectMaker.class);
            uniqueKeyCombo.addSelectionListener(new SelectionAdapter() {
            DBNDatabaseNode node = getNodeByContainerObject(foreignKey.getParentObject());
            });
                return false;
    private DBNDatabaseNode ownerTableNode, ownerContainerNode;
            final TableItem item = columnsTable.getItem(new Point(e.x, e.y));
                // Shouldn't be here
                new DatabaseNavigatorTreeFilter()) {
                                if (ownColumn.getName().equals(pkAttribute.getName()) && curEntity != pkAttribute.getParentObject()) {

                }
                        final Collection<? extends DBSEntityConstraint> constraints = DBVUtils.getAllConstraints(monitor, refTable);
                    uniqueKeyCombo.add("<No reference table selected>");
                    if (child instanceof DBNDatabaseFolder dbNode) {

        verifyTableColumns();
        DBSForeignKeyModifyRule[] supportedModifyRules,

                curConstraint = refConstraint;
        updateControlsVisibility();
                            for (DBSEntityConstraint constraint : constraints) {
                }
        }
            this.getOwnerProject(),
        final Composite pkGroup = UIUtils.createComposite(panel, enableCustomKeys ? 3 : 2);

        TableItem[] selection = columnsTable.getSelection();
import org.jkiss.dbeaver.Log;
            columnOptionsButton.setEnabled(false);
                        }
            UIUtils.createTableColumn(columnsTable, SWT.LEFT, ObjectEditorMessages.dialog_struct_edit_fk_column_ref_col);
                containerPanel.setContainerInfo((DBNDatabaseNode) containerNode);
        Map<String, Object> options
    @Override
            if (item == null) {
                    }
                    DBNNode containerNode = ownerTableNode.getParentNode();
            } else {
                    if (fkColumnInfo.ownColumn != null) {
 */
            if (node instanceof DBNDatabaseNode) {
        }
        private final FKColumnInfo fkColumnInfo;

            if (ownColumn != null) {
        int ukSelectionIndex = uniqueKeyCombo.getSelectionIndex();
    private DatabaseNavigatorTree tableList;
                        onUpdateRule = supportedModifyRules[onUpdateCombo.getSelectionIndex()];
                    }
        this.sourceAttributes = CommonUtils.isEmpty(srcAttributes) ? null : new ArrayList<>(srcAttributes);
                    break;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                        containerObject = ((DBNDatabaseNode) containerNode).getObject();
        List<DBSEntityAttribute> result = new ArrayList<>();
 *     http://www.apache.org/licenses/LICENSE-2.0
            item.setImage(0, getColumnIcon(fkInfo.refColumn));
import org.jkiss.dbeaver.model.app.DBPProject;
        EditForeignKeyPage editDialog = new EditForeignKeyPage(
        }
                fkNameText.addModifyListener(e -> fkName = fkNameText.getText());
        }
    }

            if (fkColumnInfo.ownColumn == null && fkColumnInfo.customName == null) {
    @Override
        private void disposeOldEditor() {
                    virtualFK, ownColumn.getName(), tableColumn.getRefColumn().getName()));

    public static DBVEntityForeignKey createVirtualForeignKey(
            disposeOldEditor();
                        @Override
        Composite settingsPanel = UIUtils.createComposite(panel, supportModifyRules ? 2 : 1);
            });
                    }
    private final List<Control> physicalKeyComponents = new ArrayList<>();
    }
        return virtualFK;
                    if (fkInfo.ownColumn == ownColumn) {
                if (node instanceof DBNDatabaseNode dbNode && dbNode.getObject() instanceof DBSObjectContainer) {
import org.jkiss.code.Nullable;
                for (DBNNode child : ArrayUtils.safeArray(schemaNode.getChildren(new VoidProgressMonitor()))) {
                                    if (index.isUnique() &&
                customUKButton = UIUtils.createDialogButton(
                }

        containerPanel.setLayoutData(gd);
                    if (containerNode instanceof DBNDatabaseNode) {
            });
                entity.getClass(),
                for (DBSForeignKeyModifyRule modifyRule : supportedModifyRules) {
    }
                protected DatabaseNavigatorContentProvider createContentProvider(boolean showRoot) {
            Button notNullCheck = UIUtils.createCheckbox(group, "Not Null", "Make new column required", false, 2);
                    }
                onUpdateCombo.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.widgets.*;
    private DBSEntity curRefTable;
            editDialog.setAllowedKeyTypes(allowedKeyTypes);
                @Override
                        assignForeignKeyRefConstraint(fkInfo, columnsCombo, item);
import org.eclipse.osgi.util.NLS;

        ((Composite) getControl()).layout(true, true);
                            if (!CommonUtils.isEmpty(indexes)) {
            if (ownColumn == null) {
    }
    private void handleRefTableSelect() {
            for (DBNNode node : ArrayUtils.safeArray(schemaContainerNode.getChildren(new VoidProgressMonitor()))) {
    private List<? extends DBSEntityAttribute> ownAttributes;
        @Nullable FKType[] allowedKeyTypes,
    }

            DBNDatabaseNode selectedNode = null;
                    log.debug("Can't create schema selector", e);
    private boolean isConstraintIndex(DBRProgressMonitor monitor, List<DBSEntityConstraint> constraints, DBSTableIndex index) throws DBException {
                                return false;
import org.jkiss.dbeaver.model.virtual.*;
                        // Virtual key - add container selector
        private final String name;
                                }
        return fkName;
        @NotNull
        }

                } else {
import org.jkiss.dbeaver.model.navigator.DBNModel;
            }
        }

            tableGroup,
        public String getCustomName() {
                        item.setText(1, "");
            if (curRefTable != null) {
    }
            return customName;
    private void defineRefTableConstraint() {
                onUpdateCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        private String customName;
        }
    private List<DBSEntityConstraint> curConstraints;
    public void setSupportsCustomName(boolean supportsCustomName) {
        this.foreignKey = foreignKey;
                    FKColumnInfo fkColumnInfo = new FKColumnInfo(null);
    private void setAllowedKeyTypes(FKType[] allowedKeyTypes) {
            ILabelProvider labelProvider = new LabelProvider() {
            gd.widthHint = 500;
                @NotNull
        this.supportedModifyRules = supportedModifyRules;
        }
            }
            // New auto column
            final Composite tableGroup = UIUtils.createComposite(panel, 2);
        if (!CommonUtils.isEmpty(refAttributes)) {
    private final DBNModel navigatorModel;
                        createContainerSelector(tableGroup);

                }
        DBSEntityAssociation foreignKey,
                                if (childrenClass != null && DBSEntity.class.isAssignableFrom(childrenClass)) {
            };
                }
                        Object firstElement = tableList.getViewer().getStructuredSelection().getFirstElement();
                }
        }
    }
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
                }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            curConstraint = curConstraints.isEmpty() ? null : curConstraints.get(ukSelectionIndex);
                    FKColumnInfo fkColumnInfo = new FKColumnInfo(pkAttribute);
            UIUtils.createControlLabel(panel, ObjectEditorMessages.dialog_struct_edit_fk_label_ref_table);
        @Nullable Collection<? extends DBSEntityAttribute> refAttributes) {
    ) {
                    handleUniqueKeySelect();
                @Override
                    FKColumnInfo fki = getSelectedColumnInfo();
            Text columnNameText = UIUtils.createLabelText(group, "Column name", fkColumnInfo.getCustomName(), SWT.BORDER);
                }
            }
    public String getName() {

    }
                        if (sbDataType == null) {
            tableList.getViewer().addFilter(new ViewerFilter() {
    private List<DBSEntityAttribute> refAttributes;
import org.jkiss.code.NotNull;
        if (dialog.open() == IDialogConstants.OK_ID) {

        }
    protected void addPhysicalKeyComponent(Control control) {
        vEntity.addForeignKey(virtualFK);
                return node.getOwnerProject();
            ObjectEditorMessages.dialog_struct_edit_fk_page_title,
                        foreignKey.getParentObject().getAttributes(monitor);
                public void widgetSelected(SelectionEvent e) {
                new DBVEntityForeignKeyColumn(
import org.eclipse.swt.graphics.Image;
                    };
        }
        }

import org.eclipse.swt.graphics.Point;
                        }
            handleRefTableSelect();
        }
                DBSObject nodeObject = ((DBNDatabaseNode) node).getObject();
        if (enableCustomKeys) {
        sourceAttributes = (List<DBSEntityAttribute>) options.get(SQLForeignKeyManager.OPTION_OWN_ATTRIBUTES);
    private DBSForeignKeyModifyRule onDeleteRule;
        try {
        if (fkColumns.isEmpty()) {
                    item.setImage(0, getColumnIcon(fkColumnInfo.ownColumn));
                List<? extends DBSEntityAttributeRef> attributeReferences =

                curRefTable = refConstraint.getParentObject();
                public boolean select(Viewer viewer, Object parentElement, Object element) {
                                    break;
                    boolean hasCustomColumn = false;
            });
            if (enableCustomKeys) {
                }
                    if (realEntity != null) {
                    return false;
import org.eclipse.swt.dnd.TextTransfer;
                }
        return onDeleteRule;
    }

            fkInfo.ownColumn = ownAttributes.get(selectionIndex - 1);
        return newContainerNode;
                toe.setPrecision(refColumn.getPrecision());
import org.jkiss.utils.CommonUtils;
    private void assignForeignKeyRefConstraint(FKColumnInfo fkInfo, CCombo columnsCombo, TableItem item) {
                            selectedKeyType = (FKType) e.widget.getData();


            if (!DBUtils.isHiddenObject(attr) && !DBUtils.isPseudoAttribute(attr)) {
    }
                List<? extends DBSEntityAttribute> cAttrs = Objects.requireNonNull(referrer.getAttributeReferences(monitor))
        DBRProgressMonitor monitor = new VoidProgressMonitor();
            schemaCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

                                    newContainerNode = dbNode;
    @Nullable
                // TODO: direct custom foreign key creation. show columns list
 * limitations under the License.
                // Set new column data type
                            try {
                // Read column nodes with void monitor because we already cached them above
                    DBSEntity realEntity = ((DBVEntity) foreignKey.getParentObject()).getRealEntity(new VoidProgressMonitor());
            boolean hasLogicalConstraint = false;

                panel,

            columnOptionsButton.setEnabled(true);
    private void updateControlsVisibility() {
                    item.setText(3, "");
            throw new DBException("Cannot create new column in table '" + DBUtils.getObjectFullName(entity, DBPEvaluationContext.UI) + "'");
                            if (childItem instanceof DBXTreeItem dbxItem) {
                    } else if (ownerTableNode != null) {
    }
                                }
        this.refAttributes = CommonUtils.isEmpty(refAttributes) ? null : new ArrayList<>(refAttributes);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.eclipse.swt.custom.TableEditor;
        }
        }
                DBEStructEditor.class);
            }
                    columnOptionsButton.setEnabled(hasCustomColumn);
            protected void setSelectedNode(DBNDatabaseNode node) {
    private void createContainerSelector(Composite tableGroup) {
                    item.setData(fkColumnInfo);
                }
                }
                    while (containerNode instanceof DBNDatabaseFolder) {
                return;
/**
                    item.setData(fkColumnInfo);
            DBNNode rootNode = containerNode == null ? navigatorModel.getRoot() : containerNode;
                        item.setText(0, fkColumnInfo.ownColumn.getName());

    private static final String SELECT_COLUMN_LABEL = "<click>";
                        public boolean hasChildren(Object parent) {
            item.setText(0, fkInfo.ownColumn.getName());
    protected Composite createPageContents(Composite parent) {
                    } else {
                    toe4.setDataType(refDataType);
        // Here is a trick - we need to find schema/catalog container node and list its children
        }
    private void handleRefTableSelect(DBNDatabaseNode refTableNode) {
                                }
                final Combo onDeleteCombo = UIUtils.createLabelCombo(cascadeGroup, ObjectEditorMessages.dialog_struct_edit_fk_combo_on_delete, SWT.DROP_DOWN | SWT.READ_ONLY);
            }
                    item.setImage(2, DBeaverIcons.getImage(DBIcon.TYPE_UNKNOWN));
    }
    private Image getColumnIcon(DBSEntityAttribute column) {

                                        curConstraints.add(constraint);
                }
            final Composite cascadeGroup = UIUtils.createComposite(settingsPanel, 4);
        } else {
import org.eclipse.jface.viewers.Viewer;
            FKColumnInfo fkInfo = (FKColumnInfo) item.getData();
    private FKType[] allowedKeyTypes = new FKType[]{FK_TYPE_PHYSICAL};
                                        !isConstraintIndex(monitor, curConstraints, index) &&
            tableEditor.grabHorizontal = true;
 * Unless required by applicable law or agreed to in writing, software

                                    return (T) attr;
            }
                    return ((DBNDatabaseNode) element).getNodeDisplayName();
            virtualFK,
 * You may obtain a copy of the License at
            DBWorkbench.getPlatformUI().showError(ObjectEditorMessages.dialog_struct_edit_fk_error_load_constraints_title,
            setImageDescriptor(DBeaverIcons.getImageDescriptor(ownerTableNode.getNodeIcon()));
        }
                ObjectEditorMessages.dialog_struct_edit_fk_error_load_constraint_columns_title,
            });
        } else {
        if ((curConstraints.isEmpty() || ukSelectionIndex < 0) && !enableCustomKeys) {
                    if (pkAttribute == null) {
        if (schemaNode.getMeta() == tableContainerMeta) {
                        if (refTable instanceof DBSTable dbsTable) {
            if (!allContainers.isEmpty()) {
            }
    private static final FKType FK_TYPE_PHYSICAL = new FKType("Physical", true);
            }
                onUpdateCombo.select(0);
        } catch (InvocationTargetException e) {
    private void handleUniqueKeySelect() {
                continue;
                tablesNode,
        return supportsCustomName;
        }
                if (ownerContainerNode == null) {
        }
            } catch (DBException e) {
            DBEStructEditor<?> entityEditor = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
import java.util.List;
        virtualFK.setAttributes(columns);
        }

                } else {
import org.eclipse.jface.viewers.ViewerFilter;
                            if (newColumn instanceof DBSEntityAttribute attr) {
        private final Table columnsTable;
            }


        DBVEntity vRefEntity = DBVUtils.getVirtualEntity(curRefTable, true);
        if (refTableNode != null) {
                } catch (Throwable e) {
            tableList.getViewer().addSelectionChangedListener(
                    DBSEntityAttributeRef pkColumn = attributeReferences.get(i);
    }
        setErrorMessage(errorMessage);
                if (constraint instanceof DBVEntityConstraint) {
        @Nullable DBSEntity refEntity,
            }
            gd.heightHint = 100;
            schemaCombo.addSelectionListener(new SelectionAdapter() {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
                ownerTableNode.getNodeDisplayName()));
                uniqueKeyCombo.select(0);
                    FKColumnInfo fki = getSelectedColumnInfo();
                        vUniqueKey.addAttribute(refAttr.getName());

                enableCurConstraintEdit();
    private static final String NEW_COLUMN_LABEL = "<new>";
 * EditForeignKeyPage
                }

            // Constraint must include ref attributes
            pkc.setVisible(pkVisible);
            String fkAutoName = SQLForeignKeyManager.generateConstraintName((DBSEntity) ownerTableNode.getObject(), curConstraint);
                        }
    public List<FKColumnInfo> getColumns() {
            uniqueKeyCombo = UIUtils.createLabelCombo(pkGroup, ObjectEditorMessages.dialog_struct_edit_fk_combo_unik, SWT.DROP_DOWN | SWT.READ_ONLY);
                        containerObject = null;
                try {
        } catch (InterruptedException e) {
        private void handleColumnClick(MouseEvent e) {
        }


        FKType(String name, boolean physical) {
        FKColumnOptionsDialog dialog = new FKColumnOptionsDialog(getShell(), fkColumnInfo);
            }
        if (srcAttributes != null) {
                });
                log.debug(e1);
                    Button keyTypeButton = UIUtils.createRadioButton(ktPanel, type.getName(), type, new SelectionAdapter() {
                    DBVEntity vRefEntity = DBVUtils.getVirtualEntity(curRefTable, true);
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
            constraint.setAttributes(page.getSelectedAttributes());
                        } else {
        final DBSEntityAttribute refColumn;
            this.name = name;
                @Override
        }
import org.jkiss.dbeaver.ui.controls.ObjectContainerSelectorPanel;
                curRefTable = (DBSEntity) refTableNode.getObject();
                @Override
                            }
    public void createControl(Composite parent) {
                @Override
                log.error("Error getting real object container", e);
        if (fkNameText != null) {
                    if (columnsCombo.getSelectionIndex() >= 0) {
            enableCurConstraintEdit();
                    if (!CommonUtils.isEmpty(sourceAttributes) && sourceAttributes.size() > i) {
                } else if (newColumn instanceof DBSTypedObjectExt3 toe3) {

                                setErrorMessage(e.getTargetException().getMessage());
                curConstraint = curConstraints.getFirst();
                    }
                        }
            tableEditor.setEditor(columnsCombo, item, 0);
        if (ownerTableNode != null) {
    }
            while (containerNode instanceof DBNDatabaseFolder) {
                }
                return ownerContainerNode = getNodeByContainerObject(containerObject);
        if (refEntity != null) {
        }
                            return super.hasChildren(parent);
            ObjectEditorMessages.edit_foreign_key_page_create_container_reference_table_container,
    private DBSForeignKeyModifyRule onUpdateRule;
                for (Class<?> childType : entityEditor.getChildTypes()) {
