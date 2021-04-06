package com.wutsi.channel.event

data class ChannelSecretRevokedEventPayload(
  val userId: Long = -1,
  val siteId: Long = 0,
  val type: String = ""
)
