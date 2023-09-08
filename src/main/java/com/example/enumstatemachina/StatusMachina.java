package com.example.enumstatemachina;

import org.springframework.stereotype.Component;

@Component
public class StatusMachina {

    private StatusEnum status;

    public StatusMachina() {
        this.status = StatusEnum.RED;
    }

    public StatusEnum getStatus() {
        return this.status;
    }

    public StatusEnum nextStatus(){
        this.status = this.status.nextStatus();
        return this.status;
    }
}
