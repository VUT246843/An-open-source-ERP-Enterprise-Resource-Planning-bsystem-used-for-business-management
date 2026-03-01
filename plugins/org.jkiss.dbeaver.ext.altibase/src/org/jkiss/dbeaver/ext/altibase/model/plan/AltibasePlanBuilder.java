                        + "|    |  TOTAL_COST  : 10934.272" + "\n"
        // Altibase plan string is a depth-first traversal
            if (nodeStr.length() > 0)
                node = createNode(dataSource, rootNodes, prevDepth, node, idIdx++, nodeStr);
                        + "||SELECTIVITY        : 1" + "\n"
                        + "  SCAN ( TABLE: CUSTOMERS, FULL SCAN, ACCESS: ??, COST: 116.76 )" + "\n"
package org.jkiss.dbeaver.ext.altibase.model.plan;
                parentNode = node;
        return newNode;
                        + "         AND" + "\n"
                        + " sMtrNode[1] : src[2, *0],dst[3, 1]" + "\n"
        }
                        + "||GRAPH_DISK_COST    : 0" + "\n"
 * Copyright (C) 2010-2024 DBeaver Corp and others
                nodeStr = new StringBuilder();
                        + " T50764.I2" + "\n"
     * Return plans tree structure based on the result from Altibase.
                        + "|  |GRAPH_ACCESS_COST  : 237.832431457" + "\n"
                        + "|  |GRAPH_TOTAL_COST   : 237.832431457" + "\n"
            parentNode = null;
                        + "       SCAN ( TABLE: ORDERS ORDERS_02, INDEX: SYS.ODR_IDX2, RANGE SCAN, ACCESS: ??, COST: 0.41 )" + "\n"
                        + "|    |  I2 : 100" + "\n"
    }
            rootNodes.add(newNode);
                        + "||-------------------------------------------------" + "\n"

                        + "  T50764.I2" + "\n"
     * Test code
        }
                        + "||[[ PROJECTION GRAPH ]]" + "\n"
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    private static AltibasePlanNode createNode(AltibaseDataSource dataSource, List<AltibasePlanNode> rootNodes, 
 * distributed under the License is distributed on an "AS IS" BASIS,


                        + "||INPUT_RECORD_COUNT : 1137.77777778" + "\n"
            } else if (node.getDepth() < depth) {
    }
 */
                        + "  T50764.I3" + "\n"
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(AltibasePlanBuilder.class);
                        + "       SCAN ( TABLE: ORDERS ORDERS_03, INDEX: ODR_IDX2, RANGE SCAN, ACCESS: ??, COST: 0.41 ) " + "\n"
 * Unless required by applicable law or agreed to in writing, software
                        + "|  |TOTAL_ALL_COST     : 11172.1044315" + "\n"
            } else {
                        + "||GRAPH_TOTAL_COST   : 38.5706666667" + "\n"
                nodeStr = null;
                        + " SORT ( ITEM_SIZE: 16, ITEM_COUNT: 16, ACCESS: 16, COST: 127.39 )" + "\n"
     */
                        + "T50764.I2" + "\n"
                        + "          CUSTOMERS.CNO = ORDERS_03.CNO" + "\n"
        } catch (Exception e) {
        AltibasePlanNode newNode = null;
                        + "-----------------------------------------------------------" + "\n"
                        + "|    |  I3 : 100" + "\n"
                        + "|    |== Index Information ==" + "\n"
        int depth;
                        + "        [ FILTER ]" + "\n"
                        + "|  |INPUT_RECORD_COUNT : 1137.77777778" + "\n"
                        + "        OR" + "\n"
import java.util.List;
                        + "      PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 0.67 )" + "\n"
        } else { 
/*
            }

            if (node.getDepth() == depth) {
                        + "|  |-------------------------------------------------" + "\n"
                        + "|    |[[ SELECTION GRAPH ]]" + "\n"

                        + "sTargetColumn[2] : [2, 2],sTargetColumn->arg[X, X]" + "\n"
                        + "||RECORD_SIZE        : 12" + "\n"
                        + " T50764.I3" + "\n"
                        + "|  |TOTAL_ACCESS_COST  : 11172.1044315" + "\n"
                        + "  [ SELF NODE INFO, SELF: 2 ]" + "\n"
                        + "sTargetColumn[0] : [2, 0],sTargetColumn->arg[X, X]" + "\n"



                        + "|    |INPUT_RECORD_COUNT : 10240" + "\n"
                        + "        OR" + "\n"
                        + "[ RESULT ]" + "\n"
            // No need line that starts with "* SIMPLE QUERY PLAN"
                        + "* SIMPLE QUERY PLAN";
                        + "|  |SELECTIVITY        : 1" + "\n"
                        + "|    |  ACCESS_COST : 10934.272" + "\n"
                        + "|    |-------------------------------------------------" + "\n"
            nodeStr.append(plan);
        int idIdx = 0;
        try {
                        + "sTargetColumn[1] : [2, 1],sTargetColumn->arg[X, X]" + "\n"
                        + "      PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 0.67 )" + "\n"
            } 
            if (plan.trim().startsWith("* SIMPLE")) {
            
            if (plan.startsWith("|")) {
                        + "        [ FILTER ]" + "\n"
                        + "      PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 0.67 )" + "\n"
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
            }
import org.jkiss.dbeaver.Log;
                "||----------------------------------------------------------" + "\n"
 *
            }
                        + "|  |-------------------------------------------------" + "\n"
        AltibasePlanNode node = null;
                        + "          CUSTOMERS.CNO = ORDERS_02.CNO" + "\n"
                        + " [ RESULT ]" + "\n"
 *
                        + "||----------------------------------------------------------" + "\n"
        String [] plans = planStr.split("\\n");
        node = createNode(dataSource, rootNodes, prevDepth, node, idIdx++, nodeStr);
                        + "sTargetColumn[2] : [2, 2],sTargetColumn->arg[X, X]" + "\n"

                        + "|  |RECORD_SIZE        : 12" + "\n"
            }

                        + "PROJECT ( COLUMN_COUNT: 3, TUPLE_SIZE: 12, COST: 127.83 )" + "\n"
                        + "  T50764.I1" + "\n"
        int lineIdx = 0;
                        + "|    |RECORD_SIZE        : 12" + "\n"
        // root node
                break;
                nodeStr.append("\n");

    /**
                continue;
        String plan = null;
    public static void main(String[] args) {
                // prevNode is parent
public class AltibasePlanBuilder {
                        + "         AND" + "\n"
                        + " #T50764.I1" + "\n"
                        + "-----------------------------------------------------------" + "\n"
                parentNode = (AltibasePlanNode) node.getParent();
            if (plan == null || plan.matches(pattern4TrcLogSkipLine)) {


    public static List<AltibasePlanNode> build(AltibaseDataSource dataSource, String planStr) throws IllegalStateException {
 * See the License for the specific language governing permissions and
                        + "||GRAPH_ACCESS_COST  : 38.5706666667" + "\n"
    /**
                        + "         AND" + "\n"
            // reset depth between trclog and plan
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        + "        OR" + "\n"

            if (prevDepth != depth) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        for (lineIdx = 0; lineIdx < plans.length; lineIdx++) {

            }
                        + "sTargetColumn[0] : [2, 0],sTargetColumn->arg[X, X]" + "\n"
        StringBuilder nodeStr = null;
                        + "|    |GRAPH_DISK_COST    : 0" + "\n"
                        + "|  |GRAPH_DISK_COST    : 0" + "\n"
                        + "|    |OUTPUT_RECORD_COUNT: 1137.77777778" + "\n"
                        + "        ORDERS_02.QTY >= 10000" + "\n"
                        + "sTargetColumn[1] : [2, 1],sTargetColumn->arg[X, X]" + "\n"
    }
                continue;
        AltibasePlanNode parentNode = null;
                        + "|  |== Cost Information ==" + "\n"
}            depth = plan.indexOf(plan.trim());
                        + "||-------------------------------------------------" + "\n"
            // Remove "|" in trcLog
            throw new IllegalStateException("Plan parsing error [depth: " + depth + "]: " + nodeStr );
                        + "|  |TOTAL_DISK_COST    : 0" + "\n"
                        + "|    |== Access Method Information ==" + "\n"
            for(AltibasePlanNode node:AltibasePlanBuilder.build(null, plan)) {
        return rootNodes;
                        + " [ myNode NODE INFO, SELF: 3, REF1: 2, REF2: -1 ]" + "\n"
            if (plan.trim().length() < 1) {
                        + "|    |  DISK_COST   : 0" + "\n"
                        + "||TOTAL_ACCESS_COST  : 11210.6750981" + "\n"
                        + "||TOTAL_ALL_COST     : 11210.6750981" + "\n"
        String plan =
            prevDepth = depth;
                        + "|    |TOTAL_DISK_COST    : 0" + "\n"
                        + "|    |  I1 : 100" + "\n"
                        + "     BAG-UNION" + "\n"

            if (nodeStr == null)
                        + "|    |-------------------------------------------------" + "\n"
                plan = plan.substring(1);
                        + "-----------------------------------------------------------" + "\n"
        List<AltibasePlanNode> rootNodes = new ArrayList<>();

        int prevDepth = 0;
                        + "|    |FULL SCAN" + "\n"
                        + "|    |TABLE NAME         : T50764" + "\n"
            // Count leading space to determine tree depth
                        + "  SCAN ( TABLE: SYS.T50764, FULL SCAN, ACCESS: 16, COST: 124.68 )" + "\n"
import java.util.ArrayList;
        }
                log.debug(node.toString4Debug());
                        + "[ TARGET INFO ]" + "\n"

 * You may obtain a copy of the License at
     */

            }
                        + "        [ VARIABLE KEY ]" + "\n"
                        + "|  |[[ SORTING GRAPH ]]"
                        + " sMtrNode[0] : src[2, ROWPTR],dst[3, 0]" + "\n"
                        + "|    |SELECTIVITY        : 0.111111111111" + "\n"
            // sibling
                plan = plan.substring(1);
                depth = 0;
        }
        if (depth == 0) {
                        + "        [ FILTER ]" + "\n"
                        + "                   " + "\n"
        } else if (depth > 0 && node != null) {


                        + "       SCAN ( TABLE: ORDERS ORDERS_01, INDEX: SYS.ODR_IDX2, RANGE SCAN, ACCESS: ??, COST: 0.41 )" + "\n"
                        + "|    |GRAPH_TOTAL_COST   : 10934.272" + "\n"
                        + "                   " + "\n"

            log.warn(e.getMessage());
 * limitations under the License.
            // New node required
    private static final String pattern4TrcLogSkipLine = "[\\s*|\\s*|]*-{3,}+";
                        + "|    |== Table Information ==" + "\n"
                        + "[ TARGET INFO ]" + "\n"
            if (!AltibaseConstants.DEBUG) {
            if (plan.startsWith("|")) {
                        + "|    |TOTAL_ACCESS_COST  : 10934.272" + "\n"
                        + "||TOTAL_DISK_COST    : 0" + "\n"
 * you may not use this file except in compliance with the License.
                        + "|  |OUTPUT_RECORD_COUNT: 1137.77777778" + "\n"
                        + "PROJECT ( COLUMN_COUNT: 2, TUPLE_SIZE: 34, COST: 151146.46 )" + "\n"
                        + "-----------------------------------------------------------" + "\n"

                        + "        [ VARIABLE KEY ]" + "\n"
                        + "|    |GRAPH_ACCESS_COST  : 10934.272" + "\n"
                        + "   PROJECT ( COLUMN_COUNT: 6, TUPLE_SIZE: 48, COST: 2.81 )" + "\n"
                return;
                        + "|    |== Cost Information ==" + "\n"
            // Skip lines
            plan = plan.trim();
                        + "  VIEW ( ORDERS_T, ACCESS: ??, COST: 14.49 )" + "\n"
                parentNode = node.getParentNodeAtDepth(depth);
            plan = plans[lineIdx];
                        + "T50764.I3" + "\n"
            int depth, AltibasePlanNode node, int idIdx, StringBuilder nodeStr) {
                        + "||OUTPUT_RECORD_COUNT: 1137.77777778" + "\n"
 *
                        + "        [ VARIABLE KEY ]" + "\n"
                        + " JOIN ( METHOD: NL, COST: 148444.31 )" + "\n"
            }

            // Remove "|" in trcLog
                        + "        ORDERS_03.QTY >= 10000" + "\n"
                        + "  [ RESULT ]" + "\n"
 * Licensed under the Apache License, Version 2.0 (the "License");
        // last one

                        + "          CUSTOMERS.CNO = ORDERS_01.CNO" + "\n"
                        + "T50764.I1" + "\n"
                        + "||== Cost Information ==" + "\n"


                // prevNode.getDepth() > depth
                        + "|    |TOTAL_ALL_COST     : 10934.272" + "\n"
            }
        newNode = new AltibasePlanNode(dataSource, idIdx, depth, nodeStr.toString(), parentNode);
            // not root-node
                        + "        ORDERS_01.QTY >= 10000" + "\n"
                        + "    VIEW ( ACCESS: ??, COST: 2.02 )" + "\n"
                depth = depth / 2; // two spaces for a depth in case of trclog
        if (depth == 0) {
