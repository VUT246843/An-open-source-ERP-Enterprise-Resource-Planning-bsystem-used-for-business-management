 *
 *
        this.valueProvider = valueProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
class ColumnBooleanLabelProvider<ELEMENT, VALUE_TYPE> extends ColumnLabelProvider {
package org.jkiss.dbeaver.ui.controls;
 * You may obtain a copy of the License at



 * distributed under the License is distributed on an "AS IS" BASIS,

    }
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import org.jkiss.dbeaver.ui.IColumnValueProvider;
    private final IColumnValueProvider<ELEMENT, VALUE_TYPE> valueProvider;
import org.eclipse.jface.viewers.ViewerCell;
        // Do not set cell text
        return valueProvider;
 */
    public IColumnValueProvider<ELEMENT, VALUE_TYPE> getValueProvider() {
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.eclipse.jface.viewers.ColumnLabelProvider;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void update(ViewerCell cell) {
    ColumnBooleanLabelProvider(IColumnValueProvider<ELEMENT, VALUE_TYPE> valueProvider) {
 * See the License for the specific language governing permissions and
 *
}
 * limitations under the License.
/*
