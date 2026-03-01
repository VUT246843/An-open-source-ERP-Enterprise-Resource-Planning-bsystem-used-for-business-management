    public String getId()
        return "Hex";
 * Unless required by applicable law or agreed to in writing, software
 *

    @Override
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
public class BinaryFormatterHexString extends BinaryFormatterHex {

    private static final String HEX_PREFIX = "x'";
    }

    @Override
            string = string.substring(HEX_PREFIX.length(), string.length() - HEX_PREFIX.length() - HEX_POSTFIX.length());

    public String getTitle()
 * DBeaver - Universal Database Manager
    {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    public String toString(byte[] bytes, int offset, int length)
 * Formats binary data to hex with preceding x'0123456789ABCDEF'
    }
    {
 * Hex formatter.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return HEX_PREFIX + super.toString(bytes, offset, length) + HEX_POSTFIX;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
}

    public static final BinaryFormatterHexString INSTANCE = new BinaryFormatterHexString();
 * You may obtain a copy of the License at
        if (string.startsWith(HEX_PREFIX) || string.endsWith(HEX_POSTFIX)) {
        return "hex_string";
package org.jkiss.dbeaver.model.impl.data.formatters;

        return super.toBytes(string);
    }
 */
    {
    }
    public byte[] toBytes(String string)

/*
    @Override
    private static final String HEX_POSTFIX = "'";
    {
/**
