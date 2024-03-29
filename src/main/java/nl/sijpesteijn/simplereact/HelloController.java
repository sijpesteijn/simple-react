package nl.sijpesteijn.simplereact;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/react/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<Mono<String>> sayHello() {
        return ResponseEntity.ok(Mono.just("Hello World"));
    }
}
