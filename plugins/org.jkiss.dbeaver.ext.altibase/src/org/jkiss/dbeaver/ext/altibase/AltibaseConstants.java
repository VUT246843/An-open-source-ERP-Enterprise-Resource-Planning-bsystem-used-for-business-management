    public static final String TYPE_NAME_GEOMETRY = "GEOMETRY";
    public static final String NEW_LINE = System.getProperty(StandardConstants.ENV_LINE_SEPARATOR);
    public static final String PREF_DBMS_OUTPUT = "altibase.dbms.output";
        
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        /**
    public static final int TYPE_BYTE = 20001;
    }
import org.jkiss.code.NotNull;
    
     * Preference page
    public static final boolean DEBUG = false;
    public static final String OBJ_TYPE_TYPESET = "TYPESET";
    
}    public static final String PREF_PLAN_PREFIX = "altibase.plan.prefix";
 */
    public static final int PACKAGE_TYPE_SPEC = 6;
    
    public static final String ALTER_REPL_PREFIX = "ALTER REPLICATION";
    public static final String OPERATION_MODIFY = "MODIFY";
 * distributed under the License is distributed on an "AS IS" BASIS,
    
        }
            "-- [WARNING] DBMS_METADATA package is required to have DDL for %s." + NEW_LINE;
    public static final String METHOD_NAME_4_REGISTER_MESSAGE_CALLBACK = "registerMessageCallback";
    public static final String SYSTEM_GENERATED_PREFIX = "__SYS_";
    public static final int PACKAGE_TYPE_BODY = 7;
        }
    public static final int PSM_TYPE_PROCEDURE  = 0;
public class AltibaseConstants {
    

    
        }
    public static final int TYPE_NIBBLE = 20002;
         * Get EXPLAIN_PLAN enum object by index
    
 *
    public static final String RESULT_YES_VALUE = "YES";
            return this.value;
     */
                    return expPlan;

    public static final String USER_SYS = "SYS";
            }
 * DBeaver - Universal Database Manager
         */
    public static final String RESULT_1_VALUE = "1";
        public static ExplainPlan getByIndex(int idx) throws ArrayIndexOutOfBoundsException {
    public enum ExplainPlan {
    
    public static final String OBJ_TYPE_MATERIALIZED_VIEW = "MATERIALIZED VIEW";
 *
    public static final int EC_PASSWORD_WILL_EXPIRE = 0x51A79;
    
     * DBMS output
    
     * PSM Type: SYS_PROCEDURES_ (OBJECT_TYPE)
    

            throw new ArrayIndexOutOfBoundsException("No such index value in EXPLAIN_PLAN: " + idx);
    public static final int PSM_TYPE_TYPESET    = 3;
                }

    public static final String NO_DBMS_METADATA = "-- [WARNING] Without DBMS_METADATA package, " 
/*
    public static final long IDP_ATTR_RD_READONLY = 0x00000002;
    
 *
        return (USER_SYS.equals(userName) || USER_SYSTEM_.equals(userName));
 * Copyright (C) 2010-2024 DBeaver Corp and others
    /*
        }
    public static final String TYPE_NAME_TIMESTAMP = "TIMESTAMP";
    public static final String USER_SYSTEM_ = "SYSTEM_";
            for (ExplainPlan expPlan : ExplainPlan.values()) {

    public static final String RESULT_T_VALUE = "T";
    /*
                if (expPlan.ordinal() == idx) {
     * V$PROPERTY attributes
            
     */
    public static final String CLASS_NAME_4_CONNECTION_POSTFIX = ".jdbc.driver.AltibaseConnection";
import org.jkiss.utils.StandardConstants;
        public String getTitle() {
 * See the License for the specific language governing permissions and
    public static final String PASSWORD_WILL_EXPIRE_WARN_DESCRIPTION = "Change the password or contact the DBA.";
package org.jkiss.dbeaver.ext.altibase;
    
    public static final int TYPE_GEOMETRY = 10003;
        public byte getArgValue() {
        private String title;
    public static final int EC_DBMS_METADATA_NOT_FOUND = 0xF1B3D;
    public static final String DBOBJ_INDEX = "INDEX";
     */
 * You may obtain a copy of the License at
        
        private byte value;
            return this.title;
    public static final String SQL_STATE_TOO_LONG = "22026";
 *     http://www.apache.org/licenses/LICENSE-2.0
    /*
     */
            this.value = value;
    public static final String USER_PUBLIC = "PUBLIC";
    public static final String TYPE_NAME_DATE = "DATE";
 * Unless required by applicable law or agreed to in writing, software
            + "the generated DDL may not be correct." + NEW_LINE;
    public static final String SQL_WARNING_TITILE = "SQL Warning";
    public static final long IDP_ATTR_RD_WRITABLE = 0x00000000;
        ExplainPlan(String title, byte value) {


        
    
            this.title = title;
    
    public static boolean isSysUser(@NotNull String userName) {
    public static final String SRID_EQ = "SRID=";
    public static final String RESULT_Y_VALUE = "Y";
    
    
    }
 * you may not use this file except in compliance with the License.
        ONLY("EXPLAIN PLAN = ONLY", (byte) 2),
    // e.g. Altibase.jdbc.driver.AltibaseMessageCallback, Altibase7_1.jdbc.driver.AltibaseMessageCallback
    public static final String NO_DDL_WITHOUT_DBMS_METADATA = 
     */
        ON("EXPLAIN PLAN = ON", (byte) 1);
        
    public static final int PSM_TYPE_FUNCTION   = 1;
    /*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String PREF_EXPLAIN_PLAN_TYPE = "altibase.explain.plan.type";
    /*
    public static final String CLASS_NAME_4_MESSAGE_CALLBACK_POSTFIX = ".jdbc.driver.AltibaseMessageCallback";
    public static final int TYPE_VARBYTE = 20003;
    
        
     * Password grace time
