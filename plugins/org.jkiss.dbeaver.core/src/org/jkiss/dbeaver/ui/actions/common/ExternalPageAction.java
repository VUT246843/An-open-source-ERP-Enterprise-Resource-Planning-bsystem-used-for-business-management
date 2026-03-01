import org.jkiss.dbeaver.model.DBIcon;
        super(title, DBeaverIcons.getImageDescriptor(icon));
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.DBeaverIcons;
public class ExternalPageAction extends Action {
import org.jkiss.dbeaver.ui.UIUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 *
    public ExternalPageAction(String title, DBIcon icon, String url) {
 * See the License for the specific language governing permissions and

 */
    private final String url;
        this.url = url;
 * DBeaver - Universal Database Manager

 * limitations under the License.
 *
import org.eclipse.jface.action.Action;
        UIUtils.openWebBrowser(url);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
package org.jkiss.dbeaver.ui.actions.common;
 *
    }
    }
}

 * Licensed under the Apache License, Version 2.0 (the "License");
    public void run() {
