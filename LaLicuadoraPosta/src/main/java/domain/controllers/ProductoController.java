package domain.controllers;


import domain.DTO.ProductoDTO;
import domain.model.entities.producto.Producto;
import domain.repositories.RepoAreaTipoPersonalizable;
import domain.repositories.RepoProductoBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/producto")
public class ProductoController {
/*
    @Autowired
    RepoProductoBase repoProductoBase;

    // @Autowired
   // RepoAreaTipoPersonalizable repoAreaTipoPersonalizable;


    @Transactional
    @DeleteMapping("/producto/{id}")
    public @ResponseBody ResponseEntity<Object>delete(@PathVariable("id") Long id){
        Optional<Producto> productoOptional= repoProductoBase.findById(id);
        if(productoOptional.isPresent()){
            Producto producto = productoOptional.get();
            repoProductoBase.deleteById(id);
            return ResponseEntity.ok("Producto base borrado");
        }
        return new ResponseEntity<Object>("el producto base no existe", HttpStatus.NOT_FOUND);
    }
/*
    @Transactional
    @PostMapping("/producto")
    public @ResponseBody ResponseEntity<Object> crearProducto(@RequestBody ProductoDTO unProductoDTO){

    }
*/
/*
    @GetMapping("/producto")
    public List<Producto> productos(){
        List<Producto>productos = new ArrayList<>();
        return productos;
    }


 */
}

