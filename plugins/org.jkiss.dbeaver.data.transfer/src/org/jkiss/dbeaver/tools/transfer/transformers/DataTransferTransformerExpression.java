/**


            return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static class VariablesContext implements JexlContext {
        @Override

        }
    }
            this.dataRow = dataRow;
                    return true;
            for (DBDAttributeBinding attribute : dataAttributes) {
            }
import org.apache.commons.jexl3.JexlContext;
 * See the License for the specific language governing permissions and
        if (jexlExpression == null) {
        private final DBCSession session;
        JexlExpression jexlExpression = getJexlExpression(options);
                }
 */
    public Object transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding[] dataAttributes, @NotNull Object[] dataRow, @NotNull DBDAttributeBinding attribute, Object attrValue, @NotNull Map<String, Object> options) throws DBException {
                throw new DBCException("Expression property not specified");
        public Object get(String s) {


    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.dbeaver.tools.transfer.IDataTransferAttributeTransformer;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }

    private JexlExpression jexlExpression;
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.exec.DBCException;
        }
        }

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.tools.transfer.transformers;
        public VariablesContext(DBCSession session, DBDAttributeBinding[] dataAttributes, Object[] dataRow) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/*
            this.session = session;
            String expr = JSONUtils.getString(options, "expression");
import org.apache.commons.jexl3.JexlExpression;
        return jexlExpression.evaluate(context);

            return null;
            }
            jexlExpression = DBVUtils.parseExpression(expr);
        JexlContext context = new VariablesContext(session, dataAttributes, dataRow);
            this.dataAttributes = dataAttributes;

        public boolean has(String s) {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
            if (expr == null) {
        @Override
public class DataTransferTransformerExpression implements IDataTransferAttributeTransformer {
import org.jkiss.dbeaver.DBException;
                if (attribute.getName().equals(s)) {
    public JexlExpression getJexlExpression(Map<String, Object> options) throws DBCException {

import org.jkiss.dbeaver.model.DBUtils;
        }
 *
import org.jkiss.dbeaver.model.virtual.DBVUtils;
                }
}

 */
    @Override
import org.jkiss.code.NotNull;
import java.util.Map;
        }
        private final Object[] dataRow;

 *
        private final DBDAttributeBinding[] dataAttributes;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        public void set(String s, Object o) {
                    return DBUtils.getAttributeValue(attribute, dataAttributes, dataRow);
 *



 * Expression attribute transformer

import org.jkiss.dbeaver.model.data.json.JSONUtils;
        @Override
 * limitations under the License.
            for (DBDAttributeBinding attribute : dataAttributes) {
import org.jkiss.dbeaver.model.exec.DBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (attribute.getName().equals(s)) {
        return jexlExpression;


