    package com.example.enumstatemachina;

    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/v1/state-machina")
    public class Controller {

        private StatusMachina machina;

        public Controller(StatusMachina machina) {
            this.machina = machina;
        }

        @GetMapping("getStatus")
        public ResponseEntity getStatus(){

            ResponseEntity answer = new ResponseEntity<>(machina.getStatus().toString(),HttpStatus.OK);

            return answer;
        }

        @GetMapping("nextStatus")
        public ResponseEntity nextStatus(){

            ResponseEntity answer = new ResponseEntity<>(machina.nextStatus().toString(),HttpStatus.OK);

            return answer;
        }
    }
