public abstract class LazyLabelProvider extends TreeColumnViewerLabelProvider implements ILazyLabelProvider
 * Unless required by applicable law or agreed to in writing, software
    }
 * See the License for the specific language governing permissions and
            }
                return "";
 * You may obtain a copy of the License at
import org.eclipse.swt.graphics.Color;
            public String getText(Object element) {
/**
import org.eclipse.jface.viewers.ColumnLabelProvider;
            @Override
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui;

            }
 * LazyLabelProvider
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return foreground;
{
 */
    }
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.viewers.TreeColumnViewerLabelProvider;

        });
    public LazyLabelProvider(final Color foreground) {
 *
        super(new ColumnLabelProvider() {
 * distributed under the License is distributed on an "AS IS" BASIS,
/*

 *
        this(null);
 * DBeaver - Universal Database Manager
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
            @Override

    public LazyLabelProvider() {

 */


 *     http://www.apache.org/licenses/LICENSE-2.0
}            public Color getForeground(Object element) {
