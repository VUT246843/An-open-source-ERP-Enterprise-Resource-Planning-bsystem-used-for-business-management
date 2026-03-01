 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Control createSupportArea(Composite parent, StatusAdapter statusAdapter) {
import org.eclipse.swt.widgets.Control;
        return text;
 * limitations under the License.
 *
package org.jkiss.dbeaver.ui.dialogs;
 */

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 */

 * See the License for the specific language governing permissions and
import org.eclipse.ui.statushandlers.AbstractStatusAreaProvider;
 *
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
 * Clipboard data
public class ApplicationErrorSupportProvider extends AbstractStatusAreaProvider {
    @Override
        Text text = new Text(parent, SWT.BORDER);
}
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.statushandlers.StatusAdapter;
 * DBeaver - Universal Database Manager
    }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        text.setText("HEY THERE");
import org.eclipse.swt.widgets.Composite;


