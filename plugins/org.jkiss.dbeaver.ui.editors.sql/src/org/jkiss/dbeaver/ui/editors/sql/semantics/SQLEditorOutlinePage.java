            @NotNull Class<? extends SQLQueryRowsSetOperationModel> type,
        }
                    : columnNames.stream().map(SQLQuerySymbolEntry::getName).collect(Collectors.joining(", ", "(", ")"));
            return null;
                String columns = columnNames == null
            OutlineQueryNode node = new OutlineQueryNode(parent, model, kind, text, styler, extraText, icon, childModels);

    private class OutlineRefreshJob {
        @Nullable
        public Object visitRowsCorrelatedSource(@NotNull SQLQueryRowsCorrelatedSourceModel correlated, @NotNull OutlineQueryNode node) {
                            updateStatement.getWhereClause(),
        put(SQLQuerySymbolClass.FUNCTION, ThemeConstants.SQL_EDITOR_COLOR_FUNCTION);
                node,
            @Nullable String extraText,
            @NotNull SQLQueryNodeModel model,
                    DBIcon.TREE_COLUMNS, projection.getResult()
        }
            @NotNull SQLQueryNodeModel... childModels
            this.extraText = extraText;
                    currentSelectionSyncOp = SelectionSyncOperation.TO_EDITOR;
        public String getExtraText() {
        put(SQLQuerySymbolClass.COLUMN, ThemeConstants.SQL_EDITOR_COLOR_COLUMN);
            @NotNull String text,

            }
            this.makeNode(
import org.jkiss.utils.CommonUtils;
            @Override
        public OutlineQueryNode(

                        for (SQLQueryUpdateSetClauseModel setClause : updateStatement.getSetClauseList()) {
                }
                // TODO add separate FROM node when Multi-Table Deletes would be supported

                if (targetsList != null) {
            String nodeName = "CREATE TABLE " + (tableName == null ? SQLConstants.QUESTION : tableName.getNameString());
            String text;
                }
import java.util.stream.Stream;
                    treeViewer.refresh();
                result.add(op.getRight());
                tableValue,
                    nodeName,
    public void selectionChanged(@NotNull SelectionChangedEvent event) {
        }
        private OutlineQueryNode makeNode(
                    .filter(Objects::nonNull)
            return null;
        }
        ) {
        this.rootNodes = List.of(this.scriptNode = new OutlineScriptNode());

        }
        @Override
            int offset = event.caretOffset;
                prefix + correlated.getAlias().getRawName() + suffix,
                    : insertStatement.getTableModel().getName().getNameString();
                        SQLConstants.KEYWORD_HAVING,
                        this.makeNode(
                        node,
            // the outline state changes to the response of the editor event asynchronously, so their lifetimes are a little bit different
        @Override
                if (this.documentContext == null || editor.getSyntaxContext() != this.documentContext) {
        private final OutlineNode analysisDisabledNode = new OutlineInfoNode(
            return this.obtainChildren().size();
        }

                }
        private final String title;
        public Object visitSelectionModel(@NotNull SQLQueryModel selection, @NotNull OutlineQueryNode node) {
    @NotNull
            return obtainExprTypeIcon(expr.getValueType());
import java.util.*;
            }
            }
        NONE, FROM_EDITOR, TO_EDITOR
        }
        }
                }
            return null;
            DBPImage icon = this.obtainExprTypeIcon(memberRefExpr);
                    ? DBValueFormatting.getTypeImage(type.getTypedDbObject())

        @NotNull
        public Object visitValueFlatExpr(@NotNull SQLQueryValueFlattenedExpression flattenedExpr, @NotNull OutlineQueryNode node) {
                    }
     * Outline-specific nodes classification
        }
        put(SQLQuerySymbolClass.DBEAVER_COMMAND, ThemeConstants.SQL_EDITOR_COLOR_COMMAND);
                if (this.childModels.length == 0) {
                .map(SQLQuerySymbolEntry::getRawName)
                }
        int queryOriginalLength = queryOriginalText.length();
        }
                    Stream.of(alterTable.getTargetTable()),
            @NotNull SQLQueryNodeModel... childModels
            );
                if (this.outlineImage != null) {
        @NotNull
                    this.outlineImage.dispose();
            String nodeText = prepareQueryPreview(columnConstraintSpec.getSyntaxNode().getTextContent());
        @NotNull
            
                correspondingOp,
                        );
        @Override


            OutlineNode node = scriptNode;
    private final List<OutlineNode> rootNodes;
                node,
                                .map(s -> s == null ? "..." : s.getName())
            switch (node.kind) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
import java.util.function.BiConsumer;
            this.makeNode(node, indexingExpr, text, extraText, icon, indexingExpr.getMemberOwner());
                boolean doUpdateElements = updateElements.getAndSet(false);
            SQLQueryExprType.UNKNOWN, DBIcon.TYPE_UNKNOWN,
                text = SQLConstants.QUESTION;

                        ? table.getName().getNameString()

        }
    @NotNull


                    this.obtainExprTypeIcon(column.type)
    }
            if (op.getRight() != null) {
        public Object visitAlterTableAction(@NotNull SQLQueryTableAlterActionSpec actionSpec, OutlineQueryNode node) {
        }
        SQLEditorHandlerToggleOutlineView.refreshCommandState(editor.getSite());
            } else {
                        updateStatement.getTargetRows(),
                    insertStatement.getTableModel(),
            DBPImage icon = this.obtainExprTypeIcon(indexingExpr);
                            SQLConstants.KEYWORD_FROM,
 *
        @Nullable
            return null;
        private final String text;
        @Nullable

                treeViewer.setInput(editor.getEditorInput());
        }
    @NotNull
        @NotNull
                    this.makeNode(
        public void dispose() {
            @NotNull Predicate<T> predicate,
                }
            }
        }
            SQLQueryExprType.NUMERIC, DBIcon.TYPE_NUMBER,
        @Override
        @Override
            super(null);
                text = valueRefExpr.getName() != null ? valueRefExpr.getName().getNameString() : SQLConstants.QUESTION;
        @Nullable
                    this.makeNode(
                this.makeNode(
            if (element instanceof OutlineNode node) {
                scriptElement.getQueryModel(),
                icon = DBIcon.TYPE_UNKNOWN;

import org.eclipse.swt.graphics.Image;
        }
            }
                DBIcon.TREE_TABLE_LINK,
                        : "...";
        }
        }
        ) {
import org.jkiss.dbeaver.ui.AbstractUIJob;

                }
