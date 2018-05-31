package io.clubhouse.api.v3beta;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Project {
    /**
     * The Project abbreviation used in Story summaries. Should be kept to 3 characters at most.
     */
    public String abbreviation;

    /**
     * True/false boolean indicating whether the Project is in an Archived state.
     */
    public Boolean archived;

    /**
     * The color associated with the Project in the Clubhouse member interface.
     */
    public String color;

    /**
     * The time/date that the Project was created.
     */
    public Instant created_at;

    /**
     * The number of days before the thermometer appears in the Story summary.
     */
    public Long days_to_thermometer;

    /**
     * The description of the Project.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * This field can be set to another unique ID. In the case that the Project has been imported from another tool, the ID in the other tool can be indicated here.
     */
    public String external_id;

    /**
     * An array of UUIDs for any Members listed as Followers.
     */
    public List<UUID> follower_ids;

    /**
     * The unique ID of the Project.
     */
    public Long id;

    /**
     * The number of weeks per iteration in this Project.
     */
    public Long iteration_length;

    /**
     * The name of the Project
     */
    public String name;

    /**
     * Configuration to enable or disable thermometers in the Story summary.
     */
    public Boolean show_thermometer;

    /**
     * The date at which the Project was started.
     */
    public Instant start_time;

    /**
     * A group of calculated values for this Project.
     */
    public ProjectStats stats;

    /**
     * The ID of the team the project belongs to.
     */
    public Long team_id;

    /**
     * The time/date that the Project was last updated.
     */
    public Instant updated_at;
}
