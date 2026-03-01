 * SQLDialectMetadataRegistry
 */


 *
/*


 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.util.List;
 * You may obtain a copy of the License at
}
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    List<SQLDialectMetadata> getDialects();
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.sql;
public interface SQLDialectMetadataRegistry {
 *
    SQLDialectInsertReplaceMethod getInsertReplaceMethod(String insertMethodId);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

    SQLDialectMetadata getDialect(String id);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    List<SQLDialectMetadata> getRootDialects();
 */

