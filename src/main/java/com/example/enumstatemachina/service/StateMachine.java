    package com.example.enumstatemachina.service;

    import org.springframework.stereotype.Component;

    @Component
    public class StateMachine {

        private StatusEnum status;

        public StateMachine() {
            this.status = StatusEnum.RED;
        }

        public StatusEnum getStatus() {
            return this.status;
        }

        public StatusEnum nextStatus(){
            this.status = this.status.getNextStatus();
            return this.status;
        }
    }
