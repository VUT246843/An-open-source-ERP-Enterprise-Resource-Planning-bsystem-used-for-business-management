
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getTitle()
 *
    public byte[] toBytes(String string)
    {
    {
    @Override
    {
    public String toString(byte[] bytes, int offset, int length)
 * Base64 formatter
 *
 * You may obtain a copy of the License at
    }
    {
import org.jkiss.utils.Base64;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return Base64.encode(bytes, offset, length);
        return "Base64";
    public String getId()
}
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
 */

    }
    }
    }
 */
 * limitations under the License.
package org.jkiss.dbeaver.model.impl.data.formatters;
 * See the License for the specific language governing permissions and
public class BinaryFormatterBase64 implements DBDBinaryFormatter {
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * Unless required by applicable law or agreed to in writing, software


    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return "base64";

        return Base64.decode(string);
 *
 * you may not use this file except in compliance with the License.
    @Override
