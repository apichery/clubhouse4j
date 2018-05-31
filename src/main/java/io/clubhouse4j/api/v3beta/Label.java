package io.clubhouse4j.api.v3beta;

import java.time.Instant;

/**
 * A Label can be used to associate and filter Stories and Epics, and also create new Workspaces.
 */
public class Label {
    /**
     * A true/false boolean indicating if the Label has been archived.
     */
    public Boolean archived;

    /**
     * The hex color to be displayed with the Label (for example, “#ff0000”).
     */
    public String color;

    /**
     * The time/date that the Label was created.
     */
    public Instant created_at;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This field can be set to another unique ID. In the case that the Label has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * The unique ID of the Label.
     */
    public Long id;

    /**
     * The name of the Label.
     */
    public String name;

    /**
     * A group of calculated values for this Label.
     */
    public LabelStats stats;

    /**
     * The time/date that the Label was updated.
     */
    public Instant updated_at;
}
