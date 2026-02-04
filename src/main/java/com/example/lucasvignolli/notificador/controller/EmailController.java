package com.example.lucasvignolli.notificador.controller;


import com.example.lucasvignolli.notificador.business.EmailService;
import com.example.lucasvignolli.notificador.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/email")

public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviaEmail (@RequestBody TarefasDTO dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
