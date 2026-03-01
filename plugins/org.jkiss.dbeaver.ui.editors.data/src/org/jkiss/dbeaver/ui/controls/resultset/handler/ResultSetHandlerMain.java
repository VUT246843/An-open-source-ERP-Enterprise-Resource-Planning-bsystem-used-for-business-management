        try {

import org.jkiss.dbeaver.utils.GeneralUtils;
                    new AbstractJob("Navigate association") {
                    return null;
                    rse.pasteFromClipboard(null);
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
        private static final String DIALOG_ID = "ResultSetHandlerMain.GotoLineDialog"; //NON-NLS-1
                element.setIcon(ActionUtils.findCommandImage(IResultSetCommands.CMD_EXPORT));
                        UINavigatorMessages.editors_entity_dialog_preview_title,
import org.eclipse.jface.window.Window;
            @Override
            }
                    }.schedule();
        }
import org.eclipse.jface.dialogs.IDialogSettings;
            }
                UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
            image = new DBIconComposite(image, false, null, null, null, DBIcon.OVER_LOCK);
                        } else {
                }
        } else if (activePart instanceof MultiPageAbstractEditor) {
/**
            }
                    rsv.getActivePresentation().scrollToRow(IResultSetPresentation.RowPosition.CURRENT);
                break;
            }
                            rsv,
            super(parent, title, message, initialValue, validator);
                    Display display = shell.getDisplay();
                for (ResultSetRow row : selectedRows) {
            String value = dialog.getValue();
                                vEntity.setColorOverride(attr, cellValue, null, StringConverter.asString(color));
        }
            if (!sqlScript.isEmpty()) {
                rsv.readAllData();
            case IResultSetCommands.CMD_TOGGLE_LAYOUT:
 * limitations under the License.
        IInputValidator inputValidator = newText -> {
            case IResultSetCommands.CMD_TOGGLE_PANELS:
                } else {
                if (attr != null) {
import org.eclipse.swt.graphics.Font;
                    break;
            case IResultSetCommands.CMD_COPY_ROW_NAMES: {
                rsv.rejectChanges();
                        SWT.ICON_WARNING
            ResultSetMessages.results_goto_column_dialog_message,
                break;
        Map<String, Pair<DBDAttributeBinding, IContentProposal>> attrsByName = Arrays.stream(attributes).collect(Collectors.toMap(
                if (rsv.getPreferenceStore().getBoolean(ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER) ^ shiftPressed) {
        }
                        rsv.getExecutionContext(),
                                try (DBCSession session = rsv.getExecutionContext().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Generate default value")) {
                        UIMessages.dialog_policy_data_export_title,
                        }
                scriptText =
            case IResultSetCommands.CMD_FILTER_MENU: {
                                final DBVEntity vEntity = getColorsVirtualEntity(resultSetViewer);
                    }
                    List<Integer> selectedRows = new ArrayList<>();
                rsv.showFilterSettingsDialog();
                        }
        return null;
import java.util.*;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    
                    fontRegistry.put(presentation.getFontId(), fd.getFontData());
                rsv.copyRowValues(actionId.equals(IResultSetCommands.CMD_ROW_COPY_FROM_ABOVE), true);
                        SWT.ICON_WARNING);
            case ITextEditorActionDefinitionIds.WORD_PREVIOUS:
            } catch (InterruptedException e) {
                if (actionId.equals(IResultSetCommands.CMD_APPLY_AND_COMMIT_CHANGES)) {
import org.eclipse.swt.SWT;
                        Collections.singletonList(
import org.jkiss.dbeaver.ui.controls.StyledTextUtils;
                final DBDAttributeBinding attr = rsv.getActivePresentation().getCurrentAttribute();
            if (descriptor == null) {
                            if (colName.equals(attr.getName())) {
                    if (configDialog.open() != IDialogConstants.OK_ID) {
            // The same for MetaDataPanel::refresh(..)
            case IResultSetCommands.CMD_ROW_COPY_FROM_ABOVE:
            }
        final String DIALOG_ID = "ResultSetHandlerMain.GotoColumnDialog"; //NON-NLS-1
            //     at https://www.wolframalpha.com/input?i=Plot%5B%7Bn%2Bn*10%2Cn*n%7D%2C%7Bn%2C0%2C30%7D%5D
                if (hp < rsv.getHistorySize() - 1) {
                break;
    @Override
                }
import org.eclipse.ui.handlers.HandlerUtil;
                } else {
            case IWorkbenchCommandConstants.NAVIGATE_FORWARD_HISTORY: {
                break;
import org.jkiss.dbeaver.ui.internal.UIMessages;
                }
            resultSetViewer.redrawData(false, false);
        }
                        String defProc = ResultSetHandlerOpenWith.getDefaultOpenWithProcessor();
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                    rse.openValueEditor(false);
                    }
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.core.runtime.Status;
                    // ignoring meaningless invalid input
                        showSave);
                                BaseValueManager.makeNullValue(valueController), false);
                        } catch (NumberFormatException x) {
                boolean ys = y.startsWith(pattern);
                        return null;
                break;
                    if (!buffer.isEmpty()) {
        if (activePart != null) {
                    .map(kv -> kv.getValue().getSecond())
                        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            String pattern = contents.substring(0, position).toUpperCase();
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
        }
                break;
                }
                        }
                break;
                Control result = super.createDialogArea(parent);
                    rse.openValueEditor(true);
                    sqlScript.toArray(new DBEPersistAction[0]),
                            if (valueHandler instanceof DBDValueDefaultGenerator vdg && rsv.getExecutionContext() != null) {
        DBPImage image = DBValueFormatting.getObjectImage(attr.getAttribute());
        }
            return null;
        }
                break;
            inputValidator
                rsv.readNextSegment();
                                updateColors(resultSetViewer, vEntity, true);
                }
                if (dataSource == null) {

                    ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
        resultSetViewer.getModel().updateColorMapping(entity, true);
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
 */
    private FontDescriptor createFontDescriptor(FontData[] initialFontData, int fFontSizeOffset) {
                        });
                    FontData[] fondData= font.getFontData();
    @Nullable
                rsv.refreshData(null);
                        selectedRows.add(selectedRow.getRowNumber());

            case IResultSetCommands.CMD_ROW_ADD:
