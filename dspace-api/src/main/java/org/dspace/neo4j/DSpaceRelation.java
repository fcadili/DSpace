/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.neo4j;

import java.util.List;
import java.util.Map;

/**
 * Class representing the relation object of neo4j
 * 
 * @author a.meriggi
 *
 */
public class DSpaceRelation {
    private String type;
    private Map<String, List<String>> metadata;
    private DSpaceNode target;

    public DSpaceRelation() {
    }

    public DSpaceRelation(Map<String, List<String>> metadata) {
        this.metadata = metadata;
    }

    public DSpaceRelation(String type, DSpaceNode target, Map<String, List<String>> metadata) {
        this.type = type;
        this.target = target;
        this.metadata = metadata;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, List<String>> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, List<String>> metadata) {
        this.metadata = metadata;
    }

    public DSpaceNode getTarget() {
        return target;
    }

    public void setTarget(DSpaceNode target) {
        this.target = target;
    }
}