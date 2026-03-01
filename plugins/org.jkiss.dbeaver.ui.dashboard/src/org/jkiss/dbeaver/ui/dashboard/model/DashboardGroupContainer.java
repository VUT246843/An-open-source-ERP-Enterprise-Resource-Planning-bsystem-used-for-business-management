
import org.jkiss.code.NotNull;
 */
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
    DashboardContainer getView();
}
package org.jkiss.dbeaver.ui.dashboard.model;
 *
    List<? extends DashboardItemContainer> getItems();
/*
 *
 * See the License for the specific language governing permissions and
 * Dashboard group container
/**
import java.util.List;
    void removeItem(@NotNull DashboardItemContainer item);

public interface DashboardGroupContainer {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2024 DBeaver Corp and others

    void selectItem(@Nullable DashboardItemContainer item);
import org.jkiss.code.Nullable;
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0

 *


 * limitations under the License.
    void addItem(@NotNull DashboardItemConfiguration descriptor);
