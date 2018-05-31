package io.clubhouse4j.api.v3beta;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

public class MilestonesService extends ClubhouseService {

    private static final String MILESTONES = "milestones";

    public MilestonesService(ClubhouseClient client) {
        super(client);
    }

    /**
     * List Milestones returns a list of all Milestones and their attributes.
     */
    public List<Milestone> listMilestones() throws IOException {
        String url = client.buildUrl(MILESTONES);
        return Lists.newArrayList(executeGet(url, Milestone[].class));
    }

    public Milestone getMilestone(long milestoneId) throws IOException {
        String url = client.buildUrl(MILESTONES, milestoneId);
        return executeGet(url, Milestone.class);
    }

    /**
     * Create Milestone allows you to create a new Milestone in Clubhouse.
     */
    public Milestone createMilestone(CreateMilestoneParams params) throws IOException {
        String url = client.buildUrl(MILESTONES);
        return executePost(url, params, Milestone.class);
    }

    public Milestone updateMilestone(long milestoneId, UpdateMilestoneParams params) throws IOException {
        String url = client.buildUrl(MILESTONES, milestoneId);
        return executePut(url, params, Milestone.class);
    }

    public void deleteMilestone(long milestoneId) throws IOException {
        String url = client.buildUrl(MILESTONES, milestoneId);
        executeDelete(url);
    }
}
