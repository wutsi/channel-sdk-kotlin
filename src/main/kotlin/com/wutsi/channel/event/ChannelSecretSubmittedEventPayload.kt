package com.wutsi.channel.event

data class ChannelSecretSubmittedEventPayload(
  val userId: Long = -1,
  val siteId: Long = 0,
  val channelUserId: String = "",
  val accessToken: String = "",
  val accessTokenSecret: String = "",
  val type: String = ""
)
