package com.twk.restservice;

import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotEmpty;
import org.springframework.security.access.annotation.Secured;

@RestController
@RequestMapping("/crud")
public class CRUDController {
    private CRUD crud = new CRUD();

    @Secured("ROLE_USER")
    @PostMapping("/create")
    public void create(@RequestParam @NotEmpty String key, @RequestParam @NotEmpty String value) {
        crud.create(key, value);
    }

    @Secured("ROLE_USER")
    @GetMapping("/read")
    public String read(@RequestParam @NotEmpty String key) {
        return crud.read(key);
    }

    @Secured("ROLE_USER")
    @PutMapping("/update")
    public void update(@RequestParam @NotEmpty String key, @RequestParam @NotEmpty String value) {
        crud.update(key, value);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/delete")
    public void delete(@RequestParam @NotEmpty String key) {
        crud.delete(key);
    }
}
