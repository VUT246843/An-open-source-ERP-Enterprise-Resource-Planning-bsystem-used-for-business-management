import org.jkiss.dbeaver.model.DBPImage;
 * limitations under the License.
 */
 * You may obtain a copy of the License at

    String getCategory();
    String getLabel();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    String getEditorId();


/**

{
 *     http://www.apache.org/licenses/LICENSE-2.0

 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software

 *
    String MB_CONNECTION_EDITOR = "connectionEditor";
 */
 * you may not use this file except in compliance with the License.
 *
/*
 * DBPEditorContribution
import org.jkiss.dbeaver.model.navigator.DBNNode;
 *
package org.jkiss.dbeaver.model.connection;
    DBPImage getIcon();


 * See the License for the specific language governing permissions and
public interface DBPEditorContribution

 * Copyright (C) 2010-2024 DBeaver Corp and others
    String getDescription();
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    boolean isVisible(DBNNode context);
