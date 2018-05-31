package io.clubhouse4j.api.v3beta;

import java.time.Instant;

public class EpicState {
    /**
     * The hex color for this Epic State.
     */
    public String color;

    /**
     * The time/date the Epic State was created.
     */
    public Instant created_at;

    /**
     * The description of what sort of Epics belong in that Epic State.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique ID of the Epic State.
     */
    public Long id;

    /**
     * The Epic State’s name.
     */
    public String name;

    /**
     * The position that the Epic State is in, starting with 0 at the left.
     */
    public Long position;

    /**
     * The type of Epic State (Unstarted, Started, or Done)
     */
    public String type;

    /**
     * When the Epic State was last updated.
     */
    public Instant updated_at;
}
