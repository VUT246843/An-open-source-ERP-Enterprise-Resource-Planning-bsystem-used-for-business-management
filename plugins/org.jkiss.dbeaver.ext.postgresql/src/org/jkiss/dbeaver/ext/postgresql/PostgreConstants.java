        DATA_TYPE_CANONICAL_NAMES.put(TYPE_INT2, "smallint");

    public static final DBSEntityConstraintType CONSTRAINT_TRIGGER = new DBSEntityConstraintType("trigger", "TRIGGER", "Trigger constraint", false, false, false, false); //$NON-NLS-1$
        "ST_GeomFromEWKT",
        "ST_PointFromWKB",
    public static final String PROP_SERVER_TYPE = "serverType";
        DATA_TYPE_CANONICAL_NAMES.put(TYPE_INT8, "bigint");
        "PostGIS_GEOS_Version",
        "ST_GeogFromWKB",
        "ST_GeomFromGeoHash",
    public static final String TYPE_REFCURSOR = "refcursor";
        DATA_TYPE_ALIASES.put("interval year to month", TYPE_INTERVAL);
        "ST_Summary",
        DBDPseudoAttribute.PropagationPolicy.TABLE_LOCAL

        "ST_YMax",
        "ST_LineFromText",

        SERIAL_TYPES.put("serial4", TYPE_INT4);

        "ST_BoundingDiagonal",
        "ST_LineFromWKB",
        "ST_Polygon",
        DATA_TYPE_ALIASES.put("interval second", TYPE_INTERVAL);
        "ST_SRID",
        DBDPseudoAttributeType.ROWID,
        "ST_GeomCollFromText",
        //8.5. Geometry Accessors

    public static final String TYPE_BOOLEAN = "boolean";
        "ST_BdPolyFromText",
        "ST_ZMin",
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
    public static final String PROP_DD_TAG_STRING = "postgresql.dd.tag.string";
        // 8.3. Management Functions
        "ST_AddPoint",
        "PostGIS_Full_Version",
        DATA_TYPE_CANONICAL_NAMES.put("character varying", "varchar");
import java.util.Map;


        "ST_AsEWKB",
    public static final String PROP_SSL_MODE = "sslMode";
    public static final String USER_VARIABLE = "$user";
import java.util.LinkedHashMap;
        "ST_WKBToSQL",
        "ST_IsPolygonCW",
        //8.6. Geometry Editors
        "ST_X",
        "PostGIS_Scripts_Released",
        "ST_AsTWKB",
    public static final Map<String, String> DATA_TYPE_ALIASES = new HashMap<>();
    public static final String OPTION_STANDARD_CONFORMING_STRINGS = "standard_conforming_strings";
        DATA_TYPE_ALIASES.put("decimal", "numeric");
 * DBeaver - Universal Database Manager
        SERIAL_TYPES.put("serial8", TYPE_INT8);

        "ST_TransScale",
    public static final String TYPE_MONEY = "money";
        "ST_NPoints",
        PostgreSQLMessages.pseudo_column_oid_description,
        "Populate_Geometry_Columns",
    public static final DBSEntityConstraintType CONSTRAINT_EXCLUSIVE = new DBSEntityConstraintType("exclusive", "EXCLUSIVE", "Exclusive constraint", false, false, false, false); //$NON-NLS-1$

        DATA_TYPE_CANONICAL_NAMES.put(TYPE_INT4, "integer");
    public static final String PROP_SHOW_DATABASE_STATISTICS = "show-database-statistics";
    public static final String TYPE_FLOAT8 = "float8";
    public static final Map<String, String> DATA_TYPE_CANONICAL_NAMES = new HashMap<>();
        "ST_NumPoints",
        "ST_ForceCollection",
        "ST_RotateX",
        "Asia/Calcutta", "Asia/Kolkata",
        "ST_IsValidDetail",
        "ST_GeometryN",
        "ST_ForcePolygonCW",
    public static final String PUBLIC_SCHEMA_NAME = "public";
    public static final String EC_PERMISSION_DENIED = "42501"; //$NON-NLS-1$
        "oid",
        DATA_TYPE_ALIASES.put("real", TYPE_FLOAT4);
        "PostGIS_Scripts_Installed",
        "ST_MakeLine",
        "ST_AsHEXEWKB",
        DATA_TYPE_ALIASES.put("integer", TYPE_INT4);
        "ST_BdMPolyFromText",

        "PostGIS_Lib_Build_Date",

