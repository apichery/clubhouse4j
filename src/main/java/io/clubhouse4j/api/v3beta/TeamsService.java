package io.clubhouse4j.api.v3beta;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

public class TeamsService extends ClubhouseService {

    private static final String TEAMS = "teams";

    public TeamsService(ClubhouseClient client) {
        super(client);
    }

    /**
     * Get Team is used to get Team information.
     */
    public Team getTeam(long teamId) throws IOException {
        String url = client.buildUrl(TEAMS, teamId);
        return executeGet(url, Team.class);
    }

    /**
     * List Teams returns a list of all Teams in the organization.
     */
    public List<Team> listTeams() throws IOException {
        String url = client.buildUrl(TEAMS);
        return Lists.newArrayList(executeGet(url, Team[].class));
    }
}
