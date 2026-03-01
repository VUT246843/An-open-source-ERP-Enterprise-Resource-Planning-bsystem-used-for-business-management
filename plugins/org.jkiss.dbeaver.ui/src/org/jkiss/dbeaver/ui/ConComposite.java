
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.css.CSSUtils;
import org.eclipse.swt.layout.GridLayout;
}
 *


    }
package org.jkiss.dbeaver.ui;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setGridLayout(int columns) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 * You may obtain a copy of the License at
    }
 * limitations under the License.
        this.setLayout(gl);

 *
        gl.marginHeight = 0;
public class ConComposite extends Composite {
        super(parent, style);
import org.eclipse.swt.widgets.Composite;
 */
    }
    public ConComposite(@NotNull Composite parent, int style) {
        CSSUtils.markConnectionTypeColor(this);
        gl.marginWidth = 0;
    public ConComposite(@NotNull Composite parent) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
        this(parent, SWT.NONE);
import org.eclipse.swt.SWT;
        GridLayout gl = new GridLayout(columns, false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 *

