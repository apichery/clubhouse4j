package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class CreateTaskParams {
    /**
     * True/false boolean indicating whether the Task is completed. Defaults to false.
     */
    public Boolean complete;

    /**
     * Defaults to the time/date the Task is created but can be set to reflect another creation time/date.
     */
    public Instant created_at;

    /**
     * The Task description.
     */
    public String description;

    /**
     * This field can be set to another unique ID. In the case that the Task has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * An array of UUIDs for any members you want to add as Owners on this new Task.
     */
    public List<UUID> owner_ids;

    /**
     * Defaults to the time/date the Task is created in Clubhouse but can be set to reflect another time/date.
     */
    public Instant updated_at;
}