import java.util.List;
                    true,
                    return null;
            case IResultSetCommands.CMD_GO_TO_COLUMN: {
            if (site != null && site.getPart() != null && PlatformUI.isWorkbenchRunning()) {
                    int resID = serviceSQL.openSQLViewer(
            }
                    List<DBEPersistAction> script = rsv.generateChangesScript(monitor, new ResultSetSaveSettings());
                    rsv.toggleSortOrder(attr, null);
            }
                rsv.toggleMode();
                ResultSetSaveSettings saveSettings = showPreviewScript(rsv, saveReport);
import org.jkiss.dbeaver.ui.editors.MultiPageAbstractEditor;
                        }
                if (!CommonUtils.isEmpty(columnNames) && attrs.size() == 1) {
                DBPPreferenceStore store = rsv.getPreferenceStore();
            return getActiveResultSet(((MultiPageAbstractEditor) activePart).getActiveEditor());
                    }
            case IWorkbenchCommandConstants.EDIT_COPY:
import org.jkiss.dbeaver.ui.data.managers.BaseValueManager;
        if (rsv == null) {
                for (Object cell : selection.toArray()) {
        return null;
            // Correctly used suffix tree also capable of giving results sorting for free, while here we are sorting explicitly.
                        if (viewer != null) {
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                    settings = configDialog.copySettings;

            case IResultSetCommands.CMD_EXPORT: {
            List<IContentProposal> entries = attrsByName.entrySet().stream()
                String x = a.getContent();
        } else if (activePart != null) {
                }
                if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
            try {
                if (selectedRows.size() > 1) {
                break;
                        return null;
import org.jkiss.dbeaver.model.*;
                    input -> {
        DBPDataSource dataSource = rsv.getDataSource();
                        @NotNull
            case IResultSetCommands.CMD_FETCH_PAGE:
                {
                    options.setSelectedRows(selectedRows);
            //     O(patternLength+resultsCount) for suffix tree VS O(patternLength*totalKnownAttrsCount) for present solution

                            ColorDialog dialog = new ColorDialog(UIUtils.createCenteredShell(resultSetViewer.getControl().getShell()));
        IContentProposalProvider proposalProvider = (contents, position) -> {
                    }
                if (hp > 0) {
                }
                    activeShell,
        return image;
                break;
                // Execute in async mode. Otherwise if user holds DEL button pressed then all keyboard
                        @Override
package org.jkiss.dbeaver.ui.controls.resultset.handler;
    
                        scriptText,
                        buffer.append(settings.getRowDelimiter());
                        "Auto-generated SQL script. Actual values for binary/complex data types may differ - what you see is the default string representation of values.") +
        DBSDataContainer dataContainer = resultSetViewer.getDataContainer();
                List<DBDAttributeBinding> attrs = selection.isEmpty() ? rsv.getModel().getVisibleAttributes() : selection.getSelectedAttributes();
                element.setTooltip(ActionUtils.findCommandDescription(IResultSetCommands.CMD_EXPORT, element.getServiceLocator(), false));
                                rsv.navigateAssociation(monitor, rsv.getModel(), DBExecUtils.getAssociationByAttribute(attr), rsv.getSelection().getSelectedRows(), false);
                presentation.printResultSet();
                        return null;
                ResultSetSaveReport saveReport = rsv.generateChangesReport();
            return UIUtils.getDialogSettings(DIALOG_ID);
                            if (i <= 0 || rowCount < i) {
                    UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
            }
            final List<DBEPersistAction> sqlScript = new ArrayList<>();
                if (presentation instanceof IResultSetEditor rse) {
import org.jkiss.dbeaver.model.virtual.DBVUtils;
                rsv.clearDataFilter(true);
                if (presentation instanceof IResultSetEditor rse) {
            case IResultSetCommands.CMD_COUNT:
        String initialValue = currentAttribute != null ? currentAttribute.getName() : "";
                            // Run "open with"
                rsv.togglePanelsFocus();
import org.eclipse.jface.text.IFindReplaceTarget;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.commands.IElementUpdater;
                    placement = RowPlacement.AFTER_SELECTION;
            case IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE:
            case IResultSetCommands.CMD_REJECT_CHANGES:
                    if (configDialog.open() != IDialogConstants.OK_ID) {
            case IResultSetCommands.CMD_ACTIVATE_PANELS:
                }
                if (shell != null) {
                ResultSetCopySettings settings = new ResultSetCopySettings();
        }
            } else {
                    rsv.setCurrentRow(rsv.getModel().getRow(line - 1));
                element.setTooltip(descriptor.getDescription());
                final int hp = rsv.getHistoryPosition();
            }
                    rsv.navigateHistory(hp + 1);
                break;
                    new SmartTextContentAdapter(),
                    int line = Integer.parseInt(d.getValue());
            case IResultSetCommands.CMD_ZOOM_OUT: {
                if (attr != null) {
                    }
            case IResultSetCommands.CMD_CELL_RESET: {
            }
                            null);
        switch (actionId) {
            return null;
                rsv.showFiltersMenu();
                return null;
                }
import java.util.stream.Collectors;
                    if (event.getParameter(IResultSetCommands.PARAM_EXPORT_WITH_PARAM) != null) {
import org.eclipse.core.commands.ExecutionException;
                element.setText(ActionUtils.findCommandName(IResultSetCommands.CMD_EXPORT));
    }
                break;
/*
                rsv.switchPresentation();
                if (font != null) {
import org.eclipse.ui.PlatformUI;
                         focusControl = focusControl.getParent()
                break;
                }
    @Override
                            return viewer;
            case IResultSetCommands.CMD_ROW_EDIT:
                        UIMessages.dialog_policy_data_copy_msg,
        }
                break;
            case IResultSetCommands.CMD_TOGGLE_MAXIMIZE:
                break;
                        true);

                        HandlerUtil.getActiveShell(event),
                presentation.scrollToRow(IResultSetPresentation.RowPosition.LAST);
            case ITextEditorActionDefinitionIds.SELECT_WORD_PREVIOUS:
            }
            Pair<DBDAttributeBinding, IContentProposal> selectedByName = attrsByName.get(value.toUpperCase());
 * Unless required by applicable law or agreed to in writing, software
            return null;
            a -> new Pair<>(a, new ContentProposalExt(a.getName(), a.getLabel(), a.getDescription(), obtainAttributeIcon(a))), 
            case IResultSetCommands.CMD_FILTER_EDIT_SETTINGS: {
                rsv.saveDataFilter();
            case ITextEditorActionDefinitionIds.WORD_NEXT:
                    }
 *
        if (DBExecUtils.isAttributeReadOnly(attr)) {
                if (presentation instanceof IResultSetEditor rse) {
                }
                    }
            throw new IllegalStateException("No data container");
                    FontDescriptor fd = createFontDescriptor(fondData, zoomFactor);
        if (activePart instanceof IResultSetProvider) {
                    true
                        UIIcon.SQL_PREVIEW,
            case IResultSetCommands.CMD_GENERATE_SCRIPT: {
                        UIMessages.dialog_policy_data_export_msg,
            case IWorkbenchCommandConstants.EDIT_DELETE:
                for (DBDAttributeBinding attr : attrs) {
                UIUtils.asyncExec(rsv::deleteSelectedRows);
        protected IDialogSettings getDialogBoundsSettings() {

                rsv.switchFilterFocus();
                            }
                break;
                break;
            case IResultSetCommands.CMD_NAVIGATE_LINK: {

                return result;
                    }
                }
                final DBDAttributeBinding attr = rsv.getActivePresentation().getFocusAttribute();
            case IResultSetCommands.CMD_ROW_PREVIOUS:
            DBWorkbench.getPlatformUI().showError("Script generation", "Can't generate changes script", e.getTargetException());
            case IResultSetCommands.CMD_FETCH_ALL:
                        buffer.append(DBUtils.getQuotedIdentifier(dataSource, colName));
                break;
                presentation.scrollToRow(IResultSetPresentation.RowPosition.PREVIOUS);

 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
            return scriptDialog.getSaveSettings();
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
                boolean shiftPressed = event.getTrigger() instanceof Event && ((((Event) event.getTrigger()).stateMask & SWT.SHIFT) == SWT.SHIFT);
 */
    }
                if (presentation instanceof IResultSetEditor rse) {

                if (attrs.size() > 1) {
                            return Status.OK_STATUS;
import org.eclipse.ui.IWorkbenchCommandConstants;
                break;
                break;
                            } catch (DBException e) {
        }
            case IResultSetCommands.CMD_GO_TO_ROW: {
            case IResultSetCommands.CMD_ROW_FIRST:
                }
                    settings = configDialog.copySettings;
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
                break;
                boolean xs = x.startsWith(pattern);
                }
                            RGB color = dialog.open();
                    }
    }
                                    Object defValue = vdg.generateDefaultValue(session, valueController.getValueType());
        };
        int destFontSize= initialFontData[0].getHeight() + fFontSizeOffset;
                );
import org.jkiss.dbeaver.ui.UIUtils;
                if (serviceSQL != null) {
import org.eclipse.core.commands.AbstractHandler;
                        sqlScript.addAll(script);
                // events are processed in sync mode and first pain event after all keyboard events.

                    String colName = attr.getLabel();
                            return "Not a number";
import org.eclipse.swt.widgets.*;
                }
                         focusControl != null;
    @NotNull
                        try {
        if (scriptDialog.open() == IDialogConstants.OK_ID) {
                    proposalProvider,
            return selectedByName != null ?  selectedByName.getFirst() : attributes[Integer.parseInt(value) - 1];
                ResultSetUtils.copyToClipboard(buffer.toString());
        } else {
                FontRegistry fontRegistry = UIUtils.getCurrentTheme().getFontRegistry();
            }
 * You may obtain a copy of the License at
                break;
                        for (DBDAttributeBinding attr : rsv.getModel().getVisibleAttributes()) {

                                return GeneralUtils.makeExceptionStatus(e);
    static class GotoLineDialog extends InputDialog {
    public Object execute(ExecutionEvent event) throws ExecutionException {

            case IResultSetCommands.CMD_TOGGLE_MODE:
import org.jkiss.dbeaver.ui.DBeaverIcons;
            case IResultSetCommands.CMD_FILTER_CLEAR_SETTING: {
                            DBDValueHandler valueHandler = valueController.getValueHandler();
                }
            }
                    rse.openValueEditor(false);
            // Should use suffix tree instead of this for faster lookups on large attributes set:
                );
                ResultSetRow currentRow = rsv.getCurrentRow();
                    ResultSetHandlerCopySpecial.CopyConfigDialog configDialog = new ResultSetHandlerCopySpecial.CopyConfigDialog(activeShell, "CopyGridNamesOptionsDialog");

        if (destFontSize <= 0) {
                    if (index >= 1 && index <= attributes.length) {
                    for (Control focusControl = underMouseCursor ? display.getCursorControl() : display.getFocusControl();
            }
                    ) {
            case IResultSetCommands.CMD_CELL_SET_DEFAULT:
                    ResultSetViewer resultSetViewer = activePart.getAdapter(ResultSetViewer.class);
        String actionId = event.getCommand().getId();
    ) {

            case IResultSetCommands.CMD_TOGGLE_CONFIRM_SAVE: {
                            }
            case IWorkbenchCommandConstants.EDIT_PASTE:
    private ResultSetSaveSettings showPreviewScript(ResultSetViewer rsv, ResultSetSaveReport saveReport) {
                break;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        ));
                IResultSetSelection selection = rsv.getSelection();

import org.jkiss.dbeaver.model.virtual.DBVEntity;
            }
            }
                String scriptText = SQLUtils.generateScript(
                    if (CommonUtils.isEmpty(colName)) {
import org.eclipse.ui.IWorkbenchPart;
    @Nullable
                    options.setSelectedColumns(rsv.getSelection().getSelectedAttributes());
                    });
                    }
        if (parameters.get(IResultSetCommands.PARAM_EXPORT_WITH_PARAM) != null) {
                }
                    rsv.navigateHistory(hp - 1);
                            try {
                            if (color != null) {
                    ResultSetDataContainer dataContainer = new ResultSetDataContainer(rsv, options);
    }
                // FIXME: Should probably rely on hints; see org.jkiss.dbeaver.ui.data.DBDValueHintActionHandler
                return UIUtils.getDialogSettings(DIALOG_ID);
                    // Do commit
                                ResultSetCellLocation cellLocation = ssp.getCurrentCellLocation();
                        UIMessages.dialog_policy_data_copy_title,
                    activeShell,
                    ActionUtils.runCommand(ConnectionCommands.CMD_COMMIT, rsv.getSite());
                    .filter(kv -> kv.getKey().contains(pattern))
import org.eclipse.core.commands.ExecutionEvent;
                    this.getText(),
import org.eclipse.swt.graphics.FontData;
                rsv.updateRowCount(true);
                store.setValue(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE, !store.getBoolean(ResultSetPreferences.RESULT_SET_CONFIRM_BEFORE_SAVE));
                Font font = fontRegistry.get(presentation.getFontId());
import org.eclipse.jface.dialogs.IDialogConstants;
                        null,
                } else {
                } catch (Throwable ex) {

                            }
                    UIUtils.showMessageBox(
        @NotNull Shell activeShell,
                break;
            case IResultSetCommands.CMD_ROW_COPY_FROM_BELOW: {
                presentation.scrollToRow(IResultSetPresentation.RowPosition.FIRST);
                if (saveSettings != null) {
                        presentation.copySelection(
                if (targetAttribute != null) {
                        }
                ResultSetUtils.copyToClipboard(
                break;
                                ResultSetHandlerOpenWith.CMD_OPEN_WITH, null, Map.of(ResultSetHandlerOpenWith.PARAM_PROCESSOR_ID, defProc),
                break;
                    }
                try {
            return FontDescriptor.createFrom(initialFontData);
            }
                ResultSetUtils.copyToClipboard(buffer.toString());
                            new DatabaseTransferProducer(dataContainer, rsv.getModel().getDataFilter())),
                    DBDAttributeBinding attr = selection.getElementAttribute(cell);
                break;

 * DBeaver - Universal Database Manager
import org.jkiss.utils.Pair;
                                rsv.getSite());
            case IWorkbenchCommandConstants.EDIT_CUT:
                rsv.redrawData(false, false);
                rsv.toggleVerticalLayout();
            case IResultSetCommands.CMD_ROW_COPY: {
            // See pretty dumb scale-irrelevant illustration
                break;
                }
        };
            }
                if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_COPY)) {
            if (attrsByName.containsKey(newText.toUpperCase())) {
            });
