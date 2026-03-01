        }

        }
        super.setErrorMessage(newMessage);
    @Override
                            }

            IWorkbenchHelpSystem helpSystem = UIUtils.getActiveWorkbenchWindow().getWorkbench().getHelpSystem();
import org.jkiss.dbeaver.model.DBIcon;
        super(title);


}

import org.eclipse.swt.widgets.Composite;
    }


    protected String getEditError() {
            UIUtils.asyncExec(() -> {

        pageContents.addHelpListener(e -> performHelp());
        return true;
    protected abstract Control createPageContents(Composite parent);

        if (container != null) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.dialogs.DialogPage;
    public boolean edit() {

    public boolean edit(Shell shell) {
            if (helpSystem != null) {
 *
import org.jkiss.dbeaver.DBException;
    @Override
        setControl(pageContents);
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                IContext helpContext = new IContext() {
    }
                String helpContextId = ((IHelpContextIdProvider) this).getHelpContextId();
                container.updateMessage();
    }
        Control pageContents = createPageContents(parent);
public abstract class BaseObjectEditPage extends DialogPage {
    public final void validateProperties() {
 * DBeaver - Universal Database Manager
import org.eclipse.help.IHelpResource;

    public BaseObjectEditPage(String title)

                    @Override
    public abstract DBSObject getObject();
                    public String getText() {
package org.jkiss.dbeaver.ui.editors.object.struct;

                                @Override
        this.container = container;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    {
    }
    }

    public void performFinish() throws DBException {
    public void performHelp() {
import org.jkiss.dbeaver.ui.UIUtils;
    }
                };
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                                }
                        return helpContextId;
    }
    public boolean isPageComplete() {
                                public String getLabel() {
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.help.IWorkbenchHelpSystem;
            });
 * limitations under the License.
    }
import org.eclipse.swt.widgets.Shell;
        super(title, DBeaverIcons.getImageDescriptor(icon));
 * You may obtain a copy of the License at
    public void setErrorMessage(String newMessage) {
 * See the License for the specific language governing permissions and
    }


import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    }
    }
        if (container != null) {
    public void createControl(Composite parent) {
        return null;
                helpSystem.displayHelp(helpContext);
                container.updateButtons();
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected void updatePageState() {
            container.updateMessage();
                            new IHelpResource() {

                                public String getHref() {
import org.jkiss.dbeaver.ui.IHelpContextIdProvider;


        return EditObjectDialog.showDialog(shell, this);
import org.eclipse.swt.widgets.Control;
                    public IHelpResource[] getRelatedTopics() {
/*
                                @Override
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        return EditObjectDialog.showDialog(this);

                    }
    public void setContainer(IDialogPageContainer container) {
import org.jkiss.dbeaver.ui.dialogs.IDialogPageContainer;
    public BaseObjectEditPage(String title, DBIcon icon) {
                    @Override
    }
        if (this instanceof IHelpContextIdProvider) {
                        return new IHelpResource[] {
                                    return helpContextId;
import org.eclipse.help.IContext;
        setErrorMessage(getEditError());
                                }
 *

                                    return helpContextId;
 */
    private IDialogPageContainer container;
                        };
 *
