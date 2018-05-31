package io.clubhouse4j.api.v3beta;

import java.util.List;

public class DeleteMultipleStoriesParams {
    /**
     * Required. An array of IDs of Stories to delete.
     */
    public List<Long> story_ids;

    public DeleteMultipleStoriesParams() {
    }

    public DeleteMultipleStoriesParams(List<Long> storyIds) {
        this.story_ids = storyIds;
    }
}