import org.jkiss.dbeaver.DBException;
                    if (presentation instanceof SpreadsheetPresentation ssp) {
            case IWorkbenchCommandConstants.FILE_REFRESH:
import org.eclipse.jface.resource.FontRegistry;
                break;
                rsv.updatePanelsContent(false);

                ContentAssistUtils.installContentProposal(
                break;
                    } else {
            }
                    DataTransferWizard.openWizard(
        SaveScriptDialog scriptDialog = new SaveScriptDialog(rsv, saveReport);
            protected IDialogSettings getDialogBoundsSettings() {
                rsv.showPanels(!rsv.isPanelsVisible(), true, true);
import org.jkiss.code.NotNull;
    }

                break;


    private void updateColors(ResultSetViewer resultSetViewer, DBVEntity entity, boolean refresh) {
                    rsv.getActivePresentation().scrollToRow(IResultSetPresentation.RowPosition.CURRENT);
            case IResultSetCommands.CMD_FILTER_SAVE_SETTING: {
                break;
                        new ResultSetCopySettings(false, false, true, true, false, null, null, null, DBDDisplayFormat.EDIT))
                        HandlerUtil.getActiveWorkbenchWindow(event),
                }
            case IResultSetCommands.CMD_CELL_SET_NULL:
                    if (row != null && attr != null && !DBExecUtils.isAttributeReadOnly(attr)) {
            case IResultSetCommands.CMD_COPY_COLUMN_NAMES: {


            }
                    scriptText;

                                }
import org.eclipse.ui.IWorkbenchPartSite;
import org.jkiss.dbeaver.ui.ActionUtils;
            case IResultSetCommands.CMD_FILTER_MENU_DISTINCT: {
    }
                final int hp = rsv.getHistoryPosition();
                    SQLUtils.generateCommentLine(

            case IWorkbenchCommandConstants.FILE_PRINT:

                    int index = Integer.parseInt(newText);
                            }
                            valueController.updateValue(
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 *
    }
            case ITextEditorActionDefinitionIds.SELECT_WORD_NEXT:
                break;
        }
                    rsv.applyChanges(null, saveSettings);
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
public class ResultSetHandlerMain extends AbstractHandler implements IElementUpdater {

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                break;
        } catch (InvocationTargetException e) {
        if (dialog.open() == Window.OK) {
    @NotNull
            a -> a.getName().toUpperCase(), 
            case IResultSetCommands.CMD_SELECT_ROW_COLOR: {
        if (refresh) {
                }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                        buffer.append(colName);
                        rsv.getExecutionContext() == null ? null : rsv.getExecutionContext().getDataSource(),
            case IResultSetCommands.CMD_ROW_EDIT_INLINE:
                break;
                    if (script != null) {

            activeShell,
                            ActionUtils.runCommand(
                    buffer.append(row.getVisualNumber() + 1);
                                Object cellValue = resultSetViewer.getContainer().getResultSetController().getModel()
            }

                UIUtils.runInProgressService(monitor -> {
                            }
    private static DBDAttributeBinding askForColumnToGo(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
                    int zoomFactor = actionId.equals(IResultSetCommands.CMD_ZOOM_IN) ? 1 : -1;
import org.eclipse.jface.fieldassist.IContentProposal;
                }
                    }
        @NotNull DBDAttributeBinding[] attributes
                // Bad UIX.
import org.jkiss.dbeaver.ui.data.IValueController;
                        }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
                var currentAttribute = rsv.getActivePresentation().getCurrentAttribute();
        if (dataContainer == null) {
                        buffer.append(settings.getColumnDelimiter());
                }
                    placement = RowPlacement.BEFORE_SELECTION;
                                    .getCellValue(cellLocation);
                    }
                StringBuilder buffer = new StringBuilder();
        return DBVUtils.getVirtualEntity(dataContainer, true);
                if (rowCount <= 0) {
                            new ResultSetCellLocation(attr, row, selection.getElementRowIndexes(cell)),
                    null,
                        rsv.getSelection(),
            // Our existing trie (used in SQL parsing) works fine but only for prefix-based lookups, but here we want suffix lookups.
            (x, y) -> x
import org.eclipse.jface.fieldassist.IContentProposalProvider;
            }
                }
                        ResultSetViewer viewer = (ResultSetViewer) focusControl.getData(ResultSetViewer.CONTROL_ID);
                break;
                    presentation.copySelection(
                if (saveReport == null) {
            final String processorId = ResultSetHandlerOpenWith.getDefaultOpenWithProcessor();
            }
            }
            return ((IResultSetProvider) activePart).getResultSetController();
import org.jkiss.utils.CommonUtils;

                break;
                presentation.scrollToRow(IResultSetPresentation.RowPosition.NEXT);
                }
        };
        IResultSetPresentation presentation = rsv.getActivePresentation();
