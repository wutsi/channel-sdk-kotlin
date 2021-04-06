package com.wutsi.channel

import com.wutsi.channel.dto.GetChannelResponse
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface ChannelApi {
  @RequestLine("GET /v1/channels/{id}")
  public fun `get`(@Param("id") id: Long): GetChannelResponse
}
