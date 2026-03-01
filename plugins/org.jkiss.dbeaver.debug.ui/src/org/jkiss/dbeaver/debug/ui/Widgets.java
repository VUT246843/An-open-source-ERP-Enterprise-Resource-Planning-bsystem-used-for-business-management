    }
    public static Composite createComposite(Composite parent, int columns, int hspan, int fill) {
 *
        GridData gd = new GridData(fill);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        layout.marginWidth = marginwidth;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.graphics.Font;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        g.setLayoutData(gd);
 * Unless required by applicable law or agreed to in writing, software
        GridData gd = new GridData(fill);
import org.eclipse.swt.SWT;
        return g;
 * See the License for the specific language governing permissions and
        layout.marginHeight = marginheight;
    public static Composite createComposite(Composite parent, Font font, int columns, int hspan, int fill, int marginwidth, int marginheight) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        g.setFont(parent.getFont());
        gd.horizontalSpan = hspan;
 */

//FIXME:AF: looks poor anyway, provide fluent-style API
}
//FIXME:AF: migrate to org.jkiss.dbeaver.runtime.ui bundle, to extract widget creation from UIUtils

        Composite g = new Composite(parent, SWT.NONE);
        g.setLayout(new GridLayout(columns, false));
public class Widgets {
 *
        gd.horizontalSpan = hspan;
package org.jkiss.dbeaver.debug.ui;
        Composite g = new Composite(parent, SWT.NONE);
 * you may not use this file except in compliance with the License.

        GridLayout layout = new GridLayout(columns, false);
 * DBeaver - Universal Database Manager
        g.setLayoutData(gd);
        g.setFont(font);
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Composite;
 *
        return g;
import org.eclipse.swt.layout.GridLayout;
        g.setLayout(layout);
 * You may obtain a copy of the License at
import org.eclipse.swt.layout.GridData;
    }
