    private void updateUI() {
        data.widthHint = widthHint;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.jface.action.IContributionManager;

    public StatusLineContributionItemEx(String id) {
    @Override
        this.text = LegacyActionTools.escapeMnemonics(text);
        if (toolTip != null) {
        }
    }
        // compute the size of the label to get the width hint for the contribution

import org.eclipse.swt.widgets.Label;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            });
import org.eclipse.jface.action.LegacyActionTools;
import org.eclipse.swt.custom.CLabel;
        Point preferredSize = label.computeSize(SWT.DEFAULT, SWT.DEFAULT);
                    doubleClickListener.run();
}
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.swt.events.MouseEvent;
        label = new CLabel(parent, SWT.SHADOW_NONE);
        int heightHint = preferredSize.y;

    public void setDoubleClickListener(Runnable doubleClickListener) {
    private Runnable doubleClickListener;
 * See the License for the specific language governing permissions and
import org.eclipse.core.runtime.Assert;
        updateUI();
    private int maxWidth = 0;
        IContributionManager contributionManager = getParent();

            label.setToolTipText(toolTip);
        if (label != null && !label.isDisposed()) {

    }
    }
 * You may obtain a copy of the License at
        maxWidth = widthHint;
 * you may not use this file except in compliance with the License.
    }
package org.jkiss.dbeaver.ui.controls;
        super(id);

        if (contributionManager != null) {
        this.toolTip = text;
        setVisible(false); // no text to start with

        if (doubleClickListener != null) {

    private String toolTip = "";
import org.eclipse.swt.widgets.Composite;
            label.setText(this.text);
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        StatusLineLayoutData data = new StatusLineLayoutData();
            label.addMouseListener(new MouseAdapter() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        Label sep = new Label(parent, SWT.SEPARATOR);
import org.eclipse.jface.action.StatusLineLayoutData;
 * limitations under the License.
 *
import org.eclipse.swt.SWT;
        setVisible(true);
    private String text = "";
 * Unless required by applicable law or agreed to in writing, software
            label.setToolTipText(toolTip);
 *
        }
        label.setText(text);
        }
        label.setLayoutData(data);
        int widthHint = Math.max(maxWidth, preferredSize.x);
import org.eclipse.jface.action.ContributionItem;
public class StatusLineContributionItemEx extends ContributionItem {
                }

 * Status line contribution
import org.eclipse.swt.graphics.Point;


        data.heightHint = heightHint;

/**
                public void mouseDoubleClick(MouseEvent e) {
 */
 * DBeaver - Universal Database Manager
        updateUI();
 *
/*
    }
    }

        }
    public void setText(String text) {
        this.doubleClickListener = doubleClickListener;
        if (label != null && !label.isDisposed()) {
    public void setToolTip(String text) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private CLabel label;
        }
    public void fill(Composite parent) {
                @Override

        Assert.isNotNull(text);
        sep.setLayoutData(data);
        data = new StatusLineLayoutData();


            contributionManager.update(true);
