/**
            case WMIConstants.CIM_UINT32: return "UInt32";
 * DBeaver - Universal Database Manager
            case WMIConstants.CIM_SINT64: return "Int64";
            case WMIConstants.CIM_DATETIME: return "DateTime";
            case WMIConstants.CIM_REFERENCE: return "Reference";
        return flavor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            case WMIConstants.CIM_UINT8: return "UInt8";
            case WMIConstants.CIM_STRING: return "String";
            case WMIConstants.CIM_OBJECT: return "Object";
        if ((type & WMIConstants.CIM_FLAG_ARRAY) != 0) {
    {
 *
        return value;
        return getName().startsWith("__");
            case WMIConstants.CIM_CHAR16: return "Char";
            return getCIMTypeName(type);
 *
    }
    }
    public static String getCIMTypeName(int type)
 * limitations under the License.
    }
            case WMIConstants.CIM_REAL64: return "Real64";
        }
    public String getTypeName()
    private int flavor;
    public boolean isSystem()
    }
    {
            case WMIConstants.CIM_SINT8: return "Int8";
            case WMIConstants.CIM_SINT32: return "Int32";
 */
    {
    public String toString()
        this.flavor = flavor;

        switch (type) {
    }
    private Object value;
        }
 * you may not use this file except in compliance with the License.
    {
            case WMIConstants.CIM_SINT16: return "Int16";

            case WMIConstants.CIM_REAL32: return "Real32";

    public int getFlavor()

        this.type = type;
public class WMIObjectAttribute extends WMIObjectElement
 */
            case WMIConstants.CIM_UINT16: return "UInt16";
    public WMIObjectAttribute(WMIObject owner, String name, int type, int flavor, Object value)
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
            case WMIConstants.CIM_BOOLEAN: return "Boolean";
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
            case WMIConstants.CIM_UINT64: return "UInt64";
    private int type;
    {
        super(owner, name);
    {

    public int getType()
}
        return type;
            case WMIConstants.CIM_ILLEGAL: return "Illegal";
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

        } else {
 * See the License for the specific language governing permissions and
    {

        int type = getType();
        return getName() + "=" + value;
/*
    }
{
package org.jkiss.wmi.service;
            return getCIMTypeName(type ^ WMIConstants.CIM_FLAG_ARRAY) + "[]";
            default: return "Unknown (" + type + ")";

    {

        this.value = value;
 * WMI object property
    }
            case WMIConstants.CIM_EMPTY: return "Empty";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

    public Object getValue()
