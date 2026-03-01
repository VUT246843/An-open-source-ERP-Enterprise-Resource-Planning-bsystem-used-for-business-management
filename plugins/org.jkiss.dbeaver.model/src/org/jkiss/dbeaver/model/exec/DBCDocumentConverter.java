 * Document converter.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.DBDDocument;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 *

/**
 * you may not use this file except in compliance with the License.
    DBDDocument getDocumentFromContent(DBRProgressMonitor monitor, DBSAttributeBase attribute, DBDContent content)

}

package org.jkiss.dbeaver.model.exec;
    boolean canConvertFromContent(DBSAttributeBase attribute)
 *
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    DBDContent getContentFromDocument(DBRProgressMonitor monitor, DBSAttributeBase attribute, DBDContent originalContent, DBDDocument document)
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBCException;
 * See the License for the specific language governing permissions and
 */

 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * You may obtain a copy of the License at
        throws DBCException;
 * Converts binary content into documents and back
        throws DBCException;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDContent;

public interface DBCDocumentConverter {
