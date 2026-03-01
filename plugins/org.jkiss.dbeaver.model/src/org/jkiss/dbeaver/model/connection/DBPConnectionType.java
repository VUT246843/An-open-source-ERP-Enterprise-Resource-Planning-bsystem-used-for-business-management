        if (obj instanceof DBPConnectionType ct) {
        return autocommit;
        } else {
        return autoCloseTransactions;
    }
 */

        this.closeIdleTransactionPeriod = closeIdleTransactionPeriod;
        }

    }
        this.description = description;
    }
        DEV = new DBPConnectionType(
/**
            false,
        DBWorkbench.getPlatform().getPreferenceStore().setValue(DEFAULT_CONNECTION_TYPE_PREF, connectionType.getId());

    }
    }
        return smartCommit;
    private String color;
            "org.jkiss.dbeaver.color.connectionType.qa.background",
            1800, //30 minutes
            true,
    @Override
        this.description = description;
        TEST = new DBPConnectionType(
        int closeIdleTransactionPeriod,
    }
            "255,255,255",

            false,
            return new ArrayList<>(this.connectionModifyRestrictions);
            smartCommitRecover,
    private String description;
        this.autocommit = autocommit;
            true,
        return DBWorkbench.getPlatform().getDataSourceProviderRegistry().getConnectionType(defTypeName, DEV);
    @Override
            7200, //2 hours
            600, //10 minutes
            null);
    }
            true,
            source.smartCommitRecover,
        String name,
import java.util.ArrayList;
/*
            true,
            source.connectionModifyRestrictions);
        boolean predefined,
                smartCommit == ct.smartCommit &&
    public void setSmartCommitRecover(boolean smartCommitRecover) {
    private boolean autocommit;
            return TEST.color;
        defaultType.predefined = false;
        }
            this.connectionModifyRestrictions = new ArrayList<>(connectionModifyRestrictions);
        }
        return autoCloseConnections;
    }
            source.confirmDataChange,
            closeIdleTransactionPeriod,
        this.smartCommitRecover = smartCommitRecover;
    private boolean predefined;
            false,
        this.autoCloseTransactions = autoCloseTransactions;
    }
        if (CommonUtils.isEmpty(defTypeName)) {
            source.closeIdleTransactionPeriod,

    public boolean isAutocommit() {
        this.name = name;
            900, //30 minutes
            description,

        boolean autoCloseTransactions,
            source.id,
        this.closeIdleConnectionPeriod = closeIdleConnectionPeriod;
                confirmDataChange == ct.confirmDataChange &&

 * You may obtain a copy of the License at
    }
 * DBeaver - Universal Database Manager


    }
    }
            false,

 * distributed under the License is distributed on an "AS IS" BASIS,

            color,
            false,
    private int closeIdleConnectionPeriod;
    public void setConfirmExecute(boolean confirmExecute) {
                smartCommitRecover == ct.smartCommitRecover &&
    public String toString() {
        return this.id = id;
    }
        return id.hashCode();
    public boolean isConfirmExecute() {
    public int getCloseIdleTransactionPeriod() {
        this.confirmDataChange = confirmDataChange;
        return false;
        this.autoCloseTransactions = autoCloseTransactions;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return name;
        this.name = name;
    }
import org.jkiss.code.Nullable;
    }
        this.smartCommitRecover = smartCommitRecover;
        return closeIdleTransactionPeriod;
        boolean confirmDataChange,
    private static final String DEFAULT_CONNECTION_TYPE_PREF = "default.connection.type";
        PROD = new DBPConnectionType(
        if (connectionModifyRestrictions != null) {
 *
        this.autoCloseConnections = autoCloseConnections;
                autoCloseConnections == ct.autoCloseConnections &&
        boolean autocommit,

            "prod",
        String color,
    public List<DBPDataSourcePermission> getModifyPermission() {
            false,
    }

    public void setCloseIdleConnectionPeriod(int closeIdleConnectionPeriod) {
            source.smartCommit,
 * limitations under the License.
    }
    public boolean isSmartCommitRecover() {

            autoCloseConnections,
            source.autoCloseTransactions,


        List<DBPDataSourcePermission> connectionModifyRestrictions)
        this.closeIdleTransactionPeriod = closeIdleTransactionPeriod;
            true,
            ModelMessages.dbp_connection_type_table_test,
    }
            ModelMessages.dbp_connection_type_table_production,
    }

        boolean confirmExecute,
        return connectionModifyRestrictions == null || !connectionModifyRestrictions.contains(permission);

            smartCommit,
            null); //$NON-NLS-1$ //$NON-NLS-3$
    public boolean isAutoCloseConnections() {
        this.autoCloseConnections = autoCloseConnections;
        return closeIdleConnectionPeriod;
import org.jkiss.dbeaver.model.messages.ModelMessages;
        boolean autoCloseConnections,

    private boolean smartCommitRecover;
        return predefined;
        this.id = id;
            defTypeName = DEV.getId();
        this.smartCommit = smartCommit;
        boolean smartCommit,
    }
            confirmExecute,
    {
    private boolean confirmDataChange;
    @Override
        this.smartCommit = smartCommit;
    public static DBPConnectionType getDefaultConnectionType() {
            autoCloseTransactions,
            this.connectionModifyRestrictions = null;
import org.jkiss.dbeaver.model.DBPDataSourcePermission;
    public boolean isAutoCloseTransactions() {
            name,
            autocommit,
        boolean smartCommit,
        if (PROD != null && this.id.equals(PROD.id) && color.equals("247,159,129")) {
            "test",
            source.autocommit,
            null); //$NON-NLS-1$ //$NON-NLS-3$

    }
    
 * Copyright (C) 2010-2025 DBeaver Corp and others
        String name,
 *
            id,

            source.description,
            true,
    static {

            null); //$NON-NLS-1$ //$NON-NLS-3$
    }
            true,
    public boolean isSmartCommit() {
        return id;
import java.util.List;
    }
    }

        DEFAULT_TYPE = defaultType;

        boolean autoCloseConnections,
    public static final DBPConnectionType TEST;
    }
import org.jkiss.utils.CommonUtils;
            source.closeIdleConnectionPeriod,
    private boolean autoCloseTransactions;
    public void setModifyPermissions(@Nullable Collection<DBPDataSourcePermission> permissions) {
            3600, //1 hour
    @NotNull
        return color;
        if (CommonUtils.isEmpty(this.connectionModifyRestrictions)) {
        this.confirmDataChange = confirmDataChange;
                CommonUtils.equalObjects(color, ct.color) &&
        String description,
                predefined == ct.predefined &&

    }
    public boolean hasModifyPermission(@NotNull DBPDataSourcePermission permission) {
        String description,
    private boolean smartCommit;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                CommonUtils.equalObjects(closeIdleConnectionPeriod, ct.closeIdleConnectionPeriod) &&
import org.jkiss.dbeaver.model.DBPDataSourcePermissionOwner;
    }
    public DBPConnectionType(DBPConnectionType source) {

                confirmExecute == ct.confirmExecute &&
            return Collections.emptyList();
            true,
    public String getDescription() {
        this.closeIdleConnectionPeriod = closeIdleConnectionPeriod;
    public void setAutoCloseConnections(boolean autoCloseConnections) {
        boolean smartCommitRecover,

        boolean smartCommitRecover,
        if (CommonUtils.isEmpty(permissions)) {
 * Connection type
    }
    }
                CommonUtils.equalObjects(connectionModifyRestrictions, ct.connectionModifyRestrictions);
            14400, //1 hour
        DBPConnectionType defaultType = new DBPConnectionType(DEV);
    public void setAutoCloseTransactions(boolean autoCloseTransactions) {
            true,
            source.predefined,
    public int getCloseIdleConnectionPeriod() {
    public boolean isConfirmDataChange() {
        int closeIdleConnectionPeriod)
        boolean confirmExecute,

 * you may not use this file except in compliance with the License.
        this.color = getColorValueFixed(color);
}


    @Override
    public void setName(String name) {
    private int closeIdleTransactionPeriod;
    public boolean isPredefined() {
        String color,
        boolean autoCloseTransactions,
    public String setId(String id) {

    private String getColorValueFixed(String color) {
    private DBPConnectionType(
    }
                CommonUtils.equalObjects(description, ct.description) &&
            false,
    }
        this(
    }
        } else if (TEST != null && this.id.equals(TEST.id) && color.equals("196,255,181")) {
        this.confirmExecute = confirmExecute;
                CommonUtils.equalObjects(closeIdleTransactionPeriod, ct.closeIdleTransactionPeriod) &&
        return smartCommitRecover;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public static final DBPConnectionType[] SYSTEM_TYPES;

            true,

 * Unless required by applicable law or agreed to in writing, software
    public boolean equals(Object obj) {
    public int hashCode() {
    public static final DBPConnectionType PROD;
            source.name,
    public void setColor(String color) {
        int closeIdleTransactionPeriod,
    public void setAutocommit(boolean autocommit) {
        }
        this.confirmExecute = confirmExecute;
import java.util.Collection;



            closeIdleConnectionPeriod,
import java.util.Collections;

            true,
            this.connectionModifyRestrictions = new ArrayList<>(permissions);
    private String name;

    public DBPConnectionType(
 * See the License for the specific language governing permissions and
    public void setCloseIdleTransactionPeriod(int closeIdleTransactionPeriod) {
        return confirmDataChange;
public class DBPConnectionType implements DBPDataSourcePermissionOwner {
        boolean confirmDataChange,
        boolean autocommit,

    }
            source.autoCloseConnections,
    }
    public String getColor() {
package org.jkiss.dbeaver.model.connection;
    public static final DBPConnectionType DEV;
        String id,
                CommonUtils.equalObjects(name, ct.name) &&
    @Override

 */

    }
