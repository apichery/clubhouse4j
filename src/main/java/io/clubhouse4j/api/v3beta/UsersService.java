package io.clubhouse4j.api.v3beta;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

public class UsersService extends ClubhouseService {

    private static final String MEMBERS = "members";

    public UsersService(ClubhouseClient client) {
        super(client);
    }

    public List<Member> listMembers() {
        String url = client.buildUrl(MEMBERS);
        return newArrayList(executeGet(url, Member[].class));
    }
}
