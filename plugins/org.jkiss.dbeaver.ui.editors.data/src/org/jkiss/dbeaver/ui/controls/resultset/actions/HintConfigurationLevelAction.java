
 *
import org.eclipse.jface.action.IAction;
import org.jkiss.dbeaver.model.DBPDataSource;
    public void runWithEvent(Event event) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
 *
        if (isChecked()) {
        };
    }
    public void setChecked(boolean checked) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * you may not use this file except in compliance with the License.
    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
                yield singleSource == null ? "N/A" : "Entity (" +
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software

        this.configurationLevel = cl;
        super.setChecked(checked);
}
/*
package org.jkiss.dbeaver.ui.controls.resultset.actions;

            }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
            case GLOBAL -> "Global";
        return switch (level) {
            case DATASOURCE -> {
            DBDValueHintContext hintContext = getResultSetViewer().getHintContext();
        @NotNull DBDValueHintContext.HintConfigurationLevel cl

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;

public class HintConfigurationLevelAction extends AbstractResultSetViewerAction {
                DBPDataSource dataSource = viewer.getDataSource();

        super(resultSetViewer, getLevelTitle(resultSetViewer, cl), IAction.AS_RADIO_BUTTON);
 */

                DBSEntity singleSource = viewer.getModel().getSingleSource();
    public HintConfigurationLevelAction(
    private final DBDValueHintContext.HintConfigurationLevel configurationLevel;
            }
        }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
        setChecked(configurationLevel == getResultSetViewer().getHintContext().getConfigurationLevel());
    private static String getLevelTitle(ResultSetViewer viewer, DBDValueHintContext.HintConfigurationLevel level) {
            hintContext.setConfigurationLevel(configurationLevel);
            getResultSetViewer().refreshData(null);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBUtils;
                    DBUtils.getObjectFullName(singleSource, DBPEvaluationContext.UI) + ")";
    @Override

        @NotNull ResultSetViewer resultSetViewer,
import org.eclipse.swt.widgets.Event;
            case ENTITY -> {
    @NotNull

    ) {
    }
                yield dataSource == null ? "N/A" : "Datasource (" + dataSource.getName() + ")";
import org.jkiss.dbeaver.model.struct.DBSEntity;
