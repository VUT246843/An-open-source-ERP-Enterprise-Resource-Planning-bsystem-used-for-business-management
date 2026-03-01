import org.jkiss.dbeaver.model.exec.DBCSession;
            super(target);
    }
        }
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
 * Transforms string value into geometry
import org.jkiss.dbeaver.model.gis.GisConstants;
/*
import org.jkiss.dbeaver.Log;
public class GeometryAttributeTransformer implements DBDAttributeTransformer {
        }

    }
 *
}

            return getValueFromObject(session, type, object, false, false);
        attribute.setPresentationAttribute(
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        int srid = CommonUtils.toInt(options.get(PROP_SRID));
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

            this.realHandler = new GISGeometryValueHandler();
        public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.Nullable;

        @Override
    @Override
    private static class GISValueHandler extends ProxyValueHandler {
        }
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
    private static final String PROP_INVERT_COORDINATES = "invertCoordinates";
        @Override
import org.jkiss.dbeaver.model.impl.data.transformers.TransformerPresentationAttribute;

        @NotNull
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    private static final Log log = Log.getLog(GeometryAttributeTransformer.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        @Nullable


package org.jkiss.dbeaver.data.gis.handlers;

 */
        boolean leadingSrid = CommonUtils.toBoolean(options.get(PROP_LEADING_SRID));
            this.realHandler.setDefaultSRID(srid);
        public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            srid = GisConstants.SRID_4326;


 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public GISValueHandler(DBDValueHandler target, int srid, boolean invertCoordinates, boolean leadingSrid) {
    public static final String GIS_TYPE_NAME = "GIS.Transformed";
            Object object = super.fetchValueObject(session, resultSet, type, index);
            return realHandler.getValueDisplayString(column, value, format);
        @Override
        @NotNull
import java.util.List;
/**
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;


        if (srid == 0) {
 *
        }
            return realHandler.getValueFromObject(session, type, object, copy, false);
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
            this.realHandler.setLeadingSRID(leadingSrid);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 */

import org.jkiss.dbeaver.DBException;
            new TransformerPresentationAttribute(attribute, GIS_TYPE_NAME, -1, attribute.getDataKind()));
        }
import java.util.Map;
import org.jkiss.dbeaver.model.exec.DBCException;
            return realHandler.getValueObjectType(attribute);
        }
 * limitations under the License.
        public Object fetchValueObject(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, @NotNull DBSTypedObject type, int index) throws DBCException {
            this.realHandler.setInvertCoordinates(invertCoordinates);
        attribute.setTransformHandler(new GISValueHandler(attribute.getValueHandler(), srid, invertCoordinates, leadingSrid));

    private static final String PROP_LEADING_SRID = "leadingSrid";
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
    private static final String PROP_SRID = "srid";
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.data.DBDValueHandler;
        boolean invertCoordinates = CommonUtils.toBoolean(options.get(PROP_INVERT_COORDINATES ));
        private final GISGeometryValueHandler realHandler;
