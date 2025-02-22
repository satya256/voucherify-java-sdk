package io.voucherify.client.model.rewards.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class RewardResponse {

    private String id;

    private String name;

    @JsonProperty("created_at")
    private Date createdAt;

    private Map<String, Object> parameters;

    private String object;
}
