     * Set geometry properties for the given geometry.
            }
    /**
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
        ResultSetModel model = controller.getModel();
import org.jkiss.dbeaver.model.gis.GisConstants;
        }
//        if (result.size() == 1) {
        }
import org.jkiss.dbeaver.ModelPreferences;
import java.util.stream.Collectors;
        }
        @NotNull IResultSetController controller,
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
     * @param row        row of the result set.
 * You may obtain a copy of the License at
        List<DBDAttributeBinding> descAttrs = new ArrayList<>();

                    .map(info::get)

                final String name = attributes.stream()
    public static void setGeometryProperties(
 *
            return geomAttr;
        public final List<DBDAttributeBinding> descAttrs;
                    .filter(Objects::nonNull)

        } else {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 * limitations under the License.
                    .getPreferenceStore().getString(ModelPreferences.DICTIONARY_COLUMN_DIVIDER);
                }
            final Collection<DBDAttributeBinding> attributes = entity.getDescriptionColumns(geomAttrs.descAttrs);
 * See the License for the specific language governing permissions and
        properties.put("info", info);
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                GeomAttrs geomAttrs = new GeomAttrs(attr, descAttrs);
                    properties.put("name", name);
//            result.get(0).descAttrs.addAll(descAttrs);

        final DBVEntity entity = entityAttribute != null ? DBVUtils.getVirtualEntity(entityAttribute.getParentObject(), true) : null;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
            this.descAttrs = descAttrs;
            return descAttrs;
        if (srid == 0) {
 * GeometryDataUtils.
        }
    }
                descAttrs.add(attr);

        if (index == 0) {
        final Map<String, String> info = new LinkedHashMap<>();
            if (!attributes.isEmpty()) {
    public static List<GeomAttrs> extractGeometryAttributes(IResultSetController controller) {

            return GisConstants.SRID_4326;
import org.jkiss.dbeaver.Log;
    }

//        }
        int index,
        return srid;
        return result;
 * Unless required by applicable law or agreed to in writing, software
        for (DBDAttributeBinding attr : attributes) {
        final DBSEntityAttribute entityAttribute = geomAttrs.getGeomAttr().getEntityAttribute();

 */
    public static int getDefaultSRID() {
    }
            if (!DBUtils.isNullValue(description)) {
        public List<DBDAttributeBinding> getDescAttrs() {
            final Object description = model.getCellValue(binding, row);
    ) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
        public DBDAttributeBinding getGeomAttr() {

 * you may not use this file except in compliance with the License.
        for (DBDAttributeBinding binding : geomAttrs.descAttrs) {
     *
import org.jkiss.code.NotNull;
                final String divider = entity.getDataSource().getContainer()
    @NotNull
        int srid = GISViewerActivator.getDefault().getPreferences().getInt(GeometryViewerConstants.PREF_DEFAULT_SRID);
    private static String rgbToHex(RGB rgb) {
        final Map<String, Object> properties = new LinkedHashMap<>();

    }
        public GeomAttrs(DBDAttributeBinding geomAttr, List<DBDAttributeBinding> descAttrs) {

                    .collect(Collectors.joining(divider));
/**

        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.ui.gis.internal.GISViewerActivator;
     * @param controller result set controller to get the model.
    }

                if (!name.isBlank()) {
        @NotNull DBGeometry geometry,
        }
import org.eclipse.swt.widgets.Display;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.graphics.RGB;
package org.jkiss.dbeaver.ui.gis;
import java.util.*;
        properties.put("id", DBUtils.getObjectFullName(geomAttrs.geomAttr, DBPEvaluationContext.UI));
            if (attr.getValueHandler().getValueObjectType(attr.getAttribute()) == DBGeometry.class) {
import org.jkiss.dbeaver.model.gis.DBGeometry;
        properties.put("color", info.getOrDefault("color", rgbToHex(makeGeometryColor(index))));
        if (entity != null) {
     */
        }
    private static final Log log = Log.getLog(GeometryDataUtils.class);
                    .map(DBDAttributeBinding::getName)

 * DBeaver - Universal Database Manager
public class GeometryDataUtils {
import org.jkiss.dbeaver.model.DBUtils;
     * @param index      index of the geometry in the result set.
        @NotNull GeomAttrs geomAttrs,
            }
        List<GeomAttrs> result = new ArrayList<>();
        return String.format("#%02x%02x%02x", rgb.red, rgb.green, rgb.blue);
            return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE).getRGB();
 * distributed under the License is distributed on an "AS IS" BASIS,

     * @param geomAttrs  geometry attributes.
            return UIColors.getColor(index).getRGB();
import org.jkiss.dbeaver.ui.UIColors;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                info.put(binding.getName(), binding.getValueHandler().getValueDisplayString(binding, description, DBDDisplayFormat.NATIVE));
                result.add(geomAttrs);
/*
    @NotNull
        }
     * @param geometry   geometry to set properties.

import org.jkiss.dbeaver.model.virtual.DBVEntity;
            }
        final ResultSetModel model = controller.getModel();
 *
        @NotNull ResultSetRow row
            } else {

import org.eclipse.swt.SWT;
            this.geomAttr = geomAttr;
        geometry.setProperties(properties);
    }
    private static RGB makeGeometryColor(int index) {
import org.jkiss.dbeaver.model.virtual.DBVUtils;
    public static class GeomAttrs {
        List<DBDAttributeBinding> attributes = model.getVisibleAttributes();
        public final DBDAttributeBinding geomAttr;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;
