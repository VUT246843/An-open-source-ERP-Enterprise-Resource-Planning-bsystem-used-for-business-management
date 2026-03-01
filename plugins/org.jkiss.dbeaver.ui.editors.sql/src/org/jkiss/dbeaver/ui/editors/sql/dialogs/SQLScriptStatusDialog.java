        progressPanel.getParent().layout();
            objectTree.setSelection(item);
    @Override


        finishLabel.setLayoutData(gd);
    }
 * you may not use this file except in compliance with the License.
    protected IDialogSettings getDialogBoundsSettings() {
        processedCount++;
                job.cancel();
    }
            TreeItem item = new TreeItem(objectTree, SWT.NONE);
            if (error != null) {
        progressBar.setMaximum(this.objects.size());
            progressPanel,
import org.jkiss.dbeaver.ui.BaseThemeSettings;
    }
    }
        this.open();
            item.setText(0, DBUtils.getObjectFullName(object, DBPEvaluationContext.UI));

    @Override
    protected void createStatusColumns(Tree objectTree) {

 * Unless required by applicable law or agreed to in writing, software

    private Tree objectTree;
        final Button stopButton = UIUtils.createPushButton(
        getButton(IDialogConstants.CLOSE_ID).setEnabled(true);

}
    protected void createButtonsForButtonBar(Composite parent) {
        });

 * Licensed under the Apache License, Version 2.0 (the "License");
    private ProgressBar progressBar;
        progressBar = new ProgressBar(progressPanel, SWT.HORIZONTAL);
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.jface.dialogs.IDialogConstants;
            @Override
        finishLabel = new Label(composite, SWT.NONE);
        progressBar.setSelection(objectNumber + 1);

        this.job =  job;
    protected TreeItem getTreeItem(T object) {

import org.eclipse.swt.SWT;
            null,
        Button button = createButton(parent, IDialogConstants.CLOSE_ID, IDialogConstants.CLOSE_LABEL, true);

    public void endScriptProcessing() {
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.DBUtils;
        }
import org.jkiss.code.NotNull;
        GridData gd = new GridData(GridData.FILL_BOTH);
        UIUtils.asyncExec(() -> UIUtils.packColumns(objectTree, false, null));
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        finishLabel.setText("Finished");
        gd = new GridData(GridData.FILL_HORIZONTAL);
import org.jkiss.code.Nullable;

    protected void buttonPressed(int buttonId) {
/*
        progressBar.setLayoutData(gd);
                stopButton.setEnabled(false);
        return UIUtils.getTreeItem(objectTree, object);
        createStatusColumns(objectTree);
import org.eclipse.core.runtime.jobs.Job;
        }
        }

import org.eclipse.jface.dialogs.IDialogSettings;
                treeItem.setForeground(1, BaseThemeSettings.instance.colorError);
    }
        }
        objectTree.setHeaderVisible(true);
import org.jkiss.dbeaver.model.exec.DBCStatement;
    }
        objectTree.setLayoutData(gd);
        if (treeItem != null) {
import org.eclipse.swt.widgets.*;
    @Override
        UIUtils.setControlVisible(progressPanel, false);
            item.setData(object);
            }
    private Label finishLabel;
        Composite composite = super.createDialogArea(parent);
import org.jkiss.dbeaver.ui.UIUtils;
 * DBeaver - Universal Database Manager
    {
        super(UIUtils.getActiveWorkbenchShell(), title, image);


        UIUtils.setControlVisible(finishLabel, true);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private Job job;
    @Override
        TreeItem item = getTreeItem(object);
    @Override
        nameColumn.setText("Object");
            okPressed();
    }
 */
import org.eclipse.ui.ISharedImages;
        stopButton.addSelectionListener(new SelectionAdapter() {

import org.jkiss.dbeaver.model.exec.DBCException;
        gd.heightHint = 200;
        UIUtils.packColumns(objectTree, false, null);
        if (buttonId == IDialogConstants.CLOSE_ID) {
        this.objects = objects;
    }
 * limitations under the License.
            }
public abstract class SQLScriptStatusDialog<T extends DBSObject> extends BaseDialog implements SQLScriptProgressListener<T> {
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    }
    public void processObjectResults(@NotNull T object, @Nullable DBCStatement statement, @Nullable DBCResultSet resultSet) throws DBCException {

            public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    }
        Composite progressPanel = UIUtils.createPlaceholder(composite, 2, 5);
        finishLabel.setText("Finished - " + processedCount + " object(s) processed");

            treeItem.setText(1, error == null ? "Done" : error.getMessage());
    public void beginObjectProcessing(@NotNull T object, int objectNumber) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
            return;
        } else {
        button.setEnabled(false);
        return composite;
            super.buttonPressed(buttonId);
    public void endObjectProcessing(@NotNull T object, Exception error) {


        if (getShell().isDisposed()) {
        gd.exclude = true;
    protected SQLScriptStatusDialog(String title, @Nullable DBPImage image)

    }
import org.eclipse.swt.events.SelectionEvent;

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import java.util.Collection;
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
        progressPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        progressBar.setMinimum(0);
import org.eclipse.swt.layout.GridData;

        gd.widthHint = 500;
    private int processedCount;
        }
        for (T object : objects) {
        objectTree = new Tree(composite, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
        TreeColumn nameColumn = new TreeColumn(objectTree, SWT.NONE);

 *
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
        objectTree.setLinesVisible(true);
    protected Composite createDialogArea(Composite parent) {
    @Override


    public void beginScriptProcessing(Job job, Collection<T> objects) {
    }
        Composite progressPanel = progressBar.getParent();
import org.jkiss.dbeaver.model.struct.DBSObject;
    private Collection<T> objects;
    private static final String DIALOG_ID = "SQLScriptStatusDialog";
    @Override
        if (item != null) {
        TreeItem treeItem = getTreeItem(object);
        return UIUtils.getDialogSettings(DIALOG_ID);


            UIUtils.getShardImage(ISharedImages.IMG_ELCL_STOP));

 *
        gd = new GridData(GridData.FILL_HORIZONTAL);
