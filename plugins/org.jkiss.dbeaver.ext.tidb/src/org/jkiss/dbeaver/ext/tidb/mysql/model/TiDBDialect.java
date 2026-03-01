        "TIDB_VERSION",
package org.jkiss.dbeaver.ext.tidb.mysql.model;
}

        "CLUSTERED"
        "TIDB_DECODE_SQL_DIGESTS",

    
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        "AUTO_RANDOM",
    public TiDBDialect() {
            TIDB_NON_TRANSACTIONAL_KEYWORDS
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
        "CACHE",
        }
    public String[] getNonTransactionKeywords() {

        }
    }
        addFunctions(Arrays.asList(TIDB_EXTRA_FUNCTIONS));
        super("TiDB", "tidb");
        "REORGANIZE",
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private static final String[] TIDB_EXTRA_FUNCTIONS = {
        "TIDB_DECODE_PLAN",
        "TIDB_IS_DDL_OWNER",
        );
    @NotNull
import org.jkiss.utils.ArrayUtils;
    @NotNull
        // TiDB do not support the stored procedures
        "TIDB_PARSE_TSO",
        return ArrayUtils.concatArrays(
            MySQLDialect.MYSQL_NON_TRANSACTIONAL_KEYWORDS,
        return new String[]{};
    }
        
        "PLACEMENT",
            addSQLKeyword(kw);
    };
        "NONCLUSTERED",
        "TIDB_DECODE_KEY",
        "TIDB_BOUNDED_STALENESS",
        for (String kw : TIDB_ADVANCED_KEYWORDS) {
    @Override
        super.initBaseDriverSettings(session, dataSource, metaData);
    
import org.jkiss.dbeaver.ext.mysql.model.MySQLDialect;
        for (String kw : TIDB_NON_TRANSACTIONAL_KEYWORDS) {
        "TIDB_SHARD"
public class TiDBDialect extends MySQLDialect {
    
    
    }
    
    public static final String[] TIDB_NON_TRANSACTIONAL_KEYWORDS = new String[]{ "OPTIMISTIC", "PESSIMISTIC" };
    };
import org.jkiss.code.NotNull;
    private static final String[] TIDB_ADVANCED_KEYWORDS = {
            addSQLKeyword(kw);
        "POLICY",
        "EXCHANGE",
    
    public String[] getExecuteKeywords() {
import java.util.Arrays;
