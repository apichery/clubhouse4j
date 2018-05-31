package io.clubhouse.api.v3beta;

import java.util.UUID;

public class CreateLinkedFileParams {
    /**
     * The content type of the image (e.g. txt/plain).
     */
    public String content_type;

    /**
     * The description of the file.
     */
    public String description;

    /**
     * Required. The name of the file.
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
     * Required. The integration type of the file (box, dropbox, google, onedrive, url).
     */
    public String type;

    /**
     * The UUID of the member that uploaded the file.
     */
    public UUID uploader_id;

    /**
     * Required. The URL of linked file.
     */
    public String url;
}
