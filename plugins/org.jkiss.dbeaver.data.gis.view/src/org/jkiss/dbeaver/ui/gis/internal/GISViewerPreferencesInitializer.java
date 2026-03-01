 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      PrefUtils.setDefaultPreferenceValue(store, GeometryViewerConstants.PREF_MIN_ZOOM_LEVEL, GeometryViewerConstants.DEFAULT_MAX_ZOOM_LEVEL);
      // Init default preferences

import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
import org.jkiss.dbeaver.model.gis.GisConstants;
 *
public class GISViewerPreferencesInitializer extends AbstractPreferenceInitializer {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.gis.GeometryViewerConstants;
      PrefUtils.setDefaultPreferenceValue(store, GeometryViewerConstants.PREF_MAX_OBJECTS_RENDER, GeometryViewerConstants.DEFAULT_MAX_OBJECTS_RENDER);
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
 *
      PrefUtils.setDefaultPreferenceValue(store, GeometryViewerConstants.PREF_DEFAULT_SRID, GisConstants.SRID_4326);

      // View settings
package org.jkiss.dbeaver.ui.gis.internal;
 */
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
      PrefUtils.setDefaultPreferenceValue(store, GeometryViewerConstants.PREF_SHOW_LABELS, true);

/*
      DBPPreferenceStore store = new BundlePreferenceStore(GISViewerActivator.getDefault().getBundle());
  }
 *     http://www.apache.org/licenses/LICENSE-2.0
}

  public void initializeDefaultPreferences() {

 *
import org.jkiss.dbeaver.utils.PrefUtils;
 * limitations under the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
  @Override
