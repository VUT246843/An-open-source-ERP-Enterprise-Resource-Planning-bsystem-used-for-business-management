        public final boolean useSmart;

    public static final String CONTENT_CACHE_CLOB = "content.cache.clob"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, SCRIPT_IGNORE_NATIVE_DELIMITER, false);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.data.order.OrderingPolicy;
        PrefUtils.setDefaultPreferenceValue(store, UI_PROXY_PORT, 1080);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String RESULT_SET_ORDERING_STRATEGY = "resultset.order.mode"; //$NON-NLS-1$

        }
         */

        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES, false);

    public final static String SQL_FORMAT_EXTERNAL_FILE = "sql.format.external.file";
    public static final String UI_PROXY_PASSWORD = "ui.proxy.password"; //$NON-NLS-1$
        /**
            return this.toString();
        PrefUtils.setDefaultPreferenceValue(store, SQL_ANONYMOUS_PARAMETERS_MARK, String.valueOf(SQLConstants.DEFAULT_PARAMETER_MARK));
    public static final String RESULT_SET_MAX_ROWS_USE_SQL = "resultset.maxrows.sql"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, CONTENT_CACHE_CLOB, true);
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST, true);
        IPV4("IPv4"),
        public final boolean useBlankLine;
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL, 30 * 60);
        PrefUtils.setDefaultPreferenceValue(store, RESULT_NATIVE_DATETIME_FORMAT, false);
    public final static String SQL_FORMAT_KEYWORD_CASE = "sql.format.keywordCase";
        PrefUtils.setDefaultPreferenceValue(store, EXECUTE_RECOVER_ENABLED, true);
        // Network expert settings
    public static final String DEFAULT_CONNECTION_NAME_PATTERN = "navigator.settings.default.connectionPattern";

        PrefUtils.setDefaultPreferenceValue(store, QUERY_ROLLBACK_ON_ERROR, false);
 *

    public static final String META_CLIENT_NAME_OVERRIDE = "database.meta.client.name.override"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, RESULT_TRANSFORM_COMPLEX_TYPES, true);
    public static final String RESULT_NATIVE_NUMERIC_FORMAT = "resultset.format.numeric.native"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.DICTIONARY_COLUMN_DIVIDER, " ");
    public static final String NOTIFICATIONS_SOUND_VOLUME = "notifications.soundVolume"; //$NON-NLS-1$
        }
    public static void setMainBundle(Bundle mainBundle) {
import org.jkiss.dbeaver.model.qm.QMConstants;
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED, true);
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_REREAD_ON_SCROLLING, true);
    public static final String UI_DRIVERS_VERSION_UPDATE = "ui.drivers.version.update"; //$NON-NLS-1$
    public static final String QUERY_REMOVE_TRAILING_DELIMITER = "script.sql.query.remove.trailing.delimiter"; //$NON-NLS-1$
        }
    public static final String SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES = "sql.format.insert.delimiters.in.empty_lines";
    public static final String SCRIPT_STATEMENT_DELIMITER = "script.sql.delimiter"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, CONNECTION_OPEN_TIMEOUT, 0);
import org.jkiss.dbeaver.model.virtual.DBVEntity;
    public static final String RESULT_NATIVE_DATETIME_FORMAT = "resultset.format.datetime.native"; //$NON-NLS-1$
            }
    private static DBPPreferenceStore preferences;
import java.util.Locale;

    public static final String SQL_FILTER_FORCE_SUBSELECT = "sql.query.filter.force.subselect"; //$NON-NLS-1$
        }
    public static final String SCRIPT_IGNORE_NATIVE_DELIMITER = "script.sql.ignoreNativeDelimiter"; //$NON-NLS-1$
    public static final String SCRIPT_STATEMENT_DELIMITER_BLANK = "script.sql.delimiter.blank"; //$NON-NLS-1$

        PrefUtils.setDefaultPreferenceValue(store, SCRIPT_STATEMENT_DELIMITER_BLANK, SQLScriptStatementDelimiterMode.BLANK_LINE_AND_SEPARATOR);
        PrefUtils.setDefaultPreferenceValue(store, PROP_PREFERRED_IP_ADDRESSES, IPType.AUTO.name());
            this.title = title;
        public String getTitle() {

        }
                    }
        NEVER("Never");
        

            this.useSmart = useSmart;
    public static final String CONNECT_USE_ENV_VARS = "database.connect.processEnvVars"; //$NON-NLS-1$

        PrefUtils.setDefaultPreferenceValue(store, CONTENT_HEX_ENCODING, GeneralUtils.getDefaultFileEncoding());
        }
    public static final String META_CASE_SENSITIVE = "database.meta.casesensitive"; //$NON-NLS-1$
                            return SQLScriptStatementDelimiterMode.valueOf(name);
 * You may obtain a copy of the License at
        public String getTitle() {
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NOTIFICATIONS_SOUND_ENABLED, true);
 * you may not use this file except in compliance with the License.
        return preferences;
                preferences.getString(PROP_PREFERRED_IP_ADDRESSES),
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_ORDERING_POLICY, OrderingPolicy.DEFAULT);
    public static final String TRANSACTIONS_SHOW_NOTIFICATIONS = "transaction.show.notifications"; //$NON-NLS-1$
        @NotNull
    public static final String SQL_ANONYMOUS_PARAMETERS_MARK = "sql.parameter.mark"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, CLIENT_BROWSER, "");
        PrefUtils.setDefaultPreferenceValue(store, CONNECTION_CLOSE_TIMEOUT, 5000);
            return title;
        PrefUtils.setDefaultPreferenceValue(store, META_USE_SERVER_SIDE_FILTERS, true);
        PrefUtils.setDefaultPreferenceValue(store, CONNECT_USE_ENV_VARS, true);
 *

    }


        PrefUtils.setDefaultPreferenceValue(store, META_CLIENT_NAME_DISABLE, false);
            this.useBlankLine = useBlankLine;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.registry.formatter.DataFormatterProfile;
    public static final String EXECUTE_RECOVER_RETRY_COUNT = "execute.recover.retryCount"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.TRANSACTIONS_SMART_COMMIT, false);
        PrefUtils.setDefaultPreferenceValue(store, META_SEPARATE_CONNECTION, SeparateConnectionBehavior.DEFAULT.name());

            return title;
    public static DBPPreferenceStore getPreferences() {
        public static IPType getPreferredStack() {
            } else {
        public static IPType getPreferredAddresses() {

        PrefUtils.setDefaultPreferenceValue(store, SQL_PARAMETERS_ENABLED, true);
import org.jkiss.dbeaver.model.data.order.OrderingStrategy;
        // SQL execution
    public static final String META_SEPARATE_CONNECTION = "database.meta.separate.connection"; //$NON-NLS-1$
    public static final String PROP_USE_WIN_TRUST_STORE_TYPE = "connections.useWinTrustStoreType"; //$NON-NLS-1$
        // QM


        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET, false);
        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_EXTERNAL_FILE, false);
    public static final String SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED = "sql.parameter.ddl.enabled"; //$NON-NLS-1$
    public static final String READ_EXPENSIVE_PROPERTIES = "database.props.expensive"; //$NON-NLS-1$
    }
        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_KEYWORD_CASE, "");
        // ResultSet

        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE, false);
    public static final String RESULT_SET_IGNORE_COLUMN_LABEL = "resultset.column.label.ignore"; //$NON-NLS-1$
    public static final String CONTENT_CACHE_MAX_SIZE = "content.cache.maxsize"; //$NON-NLS-1$
import org.jkiss.code.NotNull;

    //public final static String SQL_FORMAT_EXTERNAL_DIR = "sql.format.external.dir";
/**
    }

        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_BINARY_STRING_MAX_LEN, 32);
    public final static String SQL_FORMAT_EXTERNAL_TIMEOUT = "sql.format.external.timeout";
    public static final String RESULT_SET_ORDERING_POLICY = "resultset.order.policy"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, UI_DRIVERS_SOURCES, "https://dbeaver.io/files/jdbc/");
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        PrefUtils.setDefaultPreferenceValue(store, CONNECTION_CLOSE_ON_SLEEP, RuntimeUtils.isMacOS());
    public static final String TRANSACTIONS_SMART_COMMIT = "transaction.smart.commit"; //$NON-NLS-1$

    public static final String UI_PROXY_USER = "ui.proxy.user"; //$NON-NLS-1$
    public static final String TRANSACTIONS_AUTO_CLOSE_TTL = "transaction.auto.close.ttl"; //$NON-NLS-1$
    public static final String SQL_VARIABLES_ENABLED = "sql.variables.enabled"; //$NON-NLS-1$

    public static final String SQL_PARAMETERS_ENABLED = "sql.parameter.enabled"; //$NON-NLS-1$

        @Override
        BLANK_LINE_AND_SEPARATOR(true, false, "Always"),
        initializeDefaultPreferences(ModelPreferences.preferences);
    private static Bundle mainBundle;
    public static final String UI_DRIVERS_HOME = "ui.drivers.home"; //$NON-NLS-1$
    public static final String SQL_NAMED_PARAMETERS_PREFIX = "sql.parameter.prefix"; //$NON-NLS-1$
    public static final String RESULT_SCIENTIFIC_NUMERIC_FORMAT = "resultset.format.numeric.scientific"; //$NON-NLS-1$
    public static final String RESULT_TRANSFORM_COMPLEX_TYPES = "resultset.transform.complex.type"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY, false);
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_MAX_ROWS_USE_SQL, false);
    public static final String NET_TUNNEL_PORT_MIN = "net.tunnel.port.min"; //$NON-NLS-1$
    public static final String PLUGIN_ID = "org.jkiss.dbeaver.model";
    public final static String SQL_FORMAT_EXTERNAL_CMD = "sql.format.external.cmd";
                    }
    public static final String NOTIFICATIONS_ENABLED = "notifications.enabled"; //$NON-NLS-1$

        @NotNull
{
        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_EXTERNAL_TIMEOUT, 2000);
 */

                return DEFAULT;
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
public final class ModelPreferences
    public static final String UI_PROXY_HOST = "ui.proxy.host"; //$NON-NLS-1$
        DEFAULT("Default"),
    public static final String RESULT_SET_MAX_ROWS = "resultset.maxrows"; //$NON-NLS-1$
    public static final String DICTIONARY_MAX_ROWS = "dictionary.max.rows";
            if ("true".equalsIgnoreCase(value)) {

        PrefUtils.setDefaultPreferenceValue(store, SCRIPT_STATEMENT_DELIMITER, SQLConstants.DEFAULT_STATEMENT_DELIMITER);
            this.title = title;
            if (name == null) {
        }
        PrefUtils.setDefaultPreferenceValue(store, READ_EXPENSIVE_STATISTICS, false);

        // Notifications

        }
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_BINARY_PRESENTATION, DBConstants.BINARY_FORMATS[0].getId());
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public static final String DICTIONARY_COLUMN_DIVIDER = "resultset.dictionary.columnDivider"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, SQL_ANONYMOUS_PARAMETERS_ENABLED, false);
                }
        PrefUtils.setDefaultPreferenceValue(store, READ_EXPENSIVE_PROPERTIES, false);
        PrefUtils.setDefaultPreferenceValue(store, UI_PROXY_HOST, "");


    }
 * See the License for the specific language governing permissions and
        }
    public static final String EXECUTE_CANCEL_CHECK_TIMEOUT = "execute.cancel.checkTimeout"; //$NON-NLS-1$
        IPType(@NotNull String title) {
    public static final String META_USE_SERVER_SIDE_FILTERS = "database.meta.server.side.filters"; //$NON-NLS-1$

        PrefUtils.setDefaultPreferenceValue(store, UI_DRIVERS_VERSION_UPDATE, true);
        PrefUtils.setDefaultPreferenceValue(store, EXECUTE_CANCEL_CHECK_TIMEOUT, 0);

        }


        // Data formats
                IPType.class,
    public static final String CLIENT_BROWSER = "swt.client.browser";
    public static final String SQL_CONTROL_COMMAND_PREFIX = "sql.command.prefix"; //$NON-NLS-1$
    public static final String PROP_PREFERRED_IP_STACK = "connections.preferredIPType"; //$NON-NLS-1$
