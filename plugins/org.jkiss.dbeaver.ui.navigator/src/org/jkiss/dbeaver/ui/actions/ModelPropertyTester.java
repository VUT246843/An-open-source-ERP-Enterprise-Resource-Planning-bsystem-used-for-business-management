 * Licensed under the Apache License, Version 2.0 (the "License");
                    try {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;

 */
 * You may obtain a copy of the License at
                }
    @Override
                return false;
                        }
    public ModelPropertyTester() {
import org.jkiss.dbeaver.model.struct.DBSObject;

                            } catch (Exception e) {
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
}
/**
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                                return false;
                }
                    }
    public static final String PROP_CHILD_OF_TYPE = "childOfType";
                    } catch (DBException e) {
        if (!(receiver instanceof DBSObject)) {
 * DBeaver - Universal Database Manager
        super();
                if (object instanceof DBSSchema) {
    public static final String NAMESPACE = "org.jkiss.dbeaver.model";
            case PROP_CHILD_OF_TYPE: {
    public static final String PROP_IS_TABLE_CONTAINER = "isTableContainer";
import org.jkiss.dbeaver.model.navigator.DBNContainer;
 * See the License for the specific language governing permissions and
                        if (DBSDataContainer.class.isAssignableFrom(primaryChildType)) {
                        log.debug(e);

            return false;
                return false;
                    return true;
                }
                }
                    DBSObject object = (DBSObject) receiver;
package org.jkiss.dbeaver.ui.actions;
                                Class<? extends DBSObject> childType = ((DBSObjectContainer)object).getPrimaryChildType(null);
                    return childrenClass != null && DBSDataContainer.class.isAssignableFrom(childrenClass);
                                return expectedChildClass.isAssignableFrom(childType);
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
                        Class<? extends DBSObject> primaryChildType = ((DBSObjectContainer)object).getPrimaryChildType(null);
        }
    private static final Log log = Log.getLog(ModelPropertyTester.class);
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
 * ModelPropertyTester
import org.eclipse.core.expressions.PropertyTester;
    }

        return false;

                {
                if (object instanceof DBNContainer) {
                                Class<?> expectedChildClass = Class.forName((String)expectedValue);
                if (object instanceof DBSObjectContainer) {
import org.jkiss.dbeaver.model.DBUtils;
 */

            case PROP_IS_TABLE_CONTAINER: {
 *
                DBSObject object = DBUtils.getPublicObject((DBSObject) receiver);
                    }
        }
                    final Class<?> childrenClass = ((DBNContainer) object).getChildrenClass();
                            try {
 *
        switch (property) {

            }
{
/*
                    if (object instanceof DBSObjectContainer) {
 *

                            }


                            return true;
 * limitations under the License.
            }
                        if (expectedValue instanceof String) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
public class ModelPropertyTester extends PropertyTester
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
                        }
