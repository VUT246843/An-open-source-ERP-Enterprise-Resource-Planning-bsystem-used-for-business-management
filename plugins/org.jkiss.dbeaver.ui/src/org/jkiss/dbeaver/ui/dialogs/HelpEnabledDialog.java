 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Control;
 * DBeaver - Universal Database Manager
        return contents;
 * limitations under the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
    protected HelpEnabledDialog(Shell shell, String helpContextID)
//    }
 * Unless required by applicable law or agreed to in writing, software

//            PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_LCL_LINKTO_HELP)
 * Dialog with enabled help
        this.helpContextID = helpContextID;
    {
//    protected Button createHelpButton(Composite parent)
 * See the License for the specific language governing permissions and
        UIUtils.setHelp(contents, helpContextID);
    protected boolean isResizable() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override


 *
package org.jkiss.dbeaver.ui.dialogs;
    protected final String helpContextID;
//    {
import org.eclipse.swt.widgets.Shell;
 *
//        );
/*
        final Control contents = super.createContents(parent);

 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    @Override
    protected Control createContents(Composite parent)
    }

import org.jkiss.dbeaver.ui.UIUtils;
 */
    }
import org.eclipse.swt.widgets.Composite;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(shell, null, null);
//        final Button button = createButton(parent, IDialogConstants.HELP_ID, IDialogConstants.HELP_LABEL, false);

}
    	return true;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//        button.setImage(
public abstract class HelpEnabledDialog extends BaseDialog {
    {
 *
 * You may obtain a copy of the License at

//        return button;
