        };
                yield CommonUtils.toBoolean(prefValue);
 *
                    }
    public static final String PROP_HAS_PREFERENCE = "hasPreference";
/**
    public static final String PROP_STANDALONE = "standalone";
 * you may not use this file except in compliance with the License.
                String prefValue = DBWorkbench.getPlatform().getPreferenceStore().getString(prefName);
                }
                    if (prefValue != null && prefValue.isEmpty()) {
                yield (prefValue != null && prefValue.isEmpty()) || CommonUtils.toBoolean(prefValue);
 *
 * You may obtain a copy of the License at
public class GlobalPropertyTester extends PropertyTester {
            case PROP_HAS_PREFERENCE -> {
/*
import org.jkiss.dbeaver.runtime.DBWorkbench;
package org.jkiss.dbeaver.model.impl;
 *
            case PROP_HAS_ENV_VARIABLE -> {
                String prefValue = System.getenv(prefName);
            }

 * See the License for the specific language governing permissions and
import org.eclipse.core.expressions.PropertyTester;

            }
 * GlobalPropertyTester
                String prefName = CommonUtils.toString(expectedValue);
 * limitations under the License.
import org.eclipse.core.runtime.Platform;
            case PROP_DISTRIBUTED -> DBWorkbench.isDistributed();
import org.jkiss.utils.CommonUtils;
                    prefValue = System.getProperty(prefName);
            default -> false;
}
    public static final String PROP_BUNDLE_INSTALLED = "bundleInstalled";

    public static final String PROP_DISTRIBUTED = "distributed";
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
                if (CommonUtils.isEmpty(prefValue)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 * Unless required by applicable law or agreed to in writing, software
            case PROP_STANDALONE -> DBWorkbench.getPlatform().getApplication().isStandalone();
                        prefValue = Boolean.TRUE.toString();
                String prefName = CommonUtils.toString(expectedValue);
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.global";
            case PROP_BUNDLE_INSTALLED -> Platform.getBundle((String) args[0]) != null;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String PROP_HAS_ENV_VARIABLE = "hasEnvVariable";
 * DBeaver - Universal Database Manager

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return switch (property) {
