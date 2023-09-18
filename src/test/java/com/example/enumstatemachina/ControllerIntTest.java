    package com.example.enumstatemachina;

    import com.example.enumstatemachina.controller.Controller;
    import com.example.enumstatemachina.service.StateMachine;
    import org.junit.jupiter.api.Test;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
    import org.springframework.boot.test.mock.mockito.MockBean;
    import org.springframework.test.web.servlet.MockMvc;

    import static org.mockito.Mockito.when;
    import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
    import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

    @WebMvcTest(Controller.class)
    public class ControllerIntTest {

        @Autowired
        MockMvc mockMvc;

        @MockBean
        StateMachine stateMachineMock;

        StateMachine stateMachine = new StateMachine();

        @Test
        public void getStatusTest() throws Exception {


            when(stateMachineMock.getStatus()).thenReturn(stateMachine.getStatus());

            mockMvc.perform(get("http://localhost:8080/api/v1/state-machina/getStatus"))
                    .andExpect(status().isOk())
                    .andExpect(content().string(stateMachine.getStatus().toString()));

        }
        @Test
        public void nextStatusTest() throws Exception {


            when(stateMachineMock.nextStatus()).thenReturn(stateMachine.nextStatus());

            mockMvc.perform(get("http://localhost:8080/api/v1/state-machina/nextStatus"))
                    .andExpect(status().isOk())
                    .andExpect(content().string(stateMachine.getStatus().toString()));

        }
    }
