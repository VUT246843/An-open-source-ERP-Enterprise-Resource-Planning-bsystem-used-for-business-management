        //        composite get applied to the inner one instead.
    @NotNull

        return new Combo(parent, style);
 * Licensed under the Apache License, Version 2.0 (the "License");

        //        all layout operations that are supposed to be applied to the outer
import org.eclipse.jface.widgets.TextFactory;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
}
    private UIControlFactory() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    static Composite createTitledComposite(@NotNull Composite parent, @NotNull String text) {
    }
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    }
    @NotNull
        return LabelFactory.newLabel(style)
    static Text createText(@NotNull Composite parent, int style) {
    static ExpandableComposite createExpandableComposite(@NotNull Composite parent) {
import org.jkiss.code.NotNull;
 * Manages creation of UI controls for forms.
    static Label createLabel(@NotNull Composite parent, int style, @NotNull String text) {
import org.eclipse.jface.widgets.ButtonFactory;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
            .create(parent);
            .text(text)
 * you may not use this file except in compliance with the License.
        return TextFactory.newText(style)
import org.eclipse.jface.widgets.CompositeFactory;
    @NotNull
    @NotNull
package org.jkiss.dbeaver.ui.forms;
        return CompositeFactory.newComposite(SWT.NONE)
    }
        //        and the inner one is returned from the function to be populated,
import org.eclipse.swt.SWT;
            .create(parent);
    }
            .create(parent);


import org.jkiss.dbeaver.ui.UIUtils;
        return ButtonFactory.newButton(style)
 * DBeaver - Universal Database Manager
import org.eclipse.swt.widgets.*;
    }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
        return UIUtils.createExpandableCompositeWithSeparator(parent, ExpandableComposite.CLIENT_INDENT, ExpandableComposite.TWISTIE);
    static Button createButton(@NotNull Composite parent, int style, @NotNull String text) {
    }
 */
 * You may obtain a copy of the License at
    static Composite createComposite(@NotNull Composite parent) {
/*
/**
        return UIUtils.createTitledComposite(parent, text, 1);
    static Combo createCombo(@NotNull Composite parent, int style) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
final class UIControlFactory {
            .create(parent);
 * See the License for the specific language governing permissions and
 *


    @NotNull
 *


        // FIXME: Bug! Since titled composite is implemented as two nested composites
    @NotNull
            .text(text)
import org.eclipse.jface.widgets.LabelFactory;
