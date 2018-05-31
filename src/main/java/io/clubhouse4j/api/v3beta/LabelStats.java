package io.clubhouse4j.api.v3beta;

public class LabelStats {
    /**
     * The total number of Epics with this Label.
     */
    public Long num_epics;

    /**
     * The total number of completed points with this Label.
     */
    public Long num_points_completed;

    /**
     * The total number of in-progress points with this Label.
     */
    public Long num_points_in_progress;

    /**
     * The total number of points with this Label.
     */
    public Long num_points_total;

    /**
     * The total number of completed Stories with this Label.
     */
    public Long num_stories_completed;

    /**
     * The total number of in-progress Stories with this Label.
     */
    public Long num_stories_in_progress;

    /**
     * The total number of Stories with this Label.
     */
    public Long num_stories_total;

    /**
     * The total number of Stories with no point estimate with this Label.
     */
    public Long num_stories_unestimated;
}
