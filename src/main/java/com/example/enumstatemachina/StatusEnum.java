    package com.example.enumstatemachina;

    public enum StatusEnum {
        RED
                {
                    @Override
                    public StatusEnum nextStatus(){
                        return YELLOW;
                    }
                },
        YELLOW
                {
                    @Override
                    public StatusEnum nextStatus(){
                        return GREEN;
                    }
                },
        GREEN
        {
            @Override
            public StatusEnum nextStatus(){
            return RED;
        }
        };

        public abstract StatusEnum nextStatus();

    }
