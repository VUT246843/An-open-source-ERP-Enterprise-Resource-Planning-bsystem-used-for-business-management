import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
/**
 *

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPStatefulObject;
import org.jkiss.dbeaver.model.struct.DBSObject;
/*

package org.jkiss.dbeaver.ext.exasol.editors;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    @Override
 * DBeaver - Universal Database Manager
 *
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 * limitations under the License.
import org.jkiss.code.NotNull;
 *
    ExasolSchema getSchema();
 * @author Karl
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface ExasolStatefulObject extends DBSObject, DBPStatefulObject {
 * you may not use this file except in compliance with the License.

}
    ExasolDataSource getDataSource();
    @NotNull
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
