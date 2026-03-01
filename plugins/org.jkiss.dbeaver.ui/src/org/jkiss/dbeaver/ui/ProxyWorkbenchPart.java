    }
    private final IWorkbenchPart part;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    public Image getTitleImage() {
    }
    public ProxyWorkbenchPart(IWorkbenchPart part) {
    @Override
*/
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPropertyListener;
    public void dispose() {

        part.createPartControl(parent);
        return part.getAdapter(adapter);
    @Override
 *
    }
        return part.getTitleToolTip();
        return part.getSite();
package org.jkiss.dbeaver.ui;
        return part.getTitleImage();
        return part.getTitle();

        part.addPropertyListener(listener);

    }
    }

        part.setFocus();
 * you may not use this file except in compliance with the License.
    @Override
    @Override
 * Unless required by applicable law or agreed to in writing, software
    @Override
/**
 *     http://www.apache.org/licenses/LICENSE-2.0


* ProxyWorkbenchPart
    }
    public void addPropertyListener(IPropertyListener listener) {
    }


    @Override
    public void createPartControl(Composite parent) {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
/*
    public void removePropertyListener(IPropertyListener listener) {
    public IWorkbenchPartSite getSite() {
    }
import org.eclipse.swt.graphics.Image;

 */

    }
    public <T> T getAdapter(Class<T> adapter) {
 *
    public String getTitle() {
    public void setFocus() {
}
    @Override

 *
        part.removePropertyListener(listener);
 * limitations under the License.
public class ProxyWorkbenchPart implements IWorkbenchPart {
    public String getTitleToolTip() {
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.ui.IWorkbenchPart;
        part.dispose();
 * You may obtain a copy of the License at
    @Override

import org.eclipse.ui.IWorkbenchPartSite;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        this.part = part;
