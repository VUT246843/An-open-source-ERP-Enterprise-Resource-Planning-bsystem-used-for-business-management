import org.eclipse.swt.graphics.Point;
        protected ContentLoaderService(DBDContent content) {
                    streamEditor.contributeSettings(menuManager, editorControl);
                    } catch (Exception e) {
            for (MenuItem item : menu.getItems()) {
import org.jkiss.dbeaver.model.DBPMessageType;
            } catch (Throwable e) {
    }
    protected Font getDefaultFont() {
            }
public class ContentPanelEditor extends BaseValueEditor<Control> implements IAdaptable {
}
    private Map<StreamValueManagerDescriptor, IStreamValueManager.MatchType> streamManagers;
 *
                streamEditor = curStreamManager.getInstance().createPanelEditor(valueController);
            }
    }
        }
        @Override
 *
 * See the License for the specific language governing permissions and
            } else {
                streamEditor.contributeActions(toolbarManager, editorControl);
import org.jkiss.dbeaver.ui.data.IValueController;

                LoadingJob.createService(
    }
            curStreamManager = findManager(savedManagerId);
                }
            if (isStringValue()) {

    protected Control createControl(Composite editPlaceholder)
                StreamValueLoadService loadingService = new StreamValueLoadService((DBDContent) content);
        @Override
                    log.error(e);
        } else {
            if (curStreamManager == null)
                    control.dispose();
        return createStreamManagerControl(editPlaceholder);
                ToolBar toolBar = toolItem.getParent();
                primeEditorValue(result, false);
            super.completeLoading(result);
        }
        public DBDContent evaluate(@NotNull DBRProgressMonitor monitor) {
        }
                for (StreamValueManagerDescriptor manager : managers) {
                valueController.showMessage(e.getMessage(), DBPMessageType.ERROR);
        }
            valueController.refreshEditor();
            } catch (Exception e) {
        return null;

        return BaseThemeSettings.instance.monospaceFont;
            if (adapter.isAssignableFrom(streamEditor.getClass())) {
                try {
        return editorControl;
                    menuManager.add(new CommandContributionItem(parameters));

import org.jkiss.dbeaver.model.data.DBDContentCached;
                final DBPPreferenceStore store = valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore();
            if (toolbarManager instanceof ToolBarManager) {
    private boolean isStringValue() {
                    log.error(e);
* ControlPanelEditor
                dsId = valueController.getExecutionContext().getDataSource().getContainer().getId();
                        if (newManager != curStreamManager) {
            {
            // Clear placeholder

import org.jkiss.dbeaver.ui.data.IStreamValueManager;
                        if (streamEditor != null && !control.isDisposed()) {

                UIUtils.syncExec(() -> {
            return content;

                valueToManagerMap.put(makeValueId(true), managerId);
            if (object.getParentObject() != null) {

                    }
            setToolTipText(EditorMessages.content_viewer_settings);
import org.eclipse.swt.graphics.Rectangle;
import org.jkiss.dbeaver.Log;

        }
            streamEditor.contributeActions(manager, editorControl);
        manager.add(cfgItem);
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.PAGES));
            monitor.beginTask("Detect appropriate editor", 1);
            } catch (Exception e) {

    @Override
        }
            .schedule();
            super.completeLoading(result);
        if (streamEditor == null) {

    }
            }
    {
        if (includeDataSource) {
                control = createControl(valueController.getEditPlaceholder());


import org.eclipse.swt.events.SelectionEvent;
 *     http://www.apache.org/licenses/LICENSE-2.0
                Menu menu = createMenu(toolItem);
        protected DBDContent content;
            this.editPlaceholder = parent;
                }
                });
            new StreamManagerDetectVisualizer(loadingService, editPlaceholder))
        // Load manager setting for current attribute

            valueId = DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.ui.data.registry.StreamValueManagerDescriptor;
    }

                    item.fill(menu, -1);

        }
            }
                    if (itemData instanceof StreamValueManagerDescriptor newManager) {
        public ContentLoadVisualizer(ContentLoaderService loadingService, Composite parent) {
        }
                        valueController.showMessage(e.getMessage(), DBPMessageType.ERROR);
                }
    @Override
        }
                        ResultSetHandlerSwitchContentViewer.PARAM_STREAM_MANAGER_ID,


        }
            if (curStreamManager == null)
        }
            UIUtils.disposeChildControls(editPlaceholder);
            valueToManagerMap.put(valueId, managerId);
                PrefUtils.savePreferenceStore(store);
        }
            if (entry.getKey().getId().equals(id)) {
        }
