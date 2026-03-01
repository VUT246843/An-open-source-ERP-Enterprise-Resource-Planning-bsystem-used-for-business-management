
// Source code recreated from a .class file by IntelliJ IDEA
    public CustomCheckBoxFigure() {
        this.label = new Label(text, UNCHECKED);

//

            if (changeEvent.getPropertyName().equals("selected")) {
//
 */
/*
    }
 * limitations under the License.
        });
        this.setContents(this.label);
 *

 * You may obtain a copy of the License at
 *
    }

            }


            this.label.setIcon(CHECKED);
 *

package org.jkiss.dbeaver.ui.editors.erd.figures;
import org.eclipse.swt.graphics.Image;
 * See the License for the specific language governing permissions and
            this.label.setIcon(UNCHECKED);
 * distributed under the License is distributed on an "AS IS" BASIS,
// (powered by Fernflower decompiler)
        this("");
 * Unless required by applicable law or agreed to in writing, software
        setFocusTraversable(false);
                CustomCheckBoxFigure.this.handleSelectionChanged();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    protected void handleSelectionChanged() {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    protected void init() {
    }
}
 * Licensed under the Apache License, Version 2.0 (the "License");
    public CustomCheckBoxFigure(String text) {
    private Label label;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.draw2d.Label;

        } else {
import org.eclipse.draw2d.Toggle;
        }
        if (this.isSelected()) {
        super.init();
    }
import org.jkiss.dbeaver.ui.UIIcon;
public final class CustomCheckBoxFigure extends Toggle {
    private static final Image UNCHECKED = DBeaverIcons.getImage(UIIcon.CHECK_OFF);
 * DBeaver - Universal Database Manager
    private static final Image CHECKED = DBeaverIcons.getImage(UIIcon.CHECK_ON);
        setRequestFocusEnabled(false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.addChangeListener(changeEvent -> {

