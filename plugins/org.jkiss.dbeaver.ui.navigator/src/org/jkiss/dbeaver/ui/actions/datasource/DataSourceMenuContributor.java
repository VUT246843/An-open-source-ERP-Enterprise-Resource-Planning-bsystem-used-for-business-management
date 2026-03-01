        return new IContributionItem[] { new ActionContributionItem(new EmptyListAction())};

 * Unless required by applicable law or agreed to in writing, software
}
    private static IContributionItem[] makeEmptyList(){
 * Licensed under the Apache License, Version 2.0 (the "License");

 */
import java.util.ArrayList;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.action.IContributionItem;
    protected IContributionItem[] getContributionItems()
 * you may not use this file except in compliance with the License.
        List<IContributionItem> menuItems);
public abstract class DataSourceMenuContributor extends CompoundContributionItem
{
 *
    protected abstract void fillContributionItems(
package org.jkiss.dbeaver.ui.actions.datasource;
 * limitations under the License.
    {
/*
 *
import org.jkiss.dbeaver.ui.actions.EmptyListAction;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        List<IContributionItem> menuItems = new ArrayList<>();
import org.eclipse.jface.action.ActionContributionItem;
 *
import org.eclipse.ui.actions.CompoundContributionItem;
        fillContributionItems(menuItems);
        return menuItems.isEmpty() ? makeEmptyList() : menuItems.toArray(new IContributionItem[0]);
    @Override
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at

    }

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
