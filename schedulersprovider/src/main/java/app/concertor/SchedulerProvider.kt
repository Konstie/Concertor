package app.concertor

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun mainThread(): Scheduler

    fun io(): Scheduler

    fun computation(): Scheduler

    fun newThread(): Scheduler

    fun trampoline(): Scheduler
}