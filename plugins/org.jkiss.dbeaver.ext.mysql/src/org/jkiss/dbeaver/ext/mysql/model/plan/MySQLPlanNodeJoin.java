 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 *

        super(parent, source);
    @Override
public class MySQLPlanNodeJoin extends MySQLPlanNodePlain {
 * You may obtain a copy of the License at
        this.nested.add(right);
 */
        right.parent = this;
        this.nested.add(left);
        return new MySQLPlanNodeJoin(parent, this);
    MySQLPlanNodePlain copyNode(MySQLPlanNodePlain parent) {

 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import java.util.ArrayList;

    }
    public MySQLPlanNodeJoin(MySQLPlanNodePlain parent, MySQLPlanNodeJoin source) {
        this.id = left.id;
package org.jkiss.dbeaver.ext.mysql.model.plan;
}
 * MySQL execution plan node
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public MySQLPlanNodeJoin(MySQLPlanNodePlain parent, MySQLPlanNodePlain left, MySQLPlanNodePlain right) {
        left.parent = this;
    }

 */
        super(parent, "JOIN");
 * you may not use this file except in compliance with the License.
    }

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
 *
/**
        this.nested = new ArrayList<>(2);
