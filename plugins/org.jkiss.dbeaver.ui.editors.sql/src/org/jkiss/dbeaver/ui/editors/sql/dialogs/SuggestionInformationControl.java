        return this.objectInformationView.hasContents();
 * Licensed under the Apache License, Version 2.0 (the "License");

}

        this.objectInformationView.createContent(parent);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * Unless required by applicable law or agreed to in writing, software



 *
        super(parentShell, isResizable);
    public boolean hasContents() {
 *
    @Override
 *
    }
 * limitations under the License.
    public SuggestionInformationControl(Shell parentShell, boolean isResizable) {
    }
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
import org.eclipse.jface.text.AbstractInformationControl;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.text.IInformationControlExtension2;
        this.objectInformationView = new ObjectInformationView();
    }
        create();
    @Override
        this.objectInformationView.setInput(input);
import org.jkiss.dbeaver.ui.editors.sql.util.ObjectInformationView;
import org.eclipse.swt.widgets.Composite;
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
    public void setInput(Object input) {
 *     http://www.apache.org/licenses/LICENSE-2.0


 * distributed under the License is distributed on an "AS IS" BASIS,
public class SuggestionInformationControl extends AbstractInformationControl implements IInformationControlExtension2 {
    private ObjectInformationView objectInformationView;
    @Override
 * DBeaver - Universal Database Manager
    protected void createContent(Composite parent) {

 * you may not use this file except in compliance with the License.
    }
