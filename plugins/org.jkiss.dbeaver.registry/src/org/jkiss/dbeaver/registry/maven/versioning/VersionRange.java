    public VersionRange restrict(VersionRange restriction) {
 *

    public List<Restriction> getRestrictions() {
                    index = index1;
        } else {
                        } else if (comparison == 0) {
        return restrictions;

    public String toString() {

            for (Restriction r : restrictions) {
            // original recommended version
    public ArtifactVersion matchVersion(List<ArtifactVersion> versions) {
 *  http://www.apache.org/licenses/LICENSE-2.0
                        } else {
                    }
                    done = true;
 */
                    matched = version;
        hash = 31 * hash + (restrictions == null ? 0 : restrictions.hashCode());
        {
                        done = true;

            }
        List<Restriction> restrictions = new ArrayList<>(r1.size() + r2.size());
        equals &=

                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
        Restriction res2 = i2.next();
            }
     *                    range.
                    } else {
import java.util.Iterator;
import java.util.ArrayList;
        VersionRange other = (VersionRange) obj;
        }
 * under the License.
                version = new DefaultArtifactVersion(process);
     * version is used (provided it is non-<code>null</code>). If no recommended version can be
    }
            upperBound = restriction.getUpperBound();
            }
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    }
        String process = spec.substring(1, spec.length() - 1).trim();
     * this version range, provided that ranges falls within the intersected restrictions. If
     *                              <code>null</code>.
    /**
        } else if (restriction.recommendedVersion != null) {

     * <p>
     * specified version range.
    public boolean hasRestrictions() {
            return null;
                            lower = res1.getLowerBound();
            String lowerBound = process.substring(0, index).trim();
import java.util.Collections;
                        lower = res1.getLowerBound();
public class VersionRange {
    /**
                            lowerInclusive = res1.isLowerBoundInclusive() && res2.isLowerBoundInclusive();

    private static Restriction parseRestriction(String spec)
                        int comparison = res1.getLowerBound().compareTo(res2.getLowerBound());
                            done = true;
        return restriction;


                    } else if (lowerInclusive && upperInclusive) {
            if (lowerBound.equals(upperBound)) {
                    } else {
     * <li><code>(,1.0],[1.2,)</code> Versions up to 1.0 (included) and 1.2 or higher</li>
            ArtifactVersion upperVersion = null;
            if (restrictions.size() > 0) {
            } else {
                throw new InvalidVersionSpecificationException("Range cannot have identical boundaries: " + spec);
                if (restriction.getLowerBound() == null || restriction.getLowerBound().compareTo(upperBound) < 0) {
        }
                    // use this if we can, but prefer the original if possible
     * restrictions. Otherwise, the restrictions on the returned range will be empty.
            }

                }

            }
        }
            for (Iterator<Restriction> i = restrictions.iterator(); i.hasNext(); ) {
        while (process.startsWith("[") || process.startsWith("(")) {
     * <li><code>[1.0,2.0)</code> Versions 1.0 (included) to 2.0 (not included)</li>
                // valid - check if it is greater than the currently matched version
        if (index < 0) {
/*
                    if (res1.getUpperBound() == null) {
        return matched;
                    buf.append(',');
            restrictions = Collections.emptyList();
                        upper = res2.getUpperBound();
 *
            int index2 = process.indexOf("]");
                throw new InvalidVersionSpecificationException("Unbounded range: " + spec);
    private List<Restriction> intersection(List<Restriction> r1, List<Restriction> r2) {
 * with the License.  You may obtain a copy of the License at
                    } else if (res2.getUpperBound() == null) {
     *
                if (index1 >= 0) {
            version = restriction.recommendedVersion;
 */
                || res1.getLowerBound().compareTo(res2.getUpperBound()) <= 0) {
 * distributed with this work for additional information
        // TODO: could be more efficient by sorting the list and then moving along the restrictions in order?
        for (ArtifactVersion version : versions) {
            Restriction restriction = parseRestriction(process.substring(0, index + 1));
    }
     * <li><code>[1.5,)</code> Versions 1.5 and higher</li>
            if (upperBound.length() > 0) {
                        lowerInclusive = res1.isLowerBoundInclusive();
    public int hashCode() {
     * @param spec string representation of a version or version range
        }
     * The recommended version of the returned version range will be the recommended version of
            if (restriction.containsVersion(version)) {
        }
        return new VersionRange(version, restrictions);
            }
            } else {
    }
                        int comparison = res1.getUpperBound().compareTo(res2.getUpperBound());
                        // advance res1
        } else {
            if (res1.getLowerBound() == null || res2.getUpperBound() == null
            if (index < 0) {
                            upperInclusive = res2.isUpperBoundInclusive();
     * </p>
        ArtifactVersion lowerBound = null;
        while (!done) {
                    if (lower == null || upper == null || lower.compareTo(upper) != 0) {
     */
                    }
            if (lowerBound == null) {
            }
                copiedRestrictions.addAll(restrictions);
            copiedRestrictions = new ArrayList<>();
            int index1 = process.indexOf(")");
        } else {
        this.recommendedVersion = recommendedVersion;
            if (upperBound != null) {
        List<Restriction> r1 = this.restrictions;
                        }
                        } else {
            return true;


 *
     * <li><code>[1.0,2.0]</code> Versions 1.0 to 2.0 (both included)</li>
     * @return the <code>VersionRange</code> that is a restriction of this version range and the
                            upperInclusive = res1.isUpperBoundInclusive() && res2.isUpperBoundInclusive();
        Restriction restriction;
                    }
     * The restrictions of the returned version range will be an intersection of the restrictions
     * recommended version from the specified version range.
        if (restrictions != null) {
package org.jkiss.dbeaver.registry.maven.versioning;
     * </p>
                throw new InvalidVersionSpecificationException(
            }
            if (index2 < 0 || index1 < index2) {



                    boolean lowerInclusive;
        List<Restriction> restrictions = new ArrayList<>();
            restriction = new Restriction(version, lowerBoundInclusive, version, upperBoundInclusive);

        if (process.length() > 0) {
        boolean upperBoundInclusive = spec.endsWith("]");
                            upperInclusive = res1.isUpperBoundInclusive();
                        lower = res2.getLowerBound();
        }
    private final ArtifactVersion recommendedVersion;

                if (i.hasNext()) {
     * @return a new {@link VersionRange} object that represents the spec
                }
        }
                if (recommendedVersion != null && r.containsVersion(recommendedVersion)) {
 * Licensed to the Apache Software Foundation (ASF) under one
                        upperInclusive = res1.isUpperBoundInclusive();
                    // don't add if they are equal and one is not inclusive
                        } else {
            ArtifactVersion lowerVersion = null;
    }
        if (this == obj) {
    public static VersionRange createFromVersionSpec(String spec)
    }

    }

                    && r.containsVersion(restriction.getRecommendedVersion())) {

                    if (res1.getLowerBound() == null) {
                         List<Restriction> restrictions) {
 * Construct a version range from a specification.
     * <ul>
 * or more contributor license agreements.  See the NOTICE file

                        if (comparison < 0) {

     * Note: Precedence is given to the recommended version from this version range over the
            // Use the original recommended version since it exists
            restriction = new Restriction(lowerVersion, lowerBoundInclusive, upperVersion, upperBoundInclusive);
                    if (upper == res2.getUpperBound()) {
        for (Restriction restriction : restrictions) {
            return false;
                        upperInclusive = res2.isUpperBoundInclusive();
                        restrictions.add(new Restriction(lower, lowerInclusive, upper, upperInclusive));
                } else {
import java.util.List;
        return equals;
            }
                    }
                        if (i2.hasNext()) {
        return new VersionRange(version, restrictions);
        return new VersionRange(new DefaultArtifactVersion(version), restrictions);
    }
/**
        Iterator<Restriction> i2 = r2.iterator();


        boolean equals =
        throws InvalidVersionSpecificationException {
            version = recommendedVersion;
        List<Restriction> restrictions = Collections.emptyList();
     * @param restriction the <code>VersionRange</code> that will be used to restrict this version
        return false;
                throw new InvalidVersionSpecificationException("Range defies version ordering: " + spec);
                        if (i1.hasNext()) {
                    //noinspection ObjectEquality

                restrictions.add(Restriction.EVERYTHING);
     * </p>
                    "Only fully-qualified sets allowed in multiple set scenario: " + spec);
            }
                || ((restrictions != null) && restrictions.equals(other.restrictions));

            if (!restrictions.isEmpty()) {
                            lowerInclusive = res2.isLowerBoundInclusive();

                        upper = res1.getUpperBound();

     * version range and the specified version range.

                if (matched == null || version.compareTo(matched) > 0) {
     * Some spec examples are
 * specific language governing permissions and limitations
                upperVersion = new DefaultArtifactVersion(upperBound);
                lowerVersion = new DefaultArtifactVersion(lowerBound);
                        res1 = i1.next();
            return recommendedVersion.toString();
        this.restrictions = restrictions;
            // Use the recommended version from the specified VersionRange since there is no
                            lower = res2.getLowerBound();

                if (i2.hasNext()) {
                    throw new InvalidVersionSpecificationException("Ranges overlap: " + spec);
            }
        if (r1.isEmpty() || r2.isEmpty()) {
            return buf.toString();
*/
            ArtifactVersion version = new DefaultArtifactVersion(process);
                throw new InvalidVersionSpecificationException("Single version must be surrounded by []: " + spec);
                        if (comparison < 0) {
            throw new OverConstrainedVersionException( "Restricting incompatible version ranges" );
                    }
            }
                }
     * of this version range and the specified version range if both version ranges have


                    version = restriction.getRecommendedVersion();
            }
            }
    public VersionRange cloneOf() {
                            lower = res1.getLowerBound();
            }
        }
                    // if we find the original, use that
                            lowerInclusive = res1.isLowerBoundInclusive();
 * Unless required by applicable law or agreed to in writing,

                process = process.substring(1).trim();
        return restrictions;
        int hash = 7;
                    } else {


                }
    public ArtifactVersion getRecommendedVersion() {
    private final List<Restriction> restrictions;
     * <p>

            int index = index2;
        ArtifactVersion version = null;
                } else if (version == null && restriction.getRecommendedVersion() != null

                    version = recommendedVersion;
        else if (recommendedVersion != null) {
     * <li><code>1.0</code> Version 1.0</li>
                } else {
            }
        }
                        }
            StringBuilder buf = new StringBuilder();
        hash = 31 * hash + (recommendedVersion == null ? 0 : recommendedVersion.hashCode());
        }
        if (!(obj instanceof VersionRange)) {
            recommendedVersion == other.recommendedVersion

                    ArtifactVersion lower;

    public boolean containsVersion(ArtifactVersion version) {
        ArtifactVersion matched = null;
 * software distributed under the License is distributed on an
                        // advance res2
                }
                            res1 = i1.next();
        Iterator<Restriction> i1 = r1.iterator();
                buf.append(r.toString());
     * Creates and returns a new <code>VersionRange</code> that is a restriction of this
        boolean done = false;
     * </ul>
            }
                lowerBound = restriction.getLowerBound();
    private VersionRange(ArtifactVersion recommendedVersion,
            if (lowerBound.length() > 0) {
        List<Restriction> r2 = restriction.restrictions;
                    // move on to next in r1
     * obtained, the returned version range's recommended version is set to <code>null</code>.
        String process = spec;
    }
     * @throws NullPointerException if the specified <code>VersionRange</code> is
    }
     * the restrictions are empty, this version range's recommended version is used if it is not
                    ArtifactVersion upper;
                        lowerInclusive = res2.isLowerBoundInclusive();
            restrictions = intersection(r1, r2);

            if (!lowerBoundInclusive || !upperBoundInclusive) {
        }
                || ((recommendedVersion != null) && recommendedVersion.equals(other.recommendedVersion));
                    boolean upperInclusive;
     * <p>
            if (containsVersion(version)) {
                            upper = res2.getUpperBound();
            restrictions.add(restriction);
                    break;
        List<Restriction> copiedRestrictions = null;
}

 * to you under the Apache License, Version 2.0 (the
/* TODO: should throw this immediately, but need artifact
                            done = true;
                return true;

                }
    public static VersionRange createFromVersion(String version) {
        }
                }
        }
     *
     */
                    } else if (res2.getLowerBound() == null) {
                    // overlaps
                            upper = res1.getUpperBound();
 * KIND, either express or implied.  See the License for the
     * @throws InvalidVersionSpecificationException
                            upper = res1.getUpperBound();
        // Either the original or the specified version ranges have no restrictions


                Restriction r = i.next();
        int index = process.indexOf(",");
    }
        return !restrictions.isEmpty() && recommendedVersion == null;
            restrictions == other.restrictions

                    if (i1.hasNext()) {

        List<Restriction> restrictions;
        }
        Restriction res1 = i1.next();
        }
        return new VersionRange(recommendedVersion, copiedRestrictions);
    }
    }
                    res2 = i2.next();

            process = process.substring(index + 1).trim();
                    } else {
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
            String upperBound = process.substring(index + 1).trim();
     * Create a version range from a string representation
            if (process.length() > 0 && process.startsWith(",")) {
                if (res1.getUpperBound() == null || res2.getLowerBound() == null

 * regarding copyright ownership.  The ASF licenses this file
                // move on to next in r2
    }
        ArtifactVersion upperBound = null;
                            res2 = i2.next();
     * <p/>
                        } else if (comparison == 0) {
        if (restrictions.size() > 0) {
                        }
        ArtifactVersion version = null;
        else
        throws InvalidVersionSpecificationException {

                        }
            if (upperVersion != null && lowerVersion != null && upperVersion.compareTo(lowerVersion) < 0) {
        boolean lowerBoundInclusive = spec.startsWith("[");
    public boolean equals(Object obj) {
                    || res1.getUpperBound().compareTo(res2.getLowerBound()) >= 0) {
        return hash;


     * <code>null</code>. If it is <code>null</code>, the specified version range's recommended
                        } else {
        if (spec == null) {
 * "License"); you may not use this file except in compliance
    }
        if (recommendedVersion != null) {


        return recommendedVersion;
