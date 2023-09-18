package com.example.enumstatemachina.service;

public enum StatusEnum {
    RED() {
        @Override
        public StatusEnum getNextStatus() {
            return GREEN;
        }
    },

    YELLOW {
        @Override
        public StatusEnum getNextStatus() {
            return GREEN;
        }
    },
    GREEN {
        @Override
        public StatusEnum getNextStatus() {
            return RED;
        }
    };

    public abstract StatusEnum getNextStatus();

}
