package org.jkiss.dbeaver.debug.ui;

 * See the License for the specific language governing permissions and
}
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
    boolean isValid();
public interface DBGConfigurationPanel {
    void loadConfiguration(@NotNull DBPDataSourceContainer dataSource, @NotNull Map<String, Object> configuration);
 *
    void saveConfiguration(@NotNull DBPDataSourceContainer dataSource, @NotNull Map<String, Object> configuration);
 *

    
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Composite;
    void createPanel(@NotNull Composite parent, DBGConfigurationPanelContainer container);
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.code.NotNull;
/*
 *

 * DBeaver - Universal Database Manager


 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
