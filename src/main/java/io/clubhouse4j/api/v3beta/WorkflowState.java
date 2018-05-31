package io.clubhouse.api.v3beta;

import java.time.Instant;

/**
 * Workflow State is any of the at least 3 columns. Workflow States correspond to one of 3 types: Unstarted, Started, or Done.
 */
public class WorkflowState {
    /**
     * The hex color for this Workflow State.
     */
    public String color;

    /**
     * The time/date the Workflow State was created.
     */
    public Instant created_at;

    /**
     * The description of what sort of Stories belong in that Workflow state.
     */
    public String description;

    /**
     * A string description of this resource.
     */
    public String entity_type;

    /**
     * The unique ID of the Workflow State.
     */
    public Long id;

    /**
     * The Workflow State’s name.
     */
    public String name;

    /**
     * The number of Stories currently in that Workflow State.
     */
    public Long num_stories;

    /**
     * The position that the Workflow State is in, starting with 0 at the left.
     */
    public Long position;

    /**
     * The type of Workflow State ("unstarted", "started", or "done")
     */
    public String type;

    /**
     * When the Workflow State was last updated.
     */
    public Instant updated_at;

    /**
     * The verb that triggers a move to that Workflow State when making GitHub commits.
     */
    public String verb;
}
