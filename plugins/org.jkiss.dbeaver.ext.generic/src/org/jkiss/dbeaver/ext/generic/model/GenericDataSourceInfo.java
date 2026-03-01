        if (supportsCatalogSelection != null) {
        return supportsMultipleResults;
        setReadOnlyMetaData(CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_READ_ONLY_META_DATA), false));
        final Object supportsStoredCode = driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_STORED_CODE);
public class GenericDataSourceInfo extends JDBCDataSourceInfo {
    public GenericDataSourceInfo(DBPDriver driver, JDBCDatabaseMetaData metaData)
    }
        }
            this.setSupportsReferences(CommonUtils.toBoolean(supportsReferences));
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        if (supportsIndexes != null) {
    private final boolean supportsLimits;
            this.setSupportsIndexes(CommonUtils.toBoolean(supportsIndexes));
            true
            driver.getDriverParameter(DBPDriverConstants.PARAM_SUPPORTS_CATALOG_SELECTION),
    public void setSupportsNullableUniqueConstraints(boolean supportsNullableUniqueConstraints) {
        supportsCatalogSelection = CommonUtils.getBoolean(

            true
    private final boolean supportsTransactionsForDDL;
/**
    public boolean supportsSchemaSelection;
    private boolean multipleResultsFailsOnMaxRows;
    public boolean supportsTransactionsForDDL() {
        return supportsNullableUniqueConstraints;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        );
        return supportsLimits;
 * See the License for the specific language governing permissions and


        final Object supportsViews = driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_VIEWS);
        setSupportsResultSetScroll(CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_SCROLL), false));
        return supportsConstraints;

    @Override
        supportsSchemaSelection = CommonUtils.getBoolean(
        this.supportsNullableUniqueConstraints = supportsNullableUniqueConstraints;
/*
    }
import org.jkiss.dbeaver.model.connection.DBPDriver;
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return multipleResultsFailsOnMaxRows;
            this.setSupportsStoredCode(CommonUtils.toBoolean(supportsStoredCode));
    }

    }
        final Object supportsCatalogSelection = driver.getDriverParameter(DBPDriverConstants.PARAM_SUPPORTS_CATALOG_SELECTION);
    }
    public boolean supportsSchemaSelection() {
        }
        if (supportsStoredCode != null) {
 */

        return supportsCatalogSelection;
    @Override

            this.supportsCatalogSelection = CommonUtils.toBoolean(supportsCatalogSelection);
 */
    }


        return supportsSchemaSelection;
    private boolean supportsNullableUniqueConstraints;
        final Object supportSchemaSelection = driver.getDriverParameter(DBPDriverConstants.PARAM_SUPPORTS_SCHEMA_SELECTION);
    {
    }
        if (supportsViews != null) {
        supportsMultipleResults = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_MULTIPLE_RESULTS), false);


            this.supportsSchemaSelection = CommonUtils.toBoolean(supportSchemaSelection);
        if (supportsReferences != null) {
        super(metaData);
        return super.supportsTransactionsForDDL() && supportsTransactionsForDDL;
import org.jkiss.utils.CommonUtils;
        if (supportSchemaSelection != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final boolean supportsConstraints;
    @Override
        }
import org.jkiss.dbeaver.model.connection.DBPDriverConstants;
            this.setSupportsViews(CommonUtils.toBoolean(supportsViews));
package org.jkiss.dbeaver.ext.generic.model;
    public boolean isMultipleResultsFailsOnMaxRows() {

    public boolean supportsResultSetLimit() {
 *
    public boolean supportsCatalogSelection;
        final Object supportsReferences = driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_REFERENCES);
        setReadOnlyData(CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_READ_ONLY_DATA), false));
    public boolean supportsCatalogSelection() {
    public boolean supportsMultipleResults() {

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software

        supportsLimits = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_LIMITS), true);
 *
    public boolean supportsNullableUniqueConstraints() {
 * Generic data source info
        supportsConstraints = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_CONSTRAINTS), true);
        multipleResultsFailsOnMaxRows = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_MULTIPLE_RESULTS_FAILS_ON_MAX_ROWS), false);
    }
            driver.getDriverParameter(DBPDriverConstants.PARAM_SUPPORTS_SCHEMA_SELECTION),


    }
    @Override
        supportsTransactionsForDDL = CommonUtils.getBoolean(driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_TRANSACTIONS_FOR_DDL), true);
 * DBeaver - Universal Database Manager
        final Object supportsIndexes = driver.getDriverParameter(GenericConstants.PARAM_SUPPORTS_INDEXES);

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
 * You may obtain a copy of the License at

    public boolean supportsTableConstraints() {
    private boolean supportsMultipleResults;
        }
        supportsNullableUniqueConstraints = false;
 *
 * you may not use this file except in compliance with the License.
        );

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
