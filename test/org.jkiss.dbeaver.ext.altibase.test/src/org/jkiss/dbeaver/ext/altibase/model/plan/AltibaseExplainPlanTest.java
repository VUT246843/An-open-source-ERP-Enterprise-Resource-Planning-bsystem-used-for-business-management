
                        + "* SIMPLE QUERY PLAN";
                        + " #T50764.I1" + "\n"
                        + " JOIN ( METHOD: NL, COST: 148444.31 )" + "\n"
            fail(e.getMessage());
 * You may obtain a copy of the License at
                        + "        ORDERS_03.QTY >= 10000" + "\n"
                        + "|    |GRAPH_DISK_COST    : 0" + "\n"
                        + "   PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 2.81 )" + "\n"
                        + "|    |  ACCESS_COST : 10934.272" + "\n"
                        + "|    |TOTAL_ALL_COST     : 10934.272" + "\n"
                        + "sTargetColumn[0] : [2, 0],sTargetColumn->arg[X, X]" + "\n"
        try {
                        + "       SCAN ( TABLE: ORDERS ORDERS_03, INDEX: ODR_IDX2, RANGE SCAN, ACCESS: ??, COST: 0.41 ) " + "\n"
import org.jkiss.junit.DBeaverUnitTest;

                        + "|  |INPUT_RECORD_COUNT : 1137.77777778" + "\n"
import org.junit.Test;
                        + "|    |SELECTIVITY        : 0.111111111111" + "\n"
                        + "|    |OUTPUT_RECORD_COUNT: 1137.77777778" + "\n"
            List<AltibasePlanNode> planNodeList = AltibasePlanBuilder.build(null, plan);
                        + "  VIEW ( ORDERS_T, ACCESS: ??, COST: 14.49 )" + "\n"
                        + "|  |SELECTIVITY        : 1" + "\n"
        
                        + "|    |== Cost Information ==" + "\n"
                        + "|  |-------------------------------------------------" + "\n"
 *     http://www.apache.org/licenses/LICENSE-2.0
                        + "        OR" + "\n"
                        + "     BAG-UNION" + "\n"
                        + "-----------------------------------------------------------" + "\n"
 *
                        + "          CUSTOMERS.CNO = ORDERS_01.CNO" + "\n"
                        + "|  |OUTPUT_RECORD_COUNT: 1137.77777778" + "\n"
                        + "|    |GRAPH_ACCESS_COST  : 10934.272" + "\n"
                        + "|    |  I3 : 100" + "\n"
                        + "PROJECT ( COLUMN_COUNT: 3, TUPLE_SIZE: 12, COST: 127.83 )" + "\n"
                        + "T50764.I1" + "\n"
                        + "          CUSTOMERS.CNO = ORDERS_02.CNO" + "\n"
                        + "        OR" + "\n"
                        + "sTargetColumn[1] : [2, 1],sTargetColumn->arg[X, X]" + "\n"
        }
                        + "||----------------------------------------------------------" + "\n"
                        + "sTargetColumn[2] : [2, 2],sTargetColumn->arg[X, X]" + "\n"
 * See the License for the specific language governing permissions and
                        + "|    |  TOTAL_COST  : 10934.272" + "\n"
                "||----------------------------------------------------------" + "\n"
                        + "[ TARGET INFO ]" + "\n"
            assertTrue(planNodeList.size() > 0);
                        + "        OR" + "\n"
