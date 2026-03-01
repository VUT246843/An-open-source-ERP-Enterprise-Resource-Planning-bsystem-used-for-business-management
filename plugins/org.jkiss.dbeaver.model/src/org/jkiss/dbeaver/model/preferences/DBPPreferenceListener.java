 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.EventObject;
            return newValue;
    void preferenceChange(PreferenceChangeEvent event);

        }

 *

 *

        public Object getOldValue() {
        }

 * limitations under the License.
        public Object getNewValue() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * Unless required by applicable law or agreed to in writing, software
    }
        private Object oldValue;
 *
public interface DBPPreferenceListener extends EventListener {
package org.jkiss.dbeaver.model.preferences;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
            this.propertyName = property;

        private String propertyName;
            return oldValue;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            super(source);
import java.util.EventListener;
 * See the License for the specific language governing permissions and
}
            return propertyName;
            this.oldValue = oldValue;
 */
 * DBeaver - Universal Database Manager
    class PreferenceChangeEvent extends EventObject {
                                     Object newValue) {
        public PreferenceChangeEvent(Object source, String property, Object oldValue,
        private Object newValue;
        public String getProperty() {
        }


 * you may not use this file except in compliance with the License.
            this.newValue = newValue;
