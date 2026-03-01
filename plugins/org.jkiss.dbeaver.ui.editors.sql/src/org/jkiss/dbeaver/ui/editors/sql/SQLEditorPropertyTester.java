 * SQLEditorPropertyTester
                return editor.isActiveQueryRunning();
 * Unless required by applicable law or agreed to in writing, software
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.viewers.ISelection;
    public SQLEditorPropertyTester() {
/*
        if (!(receiver instanceof SQLEditor editor)) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                // Check whether some word is under cursor
                ISelectionProvider selectionProvider = editor.getSelectionProvider();
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
                    SQLNativeExecutorDescriptor executorDescriptor =
                }
            case PROP_IS_ACTIVE_QUERY_RUNNING:
        boolean hasConnection = editor.getDataSourceContainer() != null;
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
            }
                } catch (DBException exception) {
import org.jkiss.dbeaver.Log;
                    editor.getSyntaxManager().getStructSeparator(),
import org.jkiss.utils.CommonUtils;
                    default -> false;
            case PROP_HAS_SELECTION: {
                if (selectionProvider == null) {
    public static final String PROP_CAN_EXPORT = "canExport";
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.editors.sql";
                return editor.hasActiveQuery();
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
            return !(id instanceof String sid && OVERLAY_ID_INPUTS.contains(sid));
            case PROP_CAN_EXECUTE: {
            case PROP_CAN_NAVIGATE: {
import org.jkiss.dbeaver.ui.ActionUtils;
    private static final String OVERLAY_ID_DATA_KEY = FindReplaceOverlay.ID_DATA_KEY;
    public static final String PROP_CAN_EXECUTE = "canExecute";
 *
            }
                return hasConnection && editor.hasActiveQuery();
            return false;
            case PROP_CAN_EXPLAIN:

                        SQLNativeExecutorRegistry.getInstance().getExecutorDescriptor(editor.getDataSourceContainer());
                return selection != null && document != null && !new SQLIdentifierDetector(
                        return false;

    }
 * See the License for the specific language governing permissions and
import java.util.Set;
        return false;
/**
            }
            case PROP_FOLDING_SUPPORTED:
 *
}import org.jkiss.dbeaver.ui.UIUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.jface.text.Region;
    public static final String PROP_CAN_EXPLAIN = "canExplain";
            case PROP_CAN_EXPORT:
                return hasConnection && GeneralUtils.adapt(editor.getDataSource(), DBCQueryPlanner.class) != null;
                    return false;
                    case "statement" -> mode != QueryMode.NONE && isFocusNotInFindReplaceOverlay();
    public static final String PROP_FOLDING_SUPPORTED = "foldingSupported";
        return true;
            case PROP_FOLDING_ENABLED:
 */
import org.eclipse.jface.viewers.ISelectionProvider;
                var descriptor = editor.getActivePresentationDescriptor();

    }
                IDocument document = editor.getDocument();
        }
        if (editorControl == null) {
    private static boolean isFocusNotInFindReplaceOverlay() {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    case "script" -> mode == QueryMode.MULTIPLE;
                }
                ITextSelection selection = (ITextSelection) selectionProvider.getSelection();
                };
    static final Log log = Log.getLog(SQLEditorPropertyTester.class);
                    log.error("Error checking native execution", exception);
                    if (editor.getDataSourceContainer() == null) {
                ).extractIdentifier(document, new Region(selection.getOffset(), selection.getLength()), editor.getRuleManager()).isEmpty();
 * you may not use this file except in compliance with the License.
                    editor.getSyntaxManager().getIdentifierQuoteStrings()
import org.eclipse.jface.text.ITextSelection;
        Control focus = display.getFocusControl();
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorDescriptor;

            Object id = focus.getParent().getData(OVERLAY_ID_DATA_KEY);
    private static final Set<String> OVERLAY_ID_INPUTS = Set.of("replaceInput", "searchInput");
package org.jkiss.dbeaver.ui.editors.sql;
                    return false;
                    return executorDescriptor != null && executorDescriptor.getNativeExecutor() != null;
        if (focus != null && !focus.isDisposed() && focus.getParent() != null && !focus.getParent().isDisposed()) {
    public static final String PROP_IS_ACTIVE_QUERY_RUNNING = "isActiveQueryRunning";
                ISelection selection = editor.getSelectionProvider().getSelection();
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
                    editor.getSyntaxManager().getDialect(),
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        }
        final Control editorControl = editor.getEditorControl();
 * limitations under the License.
import org.eclipse.jface.text.IDocument;
 */
    public static final String PROP_CAN_EXECUTE_NATIVE = "canExecuteNative";
    public static void firePropertyChange(String propName) {
            }
    public static final String PROP_FOLDING_ENABLED = "foldingEnabled";
import org.eclipse.ui.internal.findandreplace.overlay.FindReplaceOverlay;

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.utils.GeneralUtils;
        Display display = UIUtils.getDisplay();
import org.eclipse.core.expressions.PropertyTester;
                try {
 * You may obtain a copy of the License at
                    }

    @Override

        }
                return editor.isFoldingEnabled();
        switch (property) {
import org.eclipse.swt.widgets.Control;
                return switch (CommonUtils.toString(expectedValue)) {
            case PROP_HAS_ACTIVE_QUERY:
        super();

                return selection instanceof ITextSelection && ((ITextSelection) selection).getLength() > 0;
    public static final String PROP_HAS_SELECTION = "hasSelection";
    public static final String PROP_HAS_ACTIVE_QUERY = "hasActiveQuery";
    public static final String PROP_CAN_NAVIGATE = "canNavigate";
            case PROP_CAN_EXECUTE_NATIVE: {
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorRegistry;
            return false;
 *

                return editor.getProjectionAnnotationModel() != null;
import org.eclipse.swt.widgets.Display;
public class SQLEditorPropertyTester extends PropertyTester {
    }
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationDescriptor.QueryMode;
                var mode = descriptor != null ? descriptor.getQueryMode() : QueryMode.MULTIPLE;
