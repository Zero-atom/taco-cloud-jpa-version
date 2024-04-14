package tacos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tacos.Taco;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class TacoController {

//    private final TacoService tacoService;
//
//    @GetMapping
//    public List<Taco> getTacos() {
//        return tacoService.getAll();
//    }
}