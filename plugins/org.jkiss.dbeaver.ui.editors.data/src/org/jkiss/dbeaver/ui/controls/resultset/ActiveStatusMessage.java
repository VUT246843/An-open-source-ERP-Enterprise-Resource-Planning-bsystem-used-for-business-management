            actionItem.setEnabled(isActionEnabled());
            if (!messageText.isDisposed() && !CommonUtils.isEmpty(message) && !CommonUtils.equalObjects(getMessage(), message)) {
            return monitor;
}
import org.eclipse.swt.events.SelectionListener;
        ToolBar tb = new ToolBar(this, SWT.FLAT | SWT.HORIZONTAL);
        super(parent, SWT.NONE);
import org.jkiss.dbeaver.ui.LoadingJob;
import org.eclipse.swt.widgets.Text;
 */
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        private boolean completed;
        return messageText.getText();
        messageText.setText(message);
import org.eclipse.swt.widgets.ToolItem;
            }
        layout.horizontalSpacing = 1;
 *
        messageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    protected abstract boolean isActionEnabled();
        }
        @Override
import org.jkiss.dbeaver.ui.css.CSSUtils;
 */
import org.jkiss.dbeaver.ui.UIIcon;

                loadService.cancel();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            loadService,

    public String getMessage() {
import org.eclipse.swt.layout.GridLayout;

    public void setMessage(@NotNull String message) {

        layout.marginHeight = 0;
            }
                actionItem.setImage(actionImage);
        loadService = createLoadService();
        } else {
    public void updateActionState() {
    @NotNull
import org.eclipse.swt.widgets.Composite;
        if (!actionItem.isDisposed()) {

        @Nullable final ResultSetViewer viewer
        // Toolbar
        }
    public void executeAction(boolean showErrors) {
package org.jkiss.dbeaver.ui.controls.resultset;
                log.debug(e.getTargetException());
            messageText.setBackground(null);

            loadService = null;
                setMessage(message);
            return;
        }
import org.eclipse.swt.layout.GridData;
        if (RuntimeUtils.isWindows()) {
        @NotNull String actionText,
/**

            actionItem.setImage(DBeaverIcons.getImage(UIIcon.CLOSE));
        actionItem = new ToolItem(tb, SWT.PUSH);
 *
    ) {
            messageText.setBackground(parent.getBackground());
 * You may obtain a copy of the License at
            completed = true;
            TextEditorUtils.enableHostEditorKeyBindingsSupport(viewer.getSite(), this.messageText);
    private ILoadService<String> loadService;
        @NotNull Composite parent,
        messageText = new Text(this, SWT.READ_ONLY);
 * limitations under the License.

abstract class ActiveStatusMessage extends Composite {
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
import org.jkiss.dbeaver.model.runtime.load.ILoadService;

        actionItem.setImage(actionImage);
    protected abstract ILoadService<String> createLoadService();
    public ActiveStatusMessage(
        layout.marginWidth = 0;

import org.eclipse.swt.widgets.ToolBar;
 * DBeaver - Universal Database Manager
        }
 * See the License for the specific language governing permissions and
        }
 * Active status label
import org.jkiss.dbeaver.ui.UIUtils;
        this.actionImage = actionImage;
            return completed || isDisposed();
import org.eclipse.swt.graphics.Image;
            } catch (InvocationTargetException e) {
            UIUtils.addDefaultEditActionsSupport(viewer.getSite(), this.messageText);
        if (viewer != null) {
        }
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
/*
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;

            try {
        @Override
    private static final Log log = Log.getLog(ActiveStatusMessage.class);
        @Override
import java.lang.reflect.InvocationTargetException;
import org.eclipse.swt.SWT;
        service.schedule();
        if (messageText.isDisposed()) {
            loadService = null;
    private final ToolItem actionItem;
        this.setLayout(layout);
 *     http://www.apache.org/licenses/LICENSE-2.0
        actionItem.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> executeAction(true)));
        public void completeLoading(String message) {
        CSSUtils.markConnectionTypeColor(this);
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others

 * you may not use this file except in compliance with the License.
        );
    }
    }
            new LoadVisualizer()
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;

    }
        service.setShowErrors(showErrors);

        @Override
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
        GridLayout layout = new GridLayout(2, false);
        actionItem.setToolTipText(actionText);
                getParent().layout(true, true);
        public void visualizeLoading() {
    }

        LoadingJob<String> service = LoadingJob.createService(
    private class LoadVisualizer implements ILoadVisualizer<String> {

 *
        public boolean isCompleted() {

    }
import org.jkiss.code.Nullable;

        @Nullable Image actionImage,
    }
        }
    private final Image actionImage;
        public DBRProgressMonitor overwriteMonitor(DBRProgressMonitor monitor) {
        if (loadService != null) {

    private final Text messageText;
