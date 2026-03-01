    boolean isDirty();

 * Copyright (C) 2010-2025 DBeaver Corp and others
    void deactivatePanel();
import org.eclipse.swt.widgets.Control;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
}

 * You may obtain a copy of the License at
public interface IResultSetPanel extends IActionContributor {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.controls.resultset;
 * See the License for the specific language governing permissions and

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * DBeaver - Universal Database Manager
/*
import org.jkiss.dbeaver.ui.editors.IActionContributor;
 * ResultSet panel.
    Control createContents(IResultSetPresentation presentation, Composite parent);
    void activatePanel();


    void setFocus();
import org.eclipse.swt.widgets.Composite;
 * RSV can embed multiple panels to provide additional visualization functionality
 *
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
    void refresh(boolean force);
 * limitations under the License.
    boolean needsSeparator();

 */

/**

 *
