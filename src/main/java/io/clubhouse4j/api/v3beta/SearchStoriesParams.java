package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class SearchStoriesParams {
    /**
     * A true/false boolean indicating whether the Story is in archived state.
     */
    public Boolean archived;

    /**
     * Stories should have been completed before this date.
     */
    public Instant completed_at_end;

    /**
     * Stories should have been competed after this date.
     */
    public Instant completed_at_start;

    /**
     * Stories should have been created before this date.
     */
    public Instant created_at_end;

    /**
     * Stories should have been created after this date.
     */
    public Instant created_at_start;

    /**
     * Stories should have a deadline before this date.
     */
    public Instant deadline_end;

    /**
     * Stories should have a deadline after this date.
     */
    public Instant deadline_start;

    /**
     * The Epic IDs that may be associated with the Stories.
     */
    public Long epic_id;

    /**
     * The Epic IDs that may be associated with the Stories.
     */
    public List<Long> epic_ids;

    /**
     * The number of estimate points associate with the Stories.
     */
    public Long estimate;

    /**
     * An ID or URL that references an external resource. Useful during imports.
     */
    public String external_id;

    /**
     * The Label IDs that may be associated with the Stories.
     */
    public List<Long> label_ids;

    /**
     * The name of any associated Labels.
     */
    public String label_name;

    /**
     * An array of UUIDs for any Users who may be Owners of the Stories.
     */
    public UUID owner_id;

    /**
     * An array of UUIDs for any Users who may be Owners of the Stories.
     */
    public List<UUID> owner_ids;

    /**
     * The IDs for the Projects the Stories may be assigned to.
     */
    public Long project_id;

    /**
     * The IDs for the Projects the Stories may be assigned to.
     */
    public List<Long> project_ids;

    /**
     * The UUID of any Users who may have requested the Stories.
     */
    public UUID requested_by_id;

    /**
     * The type of Stories that you want returned.
     */
    public String story_type;

    /**
     * Stories should have been updated before this date.
     */
    public Instant updated_at_end;

    /**
     * Stories should have been updated after this date.
     */
    public Instant updated_at_start;

    /**
     * The unique IDs of the specific Workflow States that the Stories should be in.
     */
    public Long workflow_state_id;

    /**
     * The type of Workflow State the Stories may be in.
     */
    public List<String> workflow_state_types;
}
