package io.clubhouse4j.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Task {
    /**
     * True/false boolean indicating whether the Task has been completed.
     */
    public Boolean complete;

    /**
     * The time/date the Task was completed.
     */
    public Instant completed_at;

    /**
     * The time/date the Task was created.
     */
    public Instant created_at;

    /**
     * Full text of the Task.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This field can be set to another unique ID. In the case that the Task has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * The unique ID of the Task.
     */
    public Long id;

    /**
     * An array of UUIDs of Members mentioned in this Task.
     */
    public List<UUID> mention_ids;

    /**
     * An array of UUIDs of the Owners of this Task.
     */
    public List<UUID> owner_ids;

    /**
     * The number corresponding to the Task’s position within a list of Tasks on a Story.
     */
    public Long position;

    /**
     * The unique identifier of the parent Story.
     */
    public Long story_id;

    /**
     * The time/date the Task was updated.
     */
    public Instant updated_at;
}