public class PostgreConstants {
        "PostGIS_Scripts_Build_Date",
        "ST_ForceRHR",
    public static final String PROP_DD_PLAIN_STRING = "postgresql.dd.plain.string";
    /** @deprecated Use {@link SSLHandlerTrustStoreImpl#PROP_SSL_CA_CERT} instead */
        DATA_TYPE_ALIASES.put("interval day to second", TYPE_INTERVAL);
import org.jkiss.dbeaver.model.DBConstants;
        "ST_LineFromMultiPoint",
        "ST_GeomFromText",
        "ST_Z",

    public static final String PROP_SHOW_UNAVAILABLE_DB = DBConstants.INTERNAL_PROP_PREFIX + "show-unavailable-db@";
    public static final Map<String, String> REPLACING_TIMEZONE = Map.of(
    public static final String DEFAULT_USER = "postgres";
        DATA_TYPE_ALIASES.put("interval month", TYPE_INTERVAL);
        "ST_StartPoint",
        "ST_IsValid",
 * Unless required by applicable law or agreed to in writing, software
    public static final String EC_QUERY_CANCELED = "57014"; //$NON-NLS-1$
        DATA_TYPE_ALIASES.put("interval hour", TYPE_INTERVAL);
        "ST_IsEmpty",
    // Settings names from 'pg_options' view
    public static final Map<String, String> SERIAL_TYPES = new LinkedHashMap<>();

        "ST_NumInteriorRing",
    public static final String CATALOG_SCHEMA_NAME = "pg_catalog";
    public static final String TEMP_SCHEMA_PREFIX = "pg_temp_";
        "PostGIS_Lib_Version",
    public static final String PROP_SSL_CLIENT_KEY = "clientKey";
    public static final String TYPE_UUID = "uuid";
        "ST_GeomFromGeoJSON",
        "ST_LinestringFromWKB",
        "ST_YMin",
        "ST_PolygonFromText",
 */
        "DropGeometryColumn",
    public static final String DEFAULT_ARRAY_DELIMITER = " ";
    public static final String TYPE_TIMETZ = "timetz";
 * PostgreConstants
        "ST_AsEWKT",
        "ST_MakeBox2D",
    public static final String TYPE_JSONB = "jsonb";
 *     http://www.apache.org/licenses/LICENSE-2.0
        "PostGIS_PROJ_Version",
        "ST_AsMVT",
        "ST_M",
    public static final String TYPE_JSON = "json";
}

    public static final String PROP_READ_ALL_DATA_TYPES = DBConstants.INTERNAL_PROP_PREFIX + "read-all-data-types-db@";
    /** @deprecated Use {@link SSLHandlerTrustStoreImpl#PROP_SSL_CLIENT_KEY} instead */
        "ST_GeomFromTWKB",
    public static final String PROP_SHOW_TEMPLATES_DB = DBConstants.INTERNAL_PROP_PREFIX + "show-template-db@";

    public static final String COLLATION_DEFAULT = "default";
        "ST_IsPolygonCCW",
        "ST_AsBinary",
        "ST_NRings",
        "ST_Segmentize",
        "ST_NumGeometries",
        "ST_Points",

    public static final String OPERATION_ALTER = "alter";
    @Deprecated
    public static final String TYPE_TEXT = "text";
        "ST_AsText",
        DATA_TYPE_ALIASES.put("timestamp with time zone", TYPE_TIMESTAMPTZ);
        "ST_RotateY",
        "ST_Force2D",
import org.jkiss.dbeaver.model.struct.DBSObjectState;
        "ST_MakePoint",
        "ST_GeoHash",
        "ST_IsSimple",
    public static final String TYPE_CHAR = "char";
        "ST_Scale",
package org.jkiss.dbeaver.ext.postgresql;
        DATA_TYPE_ALIASES.put("timestamp without time zone", TYPE_TIMESTAMP);
        "ST_PointFromText",
        DATA_TYPE_ALIASES.put("interval minute to second", TYPE_INTERVAL);
        "ST_GeogFromText",

        "ST_Force3DZ",
        DATA_TYPE_ALIASES.put("void", "void");
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
        "ST_AsMVTGeom",
    @Deprecated
    public static final String TYPE_FLOAT4 = "float4";
    public static final String PG_OBJECT_CLASS = "org.postgresql.util.PGobject";
    public static final String HANDLER_SSL = "postgre_ssl";
    public static final String PG_INTERVAL_CLASS = "org.postgresql.util.PGInterval";
    public static final String BIN_FOLDER = "bin";
    public static final String TYPE_INT4 = "int4";
        "ST_Multi",
        "ST_Boundary",
        "ST_Force4D",
        "ST_CollectionHomogenize",
        DATA_TYPE_CANONICAL_NAMES.put(TYPE_FLOAT4, "real");
    public static final String PG_INSTALL_REG_KEY = "SOFTWARE\\PostgreSQL\\Installations";
 *

