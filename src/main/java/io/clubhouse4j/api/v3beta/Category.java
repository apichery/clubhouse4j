package io.clubhouse.api.v3beta;

import java.time.Instant;

/**
 * A Category can be used to associate Milestones.
 */
public class Category {
    /**
     * A true/false boolean indicating if the Category has been archived.
     */
    public Boolean archived;

    /**
     * The hex color to be displayed with the Category (for example, “#ff0000”).
     */
    public String color;

    /**
     * The time/date that the Category was created.
     */
    public Instant created_at;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This field can be set to another unique ID. In the case that the Category has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * The unique ID of the Category.
     */
    public Long id;

    /**
     * The name of the Category.
     */
    public String name;

    /**
     * The type of entity this Category is associated with; currently Milestone is the only type of Category.
     */
    public String type;

    /**
     * The time/date that the Category was updated.
     */
    public Instant updated_at;

}
