        return upperBoundInclusive == restriction.upperBoundInclusive;
        return lowerBoundInclusive;
    private final boolean lowerBoundInclusive;

    }

        buf.append(isUpperBoundInclusive() ? "]" : ")");
            }
public class Restriction {

        return result;

                return false;
 *

}
            if (comparison > 0) {
            result += lowerBound.hashCode();
        if (getUpperBound() != null) {
            return false;

        } else if (restriction.lowerBound != null) {
        StringBuilder buf = new StringBuilder();
        }

        if (lowerBoundInclusive != restriction.lowerBoundInclusive) {
        }
        }
            }
    }
        this.upperBound = upperBound;


                       boolean upperBoundInclusive) {
    }
    }
    private final ArtifactVersion lowerBound;



        buf.append(",");
        }
        buf.append(isLowerBoundInclusive() ? "[" : "(");
    public ArtifactVersion getUpperBound() {
        } else {
        }
    public Restriction(ArtifactVersion lowerBound, boolean lowerBoundInclusive, ArtifactVersion upperBound,
        return upperBoundInclusive;
        }
            if ((comparison == 0) && !upperBoundInclusive) {
/**
        if (lowerBound != null) {
    private final ArtifactVersion upperBound;
            buf.append(getLowerBound().toString());

                return false;
        if (upperBound != null) {
        }
                return false;


 * software distributed under the License is distributed on an
            }
 * specific language governing permissions and limitations
            result += 1;
        if (upperBound != null) {


    public String toString() {
        if (lowerBound != null) {
            int comparison = upperBound.compareTo(version);
        int result = 13;

            result -= upperBound.hashCode();
    }
        }

        this.upperBoundInclusive = upperBoundInclusive;

 * regarding copyright ownership.  The ASF licenses this file
            int comparison = lowerBound.compareTo(version);
        } else if (restriction.upperBound != null) {
            if (!upperBound.equals(restriction.upperBound)) {
    }
 * under the License.
 * "License"); you may not use this file except in compliance
 *  http://www.apache.org/licenses/LICENSE-2.0
        result *= lowerBoundInclusive ? 1 : 2;
            return false;
        this.lowerBound = lowerBound;
 *
        }
    public ArtifactVersion getLowerBound() {

    public int hashCode() {
 * Licensed to the Apache Software Foundation (ASF) under one
    @Override
                return false;
 * with the License.  You may obtain a copy of the License at
    public static final Restriction EVERYTHING = new Restriction(null, false, null, false);

            return false;

    }
        Restriction restriction = (Restriction) other;
        return upperBound;
    public boolean containsVersion(ArtifactVersion version) {
    }
        }
 */
            result -= 3;
    private final boolean upperBoundInclusive;
            if (comparison < 0) {
            buf.append(getUpperBound().toString());
    }
 * KIND, either express or implied.  See the License for the

/*
        if (lowerBound == null) {
package org.jkiss.dbeaver.registry.maven.versioning;

 * distributed with this work for additional information
        if (!(other instanceof Restriction)) {
 * or more contributor license agreements.  See the NOTICE file
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    public boolean isLowerBoundInclusive() {
        return true;
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
            if ((comparison == 0) && !lowerBoundInclusive) {
    public boolean isUpperBoundInclusive() {

 * Unless required by applicable law or agreed to in writing,
    @Override


            }
        if (upperBound == null) {
            return true;
                return false;

    public boolean equals(Object other) {
        result *= upperBoundInclusive ? 2 : 3;
        if (getLowerBound() != null) {

        this.lowerBoundInclusive = lowerBoundInclusive;
 */
            }
            if (!lowerBound.equals(restriction.lowerBound)) {
        return lowerBound;
        }

 * to you under the Apache License, Version 2.0 (the
        if (this == other) {

        return buf.toString();
            return false;
        } else {
                return false;
            }
 * Describes a restriction in versioning.
 *
