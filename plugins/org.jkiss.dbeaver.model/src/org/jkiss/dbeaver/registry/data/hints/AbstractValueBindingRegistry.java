 */
        }
            valueBinding = findValueBinding(context, dataSource, type, valueType, true, false);
    }
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

        @Nullable Class<?> valueType
        if (valueBinding == null) {
 *
import org.jkiss.code.Nullable;


        }
        }
        return null;
 * You may obtain a copy of the License at
        boolean checkType
    ) {
/*
            valueBinding = getDefaultValueBinding();
    ) {
        if (valueBinding == null) {
        for (DESC desc : getDescriptors()) {
            if (desc.supportsAnyType(context, dataSource, type, valueType)) {
        DBSTypedObject typedObject,
        // Check starting from most restrictive to less restrictive
        }

    protected abstract TYPE getDefaultValueBinding();

        for (DESC desc : getDescriptors()) {
    @NotNull
        boolean checkDataSource,
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
    @NotNull
 * AbstractValueBindingRegistry
}
                return desc.getInstance();
package org.jkiss.dbeaver.registry.data.hints;
    }

    public List<TYPE> getAllValueBindings(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return valueBinding;

        @Nullable DBPDataSource dataSource,
    public TYPE getValueBinding(
                result.add(desc.getInstance());
        List<TYPE> result = new ArrayList<>();
import org.jkiss.code.NotNull;
        @NotNull CONTEXT context,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
 *

        @Nullable DBPDataSource dataSource,
    protected abstract List<DESC> getDescriptors();
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import java.util.List;
            if (desc.supportsType(context, dataSource, typedObject, valueType, checkDataSource, checkType)) {
 * DBeaver - Universal Database Manager

            valueBinding = findValueBinding(context, dataSource, type, valueType, false, false);
        if (valueBinding == null) {
        @NotNull DBSTypedObject type,
 * you may not use this file except in compliance with the License.
 *
        @NotNull CONTEXT context,
            valueBinding = findValueBinding(context, dataSource, type, valueType, false, true);
 */
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            }
        @NotNull DBSTypedObject type,
    }
import java.util.ArrayList;

 * Licensed under the Apache License, Version 2.0 (the "License");
        TYPE valueBinding = findValueBinding(context, dataSource, type, valueType, true, true);
        }
        if (valueBinding == null) {
    @NotNull
    ) {
        @Nullable DBPDataSource dataSource,
public abstract class AbstractValueBindingRegistry<TYPE, CONTEXT, DESC extends AbstractValueBindingDescriptor<TYPE, CONTEXT>> {
        Class<?> valueType,
 * limitations under the License.
        @NotNull CONTEXT context,
        @Nullable Class<?> valueType
    private TYPE findValueBinding(

        return result;
/**
