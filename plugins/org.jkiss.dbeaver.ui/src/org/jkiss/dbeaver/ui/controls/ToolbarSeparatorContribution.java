        super();
    }
    public static class Horizontal extends ToolbarSeparatorContribution {
 *
    protected Control createControl(Composite parent) {
        this.vertical = vertical;
import org.eclipse.swt.widgets.Control;
        return label;
    }
 * See the License for the specific language governing permissions and
 */
import org.eclipse.swt.widgets.Label;
 * Licensed under the Apache License, Version 2.0 (the "License");
        public Vertical() {
 * DBeaver - Universal Database Manager

        }
        label.setImage(DBeaverIcons.getImage(vertical ? UIIcon.SEPARATOR_V : UIIcon.SEPARATOR_H));
public class ToolbarSeparatorContribution extends WorkbenchWindowControlContribution {

}import org.jkiss.dbeaver.ui.UIIcon;
 *     http://www.apache.org/licenses/LICENSE-2.0
        public Horizontal() {

 * ToolbarSeparatorContribution
 * you may not use this file except in compliance with the License.
    @Override
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *


    }
            super(true);
    private final boolean vertical;
package org.jkiss.dbeaver.ui.controls;
 */
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

    public static class Vertical extends ToolbarSeparatorContribution {
    public ToolbarSeparatorContribution(boolean vertical) {
        }
            super(false);
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
        Label label = new Label(parent, SWT.NONE);//SEPARATOR | (vertical ? SWT.VERTICAL : SWT.HORIZONTAL));
 * You may obtain a copy of the License at
/**
 * limitations under the License.

 *
