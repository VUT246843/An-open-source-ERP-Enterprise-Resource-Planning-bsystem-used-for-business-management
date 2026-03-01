 *     http://www.apache.org/licenses/LICENSE-2.0
        return exprString;
    public DBPImage getIcon()
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return icon;

    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 */
            log.warn("Can't parse icon expression: " + exprString, ex);
package org.jkiss.dbeaver.model.navigator.meta;
    public JexlExpression getExpression()
    private final DBPImage icon;
    {
        }
        return expression;
 *


/**
    public void dispose()
 * you may not use this file except in compliance with the License.
 * DBXTreeIcon
}
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }
        try {
    public String getExprString()
        } catch (DBException ex) {

    }
    }
/*
import org.apache.commons.jexl3.JexlExpression;
    {

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
    private final String exprString;

 * You may obtain a copy of the License at
public class DBXTreeIcon {
import org.jkiss.dbeaver.model.DBPImage;
 * See the License for the specific language governing permissions and
    }
 *
 */
            this.expression = AbstractDescriptor.parseExpression(exprString);
        this.icon = icon;
    private JexlExpression expression;
 * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(DBXTreeIcon.class);
    {

    {
import org.jkiss.dbeaver.Log;
    public DBXTreeIcon(String exprString, DBPImage icon)

        this.exprString = exprString;