import org.eclipse.swt.widgets.*;
    }
        return valueId;
import java.util.List;
                        ResultSetHandlerSwitchContentViewer.COMMAND_ID,
            try {
        if (content instanceof DBDContent) {
    }
            super(curStreamManager != null ?
            try {
    private void loadStringStreamManagers() throws DBException {
    private class ContentTypeSwitchAction extends Action implements SelectionListener {
            return stringContent.getRawValue();
        ContentTypeSwitchAction() {
            return content;
            valueId = valueController.getValueName();
            if (content == null) {
        private Menu createMenu(ToolItem toolItem) {
    }
    }
        @Override
            if (CommonUtils.isNotEmpty(managerId)) {
                    curStreamManager = null;
    {

    private static final Map<String, String> valueToManagerMap = new HashMap<>();
        }
            super.visualizeLoading();
        @Override
        } else {
        }
            super("Load LOB value");
 * You may obtain a copy of the License at
    }
        ActionContributionItem cfgItem = new ActionContributionItem(new ContentTypeSwitchAction());

        }
            streamManagers = ValueManagerRegistry.getInstance().getApplicableStreamManagers(
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
        streamManagers = ValueManagerRegistry.getInstance().getStreamManagersByMimeType(MimeTypes.TEXT, MimeTypes.TEXT_PLAIN);
import org.jkiss.code.NotNull;
                toolbarManager = null;
    public Object extractEditorValue() throws DBException
            streamEditor.extractEditorValue(new VoidProgressMonitor(), control, stringContent);
        super.dispose();
            } finally {
                return entry.getKey();

        if (valueType instanceof DBDAttributeBinding) {
    }
            loadingService,
            }
            if (menu != null) {
        @Override
    private class StreamManagerDetectVisualizer extends ContentLoadVisualizer {
import org.jkiss.dbeaver.utils.MimeTypes;
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (valueType instanceof DBSObject object) {

import org.jkiss.dbeaver.utils.PrefUtils;
                return adapter.cast(streamEditor);
                    ((ToolBarManager) toolbarManager).getControl().setRedraw(true);
                    );
*/
            if (event.widget instanceof ToolItem toolItem) {
        if (savedManagerId != null) {


            final String valueId = makeValueId(true);
                    DBWorkbench.getPlatformUI().showError(EditorMessages.create_control_error_title, EditorMessages.create_control_error_description, e);
                control,
                        DBWorkbench.getPlatformUI().showError("Value panel", "Error loading contents", e);
            for (MenuItem item : menu.getItems()) {
                    detectStreamManager(new VoidProgressMonitor(), (DBDContent) content);

                Action.AS_DROP_DOWN_MENU);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    @Override
            } finally {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }


 * DBeaver - Universal Database Manager
                for (IContributionItem item : menuManager.getItems()) {
            }
    }
                monitor.done();
        if (curStreamManager != null) {
    public StreamValueManagerDescriptor getCurrentStreamManager() {
        }
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        curStreamManager = newManager;
                log.warn("NULL content editor.");
            setControl(editorControl);
            } catch (Exception e) {
        @Override
        }
                valueController.getValueType(),
            loadInService = !(content instanceof DBDContentCached);
                throw new DBException("Can't find appropriate stream manager");
            } else {
                        manager.getId(),
        if (streamEditor != null) {
                curStreamManager.getLabel() : ResultSetMessages.controls_resultset_viewer_action_view_as,
        super(controller);
    @Nullable
        if (isStringValue()) {
                } catch (Throwable e) {
        primeEditorValue(value, true);
            super(loadingService, parent);
                }
    }
 * you may not use this file except in compliance with the License.
    private IStreamValueEditor<Control> streamEditor;
        return curStreamManager;
    }
        String savedManagerId = valueToManagerMap.get(makeValueId(true));
            }
            valueController.showMessage("Unsupported content value. Must be DBDContent or String.", DBPMessageType.ERROR);
        }
        String savedManagerId = valueToManagerMap.get(makeValueId(true));

        }
        public StreamManagerDetectService(DBDContent content) {
        } else {
                }
        private Menu menu;

            // Create and layout new editor
            }
            );
                streamEditor.primeEditorValue(new VoidProgressMonitor(), control, (DBDContent) content);
        }

    private IContributionManager toolbarManager;
        public StreamManagerDetectVisualizer(StreamManagerDetectService loadingService, Composite parent) {
            }
        public void completeLoading(DBDContent result) {

    private class StreamValueLoadService extends ContentLoaderService {
            super(loadingService, parent);
        return null;
    @NotNull
                detectStreamManager(monitor, content);
 */
                    valueController.showMessage(e.getMessage(), DBPMessageType.ERROR);
import java.util.*;
                            streamEditor.primeEditorValue(monitor, control, content);
                DBWorkbench.getPlatformUI().showError("No stream editor", "Can't create stream editor", e);

            super(loadingService, parent);
                    streamEditor.extractEditorValue(new VoidProgressMonitor(), control, (DBDContent) content);
    private class StreamValueLoadVisualizer extends ContentLoadVisualizer {
    @Override

                    loadingService,
    }
            }
                    new StreamValueLoadVisualizer(loadingService, ph))


    private class StreamManagerDetectService extends ContentLoaderService {
/**
            try {
    private static final String PROP_VALUE_MANAGER = "valueManager";

                valueController.getEditPlaceholder().layout(true, true);
        }
 *
            }
                menu.setLocation(point.x, point.y);
import org.jkiss.dbeaver.ui.data.IStreamValueEditor;
        DBSTypedObject valueType = valueController.getValueType();
        if (streamEditor != null) {
            }
                List<StreamValueManagerDescriptor> managers = new ArrayList<>(streamManagers.keySet());
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                new VoidProgressMonitor(),
            if (entry.getValue() == matchType) {

            super(content);
                        editorControl.dispose();
            // It is a string
                Rectangle bounds = toolItem.getBounds();
                store.setValue(PROP_VALUE_MANAGER + '.' + makeValueId(false), managerId);
            if (curStreamManager == null)
            // Check if existing manager is valid for the current value
        final Object content = valueController.getValue();
                try {
    @Override
            }

                monitor.subTask("Load LOB value");

                } catch (DBException e) {
    private StreamValueManagerDescriptor findManager(IStreamValueManager.MatchType matchType) {
                    );
            return content;
    private void runSreamManagerDetector(final DBDContent content, Composite editPlaceholder) {
                new StringContent(
                } catch (Throwable e) {
        } else if (content instanceof DBDContent) {

            }
    }
            }
            toolbarManager = manager;
        }
        protected Composite editPlaceholder;
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (curStreamManager == null) {
                curStreamManager = findManager(IStreamValueManager.MatchType.DEFAULT);
    }
    }
        detectCurrentStreamManager(savedManagerId);
                    Object itemData = item.getData();
                    loadStringStreamManagers();
        public void runWithEvent(Event event) {
import org.eclipse.swt.graphics.Font;
        return null;
                        valueController.getValueSite(),
        return !(valueController.getValue() instanceof DBDContent);
        public void widgetDefaultSelected(SelectionEvent e) {
    }
            return;
            } else if (streamEditor == null) {
                        streamEditor.disposeEditor();
import org.jkiss.dbeaver.ui.data.registry.ValueManagerRegistry;
    public void setCurrentStreamManager(@NotNull StreamValueManagerDescriptor newManager) {
            } else {
            return dsId + ":" + valueId;
    private Control editorControl;
    @Override
                    return editPlaceholder;
import org.eclipse.core.runtime.IAdaptable;
            super(content);

            }
            try {
                    try {

        }
package org.jkiss.dbeaver.ui.data.editors;
        editorControl = streamEditor.createControl(valueController);
import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetHandlerSwitchContentViewer;
/*
                Composite ph = control instanceof Composite ? (Composite) control : valueController.getEditPlaceholder();
        if (controller.getExecutionContext() != null) {
            if (valueController.getExecutionContext() != null) {
            streamEditor = null;
import org.jkiss.dbeaver.ui.*;
        }
        final Object content = valueController.getValue();
            valueType = ((DBDAttributeBinding) valueType).getAttribute();
import org.eclipse.swt.events.SelectionListener;

                    final CommandContributionItemParameter parameters = new CommandContributionItemParameter(
                Point point = toolItem.getParent().toDisplay(bounds.x, bounds.y + bounds.height);
    }

    @Nullable
                monitor.subTask("Prime LOB value");
import org.jkiss.dbeaver.model.struct.DBSObject;
            try {
                }
                if (curStreamManager != null) {
                if (item.getSelection()) {
                managers.sort(Comparator.comparing(StreamValueManagerDescriptor::getLabel));
                } catch (DBCException e) {
            }
        public void completeLoading(DBDContent result) {
                    if (streamEditor != null) {
        }

        }
        @Override
                monitor.done();
        if (toolbarManager != null) {
    }



            // If not, update current stream manager

 * limitations under the License.
        if (curStreamManager == null) {
            StringContent stringContent = new StringContent(
            streamEditor.primeEditorValue(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.data.DBDContent;
            }
        if (streamEditor != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Override
            super.completeLoading(result);
        final Object content = valueController.getValue();
            String dsId = "unknown";
            valueController.showMessage("NULL content value. Must be DBDContent.", DBPMessageType.ERROR);
    protected void primeEditorValue(@Nullable final Object value, boolean loadInService) throws DBException {
            final DBPPreferenceStore store = controller.getExecutionContext().getDataSource().getContainer().getPreferenceStore();
                try {

            }
        public DBDContent evaluate(@NotNull DBRProgressMonitor monitor) {
            streamEditor.disposeEditor();
    public void dispose() {
import org.jkiss.dbeaver.model.exec.DBCException;
            return UIUtils.createInfoLabel(editPlaceholder, "No Editor");
            if (loadInService) {
            if (valueController.getExecutionContext() != null) {
                }

            }

                    parameters.parameters = Map.of(
            return;

        if (isStringValue()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (Map.Entry<StreamValueManagerDescriptor, IStreamValueManager.MatchType> entry : streamManagers.entrySet()) {
                        editorControl = null;
                    }
                    valueController.getExecutionContext(), CommonUtils.toString(content)));
        if (streamEditor == null) {
        streamManagers = ValueManagerRegistry.getInstance().getApplicableStreamManagers(monitor, valueController.getValueType(), content);
            if (streamManagers != null && !streamManagers.containsKey(curStreamManager)) {
    }

    }
import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;
    public ContentPanelEditor(IValueController controller) {
import org.jkiss.dbeaver.model.DBUtils;
                    valueController.showMessage(e.getMessage(), DBPMessageType.ERROR);
    private class ContentLoadVisualizer extends ProgressLoaderVisualizer<DBDContent> {
                        CommandContributionItem.STYLE_RADIO
                if (toolbarManager instanceof ToolBarManager) {

            }

        if (curStreamManager == newManager) {
        if (curStreamManager != null) {
        public Object getFamily() {
    private volatile StreamValueManagerDescriptor curStreamManager;
        LoadingJob.createService(
import org.eclipse.ui.menus.CommandContributionItemParameter;

    }
    abstract class ContentLoaderService extends AbstractLoadService<DBDContent> {
                menu.setVisible(true);
        public void widgetSelected(SelectionEvent e) {
                log.warn("NULL content value. Must be DBDContent.");
                toolbarManager.update(true);
    @Override

    }
                return entry.getKey();
import org.jkiss.utils.CommonUtils;
        }

            // Save manager setting for current attribute
    private String makeValueId(boolean includeDataSource) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;


    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
            this.editPlaceholder.layout(true);

        }
                            setCurrentStreamManager(newManager);
                toolBar.addDisposeListener(e -> menu.dispose());
        detectCurrentStreamManager(savedManagerId);
        }
    public <T> T getAdapter(Class<T> adapter) {
        @Override
 * Unless required by applicable law or agreed to in writing, software
                ((ToolBarManager) toolbarManager).getControl().setRedraw(false);
                curStreamManager = findManager(IStreamValueManager.MatchType.PRIMARY);
                menu.dispose();
        }
            }
    }
                        manager.getId()
                }
                valueController.showMessage(CommonUtils.notEmpty(e.getMessage()), DBPMessageType.ERROR);

        for (Map.Entry<StreamValueManagerDescriptor, IStreamValueManager.MatchType> entry : streamManagers.entrySet()) {
import org.eclipse.ui.menus.CommandContributionItem;
                        }
        return streamEditor;
        } else {
    private Control createStreamManagerControl(Composite editPlaceholder) {
            // Lazy toolbar initialization
    {
                    log.debug(e);
                return ((IAdaptable) streamEditor).getAdapter(adapter);
            return valueController.getExecutionContext();
    public IStreamValueEditor<Control> getStreamEditor() {
            }
        public void completeLoading(DBDContent result) {
            curStreamManager = findManager(IStreamValueManager.MatchType.EXCLUSIVE);
        cfgItem.setMode(ActionContributionItem.MODE_FORCE_TEXT);

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        }
            monitor.beginTask("Detect appropriate editor", 1);
        public StreamValueLoadService(DBDContent content) {
                valueId = DBUtils.getObjectFullName(object.getParentObject(), DBPEvaluationContext.DDL) + ":" + valueId;
import org.jkiss.dbeaver.DBException;
            if (curStreamManager == null) {

            final String managerId = curStreamManager.getId();
            if (streamEditor instanceof IAdaptable) {

    private void detectCurrentStreamManager(String savedManagerId) throws DBException {
    private StreamValueManagerDescriptor findManager(String id) {
                    item.setSelection(item.getData() == curStreamManager);

            this.content = content;
import org.jkiss.dbeaver.model.impl.data.StringContent;
        StreamManagerDetectService loadingService = new StreamManagerDetectService(content);
                    if (editorControl != null) {
        }
import org.jkiss.code.Nullable;

        String valueId;
import org.eclipse.jface.action.*;
        }
                menu = new Menu(toolBar);
            } finally {
            final String managerId = store.getString(PROP_VALUE_MANAGER + '.' + makeValueId(false));
                }
                MenuManager menuManager = new MenuManager();
    }
                    .schedule();
            return menu;
                valueController.getExecutionContext(), null);
        } else if (content == null) {
            // Editor not yet initialized
                if (item.getData() instanceof StreamValueManagerDescriptor) {
            Control editorControl = createStreamManagerControl(this.editPlaceholder);
                        streamEditor = null;
        public StreamValueLoadVisualizer(StreamValueLoadService loadingService, Composite parent) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    private void detectStreamManager(DBRProgressMonitor monitor, DBDContent content) throws DBException {
                ((DBDContent) content)
        }
                    }
    private static final Log log = Log.getLog(ContentPanelEditor.class);
                log.error(e);
        }
            }
                new VoidProgressMonitor(),

    public void primeEditorValue(@Nullable final Object value) throws DBException
    }
                try {
                    }
                curStreamManager = findManager(IStreamValueManager.MatchType.APPLIES);
