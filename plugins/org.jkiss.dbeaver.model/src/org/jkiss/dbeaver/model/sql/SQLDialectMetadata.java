
    String getLabel();

 * Unless required by applicable law or agreed to in writing, software
    List<String> getDataTypes();
 *
    String getId();

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    DBDInsertReplaceMethod[] getSupportedInsertReplaceMethods();
    String getDescription();

    List<SQLDialectInsertReplaceMethod> getSupportedInsertReplaceMethodsDescriptors();


    @Nullable
 * you may not use this file except in compliance with the License.
 * limitations under the License.

    Object getProperty(String name);
import org.jkiss.dbeaver.DBException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    boolean isHidden();

/*
    SQLDialect createInstance() throws DBException;

    @NotNull
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
    List<String> getTransactionKeywords();
    DBPImage getIcon();
import java.util.List;

    SQLDialectMetadata getParentDialect();
 * See the License for the specific language governing permissions and
    @NotNull



import org.jkiss.code.Nullable;



 * You may obtain a copy of the License at
    @NotNull
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
    @NotNull
}
 * distributed under the License is distributed on an "AS IS" BASIS,


    List<String> getFunctions();
    List<String> getReservedWords();
    @NotNull
 *
    @NotNull

 * DBeaver - Universal Database Manager
    boolean isAbstract();
 *

    List<SQLDialectMetadata> getSubDialects(boolean addNested);
package org.jkiss.dbeaver.model.sql;

    @NotNull
    List<String> getDDLKeywords();

 * Copyright (C) 2010-2024 DBeaver Corp and others
    List<String> getExecuteKeywords();
    @NotNull
/**
import org.jkiss.dbeaver.model.DBPImage;
    List<String> getDMLKeywords();


    String getScriptDelimiter();
public interface SQLDialectMetadata {
    @NotNull
    @NotNull
 * SQLDialectMetadata
