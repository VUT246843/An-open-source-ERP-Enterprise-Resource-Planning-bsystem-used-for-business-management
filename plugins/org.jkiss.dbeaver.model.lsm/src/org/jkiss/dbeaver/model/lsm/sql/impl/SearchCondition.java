
        public Expression.RowValue left;
        public List<BooleanExpression> children;
        public Expression.RowValue right;

    }
 * distributed under the License is distributed on an "AS IS" BASIS,

    public static final class ExistsPredicate extends PredicateExpression {

 * Copyright (C) 2010-2024 DBeaver Corp and others



    }
    }
    public abstract static class PredicateExpression extends BooleanExpression {
    public enum PredicateClarificationKind {


        public PredicateClarificationKind clarification;
    }
    public abstract static class BooleanExpression {

    }



    public static class AndExpression extends BooleanExpression {
public abstract class SearchCondition {
 *     http://www.apache.org/licenses/LICENSE-2.0

 */

 * See the License for the specific language governing permissions and
    public static final class ComparisonPredicate extends PredicateExpression {
 * You may obtain a copy of the License at
 *
        IS_TRUE,
    }
    public static final class NullPredicate extends PredicateExpression {
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final class LikePredicate extends PredicateExpression {
    }

    public static final class BetweenPredicate extends PredicateExpression {

        public BooleanExpression child;
 * DBeaver - Universal Database Manager
    public static final class InPredicate extends PredicateExpression {
        public boolean isInverted;
    }
        IS_FALSE,
package org.jkiss.dbeaver.model.lsm.sql.impl;
        public List<BooleanExpression> children;
    public static final class QuantifiedComparisonPredicate extends PredicateExpression {

    }
 * you may not use this file except in compliance with the License.
}
    }

        IS_NOT_TRUE,
 *

import java.util.List;
    // public abstract BooleanExpression member();




    }
 *
 * limitations under the License.
    }
        IS_NOT_FALSE,
    public static final class OverlapsPredicate extends PredicateExpression {
        IS_NOT_UNKNOWN,
    public static final class MatchPredicate extends PredicateExpression {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");


/*
 * Unless required by applicable law or agreed to in writing, software
        IS_UNKNOWN,

    public static class OrExpression extends BooleanExpression {
    }
    public static final class SubconditionExpression extends PredicateExpression {