import org.jkiss.code.NotNull;
                autocommit == ct.autocommit &&
            ModelMessages.dbp_connection_type_table_test_database,
        } else {

        String id,
 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean confirmExecute;
        this.autocommit = autocommit;
            false,
        this(
        int closeIdleConnectionPeriod,
    private List<DBPDataSourcePermission> connectionModifyRestrictions;

    public static void setDefaultConnectionType(DBPConnectionType connectionType) {
    public void setConfirmDataChange(boolean confirmDataChange) {

            false,

                autoCloseTransactions == ct.autoCloseTransactions &&
            ModelMessages.dbp_connection_type_table_development,
            ModelMessages.dbp_connection_type_table_regular_development_database,
        this.color = getColorValueFixed(color);
    private boolean autoCloseConnections;
            true,
        // In old times we had hardcoded colors now we need to change them to color constants

            ModelMessages.dbp_connection_type_table_production_database,
        SYSTEM_TYPES = new DBPConnectionType[] { DEV, TEST, PROD };
            return CommonUtils.equalObjects(id, ct.id) &&
        }
    }
            "org.jkiss.dbeaver.color.connectionType.prod.background",
            "dev",
        return color;
        this.predefined = predefined;
            return PROD.color;
        String defTypeName = DBWorkbench.getPlatform().getPreferenceStore().getString(DEFAULT_CONNECTION_TYPE_PREF);

    public static final DBPConnectionType DEFAULT_TYPE;
    public String getId() {
    public void setSmartCommit(boolean smartCommit) {
            true,
    private String id;
            true,
            source.confirmExecute,
    @Override
    }
            source.color,
    }
            true,
 *
            true,
    }
        }

    public String getName() {

    public void setDescription(String description) {

        return confirmExecute;
            confirmDataChange,
    {
        // Backward compatibility.
        return description;
        return name;
