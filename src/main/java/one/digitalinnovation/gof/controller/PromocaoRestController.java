package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import one.digitalinnovation.gof.service.PromocaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import one.digitalinnovation.gof.model.Promocao;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
@RequestMapping("/promocoes")
public class PromocaoRestController {
    @Autowired
    private PromocaoService promocaoService;

    @PostMapping
    public ResponseEntity<String> criarPromocao(@RequestBody Promocao promocao){
        promocaoService.salvarPromocao(promocao);
        return ResponseEntity.ok("Promoçao enviada para o Telegram com sucesso.");
    }
}
