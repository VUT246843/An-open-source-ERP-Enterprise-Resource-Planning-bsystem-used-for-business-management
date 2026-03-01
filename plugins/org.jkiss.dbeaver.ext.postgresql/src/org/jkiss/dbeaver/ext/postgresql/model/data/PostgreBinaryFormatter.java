 * See the License for the specific language governing permissions and
}
 * you may not use this file except in compliance with the License.
    public static final PostgreBinaryFormatter INSTANCE = new PostgreBinaryFormatter();
    public String getId()
public class PostgreBinaryFormatter extends BinaryFormatterHex {
    public byte[] toBytes(String string)
        if (string.startsWith(HEX_PREFIX)) {

        }
 * PostgreBinaryFormatter

    private static final String HEX_PREFIX = "decode('";

        return HEX_PREFIX + super.toString(bytes, offset, length) + HEX_POSTFIX;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
/*
    @Override
 * DBeaver - Universal Database Manager
            string = string.substring(
    }
    {
                string.length() - HEX_POSTFIX.length());
    public String toString(byte[] bytes, int offset, int length)
    @Override
        return "pghex";
    {
    {
package org.jkiss.dbeaver.ext.postgresql.model.data;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
        return "PostgreSQL Hex";
    }
    }
    }
        return super.toBytes(string);
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 */
    {
    @Override

import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterHex;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final String HEX_POSTFIX = "','hex')";

    public String getTitle()
 *

                HEX_PREFIX.length(),
 *
 * limitations under the License.
/**
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