package org.jkiss.dbeaver.ui.editors.sql.semantics;
                    String nodeName = SQLConstants.KEYWORD_UPDATE + " " + targetTableName + " " + SQLConstants.KEYWORD_SET + " " + columns;
            );
        @NotNull

     */
                if (mayBeColumnName != null) {
                refreshJob.schedule(true);
                }
        @Nullable
                    deleteStatement.getAliasedTableModel() != null
    }
                        );
            String nodeText = prepareQueryPreview(actionSpec.getSyntaxNode().getTextContent());
        @Override
        private final OutlineNode noElementsNode = new OutlineInfoNode(
import org.jkiss.dbeaver.model.sql.semantics.model.select.*;
        );
        ) {
                } /* do nothing */

                dropStatement,
        }
        @Nullable
            SQLQueryRowsDataContext rowsData = rowsSource == null ? null : rowsSource.getRowsDataContext();

    }
                case UPDATE_SUBROOT: {
            return icon == null ? null : DBeaverIcons.getImage(icon, false);
        @Override
            return null;
        @Override
 * limitations under the License.
        }
                if (projection.getHavingClause() != null) {
                if (projection.getGroupByClause() != null) {
        @Override
                    .collect(Collectors.joining(", ", "(", ")"));
    }
                    scriptNode.updateChildren();
            return null;
            SQLQueryRowsSourceModel rowsSource = tupleSpec.getTupleSource();
            this.makeNode(node, memberRefExpr, text, extraText, icon, memberRefExpr.getMemberOwner());
        public void removeListener(@Nullable ILabelProviderListener listener) {

            @Override
        }
            );

    private TreeViewer treeViewer;
        }
            } else {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        @Nullable
        @Override
            String extraText = this.obtainExprTypeNameString(indexingExpr);
                        this.documentContext.removeListener(this.syntaxContextListener);
            this.offset = offset;
        @NotNull
                    .collect(Collectors.joining(", "));


        @Nullable
        public Object visitRowsCteSubquery(@NotNull SQLQueryRowsCteSubqueryModel cteSubquery, @NotNull OutlineQueryNode node) {

        private final AtomicBoolean updateElements = new AtomicBoolean(false);
                ? DBIcon.TYPE_UNKNOWN

        PROJECTION_SUBROOT,
        }
        @Nullable
        @Override
        @Nullable
        public void dispose() {
                                .map(SQLQueryValueExpression::getColumnNameIfTrivialExpression)
        }
        private static final Map<SQLQueryExprType, DBIcon> wellKnownTypeIcons = Map.of(
        @NotNull
        @Override
        @Override
            return new Region(this.offset, 0);
        }
        protected DBPImage getIcon() {
        public void inputDocumentAboutToBeChanged(IDocument oldInput, IDocument newInput) {
                    result.setStyle(0, text.length(), styler);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

            @NotNull OutlineQueryNode node,
                objectReference,
            this.updateElements.set(updateElements);
        }
                    );
        public Object visitCallStatement(@NotNull SQLQueryCallModel callStatement, OutlineQueryNode node) {
            this.text = text;
                        projection.getOrderByClause(),
        private void updateChildren() {
                        String suffix = naturalJoin.getColumnsToJoin().stream()
                while (def instanceof SQLQuerySymbolEntry s && s != s.getDefinition()) {
                dropStatement.getTables().toArray(SQLQueryRowsTableDataModel[]::new)
            String typeName = type == null || type == SQLQueryExprType.UNKNOWN ? null : type.getDisplayName();
                    this.makeNode(
                case BATCH_VARIABLE -> UIIcon.SQL_VARIABLE2;
                this.outlineImage.dispose();
    
        public Object visitValueTypeCastExpr(@NotNull SQLQueryValueTypeCastExpression typeCastExpr, @NotNull OutlineQueryNode node) {
            if (columnName != null) {
        @NotNull
            @NotNull SQLQueryUpdateSetClauseModel setClause,
    }
                StyledString.Styler styler = stylerBySymbolClass.get(column.symbol.getSymbolClass());
            this.icon = icon;
import org.eclipse.ui.part.WorkbenchPart;
                    }
        @Nullable
    private final CaretListener caretListener = event -> {
    }
        this.treeViewer.setAutoExpandLevel(3);
        }
                    : wellKnownTypeIcons.getOrDefault(type, DBIcon.TYPE_UNKNOWN);
        put(SQLQuerySymbolClass.COMPOSITE_FIELD, ThemeConstants.SQL_EDITOR_COLOR_COMPOSITE_FIELD);
        @Override
            this.makeNode(node, cteSubquery, text, DBIcon.TREE_TABLE_LINK, children);
            List<SQLQueryResultColumn> tupleColumns = rowsData != null ? rowsData.getColumnsList() : Collections.emptyList();
                }
            this.title = title;
                x -> x.getKind().equals(correspondingOp.getKind()), (x, l) -> { /*do nothing*/ });
        }
     */
            }
    private enum OutlineQueryNodeKind {
        public StyledString getStyledText(@NotNull Object element) {
                    for (SQLQueryNodeModel childModel : childModels) {
        put(SQLQuerySymbolClass.COLUMN_DERIVED, ThemeConstants.SQL_EDITOR_COLOR_COLUMN_DERIVED);
                        node,
                result.append(text);
            this.makeNode(arg, command, command.getCommandText(), UIIcon.SQL_CONSOLE, command.getVariables());
    private static final String LABEL_PROPERTY_KEY = "LABEL";
                    .collect(Collectors.toMap(
        @Nullable
        @NotNull
    private String prepareQueryPreview(@NotNull SQLDocumentScriptItemSyntaxContext scriptElement) {
            @Override
        }
        }
    }};
                            updateStatement,
            @NotNull SQLQueryValueColumnReferenceExpression columnRefExpr,
            @NotNull String text,
        @NotNull
        @Override
            this.makeNode(node, tupleRefExpr, tableName.getNameString(), extraText, icon);
            };
                        this.makeNode(

                    }
            this.makeNode(node, subqueryExpr, "Scalar subquery", UIIcon.FILTER_VALUE, subqueryExpr.getSource());
        public OutlineNode getChild(int index) {
        }
                List<SQLQuerySymbolEntry> columnNames = insertStatement.getColumnNames();
        @Override
                            updateStatement.getSourceRows(),
        DELETE_SUBROOT,
                correlated.getSource()
        @Nullable
    public void createControl(@NotNull Composite parent) {
        public Object visitSelectCompleteTupleSpec(@NotNull SQLQuerySelectionResultCompleteTupleSpec completeTupleSpec, @NotNull OutlineQueryNode arg) {
                node,
        this.treeViewer = super.getTreeViewer();
        public Object visitTableStatementInsert(@NotNull SQLQueryInsertModel insertStatement, @NotNull OutlineQueryNode node) {
        if (result.length() < queryOriginalLength) {
                    nodeName,
                    projection.getFromSource()

                    this.documentContext = editor.getSyntaxContext();
                    result.append(extra);
        private SQLDocumentSyntaxContext documentContext;
        }
                node,
        @Nullable
        @SuppressWarnings("unchecked")
import org.eclipse.swt.SWT;

    private final SQLOutlineNodeBuilder currentNodeBuilder = new SQLOutlineNodeFullBuilder();
            public void updateChildCount(@NotNull Object element, int currentChildCount) {
        @Nullable
                }
        public Object visitRowsProjection(@NotNull SQLQueryRowsProjectionModel projection, @NotNull OutlineQueryNode node) {
        private OutlineQueryNode makeNode(
        @Override

            SQLQuerySymbolClass symbolClass = model.getAssociatedSymbolClass();
            return null;
                tupleSpec.getTableName().getNameString() + SQLConstants.DOT + SQLConstants.ASTERISK,
                    this.makeNode(
            DBPImage icon = tableData.getReferencedSource() != null ? DBIcon.TREE_TABLE_LINK : DBValueFormatting.getObjectImage(table);

            return null;
            super(parentNode);
        @Nullable
            DBPImage icon;
        }
            );

                    );
                        node,
    private String prepareQueryPreview(@NotNull String queryOriginalText) {
        @Nullable
        @Nullable
}
                        SQLConstants.KEYWORD_GROUP_BY,
                    UIIcon.ROW_DELETE,
                    throw new IllegalStateException(); // should never happen
import org.jkiss.dbeaver.ui.controls.resultset.ThemeConstants;
        }
        public int getChildrenCount() {
            return null;

 * DBeaver - Universal Database Manager
        });
                    } else {
        @NotNull
                nameString + argsString,
            this.makeNode(node, constExpr, constExpr.getValueString(), extraText, icon);
            return null;
            selectionResult.getSublists().forEach(s -> s.apply(this, node));
        @Nullable
        @Override
            this.makeNode(
            return null;
                        .substring(columnSpec.getInterval().a, columnSpec.getInterval().b + 1);
        ) {
                case Job.WAITING, Job.SLEEPING -> this.job.cancel();
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
            this.makeNode(arg, completeTupleSpec, SQLConstants.ASTERISK, UIIcon.ASTERISK);
        private final StyledString.Styler textStyler;

                if (projection.getWhereClause() != null) {

                    );
                        UIIcon.ROW_EDIT,
            }
        @NotNull
            @Nullable StyledString.Styler textStyler,
            Image image = editor.getTitleImage();
                dropStatement.getObject()
            private void updateChildNode(@NotNull Object parent, int index, OutlineNode childNode) {
        @NotNull
            public Object getParent(@NotNull Object element) {
        @Override
        private Object visitRowsProjectionImpl(
            @Nullable String extraText,
        }
        return result.toString();
        @NotNull
                }
        }
                    Stream.of(columnSpec.getDefaultValueExpression()),
        @Override
                            setClause.targets.stream()
                            updateStatement.getOrderByClause()

                extraText = this.obtainExprTypeNameString(columnRefExpr);

            this.makeNode(
            if (documentContext != null) {
            } else {

import org.eclipse.core.runtime.IStatus;
            return editor.getTitle();
                        (a, b) -> a, LinkedHashMap::new)
                + (dropStatement.getIfExists() ? " IF EXISTS " : " ") + tableNames;
            this.job.schedule(500);
import org.eclipse.swt.custom.CaretListener;
        @Nullable
    public void refresh() {
            @NotNull T op,
            String nodeText = prepareQueryPreview(tableConstraintSpec.getSyntaxNode().getTextContent());
    }};
                children.toArray(SQLQueryNodeModel[]::new)
import org.jkiss.dbeaver.model.sql.SQLConstants;
            return null;
                }
        public OutlineNode(@Nullable OutlineNode parentNode) {

        }
        public Object visitObjectStatementDrop(@NotNull SQLQueryObjectDropModel dropStatement, OutlineQueryNode node) {
            if (node.kind == OutlineQueryNodeKind.DELETE_SUBROOT) {
                        deleteStatement.getCondition(),
                        UIIcon.SORT,
            return null;
        @Override
            }
            }
                StyledString.Styler styler = node.getTextStyler();
                ));
            return null;
        @NotNull

                            DBIcon.TREE_FOLDER_TABLE,

            String nodeText = prepareQueryPreview(alterTable.getSyntaxNode().getTextContent());
                    if (updateStatement.getOrderByClause() != null) {
        public final OutlineNode getParent() {
        public Object visitRowsNaturalJoin(@NotNull SQLQueryRowsNaturalJoinModel naturalJoin, @NotNull OutlineQueryNode node) {
    }
        super.dispose();
        @Override
    private static final EnumMap<SQLQuerySymbolClass, String> registryStyleBySymbolClass = new EnumMap<>(SQLQuerySymbolClass.class) {{
        }
        protected abstract DBPImage getIcon();
            this.makeNode(
                        UIIcon.FILTER,
                    insertStatement.getValuesRows().apply(this, node);
            @Override
    }
                node, actionSpec, nodeText, DBIcon.TREE_CONSTRAINT,
    private enum SelectionSyncOperation {
            if (node.kind == OutlineQueryNodeKind.PROJECTION_SUBROOT || node instanceof OutlineScriptElementNode) {
            @NotNull OutlineQueryNodeKind kind,
    private OutlineScriptElementNode getScriptElementNode(@NotNull OutlineQueryNode node) {
        }
    /**
            StyledString.Styler styler = symbolClass ==  null ? null : stylerBySymbolClass.get(symbolClass);
            nodes.addAll(setClause.sources);
            return null;
        }
                    }
                        this.documentContext.addListener(this.syntaxContextListener);
        @NotNull
                }
        @Nullable
            DBIcon.SMALL_INFO
        protected DBIcon getIcon() {
                        path.add(child);
        put(SQLQuerySymbolClass.DBEAVER_PARAMETER, ThemeConstants.SQL_EDITOR_COLOR_PARAMETER);
                            node,
        @Override

        ) {
                );
            }
                            UIIcon.FILTER,
                if (this.elements.isEmpty()) {
        public Object visitValueVariableExpr(@NotNull SQLQueryValueVariableExpression varExpr, @NotNull OutlineQueryNode node) {
            DBPImage icon = this.obtainExprTypeIcon(tupleRefExpr);
                    if (updateStatement.getWhereClause() != null) {
        public Object visitCommand(@NotNull SQLCommandModel command, OutlineQueryNode arg) {
        @Override
                    parentNode.getTextRange().getOffset();
            }
public class SQLEditorOutlinePage extends ContentOutlinePage implements IContentOutlinePage {
                treeViewer.getTree().setRedraw(true);
        public OutlineInfoNode(@NotNull OutlineNode parentNode, @NotNull String title, @NotNull DBIcon icon) {
        }
        @Override
                        if (childModel != null) {
                    ? SQLConstants.QUESTION
        public IRegion getTextRange() {
        if (textViewer != null) {
            return null;
        private List<OutlineNode> children;
            String text = prepareQueryPreview(memberRefExpr.getExprContent());
                UIIcon.REMOVE,


        }
                    if (updateStatement.getSetClauseList() != null) {
            action.accept(op, result);
                        this.makeNode(node, naturalJoin.getCondition(), SQLConstants.KEYWORD_ON + " ", DBIcon.TREE_UNIQUE_KEY, naturalJoin.getCondition());
    }

                            SQLConstants.KEYWORD_WHERE,
        private final SQLDocumentScriptItemSyntaxContext scriptElement;
                refreshJob.schedule(true);
    private static final EnumMap<SQLQuerySymbolClass, StyledString.Styler> stylerBySymbolClass = new EnumMap<>(SQLQuerySymbolClass.class) {{

            SQLQueryExprType.STRING, DBIcon.TYPE_STRING,
    
                        OutlineQueryNodeKind.UPDATE_SUBROOT,

        }
        public Object visitValueIndexingExpr(@NotNull SQLQueryValueIndexingExpression indexingExpr, @NotNull OutlineQueryNode node) {
            SQLQuerySymbol columnName = valueRefExpr.getColumnNameIfTrivialExpression();
            DBPImage icon = this.getIcon();
                if (extra != null) {
            SQLQueryObjectDataModel obj = callStatement.getObject();
                    );
    private class OutlineScriptElementNode extends OutlineQueryNode {
        public OutlineNode getChild(int index) {
            return null;
                default ->
        public OutlineScriptNode() {
        @Nullable
        @Override
    @Override
        }
        public String getText() {
                if (textRange != null) {
            if (type.isInstance(left) && predicate.test((T) left)) {
        public Object visitRowsCrossJoin(@NotNull SQLQueryRowsCrossJoinModel crossJoin, @NotNull OutlineQueryNode node) {
        @Nullable
            this.childModels = childModels;
        public OutlineScriptElementNode(
            String nameString = funcExpr.getProcName() == null ? "?" : funcExpr.getProcName().getNameString();
            @NotNull SQLQueryRowsSetCorrespondingOperationModel correspondingOp,
        public abstract String getText();
        public Object visitRowsTableProc(@NotNull SQLQueryRowsTableProcModel tableProc, @NotNull OutlineQueryNode node) {
            List<SQLQueryNodeModel> children = this.flattenRowSetsCombination(crossJoin, x -> true, (x, l) -> { /* do nothing*/ });
            return null;
        @Nullable
            @NotNull OutlineQueryNode parent,
        @Override
        ) {
        @Override
            List<SQLQuerySymbolEntry> columnNames = correlated.getCorrelationColumNames();

            return this.icon;
            this.makeNode(node, setClause, setClause.contents, DBIcon.TYPE_ARRAY, nodes.toArray(SQLQueryNodeModel[]::new));
            treeViewer.update(this.scriptNode, new String[] { LABEL_PROPERTY_KEY });
                String extra = node.getExtraText(); 
                    throw new IllegalStateException(); // should never happen
            @NotNull OutlineQueryNode parent,
                ).toArray(SQLQueryNodeModel[]::new)
            @NotNull SQLQueryNodeModel model,
    private interface SQLOutlineNodeBuilder extends SQLQueryNodeModelVisitor<OutlineQueryNode, Object> {
        @Override
        ) {
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
            this.makeNode(node, tableConstraintSpec, nodeText, DBIcon.TREE_CONSTRAINT);
                        deleteStatement.getCondition()
            @NotNull BiConsumer<T, List<SQLQueryNodeModel>> action
            }
        put(SQLQuerySymbolClass.CATALOG, ThemeConstants.SQL_EDITOR_COLOR_SCHEMA);
        @NotNull
            @NotNull DBPImage icon,

        @Override

            @NotNull SQLQueryNodeModel model,
            this.parentNode = parentNode;
                parentNode instanceof OutlineQueryNode queryNode ?
        @Nullable
    }
            if (this.children == null) {


            this.textRange = new Region(offset, this.model.getInterval().length());
        @Override
                        flattenedExpr.getOperands().toArray(SQLQueryNodeModel[]::new)
                extraText = null;
                            .collect(Collectors.joining(", ", "(", ")"));
            SQLQueryNodeModel[] subnodes = Stream.of(mayBeExpr).filter(Objects::nonNull).toArray(SQLQueryNodeModel[]::new);
        this.editor = editor;
                text = alias.getRawName();
        @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Override
        @Override
    }
                return element instanceof OutlineNode node ? node.getParent() : null;

                case 0 -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                );
                    );
        }
        int queryPreviewLength = Math.min(queryOriginalLength, SQL_QUERY_ORIGINAL_TEXT_PREVIEW_LENGTH);
            SQLQueryValueExpression mayBeExpr = columnSpec.getValueExpression();
            String text = prepareQueryPreview(indexingExpr.getExprContent());
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        @Override
            textViewer.getTextWidget().removeCaretListener(this.caretListener);
                break;
            }

        }
            return null;
        }
    public void dispose() {
        private String obtainExprTypeNameString(@Nullable SQLQueryExprType type) {
                refreshJob.schedule(true);
        if (propId == WorkbenchPart.PROP_TITLE) {

        public Object visitValueTupleRefExpr(@NotNull SQLQueryValueTupleReferenceExpression tupleRefExpr, @NotNull OutlineQueryNode node) {
        @Nullable
                nodeName,
            }
            StyledString result = new StyledString();

                    List<SQLQueryNodeModel> children = this.flattenRowSetsCombination(naturalJoin, x -> true, (x, l) -> l.add(x));
        public Object visitValueSubqueryExpr(@NotNull SQLQueryValueSubqueryExpression subqueryExpr, @NotNull OutlineQueryNode node) {
            String argsString = funcExpr.getOperands().isEmpty() ? "()" : "(...)";
        public abstract OutlineNode getChild(int index);

                    if (doUpdateElements) {
                        e -> new OutlineScriptElementNode(this, e.offset, e.item),
 * You may obtain a copy of the License at
import java.util.function.Predicate;

                currentSelectionSyncOp = SelectionSyncOperation.FROM_EDITOR;
            super(
            String extraText = this.obtainExprTypeNameString(memberRefExpr);

        public OutlineNode getChild(int index) {
            this.makeNode(
        @Nullable
            path.add(node);
import java.util.stream.Collectors;
                if (projection.getOrderByClause() != null) {
                    if (naturalJoin.getCondition() != null) {

            if (event.getSelection() instanceof IStructuredSelection selection && selection.getFirstElement() instanceof OutlineNode node) {
                        e -> e.item,
            return null;
        throw new IllegalStateException();
                    }
        }
            }
    @Nullable
            return result;
            this.makeNode(
                + " " + (dropStatement.getIfExists() ? "IF EXISTS " : " ") + procName;
import org.jkiss.dbeaver.model.*;
                scriptElement.getQueryModel()
                    UIIcon.ROW_ADD,
                }
            String nodeName =  "DROP " + (dropStatement.isView() ? "VIEW" : "TABLE")
            }
                } else {
        @Override
                } else {
            String text = cteSubquery.subqueryName == null ? SQLConstants.QUESTION : cteSubquery.subqueryName.getRawName();
/*
        };
        @Nullable
            @NotNull DBPImage icon,
        }
        @Override
        super.createControl(parent);
            return this.extraText;
import org.eclipse.core.runtime.jobs.Job;
        public IRegion getTextRange() {
        UPDATE_SUBROOT
                return e;
            this.makeNode(node, cte, "CTE", DBIcon.TREE_FOLDER_LINK, cte.getAllQueries().toArray(SQLQueryRowsSourceModel[]::new));
        if (currentSelectionSyncOp == SelectionSyncOperation.NONE) {
        @Nullable
        public void schedule(boolean updateElements) {
            String text = table == null
            return null;

        public Object visitValueMemberReferenceExpr(@NotNull SQLQueryValueMemberExpression memberRefExpr, @NotNull OutlineQueryNode node) {

        NATURAL_JOIN_SUBROOT,
        @Override
        public Object visitValueFunctionExpr(@NotNull SQLQueryValueFunctionExpression funcExpr, OutlineQueryNode node) {
                    def = s.getDefinition();
                String text = prepareQueryPreview(projection.getSyntaxNode().getTextContent());
    private final IPropertyListener editorPropertyListener = (Object source, int propId) -> {
            return null;
                            SQLConstants.KEYWORD_ORDER_BY,
        @NotNull

    @Override
                String nodeName = SQLConstants.KEYWORD_DELETE + " " + SQLConstants.KEYWORD_FROM + " " + tableName;
        
            if (editor.isAdvancedHighlightingEnabled() && SQLEditorUtils.isSQLSyntaxParserEnabled(editor.getEditorInput())) {
            } else {
                case CLIENT_PARAMETER -> UIIcon.SQL_PARAMETER;
                Stream.concat(


                    deleteStatement,
        @Override
            protected IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
        }
            return element instanceof OutlineNode node ? node.getText() : element.toString();
        }
            return null;
        @Override
import org.eclipse.ui.IPropertyListener;
            @Nullable String extraText,
        }
            }
        }

        }
        while (n != null) {
        }
                node,
                Stream.concat(createTable.getColumns().stream(), createTable.getConstraints().stream()).toArray(SQLQueryNodeModel[]::new)
            return this.text;
                    : "";
            return this.textStyler;
    }
        ) {
        SQLEditorHandlerToggleOutlineView.refreshCommandState(editor.getSite());
        }
            if (editor.isAdvancedHighlightingEnabled() && SQLEditorUtils.isSQLSyntaxParserEnabled(editor.getEditorInput())) {
        public Object visitTableStatementUpdate(@NotNull SQLQueryUpdateModel updateStatement, @NotNull OutlineQueryNode node) {
            );

        private final OutlineNode parentNode;
            SQLQueryRowsSourceModel left = op.getLeft();
                        this.makeNode(
                } else {
                        projection.getOrderByClause()
    private final SQLEditorBase editor;
                arg,
                    this.children = Collections.emptyList();
                while (def instanceof SQLQuerySymbolEntry s && s != s.getDefinition()) {
        @Nullable
                funcExpr,
        @Override
                IRegion textRange = node.getTextRange();
                        this.makeNode(
                if (treeViewer != null && !treeViewer.getTree().isDisposed()) {
                text = SQLConstants.QUESTION;
        @Override
    @NotNull
        }
        }
        @NotNull
            targetsList.getTargetNodes().forEach(t -> t.apply(this, arg));
        @Override
                    );
            String procName = dropStatement.getObject() == null ? SQLConstants.QUESTION : dropStatement.getObject().getName().getNameString();

        private Map<SQLDocumentScriptItemSyntaxContext, OutlineNode> elements = new HashMap<>();

        @Nullable
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                        prepareQueryPreview(flattenedExpr.getExprContent()),
                } else {
                .collect(Collectors.joining(", ", " (", ")"));
            DBPImage icon = switch (varExpr.getKind()) {
                                .forEach(targetNames::add);
                case CLIENT_VARIABLE -> UIIcon.SQL_PARAMETER;
            }
        return super.getTreeStyle() | SWT.FULL_SELECTION | SWT.VIRTUAL;
        @NotNull
                : dropStatement.getTables().stream()
            return this.outlineImage;

        }
                correlated,
        private <T extends SQLQueryRowsSetOperationModel> void flattenRowSetsCombinationImpl(
    @NotNull
                    .map(SQLQueryComplexName::getNameString)

                this.makeNode(
                } else if (parent instanceof OutlineNode node) {
    @NotNull
    

                : type.getTypedDbObject() != null
            if (this.outlineImage != null && !this.outlineImage.isDisposed()) {
        public abstract IRegion getTextRange();
        );
                node, columnSpec, nodeText, " " + CommonUtils.notNull(columnSpec.getTypeName(), ""), DBIcon.TREE_COLUMN,
                            .map(SQLQuerySymbolEntry::getRawName)
        }
        }
                        node,

            SQLEditorMessages.sql_editor_outline_query_analysis_disabled_label,
            return type == null

        public Object visitAlterTable(@NotNull SQLQueryTableAlterModel alterTable, OutlineQueryNode node) {
            nodes.addAll(setClause.targets);
            this.makeNode(node, varExpr, prepareQueryPreview(varExpr.getRawName()), icon);
            return null;
    public SQLEditorOutlinePage(@NotNull SQLEditorBase editor) {
                }

            return this.children.size();
                    this.children = List.copyOf(this.elements.values());
        @NotNull
        DEFAULT,
        @Override
                null,
                            updateStatement.getWhereClause()
            if (alias != null) {
                }
            SQLQueryRowsSourceModel[] children = Stream.of(cteSubquery.source).filter(Objects::nonNull).toArray(SQLQueryRowsSourceModel[]::new);
                    OutlineQueryNodeKind.DELETE_SUBROOT,
        public Object visitRowsProjectionInto(@NotNull SQLQuerySelectIntoModel selectIntoStatement, @NotNull OutlineQueryNode node) {
                DBIcon.TREE_TABLE_ALIAS,
            this.makeNode(
                    }
import org.jkiss.code.Nullable;
                SQLQuerySymbolDefinition def = columnName.getDefinition();
            String extraText = mayBeExpr == null ? null : this.obtainExprTypeNameString(mayBeExpr);
        @Override
                text = columnRefExpr.getColumnName() != null ? columnRefExpr.getColumnName().getRawName() : SQLConstants.QUESTION;
        
    private static final int SQL_QUERY_ORIGINAL_TEXT_PREVIEW_LENGTH = 100;
            @NotNull OutlineScriptNode parent,
            return null;

            this.textStyler = textStyler;
        }
 *
            }
        TextViewer textViewer = this.editor.getTextViewer();
                String nodeName = SQLConstants.KEYWORD_INSERT + " " + SQLConstants.KEYWORD_INTO + " " + tableName + columns;
            }
                ? (tableData.getName() == null ? SQLConstants.QUESTION : tableData.getName().getNameString())
            @NotNull OutlineQueryNode arg
        public boolean isLabelProperty(@Nullable Object element, @Nullable String property) {
                    this.makeNode(node, projection.getWhereClause(), SQLConstants.KEYWORD_WHERE, UIIcon.FILTER, projection.getWhereClause());

import org.jkiss.dbeaver.model.sql.semantics.model.SQLCommandModel;
                icon = this.obtainExprTypeIcon(valueRefExpr);
            return this.title;


                    List<String> targetNames = new LinkedList<>();
import org.jkiss.dbeaver.model.sql.semantics.*;
        
                SQLConstants.KEYWORD_VALUES,
                extraText = this.obtainExprTypeNameString(valueRefExpr);
 *
            @Override
                default: {

            textViewer.addTextInputListener(this.textInputListener);
            OutlineQueryNode tupleNode = this.makeNode(
                );
            SQLQuerySymbol columnName = columnRefExpr.getColumnNameIfTrivialExpression();
                    alterTable.getAlterActions().stream()
        
        }
            @NotNull OutlineQueryNode parent,
            this.makeNode(
                    columnSpec.getConstraints().stream()
                        }
            DBPImage icon;
            this.makeNode(arg, variable, variable.name.getName() + " = " + variable.value, UIIcon.SQL_PARAMETER);
                    }
        public Object visitColumnConstraintSpec(@NotNull SQLQueryColumnConstraintSpec columnConstraintSpec, OutlineQueryNode node) {
            }
            return this.visitRowsProjectionImpl(selectIntoStatement, node, selectIntoStatement.getTargets());

                    DBIcon.TREE_FOLDER_TABLE,
            } else {
        private Image editorImage = null;
        }
            if (node.kind == OutlineQueryNodeKind.INSERT_SUBROOT) {
                node, createTable, nodeName, UIIcon.OBJ_ADD,
import org.eclipse.swt.widgets.Composite;
                    if (updateStatement.getSourceRows() != null) {
    private final OutlineRefreshJob refreshJob = new OutlineRefreshJob();
        }
        private OutlineQueryNode makeNode(
            for (SQLQueryResultColumn column : tupleColumns) {
            this,
        return this.prepareQueryPreview(scriptElement.getOriginalText());

        @Override
            @Override
            if (selection.getQueryModel() != null) {
                    this.updateChildNode(parent, index, node.getChild(index));
            );


        if (textViewer != null) {
            }
                    SQLConstants.KEYWORD_FROM,
                        // TODO add expression text to the ON node and remove its immediate and only child with the same text

            
                    insertStatement
            List<SQLQueryNodeModel> result = new LinkedList<>();
        public Object visitRowsTableValue(@NotNull SQLQueryRowsTableValueModel tableValue, @NotNull OutlineQueryNode node) {
            return this.offset;
            typeCastExpr.getValueExpr().apply(this, node);
                }
        ) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
            SQLQueryExprType.BOOLEAN, DBIcon.TYPE_BOOLEAN,

        }
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
            this.scriptElement = scriptElement;
        }
        @Override
    }
                        updateStatement
        }

            }
        private final int offset;
                    this.children = new ArrayList<>(childModels.length);
                    projection.getFromSource(),
            if (documentContext != null) {
                            node,
                this.documentContext.removeListener(syntaxContextListener);
import org.eclipse.core.runtime.Status;
        registryStyleBySymbolClass.forEach((k, v) -> put(k, StyledString.createColorRegistryStyler(v, null)));
                this.obtainExprTypeNameString(funcExpr),

            // separate image lifetime, because we don't have a guarantee that outline will be disposed earlier than editor
        @NotNull
            if (newInput != null) {
        this.treeViewer.setUseHashlookup(true);
                        : deleteStatement.getTableModel(),
                        SQLConstants.KEYWORD_WHERE,
        }
                }
        put(SQLQuerySymbolClass.QUOTED, ThemeConstants.SQL_EDITOR_COLOR_DATATYPE);
            );
        @Nullable
            }
 * Unless required by applicable law or agreed to in writing, software
            tableProc.getFunctionExpression().apply(this, node);
        }
        ) {
                this.children = List.of(this.analysisDisabledNode);
            return null;

                            childModel.apply(getNodeBuilder(), this);
                UIIcon.REMOVE,
            String suffix = columnNames.isEmpty() ? "" : columnNames.stream()
                        this.makeNode(node, naturalJoin, SQLConstants.KEYWORD_USING + " " + suffix, DBIcon.TREE_UNIQUE_KEY);

        private final DBIcon icon;

        }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;
        @NotNull
            return this.icon;
            }
                    this.makeNode(

        public int getOffset() {
                Stream.concat(
        @Override
                    this.updateChildNode(parent, index, rootNodes.get(index));
        }
        @Nullable
        @Nullable

import org.eclipse.jface.text.*;
        }
    private class OutlineInfoNode extends OutlineNode {
                int fragmentLength = Math.min(line.length(), queryPreviewLength - result.length());
    @NotNull
        public Image getImage() {
        }
                        scriptNode.updateElements();
        @Nullable

        private <T extends SQLQueryRowsSetOperationModel> List<SQLQueryNodeModel> flattenRowSetsCombination(
    }
            DBPImage icon = this.obtainExprTypeIcon(constExpr);
            @NotNull String text,
            @NotNull OutlineQueryNodeKind kind,
                        break;
        @Nullable

            textViewer.removeTextInputListener(this.textInputListener);
            public void onScriptItemInvalidated(@Nullable SQLDocumentScriptItemSyntaxContext item) {
                String text = node.getText();
                ).toArray(SQLQueryNodeModel[]::new)
        @Nullable
                default -> {
            String extraText;
                    String columns = targetNames.stream().collect(Collectors.joining(", ", "(", ")"));
            result.append(" ...");
                actionSpec.getColumnSpec(), actionSpec.getTableConstraintSpec()
        };
        @Nullable
        this.editor.removePropertyListener(editorPropertyListener);
            @NotNull DBPImage icon,
                        );
                    queryNode.getTextRange().getOffset() - queryNode.model.getInterval().a + this.model.getInterval().a :
    /**
            @NotNull OutlineQueryNode node
                icon = this.obtainExprTypeIcon(columnRefExpr);
        private final DBPImage icon;
        }
                            updateStatement.getOrderByClause(),
                    node,
                String suffix = projection.getRowsDataContext().getColumnsList().stream()
            return null;
        }
            }
        this.refreshJob.schedule(true);
                icon = DBIcon.TYPE_UNKNOWN;
                    .map(c -> c.symbol.getName())
            @NotNull String text,
                        }
                    OutlineQueryNodeKind.INSERT_SUBROOT,
        put(SQLQuerySymbolClass.STRING, ThemeConstants.SQL_EDITOR_COLOR_STRING);
        this.scriptNode.dispose();
        }
            this.flattenRowSetsCombinationImpl(op.getClass(), op, predicate, result, action);
        @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (obj != null) {
        private final SQLQueryNodeModel[] childModels;
                    ? ""
        public Object visitSelectColumnSpec(@NotNull SQLQuerySelectionResultColumnSpec columnSpec, @NotNull OutlineQueryNode arg) {
        public IRegion getTextRange() {
            SQLQueryComplexName tableName = tupleRefExpr.getTableName();

                    this.makeNode(
        }

            return null;
                    SQLConstants.KEYWORD_SELECT + " " + suffix,
                    tupleNode, tupleSpec, OutlineQueryNodeKind.DEFAULT, column.symbol.getName(), styler,
                    OutlineNode child = node.getChild(i);
            return null;
        @Override
        @Nullable
                this.makeNode(
    }
    private final ITextInputListener textInputListener = new ITextInputListener() {
        @Nullable
            return null;
        public Object visitRowsProjectionIntoTargetsList(
        @Override
                this.editorImage = image;

    };
            OutlineNode nextNode = scriptNode;
            SQLQuerySymbol mayBeColumnName = mayBeExpr == null ? null : mayBeExpr.getColumnNameIfTrivialExpression();
            }

        private final AbstractUIJob job = new AbstractUIJob("SQL editor outline refresh") {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
    private abstract class OutlineNode {
        TextViewer textViewer = this.editor.getTextViewer();
            return null;
        this.treeViewer.setLabelProvider(new DecoratingStyledCellLabelProvider(new SQLOutlineLabelProvider(), null, null));

        }
                nodeName,

            while (scanner.hasNextLine() && result.length() < queryPreviewLength) {

        @NotNull
        @NotNull
            } else {
            );
        @Nullable
            LinkedList<OutlineNode> path = new LinkedList<>();
        private void updateElements() {
        @Nullable
        public Object visitCommandVariable(@NotNull SQLCommandModel.VariableNode variable, OutlineQueryNode arg) {
        private final String extraText;
                    this.obtainExprTypeNameString(column.type),
            this.makeNode(node, valueRefExpr, text, extraText, icon);

import org.jkiss.dbeaver.model.sql.semantics.model.ddl.*;
        public String getText() {
            tupleNode.children = new ArrayList<>(tupleColumns.size());
                        node,
        @Nullable
                selection.getQueryModel().apply(this, node);
            // default font
        @Nullable
                        DBIcon.TREE_FUNCTION,
import org.eclipse.swt.graphics.Font;
            return makeNode(parent, model, text, null, icon, childModels);
            return null;
            return element instanceof OutlineNode node ? node.getImage() : DBeaverIcons.getImage(DBIcon.TYPE_UNKNOWN, false);
            @NotNull SQLQueryNodeModel... childModels
                treeViewer.setChildCount(childNode, childNode.getChildrenCount());
        @Override
        }
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.*;
            if (n instanceof OutlineScriptElementNode e) {
import org.jkiss.dbeaver.ui.UIIcon;
        public Object visitSelectionResult(@NotNull SQLQuerySelectionResultModel selectionResult, @NotNull OutlineQueryNode node) {
            @NotNull DBPImage icon,
    private class OutlineQueryNode extends OutlineNode {
    private static class SQLOutlineLabelProvider implements ILabelProvider, IFontProvider, IStyledLabelProvider {

                    ? (t.getName() == null ? SQLConstants.QUESTION : t.getName().getNameString()) + " " + SQLConstants.KEYWORD_AS + " "
                    if (this.documentContext != null) {

                    result.setStyle(text.length(), extra.length(), StyledString.DECORATIONS_STYLER);
 */
        @Override

        public Object visitTableConstraintSpec(@NotNull SQLQueryTableConstraintSpec tableConstraintSpec, OutlineQueryNode node) {
        public String getText() {
                SQLQuerySymbolDefinition def = columnName.getDefinition();
            return null;

            @NotNull
            public void onAllScriptItemsInvalidated() {
                arg,
                    if (range != null && range.getOffset() <= offset) {
        public Object visitValueReferenceExpr(@NotNull SQLQueryValueReferenceExpression valueRefExpr, @NotNull OutlineQueryNode node) {
        public Object visitTableStatementDelete(@NotNull SQLQueryDeleteModel deleteStatement, @NotNull OutlineQueryNode node) {
            return this.parentNode;
    };
    private OutlineScriptNode scriptNode;
            this.kind = kind;
        @Nullable
            this.makeNode(
                    deleteStatement
                        projection.getGroupByClause()
    }
                        DBIcon.TREE_FOLDER_TABLE,
            public void onScriptItemIntroduced(@Nullable SQLDocumentScriptItemSyntaxContext item) {
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
        }
                currentSelectionSyncOp = SelectionSyncOperation.NONE;
        put(SQLQuerySymbolClass.TABLE_ALIAS, ThemeConstants.SQL_EDITOR_COLOR_TABLE_ALIAS);

                return Status.OK_STATUS;
                OutlineQueryNodeKind.DEFAULT,
            this.makeNode(node, columnRefExpr, text, extraText, icon);
            this.makeNode(
        @Nullable
            switch (node.kind) {
        @Override
            return null;
                String line = scanner.nextLine().trim();
        private final OutlineQueryNodeKind kind;
                        ? deleteStatement.getAliasedTableModel()
            
    };
                treeViewer.setSelection(new StructuredSelection(node), true);
        public Image getImage(@NotNull Object element) {
 * See the License for the specific language governing permissions and
                    }
        }
            );
                        projection.getGroupByClause(),
            SQLQueryExprType.DATETIME, DBIcon.TYPE_DATETIME
                    if (this.documentContext != null) {
                        targetsList
                    .filter(Objects::nonNull)
        private final SQLQueryNodeModel model;
            @NotNull OutlineQueryNode parent,
        @Nullable
                if (deleteStatement.getCondition() != null) {
            String extraText;
        put(SQLQuerySymbolClass.RESERVED, ThemeConstants.SQL_EDITOR_COLOR_KEYWORD);

        public StyledString.Styler getTextStyler() {
            return property != null && property.equals(LABEL_PROPERTY_KEY);

import java.util.concurrent.atomic.AtomicBoolean;
            this.makeNode(node, columnConstraintSpec, nodeText, DBIcon.TREE_CONSTRAINT);
                    String targetTableName = updateStatement.getTargetRows() instanceof SQLQueryRowsTableDataModel table && table.getName() != null
            String prefix = correlated.getSource() instanceof SQLQueryRowsTableDataModel t
                    if (updateStatement.getSetClauseList() != null) {
                dropStatement,
                        targetsList,
        @NotNull
        }
            String nodeText = columnSpec.getColumnName() == null ? SQLConstants.QUESTION : columnSpec.getColumnName().getName();
        }
        @NotNull
        public IRegion getTextRange() {

                }
            );
                DBIcon.TREE_PROCEDURE,
            int offset,

        @Override
        public Object visitTableStatementDrop(@NotNull SQLQueryTableDropModel dropStatement, OutlineQueryNode node) {
        this.treeViewer.setContentProvider(new ILazyTreeContentProvider() {
            // no listeners
            if (this.editorImage != image) {
                if (insertStatement.getValuesRows() != null) {
                result.append(line, 0, fragmentLength).append(" ");
            DBIcon.SMALL_INFO
    private class OutlineScriptNode extends OutlineNode {
                            SQLConstants.KEYWORD_NATURAL_JOIN + " ", DBIcon.TREE_TABLE_LINK, children.toArray(SQLQueryNodeModel[]::new)
    @Override
        private OutlineQueryNode makeNode(
            return typeName == null ? null : (" : " + typeName);
        try (Scanner scanner = new Scanner(queryOriginalText)) {
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItemKind;
            String extraText = this.obtainExprTypeNameString(tupleRefExpr);
                String tableName = deleteStatement.getTableModel() == null || deleteStatement.getTableModel().getName() == null
        }

        public Object visitColumnSpec(@NotNull SQLQueryColumnSpec columnSpec, OutlineQueryNode node) {
    @NotNull
                        SQLConstants.KEYWORD_INTO,
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        put(SQLQuerySymbolClass.DBEAVER_VARIABLE, ThemeConstants.SQL_EDITOR_COLOR_PARAMETER);
            @Nullable SQLQuerySelectIntoModel.SQLQuerySelectIntoTargetsList targetsList
        @Nullable
        }
        INSERT_SUBROOT,
                this.elements = documentContext.getScriptItems().stream()
                }
        @Override
        @Override
            while (nextNode != null) {
    protected int getTreeStyle() {

        private String obtainExprTypeNameString(@NotNull SQLQueryValueExpression expr) {
import org.eclipse.jface.viewers.*;
            return null;
            String text;

            @NotNull OutlineQueryNode arg
            @NotNull List<SQLQueryNodeModel> result,
            }

            this.makeNode(node, tableData, text, icon);
        @Override
            @NotNull SQLDocumentScriptItemSyntaxContext scriptElement
            this.icon = icon;
            return null;
                funcExpr.getOperands().toArray(SQLQueryNodeModel[]::new)



                node,
        @Nullable
        @Nullable
        @Nullable
        }
                    .map(SQLQueryRowsTableDataModel::getName)
        public DBIcon getIcon() {
        ) {
        @Nullable

        @Nullable

        public Object visitValueConstantExpr(@NotNull SQLQueryValueConstantExpression constExpr, @NotNull OutlineQueryNode node) {
        @NotNull
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
    private SQLOutlineNodeBuilder getNodeBuilder() {
        @Override
        @Override
        @Override
            } else {
                    text = getScriptElementNode(arg).scriptElement.getOriginalText()
        private List<OutlineNode> obtainChildren() {
    private SelectionSyncOperation currentSelectionSyncOp = SelectionSyncOperation.NONE;
                if (styler != null) {
                this.outlineImage = new Image(image.getDevice(), image, SWT.IMAGE_COPY);
                    }

        ) {
    private class SQLOutlineNodeFullBuilder implements SQLOutlineNodeBuilder {
        }
            
                break;
    }
        }
                            updateStatement.getSourceRows()
            return null;

            if (node != null) {
            return 0;
        @Override
                );
        @Nullable
            return null;
        @Override
                    } else if (naturalJoin.getColumnsToJoin() != null && !naturalJoin.getColumnsToJoin().isEmpty()) {
                        node,
        this.refreshJob.schedule(true);
        }
    }
            return null;

            return null;
        

                    this.documentContext.addListener(syntaxContextListener);
        @Override
            DBSEntity table = tableData.getTable();
                : DBUtils.getObjectFullName(table, DBPEvaluationContext.DML);


        private List<OutlineNode> children = Collections.emptyList();
                    );
                objectReference.getObjectType().getImage()
            return this.obtainChildren().get(index);
            this.makeNode(
            return null;
            @NotNull Predicate<T> predicate,
            }
        @Override
            List<SQLQueryNodeModel> nodes = new ArrayList<>(setClause.targets.size() + setClause.sources.size());
        @NotNull
                            node,
                            DBIcon.TREE_FOLDER_LINK,
            }
                    }
                }
        put(SQLQuerySymbolClass.TABLE, ThemeConstants.SQL_EDITOR_COLOR_TABLE);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
            return this.children;
                result.add(left);

        OutlineNode n = node;
            return null;
            @NotNull OutlineQueryNode node
                    this.editor.selectAndReveal(textRange.getOffset(), textRange.getLength());
            } else {
            return this.visitRowsProjectionImpl(projection, node, null);
                            UIIcon.SORT,
    @NotNull
                nextNode = null;

            @NotNull DBPImage icon,
            return result;
                n = n.getParent();
                        updateStatement,
            return makeNode(parent, model, OutlineQueryNodeKind.DEFAULT, text, extraText, icon, childModels);
                if (element == editor.getEditorInput()) {
                node, alterTable, nodeText, DBIcon.TREE_FOLDER_CONSTRAINT,
                        UIIcon.GROUP_BY_ATTR,

        
            this.makeNode(arg, columnSpec, text, extraText, DBIcon.TREE_COLUMN, subnodes);
        this.editor.addPropertyListener(editorPropertyListener);
                    text = mayBeColumnName.getName();
                treeViewer.replace(parent, index, childNode);
                prepareQueryPreview(scriptElement),
        public Object visitTableStatementUpdateSetClause(
import org.jkiss.dbeaver.model.struct.DBSEntity;
            @NotNull SQLQueryNodeModel... childModels
 * you may not use this file except in compliance with the License.
        public Object visitCreateTable(@NotNull SQLQueryTableCreateModel createTable, OutlineQueryNode node) {
            }

        public Object visitObjectReference(@NotNull SQLQueryObjectDataModel objectReference, OutlineQueryNode node) {
        return this.currentNodeBuilder;
        public Font getFont(@Nullable Object element) {
        @NotNull
        @Override
            return null;
        
                } else if (element instanceof OutlineNode node) {
                    ? SQLConstants.QUESTION
                correspondingOp,
        @NotNull

            return makeNode(parent, model, kind, text, null, icon, childModels);
                UIIcon.ROW_COPY,
                    : deleteStatement.getTableModel().getName().getNameString();
                    currentSelectionSyncOp = SelectionSyncOperation.NONE;
                tableValue.getValues().toArray(SQLQueryNodeModel[]::new)
            );
        public Image getImage() {
        @Nullable
                UIIcon.SQL_EXECUTE,
                    treeViewer.setChildCount(element, node.getChildrenCount());

            }
        put(SQLQuerySymbolClass.SCHEMA, ThemeConstants.SQL_EDITOR_COLOR_SCHEMA);
        }
                        node,

            SQLQueryComplexName tableName = createTable.getTableName();
        StringBuilder result = new StringBuilder(queryPreviewLength);
                this.flattenRowSetsCombinationImpl(type, (T) left, predicate, result, action);
        }
            @NotNull OutlineNode parentNode,
    @Override
            this.makeNode(node, crossJoin, SQLConstants.KEYWORD_CROSS_JOIN, DBIcon.TREE_TABLE_LINK, children.toArray(SQLQueryNodeModel[]::new));
                parent,
        public void addListener(@Nullable ILabelProviderListener listener) {
        }
        @Nullable
    }
            switch (this.job.getState()) {
                extraText = null;
                    insertStatement,
            );
                    this.makeNode(
        }

     * Refresh outline
        private final SQLDocumentSyntaxContextListener syntaxContextListener = new SQLDocumentSyntaxContextListener() {
        );
        @NotNull
                case NATURAL_JOIN_SUBROOT -> {
            switch (flattenedExpr.getOperands().size()) {
                        flattenedExpr,
                    node,
        @NotNull
            this,
            @NotNull SQLQueryNodeModel model,
            @NotNull OutlineQueryNodeKind kind,
            }
            @NotNull SQLQueryRowsProjectionModel projection,
        }
        @NotNull
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
            @Nullable
            @NotNull T op,
            List<SQLQueryNodeModel> children = this.flattenRowSetsCombination(
                }
        
                if (parent == editor.getEditorInput()) {
        if (currentSelectionSyncOp == SelectionSyncOperation.NONE) {

            return node;
        public Object visitRowsCte(@NotNull SQLQueryRowsCteModel cte, @NotNull OutlineQueryNode node) {
                    node,
            this.model = model;

        private final IRegion textRange;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerToggleOutlineView;
        private DBPImage obtainExprTypeIcon(@NotNull SQLQueryValueExpression expr) {
                    IRegion range = child.getTextRange();
                case 1 -> flattenedExpr.getOperands().get(0).apply(this, node);
        public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
        public Object visitValueColumnRefExpr(
        public Object visitSelectTupleSpec(@NotNull SQLQuerySelectionResultTupleSpec tupleSpec, @NotNull OutlineQueryNode arg) {
            if (columnName != null) {
            public void updateElement(@NotNull Object parent, int index) {
        @Nullable

            return null;
    @NotNull
        }
        }
            // TODO bring join kind here
                        projection.getHavingClause()
                obj.apply(this, node);
                        nextNode = child;
        }
                    );
        put(SQLQuerySymbolClass.SQL_BATCH_VARIABLE, ThemeConstants.SQL_EDITOR_COLOR_SQL_VARIABLE);
        @Nullable
        public String getText(@NotNull Object element) {
                } else {
                    node, projection.getResult(),
                            node,
            int offset = parentNode instanceof OutlineScriptElementNode element ?
                    this.children = List.of(this.noElementsNode);
                UIIcon.ASTERISK
                node = nextNode;
            parent.children.add(node);
            String text;
        @Override
            super(parentNode);
        
            return null;
                String tableName = insertStatement.getTableModel() == null || insertStatement.getTableModel().getName() == null
        this.treeViewer.setInput(editor.getEditorInput());
                        nodeName,
        public String getExtraText() {
            }
                    );
        public StyledString.Styler getTextStyler() { return null; }
            return DBIcon.TREE_SCRIPT;

        put(SQLQuerySymbolClass.ERROR, ThemeConstants.SQL_EDITOR_COLOR_SEMANTIC_ERROR);
        @Override
        }
        }
            SQLQuerySymbolEntry alias = columnSpec.getAlias();
                treeViewer.reveal(new TreePath(path.toArray(OutlineNode[]::new)));
        this.scriptNode.updateChildren();
        }
            // no listeners
                this.makeNode(
            );
            @NotNull String text,
    @NotNull
            } else {
            @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

                }
                        node, naturalJoin, OutlineQueryNodeKind.NATURAL_JOIN_SUBROOT,
            
                this.documentContext = editor.getSyntaxContext();

            String tableNames =  dropStatement.getTables() == null || dropStatement.getTables().isEmpty() ? SQLConstants.QUESTION
                tupleSpec,
            }
                }
            textViewer.getTextWidget().addCaretListener(this.caretListener);
            String nodeName =  "DROP " + dropStatement.getObject().getObjectType().getTypeName().toUpperCase()
            return null;
                for (int i = 0; i < node.getChildrenCount(); i++) {
                    this.makeNode(

        public Object visitRowsTableData(@NotNull SQLQueryRowsTableDataModel tableData, @NotNull OutlineQueryNode node) {
                        SQLConstants.KEYWORD_ORDER_BY,
                            updateStatement.getSetClauseList().toArray(SQLQueryNodeModel[]::new)
        }
            return this.children.get(index);
        private DBPImage obtainExprTypeIcon(@Nullable SQLQueryExprType type) {
        @Override
            }
        public int getChildrenCount() {
                    def = s.getDefinition();
                element.getOffset() + this.model.getInterval().a :
            return null;

                result.append(element.toString());
        @Nullable
                objectReference.getName().getNameString(),
                treeViewer.getTree().setRedraw(false);
            @NotNull SQLQueryNodeModel... childModels
        }
        @Override
    
                if (this.documentContext != null) {
        }
    @NotNull
        ) {
                this.makeNode(node, projection, OutlineQueryNodeKind.PROJECTION_SUBROOT, text, DBIcon.TREE_TABLE_LINK, projection);
            @NotNull SQLQuerySelectIntoModel.SQLQuerySelectIntoTargetsList targetsList,
        @Override
        public Object visitRowsSetCorrespondingOp(
                        projection.getHavingClause(),
            String extraText = this.obtainExprTypeNameString(constExpr);

                    }
        }
                            SQLConstants.KEYWORD_SET,
            }
            return this.obtainExprTypeNameString(expr.getValueType());
            @NotNull SQLQueryNodeModel model,

                        );
            SQLEditorMessages.sql_editor_outline_no_elements_label,
        super.selectionChanged(event);
                }
        private Image outlineImage = null;
        @Override
        public abstract int getChildrenCount();
import org.jkiss.dbeaver.model.sql.semantics.model.dml.*;
        @Nullable
                        UIIcon.FILTER,
        
            return new Region(0, 0);
        public int getChildrenCount() {
                null,
    }

                correspondingOp.getKind().toString(),
                tupleNode.children.add(new OutlineQueryNode(
            @NotNull BiConsumer<T, List<SQLQueryNodeModel>> action
                }
            this.children = null;
            return this.textRange;
        }
            } else {
import org.jkiss.code.NotNull;
                    treeViewer.setChildCount(element, rootNodes.size());