        DATA_TYPE_ALIASES.put("interval", TYPE_INTERVAL);
        "ST_Box2dFromGeoHash",
 *
 * See the License for the specific language governing permissions and
        SERIAL_TYPES.put("serial", TYPE_INT4);

        "ST_InteriorRingN",
    public static final String PG_INSTALL_PROP_BASE_DIRECTORY = "Base Directory";
 *
        "ST_IsValidReason",
        // 8.4. Geometry Constructors
    }
    public static final DBSObjectState STATE_UNAVAILABLE = new DBSObjectState("Unavailable", DBIcon.OVER_EXTERNAL);
    public static final String TYPE_BOOL = "bool";

    static {
        "ST_IsCollection",
 * Licensed under the Apache License, Version 2.0 (the "License");

        "ST_Y",
        "ST_SetPoint",
    public static final String PROP_CHOSEN_ROLE = DBConstants.INTERNAL_PROP_PREFIX + "chosen-role@";
        "ST_GeomFromGML",
    };
    public static final String TYPE_GEOMETRY = "geometry";
        "ST_AsEncodedPolyline",
        "ST_GeomFromKML",
        "ST_ForcePolygonCCW",
    public static final String SYSTEM_SCHEMA_PREFIX = "pg_";
     */
        DATA_TYPE_ALIASES.put("time without time zone", TYPE_TIME);
    /** @deprecated Use {@link SSLHandlerTrustStoreImpl#PROP_SSL_CLIENT_CERT} instead */
        "ST_Force3D",
/*
        "ST_WKTToSQL",
        "ST_AsX3D",
        SERIAL_TYPES.put("serial2", TYPE_INT2);
    );
    public static final String TOAST_SCHEMA_PREFIX = "pg_toast";
        "UpdateGeometrySRID",
    public static final String PG_GEOMETRY_CLASS = "org.postgis.PGgeometry";
        "ST_AsGeobuf",
        DATA_TYPE_ALIASES.put("bigint", TYPE_INT8);
    public static final String TYPE_BIGINT = "bigint";
        "ST_Force3DM",
        DATA_TYPE_ALIASES.put("interval day to minute", TYPE_INTERVAL);
    public static final String TYPE_VARBYTE = "varbyte";
        DATA_TYPE_ALIASES.put("int", TYPE_INT4);

        "ST_Point",
        "Europe/Kyiv", "Europe/Kiev",

        "oid",
    public static final String TYPE_TIME = "time";
        "ST_AsGML",
     * @see [https://www.postgresql.org/docs/9.2/static/errcodes-appendix.html]
        DATA_TYPE_ALIASES.put("boolean", TYPE_BOOL);
    public static final String TYPE_INT8 = "int8";
        false,
    public static final String TYPE_TIMESTAMP = "timestamp";
        DATA_TYPE_ALIASES.put("interval minute", TYPE_INTERVAL);

    @Deprecated

    public static final String PROP_READ_KEYS_WITH_COLUMNS = "read-keys-with-columns";
        "ST_MakePolygon",
        "ST_MPolyFromText",
        DATA_TYPE_ALIASES.put("smallint", TYPE_INT2);
    public static final String PROP_SSL_ROOT_CERT = "rootCert";
        "ST_AsSVG",
        "ST_3DMakeBox",
    public static final String TYPE_INT2 = "int2";
        "ST_MLineFromText",
        "ST_LineFromEncodedPolyline",

import org.jkiss.dbeaver.model.data.DBDPseudoAttributeType;
    public static final String PROP_USE_PREPARED_STATEMENTS = DBConstants.INTERNAL_PROP_PREFIX + "use-prepared-statements-db@";
        DATA_TYPE_ALIASES.put("interval day", TYPE_INTERVAL);
    public static final String PROP_SSL_CLIENT_CERT = "clientCert";
        "ST_Translate",
        "ST_XMin",
        "ST_RotateZ",
    public static final String PROP_SSL_PROXY = "sslProxyServer";

    public static final String PG_INSTALL_PROP_BRANDING = "Branding";
        "ST_MakeEnvelope",

    public static final String DEFAULT_DATABASE = "postgres";
        SERIAL_TYPES.put("smallserial", TYPE_INT2);

        "ST_Transform",

        DATA_TYPE_ALIASES.put("interval hour to second", TYPE_INTERVAL);
    public static final String TYPE_TIMESTAMPTZ = "timestamptz";
        "ST_PatchN",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        "ST_GeomFromWKB",

import java.util.HashMap;
        "ST_RemovePoint",
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DATA_TYPE_ALIASES.put("character", TYPE_BPCHAR);
        DATA_TYPE_ALIASES.put("interval year", TYPE_INTERVAL);
    public static final String PSQL_EXCEPTION_CLASS_NAME = "org.postgresql.util.PSQLException";
 * you may not use this file except in compliance with the License.
        "ST_Snap",
    public static final String TYPE_VARBIT = "varbit";
        "ST_Zmflag",
import org.jkiss.dbeaver.model.DBIcon;
        "PostGIS_Liblwgeom_Version",
        "ST_MPointFromText",
    );
        "DropGeometryTable",
    public static final String TYPE_BIT = "bit";

/**
    public static final String[] POSTGIS_FUNCTIONS = {
        "ST_IsRing",
        DATA_TYPE_ALIASES.put("bit varying", TYPE_VARBIT);
        "Europe/Kiev", "Europe/Kyiv",
        SERIAL_TYPES.put("bigserial", TYPE_INT8);
    public static final String TEMP_SCHEMA_NAME = "pg_temp";
    public static final String TYPE_BPCHAR = "bpchar";
        "ST_CollectionExtract",
    public static final String TYPE_INTERVAL = "interval";
    public static final String TYPE_VARCHAR = "varchar";
        "ST_CoordDim",
    public static final String PG_PASS_HOSTNAME = "overriddenUsername";
        DATA_TYPE_ALIASES.put("interval hour to minute", TYPE_INTERVAL);
    public static final String ERROR_TRANSACTION_ABORTED = "25P02";
        "ST_Normalize",
 * limitations under the License.
        "ST_IsClosed",
    public static final String PROP_REPLACE_LEGACY_TIMEZONE = "replace-legacy-timezone";

        DATA_TYPE_ALIASES.put("char varying", TYPE_VARCHAR);
        DATA_TYPE_ALIASES.put("character varying", TYPE_VARCHAR);
    public static final String TYPE_HSTORE = "hstore";
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        "PostGIS_LibXML_Version",
 */
    public static final String ERROR_ADMIN_SHUTDOWN = "57P01";
    public static final String DEFAULT_HOST = "localhost";
        "ST_EndPoint",
        "ST_NumPatches",


        "ST_NDims",
    public static final String TYPE_GEOGRAPHY = "geography";
    public static final String TYPE_XML = "xml";
        DATA_TYPE_ALIASES.put("double precision", TYPE_FLOAT8);
