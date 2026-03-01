

 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
import org.eclipse.ui.PlatformUI;

package org.jkiss.dbeaver.ui.navigator.project;
                Object[] elements = event.getElements();
    DecoratedProjectView() {
                    getNavigatorViewer().update(elements, null);
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.viewers.ILabelDecorator;
        labelDecorator.dispose();

        labelDecorator = PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
 * Unless required by applicable law or agreed to in writing, software
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
/*
                }
        labelDecorator.addListener(event -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
}

        );
        super.dispose();
 * you may not use this file except in compliance with the License.
    @Override
 */
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

    public void dispose() {
 */
 *
public abstract class DecoratedProjectView extends NavigatorViewBase {
 * See the License for the specific language governing permissions and
    final ILabelDecorator labelDecorator;
            }
 * DecoratedProjectView
                if (elements != null) {
