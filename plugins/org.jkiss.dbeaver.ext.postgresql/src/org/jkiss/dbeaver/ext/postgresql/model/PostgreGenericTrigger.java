package org.jkiss.dbeaver.ext.postgresql.model;
    }
        return orientation;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }


        this.orientation = orientation;

    private String source;
        return manipulation;

    }
    @NotNull
@Deprecated
 * you may not use this file except in compliance with the License.
 */
        super(table, name, description);
    @Property(viewable = true, editable = true, updatable = false, order = 20)
    @Property(viewable = true, editable = true, updatable = false, order = 22)
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 *
    @Override
import org.jkiss.code.NotNull;
        return source;
/**
        this.manipulation += " OR " + manipulation;
        this.manipulation = manipulation;
    }
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, editable = true, updatable = false, order = 21)
    public String getTiming() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
}
    }

        return timing;
    }
    private String manipulation;
 *
    public PostgreGenericTrigger(GenericTableBase table, String name, String description, String manipulation, String orientation, @Nullable String timing, String statement) {

    private String timing;
    public void addManipulation(String manipulation) {
import org.jkiss.dbeaver.model.meta.Property;
 * limitations under the License.
import java.util.Map;
/*
    public String getOrientation() {

    public String getManipulation() {
        this.timing = timing;
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;

public class PostgreGenericTrigger extends GenericTableTrigger {
 *
    private String orientation;
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
        this.source = statement;

 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
    @Property(hidden = true, editable = true, updatable = true, order = -1)
 * PostgreGenericTrigger
 * You may obtain a copy of the License at
