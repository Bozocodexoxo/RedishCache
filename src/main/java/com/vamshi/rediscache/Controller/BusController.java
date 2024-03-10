package com.vamshi.rediscache.Controller;

import com.vamshi.rediscache.Repo.Busimplementation;
import com.vamshi.rediscache.model.Bustand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;

@RestController
public class BusController {
    @RestController
    public class BustandController {

        @Autowired
        Busimplementation busimplementation;

        @CachePut(value = "Bustand", key = "#bustand.busid")
        @PostMapping("/bustand")
        public Bustand SaveData(@RequestBody Bustand bustand) {
            return busimplementation.save(bustand);
        }

        @Cacheable(value = "Bustand", key = "#bustand.busid != null ? #bustand.busid : 'default'")
        @GetMapping("/allstands")
        public List<Bustand> GetAllData() {
            return busimplementation.mytotal();
        }

        @DeleteMapping("/bustand/{id}")
        public void DeleteData(@PathVariable("id") int id) {
            busimplementation.delete(id);
        }
    }}

