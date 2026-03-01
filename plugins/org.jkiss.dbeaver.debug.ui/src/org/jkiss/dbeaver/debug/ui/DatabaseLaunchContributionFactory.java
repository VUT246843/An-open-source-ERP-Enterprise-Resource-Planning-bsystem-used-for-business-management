/*

        IIdentifier identifier = activitySupport.getActivityManager().getIdentifier(identifierId);
import org.eclipse.ui.services.IServiceLocator;
        this.id = id;
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
    private ImageDescriptor imageDescriptor;

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
        menuManager.add(item);
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.imageDescriptor = imageDescriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void setImageDescriptor(ImageDescriptor imageDescriptor) {
        item.setVisible(true);
    }
 * limitations under the License.
            return;
        DatabaseLaunchContributionItem item = createContributionItem();
    }
    public void setText(String text) {
import org.eclipse.ui.menus.IContributionRoot;
    }
        MenuManager menuManager = new MenuManager(text, imageDescriptor, id);
        this.text = text;
 *
        return text;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.activities.IIdentifier;
    private String text;
        if (!identifier.isEnabled()) {
 * DBeaver - Universal Database Manager
        additions.addContributionItem(menuManager, null);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.action.MenuManager;

        IWorkbenchActivitySupport activitySupport = PlatformUI.getWorkbench().getActivitySupport();
    }
    public ImageDescriptor getImageDescriptor() {
    }
    protected abstract DatabaseLaunchContributionItem createContributionItem();
        }
import org.eclipse.ui.PlatformUI;
}
    private final String id;
import org.eclipse.jface.resource.ImageDescriptor;
    public DatabaseLaunchContributionFactory(String id) {
    public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {

 * You may obtain a copy of the License at

    protected String createContributionIdentifier() {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        return DebugUI.BUNDLE_SYMBOLIC_NAME + '/' + id;


public abstract class DatabaseLaunchContributionFactory extends ExtensionContributionFactory {
import org.eclipse.ui.activities.IWorkbenchActivitySupport;


    }
    public String getText() {

 * distributed under the License is distributed on an "AS IS" BASIS,
 */

 * See the License for the specific language governing permissions and
        String identifierId = createContributionIdentifier();

 *
        return imageDescriptor;
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.debug.ui;
    }