import org.jkiss.dbeaver.ext.postgresql.internal.PostgreSQLMessages;


    /**
        DATA_TYPE_ALIASES.put("interval day to hour", TYPE_INTERVAL);
 * You may obtain a copy of the License at
        "ST_MakePointM",
    public static final String INFO_SCHEMA_NAME = "information_schema";
        //8.7. Geometry Outputs
    public static final String PROP_SSL = "ssl";
        "ST_ExteriorRing",
        "ST_ForceCurve",
    public static final DBDPseudoAttribute PSEUDO_ATTR_OID = new DBDPseudoAttribute(
        DATA_TYPE_ALIASES.put("time with time zone", TYPE_TIMETZ);
        "ST_PointFromGeoHash",

        "ST_Envelope",
        "ST_GeometryFromText",
        "ST_LineMerge",

        "AddGeometryColumn",
        "ST_GeometryType",
        "ST_XMax",
        "ST_Reverse",
        "oid",
        "ST_AsKML",
        "Asia/Kolkata", "Asia/Calcutta"
        "ST_ZMax",
    public static final String DEFAULT_DATA_TYPE = "varchar";

        "ST_Dimension",
        "ST_PointN",
        "PostGIS_Version",
        "ST_AsGeoJSON",
        "ST_ForceSFS",
    public static final String TYPE_BYTEA = "bytea";
        "ST_GeomFromEWKB",
        "ST_Rotate",

    public static final String PROP_SSL_FACTORY = "sslFactory";


 * distributed under the License is distributed on an "AS IS" BASIS,
        "ST_GMLToSQL",
    public static final int DEFAULT_PORT = 5432;
        "ST_GeographyFromText",

        "ST_SetSRID",
        "ST_NumInteriorRings",
        "ST_AsLatLonText",
        "GeometryType",
        "ST_Affine",
    public static final String PROP_SHOW_NON_DEFAULT_DB = DBConstants.INTERNAL_PROP_PREFIX + "show-non-default-db@";
        "ST_SnapToGrid",
    public static final String PG_ARRAY_CLASS = "org.postgresql.jdbc.PgArray";
