package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.denyMessagesFromCommunity method
 */
public class MessagesDenyMessagesFromCommunityQuery extends AbstractQueryBuilder<MessagesDenyMessagesFromCommunityQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public MessagesDenyMessagesFromCommunityQuery(VkApiClient client, Actor actor, int groupId) {
        super(client, "messages.denyMessagesFromCommunity", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Group ID.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesDenyMessagesFromCommunityQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesDenyMessagesFromCommunityQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
