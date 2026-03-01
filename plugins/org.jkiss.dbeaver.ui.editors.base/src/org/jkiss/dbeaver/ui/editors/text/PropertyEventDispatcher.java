

 * you may not use this file except in compliance with the License.
		Assert.isLegal(property != null);
		if (value instanceof DBPPreferenceListener)
			return;
	private void multiMapPut(Map map, Object key, Object value) {
			fStore.removePropertyChangeListener(fListener);
		Assert.isLegal(listener != null);
		}
		multiMapPut(fHandlerMap, property, listener);

	}
			fReverseMap.remove(listener);
	}
		if (mapping instanceof Set) {
		} else if (mapping != null) {
		Object mapping= map.get(key);
			Set set= new LinkedHashSet();
	private void firePropertyChange(DBPPreferenceListener.PreferenceChangeEvent event) {
			multiMapRemove(fHandlerMap, value, listener);
	public void addPropertyChangeListener(String property, DBPPreferenceListener listener) {
			set.add(value);
import java.util.*;
 * DBeaver - Universal Database Manager
			set.add(mapping);
	public void dispose() {
		Object value= fHandlerMap.get(event.getProperty());
 * You may obtain a copy of the License at
			for (Iterator it= ((Set) value).iterator(); it.hasNext(); )
        public void preferenceChange(PreferenceChangeEvent event) {
import org.eclipse.core.runtime.Assert;
 * Copyright (C) 2010-2024 DBeaver Corp and others

		} else if (mapping instanceof Set) {
	private void multiMapRemove(Map map, Object key, Object value) {
			map.remove(key);
			fStore.addPropertyChangeListener(fListener);
/*
	public void removePropertyChangeListener(IPropertyChangeListener listener) {
public final class PropertyEventDispatcher {
	}
			((Set) mapping).add(value);
	public PropertyEventDispatcher(DBPPreferenceStore store) {
		@Override
	}
 */
			map.put(key, value);
		}

		} else if (value instanceof Set) {
}		}
		fHandlerMap.clear();
		if (fReverseMap.isEmpty())
package org.jkiss.dbeaver.ui.editors.text;
				((DBPPreferenceListener) it.next()).preferenceChange(event);
 * Unless required by applicable law or agreed to in writing, software
		if (mapping == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
		fStore= store;
		}
 *
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
		} else {
	private final Map fHandlerMap= new HashMap();
			firePropertyChange(event);
		else if (value instanceof Set)
			for (Iterator it= ((Set) value).iterator(); it.hasNext();)
 * limitations under the License.
		Object mapping= map.get(key);
			fStore.removePropertyChangeListener(fListener);
			((Set) mapping).remove(value);
import org.eclipse.jface.util.IPropertyChangeListener;
		fReverseMap.clear();
	private final DBPPreferenceListener fListener= new DBPPreferenceListener() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

			map.put(key, set);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
		if (fReverseMap.isEmpty())
 *
	private final DBPPreferenceStore fStore;
		if (!fReverseMap.isEmpty())
			fReverseMap.remove(listener);
	}
	}
 *     http://www.apache.org/licenses/LICENSE-2.0
		if (value instanceof String) {
		multiMapPut(fReverseMap, listener, property);
			((DBPPreferenceListener) value).preferenceChange(event);
 * distributed under the License is distributed on an "AS IS" BASIS,
	private final Map fReverseMap= new HashMap();
	}
		Object value= fReverseMap.get(listener);
				multiMapRemove(fHandlerMap, it.next(), listener);
		if (value == null)
 *
	};
		Assert.isLegal(store != null);
 * See the License for the specific language governing permissions and
