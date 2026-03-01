        try {
            }
            }
import org.locationtech.jts.io.ParseException;
//        registryManager.addRegistry(new IGNFRegistry());
            log.error("Error getting default CRS", e);

        }
            double[] srcCoord = getCoordinateValues(coord);
 */
        double[] srcCoord;
            try {
        registryManager.addRegistry(new EPSGRegistry());
        if (targetCoord != null) {
        if (dataSource instanceof IAdaptable adaptable) {
        if (srid == GisConstants.SRID_SIMPLE || srid == GisConstants.SRID_4326 || geometry.getGeometry() == null) {
import org.cts.op.CoordinateOperation;

                jtsValue = transformGeometry(jtsValue, op);
 * distributed under the License is distributed on an "AS IS" BASIS,
            coord.y = targetCoord[1];

        if (object instanceof Geometry) {
    private static List<Integer> crsCodes;
        try {
import org.cts.crs.ProjectedCRS;
                    request.setShowOnMap(false);
        if (crsCodes == null) {
    }
        return srcCoord;
        } else if (object instanceof org.cugos.wkg.Geometry) {
        }
            } catch (Exception e) {
        RegistryManager registryManager = crsFactory.getRegistryManager();
                //throw e;

            }
//        registryManager.addRegistry(new Nad83Registry());

/**
            }
                return new WKTReader().read(object.toString());
    }
        }
import org.cts.op.CoordinateOperationException;
        return jtsValue;
        }
        } catch (CRSException e) {
            Set<CoordinateOperation> coordOps = CoordinateOperationFactory.createCoordinateOperations((GeodeticCRS) crs1, (GeodeticCRS) crs2);
            return adaptable.getAdapter(SpatialDataProvider.class);
            if (convertedValue instanceof DBGeometry) {
import org.cts.CRSFactory;
        // uses plain string data type with GIS value manager.
    public static DBGeometry transformToSRID(@NotNull DBGeometry geometry, int targetSRID) {
    }

            throw new DBException("Error transforming SRIDs", e);
    }
        }
    }
import org.cts.crs.CoordinateReferenceSystem;
                request.setTargetValue(targetValue);
    }
        }
        //registryManager.addRegistry(new IGNFRegistry());
 * Licensed under the Apache License, Version 2.0 (the "License");
        return geom;
import org.cts.IllegalCoordinateException;
            	CoordinateOperation op = CoordinateOperationFactory.getMostPrecise(coordOps);
            return (DBGeometry) cellValue;
        }
        }
        // any external systems or make db queries.
        for (Coordinate coord : geom.getCoordinates()) {
    public static Geometry getJtsGeometry(@Nullable Object object) {
    @Nullable

            crsCodes = new ArrayList<>();
import org.jkiss.code.Nullable;
                    geometry.setSRID(request.getTargetSRID());
import org.locationtech.jts.io.WKTReader;
        return null;
            if (targetCoord.length > 2) {

        geom = (Geometry) geom.clone();
import org.cts.registry.RegistryManager;
public class GisTransformUtils {

            } catch (ParseException e) {
    }
            if (!coordOps.isEmpty()) {
    private static Geometry transformGeometryTo(ProjectedCRS projectedCRS, Geometry geometry) throws CoordinateOperationException, IllegalCoordinateException {
        return crsCodes;
                log.debug("Unable to parse geometry for CRS transformation: " + e.getMessage());
    private static void setCoordinateValues(Coordinate coord, double[] targetCoord) {
            double[] srcCoord = getCoordinateValues(coord);
                GisTransformRequest request = new GisTransformRequest(geometry.getGeometry(), srid, targetSRID);
import org.cts.op.CoordinateOperationFactory;
import java.util.List;

            setCoordinateValues(coord, targetCoord);
            //srcSRID = 3857;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                valueType,
            CoordinateReferenceSystem crs1 = crsFactory.getCRS("EPSG:" + request.getSourceSRID());
        try (DBCSession utilSession = DBUtils.openUtilSession(new VoidProgressMonitor(), dataContainer, "Convert GIS value"))  {
    private static double[] getCoordinateValues(Coordinate coord) {
                cellValue,
                log.debug("Error transforming CRS", e);
 * See the License for the specific language governing permissions and
//                    if (crs1 instanceof ProjectedCRS) {


    public static Geometry transformGisData(Geometry jtsValue, CoordinateReferenceSystem crs1, CoordinateReferenceSystem crs2) throws Exception {
    }
            CoordinateReferenceSystem crs2 = crsFactory.getCRS("EPSG:" + request.getTargetSRID());
                log.debug(e);
    }
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
        // This may be needed if use some attribute transformer or some datasource
package org.jkiss.dbeaver.model.gis;
 * limitations under the License.
//        registryManager.addRegistry(new ESRIRegistry());
                for (String code : crsFactory.getSupportedCodes(GisConstants.GIS_REG_EPSG)) {
//        registryManager.addRegistry(new WorldRegistry());

                // Transform coord using the op CoordinateOperation from crs1 to crs2
    public static CRSFactory getCRSFactory() {
            return geometry;
 *
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
        return crsFactory;
    private static CRSFactory crsFactory = new CRSFactory();
    private static Geometry transformGeometry(Geometry geom, CoordinateOperation op) throws Exception {
            Object convertedValue = valueHandler.getValueFromObject(
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
import org.eclipse.core.runtime.IAdaptable;
        return null;
import org.locationtech.jts.geom.Geometry;
import org.jkiss.dbeaver.model.exec.DBCSession;


            }
import org.jkiss.dbeaver.model.DBPDataSource;
    private static final Log log = Log.getLog(GisTransformUtils.class);


import java.util.ArrayList;


/*
    public static void transformGisData(GisTransformRequest request) throws DBException {
        return null;
    public static DBGeometry getGeometryValueFromObject(DBSDataContainer dataContainer, DBDValueHandler valueHandler, DBSTypedObject valueType, Object cellValue) {
                    request.setTargetValue(geometry);
                false, false);
    }
//                    }
                utilSession,
                return (DBGeometry) convertedValue;
            srcCoord = new double[]{coord.x, coord.y};
                Geometry targetValue = transformGisData(request.getSourceValue(), crs1, crs2);
            } catch (IllegalArgumentException e) {
            setCoordinateValues(coord, transform);
        } catch (Exception e) {
}
 */
            } catch (RegistryException e) {
        }
import org.cts.crs.GeodeticCRS;
        if (cellValue instanceof DBGeometry) {
                }
            crs3857 = crsFactory.getCRS("EPSG:3857");
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
import org.cts.registry.EPSGRegistry;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            }
        CoordinateOperation coordinateOperation = projectedCRS.toGeographicCoordinateConverter();
            coord.x = targetCoord[0];
        // Convert value from string, binary or some other format.
            double[] transform = coordinateOperation.transform(srcCoord);
    static {
        return null;
        }
        int srid = geometry.getSRID();
    }
import org.jkiss.dbeaver.DBException;
                targetValue.setSRID(request.getTargetSRID());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
                return new DBGeometry(request.getTargetValue());
import java.util.Set;
                if (CommonUtils.equalObjects(crs1.getCoordinateSystem(), crs3857.getCoordinateSystem())) {
            log.debug("Error transforming geometry value", e);
import org.jkiss.dbeaver.Log;
                return jtsValue;
        if (crs1 instanceof GeodeticCRS && crs2 instanceof GeodeticCRS) {
        if (Double.isNaN(coord.z)) {
            srcCoord = new double[]{coord.x, coord.y, coord.z};
                crsCodes.sort(Integer::compareTo);


 * GisTransformUtils.
            double[] targetCoord = op.transform(srcCoord);
            return (Geometry) object;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        } else {

            try {
                return geometry;

            }
 *
    }
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                    Geometry geometry = transformGisData(request.getSourceValue(), crs3857, crs2);
        for (Coordinate coord : geometry.getCoordinates()) {
    public static SpatialDataProvider getSpatialDataProvider(DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.DBUtils;

        }
                GisTransformUtils.transformGisData(request);
        // Use void monitor because this transformation shouldn't interact with
    public static synchronized List<Integer> getSortedEPSGCodes() {
        }
import org.jkiss.dbeaver.model.exec.DBCException;
            try {
import org.cts.registry.RegistryException;
import org.cts.crs.CRSException;
import org.locationtech.jts.geom.Coordinate;
//                        geometry = transformGeometryTo((ProjectedCRS) crs1, geometry);
        } catch (DBCException e) {
 *
                    crsCodes.add(CommonUtils.toInt(code));
            try {
                request.setShowOnMap(true);
                coord.z = targetCoord[2];

    private static CoordinateReferenceSystem crs3857;
        }
