package io.clubhouse4j.api.v3beta;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.ImmutableList;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class StoriesService extends ClubhouseService {

    private static final String STORIES = "stories";
    private static final String SEARCH = "search";

    public StoriesService(ClubhouseClient client) {
        super(client);
    }

    public Story createStory(CreateStoryParams params) throws IOException {
        String url = client.buildUrl(STORIES);
        return executePost(url, params, Story.class);
    }

    public Story getStory(long storyId) throws IOException {
        String url = client.buildUrl(STORIES, storyId);
        return executeGet(url, Story.class);
    }

    public List<StorySlim> searchStories(SearchStoriesParams params) throws IOException {
        String url = client.buildUrl(STORIES, SEARCH);
        return ImmutableList.copyOf(executePost(url, params, StorySlim[].class));
    }

    public Story updateStory(long storyId, UpdateStoryParams params) throws IOException {
        String url = client.buildUrl(STORIES, storyId);
        return executePut(url, params, Story.class);
    }

    public void deleteStory(long storyId) throws IOException {
        String url = client.buildUrl(STORIES, storyId);
        executeDelete(url);
    }

    public List<StorySlim> updateMultipleStories(UpdateMultipleStoriesParams params) throws IOException {
        String url = client.buildUrl(STORIES, "bulk");
        return ImmutableList.copyOf(executePut(url, params, StorySlim[].class));
    }

    public void deleteMultipleStories(List<Long> storyIds) throws IOException {
        String url = client.buildUrl(STORIES, "bulk");
        DeleteMultipleStoriesParams params = new DeleteMultipleStoriesParams(storyIds);
        executeDelete(url, params);
    }
}