package org.jkiss.dbeaver;
                    case "true" -> {
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER, false);
            }
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_MAX_ROWS, 200);
        private final String title;
                        return SQLScriptStatementDelimiterMode.BLANK_LINE_AND_SEPARATOR;

        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_EXTERNAL_CMD, "");
        
    public static final String CONTENT_CACHE_BLOB = "content.cache.blob"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, QUERY_REMOVE_TRAILING_DELIMITER, true);
        PrefUtils.setDefaultPreferenceValue(store, META_CLIENT_NAME_OVERRIDE, false);
                    }
    // ResultSet
                    case "false" -> {
            }  else {
        PrefUtils.setDefaultPreferenceValue(store, CLIENT_TIMEZONE, DBConstants.DEFAULT_TIMEZONE);
 * DBeaver - Universal Database Manager


    public enum SeparateConnectionBehavior {
        PrefUtils.setDefaultPreferenceValue(store, SQL_FORMAT_LF_BEFORE_COMMA, false);
        ModelPreferences.mainBundle = mainBundle;
        public String getName() {
        SMART(true, true, "Smart");
    public static final String RESULT_SET_REREAD_ON_SCROLLING = "resultset.reread.on.scroll"; //$NON-NLS-1$


        return mainBundle;
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.DICTIONARY_MAX_ROWS, 200);
         * Convert value to SeparateConnectionBehavior option
            return valueByName(preferenceStore.getString(ModelPreferences.SCRIPT_STATEMENT_DELIMITER_BLANK));
    // Network
    }
        AUTO("Auto");
        ModelPreferences.preferences = new BundlePreferenceStore(mainBundle);
        PrefUtils.setDefaultPreferenceValue(store, CONNECTION_VALIDATION_TIMEOUT, 10000);
        PrefUtils.setDefaultPreferenceValue(store, META_CASE_SENSITIVE, false);
    }
    public static final String PROP_PREFERRED_IP_ADDRESSES = "connections.preferredIPAddresses"; //$NON-NLS-1$

                IPType.class,
    
    public static final String PLATFORM_LANGUAGE = "platform.language"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.DBConstants;
    public static final String NAVIGATOR_SORT_FOLDERS_FIRST = "navigator.sort.forlers.first"; //$NON-NLS-1$
        public String toString() {
        PrefUtils.setDefaultPreferenceValue(store, PROP_PREFERRED_IP_STACK, IPType.AUTO.name());
    public static final String RESULT_SET_USE_DATETIME_EDITOR = "resultset.datetime.editor";
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_ENTRIES_PER_PAGE, 200);
        ALWAYS("Always"),
 * Unless required by applicable law or agreed to in writing, software
        PrefUtils.setDefaultPreferenceValue(store, DEFAULT_CONNECTION_NAME_PATTERN, GeneralUtils.variablePattern(DBPConnectionConfiguration.VAR_HOST_OR_DATABASE));

    public enum IPType {
import org.jkiss.dbeaver.model.sql.SQLConstants;
    public static final String PROP_DEBUG_NETWORK_CONNECTIONS = "connections.debugNetworkConnections"; //$NON-NLS-1$
    public final static String SQL_FORMAT_LF_BEFORE_COMMA = "sql.format.lf.before.comma";
    // Driver and proxy settings. They have prefix UI_ by historical reasons.
        public static SeparateConnectionBehavior parse(String value) {
        public final String title;

import org.osgi.framework.Bundle;
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS, true);
    public static final String UI_DRIVERS_GLOBAL_LIBRARIES = "ui.drivers.global.libraries"; //$NON-NLS-1$
                        try {

                        }
        PrefUtils.setDefaultPreferenceValue(store, META_DISABLE_EXTRA_READ, false);
        SQLScriptStatementDelimiterMode(boolean useBlankLine, boolean useSmart, String title) {
    public static final String META_EXTRA_DDL_INFO = "database.meta.extra.ddl.info"; //$NON-NLS-1$
    public static final String META_CLIENT_NAME_VALUE = "database.meta.client.name.value"; //$NON-NLS-1$
        // Common
                    default -> {
    public static final String NOTIFICATIONS_SOUND_ENABLED = "notifications.soundEnabled"; //$NON-NLS-1$
 *
        PrefUtils.setDefaultPreferenceValue(store, NET_TUNNEL_PORT_MIN, 10000);
 * Copyright (C) 2010-2025 DBeaver Corp and others

        public static SQLScriptStatementDelimiterMode fromPreferences(@NotNull DBPPreferenceStore preferenceStore) {
    // This will ignore label in result set metadata and will use names always (some buggy drivers return description or other crap in labels - #1952)
        IPV6("IPv6"),
        PrefUtils.setDefaultPreferenceValue(store, SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED, false);


    public static final String NAVIGATOR_SORT_ALPHABETICALLY = "navigator.sort.case.insensitive"; //$NON-NLS-1$
                AUTO
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_QUERY_TYPES, DBCExecutionPurpose.USER + "," + DBCExecutionPurpose.USER_FILTERED + "," + DBCExecutionPurpose.USER_SCRIPT);
            );
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_STORE_LOG_FILE, false);
        PrefUtils.setDefaultPreferenceValue(store, UI_PROXY_PASSWORD, "");
}
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_OBJECT_TYPES,
    public static final String CONNECTION_OPEN_TIMEOUT = "connection.open.timeout"; //$NON-NLS-1$
            return CommonUtils.valueOf(
        // Network
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_ORDERING_STRATEGY, OrderingStrategy.SMART);
    public static final String RESULT_SET_BINARY_PRESENTATION = "resultset.binary.representation"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, SQL_CONTROL_COMMAND_PREFIX, String.valueOf(SQLConstants.DEFAULT_CONTROL_COMMAND_PREFIX));
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NOTIFICATIONS_CLOSE_DELAY_TIMEOUT, 3000L);
        }
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NOTIFICATIONS_ENABLED, true);
                return CommonUtils.valueOf(SeparateConnectionBehavior.class, value, DEFAULT);

