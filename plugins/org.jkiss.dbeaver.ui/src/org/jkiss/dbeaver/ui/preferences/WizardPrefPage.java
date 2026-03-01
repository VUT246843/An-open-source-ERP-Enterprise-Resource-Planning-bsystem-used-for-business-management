        }
    private final IPreferencePage preferencePage;
        return preferencePage;
        }
    }
import java.util.ArrayList;
/**

    }
    @Override
            return preferencePage.getTitle();
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public WizardPrefPage(IPreferencePage preferencePage, String title, String description)
    }
import org.jkiss.dbeaver.ui.IDialogPageProvider;

    public WizardPrefPage addSubPage(IPreferencePage page, String title, String description) {
        return wizardPrefPage;

    {
    public WizardPrefPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
}
    @Override
    }
            ((IWorkbenchPropertyPage) page).setElement(((IWorkbenchPropertyPage) preferencePage).getElement());
            return preferencePage.getDescription();
 */
        }
        preferencePage.dispose();
import org.eclipse.jface.preference.IPreferencePage;
    }
    public String getErrorMessage()
        return super.getTitle();
    public void setVisible(boolean visible)
        preferencePage.performHelp();
    @Override
    @Override
        WizardPrefPage wizardPrefPage = new WizardPrefPage(page, title, description);
    @Override
                pageDescription = resourceBundle.getString("page." + pageId + ".description");
    public WizardPrefPage addSubPage(String pageId, Class<?> ownerBundleClass, IPreferencePage page) {
 * Preference page adapter for wizard page


        }
    }

import org.eclipse.jface.preference.IPreferencePageContainer;
        }
            try {
    public void dispose()
        super.dispose();


            // Ignore
        }
    {

    {
    @Override
        if (preferencePage instanceof IWorkbenchPropertyPage && page instanceof IWorkbenchPropertyPage) {
        // Sety the same element to sub page
    {
    public Image getImage()
    }
    {
        setDescription(description);
    }
    @Override
    }
        }
import org.eclipse.ui.IWorkbenchPropertyPage;
    {
    public boolean isPageComplete()
        }
        if (subPages.isEmpty()) {
            Bundle pageBundle = FrameworkUtil.getBundle(ownerBundleClass);
        WizardPrefPage wizardPrefPage = new WizardPrefPage(page, pageName, pageDescription);
import java.util.Locale;
                pageName = resourceBundle.getString("page." + pageId + ".name");
            ((AbstractPrefPage) preferencePage).disableButtons();
        preferencePage.performCancel();
            }
    public String getDescription()
    @Override
    public IPreferencePage getPreferencePage() {
            } catch (Exception e) {
    @Override
            ((IWorkbenchPropertyPage) page).setElement(((IWorkbenchPropertyPage) preferencePage).getElement());

        return addSubPage(pageId, page.getClass(), page);
    @Override
    private final List<WizardPrefPage> subPages = new ArrayList<>();
 * DBeaver - Universal Database Manager

    }
/*
        if (!CommonUtils.isEmpty(preferencePage.getTitle())) {
    {
            wpp.dispose();

import java.util.List;
    }
 * you may not use this file except in compliance with the License.
import org.osgi.framework.FrameworkUtil;
 *
        return subPages.toArray(new WizardPrefPage[0]);

        try {
        preferencePage.setVisible(visible);

    {

    public void performFinish()
        if (preferencePage instanceof AbstractPrefPage) {
        return preferencePage.getErrorMessage();

        this.preferencePage = preferencePage;
        if (getContainer() instanceof IPreferencePageContainer ppc) {
    {

package org.jkiss.dbeaver.ui.preferences;
    }
        preferencePage.createControl(parent);
public class WizardPrefPage extends WizardPage implements IDialogPageProvider {

            } catch (Exception e) {
 *
    {
 * limitations under the License.
    public WizardPrefPage addSubPage(String pageId, IPreferencePage page) {
    public String getMessage()

    public Control getControl()
 * Copyright (C) 2010-2026 DBeaver Corp and others

import org.eclipse.jface.wizard.WizardPage;
        return super.getDescription();
import org.jkiss.utils.CommonUtils;
            try {
import org.eclipse.swt.widgets.Composite;
        if (preferencePage instanceof IWorkbenchPropertyPage && page instanceof IWorkbenchPropertyPage) {
        super(preferencePage.getClass().getName());
        return preferencePage.getControl();
 * See the License for the specific language governing permissions and
    }
import org.eclipse.swt.widgets.Control;
import java.util.ResourceBundle;
    public void performHelp()

    public String getTitle()
    }
    @Override
            }
        subPages.add(wizardPrefPage);
    }
        return wizardPrefPage;
import org.eclipse.swt.graphics.Image;
        // Sety the same element to sub page
 * Unless required by applicable law or agreed to in writing, software
            preferencePage.setContainer(ppc);
        if (!CommonUtils.isEmpty(preferencePage.getDescription())) {
        } catch (Exception e) {
 * You may obtain a copy of the License at
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
        preferencePage.performOk();
    }
 *
            ResourceBundle resourceBundle = RuntimeUtils.getBundleLocalization(pageBundle, Locale.getDefault().getLanguage());
    public void performCancel()
    {
    {
    }
import org.osgi.framework.Bundle;
        subPages.add(wizardPrefPage);
        setTitle(title);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
        return preferencePage.getMessage();
        return getControl() == null || preferencePage.isValid();
 */
            return null;
    @Override
    }


        for (WizardPrefPage wpp : subPages) {
        return preferencePage.getImage();
                pageName = pageId;
        String pageName = pageId, pageDescription = pageId;
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void createControl(Composite parent)
                pageDescription = pageName;


    }
