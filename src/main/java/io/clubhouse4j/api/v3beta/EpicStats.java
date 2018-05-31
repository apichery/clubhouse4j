package io.clubhouse4j.api.v3beta;

import java.time.Instant;

public class EpicStats {
    /**
     * The date of the last update of a Story in this Epic.
     */
    public Instant last_story_update;

    /**
     * The total number of points in this Epic.
     */
    public Long num_points;

    /**
     * The total number of completed points in this Epic.
     */
    public Long num_points_started;

    /**
     * The total number of started points in this Epic.
     */
    public Long num_points_unstarted;

    /**
     * The total number of unstarted points in this Epic.
     */
    public Long num_stories_done;

    /**
     * The total number of done Stories in this Epic.
     */
    public Long num_stories_started;

    /**
     * The total number of started Stories in this Epic.
     */
    public Long num_stories_unestimated;

    /**
     * The total number of Stories with no point estimate.
     */
    public Long num_stories_unstarted;

    /**
     * The total number of unstarted Stories in this Epic.
     */
    public Long num_points_done;

    @Override
    public String toString() {
        return GsonHelper.GSON.toJson(this);
    }
}