import org.eclipse.core.runtime.IStatus;
            final DataTransferProcessorDescriptor descriptor = ResultSetHandlerCopyAs.getActiveProcessor(processorId);
import org.jkiss.code.Nullable;
        }
                break;
                break;
                            rsv.resetCellValue(attr, row, selection.getElementRowIndexes(cell));
                    rsv.getAdapter(IFindReplaceTarget.class));
        return FontDescriptor.createFrom(initialFontData).setHeight(destFontSize);
        Shell activeShell = HandlerUtil.getActiveShell(event);
                }
                final RowPlacement placement;
                break;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController.RowPlacement;
                rsv.applyChanges(null, saveSettings);
                List<ResultSetRow> selectedRows = rsv.getSelection().getSelectedRows();
 * See the License for the specific language governing permissions and
                    for (String colName : columnNames.split(",")) {
    @Nullable
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                        UIUtils.asyncExec(() -> {
                DBDAttributeBinding curAttribute = rsv.getActivePresentation().getFocusAttribute();
        } else {
                StringBuilder buffer = new StringBuilder();
            case IResultSetCommands.CMD_REFERENCES_MENU: {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                String columnNames = event.getParameter("columns");
                IResultSetSelection selection = rsv.getSelection();
                    }
            @Override
                if (curAttribute != null) {
                // ignore
                element.setText(descriptor.getAppName());
            IWorkbenchPartSite site = activePart.getSite();
                    false);
            entries.sort((a, b) -> { // list sorting works inplace instead of additional temporary buffer for streams
            return null;
                        } else if (actionId.equals(IResultSetCommands.CMD_CELL_SET_DEFAULT)) {
    }
                }
                            return null;

        @Nullable DBDAttributeBinding currentAttribute,
                boolean copy = actionId.equals(IResultSetCommands.CMD_ROW_COPY);
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
import org.jkiss.dbeaver.ui.controls.resultset.*;
                boolean shiftPressed = event.getTrigger() instanceof Event && ((((Event) event.getTrigger()).stateMask & SWT.SHIFT) == SWT.SHIFT);
 * ResultSetHandlerMain
import org.eclipse.ui.menus.UIElement;
                action.run();
                    String.valueOf(currentRow == null ? 1 : currentRow.getVisualNumber() + 1),
    private static DBPImage obtainAttributeIcon(@NotNull DBDAttributeBinding attr) {
                            IValueController.EditType.NONE,
                rsv.getActivePresentation().getControl().setFocus();
        ) {
}            return entries.toArray(new IContentProposal[0]);
    public void updateElement(UIElement element, Map parameters) {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
/*
                                return "Row number is out of range";
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            protected Control createDialogArea(Composite parent) {
                });
            case IResultSetCommands.CMD_FOCUS_FILTER:
import org.eclipse.jface.resource.StringConverter;
                    rsv.getActivePresentation().setCurrentAttribute(targetAttribute);

import org.eclipse.swt.graphics.RGB;
                rsv.togglePanelsMaximize();
            case IResultSetCommands.CMD_ROW_LAST:
            case IResultSetCommands.CMD_TOGGLE_ORDER: {

            }
                break;
            case IResultSetCommands.CMD_APPLY_AND_COMMIT_CHANGES: {
                rsv.addNewRow(placement, copy, true);
                            int i = Integer.parseInt(input);
        }
                Shell shell = site.getShell();
                IAction action = StyledTextUtils.createFindReplaceAction(
                }
                rsv.showReferencesMenu(shiftPressed);
                    rsv.showFiltersDistinctMenu(curAttribute, true);
                GotoLineDialog d = new GotoLineDialog(
                        if (actionId.equals(IResultSetCommands.CMD_CELL_SET_NULL)) {
            }
                    "Enter row number (1.." + rowCount + ")",
            case IWorkbenchCommandConstants.NAVIGATE_BACKWARD_HISTORY: {
                                    valueController.updateValue(defValue, false);
                    .collect(Collectors.toCollection(() -> new ArrayList<>(attrsByName.size())));
                return "Unknown column name"; //NON-NLS-1
    private DBVEntity getColorsVirtualEntity(ResultSetViewer resultSetViewer) throws IllegalStateException {
                    );
            }
        if (activePart == null) {
                    return resID == IDialogConstants.OK_ID;
                                final DBDAttributeBinding attr = rsv.getActivePresentation().getCurrentAttribute();
                    ResultSetRow row = selection.getElementRow(cell);
import org.eclipse.jface.dialogs.IInputValidator;
            ResultSetMessages.results_goto_column_dialog_title,
            case IResultSetCommands.CMD_ROW_NEXT:
                        if (!CommonUtils.isEmpty(defProc)) {
        return getActiveResultSet(activePart, false);
                        ResultSetValueController valueController = new ResultSetValueController(
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
            case IResultSetCommands.CMD_ZOOM_IN:
                    attrs = new ArrayList<>();
                        colName = attr.getName();
import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.SpreadsheetPresentation;
                        return null;
*/
import org.eclipse.jface.dialogs.InputDialog;
                    if (dataSource == null) {
            }
    }
                break;
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;
import org.jkiss.dbeaver.model.data.DBDValueDefaultGenerator;
 * you may not use this file except in compliance with the License.
                break;
import org.jkiss.dbeaver.ui.contentassist.ContentProposalExt;
            case IResultSetCommands.CMD_ROW_DELETE:
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
                return (xs ^ ys) ? (xs ? -1 : 1) : x.compareToIgnoreCase(y);
        final ResultSetViewer rsv = (ResultSetViewer) getActiveResultSet(activePart);
                    ResultSetUtils.copyToClipboard(
                ResultSetCopySettings settings = new ResultSetCopySettings();
                    rsv.getDataSource(),
                }
                break;
            initialValue,
                break;

                    "Go to Row",

                }
                DBDAttributeBinding targetAttribute = askForColumnToGo(activeShell, currentAttribute, rsv.getModel().getAttributes());
                                attrs.add(attr);
    public static IResultSetController getActiveResultSet(@Nullable IWorkbenchPart activePart, boolean underMouseCursor) {
            case IResultSetCommands.CMD_SWITCH_PRESENTATION:
        InputDialog dialog = new InputDialog(
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            case IResultSetCommands.CMD_APPLY_CHANGES:
        public GotoLineDialog(Shell parent, String title, String message, String initialValue, IInputValidator validator) {
                element.setIcon(DBeaverIcons.getImageDescriptor(descriptor.getIcon()));
                    if (!buffer.isEmpty()) {
                break;
                ResultSetSaveSettings saveSettings = new ResultSetSaveSettings();
                }
                final int rowCount = rsv.getModel().getRowCount();
        entity.persistConfiguration();
                    for (ResultSetRow selectedRow : rsv.getSelection().getSelectedRows()) {
    public static IResultSetController getActiveResultSet(@Nullable IWorkbenchPart activePart) {
            case ITextEditorActionDefinitionIds.SMART_ENTER:

            return activePart.getAdapter(IResultSetController.class);
        }
                if (d.open() == Window.OK) {
            }
                            new ResultSetCopySettings(false, false, false, true, false, null, null, null, DBDDisplayFormat.EDIT)));
                String y = b.getContent();
                break;
    }
                    ResultSetHandlerCopySpecial.CopyConfigDialog configDialog = new ResultSetHandlerCopySpecial.CopyConfigDialog(activeShell, "CopyGridNamesOptionsDialog");
