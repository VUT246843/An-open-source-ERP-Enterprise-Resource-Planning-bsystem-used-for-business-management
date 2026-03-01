import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 *

    public String getContentType(@NotNull DBDAttributeBinding binding) {
 * DBeaver - Universal Database Manager
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.DBDAttributeContentTypeProvider;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable

                return null;
            case OracleConstants.TYPE_NAME_XML:
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
                return MimeTypes.TEXT_XML;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.utils.MimeTypes;
 */
 * You may obtain a copy of the License at
    }

    public static final OracleAttributeContentTypeProvider INSTANCE = new OracleAttributeContentTypeProvider();
}
        // prevents instantiation
    private OracleAttributeContentTypeProvider() {

            default:
import org.jkiss.code.NotNull;
public class OracleAttributeContentTypeProvider implements DBDAttributeContentTypeProvider {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 * limitations under the License.
        switch (binding.getTypeName()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            case OracleConstants.TYPE_FQ_XML:
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
package org.jkiss.dbeaver.ext.oracle.model;
