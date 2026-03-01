}
        if (extConfigurator != null) {
        if (getContainer() instanceof Window window) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
    @Override
    }
    @Override
import org.eclipse.swt.widgets.Control;
        noDefaultAndApplyButton();
 */
 * You may obtain a copy of the License at
    @Override

 * limitations under the License.
        return true;
import org.jkiss.code.NotNull;
    }
    }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.internal.UIMessages;
    @NotNull
    @Override
            });
    private static final Log log = Log.getLog(AbstractPrefPage.class);
            } catch (Exception e) {
                extConfigurator = configDesc.createConfigurator();


    }
    protected void restartWorkbenchOnPrefChange() {

 * distributed under the License is distributed on an "AS IS" BASIS,

 * DBeaver - Universal Database Manager
            window.close();
    @Override
    }
    }
        if (extConfigurator != null) {
        return content;
        }
            extConfigurator.loadSettings(getConfiguratorObject());
            }

        UIPropertyConfiguratorDescriptor configDesc = UIPropertyConfiguratorRegistry.getInstance().getDescriptor(
 * you may not use this file except in compliance with the License.

    protected void performApply() {
        }
        return super.performCancel();
/**
import org.jkiss.dbeaver.Log;
    void disableButtons() {
            window.getShell().addDisposeListener(e ->
/*
    }

            extConfigurator.resetSettings(getConfiguratorObject());
 * AbstractPrefPage
            try {
    protected abstract Control createPreferenceContent(@NotNull Composite parent);
                UIUtils.asyncExec(restarter));
        final Control content = createPreferenceContent(parent);
                log.error(e);
    }
import org.eclipse.ui.PlatformUI;
    protected Control createContents(Composite parent) {
        if (configDesc != null) {
        }

        super.performDefaults();
    }
        if (extConfigurator != null) {
            restarter.run();
        }
        }
        }
        Runnable restarter = () -> PlatformUI.getWorkbench().restart();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return UIUtils.createLabel(parent, UIMessages.preference_page_no_access);
    protected boolean hasAccessToPage() {
        if (extConfigurator != null) {
import org.eclipse.jface.preference.PreferencePage;



import org.eclipse.jface.window.Window;
public abstract class AbstractPrefPage extends PreferencePage {
            extConfigurator.saveSettings(getConfiguratorObject());
    protected void injectConfigurators(Composite composite) {
        Dialog.applyDialogFont(content);
        }
 *
        return this;
    }
        super.performApply();
package org.jkiss.dbeaver.ui.preferences;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
            extConfigurator.saveSettings(getConfiguratorObject());
        return super.performOk();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;


    public boolean performCancel() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected void performDefaults() {

        } else {
    public boolean performOk() {
    private IObjectPropertyConfigurator<Object, Object> extConfigurator;
            getConfiguratorObject());
 *
        if (!hasAccessToPage()) {


    protected Object getConfiguratorObject() {
            extConfigurator.createControl(composite, getConfiguratorObject(), () -> {
 *

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.dialogs.Dialog;
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;
