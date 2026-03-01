 *
            return new JDBCDateTimeValueHandler(preferences);
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
            default:
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            DBSTypedObject typedObject) {
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCDateTimeValueHandler;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataKind;
    @Override
}
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences,
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2016-2019 Karl Griesser (fullref@gmail.com)

            case ExasolConstants.TYPE_GEOMETRY:
package org.jkiss.dbeaver.ext.exasol;
 * you may not use this file except in compliance with the License.
                return new ExasolGeometryValueHandler();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        if (typedObject.getDataKind() == DBPDataKind.DATETIME) {
 *
 *
public class ExasolValueHandlerProvider implements DBDValueHandlerProvider {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSource;
        }
        }
    }
import org.jkiss.dbeaver.ext.exasol.model.ExasolGeometryValueHandler;
 */

 * DBeaver - Universal Database Manager
/*


                return null;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String typeID = typedObject.getTypeName();
        switch (typeID) {
