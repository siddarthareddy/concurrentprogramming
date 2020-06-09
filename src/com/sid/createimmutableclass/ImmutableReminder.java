package com.sid.createimmutableclass;

import java.util.Date;

public final class ImmutableReminder{
    private final Date remindingDate;

    public ImmutableReminder (Date remindingDate) {
        if(remindingDate.getTime() < System.currentTimeMillis()){
            throw new IllegalArgumentException("Can not set reminder" +
                    " for past time: " + remindingDate);
        }
        this.remindingDate = new Date(remindingDate.getTime());
    }

    public Date getRemindingDate() {
        return (Date) remindingDate.clone();//return clone to avoid mutating date using reference
    }
}