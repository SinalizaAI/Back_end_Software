package com.sinalizaai.controller;

import com.sinalizaai.model.UsuarioAdm;
import com.sinalizaai.repository.UsuarioAdmRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final UsuarioAdmRepository usuarioAdmRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public AuthController(UsuarioAdmRepository usuarioAdmRepository) {
        this.usuarioAdmRepository = usuarioAdmRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> body) {
        String email = body.get("email");
        String senha = body.get("senha");

        Optional<UsuarioAdm> usuario = usuarioAdmRepository.findByEmail(email);

        if (usuario.isEmpty()) {
            return ResponseEntity.status(401).body("Usuário não encontrado.");
        }

        boolean senhaCorreta = passwordEncoder.matches(senha, usuario.get().getSenhaHash());

        if (!senhaCorreta) {
            return ResponseEntity.status(401).body("Senha incorreta.");
        }

        return ResponseEntity.ok("Login realizado com sucesso.");
    }
}