    @Override
        return true;
import org.eclipse.swt.widgets.Composite;
            SWT.NONE,
            composite,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * DBeaver - Universal Database Manager
        if (hSpan > 1) {
 *
        StringBuilder tip = new StringBuilder();
/**

import org.jkiss.dbeaver.model.DBIcon;
    }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        tip.append(UIConnectionMessages.dialog_setting_ssl_configurator_label_description + "\n");
/*
            hSpan
            gd.horizontalSpan = hSpan;
        UIUtils.createInfoLabel(
    protected void createSSLConfigHint(Composite composite, boolean optional, int hSpan) {

 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Label;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (optional) {
    public void resetSettings(@NotNull DBWHandlerConfiguration configuration) {
        }
            UIConnectionMessages.dialog_setting_ssl_configurator_label_note,
 */

import org.jkiss.dbeaver.ui.AbstractObjectPropertyConfigurator;
 * limitations under the License.
    }
        Label tipLabel = new Label(composite, SWT.WRAP);
 *
 */
 * SSL configuration
        }

            tipLabel.setLayoutData(gd);
        tipLabel.setText(tip.toString());

package org.jkiss.dbeaver.ui.dialogs.net;
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.eclipse.swt.SWT;
    @Override

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.UIUtils;
        );
public abstract class SSLConfiguratorAbstractUI extends AbstractObjectPropertyConfigurator<Object, DBWHandlerConfiguration> {
 * Licensed under the Apache License, Version 2.0 (the "License");
            tip.append(UIConnectionMessages.dialog_setting_ssl_configurator_label_optional + "\n");
    public boolean isComplete() {
 *

import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import org.eclipse.swt.layout.GridData;
