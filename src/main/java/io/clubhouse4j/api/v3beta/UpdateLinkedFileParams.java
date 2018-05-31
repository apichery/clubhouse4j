package io.clubhouse4j.api.v3beta;

import java.util.UUID;

public class UpdateLinkedFileParams {
    /**
     * The description of the file.
     */
    public String description;

    /**
     * The name of the file.
     */
    public String name;

    /**
     * The filesize, if the integration provided it.
     */
    public Long size;

    /**
     * The ID of the linked story.
     */
    public Long story_id;

    /**
     * The URL of the thumbnail, if the integration provided it.
     */
    public String thumbnail_url;

    /**
     * The integration type of the file (box, dropbox, google, onedrive, url).
     */
    public String type;

    /**
     * The UUID of the member that uploaded the file.
     */
    public UUID uploader_id;

    /**
     * The URL of linked file.
     */
    public String url;
}
