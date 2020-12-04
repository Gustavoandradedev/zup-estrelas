package br.com.zup.cursospring.zupestrelas.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.zup.cursospring.zupestrelas.domain.Categoria;
import br.com.zup.cursospring.zupestrelas.repositories.CategoriaRepository;
import br.com.zup.cursospring.zupestrelas.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo; 
    
    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
    
}
