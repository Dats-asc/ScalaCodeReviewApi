package net.wiringbits.core

import net.wiringbits.repositories.*
import play.api.db.Database

case class RepositoryComponents(
    database: Database,
    users: UsersRepository,
    userTokens: UserTokensRepository,
    userLogs: UserLogsRepository,
    backgroundJobs: BackgroundJobsRepository
)
