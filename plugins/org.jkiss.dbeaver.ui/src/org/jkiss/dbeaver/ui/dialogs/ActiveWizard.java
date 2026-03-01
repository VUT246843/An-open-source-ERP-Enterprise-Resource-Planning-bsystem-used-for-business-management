
            if (parent == null) {
            }
        return wizardPage;
            }
 */

                if (node.getId().equals(subNode.getId())) {
                createPreferencePages(wizardPrefPage, subNodes);
            }
        WizardPrefPage wizardPage = new WizardPrefPage(prefPage, title, description);
        }
    {
    protected void createPreferencePages(IPreferenceNode[] preferenceNodes) {
        if (isPageActive(prefPage)) {
import org.eclipse.core.runtime.IAdaptable;

            wpp.setElement(getActiveElement());
    private void createPreferencePages(WizardPrefPage parent, IPreferenceNode[] preferenceNodes) {
 *
        }
        return true;
import java.util.List;
import org.eclipse.jface.preference.IPreferencePage;
        return null;
    {
            WizardPrefPage[] subPages = prefPage.getDialogPages(false, true);
            }
import org.eclipse.ui.IWorkbenchPropertyPage;
        return wizardPage;
        return prefPages;
                    return true;
    protected WizardPrefPage createPreferencePage(IPreferencePage  prefPage, String title, String description) {
    protected void savePrefPageSettings()
 *
                continue;
 */
            savePageSettings(prefPage);

    private boolean isNodeHasParent(IPreferenceNode node, IPreferenceNode[] allNodes) {
    @Override
 * limitations under the License.
            } else {
    }
        for (WizardPrefPage prefPage : prefPages) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.ui.preferences.WizardPrefPage;
    }
 *
        if (prefPage instanceof IWorkbenchPropertyPage wpp) {
 * you may not use this file except in compliance with the License.

        }
import org.eclipse.jface.preference.IPreferencePageContainer;
            IPreferencePage preferencePage = node.getPage();
    public boolean performCancel()
    }

            node.createPage();
    private final List<WizardPrefPage> prefPages = new ArrayList<>();
                savePrefPageSettings(subPages);
package org.jkiss.dbeaver.ui.dialogs;
 * DBeaver - Universal Database Manager
                continue;
    }

import java.util.ArrayList;
        for (WizardPrefPage prefPage : pages) {
 * Unless required by applicable law or agreed to in writing, software
                }
                wizardPrefPage = parent.addSubPage(preferencePage, preferencePage.getTitle(), preferencePage.getDescription());

        for (IPreferenceNode n : allNodes) {
            prefPage.performFinish();
 * distributed under the License is distributed on an "AS IS" BASIS,
        prefPages.add(wizardPage);
    }

    {
    {
            preferencePage.setContainer((IPreferencePageContainer) getContainer());
        return false;
            IPreferenceNode[] subNodes = node.getSubNodes();
 * You may obtain a copy of the License at
    }


    private void savePageSettings(WizardPrefPage prefPage) {
/*
 * ActiveWizard.
            }

            }
        // Just in case - cancel changes in pref pages (there shouldn't be any)
        }

            prefPage.performCancel();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public WizardPrefPage addPreferencePage(IPreferencePage prefPage, String title, String description)
        }
        }
import org.eclipse.jface.preference.IPreferenceNode;
import java.util.Comparator;
        createPreferencePages(null, preferenceNodes);
    protected IAdaptable getActiveElement() {
        WizardPrefPage wizardPage = createPreferencePage(prefPage, title, description);
        savePrefPageSettings(prefPages.toArray(new WizardPrefPage[0]));

 * See the License for the specific language governing permissions and
                wizardPrefPage = addPreferencePage(preferencePage, preferencePage.getTitle(), preferencePage.getDescription());
 *     http://www.apache.org/licenses/LICENSE-2.0
    private void savePrefPageSettings(WizardPrefPage[] pages)
    @Override
import java.util.Arrays;

            if (preferencePage == null) {
            if (subPages != null) {
}/**
            if (isNodeHasParent(node, preferenceNodes)) {
    }
            for (IPreferenceNode subNode : n.getSubNodes()) {
        addPage(wizardPage);
        for (IPreferenceNode node : preferenceNodes) {
            WizardPrefPage wizardPrefPage;
        Arrays.sort(preferenceNodes, Comparator.comparing(IPreferenceNode::getLabelText));
    protected List<WizardPrefPage> getPrefPages() {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
            if (subNodes != null) {
 *
public abstract class ActiveWizard extends BaseWizard implements IActiveWizard {

    }
    }
