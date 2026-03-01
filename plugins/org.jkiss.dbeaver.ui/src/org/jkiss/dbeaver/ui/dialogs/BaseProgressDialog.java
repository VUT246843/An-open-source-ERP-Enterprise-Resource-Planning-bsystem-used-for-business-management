
        //ControlEnableState pageEnableState = ControlEnableState.disable(mainComposite);
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
                getShell().getDisplay());
        gd.verticalIndent = 0;
                monitorPart,
    protected Composite createDialogArea(Composite parent) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
        super(parentShell, title, icon);
        mainComposite = super.createDialogArea(parent);
    public void run(boolean fork, boolean cancelable, DBRRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                monitorPart.done();
import org.eclipse.swt.widgets.Shell;
import org.jkiss.dbeaver.model.DBPImage;
 * DBeaver - Universal Database Manager
    private Composite mainComposite;
                monitorPart.setVisible(false);
                ((GridData)monitorPart.getLayoutData()).exclude = true;
    }
            buttonsEnableState.restore();

                super.setCanceled(b);
            if (monitorPart != null) {
        gd.horizontalIndent = 20;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        return mainComposite;
    public BaseProgressDialog(Shell parentShell, String title, @Nullable DBPImage icon) {
        } finally {
        // Horizontal separator
        }
        }


 *
 * See the License for the specific language governing permissions and
            monitorPart.getParent().layout();
        gd.grabExcessHorizontalSpace = true;
        };

            monitorPart.setVisible(true);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.eclipse.jface.dialogs.ControlEnableState;
    @Override
            }
    private ProgressMonitorPart monitorPart;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    cancelCurrentOperation();
import java.lang.reflect.InvocationTargetException;

            }
            runningOperations++;
        if (monitorPart != null) {
import org.eclipse.jface.operation.ModalContext;
            ModalContext.run(monitor ->
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                monitorPart.getParent().layout();

            runningOperations--;
 */
package org.jkiss.dbeaver.ui.dialogs;

            @Override
        return super.createButtonBar(parent);
                runnable.run(new DefaultProgressMonitor(monitor)),
    }
    protected void cancelCurrentOperation() {
            //pageEnableState.restore();
 * You may obtain a copy of the License at
        ControlEnableState buttonsEnableState = ControlEnableState.disable(getButtonBar());
        monitorPart.setVisible(false);
        gd.exclude = true;
/**

    }
import org.eclipse.swt.widgets.Composite;
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.eclipse.swt.layout.GridData;
public class BaseProgressDialog extends BaseDialog implements DBRRunnableContext {
        try {
                true,

}
    protected Control createButtonBar(@NotNull Composite parent) {
 *
 */
import org.eclipse.swt.widgets.Control;
                }

            public void setCanceled(boolean b) {
        monitorPart.setLayoutData(gd);

 * you may not use this file except in compliance with the License.
        // Progress monitor
            ((GridData)monitorPart.getLayoutData()).exclude = false;
    @Override

//            .setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
import org.eclipse.jface.wizard.ProgressMonitorPart;

            monitorPart.attachToCancelComponent(null);
    private int runningOperations;
                if (b) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 *
import org.jkiss.code.NotNull;
//        new Label(mainComposite, SWT.HORIZONTAL | SWT.SEPARATOR)
        // Code copied from WizardDialog
        monitorPart = new ProgressMonitorPart(mainComposite, null, true) {
    }
/*
 * BaseProgressDialog
import org.jkiss.code.Nullable;
