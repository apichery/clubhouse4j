package io.clubhouse.api.v3beta;

import java.util.List;

import com.google.common.collect.Lists;

public class EpicsService extends ClubhouseService {

    private static final String EPICS = "epics";

    public EpicsService(ClubhouseClient client) {
        super(client);
    }

    public List<EpicSlim> listEpics() {
        String url = client.buildUrl(EPICS);
        return Lists.newArrayList(executeGet(url, EpicSlim[].class));
    }

    public Epic getEpic(long epicId) {
        String url = client.buildUrl(EPICS, epicId);
        return executeGet(url, Epic.class);
    }

    public Epic createEpic(CreateEpicParams params) {
        String url = client.buildUrl(EPICS);
        return executePost(url, params, Epic.class);
    }

    public Epic updateEpic(long epicId, UpdateEpicParams params) {
        String url = client.buildUrl(EPICS, epicId);
        return executePut(url, params, Epic.class);
    }

    public void deleteEpic(long epicId) {
        String url = client.buildUrl(EPICS, epicId);
        executeDelete(url);
    }
}
