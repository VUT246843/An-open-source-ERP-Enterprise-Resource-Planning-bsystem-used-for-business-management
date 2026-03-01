        }
     * Determine if the page is complete and update the page appropriately.
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    }
import org.eclipse.jface.wizard.IWizardContainer;
    protected boolean isCurrentPage() {
    }
    }
 *
        }
    /**
 */
        final IWizardContainer container = getContainer();
            || page instanceof ICompositeDialogPageContainer cc && cc.getCurrentSubPage() == this;
        if (pageComplete) {

import org.eclipse.jface.wizard.IWizard;
        return (WIZARD) super.getWizard();
     */
    protected ActiveWizardPage(String pageName) {
    }
import org.eclipse.jface.wizard.WizardPage;
    protected void updatePageCompletion() {
    public boolean isAutoResizeEnabled() {

    @Override
        if (container == null) {
/*

 * DBeaver - Universal Database Manager
        return true;
        super(pageName);
    public WIZARD getWizard() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.wizard.IWizardPage;
/**
import org.jkiss.dbeaver.ui.ICompositeDialogPageContainer;
    @Override
 *
    }
package org.jkiss.dbeaver.ui.dialogs;
 * you may not use this file except in compliance with the License.
 */

            activatePage();
 * limitations under the License.


            setErrorMessage(null);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

    }
    @Override
 * See the License for the specific language governing permissions and
        return page == this
    public void activatePage() {
    public void setVisible(boolean visible) {
        boolean pageComplete = determinePageCompletion();
        if (visible) {
        final IWizardPage page = container.getCurrentPage();

    public void deactivatePage() {

    }
}
 *

    protected boolean determinePageCompletion() {

        }
    }
        return true;
            return false;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * ActiveWizardPage
        super.setVisible(visible);
        setPageComplete(pageComplete);
public abstract class ActiveWizardPage<WIZARD extends IWizard> extends WizardPage implements IWizardPageActive {
