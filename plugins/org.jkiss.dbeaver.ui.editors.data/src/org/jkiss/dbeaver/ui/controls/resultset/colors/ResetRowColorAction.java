 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.virtual.DBVColorOverride;
import org.jkiss.dbeaver.ui.UITextUtils;
    private final DBVColorOverride mapping;
 *     http://www.apache.org/licenses/LICENSE-2.0
            mapping.getOperator().getExpression(),
 *
 */
public class ResetRowColorAction extends ColorAction {
import org.jkiss.code.Nullable;
 *
import org.jkiss.utils.CommonUtils;
    }
        vEntity.removeColorOverride(mapping);

    public ResetRowColorAction(@NotNull ResultSetViewer rsv, @NotNull DBVColorOverride mapping, @Nullable Object value) {
        super(rsv, NLS.bind(ResultSetMessages.actions_name_color_reset_by, new Object[]{
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
            UITextUtils.getShortText(rsv.getControl(), CommonUtils.toString(value), 100)
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.controls.resultset.colors;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        final DBVEntity vEntity = getColorsVirtualEntity();
        this.mapping = mapping;
import org.eclipse.osgi.util.NLS;
            mapping.getAttributeName(),

 * distributed under the License is distributed on an "AS IS" BASIS,
        }));
}
    @Override
 * limitations under the License.
        updateColors(vEntity);
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

import org.jkiss.dbeaver.model.virtual.DBVEntity;
    public void run() {
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.code.NotNull;
 *
 * See the License for the specific language governing permissions and
