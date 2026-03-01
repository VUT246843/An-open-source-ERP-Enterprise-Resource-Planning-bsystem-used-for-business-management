 * You may obtain a copy of the License at

    {
 *
 * you may not use this file except in compliance with the License.
 */
package org.jkiss.dbeaver.ext.db2.model.fed;
    @NotNull
import org.jkiss.dbeaver.ext.db2.model.DB2Object;

    @Override
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, editable = false, order = 2)
 *
        return setting;
    }
    // -----------------
 * limitations under the License.
    {
    public String getName()

    public DB2Wrapper getWrapper()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // -----------------------
    // Properties
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    private String setting;
 * @author Denis Forveille
 * Licensed under the Apache License, Version 2.0 (the "License");

        return wrapper;
    public String getSetting()
/**
/*
    }
}
 * DBeaver - Universal Database Manager
public class DB2WrapperOption extends DB2Object<DB2Wrapper> {
 * 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
    {

        this.setting = JDBCUtils.safeGetString(dbResult, "SETTING");
import org.jkiss.code.NotNull;
    }

    }

    @Property(viewable = true, editable = false, order = 1)



import org.jkiss.dbeaver.model.meta.Property;
    {
 */
    // -----------------
    // Constructors
        super(wrapper, JDBCUtils.safeGetString(dbResult, "OPTION"), true);
 *
    public DB2WrapperOption(DB2Wrapper wrapper, ResultSet dbResult)


 * See the License for the specific language governing permissions and
        return name;
    private final DB2Wrapper wrapper;
    // -----------------------
        this.wrapper = wrapper;
 * DB2 Federated Wrapper Option
