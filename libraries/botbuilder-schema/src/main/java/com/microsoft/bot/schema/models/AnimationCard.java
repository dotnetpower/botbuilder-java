/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An animation card (Ex: gif or short video clip).
 */
public class AnimationCard {
    /**
     * Title of this card.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Subtitle of this card.
     */
    @JsonProperty(value = "subtitle")
    private String subtitle;

    /**
     * Text of this card.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Thumbnail placeholder.
     */
    @JsonProperty(value = "image")
    private ThumbnailUrl image;

    /**
     * Media URLs for this card.
     */
    @JsonProperty(value = "media")
    private List<MediaUrl> media;

    /**
     * Actions on this card.
     */
    @JsonProperty(value = "buttons")
    private List<CardAction> buttons;

    /**
     * This content may be shared with others (default:true).
     */
    @JsonProperty(value = "shareable")
    private Boolean shareable;

    /**
     * Should the client loop playback at end of content (default:true).
     */
    @JsonProperty(value = "autoloop")
    private Boolean autoloop;

    /**
     * Should the client automatically start playback of media in this card
     * (default:true).
     */
    @JsonProperty(value = "autostart")
    private Boolean autostart;

    /**
     * Aspect ratio of thumbnail/media placeholder, allowed values are "16:9"
     * and "4:3".
     */
    @JsonProperty(value = "aspect")
    private String aspect;

    /**
     * Supplementary parameter for this card.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Get the title value.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title value.
     *
     * @param title the title value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the subtitle value.
     *
     * @return the subtitle value
     */
    public String subtitle() {
        return this.subtitle;
    }

    /**
     * Set the subtitle value.
     *
     * @param subtitle the subtitle value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public ThumbnailUrl image() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withImage(ThumbnailUrl image) {
        this.image = image;
        return this;
    }

    /**
     * Get the media value.
     *
     * @return the media value
     */
    public List<MediaUrl> media() {
        return this.media;
    }

    /**
     * Set the media value.
     *
     * @param media the media value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withMedia(List<MediaUrl> media) {
        this.media = media;
        return this;
    }

    /**
     * Get the buttons value.
     *
     * @return the buttons value
     */
    public List<CardAction> buttons() {
        return this.buttons;
    }

    /**
     * Set the buttons value.
     *
     * @param buttons the buttons value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withButtons(List<CardAction> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Get the shareable value.
     *
     * @return the shareable value
     */
    public Boolean shareable() {
        return this.shareable;
    }

    /**
     * Set the shareable value.
     *
     * @param shareable the shareable value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * Get the autoloop value.
     *
     * @return the autoloop value
     */
    public Boolean autoloop() {
        return this.autoloop;
    }

    /**
     * Set the autoloop value.
     *
     * @param autoloop the autoloop value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withAutoloop(Boolean autoloop) {
        this.autoloop = autoloop;
        return this;
    }

    /**
     * Get the autostart value.
     *
     * @return the autostart value
     */
    public Boolean autostart() {
        return this.autostart;
    }

    /**
     * Set the autostart value.
     *
     * @param autostart the autostart value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withAutostart(Boolean autostart) {
        this.autostart = autostart;
        return this;
    }

    /**
     * Get the aspect value.
     *
     * @return the aspect value
     */
    public String aspect() {
        return this.aspect;
    }

    /**
     * Set the aspect value.
     *
     * @param aspect the aspect value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withAspect(String aspect) {
        this.aspect = aspect;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the AnimationCard object itself.
     */
    public AnimationCard withValue(Object value) {
        this.value = value;
        return this;
    }

}
