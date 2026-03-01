 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
	 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
	/**
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface IPropertyFilter {
 * See the License for the specific language governing permissions and
	boolean select(Object object, DBPPropertyDescriptor property);
/*
 * limitations under the License.
 * You may obtain a copy of the License at
 * Interface for filters. Can accept or reject items.

 */
package org.jkiss.dbeaver.runtime.properties;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 *
	 * Determines if the given property passes this filter.
 */
 * Unless required by applicable law or agreed to in writing, software
}
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