import org.jkiss.dbeaver.utils.PrefUtils;

        ONLY_SEPARATOR(false, false, "Never"),
        PrefUtils.setDefaultPreferenceValue(store, UI_DRIVERS_HOME, "");
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS, true);
        PrefUtils.setDefaultPreferenceValue(store, SQL_FILTER_FORCE_SUBSELECT, false);
    public static final String META_DISABLE_EXTRA_READ = "database.meta.disableAdditionalRead"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, UI_PROXY_USER, "");

        PrefUtils.setDefaultPreferenceValue(store, CONTENT_CACHE_BLOB, false);
    public static final String CONTENT_HEX_ENCODING = "content.hex.encoding"; //$NON-NLS-1$
    public static final String CONNECTION_CLOSE_TIMEOUT = "connection.close.timeout"; //$NON-NLS-1$
                preferences.getString(PROP_PREFERRED_IP_STACK),
import org.jkiss.dbeaver.model.qm.QMObjectType;
        PrefUtils.setDefaultPreferenceValue(store, EXECUTE_RECOVER_RETRY_COUNT, 1);
        PrefUtils.setDefaultPreferenceValue(store, SQL_NAMED_PARAMETERS_PREFIX, String.valueOf(SQLConstants.DEFAULT_PARAMETER_PREFIX));
        PrefUtils.setDefaultPreferenceValue(store, META_CLIENT_NAME_VALUE, "");
                        return SQLScriptStatementDelimiterMode.ONLY_SEPARATOR;
    public static final String NAVIGATOR_SORT_IGNORE_CASE = "navigator.sort.case.insensitive.ignore.case"; //$NON-NLS-1$
                return SMART;
    public static final String NOTIFICATIONS_CLOSE_DELAY_TIMEOUT = "notifications.closeDelay"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, QMConstants.PROP_HISTORY_DAYS, 90);
                        } catch (IllegalArgumentException e) {
    public static final String UI_MAVEN_REPOSITORIES = "ui.maven.repositories"; //$NON-NLS-1$


 * Preferences constants
    public static final String QUERY_ROLLBACK_ON_ERROR = "query.rollback-on-error"; //$NON-NLS-1$
                            return SQLScriptStatementDelimiterMode.SMART;
            } else if ("false".equalsIgnoreCase(value)) {
                return NEVER;
    public static final String SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET = "sql.format.break.before.close.bracket";
    public static final String NET_TUNNEL_PORT_MAX = "net.tunnel.port.max"; //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Arrays;
        SeparateConnectionBehavior(String title) {
        public static SQLScriptStatementDelimiterMode valueByName(String name) {
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;

            this.title = title;

    public static final String RESULT_SET_BINARY_STRING_MAX_LEN = "resultset.binary.stringMaxLength"; //$NON-NLS-1$

        PrefUtils.setDefaultPreferenceValue(store, META_EXTRA_DDL_INFO, true);

 */


    public static final String EXECUTE_RECOVER_ENABLED = "execute.recover.enabled"; //$NON-NLS-1$
        @NotNull

        // SQL
    public static final String RESULT_SET_USE_FETCH_SIZE = "resultset.fetch.size"; //$NON-NLS-1$
        }
        DataFormatterProfile.initDefaultPreferences(store, Locale.getDefault());
    public static final String CONNECTION_CLOSE_ON_SLEEP = "connection.closeOnSleep"; //$NON-NLS-1$
    public enum SQLScriptStatementDelimiterMode {
/*
        PrefUtils.setDefaultPreferenceValue(store, NET_TUNNEL_PORT_MAX, 60000);
    public static final String RESULT_REFERENCE_DESCRIPTION_COLUMN_PATTERNS = "resultset.reference.value.description.column.patterns"; //$NON-NLS-1$
            return title;
    public static final String UI_PROXY_PORT = "ui.proxy.port"; //$NON-NLS-1$
            );
        
        private final String title;
        PrefUtils.setDefaultPreferenceValue(store, ModelPreferences.NOTIFICATIONS_SOUND_VOLUME, 100);
    public static final String SQL_ANONYMOUS_PARAMETERS_ENABLED = "sql.parameter.anonymous.enabled"; //$NON-NLS-1$
    public static final String UI_DRIVERS_SOURCES = "ui.drivers.sources"; //$NON-NLS-1$
    

        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_IGNORE_COLUMN_LABEL, false);
    public static final String TRANSACTIONS_AUTO_CLOSE_ENABLED = "transaction.auto.close.enabled"; //$NON-NLS-1$
            QMObjectType.toString(Arrays.asList(QMObjectType.txn, QMObjectType.query)));
        PrefUtils.setDefaultPreferenceValue(store, RESULT_SCIENTIFIC_NUMERIC_FORMAT, false);
    public static final String META_CLIENT_NAME_DISABLE = "database.meta.client.name.disable"; //$NON-NLS-1$

        PrefUtils.setDefaultPreferenceValue(store, RESULT_SET_USE_FETCH_SIZE, false);
                AUTO
    public static Bundle getMainBundle() {
    public static final String CONNECTION_VALIDATION_TIMEOUT = "connection.validation.timeout"; //$NON-NLS-1$

    private static void initializeDefaultPreferences(DBPPreferenceStore store) {
        
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
                switch (name) {

        PrefUtils.setDefaultPreferenceValue(store, PROP_USE_WIN_TRUST_STORE_TYPE, RuntimeUtils.isWindows());

        PrefUtils.setDefaultPreferenceValue(store, CONTENT_CACHE_MAX_SIZE, 1000000);
    public static final String MEMORY_CONTENT_MAX_SIZE = "content.memory.maxsize"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, RESULT_NATIVE_NUMERIC_FORMAT, false);
import org.jkiss.dbeaver.utils.GeneralUtils;
    public static final String TRANSACTIONS_SMART_COMMIT_RECOVER = "transaction.smart.commit.recover"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, MEMORY_CONTENT_MAX_SIZE, 10000);



            return CommonUtils.valueOf(
    public static final String CLIENT_TIMEZONE = "java.client.timezone";
        PrefUtils.setDefaultPreferenceValue(store, SQL_VARIABLES_ENABLED, true);
    public static final String READ_EXPENSIVE_STATISTICS = "database.stats.expensive"; //$NON-NLS-1$
    public static final String NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS = "navigator.show.folder.placeholders"; //$NON-NLS-1$
        PrefUtils.setDefaultPreferenceValue(store, RESULT_REFERENCE_DESCRIPTION_COLUMN_PATTERNS, String.join("|", DBVEntity.DEFAULT_DESCRIPTION_COLUMN_PATTERNS));
