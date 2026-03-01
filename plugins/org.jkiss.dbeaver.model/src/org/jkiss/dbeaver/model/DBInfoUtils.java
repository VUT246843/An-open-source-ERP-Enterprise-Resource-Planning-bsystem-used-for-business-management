 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } else {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

                StringWriter buf = new StringWriter();
            if (CommonUtils.isEmpty(propString)) {
    }
 *
            }
import com.google.gson.GsonBuilder;
     * Returns a string representation of the property's value or {@code null} if it has no value.
        }
        DBPNamedObject targetObject = object;

 * DBeaver - Universal Database Manager
 * DB value formatting utilities
    public static String makeObjectDescription(@NotNull DBRProgressMonitor monitor, DBPNamedObject object, boolean html) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

    public static String getPropertyString(@NotNull PropertyCollector collector, @NotNull DBPPropertyDescriptor descriptor) {
import com.google.gson.Strictness;
            }
        StringBuilder info = new StringBuilder();
            propString = ((DBPNamedObject) propValue).getName();
 *
     */
        }
            }
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
 * You may obtain a copy of the License at
        }
        return propString;

        Object propValue = collector.getPropertyValue(null, descriptor.getId());
        if (CommonUtils.isEmpty(propString)) {
            return null;
                e.printStackTrace(new PrintWriter(buf, true));
    }
 * See the License for the specific language governing permissions and

        .create();
import org.jkiss.code.NotNull;
 */

import java.io.StringWriter;
import java.io.PrintWriter;
 */
package org.jkiss.dbeaver.model;

    /**
                info.append("<b>").append(descriptor.getDisplayName()).append(":  </b>");
        if (propValue == null) {
        if (propValue instanceof DBPNamedObject) {
        .setStrictness(Strictness.LENIENT)
            return null;
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
                info.append(descriptor.getDisplayName()).append(": ").append(propString).append("\n");
 *
            try {
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.struct.DBSObjectReference;
/**
        return info.toString();
        for (DBPPropertyDescriptor descriptor : collector.getProperties()) {
    public static final Gson SECRET_GSON = new GsonBuilder()
/*
                continue;
import org.jkiss.dbeaver.DBException;
import com.google.gson.Gson;
        String propString;
                targetObject = ((DBSObjectReference) object).resolveObject(monitor);
public final class DBInfoUtils {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
        .serializeNulls()
            } else {
                info.append(propString);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                info.append("<br>");
        }
            propString = DBValueFormatting.getDefaultValueDisplayString(propValue, DBDDisplayFormat.UI);
        if (object instanceof DBSObjectReference) {
            } catch (DBException e) {

 * you may not use this file except in compliance with the License.
                info.append(buf.toString());
            String propString = getPropertyString(collector, descriptor);
            if (html) {
        PropertyCollector collector = new PropertyCollector(targetObject, false);
        collector.collectProperties();
    @Nullable
        .setPrettyPrinting()
