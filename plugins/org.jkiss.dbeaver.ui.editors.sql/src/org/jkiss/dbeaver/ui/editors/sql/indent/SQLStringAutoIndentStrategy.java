    {
 * DBeaver - Universal Database Manager
    public void customizeDocumentCommand(IDocument document, DocumentCommand command)
}
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.eclipse.jface.text.IDocument;
     */

     * Creates a new SQL string auto indent strategy for the given document partitioning.

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLStringAutoIndentStrategy extends DefaultIndentLineAutoEditStrategy
        super();
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    public SQLStringAutoIndentStrategy(String partitioning)

 * See the License for the specific language governing permissions and
     * @param partitioning the document partitioning
    {
package org.jkiss.dbeaver.ui.editors.sql.indent;
     * 
 *

 *

    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

 *
{
    @Override
import org.eclipse.jface.text.DocumentCommand;