/*
import java.util.List;
                        + "  [ SELF NODE INFO, SELF: 2 ]" + "\n"
import static org.junit.Assert.fail;

                        + "       SCAN ( TABLE: ORDERS ORDERS_01, INDEX: SYS.ODR_IDX2, RANGE SCAN, ACCESS: ??, COST: 0.41 )" + "\n"
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        + "        ORDERS_01.QTY >= 10000" + "\n"
        } catch (Exception e) {
import static org.junit.Assert.assertTrue;
                        + "        ORDERS_02.QTY >= 10000" + "\n"
                        + "||RECORD_SIZE        : 12" + "\n"
                        + "||TOTAL_DISK_COST    : 0" + "\n"
                        + "T50764.I2" + "\n"
                        + "sTargetColumn[2] : [2, 2],sTargetColumn->arg[X, X]" + "\n"
                        + "|  |GRAPH_TOTAL_COST   : 237.832431457" + "\n"
                        + " [ myNode NODE INFO, SELF: 3, REF1: 2, REF2: -1 ]" + "\n"
                        + "        [ FILTER ]" + "\n"
                        + "         AND" + "\n"
 * you may not use this file except in compliance with the License.
                        + "-----------------------------------------------------------" + "\n"
}                        + "|    |-------------------------------------------------" + "\n"
 */
                        + "|  |[[ SORTING GRAPH ]]"
                        + "        [ FILTER ]" + "\n"
                        + "|    |== Index Information ==" + "\n"
                        + "  T50764.I2" + "\n"
                        + "||GRAPH_ACCESS_COST  : 38.5706666667" + "\n"
                        + "-----------------------------------------------------------" + "\n"
                        + "|    |FULL SCAN" + "\n"
                        + "        [ VARIABLE KEY ]" + "\n"
                        + "|  |TOTAL_DISK_COST    : 0" + "\n"
                        + "|  |== Cost Information ==" + "\n"
                        + "-----------------------------------------------------------" + "\n"
                        + "||TOTAL_ACCESS_COST  : 11210.6750981" + "\n"
 * limitations under the License.
                        + "[ RESULT ]" + "\n"
 * distributed under the License is distributed on an "AS IS" BASIS,
                        + "  T50764.I3" + "\n"
                        + "    VIEW ( ACCESS: ??, COST: 2.02 )" + "\n"
                        + "  [ RESULT ]" + "\n"
                        + "|  |GRAPH_DISK_COST    : 0" + "\n"
                        + "|    |INPUT_RECORD_COUNT : 10240" + "\n"
                        + "|    |TABLE NAME         : T50764" + "\n"
                        + "          CUSTOMERS.CNO = ORDERS_03.CNO" + "\n"
                        + "|  |TOTAL_ALL_COST     : 11172.1044315" + "\n"
                        + "|    |TOTAL_DISK_COST    : 0" + "\n"
                        + "      PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 0.67 )" + "\n"
                        + "||-------------------------------------------------" + "\n"
                        + "|  |TOTAL_ACCESS_COST  : 11172.1044315" + "\n"
                        + " sMtrNode[0] : src[2, ROWPTR],dst[3, 0]" + "\n"
                        + "|    |[[ SELECTION GRAPH ]]" + "\n"
                        + "||INPUT_RECORD_COUNT : 1137.77777778" + "\n"
 * Licensed under the Apache License, Version 2.0 (the "License");
                        + "sTargetColumn[1] : [2, 1],sTargetColumn->arg[X, X]" + "\n"
                        + "|    |== Table Information ==" + "\n"
                        + "||GRAPH_DISK_COST    : 0" + "\n"
                        + "||[[ PROJECTION GRAPH ]]" + "\n"
                        + "         AND" + "\n"
    }
                        + "[ TARGET INFO ]" + "\n"
                        + "||SELECTIVITY        : 1" + "\n"
        String plan =
                        + "||GRAPH_TOTAL_COST   : 38.5706666667" + "\n"
                        + "||TOTAL_ALL_COST     : 11210.6750981" + "\n"
                        + "|  |-------------------------------------------------" + "\n"
                        + "  SCAN ( TABLE: CUSTOMERS, FULL SCAN, ACCESS: ??, COST: 116.76 )" + "\n"
                        + " T50764.I2" + "\n"
                        + "       SCAN ( TABLE: ORDERS ORDERS_02, INDEX: SYS.ODR_IDX2, RANGE SCAN, ACCESS: ??, COST: 0.41 )" + "\n"
                        + "                   " + "\n"
public class AltibaseExplainPlanTest extends DBeaverUnitTest {
                        + " SORT ( ITEM_SIZE: 16, ITEM_COUNT: 16, ACCESS: 16, COST: 127.39 )" + "\n"
                        + "T50764.I3" + "\n"
                        + "         AND" + "\n"
                        + "sTargetColumn[0] : [2, 0],sTargetColumn->arg[X, X]" + "\n"
                        + "PROJECT ( COLUMN_COUNT: 2, TUPLE_SIZE: 34, COST: 151146.46 )" + "\n"
                        + "        [ FILTER ]" + "\n"
    @Test
                        + "|  |RECORD_SIZE        : 12" + "\n"
                        + "|    |  I2 : 100" + "\n"
                        + "||-------------------------------------------------" + "\n"
package org.jkiss.dbeaver.ext.altibase.model.plan;
                        + "||== Cost Information ==" + "\n"
                        + "|    |  I1 : 100" + "\n"
                        + "|    |== Access Method Information ==" + "\n"
                        + " T50764.I3" + "\n"
    public void trcLogDetailMtrNode_1_Test() {
 *
 * DBeaver - Universal Database Manager
                        + "  T50764.I1" + "\n"
                        + "||OUTPUT_RECORD_COUNT: 1137.77777778" + "\n"
                        + "|    |  DISK_COST   : 0" + "\n"
                        + "      PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 0.67 )" + "\n"
                        + "|    |-------------------------------------------------" + "\n"
                        + "|    |RECORD_SIZE        : 12" + "\n"
                        + "|    |GRAPH_TOTAL_COST   : 10934.272" + "\n"
                        + "                   " + "\n"
                        + "        [ VARIABLE KEY ]" + "\n"
                        + " sMtrNode[1] : src[2, *0],dst[3, 1]" + "\n"
 *
                        + " [ RESULT ]" + "\n"
                        + "      PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 0.67 )" + "\n"
                        + "|  |GRAPH_ACCESS_COST  : 237.832431457" + "\n"
                        + "|    |TOTAL_ACCESS_COST  : 10934.272" + "\n"
                        + "        [ VARIABLE KEY ]" + "\n"
                        + "  SCAN ( TABLE: SYS.T50764, FULL SCAN, ACCESS: 16, COST: 124.68 )" + "\n"
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others

